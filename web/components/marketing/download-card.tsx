'use client';

import { useState } from 'react';
import Link from 'next/link';

export function DownloadCard({
  title,
  description,
  href,
  cta,
}: {
  title: string;
  description: string;
  href: string;
  cta: string;
}) {
  const [status, setStatus] = useState<'idle' | 'loading' | 'missing'>('idle');

  async function onDownload() {
    setStatus('loading');
    try {
      const res = await fetch(href, { method: 'HEAD' }).catch(() => null);
      if (res?.ok) {
        window.location.href = href;
        setStatus('idle');
        return;
      }
      const get = await fetch(href);
      if (get.ok) {
        window.location.href = href;
        setStatus('idle');
        return;
      }
      setStatus('missing');
    } catch {
      setStatus('missing');
    }
  }

  return (
    <article className="rounded-3xl border border-line bg-white p-6 shadow-sm flex flex-col">
      <h2 className="text-xl font-semibold">{title}</h2>
      <p className="mt-2 text-muted text-sm flex-1">{description}</p>
      <div className="mt-6 flex flex-col gap-2">
        <button
          type="button"
          onClick={onDownload}
          disabled={status === 'loading'}
          className="w-full rounded-2xl bg-brand text-white py-3 font-medium hover:opacity-90 transition disabled:opacity-60"
        >
          {status === 'loading' ? 'Checking…' : cta}
        </button>
        {status === 'missing' && (
          <p className="text-sm text-alert bg-red-50 rounded-xl px-3 py-2">
            This APK is not on the site yet. Continue with the{' '}
            <Link href="/setup#download" className="underline font-medium">
              setup guide
            </Link>{' '}
            — we will host builds here (not on GitHub).
          </p>
        )}
      </div>
    </article>
  );
}
