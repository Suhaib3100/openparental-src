import { NextResponse } from 'next/server';

export function json(data: unknown, status = 200): NextResponse {
  return NextResponse.json(data, { status });
}

export function noContent(): NextResponse {
  return new NextResponse(null, { status: 204 });
}

export function errorMessage(err: unknown): string {
  if (err instanceof Error) return err.message;
  return 'internal error';
}

export function apiError(status: number, message: string | string[]): NextResponse {
  return NextResponse.json({ message, statusCode: status }, { status });
}

export async function readJson<T>(req: Request): Promise<T> {
  return (await req.json()) as T;
}

export function bearerToken(req: Request): string | null {
  const h = req.headers.get('authorization');
  if (!h?.startsWith('Bearer ')) return null;
  return h.slice(7).trim() || null;
}
