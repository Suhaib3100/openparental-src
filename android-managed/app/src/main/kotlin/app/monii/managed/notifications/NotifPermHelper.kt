package app.monii.managed.notifications

import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.service.notification.NotificationListenerService
import android.content.ComponentName

/**
 * Helper to check whether the notification listener is enabled and
 * guide the user to the system settings if not.
 */
object NotifPermHelper {

    /** Check if our NotificationListenerService is enabled by the user. */
    fun isEnabled(context: Context): Boolean {
        val flat = Settings.Secure.getString(
            context.contentResolver,
            "enabled_notification_listeners",
        ) ?: return false
        val cn = ComponentName(context, SocialAppNotifListener::class.java)
        return flat.contains(cn.flattenToString())
    }

    /** Open the system notification access settings page. */
    fun openSettings(context: Context) {
        context.startActivity(
            Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            },
        )
    }
}
