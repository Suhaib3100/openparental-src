'use client';

import Link from 'next/link';
import { useParams } from 'next/navigation';
import { useEffect, useState } from 'react';
import {
  Device,
  DeviceLocation,
  latestLocation,
  listDevices,
  sendCommand,
} from '@/lib/api';

export default function DeviceDetailPage() {
  const params = useParams();
  const id = params.id as string;
  const [device, setDevice] = useState<Device | null>(null);
  const [loc, setLoc] = useState<DeviceLocation | null>(null);
  const [message, setMessage] = useState<string | null>(null);
  const [busy, setBusy] = useState(false);

  useEffect(() => {
    listDevices().then((list) => setDevice(list.find((d) => d.id === id) ?? null));
    latestLocation(id).then(setLoc);
  }, [id]);

  async function runCommand(type: string, label: string) {
    setBusy(true);
    setMessage(null);
    try {
      await sendCommand(id, type);
      setMessage(`${label} sent`);
    } catch (e) {
      setMessage(e instanceof Error ? e.message : 'Command failed');
    } finally {
      setBusy(false);
    }
  }

  if (!device) {
    return (
      <p className="text-muted">
        <Link href="/dashboard" className="text-brand">
          ← Back
        </Link>
        {' · '}
        Loading…
      </p>
    );
  }

  const mapsUrl =
    loc != null
      ? `https://www.google.com/maps/search/?api=1&query=${loc.lat},${loc.lng}`
      : null;

  return (
    <div>
      <Link href="/dashboard" className="text-sm text-brand">
        ← Devices
      </Link>
      <h1 className="text-2xl font-semibold mt-2">{device.name}</h1>
      <p className="text-muted text-sm">{device.status}</p>

      {message && (
        <p className="mt-4 text-sm rounded-xl bg-brand/10 text-brand px-3 py-2">
          {message}
        </p>
      )}

      <div className="mt-8 grid sm:grid-cols-2 gap-3">
        <ActionButton
          disabled={busy}
          onClick={() => runCommand('LOCK', 'Lock')}
          label="Lock now"
        />
        <ActionButton
          disabled={busy}
          onClick={() => runCommand('PING', 'Ping')}
          label="Ping"
        />
        <ActionButton
          disabled={busy}
          onClick={() => runCommand('REQUEST_LOCATION', 'Location request')}
          label="Request location"
        />
        <ActionButton
          disabled={busy}
          onClick={() => runCommand('SCREEN_MIRROR', 'Live screen')}
          label="Live screen (child must grant)"
        />
      </div>

      <section className="mt-10 rounded-2xl border border-line bg-white p-5">
        <h2 className="font-semibold">Latest location</h2>
        {loc ? (
          <>
            <p className="text-sm text-muted mt-2 font-mono">
              {loc.lat.toFixed(5)}, {loc.lng.toFixed(5)}
              {loc.accuracyM != null ? ` · ±${Math.round(loc.accuracyM)}m` : ''}
            </p>
            {mapsUrl && (
              <a
                href={mapsUrl}
                target="_blank"
                rel="noopener noreferrer"
                className="inline-block mt-3 text-sm text-brand underline"
              >
                Open in Google Maps
              </a>
            )}
          </>
        ) : (
          <p className="text-sm text-muted mt-2">No location reported yet.</p>
        )}
      </section>

      <p className="mt-8 text-xs text-muted">
        Advanced policy editing and live JPEG mirror work best in the Android
        parent app today; web covers daily controls from iPhone.
      </p>
    </div>
  );
}

function ActionButton({
  label,
  onClick,
  disabled,
}: {
  label: string;
  onClick: () => void;
  disabled: boolean;
}) {
  return (
    <button
      type="button"
      disabled={disabled}
      onClick={onClick}
      className="rounded-2xl border border-line bg-white py-3 font-medium hover:border-brand/40 disabled:opacity-50"
    >
      {label}
    </button>
  );
}
