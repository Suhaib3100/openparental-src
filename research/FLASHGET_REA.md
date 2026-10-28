# FlashGet Kids — REA reverse-engineering notes

**Tool:** [REA (Reverse Engineer Anything)](https://github.com/morluto/rea) `rea-agents@6.8.0`  
**Engine:** JADX headless MCP `0.7.1` (`REA_JADX_MCP_JAR`)  
**Environment:** Cursor Cloud Agent VM (browser download + CLI analysis)  
**Date:** 2026-10-28  

Artifacts live under **`research/flashget/`** (monorepo: `binaries/` + `decompiled/` + `rea/`). See [`flashget/README.md`](flashget/README.md) and [`flashget/LEGAL.md`](flashget/LEGAL.md).

---

## Why you saw “2 kid APKs + 1 parent”

FlashGet does **not** ship one monolithic “parent-only” Play binary for the whole system.

| Artifact | Package | Role |
|----------|---------|------|
| **Parent / main client** | `com.flashget.parentalcontrol` | Parent UI, binding, maps, live monitoring controls, billing |
| **Kids installer / downloader** | `com.flashget.kidsdownloader` | Small bootstrap on the **child phone**: downloads/installs components (`REQUEST_INSTALL_PACKAGES`, `DownloadService`, install receivers) |

The **parent Play APK (1.4.3.0 base)** is a **large split bundle** (~46 MB base + ABI splits). It already embeds **child-side modules** in the same DEX tree, e.g. services under `com.flashget.kid.common.push.*` (`PushService`, `PushKeepLiveService`, …) — so one downloaded “parent” APK is really **parent app + shared kid/push stack**, not a separate tiny parent-only build.

That matches your experience: **parent app on your phone**, **installer (+ downloaded child payload) on the kid phone** — often feels like **two kid-side APK steps** plus **one parent app**.

---

## REA evidence files (committed)

| File | Subject |
|------|---------|
| `research/flashget/rea/rea-parent-base-package.json` | `base.apk` from parent APKM — manifest, permissions, components |
| `research/flashget/rea/rea-installer-package.json` | `flashget-installer.apk` |
| `research/flashget/rea/rea-search-flashget.json` | Class name search sample |

Regenerate:

```bash
export REA_JADX_MCP_JAR="$HOME/.local/share/rea/android/jadx-headless-mcp-0.7.1-all.jar"
npx rea-agents@6.8.0 inspect-android-package research/flashget/binaries/parent-base.apk --format json > research/flashget/rea/rea-parent-base-package.json
npx rea-agents@6.8.0 inspect-android-package research/flashget/binaries/flashget-installer.apk --format json > research/flashget/rea/rea-installer-package.json
```

---

## Static findings (parent `com.flashget.parentalcontrol` 1.4.3.0)

| Metric | Value |
|--------|--------|
| DEX classes (JADX) | **22,626** |
| Resources | 5,935 |
| Declared permissions (manifest) | 27 |
| Activities | 143 |
| Services | 28 |
| Receivers | 13 |

**Notable permissions (parent manifest):** `INTERNET`, `CAMERA`, `ACCESS_FINE_LOCATION`, `FOREGROUND_SERVICE`, `POST_NOTIFICATIONS`, `SYSTEM_ALERT_WINDOW`, storage, billing (`com.android.vending.BILLING`).

**Notable components (sample):**

- Parent UI: `ParentMainActivity`, `ParentLoginMainActivity`, `ParentBindMainActivity`, `MapActivity`
- Push / keep-alive (kid common package inside same APK): `com.flashget.kid.common.push.PushService`, `PushKeepLiveService`, `PushBindService`, `PushMessageHandleService`

**Third-party stack (class search on base APK):**

| Area | Libraries seen in DEX |
|------|------------------------|
| Screen capture / live | **Tencent LiteAV** (`NativeScreenCapture`, `ScreenCaptureService`), **WebRTC** (`ScreenCapturerAndroid`) |
| Realtime transport | **Eclipse Paho MQTT** (WebSocket network modules) — not raw Socket.IO |
| Push / analytics | **Firebase** (Analytics, Messaging receivers) |
| Location / geofence | **Google Play Services Location** (`FusedLocationProviderClient`, `Geofence`) |
| Media / audio | LiteAV audio record classes, large `android.media` surface |

Accessibility enforcement is **not** declared as a simple `uses-permission` line in the decoded parent manifest snippet; FlashGet documents **Accessibility as a runtime grant** on the child setup flow (matches their help center). Deeper kid-agent behavior likely lives in **dynamically installed** pieces from `kidsdownloader`.

---

## Static findings (installer `com.flashget.kidsdownloader` 1.0.3.0)

| Metric | Value |
|--------|--------|
| DEX classes | **7,773** |
| Permissions | 12 |

**Purpose (manifest + components):**

- `REQUEST_INSTALL_PACKAGES` — sideload/install child payload
- `DownloadService`, `AppUpdateDownloadActivity_`, `InstallResultReceiver`, `FrontInstallResultReceiver`
- Entry: `ParentSplashActivity`, `MainActivity` (naming is confusing — this APK is the **kid-side installer**, not the parent dashboard)

---

## FlashGet vs OpenParental (build implications)

| FlashGet pattern | OpenParental today |
|------------------|-------------------|
| Parent + **installer** + fat APK with kid push services | **1 parent Flutter + 1 child Kotlin**; no separate installer APK |
| **Tencent LiteAV + WebRTC** for mirror | **JPEG frames over Socket.IO** |
| **MQTT (Paho)** for signaling/data | **REST poll + optional FCM** |
| **Geofence** via Play Services | Schema/alerts only — **not implemented** |
| **One-way audio**, hide-after-setup UX | **Explicitly rejected** in OpenParental (consent-first) |
| Play billing / subscription | Self-hosted, no billing |

---

## Suggested OpenParental parity order (from REA)

1. **Setup wizard in parent app** — mirror FlashGet: “Install on parent / Install on child” + binding code (you already have pairing; add **installer-style copy** and APK download link for `android-managed`).
2. **Live view transport** — if you need FlashGet-grade mirror, plan **WebRTC or LiteAV-class pipeline**, not only JPEG Socket.IO.
3. **Child distribution** — optional **`kidsdownloader`-style** thin installer that pulls the latest child APK (helps OEM / sideload updates).
4. **Geofence + location history** — GMS-style APIs on child, NestJS geofence rules on backend.
5. **Do not copy** covert audio / silent hide unless you fork the product philosophy.

---

## Legal / scope

REA + JADX support **private parity research**. Binaries and decompile are **committed** under [`research/flashget/`](flashget/README.md) (see [`flashget/LEGAL.md`](flashget/LEGAL.md)). Product modules reimplement behavior in OpenParental code — they do not embed FlashGet DEX or assets.
