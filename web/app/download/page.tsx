import Link from 'next/link';
import { downloads, site } from '@/lib/config';

export default function DownloadPage() {
  return (
    <main className="mx-auto flex min-h-screen max-w-lg flex-col gap-8 px-6 py-16">
      <div>
        <Link href="/" className="text-sm text-zinc-500 hover:text-zinc-800">
          ← {site.name}
        </Link>
        <h1 className="mt-4 text-3xl font-semibold tracking-tight">Download apps</h1>
        <p className="mt-2 text-zinc-600">
          Install the child app on the phone you supervise, and the parent app on your
          Android device. iPhone parents can use the web dashboard after login.
        </p>
      </div>
      <ul className="flex flex-col gap-4">
        <li className="rounded-xl border border-zinc-200 p-4">
          <h2 className="font-medium">Child (managed device)</h2>
          <a
            href={downloads.childApkUrl}
            className="mt-2 inline-block text-blue-600 underline"
          >
            Download child APK
          </a>
        </li>
        <li className="rounded-xl border border-zinc-200 p-4">
          <h2 className="font-medium">Parent (Android)</h2>
          <a
            href={downloads.parentApkUrl}
            className="mt-2 inline-block text-blue-600 underline"
          >
            Download parent APK
          </a>
        </li>
        <li className="rounded-xl border border-zinc-200 p-4">
          <h2 className="font-medium">Parent (iPhone / any browser)</h2>
          <Link href="/login" className="mt-2 inline-block text-blue-600 underline">
            Open web dashboard
          </Link>
        </li>
      </ul>
    </main>
  );
}
