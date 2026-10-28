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

- [ ] **Location history** API + parent map timeline
- [ ] **Geofence** CRUD + enter/exit alerts (backend + child GMS)

### Phase 4 — Rules & content (already partial)

- [x] App block, limits, bedtime, DNS (Family policy)
- [ ] App picker with icons (not package strings only)
- [ ] Browser safety / keyword / usage (wire any remaining stubs)

### Phase 5 — Polish & ship

- [ ] Play Store parent AAB signing
- [ ] Child sideload + OEM keep-alive playbook (Xiaomi/Samsung/…)
- [ ] Subscription/billing (only if you want FlashGet-style monetization)

## Explicit choices (vs FlashGet defaults)

You asked for **same behavior and UI flow** under the **OpenParental** name. Decide per feature:

| FlashGet feature | Default in this roadmap |
|------------------|-------------------------|
| One-way ambient audio | **Off** unless you re-enable (legal/consent review) |
| Hide app after setup | **Off** — overt child UI unless you request stealth mode |
| LiteAV proprietary SDK | **Avoid** — prefer WebRTC / open stack |

Update this table when you confirm you want stealth/audio parity.

## Legal

FlashGet is **proprietary**. Parity means **reimplementation** from public behavior + REA *declarations*, not shipping their code or trademarked artwork.
