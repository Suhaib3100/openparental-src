package app.monii.managed.media

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.ServiceInfo
import android.hardware.display.DisplayManager
import android.hardware.display.VirtualDisplay
import android.media.MediaRecorder
import android.media.projection.MediaProjection
import android.media.projection.MediaProjectionManager
import android.os.Build
import android.os.Environment
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowManager
import androidx.core.app.NotificationCompat
import app.monii.managed.R
import java.io.File
import java.time.Instant

/**
 * Screen recording via MediaProjection + [MediaRecorder]. Uploads MP4 to parent
 * feed on stop (FlashGet screen record parity — consent dialog required).
 */
class ScreenRecordService : Service() {

    private var projection: MediaProjection? = null
    private var recorder: MediaRecorder? = null
    private var virtualDisplay: VirtualDisplay? = null
    private var outputFile: File? = null
    private val handler = Handler(Looper.getMainLooper())
    private var recording = false

    private val stopTimeout = Runnable { stopRecording(upload = true) }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_STOP -> {
                stopRecording(upload = true)
                return START_NOT_STICKY
            }
            ACTION_START -> {
                val code = intent.getIntExtra(EXTRA_RESULT_CODE, 0)
                val data = intent.projectionData()
                if (code == 0 || data == null) {
                    stopSelf()
                    return START_NOT_STICKY
                }
                startRecording(code, data)
                return START_STICKY
            }
        }
        return START_NOT_STICKY
    }

    private fun startRecording(resultCode: Int, data: Intent) {
        if (recording) return
        val mpm = getSystemService(MediaProjectionManager::class.java)
        val proj = mpm.getMediaProjection(resultCode, data) ?: run {
            stopSelf()
            return
        }
        projection = proj
        val metrics = displayMetrics()
        val w = metrics.widthPixels
        val h = metrics.heightPixels
        val density = metrics.densityDpi
        val file = File(
            getExternalFilesDir(Environment.DIRECTORY_MOVIES),
            "screen_${Instant.now().epochSecond}.mp4",
        )
        outputFile = file
        val rec = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            MediaRecorder(this)
        } else {
            @Suppress("DEPRECATION")
            MediaRecorder()
        }
        recorder = rec
        try {
            rec.setVideoSource(MediaRecorder.VideoSource.SURFACE)
            rec.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
            rec.setVideoEncoder(MediaRecorder.VideoEncoder.H264)
            rec.setVideoSize(w, h)
            rec.setVideoFrameRate(24)
            rec.setVideoEncodingBitRate(2_000_000)
            rec.setOutputFile(file.absolutePath)
            rec.prepare()
            virtualDisplay = proj.createVirtualDisplay(
                "openparental-record",
                w,
                h,
                density,
                DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR,
                rec.surface,
                null,
                handler,
            )
            rec.start()
            recording = true
            isRecording = true
            startForegroundCompat()
            handler.postDelayed(stopTimeout, MAX_MS)
        } catch (e: Exception) {
            Log.e(TAG, "record start failed", e)
            stopRecording(upload = false)
        }
    }

    private fun stopRecording(upload: Boolean) {
        handler.removeCallbacks(stopTimeout)
        recording = false
        isRecording = false
        runCatching { recorder?.stop() }
        runCatching { recorder?.release() }
        recorder = null
        runCatching { virtualDisplay?.release() }
        virtualDisplay = null
        runCatching { projection?.stop() }
        projection = null
        val file = outputFile
        outputFile = null
        if (upload && file != null && file.isFile) {
            ParentMediaUploader.upload(this, "screen_record", file, "screen_recording")
        }
        stopForeground(STOP_FOREGROUND_REMOVE)
        stopSelf()
    }

    private fun displayMetrics(): DisplayMetrics {
        val m = DisplayMetrics()
        val wm = getSystemService(WindowManager::class.java)
        @Suppress("DEPRECATION")
        wm.defaultDisplay.getRealMetrics(m)
        return m
    }

    private fun startForegroundCompat() {
        ensureChannel()
        val n: Notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher)
            .setContentTitle(getString(R.string.fgs_title))
            .setContentText(getString(R.string.screen_rec_consent))
            .setOngoing(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build()
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(NOTIF_ID, n, ServiceInfo.FOREGROUND_SERVICE_TYPE_MEDIA_PROJECTION)
        } else {
            startForeground(NOTIF_ID, n)
        }
    }

    private fun ensureChannel() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val nm = getSystemService(NotificationManager::class.java)
        nm.createNotificationChannel(
            NotificationChannel(CHANNEL_ID, getString(R.string.fgs_title), NotificationManager.IMPORTANCE_LOW),
        )
    }

    override fun onDestroy() {
        if (recording) stopRecording(upload = true)
        super.onDestroy()
    }

    private fun Intent.projectionData(): Intent? =
        if (Build.VERSION.SDK_INT >= 33) {
            getParcelableExtra(EXTRA_DATA, Intent::class.java)
        } else {
            @Suppress("DEPRECATION")
            getParcelableExtra(EXTRA_DATA)
        }

    companion object {
        private const val TAG = "ScreenRecord"
        private const val CHANNEL_ID = "screen_record"
        private const val NOTIF_ID = 4103
        private const val EXTRA_RESULT_CODE = "result_code"
        private const val EXTRA_DATA = "data"
        private const val MAX_MS = 120_000L

        const val ACTION_START = "app.monii.managed.SCREEN_REC_START"
        const val ACTION_STOP = "app.monii.managed.SCREEN_REC_STOP"

        @Volatile
        var isRecording: Boolean = false
            private set

        fun start(context: Context, resultCode: Int, data: Intent) {
            val i = Intent(context, ScreenRecordService::class.java).apply {
                action = ACTION_START
                putExtra(EXTRA_RESULT_CODE, resultCode)
                putExtra(EXTRA_DATA, data)
            }
            context.startForegroundService(i)
        }

        fun stop(context: Context) {
            val i = Intent(context, ScreenRecordService::class.java).apply {
                action = ACTION_STOP
            }
            context.startForegroundService(i)
        }
    }
}
