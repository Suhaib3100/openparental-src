import type { NextConfig } from 'next';

/** Nest/Flutter clients call /auth, /devices, … at the site root (not /api). */
const apiRewrites = [
  'auth',
  'devices',
  'pairings',
  'alerts',
  'commands',
  'locations',
  'heartbeat',
  'health',
  'screen-sessions',
  'policies',
  'events',
  'content',
  'geofences',
  'photo-flags',
  'tamper',
].flatMap((prefix) => [
  { source: `/${prefix}`, destination: `/api/${prefix}` },
  { source: `/${prefix}/:path*`, destination: `/api/${prefix}/:path*` },
]);

const nextConfig: NextConfig = {
  async rewrites() {
    return apiRewrites;
  },
  async headers() {
    return [
      {
        source: '/downloads/:path*',
        headers: [
          { key: 'Content-Type', value: 'application/vnd.android.package-archive' },
          { key: 'Content-Disposition', value: 'attachment' },
        ],
      },
    ];
  },
};

export default nextConfig;
