package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;

/* compiled from: Bitmap.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u001a\u001d\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\n\u001a'\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0086\n\u001a'\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086\b\u001a#\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086\b\u001a7\u0010\u0018\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0087\b\u001a\u0015\u0010\u001b\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086\n\u001a\u0015\u0010\u001d\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001cH\u0086\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lkotlin/m2;", "Lkotlin/u;", "block", "a", "", "x", "y", "h", "color", "k", "width", "height", "", "filter", "i", "Landroid/graphics/Bitmap$Config;", "config", "d", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "e", "Landroid/graphics/Point;", "p", "b", "Landroid/graphics/PointF;", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class n {
    @d5.d
    public static final Bitmap a(@d5.d Bitmap bitmap, @d5.d q3.l<? super Canvas, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(bitmap, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        block.N(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean b(@d5.d Bitmap bitmap, @d5.d Point p5) {
        int i5;
        kotlin.jvm.internal.l0.p(bitmap, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        int i6 = p5.x;
        return i6 >= 0 && i6 < bitmap.getWidth() && (i5 = p5.y) >= 0 && i5 < bitmap.getHeight();
    }

    public static final boolean c(@d5.d Bitmap bitmap, @d5.d PointF p5) {
        kotlin.jvm.internal.l0.p(bitmap, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        float f6 = p5.x;
        if (f6 >= 0.0f && f6 < bitmap.getWidth()) {
            float f7 = p5.y;
            if (f7 >= 0.0f && f7 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @d5.d
    public static final Bitmap d(int i5, int i6, @d5.d Bitmap.Config config) {
        kotlin.jvm.internal.l0.p(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i5, i6, config);
        kotlin.jvm.internal.l0.o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @androidx.annotation.x0(26)
    @d5.d
    public static final Bitmap e(int i5, int i6, @d5.d Bitmap.Config config, boolean z5, @d5.d ColorSpace colorSpace) {
        Bitmap createBitmap;
        kotlin.jvm.internal.l0.p(config, "config");
        kotlin.jvm.internal.l0.p(colorSpace, "colorSpace");
        createBitmap = Bitmap.createBitmap(i5, i6, config, z5, colorSpace);
        kotlin.jvm.internal.l0.o(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap f(int i5, int i6, Bitmap.Config config, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        kotlin.jvm.internal.l0.p(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i5, i6, config);
        kotlin.jvm.internal.l0.o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap g(int i5, int i6, Bitmap.Config config, boolean z5, ColorSpace colorSpace, int i7, Object obj) {
        Bitmap createBitmap;
        ColorSpace.Named named;
        if ((i7 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i7 & 8) != 0) {
            z5 = true;
        }
        if ((i7 & 16) != 0) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            kotlin.jvm.internal.l0.o(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        kotlin.jvm.internal.l0.p(config, "config");
        kotlin.jvm.internal.l0.p(colorSpace, "colorSpace");
        createBitmap = Bitmap.createBitmap(i5, i6, config, z5, colorSpace);
        kotlin.jvm.internal.l0.o(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static final int h(@d5.d Bitmap bitmap, int i5, int i6) {
        kotlin.jvm.internal.l0.p(bitmap, "<this>");
        return bitmap.getPixel(i5, i6);
    }

    @d5.d
    public static final Bitmap i(@d5.d Bitmap bitmap, int i5, int i6, boolean z5) {
        kotlin.jvm.internal.l0.p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i5, i6, z5);
        kotlin.jvm.internal.l0.o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap j(Bitmap bitmap, int i5, int i6, boolean z5, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z5 = true;
        }
        kotlin.jvm.internal.l0.p(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i5, i6, z5);
        kotlin.jvm.internal.l0.o(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static final void k(@d5.d Bitmap bitmap, int i5, int i6, @androidx.annotation.l int i7) {
        kotlin.jvm.internal.l0.p(bitmap, "<this>");
        bitmap.setPixel(i5, i6, i7);
    }
}
