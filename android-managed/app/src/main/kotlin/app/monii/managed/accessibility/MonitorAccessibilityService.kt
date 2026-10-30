package app.monii.managed.accessibility

import android.accessibilityservice.AccessibilityService
import android.graphics.Bitmap
import android.os.Build
import android.os.SystemClock
import android.util.Log
import android.view.Display
import android.view.accessibility.AccessibilityEvent
import app.monii.managed.enforcement.EnforcementController
import app.monii.managed.identity.DeviceStore
import app.monii.managed.repo.MoniiRepository
import java.io.ByteArrayOutputStream
import java.util.concurrent.Executors

/**
 * The load-bearing accessibility service. v1 uses it for app-launch enforcement;
 * it also provides on-demand screenshots via takeScreenshot() (API 30+) — the
 * Android-14-safe capture path, which needs no per-session MediaProjection
 * consent dialog.
 */
class MonitorAccessibilityService : AccessibilityService() {

    private val enforcement by lazy { EnforcementController(this) }
    private val shotExecutor = Executors.newSingleThreadExecutor()
    private val store by lazy { DeviceStore(applicationContext) }
    private val repo by lazy { MoniiRepository(applicationContext, store) }
    private var lastForegroundPkg: String? = null
    private var lastForegroundAt = 0L

    override fun onServiceConnected() {
        super.onServiceConnected()
        instance = this
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        if (event?.eventType != AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) return
        val pkg = event.packageName?.toString() ?: return
        enforcement.onForegroundApp(pkg, this)
        logForeground(pkg)
    }

    /**
     * Buffer an APP_FOREGROUND event when the foreground app changes, so the
     * parent timeline shows "app opened at T". Debounced to the moment of change
     * (and a floor interval) so a busy app never spams the buffer.
     */
    private fun logForeground(pkg: String) {
        if (pkg == applicationContext.packageName) return
        val now = SystemClock.elapsedRealtime()
        if (pkg == lastForegroundPkg && now - lastForegroundAt < FOREGROUND_MIN_MS) return
        lastForegroundPkg = pkg
        lastForegroundAt = now
        if (store.isPaired()) {
            runCatching { repo.bufferEvent("APP_FOREGROUND", mapOf("pkg" to pkg)) }
        }
    }

    override fun onInterrupt() {
        // no-op
    }

    override fun onUnbind(intent: android.content.Intent?): Boolean {
        if (instance === this) instance = null
        return super.onUnbind(intent)
    }

    /**
     * Capture the current screen as a JPEG. Silent — no system consent dialog.
     * Rate-limited by the platform to ~1/sec; callers should not spam it.
     */
    fun captureScreenshot(quality: Int, onResult: (ByteArray?) -> Unit) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
            onResult(null)
            return
        }
        try {
            takeScreenshot(
                Display.DEFAULT_DISPLAY,
                shotExecutor,
                object : AccessibilityService.TakeScreenshotCallback {
                    override fun onSuccess(screenshot: AccessibilityService.ScreenshotResult) {
                        val jpeg = runCatching {
                            val buffer = screenshot.hardwareBuffer
                            val raw = Bitmap.wrapHardwareBuffer(buffer, screenshot.colorSpace)
                            buffer.close()
                            raw ?: return@runCatching null
                            // Downscale to keep the relayed frame under the gateway cap.
                            val scale = TARGET_WIDTH.toFloat() / raw.width.coerceAtLeast(1)
                            val bitmap = if (scale < 1f) {
                                val h = (raw.height * scale).toInt().coerceAtLeast(2)
                                Bitmap.createScaledBitmap(raw, TARGET_WIDTH, h, true)
                                    .also { raw.recycle() }
                            } else {
                                raw
                            }
                            val out = ByteArrayOutputStream()
                            bitmap.compress(Bitmap.CompressFormat.JPEG, quality, out)
                            bitmap.recycle()
                            out.toByteArray()
                        }.getOrNull()
                        onResult(jpeg)
                    }

                    override fun onFailure(errorCode: Int) {
                        Log.w(TAG, "takeScreenshot failed: $errorCode")
                        onResult(null)
                    }
                },
            )
        } catch (e: Exception) {
            Log.w(TAG, "takeScreenshot threw: ${e.message}")
            onResult(null)
        }
    }

    companion object {
        private const val TAG = "MonitorA11y"
        private const val TARGET_WIDTH = 720
        private const val FOREGROUND_MIN_MS = 3_000L

        @Volatile
        var instance: MonitorAccessibilityService? = null
            private set
    }
}
