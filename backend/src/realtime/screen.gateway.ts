import {
  ForbiddenException,
  Inject,
  Logger,
  UnauthorizedException,
  forwardRef,
} from '@nestjs/common';
import {
  ConnectedSocket,
  MessageBody,
  OnGatewayConnection,
  SubscribeMessage,
  WebSocketGateway,
  WebSocketServer,
} from '@nestjs/websockets';
import { Server, Socket } from 'socket.io';
import { TokenService } from '../auth/token.service';
import { ScreenSessionsService } from '../screen-sessions/screen-sessions.service';

const MAX_FRAME_CHARS = 400_000; // ~300KB base64 JPEG
const MIN_FRAME_INTERVAL_MS = 200; // ~5 fps cap

type SocketActor =
  | { kind: 'parent'; userId: string; familyId: string }
  | { kind: 'device'; deviceId: string; familyId: string };

@WebSocketGateway({
  namespace: '/screen',
  cors: { origin: '*' },
})
export class ScreenGateway implements OnGatewayConnection {
  private readonly log = new Logger(ScreenGateway.name);
  private readonly lastFrameAt = new Map<string, number>();

  @WebSocketServer()
  server!: Server;

  constructor(
    private readonly tokens: TokenService,
    @Inject(forwardRef(() => ScreenSessionsService))
    private readonly sessions: ScreenSessionsService,
  ) {}

  async handleConnection(client: Socket): Promise<void> {
    try {
      const token = this.extractToken(client);
      if (!token) throw new UnauthorizedException('missing token');
      const payload = await this.tokens.verify(token);
      if (payload.typ === 'access') {
        client.data.actor = {
          kind: 'parent',
          userId: payload.sub,
          familyId: payload.fid,
        } satisfies SocketActor;
      } else if (payload.typ === 'device') {
        client.data.actor = {
          kind: 'device',
          deviceId: payload.sub,
          familyId: payload.fid,
        } satisfies SocketActor;
      } else {
        throw new UnauthorizedException('wrong token type');
      }
    } catch (err) {
      this.log.warn(`ws auth failed: ${(err as Error).message}`);
      client.disconnect(true);
    }
  }

  @SubscribeMessage('join')
  async onJoin(
    @ConnectedSocket() client: Socket,
    @MessageBody() body: { sessionId?: string },
  ) {
    const actor = client.data.actor as SocketActor | undefined;
    if (!actor) throw new UnauthorizedException('unauthenticated');
    const sessionId = body?.sessionId;
    if (!sessionId) throw new ForbiddenException('sessionId required');

    const view = await this.sessions.assertJoinable(sessionId, {
      familyId: actor.kind === 'parent' ? actor.familyId : undefined,
      deviceId: actor.kind === 'device' ? actor.deviceId : undefined,
    });

    await client.join(this.room(sessionId));
    return { ok: true, status: view.status, sessionId };
  }

  @SubscribeMessage('frame')
  async onFrame(
    @ConnectedSocket() client: Socket,
    @MessageBody() body: { sessionId?: string; data?: string },
  ) {
    const actor = client.data.actor as SocketActor | undefined;
    if (!actor || actor.kind !== 'device') {
      throw new ForbiddenException('devices only');
    }
    const sessionId = body?.sessionId;
    const data = body?.data;
    if (!sessionId || typeof data !== 'string') {
      throw new ForbiddenException('invalid frame');
    }
    if (data.length > MAX_FRAME_CHARS) {
      throw new ForbiddenException('frame too large');
    }

    const now = Date.now();
    const last = this.lastFrameAt.get(sessionId) ?? 0;
    if (now - last < MIN_FRAME_INTERVAL_MS) {
      return { ok: false, reason: 'rate_limited' };
    }

    await this.sessions.assertCanEmitFrame(sessionId, actor.deviceId);
    this.lastFrameAt.set(sessionId, now);
    client.to(this.room(sessionId)).emit('frame', { sessionId, data, ts: now });
    return { ok: true };
  }

  emitSessionReady(sessionId: string): void {
    this.server?.to(this.room(sessionId)).emit('session_ready', { sessionId });
  }

  emitSessionEnded(sessionId: string): void {
    this.server?.to(this.room(sessionId)).emit('session_ended', { sessionId });
    this.lastFrameAt.delete(sessionId);
  }

  emitSessionDenied(sessionId: string): void {
    this.server?.to(this.room(sessionId)).emit('session_denied', { sessionId });
    this.lastFrameAt.delete(sessionId);
  }

  /** Relay frame to parent viewers (also stored in DB for HTTP polling). */
  emitFrame(sessionId: string, data: string, ts: number): void {
    this.server
      ?.to(this.room(sessionId))
      .emit('frame', { sessionId, data, ts });
  }

  private room(sessionId: string): string {
    return `screen:${sessionId}`;
  }

  private extractToken(client: Socket): string | null {
    const auth = client.handshake.auth as { token?: string } | undefined;
    if (auth?.token) return auth.token;
    const header = client.handshake.headers.authorization;
    if (typeof header === 'string' && header.startsWith('Bearer ')) {
      return header.slice(7);
    }
    const q = client.handshake.query.token;
    if (typeof q === 'string') return q;
    return null;
  }
}
