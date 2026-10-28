import { SignJWT, jwtVerify } from 'jose';

export type TokenPayload = {
  sub: string;
  fid: string;
  role?: string;
  typ: 'access' | 'refresh' | 'device';
};

function secretKey(): Uint8Array {
  const secret = process.env.JWT_SECRET ?? 'dev-secret-change-me';
  return new TextEncoder().encode(secret);
}

const accessTtl = Number(process.env.JWT_ACCESS_TTL ?? 900);
const refreshTtl = Number(process.env.JWT_REFRESH_TTL ?? 2_592_000);
const deviceTtl = Number(process.env.JWT_DEVICE_TTL ?? 31_536_000);

export async function signAccess(
  userId: string,
  familyId: string,
  role: string,
): Promise<string> {
  return new SignJWT({ fid: familyId, role, typ: 'access' })
    .setProtectedHeader({ alg: 'HS256' })
    .setSubject(userId)
    .setIssuedAt()
    .setExpirationTime(`${accessTtl}s`)
    .sign(secretKey());
}

export async function signRefresh(
  userId: string,
  familyId: string,
): Promise<string> {
  return new SignJWT({ fid: familyId, typ: 'refresh' })
    .setProtectedHeader({ alg: 'HS256' })
    .setSubject(userId)
    .setIssuedAt()
    .setExpirationTime(`${refreshTtl}s`)
    .sign(secretKey());
}

export async function signDevice(
  deviceId: string,
  familyId: string,
): Promise<string> {
  return new SignJWT({ fid: familyId, typ: 'device' })
    .setProtectedHeader({ alg: 'HS256' })
    .setSubject(deviceId)
    .setIssuedAt()
    .setExpirationTime(`${deviceTtl}s`)
    .sign(secretKey());
}

export async function verifyToken(token: string): Promise<TokenPayload> {
  const { payload } = await jwtVerify(token, secretKey());
  const sub = payload.sub;
  if (!sub || typeof sub !== 'string') {
    throw new Error('invalid token');
  }
  const fid = payload.fid;
  if (!fid || typeof fid !== 'string') {
    throw new Error('invalid token');
  }
  const typ = payload.typ;
  if (typ !== 'access' && typ !== 'refresh' && typ !== 'device') {
    throw new Error('invalid token type');
  }
  return {
    sub,
    fid,
    role: typeof payload.role === 'string' ? payload.role : undefined,
    typ,
  };
}
