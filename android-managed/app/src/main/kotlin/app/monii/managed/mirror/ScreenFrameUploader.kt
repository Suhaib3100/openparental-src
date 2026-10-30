package app.monii.managed.mirror

import android.content.Context
import android.util.Base64
import android.util.Log
import app.monii.managed.identity.DeviceStore
import app.monii.managed.repo.MoniiRepository
import kotlinx.coroutines.runBlocking

/** Push JPEG frames over REST (works with Vercel serverless + NestJS). */
object ScreenFrameUploader {
    private const val TAG = "ScreenFrameUpload"

    fun push(context: Context, sessionId: String, jpeg: ByteArray): Boolean {
        if (sessionId.isBlank() || jpeg.isEmpty()) return false
        val b64 = Base64.encodeToString(jpeg, Base64.NO_WRAP)
        return runBlocking {
            runCatching {
                MoniiRepository(context, DeviceStore(context)).uploadScreenFrame(sessionId, b64)
            }.onFailure { Log.w(TAG, "upload failed: ${it.message}") }
                .isSuccess
        }
    }
}
