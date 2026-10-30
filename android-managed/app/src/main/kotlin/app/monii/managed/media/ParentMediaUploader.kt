package app.monii.managed.media

import android.content.Context
import android.util.Base64
import app.monii.managed.data.ContentBuffer
import app.monii.managed.identity.DeviceStore
import app.monii.managed.net.ContentItemDto
import app.monii.managed.repo.MoniiRepository
import java.io.File
import java.time.Instant
import kotlinx.coroutines.runBlocking

/** Push a captured media file to the parent content feed (base64 in body). */
object ParentMediaUploader {
    /** ~1.2MB raw ≈ fits serverless JSON limits after base64. */
    private const val MAX_BYTES = 1_200_000

    fun upload(context: Context, source: String, file: File, label: String) {
        if (!file.isFile) return
        val bytes = file.readBytes()
        val clipped = if (bytes.size > MAX_BYTES) bytes.copyOf(MAX_BYTES) else bytes
        val b64 = Base64.encodeToString(clipped, Base64.NO_WRAP)
        ContentBuffer.add(
            context,
            ContentItemDto(
                source = source,
                body = b64,
                matched = label,
                counterparty = file.name,
                direction = if (bytes.size > MAX_BYTES) "truncated" else null,
                occurredAt = Instant.now().toString(),
            ),
        )
        runBlocking {
            runCatching {
                MoniiRepository(context, DeviceStore(context)).flushContent()
            }
        }
    }
}
