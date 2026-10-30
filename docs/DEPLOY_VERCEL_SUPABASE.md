# Deploy OpenParental on Vercel + Supabase (no VPS)

Supabase here = **hosted Postgres only**. OpenParental does **not** use the Supabase
JavaScript client, `@supabase/ssr`, Auth helpers, or middleware from the Supabase
dashboard “Connect Next.js” wizard — **leave that turned off**.

## 1. Supabase (database only)

1. Create a project at [supabase.com](https://supabase.com).
2. **SQL Editor** → paste and run [`supabase/migrations/001_openparental.sql`](../supabase/migrations/001_openparental.sql).
3. Also run [`backend/prisma/add-screen-frame-columns.sql`](../backend/prisma/add-screen-frame-columns.sql) if the project already existed.
4. **Settings → Database** → copy **Connection string** (URI, **Transaction** pooler, port 6543).

**Do not** install `@supabase/supabase-js` / `@supabase/ssr`, add `utils/supabase/*`,
or Supabase session middleware — auth is **custom JWT** via `/api/auth/*` and
`web/lib/server/api-router.ts`.

## 2. Vercel project

Project **`openparental`** is linked to `abuzar310/openparental` with root directory **`web`**.

Production URLs (team):

- https://openparental-abuzaarfirooz-4986s-projects.vercel.app
- **Setup guide (on-site):** `/setup`
- **iPhone dashboard:** `/login` then `/dashboard`
- **Android downloads (same origin, not GitHub):** `/download` → `/api/apk/child|parent|installer`

## 3. Vercel environment variables

In **Project → Settings → Environment Variables** (Production + Preview):

| Variable | Value |
|----------|--------|
| `DATABASE_URL` | Supabase Postgres URI (pooler, port **6543**) |
| `JWT_SECRET` | Long random string (same as old backend) |
| `NEXT_PUBLIC_SITE_URL` | `https://openparental-abuzaarfirooz-4986s-projects.vercel.app` |

Leave `NEXT_PUBLIC_API_URL` **unset** so the web app uses same-origin `/auth`, `/devices`, etc.

**Remove / do not set** (Supabase client wizard — not used):

- `NEXT_PUBLIC_SUPABASE_URL`
- `NEXT_PUBLIC_SUPABASE_PUBLISHABLE_KEY`
- `NEXT_PUBLIC_SUPABASE_ANON_KEY`

Optional (when APKs exist on GitHub Releases):

| Variable | Example |
|----------|---------|
| `NEXT_PUBLIC_CHILD_APK_URL` | `https://github.com/abuzar310/openparental/releases/download/v0.1.0/openparental-child.apk` |
| `NEXT_PUBLIC_PARENT_APK_URL` | … parent … |
| `NEXT_PUBLIC_INSTALLER_APK_URL` | … installer … |

Redeploy after saving env vars.

## 4. Child app backend URL

On the child phone, set base URL to your Vercel site **origin** (no `/api`):

`https://openparental-abuzaarfirooz-4986s-projects.vercel.app`

API routes live under `/api/*` on the same host.

## 5. APK builds

Until Release APKs exist, `/download` shows links. Build locally or run GitHub Actions `Release APKs` workflow when added.
