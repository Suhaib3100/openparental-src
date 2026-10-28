'use client';

import { useState } from 'react';
import { Pairing, createPairing } from '@/lib/api';

export default function PairPage() {
  const [pairing, setPairing] = useState<Pairing | null>(null);
  const [error, setError] = useState<string | null>(null);
  const [loading, setLoading] = useState(false);

  async function generate() {
    setLoading(true);
    setError(null);
    try {
      setPairing(await createPairing());
    } catch (e) {
      setError(e instanceof Error ? e.message : 'Failed');
    } finally {
      setLoading(false);
    }
  }

  return (
    <div>
      <h1 className="text-2xl font-semibold">Pair a child device</h1>
      <ol className="mt-4 text-sm text-muted list-decimal list-inside space-y-2 max-w-lg">
        <li>Install the child APK on the kid&apos;s Android phone.</li>
        <li>Generate a code below.</li>
        <li>In the child app, enter the backend URL and pairing code.</li>
      </ol>

      <button
        type="button"
        disabled={loading}
        onClick={generate}
        className="mt-8 rounded-2xl bg-brand text-white px-6 py-3 font-medium disabled:opacity-60"
      >
        {loading ? 'Creating…' : 'Generate pairing code'}
      </button>

      {error && (
        <p className="mt-4 text-sm text-alert">{error}</p>
      )}

      {pairing && (
        <div className="mt-8 rounded-3xl border border-line bg-white p-8 text-center">
          <p className="text-sm text-muted">Enter this code on the child device</p>
          <p className="text-4xl font-mono font-bold tracking-widest mt-4 text-brand">
            {pairing.code}
          </p>
          <p className="text-xs text-muted mt-4 break-all">
            QR token: {pairing.qrToken}
          </p>
        </div>
      )}
    </div>
  );
}
