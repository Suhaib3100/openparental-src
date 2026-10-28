# OpenParental Installer (`app.monii.installer`)

FlashGet-style **kids downloader** slice of the monorepo. UI structure follows:

`research/flashget/decompiled/kids-installer/resources/res/layout/activity_main.xml`

## Build

```bash
cd android-installer
chmod +x gradlew
./gradlew assembleDebug
```

Override child APK URL:

```bash
./gradlew assembleDebug -PchildApkUrl=https://your.cdn/child.apk
```

(or edit `buildConfigField` in `app/build.gradle.kts`).

## Flow

1. Parent installs **parent app** or uses **web dashboard**.
2. On the child phone, sideload **this installer** (or the full `android-managed` APK directly).
3. Installer opens the hosted **child APK** download.
4. After install, open **OpenParental Child** (`app.monii.managed`) and pair.
