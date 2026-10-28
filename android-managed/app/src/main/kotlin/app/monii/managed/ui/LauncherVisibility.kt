package app.monii.managed.ui

import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import app.monii.managed.identity.DeviceStore

/**
 * FlashGet-style "Hide and continue" — disables the launcher alias so the app
 * icon disappears from the home drawer. OpenParental again via dialer/code or
 * adb; protection services keep running.
 */
object LauncherVisibility {
    private const val LAUNCHER_ALIAS = "app.monii.managed.LauncherAlias"

    fun hideFromLauncher(context: Context) {
        val pm = context.packageManager
        pm.setComponentEnabledSetting(
            ComponentName(context.packageName, LAUNCHER_ALIAS),
            PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
            PackageManager.DONT_KILL_APP,
        )
        DeviceStore(context).setLauncherHidden(true)
    }

    fun showInLauncher(context: Context) {
        val pm = context.packageManager
        pm.setComponentEnabledSetting(
            ComponentName(context.packageName, LAUNCHER_ALIAS),
            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
            PackageManager.DONT_KILL_APP,
        )
        DeviceStore(context).setLauncherHidden(false)
    }

    fun isHidden(context: Context): Boolean = DeviceStore(context).isLauncherHidden()
}
