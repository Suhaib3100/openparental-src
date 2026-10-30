import {
  BadRequestException,
  ForbiddenException,
  Inject,
  Injectable,
  NotFoundException,
  forwardRef,
} from '@nestjs/common';
import { ScreenSession } from '@prisma/client';
import { AuditService } from '../audit/audit.service';
import { CommandsService } from '../commands/commands.service';
import { DevicesService } from '../devices/devices.service';
import { PrismaService } from '../prisma/prisma.service';
import { ScreenGateway } from '../realtime/screen.gateway';

/** Max time waiting for the device to start sending frames. */
const STREAM_TTL_MS = 2 * 60 * 1000;

export type ScreenSessionView = ScreenSession & {
  status: 'pending' | 'live' | 'denied' | 'ended' | 'expired';
};

/**
 * Live mirror sessions are auto-armed on create (no per-request child approve).
 * Screen capture permission is granted once during child-app setup; parent tap
 * starts streaming immediately.
 */
@Injectable()
export class ScreenSessionsService {
  constructor(
    private readonly prisma: PrismaService,
    private readonly devices: DevicesService,
    private readonly commands: CommandsService,
    private readonly audit: AuditService,
    @Inject(forwardRef(() => ScreenGateway))
    private readonly gateway: ScreenGateway,
  ) {}

  async create(
    familyId: string,
    deviceId: string,
    actorUserId: string,
    mode: 'mirror' | 'screenshot' = 'mirror',
  ): Promise<ScreenSessionView> {
    await this.devices.getForFamily(familyId, deviceId);

    const session = await this.prisma.screenSession.create({
      data: {
        deviceId,
        transport: 'clip',
        // Setup-time grant covers capture; no per-request child consent gate.
        consented: true,
      },
    });

    // 'screenshot' => one accessibility-captured frame (no MediaProjection).
    // 'mirror'     => ~1 fps accessibility screenshot stream (no cast indicator).
    await this.commands.enqueue(familyId, deviceId, {
      type: mode === 'screenshot' ? 'SCREENSHOT' : 'SCREEN_VIEW_REQUEST',
      payload: { sessionId: session.id },
    });

    await this.audit.log({
      familyId,
      actor: actorUserId,
      action: 'screen_session_requested',
      data: { sessionId: session.id, deviceId },
    });

    this.gateway.emitSessionReady(session.id);
    return this.withStatus(session);
  }

  async getForFamily(
    familyId: string,
    sessionId: string,
  ): Promise<ScreenSessionView> {
    const session = await this.requireSession(sessionId);
    await this.devices.getForFamily(familyId, session.deviceId);
    return this.withStatus(await this.maybeExpire(session));
  }

  async consent(
    deviceId: string,
    sessionId: string,
    approved: boolean,
  ): Promise<ScreenSessionView> {
    let session = await this.requireOwnedSession(deviceId, sessionId);
    session = await this.maybeExpire(session);

    if (session.endedAt) {
      throw new BadRequestException('session already ended');
    }
    if (this.pastStreamTtl(session) && !session.endedAt) {
      throw new BadRequestException('session expired');
    }
    if (session.consented && approved) {
      return this.withStatus(session);
    }

    if (!approved) {
      const denied = await this.prisma.screenSession.update({
        where: { id: sessionId },
        data: { endedAt: new Date(), consented: false },
      });
      await this.audit.log({
        familyId: await this.familyIdForDevice(deviceId),
        actor: deviceId,
        action: 'screen_session_denied',
        data: { sessionId },
      });
      this.gateway.emitSessionDenied(sessionId);
      return this.withStatus(denied);
    }

    const live = await this.prisma.screenSession.update({
      where: { id: sessionId },
      data: { consented: true },
    });
    await this.audit.log({
      familyId: await this.familyIdForDevice(deviceId),
      actor: deviceId,
      action: 'screen_session_consented',
      data: { sessionId },
    });
    this.gateway.emitSessionReady(sessionId);
    return this.withStatus(live);
  }

  async endAsParent(
    familyId: string,
    sessionId: string,
    actorUserId: string,
  ): Promise<ScreenSessionView> {
    const session = await this.requireSession(sessionId);
    await this.devices.getForFamily(familyId, session.deviceId);
    return this.end(session, actorUserId, familyId);
  }

  async endAsDevice(
    deviceId: string,
    sessionId: string,
  ): Promise<ScreenSessionView> {
    const session = await this.requireOwnedSession(deviceId, sessionId);
    const familyId = await this.familyIdForDevice(deviceId);
    return this.end(session, deviceId, familyId);
  }

  async assertJoinable(
    sessionId: string,
    opts: { familyId?: string; deviceId?: string },
  ): Promise<ScreenSessionView> {
    let session = await this.requireSession(sessionId);
    session = await this.maybeExpire(session);

    if (opts.deviceId && session.deviceId !== opts.deviceId) {
      throw new ForbiddenException('not your session');
    }
    if (opts.familyId) {
      await this.devices.getForFamily(opts.familyId, session.deviceId);
    }
    return this.withStatus(session);
  }

  async assertCanEmitFrame(
    sessionId: string,
    deviceId: string,
  ): Promise<ScreenSession> {
    let session = await this.requireOwnedSession(deviceId, sessionId);
    session = await this.maybeExpire(session);
    if (!session.consented || session.endedAt) {
      throw new ForbiddenException('session not live');
    }
    return session;
  }

  /** Device uploads a JPEG frame (works on serverless — no Socket.IO required). */
  async uploadFrame(
    deviceId: string,
    sessionId: string,
    data: string,
  ): Promise<{ ok: true }> {
    await this.assertCanEmitFrame(sessionId, deviceId);
    const now = new Date();
    await this.prisma.screenSession.update({
      where: { id: sessionId },
      data: { lastFrameData: data, lastFrameAt: now },
    });
    this.gateway.emitFrame(sessionId, data, now.getTime());
    return { ok: true };
  }

  async latestFrame(
    familyId: string,
    sessionId: string,
  ): Promise<{ data: string | null; ts: number | null; status: string }> {
    const view = await this.getForFamily(familyId, sessionId);
    const session = await this.requireSession(sessionId);
    return {
      data: session.lastFrameData,
      ts: session.lastFrameAt?.getTime() ?? null,
      status: view.status,
    };
  }

  private async end(
    session: ScreenSession,
    actor: string,
    familyId: string,
  ): Promise<ScreenSessionView> {
    if (session.endedAt) {
      return this.withStatus(session);
    }
    const ended = await this.prisma.screenSession.update({
      where: { id: session.id },
      data: { endedAt: new Date() },
    });
    await this.audit.log({
      familyId,
      actor,
      action: 'screen_session_ended',
      data: { sessionId: session.id },
    });
    this.gateway.emitSessionEnded(session.id);
    return this.withStatus(ended);
  }

  private async requireSession(sessionId: string): Promise<ScreenSession> {
    const session = await this.prisma.screenSession.findUnique({
      where: { id: sessionId },
    });
    if (!session) throw new NotFoundException('session not found');
    return session;
  }

  private async requireOwnedSession(
    deviceId: string,
    sessionId: string,
  ): Promise<ScreenSession> {
    const session = await this.requireSession(sessionId);
    if (session.deviceId !== deviceId) {
      throw new ForbiddenException('not your session');
    }
    return session;
  }

  private async maybeExpire(session: ScreenSession): Promise<ScreenSession> {
    if (session.endedAt) return session;
    // Armed/live sessions are ended explicitly by parent or device.
    if (session.consented) return session;
    if (!this.pastStreamTtl(session)) return session;
    return this.prisma.screenSession.update({
      where: { id: session.id },
      data: { endedAt: new Date() },
    });
  }

  private pastStreamTtl(session: ScreenSession): boolean {
    return Date.now() - session.startedAt.getTime() > STREAM_TTL_MS;
  }

  private withStatus(session: ScreenSession): ScreenSessionView {
    let status: ScreenSessionView['status'];
    if (session.endedAt) {
      if (session.consented) {
        status = 'ended';
      } else {
        status = 'denied';
      }
    } else if (session.consented) {
      status = 'live';
    } else if (this.pastStreamTtl(session)) {
      status = 'expired';
    } else {
      status = 'pending';
    }
    return { ...session, status };
  }

  private async familyIdForDevice(deviceId: string): Promise<string> {
    const device = await this.prisma.device.findUnique({
      where: { id: deviceId },
      select: { familyId: true },
    });
    if (!device) throw new NotFoundException('device not found');
    return device.familyId;
  }
}
