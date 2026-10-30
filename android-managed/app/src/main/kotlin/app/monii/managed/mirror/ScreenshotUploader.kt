package app.monii.managed.mirror

import android.content.Context
import android.util.Base64
import android.util.Log
import app.monii.managed.identity.DeviceStore
import io.socket.client.IO
import io.socket.client.Socket
import org.json.JSONObject
import java.net.URI

/**
 * Pushes a single JPEG frame to a screen session over the backend's /screen
 * Socket.IO gateway, then disconnects. Used by the on-demand SCREENSHOT command,
 * which captures via the accessibility service (no MediaProjection consent).
 */
object ScreenshotUploader {
    private const val TAG = "ScreenshotUploader"

    fun push(context: Context, sessionId: String, jpeg: ByteArray) {
        if (sessionId.isBlank()) return
        val store = DeviceStore(context)
        val token = store.token() ?: return
        val base = store.baseUrl().trimEnd('/')
        val data = Base64.encodeToString(jpeg, Base64.NO_WRAP)

        val opts = IO.Options.builder()
            .setAuth(mapOf("token" to token))
            .setTransports(arrayOf("websocket", "polling"))
            .build()
        val socket = runCatching { IO.socket(URI.create("$base/screen"), opts) }.getOrNull() ?: return

        socket.on(Socket.EVENT_CONNECT) {
            socket.emit("join", JSONObject().put("sessionId", sessionId))
            socket.emit(
                "frame",
                JSONObject().put("sessionId", sessionId).put("data", data),
            )
            // Give the emit a moment to flush, then tear down.
            Thread {
                Thread.sleep(600)
                runCatching { socket.disconnect(); socket.off() }
            }.apply { isDaemon = true }.start()
        }
        socket.on(Socket.EVENT_CONNECT_ERROR) {
            Log.w(TAG, "screen socket connect error")
            runCatching { socket.disconnect() }
        }
        runCatching { socket.connect() }
    }
}
