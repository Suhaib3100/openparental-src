# FlashGet vs OpenParental — what’s still missing

Reference: `research/flashget/decompiled/`, `research/FLASHGET_REA.md`, full matrix in [`research/flashget/reference/FEATURE_PARITY.json`](../research/flashget/reference/FEATURE_PARITY.json), short list in [`FLASHGET_MISSING.md`](FLASHGET_MISSING.md).

## Shipped in this repo (reimplemented, not copied)

| FlashGet area | OpenParental |
|---------------|--------------|
| Parent hub (Live / Location / Rules / Comms / Content) | Web dashboard device hub + feeds |
| Pairing code | `/dashboard/pair` + claim API |
| App block / allow / limits / bedtime / DNS | Rules page + child enforcement |
| Block new apps / block all except allowed | Policy flags + `PackageEventReceiver` |
| Usage + app opens | Events + activity timeline |
| Notifications, SMS, calls, browser, keywords, YouTube/TikTok | Content ingest + feed pages |
| Live screen (no cast banner) | A11y ~1fps stream + HTTP frame relay on Vercel |
| Screenshot on demand | `SCREENSHOT` command |
| Geofences + alerts | CRUD + Play Services + transitions API |
| Location history | Locations API + timeline page |
| Albums / gallery signals | `PhotoAlbumCollector` → `PhotoFlag` (metadata only) |
| Tamper (a11y off, admin off, …) | `TamperWatchdog` + alerts |
| Hide launcher after setup | Launcher alias disable |
| Device Owner self-protection | `DeviceOwnerManager` |
| MQTT wake (optional) | Backend + child Paho when `MQTT_URL` set |
| Kids installer bootstrap | `android-installer` module |
| App picker with icons | `APP_INVENTORY` + `iconB64` on rules page |

## Still not FlashGet-parity (by design or phase)

| Gap | Notes |
|-----|--------|
| **WebRTC / LiteAV HD mirror** | FlashGet uses Tencent LiteAV + WebRTC; we use JPEG (~1 fps a11y). Phase 2. |
| **On-device NSFW ML like FlashGet** | We flag new gallery items by category heuristics only; no image bytes uploaded. |
| **Remote camera / screen record to parent gallery** | Commands exist; upload pipeline + parent gallery UI incomplete. |
| **FCM instant delivery on Vercel** | Needs `FCM_SERVICE_ACCOUNT`; otherwise 60s poll. |
| **Play billing / subscription** | Not in scope for self-hosted. |
| **System-privileged “no indicator” mirror** | Stock Android cannot hide MediaProjection indicator; a11y path avoids it at lower FPS. |

## One-time DB (Supabase)

```bash
psql "$DATABASE_URL" -f backend/prisma/add-screen-frame-columns.sql
```

(`PhotoFlag` / `ScreenSession` tables must already exist from your Prisma schema.)

## After pulling this branch

1. Run SQL above on production DB.
2. Redeploy web (Vercel).
3. Rebuild + reinstall **android-managed** on the child phone.
4. Grant **Photos** on the child if you want Albums safety populated.
