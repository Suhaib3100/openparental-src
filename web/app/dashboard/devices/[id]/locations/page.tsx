'use client';

import Link from 'next/link';
import { useParams } from 'next/navigation';
import { useEffect, useState } from 'react';
import { locationHistory, type DeviceLocation } from '@/lib/api';

export default function LocationHistoryPage() {
  const params = useParams();
  const id = params.id as string;
  const [rows, setRows] = useState<DeviceLocation[] | null>(null);

  useEffect(() => {
    locationHistory(id, 100).then(setRows);
  }, [id]);

  return (
    <div className="max-w-2xl">
      <Link href={`/dashboard/devices/${id}`} className="text-sm text-brand">
        ← Device
      </Link>
      <h1 className="text-2xl font-semibold mt-2">Location history</h1>

      {rows == null ? (
        <p className="mt-6 text-muted">Loading…</p>
      ) : rows.length === 0 ? (
        <p className="mt-6 text-muted text-sm">No locations reported yet.</p>
      ) : (
        <ul className="mt-6 space-y-1">
          {rows.map((p, i) => (
            <li
              key={i}
              className="flex items-center justify-between rounded-xl border border-line bg-white px-3 py-2"
            >
              <a
                href={`https://www.google.com/maps/search/?api=1&query=${p.lat},${p.lng}`}
                target="_blank"
                rel="noopener noreferrer"
                className="text-sm text-brand font-mono"
              >
                {p.lat.toFixed(5)}, {p.lng.toFixed(5)}
                {p.accuracyM != null ? ` · ±${Math.round(p.accuracyM)}m` : ''}
              </a>
              <time className="text-xs text-muted">
                {p.occurredAt ? new Date(p.occurredAt).toLocaleString() : ''}
              </time>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}
