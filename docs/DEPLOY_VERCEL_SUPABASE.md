# Deploy OpenParental on Vercel + Supabase (no VPS)

## 1. Supabase

1. Create a project at [supabase.com](https://supabase.com).
2. **SQL Editor** → paste and run [`supabase/migrations/001_openparental.sql`](../supabase/migrations/001_openparental.sql).
3. **Settings → Database** → copy **Connection string** (URI, **Transaction** pooler, port 6543).

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
| `NEXT_PUBLIC_SUPABASE_PUBLISHABLE_KEY` | Supabase **publishable** key (optional; for future client SDK) |

Leave `NEXT_PUBLIC_API_URL` **unset** so the web app uses same-origin `/auth`, `/devices`, etc.

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
