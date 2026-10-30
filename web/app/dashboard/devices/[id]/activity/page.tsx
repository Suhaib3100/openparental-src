'use client';

import Link from 'next/link';
import { useParams } from 'next/navigation';
import { useEffect, useState } from 'react';
import {
  getContent,
  getEvents,
  type ContentItem,
  type EventLog,
} from '@/lib/api';

type Row = {
  at: string;
  icon: string;
  title: string;
  detail?: string;
  tag?: string;
};

function eventRow(e: EventLog): Row | null {
  const d = e.data ?? {};
  switch (e.type) {
    case 'APP_FOREGROUND':
      return { at: e.occurredAt, icon: '📱', title: 'Opened app', detail: String(d.pkg ?? '') };
    case 'APP_INSTALLED':
      return { at: e.occurredAt, icon: '➕', title: 'Installed app', detail: String(d.package ?? '') };
    case 'APP_REMOVED':
      return { at: e.occurredAt, icon: '➖', title: 'Removed app', detail: String(d.package ?? '') };
    case 'USAGE_SUMMARY': {
      const by = (d.minutesByApp ?? {}) as Record<string, number>;
      const top = Object.entries(by)
        .sort((a, b) => b[1] - a[1])
        .slice(0, 5)
        .map(([p, m]) => `${p}: ${m}m`)
        .join(', ');
      return { at: e.occurredAt, icon: '⏱️', title: 'Usage summary', detail: top };
    }
    default:
      return { at: e.occurredAt, icon: '•', title: e.type, detail: JSON.stringify(d).slice(0, 120) };
  }
}

const SOURCE_META: Record<string, { icon: string; label: string }> = {
  notification: { icon: '🔔', label: 'Notification' },
  youtube: { icon: '▶️', label: 'YouTube' },
  tiktok: { icon: '🎵', label: 'TikTok' },
  browser: { icon: '🌐', label: 'Browser' },
  keyword: { icon: '⚠️', label: 'Keyword flag' },
  sms: { icon: '💬', label: 'SMS' },
  calllog: { icon: '📞', label: 'Call' },
};

function contentRow(c: ContentItem): Row {
  const meta = SOURCE_META[c.source] ?? { icon: '📝', label: c.source };
  return {
    at: c.occurredAt,
    icon: meta.icon,
    title: meta.label,
    detail: c.body,
    tag: c.matched ?? c.counterparty ?? undefined,
  };
}

export default function ActivityPage() {
  const params = useParams();
  const id = params.id as string;
  const [rows, setRows] = useState<Row[] | null>(null);

  useEffect(() => {
    Promise.all([getEvents(id, 300), getContent(id)]).then(([events, content]) => {
      const merged = [
        ...events.map(eventRow).filter((r): r is Row => r != null),
        ...content.map(contentRow),
      ].sort((a, b) => new Date(b.at).getTime() - new Date(a.at).getTime());
      setRows(merged);
    });
  }, [id]);

  return (
    <div className="max-w-2xl">
      <Link href={`/dashboard/devices/${id}`} className="text-sm text-brand">
        ← Device
      </Link>
      <h1 className="text-2xl font-semibold mt-2">Activity</h1>
      <p className="text-muted text-sm">
        App opens, usage, installs, notifications, and watch history, newest first.
      </p>

      {rows == null ? (
        <p className="mt-6 text-muted">Loading…</p>
      ) : rows.length === 0 ? (
        <p className="mt-6 text-muted text-sm">
          No activity reported yet. The device reports once it&apos;s paired and
          syncing.
        </p>
      ) : (
        <ul className="mt-6 space-y-1">
          {rows.map((r, i) => (
            <li
              key={i}
              className="flex gap-3 rounded-xl border border-line bg-white px-3 py-2"
            >
              <span className="text-lg leading-6">{r.icon}</span>
              <div className="min-w-0 flex-1">
                <div className="flex items-center justify-between gap-2">
                  <span className="font-medium text-sm">{r.title}</span>
                  <time className="text-xs text-muted shrink-0">
                    {new Date(r.at).toLocaleString()}
                  </time>
                </div>
                {r.detail && (
                  <p className="text-xs text-muted truncate">{r.detail}</p>
                )}
                {r.tag && (
                  <span className="inline-block mt-1 text-[11px] rounded bg-brand/10 text-brand px-1.5 py-0.5">
                    {r.tag}
                  </span>
                )}
              </div>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}
