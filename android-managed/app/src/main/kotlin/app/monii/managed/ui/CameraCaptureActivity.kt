package app.monii.managed.ui

import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.util.Base64
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import app.monii.managed.data.ContentBuffer
import app.monii.managed.identity.DeviceStore
import app.monii.managed.net.ContentItemDto
import app.monii.managed.repo.MoniiRepository
import java.io.ByteArrayOutputStream
import java.time.Instant
import kotlinx.coroutines.runBlocking

/**
 * Takes a still photo to the URI from [CommandDispatcher], then uploads a
 * downscaled JPEG to the parent content feed (source `camera`).
 */
class CameraCaptureActivity : AppCompatActivity() {

    private val takePicture =
        registerForActivityResult(ActivityResultContracts.TakePicture()) { ok ->
            if (ok) uploadSnapshot()
            finish()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val uriStr = intent.getStringExtra("output_uri")
        val uri = uriStr?.let { Uri.parse(it) }
        if (uri == null) {
            finish()
            return
        }
        takePicture.launch(uri)
    }

    private fun uploadSnapshot() {
        val uriStr = intent.getStringExtra("output_uri") ?: return
        val uri = Uri.parse(uriStr)
        val bytes = contentResolver.openInputStream(uri)?.use { it.readBytes() } ?: return
        val bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.size) ?: return
        val scale = 720f / bmp.width.coerceAtLeast(1)
        val scaled = if (scale < 1f) {
            val h = (bmp.height * scale).toInt().coerceAtLeast(2)
            android.graphics.Bitmap.createScaledBitmap(bmp, 720, h, true).also {
                if (it !== bmp) bmp.recycle()
            }
        } else {
            bmp
        }
        val out = ByteArrayOutputStream()
        scaled.compress(android.graphics.Bitmap.CompressFormat.JPEG, 70, out)
        scaled.recycle()
        val b64 = Base64.encodeToString(out.toByteArray(), Base64.NO_WRAP)
        val item = ContentItemDto(
            source = "camera",
            body = b64,
            matched = "remote_snapshot",
            counterparty = intent.getStringExtra("facing"),
            direction = null,
            occurredAt = Instant.now().toString(),
        )
        ContentBuffer.add(applicationContext, item)
        runBlocking {
            runCatching {
                MoniiRepository(applicationContext, DeviceStore(applicationContext)).flushContent()
            }
        }
    }
}
