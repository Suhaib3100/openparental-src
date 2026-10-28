import { dispatchApi } from '@/lib/server/api-router';

export const runtime = 'nodejs';

type Ctx = { params: Promise<{ path?: string[] }> };

async function handle(req: Request, ctx: Ctx) {
  const { path = [] } = await ctx.params;
  return dispatchApi(req, req.method, path);
}

export const GET = handle;
export const POST = handle;
export const PATCH = handle;
export const DELETE = handle;
export const PUT = handle;
