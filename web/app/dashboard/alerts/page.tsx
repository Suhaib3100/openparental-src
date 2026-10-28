'use client';

import { useEffect, useState } from 'react';
import { Alert, listAlerts, markAlertRead } from '@/lib/api';

export default function AlertsPage() {
  const [alerts, setAlerts] = useState<Alert[] | null>(null);

  useEffect(() => {
    listAlerts().then(setAlerts);
  }, []);

  async function markRead(id: string) {
    await markAlertRead(id);
    setAlerts((prev) =>
      prev?.map((a) =>
        a.id === id ? { ...a, readAt: new Date().toISOString(), read: true } : a,
      ) ??
      null,
    );
  }

  return (
    <div>
      <h1 className="text-2xl font-semibold">Alerts</h1>
      <p className="text-muted text-sm mt-1">Tamper, geofence, unblock requests, and more.</p>

      {alerts === null && <p className="mt-8 text-muted">Loading…</p>}

      <ul className="mt-8 space-y-3">
        {alerts?.map((a) => (
          <li
            key={a.id}
            className={`rounded-2xl border p-4 ${
              a.readAt || a.read ? 'border-line bg-white/60' : 'border-brand/30 bg-white'
            }`}
          >
            <div className="flex justify-between gap-2">
              <div>
                <p className="text-xs text-muted uppercase tracking-wide">{a.type}</p>
                <p className="font-medium">{a.title}</p>
                <p className="text-sm text-muted mt-1">{a.body}</p>
              </div>
              {!a.readAt && !a.read && (
                <button
                  type="button"
                  onClick={() => markRead(a.id)}
                  className="text-xs text-brand shrink-0 h-fit"
                >
                  Mark read
                </button>
              )}
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
}
