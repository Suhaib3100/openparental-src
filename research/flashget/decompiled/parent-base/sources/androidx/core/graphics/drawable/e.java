package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Drawable.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u00012\b\b\u0003\u0010\f\u001a\u00020\u00012\b\b\u0003\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "c", "left", "top", "right", "bottom", "Lkotlin/k2;", "e", "(Landroid/graphics/drawable/Drawable;IIII)V", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n37#2,31:119\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119,31\n*E\n"})
/* loaded from: classes3.dex */
public final class e {
    @fg.l
    public static final Bitmap a(@fg.l Drawable drawable, @u0 int i4, @u0 int i5, @fg.m Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i4 == bitmapDrawable.getBitmap().getWidth() && i5 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i4, i5, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i6 = bounds.left;
        int i7 = bounds.top;
        int i10 = bounds.right;
        int i11 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i4, i5, config);
        drawable.setBounds(0, 0, i4, i5);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i6, i7, i10, i11);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap b(Drawable drawable, int i4, int i5, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = drawable.getIntrinsicWidth();
        }
        if ((i6 & 2) != 0) {
            i5 = drawable.getIntrinsicHeight();
        }
        if ((i6 & 4) != 0) {
            config = null;
        }
        return a(drawable, i4, i5, config);
    }

    @fg.m
    public static final Bitmap c(@fg.l Drawable drawable, @u0 int i4, @u0 int i5, @fg.m Bitmap.Config config) {
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return a(drawable, i4, i5, config);
    }

    public static /* synthetic */ Bitmap d(Drawable drawable, int i4, int i5, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = drawable.getIntrinsicWidth();
        }
        if ((i6 & 2) != 0) {
            i5 = drawable.getIntrinsicHeight();
        }
        if ((i6 & 4) != 0) {
            config = null;
        }
        return c(drawable, i4, i5, config);
    }

    public static final void e(@fg.l Drawable drawable, @u0 int i4, @u0 int i5, @u0 int i6, @u0 int i7) {
        drawable.setBounds(i4, i5, i6, i7);
    }

    public static void f(Drawable drawable, int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = drawable.getBounds().left;
        }
        if ((i10 & 2) != 0) {
            i5 = drawable.getBounds().top;
        }
        if ((i10 & 4) != 0) {
            i6 = drawable.getBounds().right;
        }
        if ((i10 & 8) != 0) {
            i7 = drawable.getBounds().bottom;
        }
        drawable.setBounds(i4, i5, i6, i7);
    }
}
