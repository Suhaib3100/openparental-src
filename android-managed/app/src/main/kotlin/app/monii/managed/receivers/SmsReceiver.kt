package app.monii.managed.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony
import android.telephony.SmsMessage
import android.util.Log
import app.monii.managed.data.ContentBuffer
import app.monii.managed.identity.DeviceStore

/**
 * Captures incoming SMS messages for the Call & SMS Safety feed.
 *
 * Buffers each SMS to the shared ContentBuffer with source='sms',
 * direction='in', counterparty=the sender's phone number.
 *
 * Requires RECEIVE_SMS permission (runtime-granted on Android 6+).
 *
 * NOTE: On Android 19+, Telephony.Sms.Intents.SMS_RECEIVED_ACTION is the
 * standard broadcast. On older devices, android.provider.Telephony
 * SMS_RECEIVED is used.
 */
class SmsReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "SmsReceiver"
        private const val MAX_SMS_BODY = 512
        private const val COOLDOWN_MS = 2_000L
        private var lastBufferedAt: Long = 0L
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (!isPaired(context)) return

        if (intent.action != Telephony.Sms.Intents.SMS_RECEIVED_ACTION) return
        val messages = Telephony.Sms.Intents.getMessagesFromIntent(intent) ?: return

        if (messages.isEmpty()) return

        // Combine multipart SMS into a single body
        val fullBody = messages.joinToString("") { it.messageBody ?: "" }
        val sender = messages.firstOrNull()?.displayOriginatingAddress ?: "unknown"

        Log.d(TAG, "SMS from $sender: ${fullBody.take(80)}...")

        // Dedup rapid-fire broadcasts
        val now = System.currentTimeMillis()
        if (now - lastBufferedAt < COOLDOWN_MS) return
        lastBufferedAt = now

        val item = ContentBuffer.createItem(
            source = "sms",
            body = fullBody.take(MAX_SMS_BODY),
            matched = null,
            counterparty = sender,
        )
        ContentBuffer.add(context.applicationContext, item)
    }

    private fun isPaired(context: Context): Boolean =
        DeviceStore(context.applicationContext).isPaired()
}
