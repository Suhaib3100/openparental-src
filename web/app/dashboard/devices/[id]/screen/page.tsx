'use client';

import Link from 'next/link';
import { useParams, useSearchParams } from 'next/navigation';
import { useEffect, useRef, useState } from 'react';
import { io, type Socket } from 'socket.io-client';
import { apiBaseUrl } from '@/lib/config';
import { createScreenSession, getAccessToken } from '@/lib/api';

type Phase = 'requesting' | 'waiting' | 'live' | 'ended' | 'error';

/**
 * Web screen viewer. Creates a session (screenshot = one frame, mirror =
 * continuous) and renders JPEG frames relayed over the /screen Socket.IO
 * namespace. Requires the dashboard to point at the realtime (NestJS) backend.
 */
export default function ScreenViewerPage() {
  const params = useParams();
  const search = useSearchParams();
  const id = params.id as string;
  const mode = search.get('mode') === 'mirror' ? 'mirror' : 'screenshot';

  const [phase, setPhase] = useState<Phase>('requesting');
  const [error, setError] = useState<string | null>(null);
  const [frame, setFrame] = useState<string | null>(null);
  const socketRef = useRef<Socket | null>(null);

  useEffect(() => {
    let cancelled = false;
    const token = getAccessToken();
    if (!token) {
      setPhase('error');
      setError('Not signed in');
      return;
    }

    (async () => {
      try {
        const session = await createScreenSession(id, mode);
        if (cancelled) return;
        const base = apiBaseUrl || window.location.origin;
        const socket = io(`${base}/screen`, {
          transports: ['websocket'],
          auth: { token },
        });
        socketRef.current = socket;

        socket.on('connect', () => socket.emit('join', { sessionId: session.id }));
        socket.on('session_ready', () => !cancelled && setPhase('waiting'));
        socket.on('frame', (p: { data?: string }) => {
          if (cancelled || !p?.data) return;
          setFrame(`data:image/jpeg;base64,${p.data}`);
          setPhase('live');
        });
        socket.on('session_ended', () => !cancelled && setPhase('ended'));
        socket.on('connect_error', () => {
          if (cancelled) return;
          setPhase('error');
          setError('Realtime server unreachable (needs NestJS backend).');
        });
      } catch (e) {
        if (cancelled) return;
        setPhase('error');
        setError(e instanceof Error ? e.message : 'Failed to start');
      }
    })();

    return () => {
      cancelled = true;
      socketRef.current?.disconnect();
      socketRef.current = null;
    };
  }, [id, mode]);

  return (
    <div className="max-w-xl">
      <Link href={`/dashboard/devices/${id}`} className="text-sm text-brand">
        ← Device
      </Link>
      <h1 className="text-2xl font-semibold mt-2">
        {mode === 'mirror' ? 'Live screen' : 'Screenshot'}
      </h1>

      <div className="mt-6 rounded-2xl border border-line bg-black/90 aspect-[9/16] overflow-hidden flex items-center justify-center">
        {frame ? (
          // eslint-disable-next-line @next/next/no-img-element
          <img src={frame} alt="device screen" className="w-full h-full object-contain" />
        ) : (
          <p className="text-white/70 text-sm px-4 text-center">
            {phase === 'error'
              ? (error ?? 'Error')
              : mode === 'mirror'
                ? 'Waiting for the device to start streaming…'
                : 'Capturing…'}
          </p>
        )}
      </div>

      {phase === 'ended' && (
        <p className="mt-3 text-sm text-muted">Session ended.</p>
      )}
    </div>
  );
}
