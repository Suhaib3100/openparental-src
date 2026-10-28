'use client';

import { useState } from 'react';

function PhoneFrame({
  label,
  children,
  className = '',
}: {
  label: string;
  children: React.ReactNode;
  className?: string;
}) {
  return (
    <div className={`flex flex-col items-center ${className}`}>
      <div className="relative w-[260px] sm:w-[280px]">
        <div className="rounded-[2.25rem] border-[10px] border-ink/90 bg-ink/90 shadow-xl shadow-brand/10 p-1">
          <div className="rounded-[1.65rem] overflow-hidden bg-surface min-h-[480px] flex flex-col">
            <div className="h-7 bg-ink/90 flex items-center justify-center">
              <div className="w-20 h-1 rounded-full bg-white/20" />
            </div>
            {children}
          </div>
        </div>
      </div>
      <p className="mt-4 text-sm font-medium text-muted">{label}</p>
    </div>
  );
}

export function ChildAppPreview() {
  return (
    <PhoneFrame label="Child app · Android">
      <div className="px-5 pt-3 pb-6 flex-1 flex flex-col">
        <p className="text-center text-xs text-muted tracking-wide">OpenParental</p>
        <div className="mt-4 rounded-3xl bg-[#E3EEEC] p-6 text-center flex-1">
          <div className="mx-auto w-16 h-16 rounded-full bg-white flex items-center justify-center text-3xl shadow-sm">
            ✓
          </div>
          <h3 className="mt-4 text-xl font-semibold text-ink">Protected & online</h3>
          <p className="mt-2 text-sm text-muted leading-relaxed">
            Your parent can see this device and help keep you safe.
          </p>
          <div className="mt-6 grid grid-cols-2 gap-2 text-left text-xs">
            <StatChip label="Battery" value="78%" />
            <StatChip label="Last sync" value="Just now" />
            <StatChip label="Policy" value="Active" />
            <StatChip label="Supervisor" value="Running" />
          </div>
        </div>
        <div className="mt-4 space-y-2">
          <Row icon="🔒" title="Screen limits" sub="Enforced when parent sets rules" />
          <Row icon="📍" title="Location" sub="Shared with your family only" />
        </div>
      </div>
    </PhoneFrame>
  );
}

function StatChip({ label, value }: { label: string; value: string }) {
  return (
    <div className="rounded-xl bg-white/80 px-3 py-2 border border-line">
      <p className="text-muted">{label}</p>
      <p className="font-semibold text-ink">{value}</p>
    </div>
  );
}

function Row({ icon, title, sub }: { icon: string; title: string; sub: string }) {
  return (
    <div className="flex gap-3 rounded-2xl bg-white border border-line px-3 py-2.5">
      <span className="text-lg" aria-hidden>
        {icon}
      </span>
      <div>
        <p className="text-sm font-medium">{title}</p>
        <p className="text-xs text-muted">{sub}</p>
      </div>
    </div>
  );
}

const parentTabs = ['Notice', 'Device', 'Me'] as const;

export function ParentAppPreview() {
  const [tab, setTab] = useState<(typeof parentTabs)[number]>('Device');

  return (
    <PhoneFrame label="Parent app · Android">
      <div className="flex-1 flex flex-col bg-surface">
        <div className="bg-gradient-to-br from-brand to-[#0d4a46] text-white px-5 pt-4 pb-8 rounded-b-3xl">
          <p className="text-white/80 text-xs">Device</p>
          <h3 className="text-lg font-semibold mt-1">Jamie&apos;s Pixel</h3>
          <p className="text-sm text-white/85 mt-1 flex items-center gap-2">
            <span className="w-2 h-2 rounded-full bg-[#2E9E6B]" />
            Online · 78% battery
          </p>
        </div>
        <div className="px-4 -mt-4 flex-1">
          {tab === 'Notice' && (
            <Panel>
              <AlertRow title="Unblock request" body="YouTube — homework video" time="2m ago" />
              <AlertRow title="Geofence" body="Left Home zone" time="1h ago" />
            </Panel>
          )}
          {tab === 'Device' && (
            <Panel>
              <FeatureGrid />
            </Panel>
          )}
          {tab === 'Me' && (
            <Panel>
              <p className="text-sm text-muted">Signed in as parent@family.com</p>
              <p className="mt-3 text-xs font-mono bg-neutral-100 rounded-lg px-2 py-2 break-all">
                openparental.vercel.app
              </p>
            </Panel>
          )}
        </div>
        <nav className="border-t border-line bg-white flex justify-around py-2 text-[11px]">
          {parentTabs.map((t) => (
            <button
              key={t}
              type="button"
              onClick={() => setTab(t)}
              className={`flex flex-col items-center gap-0.5 px-3 py-1 rounded-lg transition ${
                tab === t ? 'text-brand font-semibold bg-brand/10' : 'text-muted'
              }`}
            >
              <span aria-hidden>{t === 'Notice' ? '🔔' : t === 'Device' ? '📱' : '👤'}</span>
              {t}
            </button>
          ))}
        </nav>
      </div>
    </PhoneFrame>
  );
}

function Panel({ children }: { children: React.ReactNode }) {
  return (
    <div className="rounded-2xl bg-white border border-line shadow-sm p-3 space-y-2">{children}</div>
  );
}

function AlertRow({ title, body, time }: { title: string; body: string; time: string }) {
  return (
    <div className="rounded-xl bg-surface px-3 py-2.5">
      <div className="flex justify-between gap-2">
        <p className="text-sm font-medium">{title}</p>
        <span className="text-[10px] text-muted shrink-0">{time}</span>
      </div>
      <p className="text-xs text-muted mt-0.5">{body}</p>
    </div>
  );
}

function FeatureGrid() {
  const items = [
    ['📍', 'Location'],
    ['🔒', 'Lock now'],
    ['📸', 'Snapshot'],
    ['🖥️', 'Live view'],
    ['⏱️', 'Screen time'],
    ['🚫', 'Blocked apps'],
  ];
  return (
    <div className="grid grid-cols-3 gap-2">
      {items.map(([icon, label]) => (
        <div
          key={label}
          className="rounded-xl bg-surface border border-line py-3 flex flex-col items-center gap-1 text-center"
        >
          <span className="text-lg">{icon}</span>
          <span className="text-[10px] font-medium leading-tight px-1">{label}</span>
        </div>
      ))}
    </div>
  );
}

export function WebDashboardPreview() {
  return (
    <div className="rounded-2xl border border-line bg-white shadow-lg overflow-hidden max-w-md mx-auto">
      <div className="bg-brand text-white px-5 py-4 flex justify-between items-center">
        <span className="font-semibold">OpenParental</span>
        <span className="text-xs bg-white/15 rounded-full px-2 py-0.5">Web</span>
      </div>
      <div className="p-5 bg-surface">
        <h3 className="text-lg font-semibold">Your devices</h3>
        <p className="text-sm text-muted mt-1">Same account as the Android parent app.</p>
        <div className="mt-4 rounded-2xl border border-line bg-white p-4 flex justify-between items-center">
          <div>
            <p className="font-semibold">Jamie&apos;s Pixel</p>
            <p className="text-sm text-muted">Android · ONLINE</p>
          </div>
          <span className="text-xs font-medium text-[#2E9E6B] bg-[#E6F3EB] px-2 py-1 rounded-full">
            Live
          </span>
        </div>
        <div className="mt-3 flex gap-2">
          <span className="text-xs rounded-lg bg-brand text-white px-3 py-2 font-medium">Pair device</span>
          <span className="text-xs rounded-lg border border-line px-3 py-2">Alerts</span>
        </div>
      </div>
    </div>
  );
}

export function AppShowcase() {
  return (
    <section id="apps" className="scroll-mt-24">
      <div className="text-center max-w-2xl mx-auto mb-12">
        <h2 className="text-3xl font-semibold tracking-tight">Built to feel familiar</h2>
        <p className="mt-3 text-muted text-lg">
          Calm teal branding on every surface. Parent flows follow the Notice · Device · Me pattern
          you expect from leading family apps — without sending you elsewhere for help.
        </p>
      </div>
      <div className="flex flex-wrap justify-center gap-10 lg:gap-14 items-start">
        <ChildAppPreview />
        <ParentAppPreview />
      </div>
      <div className="mt-16 max-w-lg mx-auto">
        <p className="text-center text-sm font-medium text-muted mb-4">iPhone & desktop parents</p>
        <WebDashboardPreview />
      </div>
    </section>
  );
}
