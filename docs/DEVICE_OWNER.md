# Device Owner mode — undeletable, unkillable, auto-granted (overt)

OpenParental's child app can run as the Android **Device Owner (DPC)**. This is the
only supported way to make the supervisor genuinely durable on Android 14/15:

| Capability | API used | Effect |
|---|---|---|
| Can't be uninstalled | `setUninstallBlocked` | Uninstall is greyed out |
| Can't be force-stopped / data-cleared | `setUserControlDisabledPackages` (API 30+) | Force stop & Clear data disabled; app exempt from App Standby |
| No safe-mode escape | `DISALLOW_SAFE_BOOT` | Can't boot to safe mode to disable it |
| No factory-reset escape | `DISALLOW_FACTORY_RESET` | Can't wipe to remove it |
| No permission prompts | `setPermissionGrantState(GRANTED)` | Location / camera / mic / SMS granted silently |

All of this is applied by [`DeviceOwnerManager`](../android-managed/app/src/main/kotlin/app/monii/managed/admin/DeviceOwnerManager.kt),
re-asserted on every `SupervisorService` start and on `onEnabled`.

**This mode is overt, by design.** The foreground-service notification still shows,
the app stays in the launcher and in Settings. Device Owner removes the *bypass*
paths, not the *visibility*. There is a remote **`RELEASE_OWNER`** command that
reverses every policy and relinquishes ownership, so a device is never bricked.

## Why Device Owner (not Device Admin)

Legacy Device Admin **cannot** block uninstall or force-stop — since Android 6 the
user can always deactivate the admin and uninstall. Only Device Owner can. The
trade-off: Device Owner can only be provisioned on a device with **no accounts**,
i.e. right after a factory reset, and only one DPC per device.

## Provisioning — ADB (simplest, for a device you set up)

1. Factory-reset the child device. During setup, **skip adding any Google account**
   (Device Owner refuses to provision if an account exists).
2. Sideload the child APK (`app.monii.managed`).
3. From a computer with ADB:

   ```bash
   adb shell dpm set-device-owner app.monii.managed/.admin.MoniiDeviceAdminReceiver
   ```

4. Open the app, pair it, finish the permission wizard. Self-protection is applied
   automatically (`onEnabled` → `applyProtection()`), and re-applied on every boot.

## Provisioning — QR (zero-touch style)

On the "Welcome" screen of a factory-reset device, tap 6× to open the QR enroller,
then scan a QR encoding a provisioning payload that points at the hosted APK:

```json
{
  "android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME":
    "app.monii.managed/.admin.MoniiDeviceAdminReceiver",
  "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION":
    "https://<your-host>/app-monii-managed.apk",
  "android.app.extra.PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM":
    "<url-safe-base64 SHA-256 of the APK signing cert>",
  "android.app.extra.PROVISIONING_SKIP_ENCRYPTION": false
}
```

Host the release APK, compute the signing-cert checksum, and encode the JSON as a
QR. Android downloads, installs, and sets it as Device Owner in one flow.

## Releasing a device

Send the `RELEASE_OWNER` command from the parent app/dashboard. The child clears
all restrictions and calls `clearDeviceOwnerApp`, after which the app can be
uninstalled normally.
