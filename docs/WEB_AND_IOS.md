# Website, web dashboard & iPhone parents

## What we ship

| Surface | Platform | Purpose |
|---------|----------|---------|
| **Child app** | Android (APK) | Installed on the kid phone — same as today |
| **Parent app** | Android (APK) | Full Flutter dashboard (live mirror, policy UI, etc.) |
| **Marketing site + web dashboard** | Any browser | Lists both apps; parents sign in at `/login` |

The **`web/`** Next.js app is the public site and the **parent web dashboard**. Deploy it on Vercel (or any Node host) and point it at your NestJS API.

## iPhone / iPad

There is **no App Store parent app** yet. The Flutter parent project only targets **Android** (no `ios/` folder checked in).

For private testing on iPhone:

1. Open your deployed site in **Safari** (e.g. `https://openparental.yourdomain.com/login`).
2. Sign in with the same email/password as the Android parent app.
3. Optional: **Share → Add to Home Screen** for a full-screen shortcut.

A native iOS parent build is possible later (`flutter create --platforms=ios` + Apple Developer + Mac/Xcode), but the **web dashboard is the supported path for iPhone today**.

## Environment variables

**Web (`web/.env.local`):**

```bash
NEXT_PUBLIC_API_URL=https://api.yourdomain.com
NEXT_PUBLIC_CHILD_APK_URL=https://github.com/.../openparental-child.apk
NEXT_PUBLIC_PARENT_APK_URL=https://github.com/.../openparental-parent.apk
```

**Backend (allow browser calls):**

```bash
CORS_ORIGINS=https://openparental.yourdomain.com,http://localhost:3001
```

## Local dev

```bash
# Terminal 1 — API
cd backend && npm run start:dev

# Terminal 2 — site + dashboard
cd web && npm run dev
# → http://localhost:3000 (Next default; use port 3001 if API uses 3000)
```

If both need port 3000, run Next on 3001: `npm run dev -- -p 3001`.
