# Building OpenParental from FlashGet decompile (owner workflow)

You asked to **use the UI/DEX in-repo** as the source of truth until you say the build is **ready to install**.

## Reference root

```
research/flashget/
├── binaries/              # APK / APKM (Git LFS)
├── decompiled/
│   ├── parent-base/       # com.flashget.parentalcontrol — parent UI + shared stack
│   └── kids-installer/    # com.flashget.kidsdownloader — child download/bootstrap UI
├── rea/                   # REA JSON snapshots
└── reference/             # Maps + indexes (this workflow)
```

## How we use decompile (practical)

| FlashGet artifact | We use it by… |
|-------------------|----------------|
| `resources/res/layout/*.xml` | Copy **structure** into OpenParental XML / Flutter widgets (OpenParental colors/icons, not their `@drawable/logo_*`) |
| `resources/res/values/strings.xml` | Match **flows and labels** (e.g. `Parent_Tabbar_*`, `Download_Tab_*`) |
| `sources/**/*.java` | Read **logic order** (permissions, bind steps, WebRTC entry) — reimplement in Kotlin/Dart, not paste obfuscated classes |
| DEX / full JAR | **Not** dropped into Gradle; too large, wrong package, unmaintainable |

Regenerate decompile after APK update:

```bash
./research/flashget/scripts/decompile.sh
```

Refresh screen map index:

```bash
python3 scripts/flashget-reference-index.py
```

## Screen map (parent app — FlashGet → OpenParental)

| FlashGet (decompile) | OpenParental |
|----------------------|--------------|
| `Parent_Tabbar_Device_Notice` → Notice tab | `AlertsTab` (label → **Notice**) |
| `Parent_Tabbar_Device_Title` → Device tab | `DevicesTab` (label → **Device**) |
| `Parent_Tabbar_My_Title` → Me | `MeTab` |
| `parent_kids_devices_install.xml` | `SetupWizardScreen` |
| `parent_geofence_activity.xml` | `LocationHistoryScreen` |
| `parent_device_fragment_new.xml` | `DevicesTab` device hub |
| `activity_parent_main.xml` | `HomeScreen` shell |

## Screen map (child)

| FlashGet | OpenParental |
|----------|--------------|
| `kids-installer` `activity_main.xml` | **`android-installer/`** (bootstrap APK) |
| Hidden kid agent (downloaded) | **`android-managed/`** |

## “Ready to install” gate

See [`INSTALL_READY.md`](INSTALL_READY.md). **You** tell us when to tag a release; until then we keep landing parity on `main`.
