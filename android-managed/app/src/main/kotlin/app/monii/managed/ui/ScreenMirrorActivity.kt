package app.monii.managed.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import app.monii.managed.R

/**
 * Transparent activity that initiates screen mirroring via WebRTC or
 * MediaProjection API.
 *
 * The child sees a consent dialog stating that a parent is requesting
 * to view their screen. Mirroring only starts after explicit approval.
 *
 * TODO(v2): Wire up WebRTC screen sharing transport.
 */
class ScreenMirrorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(
            this,
            getString(R.string.mirror_consent),
            Toast.LENGTH_LONG,
        ).show()
        finish()
    }
}
