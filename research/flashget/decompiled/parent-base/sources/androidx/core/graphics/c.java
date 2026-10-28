package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Bitmap.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a.\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a*\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a>\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0087\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010!\u001a\u00020\u0012*\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0086\n¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010$\u001a\u00020\u0012*\u00020\u00002\u0006\u0010 \u001a\u00020#H\u0086\n¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lkotlin/k2;", "Lkotlin/u;", "block", "a", "(Landroid/graphics/Bitmap;Lld/l;)Landroid/graphics/Bitmap;", "", "x", "y", "h", "(Landroid/graphics/Bitmap;II)I", "color", "k", "(Landroid/graphics/Bitmap;III)V", "width", "height", "", "filter", "i", "(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "config", "d", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "e", "(IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;", "Landroid/graphics/Point;", "p", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Point;)Z", "Landroid/graphics/PointF;", "c", "(Landroid/graphics/Bitmap;Landroid/graphics/PointF;)Z", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {
    @fg.l
    public static final Bitmap a(@fg.l Bitmap bitmap, @fg.l ld.l<? super Canvas, k2> lVar) {
        lVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean b(@fg.l Bitmap bitmap, @fg.l Point point) {
        int i4;
        int width = bitmap.getWidth();
        int i5 = point.x;
        return i5 >= 0 && i5 < width && (i4 = point.y) >= 0 && i4 < bitmap.getHeight();
    }

    public static final boolean c(@fg.l Bitmap bitmap, @fg.l PointF pointF) {
        float f4 = pointF.x;
        if (f4 >= 0.0f && f4 < bitmap.getWidth()) {
            float f5 = pointF.y;
            if (f5 >= 0.0f && f5 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @fg.l
    public static final Bitmap d(int i4, int i5, @fg.l Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i5, config);
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final Bitmap e(int i4, int i5, @fg.l Bitmap.Config config, boolean z4, @fg.l ColorSpace colorSpace) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap(i4, i5, config, z4, colorSpace);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap f(int i4, int i5, Bitmap.Config config, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i4, i5, config);
    }

    public static /* synthetic */ Bitmap g(int i4, int i5, Bitmap.Config config, boolean z4, ColorSpace colorSpace, int i6, Object obj) {
        Bitmap createBitmap;
        ColorSpace.Named named;
        if ((i6 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i6 & 8) != 0) {
            z4 = true;
        }
        if ((i6 & 16) != 0) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
        }
        createBitmap = Bitmap.createBitmap(i4, i5, config, z4, colorSpace);
        return createBitmap;
    }

    public static final int h(@fg.l Bitmap bitmap, int i4, int i5) {
        return bitmap.getPixel(i4, i5);
    }

    @fg.l
    public static final Bitmap i(@fg.l Bitmap bitmap, int i4, int i5, boolean z4) {
        return Bitmap.createScaledBitmap(bitmap, i4, i5, z4);
    }

    public static /* synthetic */ Bitmap j(Bitmap bitmap, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z4 = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i4, i5, z4);
    }

    public static final void k(@fg.l Bitmap bitmap, int i4, int i5, @androidx.annotation.l int i6) {
        bitmap.setPixel(i4, i5, i6);
    }
}
