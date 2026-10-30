package app.monii.managed.admin

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import android.util.Log

/**
 * Device Owner self-protection. When OpenParental is provisioned as the device
 * owner (QR enrollment or `adb dpm set-device-owner`), this applies the policies
 * that make a *visible* supervisor genuinely durable on Android 14/15:
 *
 *   - uninstall blocked               (setUninstallBlocked)
 *   - force-stop / clear-data blocked (setUserControlDisabledPackages, API 30+)
 *   - safe-boot + factory-reset off   (user restrictions — no escape hatch)
 *   - runtime permissions auto-granted (setPermissionGrantState — no prompts)
 *
 * This is overt by design: the foreground-service notification still shows, the
 * app stays in the launcher and in Settings. We only remove the *bypass* paths,
 * not the *visibility*. `release()` reverses everything and relinquishes owner so
 * a device is never bricked.
 */
class DeviceOwnerManager(context: Context) {
    private val appContext = context.applicationContext
    private val dpm: DevicePolicyManager? =
        appContext.getSystemService(DevicePolicyManager::class.java)
    private val admin = ComponentName(appContext, MoniiDeviceAdminReceiver::class.java)

    fun isDeviceOwner(): Boolean =
        dpm?.isDeviceOwnerApp(appContext.packageName) == true

    /** Permissions we silently grant so the child never sees a runtime prompt. */
    private val autoGrantPermissions = listOf(
        "android.permission.ACCESS_FINE_LOCATION",
        "android.permission.ACCESS_COARSE_LOCATION",
        "android.permission.ACCESS_BACKGROUND_LOCATION",
        "android.permission.CAMERA",
        "android.permission.RECORD_AUDIO",
        "android.permission.READ_PHONE_STATE",
        "android.permission.READ_CALL_LOG",
        "android.permission.RECEIVE_SMS",
        "android.permission.POST_NOTIFICATIONS",
    )

    /**
     * Apply the full self-protection policy set. Safe to call repeatedly (every
     * boot / provisioning-complete). Each step is independent and best-effort so
     * one unsupported API on an odd OEM never aborts the rest.
     */
    fun applyProtection() {
        val mgr = dpm ?: return
        if (!isDeviceOwner()) {
            Log.w(TAG, "not device owner — skipping self-protection")
            return
        }
        val pkg = appContext.packageName

        runCatching { mgr.setUninstallBlocked(admin, pkg, true) }
            .onFailure { Log.w(TAG, "setUninstallBlocked: ${it.message}") }

        // API 30+: disable Force stop / Clear data, and exempt from App Standby.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            runCatching { mgr.setUserControlDisabledPackages(admin, listOf(pkg)) }
                .onFailure { Log.w(TAG, "setUserControlDisabledPackages: ${it.message}") }
        }

        runCatching { mgr.addUserRestriction(admin, UserManager.DISALLOW_SAFE_BOOT) }
        runCatching { mgr.addUserRestriction(admin, UserManager.DISALLOW_FACTORY_RESET) }
        // Block the kid from removing us as device admin via Settings.
        runCatching { mgr.addUserRestriction(admin, UserManager.DISALLOW_UNINSTALL_APPS) }

        grantAllPermissions()
    }

    /** Silently grant every runtime permission the app declares (no child prompt). */
    fun grantAllPermissions() {
        val mgr = dpm ?: return
        if (!isDeviceOwner()) return
        val pkg = appContext.packageName
        for (perm in autoGrantPermissions) {
            runCatching {
                mgr.setPermissionGrantState(
                    admin,
                    pkg,
                    perm,
                    DevicePolicyManager.PERMISSION_GRANT_STATE_GRANTED,
                )
            }.onFailure { Log.w(TAG, "grant $perm: ${it.message}") }
        }
    }

    /**
     * Reverse every protection and relinquish device-owner. Triggered by the
     * remote RELEASE_OWNER command so a parent can always hand the device back.
     */
    fun release() {
        val mgr = dpm ?: return
        if (!isDeviceOwner()) return
        val pkg = appContext.packageName
        runCatching { mgr.setUninstallBlocked(admin, pkg, false) }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            runCatching { mgr.setUserControlDisabledPackages(admin, emptyList()) }
        }
        runCatching { mgr.clearUserRestriction(admin, UserManager.DISALLOW_SAFE_BOOT) }
        runCatching { mgr.clearUserRestriction(admin, UserManager.DISALLOW_FACTORY_RESET) }
        runCatching { mgr.clearUserRestriction(admin, UserManager.DISALLOW_UNINSTALL_APPS) }
        // Relinquish ownership last — after this call we have no privileged APIs.
        @Suppress("DEPRECATION")
        runCatching { mgr.clearDeviceOwnerApp(pkg) }
    }

    companion object {
        private const val TAG = "DeviceOwnerManager"
    }
}
