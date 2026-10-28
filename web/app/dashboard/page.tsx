'use client';

import Link from 'next/link';
import { useEffect, useState } from 'react';
import { Device, listDevices } from '@/lib/api';

export default function DashboardDevicesPage() {
  const [devices, setDevices] = useState<Device[] | null>(null);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    listDevices()
      .then(setDevices)
      .catch((e) => setError(e instanceof Error ? e.message : 'Failed to load'));
  }, []);

  return (
    <div>
      <h1 className="text-2xl font-semibold">Your devices</h1>
      <p className="text-muted mt-1 text-sm">
        Tap a device to lock, locate, or send commands.
      </p>

      {error && (
        <p className="mt-4 text-sm text-alert bg-red-50 rounded-xl px-3 py-2">
          {error}
        </p>
      )}

      {devices === null && !error && (
        <p className="mt-8 text-muted">Loading devices…</p>
      )}

      {devices?.length === 0 && (
        <div className="mt-8 rounded-2xl border border-line bg-white p-6">
          <p className="font-medium">No child device yet</p>
          <p className="text-sm text-muted mt-2">
            Create a pairing code and enter it in the child Android app.
          </p>
          <Link
            href="/dashboard/pair"
            className="inline-block mt-4 rounded-xl bg-brand text-white px-4 py-2 text-sm font-medium"
          >
            Pair a device
          </Link>
        </div>
      )}

      <ul className="mt-8 space-y-3">
        {devices?.map((d) => (
          <li key={d.id}>
            <Link
              href={`/dashboard/devices/${d.id}`}
              className="block rounded-2xl border border-line bg-white p-5 hover:border-brand/40 transition"
            >
              <div className="flex items-center justify-between gap-4">
                <div>
                  <p className="font-semibold">{d.name}</p>
                  <p className="text-sm text-muted">
                    {d.model ?? 'Android'} · {d.status}
                    {d.batteryPct != null ? ` · ${d.batteryPct}%` : ''}
                  </p>
                </div>
                <span
                  className={`text-xs font-medium px-2 py-1 rounded-full ${
                    d.status === 'ONLINE'
                      ? 'bg-green-100 text-green-800'
                      : 'bg-stone-100 text-stone-600'
                  }`}
                >
                  {d.status}
                </span>
              </div>
            </Link>
          </li>
        ))}
      </ul>
    </div>
  );
}
