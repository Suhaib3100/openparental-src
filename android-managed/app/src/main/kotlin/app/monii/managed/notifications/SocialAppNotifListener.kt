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

/**
 * Monitors ALL app notifications (not just social) for two purposes:
 *
 * 1. **Notification Feed** — every notification is buffered with source="notification"
 *    so the parent can browse the child's notification history.
 * 2. **Keyword Detection** — notification text is scanned against safety keyword
 *    lists. Matches are also buffered with source="keyword" and trigger KEYWORD alerts.
 *
 * Rate-limited per-app to avoid flooding the backend.
 *
 * REQUIRES: Notification Listener permission granted by the user.
 */
class SocialAppNotifListener : NotificationListenerService() {

    companion object {
        private const val TAG = "SocialAppNotif"
        private const val CHANNEL_ID = "monii_notif_monitor"

        private const val FEED_COOLDOWN_MS = 60_000L
        private const val KEYWORD_COOLDOWN_MS = 30_000L
        private const val MEDIA_COOLDOWN_MS = 120_000L

        private val YOUTUBE_TIKTOK_PKGS = setOf(
            "com.google.android.apps.youtube",
            "com.zhiliaoapp.musically",
        )

        private val BROWSER_PKGS = setOf(
            "com.android.chrome",
            "com.brave.browser",
            "com.brave.browser_default",
            "org.mozilla.firefox",
            "org.mozilla.firefox_beta",
            "com.opera.browser",
            "com.opera.mini.native",
            "com.microsoft.edge",
            "com.duckduckgo.mobile.android",
            "com.vivaldi.browser",
            "mark.via.gp",
        )

        private val SKIP_CATEGORIES = setOf(
            Notification.CATEGORY_ALARM,
            Notification.CATEGORY_CALL,
            Notification.CATEGORY_EVENT,
            Notification.CATEGORY_PROGRESS,
            Notification.CATEGORY_REMINDER,
            Notification.CATEGORY_SERVICE,
            Notification.CATEGORY_SYSTEM,
        )
    }

    /** Cooldown maps: packageName → last reported timestamp */
    private val feedCooldown = mutableMapOf<String, Long>()
    private val keywordCooldown = mutableMapOf<String, Long>()
    private val mediaCooldown = mutableMapOf<String, Long>()
    private val browserCooldown = mutableMapOf<String, Long>()

    override fun onCreate() {
        super.onCreate()
        ensureChannel()
        Log.i(TAG, "SocialAppNotifListener created")

        val n = Notification.Builder(this, CHANNEL_ID)
            .setContentTitle("Monitoring active")
            .setContentText("Capturing notifications for parent view")
            .setSmallIcon(android.R.drawable.ic_menu_search)
            .setOngoing(true)
            .setPriority(Notification.PRIORITY_MIN)
            .build()
        startForeground(NotifId.MONITOR, n)
    }

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        val pkg = sbn.packageName
        val notification = sbn.notification ?: return
        val extras = notification.extras ?: return

        // Skip system-level noise
        val category = notification.category
        if (category in SKIP_CATEGORIES) return

        // Skip our own notifications
        if (pkg == applicationContext.packageName) return

        // Extract notification text
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
        if (!isPaired()) return

        val now = System.currentTimeMillis()

        // ── 1. Capture for notification feed (all apps, rate-limited) ──
        val feedLast = feedCooldown[pkg] ?: 0L
        if (now - feedLast >= FEED_COOLDOWN_MS) {
            feedCooldown[pkg] = now
            val feedItem = ContentBuffer.createItem(
                source = "notification",
                body = allText.take(512),
                matched = null,
                counterparty = pkg,
            )
            ContentBuffer.add(this, feedItem)
        }

        // ── 2. YouTube / TikTok watch history (separate cooldown) ──
        if (pkg in YOUTUBE_TIKTOK_PKGS) {
            val mediaSource = if (pkg == "com.google.android.apps.youtube") "youtube" else "tiktok"
            val mediaLast = mediaCooldown[pkg] ?: 0L
            if (now - mediaLast >= MEDIA_COOLDOWN_MS) {
                mediaCooldown[pkg] = now
                val mediaItem = ContentBuffer.createItem(
                    source = mediaSource,
                    body = allText.take(512),
                    matched = null,
                    counterparty = pkg,
                )
                ContentBuffer.add(this, mediaItem)
            }
        }

        // ── 2b. Browser safety capture ──
        if (pkg in BROWSER_PKGS) {
            val browseLast = browserCooldown[pkg] ?: 0L
            if (now - browseLast >= MEDIA_COOLDOWN_MS) {
                browserCooldown[pkg] = now
                val browserItem = ContentBuffer.createItem(
                    source = "browser",
                    body = allText.take(512),
                    matched = null,
                    counterparty = pkg,
                )
                ContentBuffer.add(this, browserItem)
            }
        }

        // ── 3. Run keyword detection (social apps only, rate-limited) ──
        if (pkg !in KeywordDetector.MONITORED_PACKAGES) return
        val kwLast = keywordCooldown[pkg] ?: 0L
        if (now - kwLast < KEYWORD_COOLDOWN_MS) return
        keywordCooldown[pkg] = now

        val matches = KeywordDetector.scan(allText)
        if (matches.isEmpty()) return

        Log.w(TAG, "Keyword match in $pkg: ${matches.joinToString { "${it.category}:${it.keyword}" }}")

        for (match in matches) {
            val kwItem = ContentBuffer.createItem(
                source = "keyword",
                body = allText.take(512),
                matched = match.categoryLabel,
                counterparty = pkg,
            )
            ContentBuffer.add(this, kwItem)
        }
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification?) {}

    override fun onListenerConnected() {
        Log.i(TAG, "Notification listener connected")
    }

    override fun onListenerDisconnected() {
        Log.i(TAG, "Notification listener disconnected")
    }

    private fun isPaired(): Boolean =
        DeviceStore(this).isPaired()

    private fun ensureChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val nm = getSystemService(NotificationManager::class.java)
            val channel = NotificationChannel(
                CHANNEL_ID,
                "Notification monitoring",
                NotificationManager.IMPORTANCE_MIN,
            ).apply {
                description = "Captures notifications for the parent dashboard"
                setShowBadge(false)
            }
            nm?.createNotificationChannel(channel)
        }
    }
}

object NotifId {
    const val MONITOR = 1002
}
