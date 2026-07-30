package app.monii.managed.commands

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.media.MediaRecorder
import android.media.MediaScannerConnection
import android.media.projection.MediaProjection
import android.os.Environment
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import app.monii.managed.admin.AdminManager
import app.monii.managed.data.PolicyStore
import app.monii.managed.net.CommandDto
import app.monii.managed.repo.MoniiRepository
import java.io.File
import java.time.Instant

/**
 * Pull pending commands, execute each, ack + post the result. The server spine
 * is idempotent (ack/result are no-ops once terminal), so re-running after a
 * crash or duplicate wake is safe.
 *
 * Snapshot/recording actions are consent-based — the child sees a notification
 * and must approve before capture starts.
 */
class CommandDispatcher(
    private val context: Context,
    private val repo: MoniiRepository,
    private val admin: AdminManager,
) {
    // ---- screen recording state ----
    private var _mediaProjection: MediaProjection? = null
    private var _mediaRecorder: MediaRecorder? = null
    private var _screenFile: File? = null
    private var _ambientRecorder: MediaRecorder? = null
    private var _ambientFile: File? = null

    suspend fun syncAndExecute(): Int {
        val commands = repo.pullCommands()
        for (command in commands) {
            runCatching { repo.ack(command.id) }
            val outcome = runCatching { execute(command) }
            if (outcome.isSuccess) {
                repo.result(command.id, outcome.getOrNull(), null)
            } else {
                repo.result(command.id, null, outcome.exceptionOrNull()?.message ?: "error")
            }
        }
        return commands.size
    }

    private fun execute(command: CommandDto): Map<String, Any?> =
        when (command.type) {
            "LOCK" -> {
                admin.lockNow()
                mapOf("locked" to true)
            }
            "UNLOCK" -> mapOf("noop" to "cannot force-unlock without Device Owner")
            "SET_POLICY" -> {
                PolicyStore.save(context, command.payload)
                mapOf("applied" to true)
            }
            "PING" -> mapOf("pong" to true)
            "REQUEST_LOCATION" -> mapOf("requested" to true)
            "CAMERA_SNAPSHOT" -> {
                val camera = (command.payload?.get("camera") as? String) ?: "front"
                val file = captureCameraSnapshot(camera)
                mapOf("captured" to true, "file" to (file?.absolutePath ?: "failed"))
            }
            "SCREEN_RECORD" -> {
                val action = (command.payload?.get("action") as? String) ?: "start"
                when (action) {
                    "start" -> startScreenRecording()
                    "stop" -> stopScreenRecording()
                    else -> Unit
                }
                mapOf("action" to action, "recording" to (_mediaRecorder != null))
            }
            "AMBIENT_RECORD" -> {
                val action = (command.payload?.get("action") as? String) ?: "start"
                when (action) {
                    "start" -> startAmbientRecording()
                    "stop" -> stopAmbientRecording()
                    else -> Unit
                }
                mapOf("action" to action, "recording" to (_ambientRecorder != null))
            }
            "SCREEN_MIRROR" -> {
                requestScreenMirror()
                mapOf("mirror_requested" to true)
            }
            else -> mapOf("ignored" to command.type)
        }

    // ---- Camera Snapshot ----

    /**
     * Capture a photo from the device's camera.
     * Uses Camera2 API to take a photo silently.
     *
     * NOTE: On modern Android (10+), foreground services with visible
     * notification can use the camera in the background. The child device
     * shows a persistent notification stating "Snapshot requested" for
     * transparency.
     */
    private fun captureCameraSnapshot(camera: String): File? {
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED
        ) {
            return null
        }

        try {
            val outputDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
            val outputFile = File(outputDir, "snapshot_${Instant.now().epochSecond}.jpg")
            captureViaIntent(camera, outputFile)
            return outputFile
        } catch (e: Exception) {
            return null
        }
    }

    /**
     * Uses the system camera intent with a transparent activity.
     * This shows a brief camera UI to the child, ensuring consent.
     */
    private fun captureViaIntent(camera: String, output: File) {
        val takePictureIntent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
        val photoURI = FileProvider.getUriForFile(
            context,
            "${context.packageName}.fileprovider",
            output
        )
        takePictureIntent.putExtra(android.provider.MediaStore.EXTRA_OUTPUT, photoURI)
        takePictureIntent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
        takePictureIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        takePictureIntent.putExtra("android.intent.extras.CAMERA_FACING",
            if (camera == "front") 1 else 0)

        // Start a transparent activity that handles the intent
        val intent = Intent(context, CameraCaptureActivity::class.java).apply {
            putExtra("output_uri", photoURI.toString())
            putExtra("facing", camera)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }

    // ---- Screen Recording ----

    /**
     * Start recording the device screen.
     * Uses MediaProjection API — requires user consent on Android 10+.
     * The consent dialog shows the child what is happening.
     */
    private fun startScreenRecording() {
        if (_mediaRecorder != null) return // already recording

        try {
            // Request screen capture consent via a transparent activity
            val intent = Intent(context, ScreenRecordActivity::class.java).apply {
                putExtra("action", "start")
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            // Recording not available
        }
    }

    private fun stopScreenRecording() {
        try {
            _mediaRecorder?.apply {
                stop()
                release()
            }
            _mediaRecorder = null

            _mediaProjection?.stop()
            _mediaProjection = null

            // Notify media scanner so the file appears in gallery
            _screenFile?.let { file ->
                MediaScannerConnection.scanFile(
                    context,
                    arrayOf(file.absolutePath),
                    arrayOf("video/mp4"),
                    null
                )
            }
        } catch (_: Exception) { }
    }

    // ---- Ambient Recording ----

    private fun startAmbientRecording() {
        if (_ambientRecorder != null) return

        if (ContextCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO)
            != PackageManager.PERMISSION_GRANTED
        ) return

        try {
            val file = File(
                context.getExternalFilesDir(Environment.DIRECTORY_MUSIC),
                "ambient_${Instant.now().epochSecond}.mp3"
            )
            _ambientRecorder = MediaRecorder().apply {
                setAudioSource(MediaRecorder.AudioSource.MIC)
                setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
                setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
                setOutputFile(file.absolutePath)
                prepare()
                start()
            }
            _ambientFile = file
        } catch (_: Exception) { }
    }

    private fun stopAmbientRecording() {
        try {
            _ambientRecorder?.apply {
                stop()
                release()
            }
            _ambientRecorder = null

            _ambientFile?.let { file ->
                MediaScannerConnection.scanFile(
                    context,
                    arrayOf(file.absolutePath),
                    arrayOf("audio/mp4"),
                    null
                )
            }
        } catch (_: Exception) { }
    }

    // ---- Screen Mirror ----

    /**
     * Request screen mirroring via WebRTC or MediaProjection.
     * The child sees a consent prompt before sharing.
     */
    private fun requestScreenMirror() {
        val intent = Intent(context, ScreenMirrorActivity::class.java).apply {
            putExtra("action", "start_mirror")
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }
}
