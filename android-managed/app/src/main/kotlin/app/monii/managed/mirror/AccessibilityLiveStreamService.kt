package app.monii.managed.mirror

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.ServiceInfo
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import androidx.core.app.NotificationCompat
import app.monii.managed.R
import app.monii.managed.accessibility.MonitorAccessibilityService
import app.monii.managed.identity.DeviceStore
import app.monii.managed.repo.MoniiRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

/**
 * Live screen relay via [AccessibilityService.takeScreenshot] — no MediaProjection,
 * no cast indicator. Frames upload over REST (~1 fps platform limit).
 */
class AccessibilityLiveStreamService : Service() {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val mainHandler = Handler(Looper.getMainLooper())
    private var sessionId = ""
    private var streaming = false

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_STOP_STREAM, ACTION_STOP_ALL -> {
                stopStream(endSession = intent.action == ACTION_STOP_ALL)
                if (intent.action == ACTION_STOP_ALL) {
                    stopForeground(STOP_FOREGROUND_REMOVE)
                    stopSelf()
                }
                return START_NOT_STICKY
            }
            ACTION_START_STREAM -> {
                val sid = intent.getStringExtra(EXTRA_SESSION_ID).orEmpty()
                if (sid.isBlank()) return START_NOT_STICKY
                startStream(sid)
                return START_STICKY
            }
        }
        return START_NOT_STICKY
    }

    private fun startStream(sid: String) {
        if (streaming && sessionId == sid) return
        stopStream(endSession = false)
        sessionId = sid
        streaming = true
        startForegroundCompat()
        scheduleNextCapture(0)
    }

    private fun scheduleNextCapture(delayMs: Long) {
        if (!streaming || sessionId.isBlank()) return
        mainHandler.postDelayed(
            {
                if (!streaming) return@postDelayed
                val a11y = MonitorAccessibilityService.instance
                if (a11y == null) {
                    scheduleNextCapture(CAPTURE_INTERVAL_MS)
                    return@postDelayed
                }
                val sid = sessionId
                a11y.captureScreenshot(JPEG_QUALITY) { jpeg ->
                    if (!streaming || jpeg == null) {
                        scheduleNextCapture(CAPTURE_INTERVAL_MS)
                        return@captureScreenshot
                    }
                    scope.launch {
                        val ok = ScreenFrameUploader.push(this@AccessibilityLiveStreamService, sid, jpeg)
                        if (!ok) stopStream(endSession = false)
                        else if (streaming) scheduleNextCapture(CAPTURE_INTERVAL_MS)
                    }
                }
            },
            delayMs,
        )
    }

    private fun stopStream(endSession: Boolean) {
        streaming = false
        mainHandler.removeCallbacksAndMessages(null)
        if (endSession && sessionId.isNotBlank()) {
            val sid = sessionId
            scope.launch {
                runCatching {
                    MoniiRepository(this@AccessibilityLiveStreamService, DeviceStore(this@AccessibilityLiveStreamService))
                        .stopScreenSession(sid)
                }
            }
        }
        sessionId = ""
    }

    override fun onDestroy() {
        stopStream(endSession = false)
        scope.cancel()
        super.onDestroy()
    }

    private fun startForegroundCompat() {
        createChannel()
        val notification: Notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle(getString(R.string.mirror_ready_title))
            .setContentText(getString(R.string.mirror_ready_text))
            .setSmallIcon(R.drawable.ic_launcher)
            .setOngoing(true)
            .setSilent(true)
            .setPriority(NotificationCompat.PRIORITY_MIN)
            .setCategory(NotificationCompat.CATEGORY_SERVICE)
            .build()
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(
                NOTIF_ID,
                notification,
                ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE,
            )
        } else {
            startForeground(NOTIF_ID, notification)
        }
    }

    private fun createChannel() {
        val nm = getSystemService(NotificationManager::class.java)
        val channel = NotificationChannel(
            CHANNEL_ID,
            getString(R.string.fgs_title),
            NotificationManager.IMPORTANCE_MIN,
        ).apply {
            setShowBadge(false)
            setSound(null, null)
            enableVibration(false)
        }
        nm.createNotificationChannel(channel)
    }

    companion object {
        private const val CHANNEL_ID = "a11y_live_screen"
        private const val NOTIF_ID = 43
        private const val EXTRA_SESSION_ID = "session_id"
        private const val JPEG_QUALITY = 55
        private const val CAPTURE_INTERVAL_MS = 1000L

        const val ACTION_START_STREAM = "app.monii.managed.A11Y_START_STREAM"
        const val ACTION_STOP_STREAM = "app.monii.managed.A11Y_STOP_STREAM"
        const val ACTION_STOP_ALL = "app.monii.managed.A11Y_STOP_LIVE"

        fun startStream(context: Context, sessionId: String) {
            val intent = Intent(context, AccessibilityLiveStreamService::class.java).apply {
                action = ACTION_START_STREAM
                putExtra(EXTRA_SESSION_ID, sessionId)
            }
            context.startForegroundService(intent)
        }

        fun stopStream(context: Context) {
            val intent = Intent(context, AccessibilityLiveStreamService::class.java).apply {
                action = ACTION_STOP_STREAM
            }
            context.startForegroundService(intent)
        }
    }
}
