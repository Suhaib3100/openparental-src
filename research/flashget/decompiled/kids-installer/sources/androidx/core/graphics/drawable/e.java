package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Drawable.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a2\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00012\b\b\u0003\u0010\t\u001a\u00020\u00012\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u0001¨\u0006\u000e"}, d2 = {"Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "a", "left", "top", "right", "bottom", "Lkotlin/m2;", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class e {
    @d5.d
    public static final Bitmap a(@d5.d Drawable drawable, @u0 int i5, @u0 int i6, @d5.e Bitmap.Config config) {
        l0.p(drawable, "<this>");
        if ((drawable instanceof BitmapDrawable) && (config == null || ((BitmapDrawable) drawable).getBitmap().getConfig() == config)) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (i5 == bitmapDrawable.getBitmap().getWidth() && i6 == bitmapDrawable.getBitmap().getHeight()) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                l0.o(bitmap, "bitmap");
                return bitmap;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i5, i6, true);
            l0.o(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
            return createScaledBitmap;
        }
        Rect bounds = drawable.getBounds();
        l0.o(bounds, "bounds");
        int i7 = bounds.left;
        int i8 = bounds.top;
        int i9 = bounds.right;
        int i10 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmap2 = Bitmap.createBitmap(i5, i6, config);
        drawable.setBounds(0, 0, i5, i6);
        drawable.draw(new Canvas(bitmap2));
        drawable.setBounds(i7, i8, i9, i10);
        l0.o(bitmap2, "bitmap");
        return bitmap2;
    }

    public static /* synthetic */ Bitmap b(Drawable drawable, int i5, int i6, Bitmap.Config config, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = drawable.getIntrinsicWidth();
        }
        if ((i7 & 2) != 0) {
            i6 = drawable.getIntrinsicHeight();
        }
        if ((i7 & 4) != 0) {
            config = null;
        }
        return a(drawable, i5, i6, config);
    }

    public static final void c(@d5.d Drawable drawable, @u0 int i5, @u0 int i6, @u0 int i7, @u0 int i8) {
        l0.p(drawable, "<this>");
        drawable.setBounds(i5, i6, i7, i8);
    }

    public static /* synthetic */ void d(Drawable drawable, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = drawable.getBounds().left;
        }
        if ((i9 & 2) != 0) {
            i6 = drawable.getBounds().top;
        }
        if ((i9 & 4) != 0) {
            i7 = drawable.getBounds().right;
        }
        if ((i9 & 8) != 0) {
            i8 = drawable.getBounds().bottom;
        }
        c(drawable, i5, i6, i7, i8);
    }
}
