/** Public site + download links (same-origin; optional CDN via env — not GitHub). */
export const site = {
  name: 'OpenParental',
  tagline:
    'Family supervision you control — child protection on Android, parent control from anywhere.',
};

const siteOrigin =
  process.env.NEXT_PUBLIC_SITE_URL?.replace(/\/$/, '') ?? '';

function apkPath(slug: 'child' | 'parent' | 'installer'): string {
  const path = `/api/apk/${slug}`;
  return siteOrigin ? `${siteOrigin}${path}` : path;
}

export const downloads = {
  childApkUrl: apkPath('child'),
  parentApkUrl: apkPath('parent'),
  installerApkUrl: apkPath('installer'),
};

export const apkDownloadMeta = {
  child: {
    title: 'Child (managed device)',
    description:
      'Install on the phone you supervise. Pairs with a code from your parent dashboard.',
  },
  parent: {
    title: 'Parent (Android)',
    description:
      'Optional — same features as the web dashboard, with Notice · Device · Me tabs.',
  },
  installer: {
    title: 'Kids installer bootstrap',
    description:
      'FlashGet-style downloader shell that fetches the child APK (advanced / testing).',
  },
} as const;

/** Same-origin API when unset (Vercel + Supabase). Override for local NestJS. */
export const apiBaseUrl = (
  process.env.NEXT_PUBLIC_API_URL ?? ''
).replace(/\/$/, '');
