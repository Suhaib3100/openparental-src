'use client';

import Link from 'next/link';
import { usePathname, useRouter } from 'next/navigation';
import { useEffect, useState } from 'react';
import { getAccessToken, logout } from '@/lib/api';

const links = [
  { href: '/dashboard', label: 'Devices' },
  { href: '/dashboard/rules', label: 'Rules' },
  { href: '/dashboard/alerts', label: 'Alerts' },
  { href: '/dashboard/pair', label: 'Pair child' },
];

export function DashboardShell({ children }: { children: React.ReactNode }) {
  const router = useRouter();
  const pathname = usePathname();
  const [ready, setReady] = useState(false);

  useEffect(() => {
    if (!getAccessToken()) {
      router.replace('/login');
      return;
    }
    setReady(true);
  }, [router]);

  async function signOut() {
    await logout();
    router.replace('/login');
  }

  if (!ready) {
    return (
      <div className="min-h-dvh flex items-center justify-center text-muted">
        Loading…
      </div>
    );
  }

  return (
    <div className="min-h-dvh flex flex-col md:flex-row">
      <aside className="md:w-56 border-b md:border-b-0 md:border-r border-line bg-white p-4">
        <Link href="/" className="font-semibold text-brand block mb-6">
          🛡️ OpenParental
        </Link>
        <nav className="flex md:flex-col gap-2">
          {links.map((l) => (
            <Link
              key={l.href}
              href={l.href}
              className={`rounded-xl px-3 py-2 text-sm font-medium ${
                pathname === l.href || pathname.startsWith(l.href + '/')
                  ? 'bg-brand/10 text-brand'
                  : 'text-muted hover:bg-surface'
              }`}
            >
              {l.label}
            </Link>
          ))}
        </nav>
        <button
          type="button"
          onClick={signOut}
          className="mt-6 text-sm text-muted hover:text-ink"
        >
          Sign out
        </button>
      </aside>
      <main className="flex-1 p-5 md:p-8 max-w-4xl">{children}</main>
    </div>
  );
}
