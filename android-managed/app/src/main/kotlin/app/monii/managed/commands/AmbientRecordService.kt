package app.monii.managed.commands

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.MediaRecorder
import android.media.MediaScannerConnection
import android.os.Build
import android.os.Environment
import android.os.IBinder
import androidx.core.app.NotificationCompat
import app.monii.managed.R
import java.io.File
import java.time.Instant

/**
 * One-way ambient audio (FlashGet-style live listen). Runs as a foreground
 * service with a visible notification while recording.
 */
class AmbientRecordService : Service() {
    private var recorder: MediaRecorder? = null
    private var outputFile: File? = null

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_START -> startRecording()
            ACTION_STOP -> stopRecording()
        }
        return START_NOT_STICKY
    }

    private fun startRecording() {
        if (recorder != null) return
        val file = File(
            getExternalFilesDir(Environment.DIRECTORY_MUSIC),
            "ambient_${Instant.now().epochSecond}.m4a",
        )
        outputFile = file
        recorder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            MediaRecorder(this)
        } else {
            @Suppress("DEPRECATION")
            MediaRecorder()
        }.apply {
            setAudioSource(MediaRecorder.AudioSource.MIC)
            setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
            setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
            setOutputFile(file.absolutePath)
            prepare()
            start()
        }
        startForeground(NOTIF_ID, buildNotification(true))
    }

    private fun stopRecording() {
        runCatching {
            recorder?.stop()
            recorder?.release()
        }
        recorder = null
        outputFile?.let { f ->
            MediaScannerConnection.scanFile(
                this,
                arrayOf(f.absolutePath),
                arrayOf("audio/mp4"),
                null,
            )
        }
        stopForeground(STOP_FOREGROUND_REMOVE)
        stopSelf()
    }

    private fun buildNotification(recording: Boolean): Notification {
        ensureChannel()
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher)
            .setContentTitle(getString(R.string.fgs_title))
            .setContentText(
                if (recording) getString(R.string.ambient_fgs_recording)
                else getString(R.string.fgs_text),
            )
            .setOngoing(recording)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build()
    }

    private fun ensureChannel() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val nm = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        nm.createNotificationChannel(
            NotificationChannel(
                CHANNEL_ID,
                getString(R.string.ambient_channel_name),
                NotificationManager.IMPORTANCE_LOW,
            ),
        )
    }

    companion object {
        const val ACTION_START = "app.monii.managed.AMBIENT_START"
        const val ACTION_STOP = "app.monii.managed.AMBIENT_STOP"
        private const val CHANNEL_ID = "ambient_record"
        private const val NOTIF_ID = 4102

        fun start(context: Context) {
            val i = Intent(context, AmbientRecordService::class.java).apply {
                action = ACTION_START
            }
            context.startForegroundService(i)
        }

        fun stop(context: Context) {
            val i = Intent(context, AmbientRecordService::class.java).apply {
                action = ACTION_STOP
            }
            context.startService(i)
        }
    }
}
