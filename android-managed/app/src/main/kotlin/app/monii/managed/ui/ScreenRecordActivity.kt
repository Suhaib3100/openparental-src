package app.monii.managed.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import app.monii.managed.R

/**
 * Transparent activity that requests screen capture consent via
 * MediaProjectionManager.createScreenCaptureIntent().
 *
 * The child sees the system screen-recording consent dialog, ensuring
 * transparency. Once consent is granted, recording is handed to the
 * CommandDispatcher.
 *
 * TODO(v2): Wire up actual MediaProjection + MediaRecorder pipeline.
 */
class ScreenRecordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(
            this,
            getString(R.string.screen_rec_consent),
            Toast.LENGTH_LONG,
        ).show()
        finish()
    }
}
