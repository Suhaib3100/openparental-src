package app.monii.managed.collectors

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.provider.MediaStore
import androidx.core.content.ContextCompat
import app.monii.managed.net.PhotoFlagItemDto
import app.monii.managed.repo.MoniiRepository
import java.time.Instant

/**
 * Album safety (FlashGet-style signal): detect new gallery items via MediaStore
 * metadata only — category + time, never image bytes (see PhotoFlag model).
 */
class PhotoAlbumCollector(context: Context) {
    private val appContext = context.applicationContext
    private val prefs =
        appContext.getSharedPreferences("monii_photos", Context.MODE_PRIVATE)

    suspend fun collect(repo: MoniiRepository) {
        if (!hasMediaPermission()) return
        val sinceSec = prefs.getLong("last_scan_sec", 0L)
        val nowSec = Instant.now().epochSecond
        val flags = mutableListOf<PhotoFlagItemDto>()
        val uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        val projection = arrayOf(
            MediaStore.Images.Media.DATE_ADDED,
            MediaStore.Images.Media.DISPLAY_NAME,
            MediaStore.Images.Media.BUCKET_DISPLAY_NAME,
        )
        val selection = if (sinceSec > 0) "${MediaStore.Images.Media.DATE_ADDED} > ?" else null
        val args = if (sinceSec > 0) arrayOf(sinceSec.toString()) else null
        appContext.contentResolver.query(
            uri,
            projection,
            selection,
            args,
            "${MediaStore.Images.Media.DATE_ADDED} ASC LIMIT 80",
        )?.use { c ->
            val dateCol = c.getColumnIndexOrThrow(MediaStore.Images.Media.DATE_ADDED)
            val nameCol = c.getColumnIndexOrThrow(MediaStore.Images.Media.DISPLAY_NAME)
            val bucketCol = c.getColumnIndexOrThrow(MediaStore.Images.Media.BUCKET_DISPLAY_NAME)
            while (c.moveToNext()) {
                val added = c.getLong(dateCol)
                val name = c.getString(nameCol)?.lowercase() ?: ""
                val bucket = c.getString(bucketCol)?.lowercase() ?: ""
                val category = when {
                    name.contains("screenshot") || bucket.contains("screenshot") -> "screenshot"
                    bucket.contains("camera") || name.startsWith("img_") -> "camera"
                    bucket.contains("download") -> "download"
                    else -> "gallery"
                }
                val occurredAt = Instant.ofEpochSecond(added).toString()
                flags.add(PhotoFlagItemDto(category, 1.0, occurredAt))
            }
        }
        if (flags.isNotEmpty()) {
            repo.ingestPhotoFlags(flags)
        }
        prefs.edit().putLong("last_scan_sec", nowSec).apply()
    }

    private fun hasMediaPermission(): Boolean {
        val perm = if (Build.VERSION.SDK_INT >= 33) {
            android.Manifest.permission.READ_MEDIA_IMAGES
        } else {
            @Suppress("DEPRECATION")
            android.Manifest.permission.READ_EXTERNAL_STORAGE
        }
        return ContextCompat.checkSelfPermission(appContext, perm) ==
            PackageManager.PERMISSION_GRANTED
    }
}
