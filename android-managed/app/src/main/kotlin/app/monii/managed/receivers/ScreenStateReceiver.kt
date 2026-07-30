package app.monii.managed.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import app.monii.managed.data.EventBuffer
import app.monii.managed.identity.DeviceStore
import app.monii.managed.net.EventInputDto
import java.time.Instant

/**
 * Captures screen on/off and unlock events for the Usage Logs timeline.
 *
 * These events are buffered locally and flushed to the backend via
 * MoniiRepository.flushEvents() on the next sync cycle.
 *
 * Events emitted:
 *   - SCREEN_TIME { action: "LOCK" }       — screen turned off
 *   - SCREEN_TIME { action: "UNLOCK" }     — device unlocked (user present)
 *   - SCREEN_TIME { action: "SCREEN_ON" }  — screen turned on (may be lockscreen)
 */
class ScreenStateReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "ScreenState"
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (!isPaired(context)) return

        val action = when (intent.action) {
            Intent.ACTION_SCREEN_OFF -> "LOCK"
            Intent.ACTION_USER_PRESENT -> "UNLOCK"
            Intent.ACTION_SCREEN_ON -> "SCREEN_ON"
            else -> return
        }

        Log.d(TAG, "Screen event: $action")
        val buffer = EventBuffer(context.applicationContext)
        buffer.add(
            EventInputDto(
                type = "SCREEN_TIME",
                data = mapOf("action" to action),
                occurredAt = Instant.now().toString(),
            ),
        )
    }

    private fun isPaired(context: Context): Boolean =
        DeviceStore(context.applicationContext).isPaired()
}
