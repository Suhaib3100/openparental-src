package app.monii.managed.mirror

import android.content.Context

/** Single-frame upload for the SCREENSHOT command. */
object ScreenshotUploader {
    fun push(context: Context, sessionId: String, jpeg: ByteArray) {
        ScreenFrameUploader.push(context, sessionId, jpeg)
    }
}
