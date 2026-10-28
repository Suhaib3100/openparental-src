# FlashGet Kids — research monorepo (reference only)

This folder holds **third-party proprietary** artifacts for **private interoperability research**.  
OpenParental **does not import** this code into `android-managed/`, `app-parent/`, or `backend/`.

## Layout

```
research/flashget/
├── README.md           ← you are here
├── LEGAL.md
├── binaries/           ← original APK/APKM (Git LFS)
├── decompiled/         ← JADX 1.5.1 output (reference)
│   ├── kids-installer/   com.flashget.kidsdownloader 1.0.3.0
│   └── parent-base/      com.flashget.parentalcontrol base.apk 1.4.3.0
├── rea/                ← REA inspect JSON evidence
└── scripts/decompile.sh
```

## Regenerate decompiled tree

```bash
./research/flashget/scripts/decompile.sh
```

Requires [JADX](https://github.com/skylot/jadx) on `PATH` or `JADX_BIN`.

## OpenParental product code

| Path | Role |
|------|------|
| `android-managed/` | **Your** child app |
| `app-parent/` | **Your** parent app (Android) |
| `web/` | **Your** site + parent dashboard |
| `backend/` | **Your** API |

See also [`../FLASHGET_REA.md`](../FLASHGET_REA.md) (summary notes).
