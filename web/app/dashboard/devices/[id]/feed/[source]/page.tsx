'use client';

import Link from 'next/link';
import { useParams } from 'next/navigation';
import { useEffect, useState } from 'react';
import { getContent, type ContentItem } from '@/lib/api';

const META: Record<
  string,
  { title: string; icon: string; sources: string[]; empty: string }
> = {
  notification: {
    title: 'Notifications',
    icon: '🔔',
    sources: ['notification'],
    empty: 'No notifications synced yet.',
  },
  browser: {
    title: 'Browser history',
    icon: '🌐',
    sources: ['browser'],
    empty: 'No browsing activity yet.',
  },
  keyword: {
    title: 'Keyword alerts',
    icon: '⚠️',
    sources: ['keyword'],
    empty: 'No flagged keywords yet.',
  },
  sms: {
    title: 'Messages (SMS)',
    icon: '💬',
    sources: ['sms'],
    empty: 'No SMS captured yet.',
  },
  calllog: {
    title: 'Calls',
    icon: '📞',
    sources: ['calllog'],
    empty: 'No call activity yet.',
  },
  videos: {
    title: 'Watch history',
    icon: '▶️',
    sources: ['youtube', 'tiktok'],
    empty: 'No watch history yet.',
  },
};

export default function FeedPage() {
  const params = useParams();
  const id = params.id as string;
  const sourceKey = params.source as string;
  const meta = META[sourceKey] ?? {
    title: sourceKey,
    icon: '📝',
    sources: [sourceKey],
    empty: 'Nothing captured yet.',
  };

  const [items, setItems] = useState<ContentItem[] | null>(null);

  useEffect(() => {
    Promise.all(meta.sources.map((s) => getContent(id, s))).then((lists) => {
      const merged = lists
        .flat()
        .sort(
          (a, b) =>
            new Date(b.occurredAt).getTime() - new Date(a.occurredAt).getTime(),
        );
      setItems(merged);
    });
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [id, sourceKey]);

  return (
    <div className="max-w-2xl">
      <Link href={`/dashboard/devices/${id}`} className="text-sm text-brand">
        ← Device
      </Link>
      <h1 className="text-2xl font-semibold mt-2">
        {meta.icon} {meta.title}
      </h1>

      {items == null ? (
        <p className="mt-6 text-muted">Loading…</p>
      ) : items.length === 0 ? (
        <p className="mt-6 text-muted text-sm">{meta.empty}</p>
      ) : (
        <ul className="mt-6 space-y-1">
          {items.map((c) => (
            <li
              key={c.id}
              className="rounded-xl border border-line bg-white px-3 py-2"
            >
              <div className="flex items-center justify-between gap-2">
                <span className="text-sm font-medium truncate">
                  {c.counterparty ?? meta.title}
                </span>
                <time className="text-xs text-muted shrink-0">
                  {new Date(c.occurredAt).toLocaleString()}
                </time>
              </div>
              <p className="text-sm text-ink/80 mt-0.5 break-words">{c.body}</p>
              {c.matched && (
                <span className="inline-block mt-1 text-[11px] rounded bg-alert/10 text-alert px-1.5 py-0.5">
                  flagged: {c.matched}
                </span>
              )}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}
