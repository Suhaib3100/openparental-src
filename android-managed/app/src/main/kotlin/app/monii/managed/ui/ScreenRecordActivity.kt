package app.monii.managed.ui

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.media.projection.MediaProjectionManager
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import app.monii.managed.media.ScreenRecordService

class ScreenRecordActivity : AppCompatActivity() {

    private val projectionLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK && result.data != null) {
                ScreenRecordService.start(this, result.resultCode, result.data!!)
            }
            finish()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (intent.getStringExtra("action") == "stop") {
            ScreenRecordService.stop(this)
            finish()
            return
        }
        val mpm = getSystemService(MediaProjectionManager::class.java)
        projectionLauncher.launch(mpm.createScreenCaptureIntent())
    }

    companion object {
        fun stopIntent(context: Context): Intent =
            Intent(context, ScreenRecordActivity::class.java).apply {
                putExtra("action", "stop")
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
    }
}
