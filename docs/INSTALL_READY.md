# Install-ready checklist (you call “go”)

When **you** say the project is ready to install, verify:

## Backend

- [ ] Postgres migrated (`npx prisma db push` or migrate)
- [ ] `JWT_SECRET`, `DATABASE_URL`, `REDIS_URL` set
- [ ] Optional: `FCM_SERVICE_ACCOUNT_PATH` (not stub)
- [ ] Optional: `CORS_ORIGINS` for web dashboard

## Child

- [ ] `android-managed` debug/release APK built (`assembleRelease`)
- [ ] Optional: `android-installer` APK for FlashGet-style download flow
- [ ] APK hosted; `ProductConfig.childApkDownloadUrl` / web env updated

## Parent

- [ ] `app-parent` Android APK **or** deployed `web/` dashboard
- [ ] `NEXT_PUBLIC_API_URL` points at your API

## Smoke test

- [ ] Register parent → pairing code → child claims → device online
- [ ] Lock, location, alert feed
- [ ] Live screen / ambient (if enabled in your build)

**Status:** parity in progress — not install-ready until you confirm.
