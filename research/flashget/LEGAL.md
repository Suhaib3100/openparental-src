# FlashGet Kids — research artifacts in this repo

**Owner decision:** FlashGet APKs, JADX decompile, and REA JSON live in this monorepo under `research/flashget/` for **private testing and parity research**.

| What | In git? |
|------|---------|
| APK / APKM (`binaries/`, Git LFS) | **Yes** |
| Full JADX decompile (`decompiled/`) | **Yes** |
| REA JSON (`rea/`) | **Yes** |
| Copied into `android-managed/` / `app-parent/` / `backend/` | **No** — OpenParental product code is separate |

FlashGet is third-party proprietary software. OpenParental’s MIT license applies to **your** app code outside this folder. Use decompile as **reference** when building OpenParental features; do not ship FlashGet trademarks or binaries as your product.
