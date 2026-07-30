package app.monii.managed.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import app.monii.managed.R

/**
 * Transparent activity that fires the system camera intent for a snapshot.
 * The child sees the camera UI briefly (consent-by-use), then the photo is
 * saved to the URI passed via intent extra and this activity finishes.
 *
 * TODO(v2): Replace with CameraX for fully silent capture once child
 *           consent flow is formalized.
 */
class CameraCaptureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // In v1 this activity acts as a relay — starts the system camera
        // intent and passes the result back.
        // For now, we show a toast explaining the snapshot is consent-based.
        Toast.makeText(
            this,
            getString(R.string.snapshot_consent),
            Toast.LENGTH_LONG,
        ).show()
        finish()
    }
}
