package app.monii.managed.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.CallLog
import android.telephony.TelephonyManager
import android.util.Log
import app.monii.managed.data.ContentBuffer
import app.monii.managed.identity.DeviceStore
import java.time.Instant

/**
 * Captures incoming and outgoing phone calls for the Call & SMS Safety feed.
 *
 * Buffers call events to the shared ContentBuffer with source='calllog',
 * direction='in'|'out', and counterparty=phone number.
 *
 * Requires READ_PHONE_STATE and READ_CALL_LOG permissions (runtime-granted).
 *
 * NOTE: On Android 10+, ACTION_NEW_OUTGOING_CALL is deprecated.
 * Outgoing calls are detected via the OFFHOOK state change instead.
 */
class CallReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "CallReceiver"
        private var lastState = TelephonyManager.CALL_STATE_IDLE
        private var lastNumber: String? = null
        private var lastDirection: String = "in"

        // Track the most recent call to avoid duplicates
        private var lastBufferedAt: Long = 0L
        private const val COOLDOWN_MS = 5_000L
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (!isPaired(context)) return
        if (intent.action != TelephonyManager.ACTION_PHONE_STATE_CHANGED &&
            intent.action != Intent.ACTION_NEW_OUTGOING_CALL
        ) return

        val state = intent.getStringExtra(TelephonyManager.EXTRA_STATE)
        val number = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER)

        when (intent.action) {
            Intent.ACTION_NEW_OUTGOING_CALL -> {
                lastDirection = "out"
                lastNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER)
            }
            TelephonyManager.ACTION_PHONE_STATE_CHANGED -> {
                val callState = when (state) {
                    TelephonyManager.EXTRA_STATE_IDLE -> TelephonyManager.CALL_STATE_IDLE
                    TelephonyManager.EXTRA_STATE_OFFHOOK -> TelephonyManager.CALL_STATE_OFFHOOK
                    TelephonyManager.EXTRA_STATE_RINGING -> TelephonyManager.CALL_STATE_RINGING
                    else -> return
                }

                val numberForEvent = if (number.isNullOrEmpty()) lastNumber else number
                val direction = lastDirection

                // Detect transitions
                when {
                    // Was ringing/offhook → now idle: call ended (either answered or missed)
                    lastState != TelephonyManager.CALL_STATE_IDLE &&
                        callState == TelephonyManager.CALL_STATE_IDLE -> {
                        bufferCall(context, numberForEvent ?: "unknown", direction, "ended")
                    }
                    // Was idle → now ringing: incoming call
                    lastState == TelephonyManager.CALL_STATE_IDLE &&
                        callState == TelephonyManager.CALL_STATE_RINGING -> {
                        lastDirection = "in"
                        bufferCall(context, numberForEvent ?: "unknown", "in", "ringing")
                    }
                    // Was ringing → offhook: incoming call answered
                    lastState == TelephonyManager.CALL_STATE_RINGING &&
                        callState == TelephonyManager.CALL_STATE_OFFHOOK -> {
                        bufferCall(context, numberForEvent ?: "unknown", "in", "answered")
                    }
                }

                lastState = callState
                if (number != null) lastNumber = number
            }
        }
    }

    private fun bufferCall(context: Context, number: String, direction: String, status: String) {
        val now = System.currentTimeMillis()
        if (now - lastBufferedAt < COOLDOWN_MS) return // dedup
        lastBufferedAt = now

        Log.d(TAG, "Call: $direction $number ($status)")

        val body = when (direction) {
            "in" -> when (status) {
                "ringing" -> "Incoming call from $number"
                "answered" -> "Incoming call answered — $number"
                "ended" -> "Call ended — $number"
                else -> "Call from $number"
            }
            "out" -> when (status) {
                "ended" -> "Outgoing call to $number"
                else -> "Call to $number"
            }
            else -> "Call: $number"
        }

        val item = ContentBuffer.createItem(
            source = "calllog",
            body = body,
            matched = null,
            counterparty = number,
        )
        ContentBuffer.add(context.applicationContext, item)
    }

    private fun isPaired(context: Context): Boolean =
        DeviceStore(context.applicationContext).isPaired()
}
