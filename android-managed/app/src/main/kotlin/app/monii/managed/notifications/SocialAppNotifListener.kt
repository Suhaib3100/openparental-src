package app.monii.managed.notifications

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log
import app.monii.managed.collectors.KeywordDetector
import app.monii.managed.collectors.KeywordMatch
import app.monii.managed.data.ContentBuffer
import app.monii.managed.identity.DeviceStore
import java.time.Instant

/**
 * Monitors notifications from social media apps (Instagram, TikTok, YouTube, etc.)
 * and scans their text content for suspicious keywords.
 *
 * When a keyword match is found, the content is buffered as an event with source
 * "keyword" — the backend stores it in ContentArchive and creates a KEYWORD alert
 * for the parent.
 *
 * REQUIRES: Notification Listener permission granted by the user.
 */
class SocialAppNotifListener : NotificationListenerService() {

    companion object {
        private const val TAG = "SocialAppNotif"
        private const val CHANNEL_ID = "monii_notif_monitor"

        /**
         * Which notification categories we monitor. Instagram uses "social",
         * YouTube uses "social" and "promo", etc.
         */
        private val MONITORED_CATEGORIES = setOf(
            Notification.CATEGORY_SOCIAL,
            Notification.CATEGORY_MESSAGE,
            Notification.CATEGORY_PROMO,
            Notification.CATEGORY_RECOMMENDATION,
        )

        /** Cooldown per package to avoid spam (millis). */
        private const val COOLDOWN_MS = 30_000L
    }

    /** Cooldown map: packageName → last reported timestamp */
    private val lastReported = mutableMapOf<String, Long>()

    override fun onCreate() {
        super.onCreate()
        ensureChannel()
        Log.i(TAG, "SocialAppNotifListener created")

        // Show a persistent notification so Android doesn't kill the service
        val n = Notification.Builder(this, CHANNEL_ID)
            .setContentTitle("Social monitoring active")
            .setContentText("Scanning for safety keywords")
            .setSmallIcon(android.R.drawable.ic_menu_search)
            .setOngoing(true)
            .setPriority(Notification.PRIORITY_MIN)
            .build()
        startForeground(NotifId.MONITOR, n)
    }

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        val pkg = sbn.packageName

        // Only monitor known social apps
        if (pkg !in KeywordDetector.MONITORED_PACKAGES) return

        // Cooldown check
        val now = System.currentTimeMillis()
        val last = lastReported[pkg] ?: 0L
        if (now - last < COOLDOWN_MS) return

        val notification = sbn.notification ?: return
        val extras = notification.extras ?: return

        // Skip non-relevant categories
        val category = notification.category
        if (category != null && category !in MONITORED_CATEGORIES) return

        // Extract text from the notification
        val title = extras.getString(Notification.EXTRA_TITLE, "") ?: ""
        val text = extras.getString(Notification.EXTRA_TEXT, "") ?: ""
        val subText = extras.getString(Notification.EXTRA_SUB_TEXT, "") ?: ""
        val bigText = extras.getCharSequence(Notification.EXTRA_BIG_TEXT, "")?.toString() ?: ""
        val infoText = extras.getString(Notification.EXTRA_INFO_TEXT, "") ?: ""
        val summary = extras.getString(Notification.EXTRA_SUMMARY_TEXT, "") ?: ""

        val allText = listOf(title, text, subText, bigText, infoText, summary)
            .filter { it.isNotBlank() }
            .joinToString(" · ")

        if (allText.isBlank()) return

        // Run keyword detection
        val matches = KeywordDetector.scan(allText)
        if (matches.isEmpty()) return

        Log.w(TAG, "Keyword match in $pkg: ${matches.joinToString { "${it.category}:${it.keyword}" }}")

        // Buffer the event for next sync
        lastReported[pkg] = now
        bufferMatch(pkg, allText, matches)
    }

    private fun bufferMatch(pkg: String, body: String, matches: List<KeywordMatch>) {
        if (!isPaired()) return

        for (match in matches) {
            val item = ContentBuffer.createItem(
                source = "keyword",
                body = body,
                matched = match.categoryLabel,
                counterparty = pkg,
            )
            ContentBuffer.add(this, item)
        }
    }

    private fun isPaired(): Boolean =
        DeviceStore(this).isPaired()

    override fun onNotificationRemoved(sbn: StatusBarNotification?) {}

    override fun onListenerConnected() {
        Log.i(TAG, "Notification listener connected")
    }

    override fun onListenerDisconnected() {
        Log.i(TAG, "Notification listener disconnected")
    }

    private fun ensureChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val nm = getSystemService(NotificationManager::class.java)
            val channel = NotificationChannel(
                CHANNEL_ID,
                "Social monitoring",
                NotificationManager.IMPORTANCE_MIN,
            ).apply {
                description = "Keeps social media keyword monitoring active"
                setShowBadge(false)
            }
            nm?.createNotificationChannel(channel)
        }
    }
}

/** Constants for foreground-service notification IDs. */
object NotifId {
    const val MONITOR = 1002
}
