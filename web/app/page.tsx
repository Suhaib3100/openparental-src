import Link from 'next/link';
import { downloads, site } from '@/lib/config';

export default function HomePage() {
  return (
    <div className="min-h-dvh flex flex-col">
      <header className="border-b border-line bg-white/80 backdrop-blur-sm sticky top-0 z-10">
        <div className="mx-auto max-w-5xl px-5 py-4 flex items-center justify-between gap-4">
          <div className="flex items-center gap-2 font-semibold text-brand">
            <span className="text-xl" aria-hidden>
              🛡️
            </span>
            {site.name}
          </div>
          <nav className="flex items-center gap-3 text-sm">
            <Link
              href="/login"
              className="rounded-full bg-brand px-4 py-2 text-white font-medium hover:opacity-90 transition"
            >
              Parent dashboard
            </Link>
          </nav>
        </div>
      </header>

      <main className="flex-1">
        <section className="mx-auto max-w-5xl px-5 pt-16 pb-12 text-center">
          <h1 className="text-4xl sm:text-5xl font-semibold tracking-tight text-ink">
            Two apps. One family.
          </h1>
          <p className="mt-4 text-lg text-muted max-w-2xl mx-auto">
            {site.tagline} Install the{' '}
            <strong className="font-medium text-ink">child app</strong> on your
            kid&apos;s Android phone. Manage everything from{' '}
            <strong className="font-medium text-ink">Android</strong> or{' '}
            <strong className="font-medium text-ink">Safari on iPhone</strong>{' '}
            via the web dashboard.
          </p>
        </section>

        <section className="mx-auto max-w-5xl px-5 pb-20 grid md:grid-cols-2 gap-6">
          <AppCard
            emoji="🧒"
            title="Child app"
            platform="Android only"
            description="Sideload on the kid device. Pairs with a code from the parent dashboard, then runs protection in the background."
            primaryHref={downloads.childApkUrl}
            primaryLabel="Download child APK"
            secondaryHref="https://github.com/abuzar310/openparental/blob/main/android-managed/README.md"
            secondaryLabel="Setup guide"
          />
          <AppCard
            emoji="👨‍👩‍👧"
            title="Parent"
            platform="Android app + Web (iPhone OK)"
            description="Use the Flutter parent APK on Android, or sign in on iPhone/iPad/desktop — same backend, no App Store required for testing."
            primaryHref="/login"
            primaryLabel="Open web dashboard"
            primaryInternal
            secondaryHref={downloads.parentApkUrl}
            secondaryLabel="Download parent APK (Android)"
          />
        </section>

        <section className="border-t border-line bg-white">
          <div className="mx-auto max-w-5xl px-5 py-12">
            <h2 className="text-xl font-semibold">iPhone parent?</h2>
            <p className="mt-2 text-muted max-w-2xl">
              There is no iOS parent app in the store yet — Apple requires a
              Mac, Xcode, and a developer account to ship one. For your private
              test, use the{' '}
              <Link href="/login" className="text-brand underline underline-offset-2">
                web dashboard
              </Link>{' '}
              in Safari (add to Home Screen for an app-like icon). The child app
              stays Android-only, same as FlashGet-style products.
            </p>
          </div>
        </section>
      </main>

      <footer className="border-t border-line py-8 text-center text-sm text-muted">
        <p>
          <a
            href="https://github.com/abuzar310/openparental"
            className="text-brand hover:underline"
          >
            OpenParental on GitHub
          </a>
        </p>
      </footer>
    </div>
  );
}

function AppCard({
  emoji,
  title,
  platform,
  description,
  primaryHref,
  primaryLabel,
  primaryInternal,
  secondaryHref,
  secondaryLabel,
}: {
  emoji: string;
  title: string;
  platform: string;
  description: string;
  primaryHref: string;
  primaryLabel: string;
  primaryInternal?: boolean;
  secondaryHref: string;
  secondaryLabel: string;
}) {
  const primaryClass =
    'block w-full text-center rounded-2xl bg-brand text-white py-3 font-medium hover:opacity-90 transition';
  return (
    <article className="rounded-3xl border border-line bg-white p-8 shadow-sm flex flex-col">
      <div className="text-4xl mb-4" aria-hidden>
        {emoji}
      </div>
      <h2 className="text-2xl font-semibold">{title}</h2>
      <p className="text-sm text-brand font-medium mt-1">{platform}</p>
      <p className="mt-4 text-muted flex-1">{description}</p>
      <div className="mt-8 flex flex-col gap-3">
        {primaryInternal ? (
          <Link href={primaryHref} className={primaryClass}>
            {primaryLabel}
          </Link>
        ) : (
          <a href={primaryHref} className={primaryClass}>
            {primaryLabel}
          </a>
        )}
        {secondaryHref.startsWith('/') ? (
          <Link
            href={secondaryHref}
            className="block w-full text-center rounded-2xl border border-line py-3 font-medium text-ink hover:bg-surface transition"
          >
            {secondaryLabel}
          </Link>
        ) : (
          <a
            href={secondaryHref}
            className="block w-full text-center rounded-2xl border border-line py-3 font-medium text-ink hover:bg-surface transition"
          >
            {secondaryLabel}
          </a>
        )}
      </div>
    </article>
  );
}
