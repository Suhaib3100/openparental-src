import Link from 'next/link';
import { SiteShell } from '@/components/site/site-chrome';
import { AppShowcase } from '@/components/marketing/app-previews';
import { featureHighlights, setupOverview, setupSteps } from '@/lib/setup-content';

export const metadata = {
  title: 'Setup guide — OpenParental',
  description:
    'Step-by-step: parent account, install APKs from our site, pair the child phone, permissions, and daily use.',
};

export default function SetupPage() {
  return (
    <SiteShell>
      <main>
        <section className="bg-gradient-to-b from-[#E3EEEC] to-surface border-b border-line">
          <div className="mx-auto max-w-3xl px-5 py-14 text-center">
            <p className="text-sm font-medium text-brand uppercase tracking-wider">Setup guide</p>
            <h1 className="mt-3 text-4xl font-semibold tracking-tight">{setupOverview.title}</h1>
            <p className="mt-4 text-lg text-muted">{setupOverview.subtitle}</p>
            <p className="mt-2 text-sm text-muted">{setupOverview.time}</p>
            <div className="mt-8 flex flex-wrap justify-center gap-3">
              <Link
                href="/login"
                className="rounded-full bg-brand text-white px-6 py-3 font-medium hover:opacity-90"
              >
                Create parent account
              </Link>
              <Link
                href="/download"
                className="rounded-full border border-line bg-white px-6 py-3 font-medium hover:bg-surface"
              >
                Get APKs
              </Link>
            </div>
          </div>
        </section>

        <section className="mx-auto max-w-3xl px-5 py-12">
          <h2 className="text-lg font-semibold">What you need</h2>
          <ul className="mt-4 space-y-2">
            {setupOverview.youNeed.map((item) => (
              <li key={item} className="flex gap-3 text-muted">
                <span className="text-brand font-bold" aria-hidden>
                  ✓
                </span>
                {item}
              </li>
            ))}
          </ul>
        </section>

        <section className="mx-auto max-w-3xl px-5 pb-16 space-y-12">
          {setupSteps.map((step) => (
            <article
              key={step.id}
              id={step.id}
              className="scroll-mt-28 rounded-3xl border border-line bg-white p-8 shadow-sm"
            >
              <h2 className="text-2xl font-semibold">{step.title}</h2>
              <p className="mt-2 text-brand font-medium">{step.summary}</p>
              <ul className="mt-6 space-y-3 text-muted list-disc pl-5">
                {step.body.map((p) => (
                  <li key={p}>{p}</li>
                ))}
              </ul>
              {step.tips?.length ? (
                <div className="mt-6 rounded-2xl bg-[#E3EEEC]/60 border border-brand/10 px-4 py-3 text-sm">
                  <p className="font-medium text-brand">Tip</p>
                  <ul className="mt-2 space-y-1 text-muted">
                    {step.tips.map((t) => (
                      <li key={t}>{t}</li>
                    ))}
                  </ul>
                </div>
              ) : null}
            </article>
          ))}
        </section>

        <section className="border-t border-line bg-white py-16 px-5">
          <div className="mx-auto max-w-6xl">
            <h2 className="text-2xl font-semibold text-center mb-4">Why parents like the UI</h2>
            <p className="text-center text-muted max-w-2xl mx-auto mb-10">
              Warm, calm, and obvious — designed for stress-free checks on your kid&apos;s phone.
            </p>
            <div className="grid sm:grid-cols-2 lg:grid-cols-3 gap-4">
              {featureHighlights.map((f) => (
                <div key={f.title} className="rounded-2xl border border-line p-5 bg-surface">
                  <span className="text-2xl" aria-hidden>
                    {f.icon}
                  </span>
                  <h3 className="mt-3 font-semibold">{f.title}</h3>
                  <p className="mt-2 text-sm text-muted">{f.description}</p>
                </div>
              ))}
            </div>
          </div>
        </section>

        <section className="py-20 px-5 bg-surface border-t border-line">
          <div className="mx-auto max-w-6xl">
            <AppShowcase />
          </div>
        </section>
      </main>
    </SiteShell>
  );
}
