import Link from 'next/link';
import { DownloadCard } from '@/components/marketing/download-card';
import { SiteShell } from '@/components/site/site-chrome';
import { apkDownloadMeta, downloads, site } from '@/lib/config';

export const metadata = {
  title: 'Download apps — OpenParental',
  description: 'Install child and parent Android apps directly from OpenParental — no GitHub redirects.',
};

export default function DownloadPage() {
  return (
    <SiteShell>
      <main className="mx-auto max-w-3xl px-5 py-14">
        <p className="text-sm text-brand font-medium">Install</p>
        <h1 className="mt-2 text-4xl font-semibold tracking-tight">Download from us</h1>
        <p className="mt-4 text-lg text-muted">
          Install both apps from this page on the Android phone. You do not need Android Studio or an
          emulator — those use several GB of RAM and can freeze the PC. If a build is not uploaded yet,
          the button will tell you — use the{' '}
          <Link href="/setup" className="text-brand underline underline-offset-2">
            setup guide
          </Link>{' '}
          in the meantime.
        </p>

        <div className="mt-10 space-y-4">
          <DownloadCard
            title={apkDownloadMeta.child.title}
            description={apkDownloadMeta.child.description}
            href={downloads.childApkUrl}
            cta="Download child APK"
          />
          <DownloadCard
            title={apkDownloadMeta.parent.title}
            description={apkDownloadMeta.parent.description}
            href={downloads.parentApkUrl}
            cta="Download parent APK"
          />
          <DownloadCard
            title={apkDownloadMeta.installer.title}
            description={apkDownloadMeta.installer.description}
            href={downloads.installerApkUrl}
            cta="Download installer APK"
          />
        </div>

        <section className="mt-12 rounded-3xl border border-line bg-white p-6">
          <h2 className="font-semibold text-lg">iPhone or iPad parent?</h2>
          <p className="mt-2 text-muted text-sm">
            Skip the APK — use the web dashboard in Safari. Same login, pairing, devices, and alerts.
          </p>
          <Link
            href="/login"
            className="inline-block mt-4 rounded-xl bg-brand text-white px-5 py-2.5 text-sm font-medium"
          >
            Open parent dashboard
          </Link>
        </section>

        <p className="mt-10 text-sm text-muted text-center">
          New to OpenParental?{' '}
          <Link href="/setup" className="text-brand font-medium underline underline-offset-2">
            Read the full setup guide
          </Link>
        </p>
      </main>
    </SiteShell>
  );
}
