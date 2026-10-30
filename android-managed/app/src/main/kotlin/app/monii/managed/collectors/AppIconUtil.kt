package app.monii.managed.collectors

import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.Base64
import java.io.ByteArrayOutputStream

object AppIconUtil {
    private const val SIZE = 48

    fun iconBase64(pm: PackageManager, packageName: String): String? {
        val drawable = runCatching { pm.getApplicationIcon(packageName) }.getOrNull() ?: return null
        val bitmap = drawableToBitmap(drawable) ?: return null
        val scaled = if (bitmap.width == SIZE && bitmap.height == SIZE) {
            bitmap
        } else {
            Bitmap.createScaledBitmap(bitmap, SIZE, SIZE, true).also {
                if (it !== bitmap) bitmap.recycle()
            }
        }
        val out = ByteArrayOutputStream()
        scaled.compress(Bitmap.CompressFormat.PNG, 85, out)
        scaled.recycle()
        return Base64.encodeToString(out.toByteArray(), Base64.NO_WRAP)
    }

    private fun drawableToBitmap(d: Drawable): Bitmap? {
        if (d is BitmapDrawable && d.bitmap != null) return d.bitmap
        val w = if (d.intrinsicWidth > 0) d.intrinsicWidth else SIZE
        val h = if (d.intrinsicHeight > 0) d.intrinsicHeight else SIZE
        val bmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bmp)
        d.setBounds(0, 0, canvas.width, canvas.height)
        d.draw(canvas)
        return bmp
    }
}
