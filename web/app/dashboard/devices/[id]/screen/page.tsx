'use client';

import Link from 'next/link';
import { useParams, useSearchParams } from 'next/navigation';
import { useEffect, useRef, useState } from 'react';
import { io, type Socket } from 'socket.io-client';
import { apiBaseUrl } from '@/lib/config';
import {
  createScreenSession,
  getAccessToken,
  getScreenFrame,
} from '@/lib/api';

type Phase = 'requesting' | 'waiting' | 'live' | 'ended' | 'error';

/**
 * Screen viewer: creates a session, then receives JPEG frames via HTTP poll
 * (Vercel/serverless) or Socket.IO when NestJS realtime is available.
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
  const pollRef = useRef<ReturnType<typeof setInterval> | null>(null);
  const sessionIdRef = useRef<string | null>(null);

  useEffect(() => {
    let cancelled = false;
    const token = getAccessToken();
    if (!token) {
      setPhase('error');
      setError('Not signed in');
      return;
    }

    function stopPoll() {
      if (pollRef.current) {
        clearInterval(pollRef.current);
        pollRef.current = null;
      }
    }

    function startPoll(sessionId: string) {
      stopPoll();
      let lastTs: number | null = null;
      pollRef.current = setInterval(async () => {
        if (cancelled) return;
        try {
          const snap = await getScreenFrame(sessionId);
          if (cancelled) return;
          if (snap.status === 'ended' || snap.status === 'denied') {
            setPhase('ended');
            stopPoll();
            return;
          }
          if (snap.data && snap.ts != null && snap.ts !== lastTs) {
            lastTs = snap.ts;
            setFrame(`data:image/jpeg;base64,${snap.data}`);
            setPhase('live');
            if (mode === 'screenshot') stopPoll();
          }
        } catch {
          /* keep polling */
        }
      }, 700);
    }

    (async () => {
      try {
        const session = await createScreenSession(id, mode);
        if (cancelled) return;
        sessionIdRef.current = session.id;
        setPhase('waiting');
        startPoll(session.id);

        const base = apiBaseUrl || window.location.origin;
        const socket = io(`${base}/screen`, {
          transports: ['websocket', 'polling'],
          auth: { token },
          timeout: 4000,
          reconnection: false,
        });
        socketRef.current = socket;

        socket.on('connect', () => {
          socket.emit('join', { sessionId: session.id });
        });
        socket.on('frame', (p: { data?: string }) => {
          if (cancelled || !p?.data) return;
          setFrame(`data:image/jpeg;base64,${p.data}`);
          setPhase('live');
          if (mode === 'screenshot') {
            stopPoll();
            socket.disconnect();
          }
        });
        socket.on('session_ended', () => !cancelled && setPhase('ended'));
        socket.on('connect_error', () => {
          /* HTTP poll already running */
        });
      } catch (e) {
        if (cancelled) return;
        setPhase('error');
        setError(e instanceof Error ? e.message : 'Failed to start');
      }
    })();

    return () => {
      cancelled = true;
      stopPoll();
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
      <p className="text-sm text-muted mt-1">
        Accessibility capture — no system screen-share banner. Updates about once
        per second.
      </p>

      <div className="mt-6 rounded-2xl border border-line bg-black/90 aspect-[9/16] overflow-hidden flex items-center justify-center">
        {frame ? (
          // eslint-disable-next-line @next/next/no-img-element
          <img src={frame} alt="device screen" className="w-full h-full object-contain" />
        ) : (
          <p className="text-white/70 text-sm px-4 text-center">
            {phase === 'error'
              ? (error ?? 'Error')
              : mode === 'mirror'
                ? 'Waiting for frames from the device…'
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
