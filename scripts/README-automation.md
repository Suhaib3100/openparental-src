# Mac automation (Conductor sync + adb)

Run on your Mac — **not** in the cloud VM.

## One command

```bash
cd ~/conductor/remote-workspace-sync/openparental-src/<your-workspace-id>
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
export OP_BACKEND_URL=https://YOUR.vercel.app
export OP_PARENT_EMAIL=demo@parent.test
export OP_PARENT_PASSWORD=...
# If Vercel Deployment Protection is enabled:
export VERCEL_AUTOMATION_BYPASS_SECRET=...

bash scripts/mac-autodeploy.sh
```

This builds the child APK, copies it to `web/public/downloads/`, installs over **adb**, and can auto-pair when login works.

## What was blocking full auto-pair

Production URL `openparental-abuzaarfirooz-4986s-projects.vercel.app` returns **401 Vercel Authentication** on `/auth/login` unless you:

1. Turn off **Deployment Protection** for that project, **or**
2. Create a **Protection Bypass for Automation** secret in Vercel and export `VERCEL_AUTOMATION_BYPASS_SECRET`.

## Already done on your phone (2026-10-30)

- Fresh **debug APK built & installed** on device `00120647H027918` (Java 17 + Gradle on Mac).
- Fixed Kotlin duplicate import in `CommandDispatcher.kt`.
