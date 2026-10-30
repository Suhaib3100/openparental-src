'use client';

import Link from 'next/link';
import { useParams } from 'next/navigation';
import { useState } from 'react';
import { aiReport } from '@/lib/api';

export default function AiReportPage() {
  const params = useParams();
  const id = params.id as string;
  const [report, setReport] = useState<string | null>(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);

  async function run() {
    setLoading(true);
    setError(null);
    try {
      const r = await aiReport(id);
      setReport(r.report);
    } catch (e) {
      setError(
        e instanceof Error ? e.message : 'Could not generate the report.',
      );
    } finally {
      setLoading(false);
    }
  }

  return (
    <div className="max-w-2xl">
      <Link href={`/dashboard/devices/${id}`} className="text-sm text-brand">
        ← Device
      </Link>
      <h1 className="text-2xl font-semibold mt-2">AI usage report</h1>
      <p className="text-muted text-sm">
        A short, plain-language summary of recent activity, generated from the
        data this device has reported.
      </p>

      <button
        type="button"
        onClick={run}
        disabled={loading}
        className="mt-6 rounded-2xl bg-brand text-white px-6 py-3 font-medium disabled:opacity-50"
      >
        {loading ? 'Analyzing…' : report ? 'Regenerate' : 'Generate report'}
      </button>

      {error && (
        <p className="mt-4 text-sm rounded-xl bg-alert/10 text-alert px-3 py-2">
          {error}
        </p>
      )}

      {report && (
        <article className="mt-6 rounded-2xl border border-line bg-white p-5 whitespace-pre-wrap text-sm leading-relaxed">
          {report}
        </article>
      )}
    </div>
  );
}
