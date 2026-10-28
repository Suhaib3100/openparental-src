package app.monii.installer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import app.monii.installer.databinding.ActivityMainBinding
import java.io.File

/**
 * FlashGet `kids-installer` flow (see research/flashget/decompiled/kids-installer).
 * Downloads / opens the OpenParental child APK URL, then prompts to install
 * [app.monii.managed].
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDownload.setOnClickListener { openChildApkUrl() }
        binding.btnOpenManaged.setOnClickListener { launchManagedIfInstalled() }
    }

    private fun openChildApkUrl() {
        val uri = Uri.parse(BuildConfig.CHILD_APK_URL)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
        Toast.makeText(this, R.string.toast_download_started, Toast.LENGTH_LONG).show()
    }

    private fun launchManagedIfInstalled() {
        val launch = packageManager.getLaunchIntentForPackage(BuildConfig.MANAGED_PACKAGE)
        if (launch != null) {
            startActivity(launch)
            return
        }
        Toast.makeText(this, R.string.toast_install_child_first, Toast.LENGTH_LONG).show()
    }

    /** Reserved for future: install a downloaded local APK via FileProvider. */
    @Suppress("unused")
    private fun promptInstallLocal(apk: File) {
        val uri = FileProvider.getUriForFile(this, "$packageName.fileprovider", apk)
        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(uri, "application/vnd.android.package-archive")
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        startActivity(intent)
    }
}
