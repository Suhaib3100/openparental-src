# OpenParental × FlashGet Kids parity roadmap

**Goal:** Same product shape and technology *class* as FlashGet Kids, branded **OpenParental** — implemented in **this repo** (MIT), not by copying FlashGet’s proprietary APK, assets, or decompiled source.

REA research: [`research/FLASHGET_REA.md`](../research/FLASHGET_REA.md).

## Product architecture (target)

| Role | FlashGet | OpenParental (target) |
|------|----------|------------------------|
| Parent phone | `com.flashget.parentalcontrol` | `app-parent` (Flutter) |
| Child phone | `com.flashget.kidsdownloader` + downloaded agent | `android-managed` now → optional `android-installer` later |
| Backend | FlashGet cloud | Self-hosted NestJS (you control data) |
| Realtime | MQTT + LiteAV/WebRTC | Phase 2: WebRTC + optional MQTT; today: REST + Socket.IO JPEG |

## Phases

### Phase 1 — UX & install flow (in progress)

- [x] FlashGet-style **setup wizard** (parent installed → child APK → pair → permissions checklist)
- [x] Device hub sections renamed to FlashGet categories (Live Monitoring, Location, Rules)
- [ ] Hosted **child APK** URL (GitHub Releases / your CDN) wired in `ProductConfig`
- [ ] Optional **`android-installer`** module (like `kidsdownloader`) for OTA child updates

### Phase 2 — Live monitoring (FlashGet-grade)

- [ ] **WebRTC** screen path (replace or complement JPEG Socket.IO)
- [ ] Remote camera snapshot **upload to parent** (end-to-end)
- [ ] Screen record pipeline + parent gallery
- [ ] Push signaling via **FCM** (instant commands)

### Phase 3 — Location

- [x] **Location history** API + parent timeline (`LocationHistoryScreen`)
- [x] **Geofence** CRUD + enter/exit alerts (NestJS + Play Services geofencing on child)

### Phase 4 — Rules & content (already partial)

- [x] App block, limits, bedtime, DNS (Family policy)
- [ ] App picker with icons (not package strings only)
- [ ] Browser safety / keyword / usage (wire any remaining stubs)

### Phase 5 — Polish & ship

- [ ] Play Store parent AAB signing
- [ ] Child sideload + OEM keep-alive playbook (Xiaomi/Samsung/…)
- [ ] Subscription/billing (only if you want FlashGet-style monetization)

## Explicit choices (private testing build)

**Owner decision (2026-10):** Match FlashGet **full functionality** under the OpenParental name — private testing only, not a public competitor release.

| FlashGet feature | OpenParental status |
|------------------|---------------------|
| One-way ambient audio | **On** — `AMBIENT_RECORD` + foreground mic service |
| Hide app after setup | **On** — onboarding **Hide and continue** (launcher alias) |
| LiteAV / WebRTC mirror | **Phase 2** — still JPEG Socket.IO until WebRTC lands |
| Kids installer APK | **Phase 1b** — `android-installer` module planned |

## Legal

FlashGet is **proprietary**. Parity means **reimplementation** from public behavior + REA *declarations*, not shipping their code or trademarked artwork.
