/** Public site + download links (override in Vercel env). */
export const site = {
  name: 'OpenParental',
  tagline: 'Family supervision you control — private testing build.',
};

export const downloads = {
  childApkUrl:
    process.env.NEXT_PUBLIC_CHILD_APK_URL ??
    'https://github.com/abuzar310/openparental/releases/latest/download/openparental-child.apk',
  parentApkUrl:
    process.env.NEXT_PUBLIC_PARENT_APK_URL ??
    'https://github.com/abuzar310/openparental/releases/latest/download/openparental-parent.apk',
};

/** Same-origin API when unset (Vercel + Supabase). Override for local NestJS. */
export const apiBaseUrl = (
  process.env.NEXT_PUBLIC_API_URL ?? ''
).replace(/\/$/, '');
