import bcrypt from 'bcryptjs';
import { dbConfigured, getSql } from './db';
import { pairingCode, randomToken, safeEqual, sha256 } from './hash';
import {
  apiError,
  bearerToken,
  json,
  noContent,
  readJson,
} from './http';
import {
  signAccess,
  signDevice,
  signRefresh,
  verifyToken,
} from './jwt';

const BCRYPT_ROUNDS = 10;
const PAIRING_TTL_MS = 15 * 60 * 1000;
const COMMAND_TTL_SEC = 300;

type DeviceRow = {
  id: string;
  familyId: string;
  name: string;
  manufacturer: string | null;
  model: string | null;
  platform: string;
  osVersion: string | null;
  appVersion: string | null;
  status: string;
  batteryPct: number | null;
  fcmToken: string | null;
  secretHash: string;
  lastSeenAt: Date | null;
  createdAt: Date;
};

function publicDevice(d: DeviceRow) {
  return {
    id: d.id,
    familyId: d.familyId,
    name: d.name,
    manufacturer: d.manufacturer,
    model: d.model,
    platform: d.platform,
    osVersion: d.osVersion,
    appVersion: d.appVersion,
    status: d.status,
    batteryPct: d.batteryPct,
    lastSeenAt: d.lastSeenAt?.toISOString() ?? null,
    createdAt: d.createdAt.toISOString(),
  };
}

async function issueUserTokens(user: {
  id: string;
  email: string;
  familyId: string;
  role: string;
}) {
  const sql = getSql();
  const accessToken = await signAccess(user.id, user.familyId, user.role);
  const refreshToken = await signRefresh(user.id, user.familyId);
  await sql`
    update "User" set "refreshTokenHash" = ${sha256(refreshToken)} where id = ${user.id}
  `;
  return {
    accessToken,
    refreshToken,
    user: {
      id: user.id,
      email: user.email,
      familyId: user.familyId,
      role: user.role,
    },
  };
}

async function requireAccess(req: Request) {
  const token = bearerToken(req);
  if (!token) throw apiError(401, 'Unauthorized');
  let payload;
  try {
    payload = await verifyToken(token);
  } catch {
    throw apiError(401, 'Unauthorized');
  }
  if (payload.typ !== 'access') throw apiError(401, 'wrong token type');
  return { userId: payload.sub, familyId: payload.fid, role: payload.role ?? 'PARENT' };
}

async function requireDevice(req: Request) {
  const token = bearerToken(req);
  if (!token) throw apiError(401, 'Unauthorized');
  let payload;
  try {
    payload = await verifyToken(token);
  } catch {
    throw apiError(401, 'Unauthorized');
  }
  if (payload.typ !== 'device') throw apiError(401, 'wrong token type');
  return { deviceId: payload.sub, familyId: payload.fid };
}

function pathKey(segments: string[]): string {
  return segments.join('/');
}

export async function dispatchApi(
  req: Request,
  method: string,
  segments: string[],
): Promise<Response> {
  if (!dbConfigured()) {
    if (segments[0] === 'health') {
      return json({ ok: false, db: false, message: 'DATABASE_URL not set' }, 503);
    }
    return apiError(503, 'Database not configured');
  }

  const key = pathKey(segments);

  try {
    if (key === 'health' && method === 'GET') {
      try {
        const sql = getSql();
        await sql`select 1 as ok`;
        return json({ ok: true, db: true });
      } catch {
        return json({ ok: false, db: true, message: 'Database unreachable' }, 503);
      }
    }

    if (key === 'auth/register' && method === 'POST') {
      const body = await readJson<{ email?: string; password?: string; familyName?: string }>(req);
      if (!body.email || !body.password || body.password.length < 8) {
        return apiError(400, 'invalid register payload');
      }
      const sql = getSql();
      const existing = await sql<{ id: string }[]>`
        select id from "User" where email = ${body.email} limit 1
      `;
      if (existing.length) return apiError(409, 'email already registered');

      const passwordHash = await bcrypt.hash(body.password, BCRYPT_ROUNDS);
      const familyName = body.familyName ?? `${body.email}'s family`;
      const families = await sql<{ id: string }[]>`
        insert into "Family" (name) values (${familyName}) returning id
      `;
      const familyId = families[0]!.id;
      const users = await sql<
        { id: string; email: string; familyId: string; role: string }[]
      >`
        insert into "User" ("familyId", email, "passwordHash")
        values (${familyId}, ${body.email}, ${passwordHash})
        returning id, email, "familyId", role
      `;
      return json(await issueUserTokens(users[0]!));
    }

    if (key === 'auth/login' && method === 'POST') {
      const body = await readJson<{ email?: string; password?: string }>(req);
      if (!body.email || !body.password) {
        return apiError(400, 'invalid login payload');
      }
      const sql = getSql();
      const rows = await sql<
        { id: string; email: string; familyId: string; role: string; passwordHash: string }[]
      >`
        select id, email, "familyId", role, "passwordHash" from "User"
        where email = ${body.email} limit 1
      `;
      const user = rows[0];
      if (!user) return apiError(401, 'invalid credentials');
      const ok = await bcrypt.compare(body.password, user.passwordHash);
      if (!ok) return apiError(401, 'invalid credentials');
      return json(
        await issueUserTokens({
          id: user.id,
          email: user.email,
          familyId: user.familyId,
          role: user.role,
        }),
      );
    }

    if (key === 'auth/refresh' && method === 'POST') {
      const body = await readJson<{ refreshToken?: string }>(req);
      if (!body.refreshToken) return apiError(400, 'refreshToken required');
      let payload;
      try {
        payload = await verifyToken(body.refreshToken);
      } catch {
        return apiError(401, 'invalid refresh token');
      }
      if (payload.typ !== 'refresh') return apiError(401, 'wrong token type');
      const sql = getSql();
      const rows = await sql<
        { id: string; email: string; familyId: string; role: string; refreshTokenHash: string | null }[]
      >`
        select id, email, "familyId", role, "refreshTokenHash" from "User"
        where id = ${payload.sub} limit 1
      `;
      const user = rows[0];
      if (!user?.refreshTokenHash) return apiError(401, 'refresh token revoked');
      if (!safeEqual(sha256(body.refreshToken), user.refreshTokenHash)) {
        return apiError(401, 'refresh token mismatch');
      }
      return json(await issueUserTokens(user));
    }

    if (key === 'auth/logout' && method === 'POST') {
      try {
        const auth = await requireAccess(req);
        const sql = getSql();
        await sql`update "User" set "refreshTokenHash" = null where id = ${auth.userId}`;
      } catch (e) {
        if (e instanceof Response) return e;
      }
      return noContent();
    }

    if (key === 'devices' && method === 'GET') {
      const auth = await requireAccess(req);
      const sql = getSql();
      const rows = await sql<DeviceRow[]>`
        select * from "Device" where "familyId" = ${auth.familyId}
        order by "createdAt" asc
      `;
      return json(rows.map(publicDevice));
    }

    if (segments[0] === 'devices' && segments[1] && segments[2] === 'commands' && method === 'POST') {
      const auth = await requireAccess(req);
      const deviceId = segments[1]!;
      const body = await readJson<{
        type?: string;
        payload?: Record<string, unknown>;
        idempotencyKey?: string;
      }>(req);
      if (!body.type) return apiError(400, 'type required');
      const sql = getSql();
      const owned = await sql<{ id: string }[]>`
        select id from "Device" where id = ${deviceId} and "familyId" = ${auth.familyId} limit 1
      `;
      if (!owned.length) return apiError(404, 'device not found');

      const idempotencyKey = body.idempotencyKey ?? randomToken();
      const existing = await sql<{ id: string }[]>`
        select id from "Command" where "idempotencyKey" = ${idempotencyKey} limit 1
      `;
      if (existing.length) {
        const cmd = await sql`select * from "Command" where id = ${existing[0]!.id}`;
        return json(cmd[0]);
      }

      const expiresAt = new Date(Date.now() + COMMAND_TTL_SEC * 1000);
      const inserted = await sql`
        insert into "Command" ("deviceId", type, payload, "idempotencyKey", state, "expiresAt")
        values (${deviceId}, ${body.type}, ${sql.json((body.payload ?? null) as never)}, ${idempotencyKey}, 'QUEUED', ${expiresAt})
        returning *
      `;
      return json(inserted[0]);
    }

    if (
      segments[0] === 'devices' &&
      segments[1] &&
      segments[2] === 'locations' &&
      segments[3] === 'latest' &&
      method === 'GET'
    ) {
      const auth = await requireAccess(req);
      const deviceId = segments[1]!;
      const sql = getSql();
      const owned = await sql`select id from "Device" where id = ${deviceId} and "familyId" = ${auth.familyId} limit 1`;
      if (!owned.length) return apiError(404, 'device not found');
      const loc = await sql`
        select lat, lng, "accuracyM", "occurredAt" from "Location"
        where "deviceId" = ${deviceId}
        order by "occurredAt" desc
        limit 1
      `;
      if (!loc.length) return json(null);
      const row = loc[0]!;
      return json({
        lat: row.lat,
        lng: row.lng,
        accuracyM: row.accuracyM,
        occurredAt: row.occurredAt,
      });
    }

    if (key === 'devices/me' && method === 'GET') {
      const dev = await requireDevice(req);
      const sql = getSql();
      const rows = await sql<DeviceRow[]>`
        select * from "Device" where id = ${dev.deviceId} limit 1
      `;
      if (!rows.length) return apiError(404, 'device not found');
      return json(publicDevice(rows[0]!));
    }

    if (key === 'devices/me' && method === 'PATCH') {
      const dev = await requireDevice(req);
      const body = await readJson<{
        batteryPct?: number;
        osVersion?: string;
        appVersion?: string;
        fcmToken?: string;
      }>(req);
      const sql = getSql();
      const rows = await sql<DeviceRow[]>`
        update "Device" set
          "batteryPct" = coalesce(${body.batteryPct ?? null}, "batteryPct"),
          "osVersion" = coalesce(${body.osVersion ?? null}, "osVersion"),
          "appVersion" = coalesce(${body.appVersion ?? null}, "appVersion"),
          "fcmToken" = coalesce(${body.fcmToken ?? null}, "fcmToken"),
          "lastSeenAt" = now()
        where id = ${dev.deviceId}
        returning *
      `;
      return json(publicDevice(rows[0]!));
    }

    if (key === 'devices/token' && method === 'POST') {
      const body = await readJson<{ deviceId?: string; secret?: string }>(req);
      if (!body.deviceId || !body.secret) return apiError(400, 'deviceId and secret required');
      const sql = getSql();
      const rows = await sql<DeviceRow[]>`
        select * from "Device" where id = ${body.deviceId} limit 1
      `;
      const device = rows[0];
      if (!device || !safeEqual(sha256(body.secret), device.secretHash)) {
        return apiError(401, 'invalid device credentials');
      }
      const deviceToken = await signDevice(device.id, device.familyId);
      return json({ deviceId: device.id, deviceToken });
    }

    if (key === 'pairings' && method === 'POST') {
      const auth = await requireAccess(req);
      const body = await readJson<{ deviceName?: string }>(req);
      const sql = getSql();
      const code = pairingCode();
      const qrToken = randomToken();
      const expiresAt = new Date(Date.now() + PAIRING_TTL_MS);
      const rows = await sql`
        insert into "Pairing" ("familyId", code, "qrToken", status, "deviceName", "expiresAt")
        values (${auth.familyId}, ${code}, ${qrToken}, 'PENDING', ${body.deviceName ?? null}, ${expiresAt})
        returning id, code, "qrToken", status, "expiresAt"
      `;
      const p = rows[0]!;
      return json({
        id: p.id,
        code: p.code,
        qrToken: p.qrToken,
        status: p.status,
        expiresAt: p.expiresAt,
      });
    }

    if (key === 'pairings/claim' && method === 'POST') {
      const body = await readJson<{
        token?: string;
        deviceName?: string;
        manufacturer?: string;
        model?: string;
        osVersion?: string;
        appVersion?: string;
        fcmToken?: string;
      }>(req);
      if (!body.token) return apiError(400, 'token required');
      const sql = getSql();
      const pairings = await sql<
        {
          id: string;
          familyId: string;
          status: string;
          expiresAt: Date;
          deviceName: string | null;
        }[]
      >`
        select id, "familyId", status, "expiresAt", "deviceName" from "Pairing"
        where "qrToken" = ${body.token} or code = ${body.token}
        limit 1
      `;
      const pairing = pairings[0];
      if (!pairing) return apiError(404, 'pairing not found');
      if (pairing.status !== 'PENDING') return apiError(400, 'pairing already used');
      if (pairing.expiresAt.getTime() < Date.now()) {
        await sql`update "Pairing" set status = 'EXPIRED' where id = ${pairing.id}`;
        return apiError(400, 'pairing expired');
      }

      const deviceSecret = randomToken();
      const name =
        body.deviceName ?? pairing.deviceName ?? body.model ?? 'Child device';
      const devices = await sql<DeviceRow[]>`
        insert into "Device" (
          "familyId", name, manufacturer, model, "osVersion", "appVersion",
          "fcmToken", "secretHash", status, "lastSeenAt"
        ) values (
          ${pairing.familyId}, ${name}, ${body.manufacturer ?? null}, ${body.model ?? null},
          ${body.osVersion ?? null}, ${body.appVersion ?? null}, ${body.fcmToken ?? null},
          ${sha256(deviceSecret)}, 'ONLINE', now()
        )
        returning *
      `;
      const device = devices[0]!;
      const deviceToken = await signDevice(device.id, pairing.familyId);
      await sql`
        update "Pairing" set status = 'CLAIMED', "claimedDeviceId" = ${device.id}
        where id = ${pairing.id}
      `;
      return json({
        deviceId: device.id,
        deviceToken,
        deviceSecret,
      });
    }

    if (segments[0] === 'pairings' && segments[1] && method === 'GET') {
      const auth = await requireAccess(req);
      const id = segments[1]!;
      const sql = getSql();
      const rows = await sql`
        select id, status, "claimedDeviceId", "expiresAt" from "Pairing"
        where id = ${id} and "familyId" = ${auth.familyId}
        limit 1
      `;
      if (!rows.length) return apiError(404, 'pairing not found');
      return json(rows[0]);
    }

    if (key === 'alerts' && method === 'GET') {
      const auth = await requireAccess(req);
      const url = new URL(req.url);
      const unread = url.searchParams.get('unread') === 'true';
      const sql = getSql();
      const rows = unread
        ? await sql`
            select id, type, title, body, "createdAt", "readAt", "deviceId"
            from "Alert" where "familyId" = ${auth.familyId} and "readAt" is null
            order by "createdAt" desc limit 100
          `
        : await sql`
            select id, type, title, body, "createdAt", "readAt", "deviceId"
            from "Alert" where "familyId" = ${auth.familyId}
            order by "createdAt" desc limit 100
          `;
      return json(
        rows.map((a) => ({
          ...a,
          read: a.readAt != null,
        })),
      );
    }

    if (segments[0] === 'alerts' && segments[2] === 'read' && method === 'POST') {
      const auth = await requireAccess(req);
      const id = segments[1]!;
      const sql = getSql();
      const rows = await sql`
        update "Alert" set "readAt" = now()
        where id = ${id} and "familyId" = ${auth.familyId}
        returning *
      `;
      if (!rows.length) return apiError(404, 'alert not found');
      return json(rows[0]);
    }

    if (key === 'locations' && method === 'POST') {
      const dev = await requireDevice(req);
      const body = await readJson<{
        lat?: number;
        lng?: number;
        accuracyM?: number;
        occurredAt?: string;
      }>(req);
      if (body.lat == null || body.lng == null) {
        return apiError(400, 'lat and lng required');
      }
      const occurredAt = body.occurredAt ? new Date(body.occurredAt) : new Date();
      const sql = getSql();
      const rows = await sql`
        insert into "Location" ("deviceId", lat, lng, "accuracyM", "occurredAt")
        values (${dev.deviceId}, ${body.lat}, ${body.lng}, ${body.accuracyM ?? null}, ${occurredAt})
        returning *
      `;
      await sql`update "Device" set "lastSeenAt" = now() where id = ${dev.deviceId}`;
      return json(rows[0], 201);
    }

    if (key === 'heartbeat' && method === 'POST') {
      const dev = await requireDevice(req);
      const body = await readJson<{ batteryPct?: number }>(req);
      const sql = getSql();
      await sql`
        update "Device" set
          "batteryPct" = coalesce(${body.batteryPct ?? null}, "batteryPct"),
          status = 'ONLINE',
          "lastSeenAt" = now()
        where id = ${dev.deviceId}
      `;
      return json({ ok: true });
    }

    if (key === 'commands/pending' && method === 'GET') {
      const dev = await requireDevice(req);
      const sql = getSql();
      await sql`
        update "Command" set state = 'EXPIRED'
        where "deviceId" = ${dev.deviceId} and state in ('QUEUED', 'SENT') and "expiresAt" < now()
      `;
      const rows = await sql`
        select * from "Command"
        where "deviceId" = ${dev.deviceId} and state in ('QUEUED', 'SENT')
        order by "createdAt" asc
      `;
      return json(rows);
    }

    if (segments[0] === 'commands' && segments[2] === 'ack' && method === 'POST') {
      const dev = await requireDevice(req);
      const id = segments[1]!;
      const sql = getSql();
      const rows = await sql`select * from "Command" where id = ${id} and "deviceId" = ${dev.deviceId} limit 1`;
      if (!rows.length) return apiError(404, 'command not found');
      const cmd = rows[0]!;
      if (cmd.state === 'QUEUED' || cmd.state === 'SENT') {
        const updated = await sql`
          update "Command" set state = 'ACKED', "updatedAt" = now() where id = ${id} returning *
        `;
        return json(updated[0]);
      }
      return json(cmd);
    }

    if (segments[0] === 'commands' && segments[2] === 'result' && method === 'POST') {
      const dev = await requireDevice(req);
      const id = segments[1]!;
      const body = await readJson<{ ok?: boolean; result?: unknown; error?: string }>(req);
      const sql = getSql();
      const rows = await sql`select * from "Command" where id = ${id} and "deviceId" = ${dev.deviceId} limit 1`;
      if (!rows.length) return apiError(404, 'command not found');
      const terminal = ['DONE', 'FAILED', 'EXPIRED'];
      if (terminal.includes(rows[0]!.state as string)) return json(rows[0]);
      const state = body.ok === false ? 'FAILED' : 'DONE';
      const updated = await sql`
        update "Command" set
          state = ${state},
          result = ${sql.json((body.result ?? null) as never)},
          error = ${body.error ?? null},
          "updatedAt" = now()
        where id = ${id}
        returning *
      `;
      return json(updated[0]);
    }

    if (key === 'policies' && method === 'GET') {
      const auth = await requireAccess(req);
      const sql = getSql();
      const rows = await sql`
        select id, version, rules, active, "createdAt" from "Policy"
        where "familyId" = ${auth.familyId} and active = true
        order by version desc limit 1
      `;
      return json(rows[0] ?? null);
    }

    if (key === 'policies' && method === 'PUT') {
      const auth = await requireAccess(req);
      const body = await readJson<{ rules?: Record<string, unknown> }>(req);
      const patch = body.rules ?? {};
      const sql = getSql();

      const activeRows = await sql<{ rules: Record<string, unknown> }[]>`
        select rules from "Policy" where "familyId" = ${auth.familyId} and active = true
        order by version desc limit 1
      `;
      const existing =
        activeRows[0]?.rules && typeof activeRows[0].rules === 'object'
          ? activeRows[0].rules
          : {};
      const merged = { ...existing, ...patch };

      const latest = await sql<{ version: number }[]>`
        select version from "Policy" where "familyId" = ${auth.familyId}
        order by version desc limit 1
      `;
      const version = (latest[0]?.version ?? 0) + 1;

      await sql`update "Policy" set active = false where "familyId" = ${auth.familyId} and active = true`;
      const created = await sql`
        insert into "Policy" ("familyId", version, rules, active)
        values (${auth.familyId}, ${version}, ${sql.json(merged as never)}, true)
        returning id, version, rules, active, "createdAt"
      `;

      // Fan out SET_POLICY to every device in the family.
      const devices = await sql<{ id: string }[]>`
        select id from "Device" where "familyId" = ${auth.familyId}
      `;
      const expiresAt = new Date(Date.now() + COMMAND_TTL_SEC * 1000);
      for (const d of devices) {
        await sql`
          insert into "Command" ("deviceId", type, payload, "idempotencyKey", state, "expiresAt")
          values (${d.id}, 'SET_POLICY', ${sql.json({ version, rules: merged } as never)}, ${randomToken()}, 'QUEUED', ${expiresAt})
        `;
      }
      return json(created[0]);
    }

    if (
      segments[0] === 'devices' &&
      segments[1] &&
      segments[2] === 'screen-sessions' &&
      method === 'POST'
    ) {
      const auth = await requireAccess(req);
      const deviceId = segments[1]!;
      const body = await readJson<{ mode?: 'mirror' | 'screenshot' }>(req);
      const sql = getSql();
      const owned = await sql`select id from "Device" where id = ${deviceId} and "familyId" = ${auth.familyId} limit 1`;
      if (!owned.length) return apiError(404, 'device not found');

      const sessions = await sql<{ id: string }[]>`
        insert into "ScreenSession" ("deviceId", transport, consented)
        values (${deviceId}, 'clip', true)
        returning id
      `;
      const sessionId = sessions[0]!.id;
      const type = body.mode === 'screenshot' ? 'SCREENSHOT' : 'SCREEN_VIEW_REQUEST';
      const expiresAt = new Date(Date.now() + COMMAND_TTL_SEC * 1000);
      await sql`
        insert into "Command" ("deviceId", type, payload, "idempotencyKey", state, "expiresAt")
        values (${deviceId}, ${type}, ${sql.json({ sessionId } as never)}, ${randomToken()}, 'QUEUED', ${expiresAt})
      `;
      return json({ id: sessionId, status: 'pending' }, 201);
    }

    if (key === 'events' && method === 'POST') {
      const dev = await requireDevice(req);
      const body = await readJson<{
        events?: { type: string; data: unknown; occurredAt: string }[];
      }>(req);
      const events = body.events ?? [];
      const sql = getSql();
      for (const e of events) {
        await sql`
          insert into "Event" ("deviceId", type, data, "occurredAt")
          values (${dev.deviceId}, ${e.type}, ${sql.json((e.data ?? {}) as never)}, ${new Date(e.occurredAt)})
        `;
      }
      await sql`update "Device" set "lastSeenAt" = now() where id = ${dev.deviceId}`;
      return json({ count: events.length });
    }

    if (
      segments[0] === 'devices' &&
      segments[1] &&
      segments[2] === 'events' &&
      method === 'GET'
    ) {
      const auth = await requireAccess(req);
      const deviceId = segments[1]!;
      const sql = getSql();
      const owned = await sql`select id from "Device" where id = ${deviceId} and "familyId" = ${auth.familyId} limit 1`;
      if (!owned.length) return apiError(404, 'device not found');
      const url = new URL(req.url);
      const limit = Math.min(Number(url.searchParams.get('limit')) || 200, 500);
      const rows = await sql`
        select id, type, data, "occurredAt" from "Event"
        where "deviceId" = ${deviceId}
        order by "occurredAt" desc limit ${limit}
      `;
      return json(rows);
    }

    if (key === 'content' && method === 'POST') {
      const dev = await requireDevice(req);
      const body = await readJson<{
        items?: {
          source: string;
          body: string;
          matched?: string | null;
          counterparty?: string | null;
          direction?: string | null;
          occurredAt: string;
        }[];
      }>(req);
      const items = body.items ?? [];
      const sql = getSql();
      for (const it of items) {
        await sql`
          insert into "ContentArchive"
            ("deviceId", source, direction, counterparty, body, matched, "occurredAt")
          values (
            ${dev.deviceId}, ${it.source}, ${it.direction ?? null},
            ${it.counterparty ?? null}, ${it.body}, ${it.matched ?? null}, ${new Date(it.occurredAt)}
          )
        `;
      }
      await sql`update "Device" set "lastSeenAt" = now() where id = ${dev.deviceId}`;
      return json({ count: items.length });
    }

    if (
      segments[0] === 'devices' &&
      segments[1] &&
      segments[2] === 'content' &&
      method === 'GET'
    ) {
      const auth = await requireAccess(req);
      const deviceId = segments[1]!;
      const sql = getSql();
      const owned = await sql`select id from "Device" where id = ${deviceId} and "familyId" = ${auth.familyId} limit 1`;
      if (!owned.length) return apiError(404, 'device not found');
      const url = new URL(req.url);
      const source = url.searchParams.get('source');
      const rows = source
        ? await sql`
            select id, source, direction, counterparty, body, matched, "occurredAt"
            from "ContentArchive" where "deviceId" = ${deviceId} and source = ${source}
            order by "occurredAt" desc limit 300
          `
        : await sql`
            select id, source, direction, counterparty, body, matched, "occurredAt"
            from "ContentArchive" where "deviceId" = ${deviceId}
            order by "occurredAt" desc limit 300
          `;
      return json(rows);
    }

    // ---- location history ----
    if (
      segments[0] === 'devices' &&
      segments[1] &&
      segments[2] === 'locations' &&
      segments.length === 3 &&
      method === 'GET'
    ) {
      const auth = await requireAccess(req);
      const deviceId = segments[1]!;
      const sql = getSql();
      const owned = await sql`select id from "Device" where id = ${deviceId} and "familyId" = ${auth.familyId} limit 1`;
      if (!owned.length) return apiError(404, 'device not found');
      const url = new URL(req.url);
      const limit = Math.min(Number(url.searchParams.get('limit')) || 100, 500);
      const rows = await sql`
        select lat, lng, "accuracyM", "occurredAt" from "Location"
        where "deviceId" = ${deviceId}
        order by "occurredAt" desc limit ${limit}
      `;
      return json(rows);
    }

    // ---- geofences (parent CRUD) ----
    if (
      segments[0] === 'devices' &&
      segments[1] &&
      segments[2] === 'geofences' &&
      segments.length === 3
    ) {
      const auth = await requireAccess(req);
      const deviceId = segments[1]!;
      const sql = getSql();
      const owned = await sql`select id from "Device" where id = ${deviceId} and "familyId" = ${auth.familyId} limit 1`;
      if (!owned.length) return apiError(404, 'device not found');

      if (method === 'GET') {
        const rows = await sql`
          select id, name, lat, lng, "radiusM", active from "Geofence"
          where "deviceId" = ${deviceId} order by "createdAt" asc
        `;
        return json(rows);
      }
      if (method === 'POST') {
        const b = await readJson<{
          name?: string;
          lat?: number;
          lng?: number;
          radiusM?: number;
        }>(req);
        if (!b.name || b.lat == null || b.lng == null) {
          return apiError(400, 'name, lat, lng required');
        }
        const rows = await sql`
          insert into "Geofence" ("deviceId", name, lat, lng, "radiusM")
          values (${deviceId}, ${b.name}, ${b.lat}, ${b.lng}, ${b.radiusM ?? 200})
          returning id, name, lat, lng, "radiusM", active
        `;
        return json(rows[0], 201);
      }
    }

    if (
      segments[0] === 'devices' &&
      segments[1] &&
      segments[2] === 'geofences' &&
      segments[3] &&
      method === 'DELETE'
    ) {
      const auth = await requireAccess(req);
      const deviceId = segments[1]!;
      const gid = segments[3]!;
      const sql = getSql();
      const owned = await sql`select id from "Device" where id = ${deviceId} and "familyId" = ${auth.familyId} limit 1`;
      if (!owned.length) return apiError(404, 'device not found');
      await sql`delete from "Geofence" where id = ${gid} and "deviceId" = ${deviceId}`;
      return noContent();
    }

    // ---- AI usage report ----
    if (
      segments[0] === 'devices' &&
      segments[1] &&
      segments[2] === 'ai-report' &&
      method === 'POST'
    ) {
      const auth = await requireAccess(req);
      const deviceId = segments[1]!;
      const sql = getSql();
      const owned = await sql`select id from "Device" where id = ${deviceId} and "familyId" = ${auth.familyId} limit 1`;
      if (!owned.length) return apiError(404, 'device not found');
      const { aiConfigured, generateReport } = await import('./ai-report');
      if (!aiConfigured()) {
        return apiError(503, 'AI not configured (set ANTHROPIC_API_KEY)');
      }
      const events = await sql`
        select type, data, "occurredAt" from "Event"
        where "deviceId" = ${deviceId} order by "occurredAt" desc limit 300
      `;
      const content = await sql`
        select source, body, matched, counterparty, "occurredAt" from "ContentArchive"
        where "deviceId" = ${deviceId} order by "occurredAt" desc limit 200
      `;
      try {
        const report = await generateReport(
          events as never,
          content as never,
        );
        return json({ report });
      } catch (e) {
        console.error('ai-report', e);
        return apiError(502, 'AI report generation failed');
      }
    }

    // ---- geofences (device reads its fences) ----
    if (key === 'geofences' && method === 'GET') {
      const dev = await requireDevice(req);
      const sql = getSql();
      const rows = await sql`
        select id, name, lat, lng, "radiusM", active from "Geofence"
        where "deviceId" = ${dev.deviceId} and active = true
      `;
      return json(rows);
    }

    return apiError(404, 'Not Found');
  } catch (e) {
    if (e instanceof Response) return e;
    console.error(e);
    return apiError(500, 'internal error');
  }
}
