# FlashGet Kids APK Downloads

## Downloaded Files

### 1. flashget-parent.apkm (Parent Control App)
- **File**: flashget-parent.apkm
- **Size**: 63 MB (65,858,345 bytes)
- **MD5**: 4d065a4d1c473e2298eaa6265269f8be
- **Type**: APKM Bundle (contains base.apk + architecture splits)
- **Package Name**: com.flashget.parentalcontrol
- **Version**: 1.4.3.0 (104030005)
- **Architecture**: arm64-v8a + armeabi-v7a
- **Min API**: 24 (Android 7.0+)
- **Date**: October 26, 2026
- **Description**: Main parental control app for parents to monitor and control child devices

**Bundle Contents**:
- base.apk (46.2 MB)
- split_config.armeabi_v7a.apk (22.7 MB)
- split_config.arm64_v8a.apk (35.2 MB)

### 2. flashget-installer.apk (Kids Installer)
- **File**: flashget-installer.apk
- **Size**: 11 MB (11,509,707 bytes)
- **MD5**: a28e891bd80c1f011e05259853863e62
- **Type**: Standard APK
- **Package Name**: com.flashget.kidsdownloader
- **Version**: 1.0.3.0 (117)
- **Architecture**: arm64-v8a + armeabi-v7a
- **Min API**: 24 (Android 7.0+)
- **Date**: October 27, 2025
- **Description**: Installer app that downloads and sets up child monitoring components

## Architecture Analysis

FlashGet Kids appears to use a two-app architecture:

1. **Parent App (com.flashget.parentalcontrol)**: 
   - Installed on parent's device
   - Manages monitoring settings and views child activity
   - Full-featured application with comprehensive parental controls

2. **Installer App (com.flashget.kidsdownloader)**:
   - Small installer/bootstrap app
   - Likely downloads the child monitoring agent
   - May install the monitoring components on child's device

## Child App Status

Based on APKMirror search, there is no separate "child" APK available as a distinct package. The monitoring appears to work through:
- The installer app (com.flashget.kidsdownloader) which may download child components
- Potentially the same parent app (com.flashget.parentalcontrol) running in child mode
- Or remote installation via the parent app using accessibility services

## Source

Downloaded from APKMirror.com on October 28, 2026:
- Parent: https://www.apkmirror.com/apk/hongkong-flashget-network-technology/flashget-kidsparental-control/
- Installer: https://www.apkmirror.com/apk/hongkong-flashget-network-technology/flashget-kids-installer/

## Next Steps for Reverse Engineering

1. Extract and analyze the APKM bundle to get individual APKs
2. Decompile both APKs using apktool
3. Analyze AndroidManifest.xml for permissions and components
4. Examine code for:
   - Communication protocols between parent and child
   - Data collection methods
   - Privacy concerns
   - Bypass vulnerabilities
5. Check if installer downloads additional components at runtime
