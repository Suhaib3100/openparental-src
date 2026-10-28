import Link from 'next/link';
import { AppShowcase } from '@/components/marketing/app-previews';
import { SiteShell } from '@/components/site/site-chrome';
import { featureHighlights } from '@/lib/setup-content';
import { site } from '@/lib/config';

export default function HomePage() {
  return (
    <SiteShell>
      <main>
        <section className="relative overflow-hidden border-b border-line">
          <div className="absolute inset-0 bg-gradient-to-br from-[#E3EEEC] via-surface to-surface pointer-events-none" />
          <div className="relative mx-auto max-w-6xl px-5 pt-16 pb-20 text-center">
            <p className="inline-flex items-center gap-2 rounded-full bg-white/80 border border-line px-4 py-1.5 text-sm text-muted">
              <span className="w-2 h-2 rounded-full bg-[#2E9E6B]" aria-hidden />
              Private cloud · Vercel + Supabase
            </p>
            <h1 className="mt-6 text-4xl sm:text-6xl font-semibold tracking-tight text-ink max-w-4xl mx-auto leading-tight">
              The family safety stack you host — with apps that look the part
            </h1>
            <p className="mt-6 text-lg sm:text-xl text-muted max-w-2xl mx-auto">
              {site.tagline} Set up once on this site, install from our download page, and manage
              from Android or iPhone — no GitHub detours.
            </p>
            <div className="mt-10 flex flex-wrap justify-center gap-4">
              <Link
                href="/setup"
                className="rounded-full bg-brand text-white px-8 py-3.5 font-medium text-lg hover:opacity-90 shadow-lg shadow-brand/20"
              >
                Start setup guide
              </Link>
              <Link
                href="/login"
                className="rounded-full bg-white border border-line px-8 py-3.5 font-medium text-lg hover:bg-surface"
              >
                Parent dashboard
              </Link>
            </div>
          </div>
        </section>

        <section className="mx-auto max-w-6xl px-5 py-16">
          <div className="grid md:grid-cols-3 gap-6">
            <StepCard
              step="1"
              title="Create account"
              body="Register on the web dashboard — works on iPhone Safari and desktop."
              href="/login"
              link="Sign in"
            />
            <StepCard
              step="2"
              title="Install & pair"
              body="Download APKs here, enter the pairing code on the child phone."
              href="/download"
              link="Downloads"
            />
            <StepCard
              step="3"
              title="Supervise"
              body="Notice feed, device tools, lock & location — parent app or web."
              href="/setup#daily"
              link="Daily use"
            />
          </div>
        </section>

        <section className="bg-white border-y border-line py-16 px-5">
          <div className="mx-auto max-w-6xl">
            <h2 className="text-3xl font-semibold text-center">Everything in one private stack</h2>
            <p className="text-center text-muted mt-3 max-w-2xl mx-auto">
              Not a link farm — real supervision features with a polished parent and child experience.
            </p>
            <div className="mt-12 grid sm:grid-cols-2 lg:grid-cols-3 gap-5">
              {featureHighlights.map((f) => (
                <div
                  key={f.title}
                  className="rounded-2xl border border-line p-6 hover:border-brand/30 transition"
                >
                  <span className="text-2xl">{f.icon}</span>
                  <h3 className="mt-3 font-semibold">{f.title}</h3>
                  <p className="mt-2 text-sm text-muted">{f.description}</p>
                </div>
              ))}
            </div>
          </div>
        </section>

        <section className="py-20 px-5 bg-surface">
          <div className="mx-auto max-w-6xl">
            <AppShowcase />
          </div>
        </section>

        <section className="bg-brand text-white py-16 px-5">
          <div className="mx-auto max-w-3xl text-center">
            <h2 className="text-3xl font-semibold">Ready when you are</h2>
            <p className="mt-4 text-white/85 text-lg">
              Walk through pairing, permissions, and daily checks with our on-site guide — written
              for your family, not for open-source tourists.
            </p>
            <Link
              href="/setup"
              className="inline-block mt-8 rounded-full bg-white text-brand px-8 py-3.5 font-semibold hover:bg-white/90"
            >
              Open the setup guide
            </Link>
          </div>
        </section>
      </main>
    </SiteShell>
  );
}

function StepCard({
  step,
  title,
  body,
  href,
  link,
}: {
  step: string;
  title: string;
  body: string;
  href: string;
  link: string;
}) {
  return (
    <article className="rounded-3xl border border-line bg-white p-7 shadow-sm">
      <span className="text-sm font-bold text-brand">Step {step}</span>
      <h3 className="mt-2 text-xl font-semibold">{title}</h3>
      <p className="mt-3 text-muted text-sm">{body}</p>
      <Link href={href} className="inline-block mt-5 text-sm font-semibold text-brand hover:underline">
        {link} →
      </Link>
    </article>
  );
}
