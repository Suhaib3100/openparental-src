'use client';

import Link from 'next/link';
import { useRouter } from 'next/navigation';
import { FormEvent, useState } from 'react';
import { login, register } from '@/lib/api';
import { apiBaseUrl } from '@/lib/config';

export default function LoginPage() {
  const router = useRouter();
  const [mode, setMode] = useState<'login' | 'register'>('login');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [familyName, setFamilyName] = useState('');
  const [error, setError] = useState<string | null>(null);
  const [loading, setLoading] = useState(false);

  async function onSubmit(e: FormEvent) {
    e.preventDefault();
    setError(null);
    setLoading(true);
    try {
      if (mode === 'login') {
        await login(email.trim(), password);
      } else {
        await register(
          email.trim(),
          password,
          familyName.trim() || undefined,
        );
      }
      router.replace('/dashboard');
    } catch (err) {
      setError(err instanceof Error ? err.message : 'Something went wrong');
    } finally {
      setLoading(false);
    }
  }

  return (
    <div className="min-h-dvh flex flex-col">
      <header className="border-b border-line bg-white/80 px-5 py-4">
        <Link href="/" className="text-brand font-semibold">
          ← {`OpenParental`}
        </Link>
      </header>
      <main className="flex-1 flex items-center justify-center px-5 py-12">
        <div className="w-full max-w-md rounded-3xl border border-line bg-white p-8 shadow-sm">
          <h1 className="text-2xl font-semibold text-center">Parent dashboard</h1>
          <p className="text-center text-sm text-muted mt-2">
            Works in Safari on iPhone — same account as the Android parent app.
          </p>
          <p className="text-center text-xs text-muted mt-1 font-mono">
            API: {apiBaseUrl}
          </p>

          <form onSubmit={onSubmit} className="mt-8 space-y-4">
            {mode === 'register' && (
              <label className="block text-sm">
                <span className="text-muted">Family name (optional)</span>
                <input
                  className="mt-1 w-full rounded-xl border border-line px-3 py-2.5"
                  value={familyName}
                  onChange={(e) => setFamilyName(e.target.value)}
                  autoComplete="organization"
                />
              </label>
            )}
            <label className="block text-sm">
              <span className="text-muted">Email</span>
              <input
                type="email"
                required
                className="mt-1 w-full rounded-xl border border-line px-3 py-2.5"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                autoComplete="email"
              />
            </label>
            <label className="block text-sm">
              <span className="text-muted">Password</span>
              <input
                type="password"
                required
                minLength={8}
                className="mt-1 w-full rounded-xl border border-line px-3 py-2.5"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                autoComplete={
                  mode === 'login' ? 'current-password' : 'new-password'
                }
              />
            </label>
            {error && (
              <p className="text-sm text-alert bg-red-50 rounded-xl px-3 py-2">
                {error}
              </p>
            )}
            <button
              type="submit"
              disabled={loading}
              className="w-full rounded-2xl bg-brand text-white py-3 font-medium disabled:opacity-60"
            >
              {loading
                ? 'Please wait…'
                : mode === 'login'
                  ? 'Sign in'
                  : 'Create account'}
            </button>
          </form>

          <button
            type="button"
            className="mt-4 w-full text-sm text-brand"
            onClick={() =>
              setMode((m) => (m === 'login' ? 'register' : 'login'))
            }
          >
            {mode === 'login'
              ? 'Need an account? Register'
              : 'Already have an account? Sign in'}
          </button>
        </div>
      </main>
    </div>
  );
}
