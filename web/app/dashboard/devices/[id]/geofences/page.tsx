'use client';

import Link from 'next/link';
import { useParams } from 'next/navigation';
import { useEffect, useState } from 'react';
import {
  createGeofence,
  deleteGeofence,
  latestLocation,
  listGeofences,
  type Geofence,
} from '@/lib/api';

export default function GeofencesPage() {
  const params = useParams();
  const id = params.id as string;
  const [fences, setFences] = useState<Geofence[]>([]);
  const [loading, setLoading] = useState(true);
  const [name, setName] = useState('');
  const [lat, setLat] = useState('');
  const [lng, setLng] = useState('');
  const [radius, setRadius] = useState('200');
  const [busy, setBusy] = useState(false);
  const [message, setMessage] = useState<string | null>(null);

  async function refresh() {
    setFences(await listGeofences(id));
    setLoading(false);
  }
  useEffect(() => {
    refresh();
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [id]);

  async function useCurrent() {
    const loc = await latestLocation(id);
    if (loc) {
      setLat(String(loc.lat));
      setLng(String(loc.lng));
    } else {
      setMessage('No location reported yet to prefill.');
    }
  }

  async function add() {
    if (!name || !lat || !lng) {
      setMessage('Name, latitude and longitude required.');
      return;
    }
    setBusy(true);
    setMessage(null);
    try {
      await createGeofence(id, {
        name,
        lat: Number(lat),
        lng: Number(lng),
        radiusM: Number(radius) || 200,
      });
      setName('');
      setLat('');
      setLng('');
      await refresh();
    } catch (e) {
      setMessage(e instanceof Error ? e.message : 'Failed');
    } finally {
      setBusy(false);
    }
  }

  async function remove(gid: string) {
    await deleteGeofence(id, gid).catch(() => undefined);
    await refresh();
  }

  return (
    <div className="max-w-2xl">
      <Link href={`/dashboard/devices/${id}`} className="text-sm text-brand">
        ← Device
      </Link>
      <h1 className="text-2xl font-semibold mt-2">Geofences</h1>
      <p className="text-muted text-sm">
        Get an alert when the device enters or leaves a zone.
      </p>

      {message && (
        <p className="mt-4 text-sm rounded-xl bg-brand/10 text-brand px-3 py-2">
          {message}
        </p>
      )}

      <section className="mt-6 rounded-2xl border border-line bg-white p-5 space-y-3">
        <h2 className="font-semibold">Add a zone</h2>
        <input
          value={name}
          onChange={(e) => setName(e.target.value)}
          placeholder="Home, School…"
          className="w-full rounded-xl border border-line bg-white p-2 text-sm"
        />
        <div className="flex gap-2">
          <input
            value={lat}
            onChange={(e) => setLat(e.target.value)}
            placeholder="Latitude"
            className="flex-1 rounded-xl border border-line bg-white p-2 text-sm font-mono"
          />
          <input
            value={lng}
            onChange={(e) => setLng(e.target.value)}
            placeholder="Longitude"
            className="flex-1 rounded-xl border border-line bg-white p-2 text-sm font-mono"
          />
        </div>
        <div className="flex items-center gap-2">
          <input
            value={radius}
            onChange={(e) => setRadius(e.target.value)}
            type="number"
            className="w-24 rounded-xl border border-line bg-white p-2 text-sm"
          />
          <span className="text-xs text-muted">meters radius</span>
          <button
            type="button"
            onClick={useCurrent}
            className="ml-auto text-xs text-brand underline"
          >
            Use last known location
          </button>
        </div>
        <button
          type="button"
          disabled={busy}
          onClick={add}
          className="rounded-xl bg-brand text-white px-4 py-2 text-sm font-medium disabled:opacity-50"
        >
          {busy ? 'Adding…' : 'Add zone'}
        </button>
      </section>

      <section className="mt-6">
        <h2 className="font-semibold">Zones</h2>
        {loading ? (
          <p className="text-muted text-sm mt-2">Loading…</p>
        ) : fences.length === 0 ? (
          <p className="text-muted text-sm mt-2">No zones yet.</p>
        ) : (
          <ul className="mt-3 space-y-1">
            {fences.map((f) => (
              <li
                key={f.id}
                className="flex items-center justify-between rounded-xl border border-line bg-white px-3 py-2"
              >
                <div>
                  <p className="text-sm font-medium">{f.name}</p>
                  <p className="text-xs text-muted font-mono">
                    {f.lat.toFixed(4)}, {f.lng.toFixed(4)} · {Math.round(f.radiusM)}m
                  </p>
                </div>
                <button
                  type="button"
                  onClick={() => remove(f.id)}
                  className="text-xs text-alert"
                >
                  remove
                </button>
              </li>
            ))}
          </ul>
        )}
      </section>
    </div>
  );
}
