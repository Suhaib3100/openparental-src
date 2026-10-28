import { NextResponse } from 'next/server';
import { readFile } from 'fs/promises';
import path from 'path';
import { apkDownloadMeta } from '@/lib/config';

export const runtime = 'nodejs';

const FILES: Record<string, { filename: string; envUrl?: string; publicPath: string }> = {
  child: {
    filename: 'openparental-child.apk',
    envUrl: process.env.CHILD_APK_URL ?? process.env.NEXT_PUBLIC_CHILD_APK_URL,
    publicPath: 'openparental-child.apk',
  },
  parent: {
    filename: 'openparental-parent.apk',
    envUrl: process.env.PARENT_APK_URL ?? process.env.NEXT_PUBLIC_PARENT_APK_URL,
    publicPath: 'openparental-parent.apk',
  },
  installer: {
    filename: 'openparental-installer.apk',
    envUrl: process.env.INSTALLER_APK_URL ?? process.env.NEXT_PUBLIC_INSTALLER_APK_URL,
    publicPath: 'openparental-installer.apk',
  },
};

async function serveApk(name: string): Promise<Response> {
  const spec = FILES[name];
  if (!spec) {
    return NextResponse.json({ message: 'Unknown package' }, { status: 404 });
  }

  if (spec.envUrl && !spec.envUrl.includes('github.com')) {
    return NextResponse.redirect(spec.envUrl, 302);
  }

  try {
    const filePath = path.join(process.cwd(), 'public', 'downloads', spec.publicPath);
    const buf = await readFile(filePath);
    return new NextResponse(buf, {
      status: 200,
      headers: {
        'Content-Type': 'application/vnd.android.package-archive',
        'Content-Disposition': `attachment; filename="${spec.filename}"`,
        'Cache-Control': 'public, max-age=3600',
      },
    });
  } catch {
    const meta = apkDownloadMeta[name as keyof typeof apkDownloadMeta];
    return NextResponse.json(
      {
        message: 'APK not published on this site yet',
        title: meta?.title,
        hint: 'Follow the setup guide — once release APKs are uploaded to public/downloads or a CDN env URL (non-GitHub), this link will work.',
        setup: '/setup#download',
      },
      { status: 404 },
    );
  }
}

/** Same-origin APK downloads — never redirects to GitHub by default. */
export async function HEAD(
  _req: Request,
  ctx: { params: Promise<{ name: string }> },
) {
  const { name } = await ctx.params;
  const res = await serveApk(name);
  return new Response(null, { status: res.status, headers: res.headers });
}

export async function GET(
  _req: Request,
  ctx: { params: Promise<{ name: string }> },
) {
  const { name } = await ctx.params;
  return serveApk(name);
}
