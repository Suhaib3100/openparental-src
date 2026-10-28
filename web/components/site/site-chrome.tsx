import Link from 'next/link';
import { site } from '@/lib/config';

const links = [
  { href: '/setup', label: 'Setup guide' },
  { href: '/download', label: 'Downloads' },
  { href: '/#apps', label: 'See the apps' },
  { href: '/login', label: 'Dashboard', primary: true },
];

export function SiteHeader() {
  return (
    <header className="border-b border-line bg-white/85 backdrop-blur-md sticky top-0 z-50">
      <div className="mx-auto max-w-6xl px-5 py-3.5 flex items-center justify-between gap-4">
        <Link href="/" className="flex items-center gap-2 font-semibold text-brand shrink-0">
          <span className="text-xl" aria-hidden>
            🛡️
          </span>
          {site.name}
        </Link>
        <nav className="flex items-center gap-1 sm:gap-2 text-sm flex-wrap justify-end">
          {links.map((l) =>
            l.primary ? (
              <Link
                key={l.href}
                href={l.href}
                className="rounded-full bg-brand px-3.5 sm:px-4 py-2 text-white font-medium hover:opacity-90 transition"
              >
                {l.label}
              </Link>
            ) : (
              <Link
                key={l.href}
                href={l.href}
                className={`rounded-full px-3 py-2 text-ink/80 hover:bg-surface hover:text-ink transition ${
                  l.href === '/login' ? 'hidden sm:inline-block' : 'inline-block'
                }`}
              >
                {l.label}
              </Link>
            ),
          )}
        </nav>
      </div>
    </header>
  );
}

export function SiteFooter() {
  return (
    <footer className="border-t border-line bg-white mt-auto">
      <div className="mx-auto max-w-6xl px-5 py-10 grid sm:grid-cols-2 gap-8 text-sm">
        <div>
          <p className="font-semibold text-brand">{site.name}</p>
          <p className="mt-2 text-muted max-w-sm">{site.tagline}</p>
        </div>
        <div className="flex flex-col gap-2 sm:items-end text-muted">
          <Link href="/setup" className="hover:text-brand transition">
            Setup guide
          </Link>
          <Link href="/download" className="hover:text-brand transition">
            Downloads
          </Link>
          <Link href="/login" className="hover:text-brand transition">
            Parent dashboard
          </Link>
        </div>
      </div>
      <p className="text-center text-xs text-muted pb-8">
        Private family testing build · Hosted on Vercel + Supabase
      </p>
    </footer>
  );
}

export function SiteShell({ children }: { children: React.ReactNode }) {
  return (
    <div className="min-h-dvh flex flex-col">
      <SiteHeader />
      {children}
      <SiteFooter />
    </div>
  );
}
