import { apiBaseUrl } from './config';

export type AuthUser = {
  userId: string;
  email: string;
  familyId: string;
};

export type Device = {
  id: string;
  name: string;
  status: string;
  batteryPct?: number | null;
  model?: string | null;
  lastSeenAt?: string | null;
};

export type Alert = {
  id: string;
  type: string;
  title: string;
  body: string;
  createdAt?: string;
  readAt?: string | null;
  read?: boolean;
};

export type DeviceLocation = {
  lat: number;
  lng: number;
  accuracyM?: number | null;
  occurredAt?: string | null;
};

export type Pairing = {
  id: string;
  code: string;
  qrToken: string;
  status: string;
};

const TOKEN_KEY = 'op_access';
const REFRESH_KEY = 'op_refresh';

function storage(): Storage | null {
  if (typeof window === 'undefined') return null;
  return window.localStorage;
}

export function getAccessToken(): string | null {
  return storage()?.getItem(TOKEN_KEY) ?? null;
}

export function clearSession(): void {
  storage()?.removeItem(TOKEN_KEY);
  storage()?.removeItem(REFRESH_KEY);
}

async function persistAuth(data: {
  accessToken: string;
  refreshToken: string;
}): Promise<void> {
  storage()?.setItem(TOKEN_KEY, data.accessToken);
  storage()?.setItem(REFRESH_KEY, data.refreshToken);
}

async function refreshTokens(): Promise<boolean> {
  const refresh = storage()?.getItem(REFRESH_KEY);
  if (!refresh) return false;
  const res = await fetch(`${apiBaseUrl}/auth/refresh`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ refreshToken: refresh }),
  });
  if (!res.ok) return false;
  const json = (await res.json()) as {
    accessToken: string;
    refreshToken: string;
  };
  await persistAuth(json);
  return true;
}

async function apiFetch<T>(
  path: string,
  init: RequestInit = {},
  retry = true,
): Promise<T> {
  const headers = new Headers(init.headers);
  headers.set('Content-Type', 'application/json');
  const token = getAccessToken();
  if (token) headers.set('Authorization', `Bearer ${token}`);

  const res = await fetch(`${apiBaseUrl}${path}`, { ...init, headers });
  if (res.status === 401 && retry) {
    const ok = await refreshTokens();
    if (ok) return apiFetch(path, init, false);
    clearSession();
    throw new Error('Session expired');
  }
  if (!res.ok) {
    let message = res.statusText;
    try {
      const err = (await res.json()) as { message?: string | string[] };
      if (err.message) {
        message = Array.isArray(err.message)
          ? err.message.join(', ')
          : err.message;
      }
    } catch {
      /* ignore */
    }
    throw new Error(message);
  }
  if (res.status === 204) return undefined as T;
  return (await res.json()) as T;
}

async function authRequest(
  path: string,
  body: Record<string, unknown>,
): Promise<AuthUser> {
  const res = await fetch(`${apiBaseUrl}${path}`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(body),
  });
  if (!res.ok) {
    let message = res.statusText;
    try {
      const err = (await res.json()) as { message?: string | string[] };
      if (err.message) {
        message = Array.isArray(err.message)
          ? err.message.join(', ')
          : err.message;
      }
    } catch {
      /* ignore */
    }
    throw new Error(message);
  }
  const json = (await res.json()) as {
    accessToken: string;
    refreshToken: string;
    user: { id: string; email: string; familyId: string };
  };
  await persistAuth({
    accessToken: json.accessToken,
    refreshToken: json.refreshToken,
  });
  return {
    userId: json.user.id,
    email: json.user.email,
    familyId: json.user.familyId,
  };
}

export async function login(email: string, password: string): Promise<AuthUser> {
  return authRequest('/auth/login', { email, password });
}

export async function register(
  email: string,
  password: string,
  familyName?: string,
): Promise<AuthUser> {
  return authRequest('/auth/register', {
    email,
    password,
    ...(familyName ? { familyName } : {}),
  });
}

export async function logout(): Promise<void> {
  try {
    await apiFetch('/auth/logout', { method: 'POST' });
  } catch {
    /* best effort */
  }
  clearSession();
}

export function listDevices(): Promise<Device[]> {
  return apiFetch<Device[]>('/devices');
}

export function listAlerts(): Promise<Alert[]> {
  return apiFetch<Alert[]>('/alerts');
}

export function markAlertRead(id: string): Promise<void> {
  return apiFetch(`/alerts/${id}/read`, { method: 'POST' });
}

export function createPairing(): Promise<Pairing> {
  return apiFetch<Pairing>('/pairings', {
    method: 'POST',
    body: JSON.stringify({}),
  });
}

export function sendCommand(
  deviceId: string,
  type: string,
  payload?: Record<string, unknown>,
): Promise<void> {
  return apiFetch(`/devices/${deviceId}/commands`, {
    method: 'POST',
    body: JSON.stringify({ type, ...(payload ? { payload } : {}) }),
  });
}

export function latestLocation(deviceId: string): Promise<DeviceLocation | null> {
  return apiFetch<DeviceLocation | null>(
    `/devices/${deviceId}/locations/latest`,
  ).catch(() => null);
}
