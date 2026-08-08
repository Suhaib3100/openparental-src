package app.monii.managed.ui

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.media.projection.MediaProjectionManager
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import app.monii.managed.mirror.ScreenMirrorService

/**
 * Transparent relay that only shows the **system** MediaProjection dialog.
 * Used once during setup, or again if the held projection was lost.
 * No Approve/Deny product UI — parent requests stream without kid prompts.
 */
class ScreenMirrorActivity : AppCompatActivity() {

    private var sessionId: String? = null
    private var setupOnly = false

    private val projectionLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK && result.data != null) {
                val data = result.data!!
                val sid = sessionId
                if (setupOnly || sid.isNullOrBlank()) {
                    ScreenMirrorService.bindProjection(this, result.resultCode, data)
                } else {
                    ScreenMirrorService.startWithProjection(this, sid, result.resultCode, data)
                }
            }
            finish()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sessionId = intent.getStringExtra(EXTRA_SESSION_ID)
        setupOnly = intent.getBooleanExtra(EXTRA_SETUP_ONLY, false)

        // If we already hold projection and this is a stream request, just stream.
        val sid = sessionId
        if (!setupOnly && !sid.isNullOrBlank() && ScreenMirrorService.hasProjection) {
            ScreenMirrorService.startStream(this, sid)
            finish()
            return
        }

        val mpm = getSystemService(MediaProjectionManager::class.java)
        projectionLauncher.launch(mpm.createScreenCaptureIntent())
    }

    companion object {
        const val EXTRA_SESSION_ID = "session_id"
        const val EXTRA_SETUP_ONLY = "setup_only"

        fun streamIntent(context: Context, sessionId: String): Intent =
            Intent(context, ScreenMirrorActivity::class.java).apply {
                putExtra(EXTRA_SESSION_ID, sessionId)
                putExtra(EXTRA_SETUP_ONLY, false)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }

        fun setupIntent(context: Context): Intent =
            Intent(context, ScreenMirrorActivity::class.java).apply {
                putExtra(EXTRA_SETUP_ONLY, true)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
    }
}
