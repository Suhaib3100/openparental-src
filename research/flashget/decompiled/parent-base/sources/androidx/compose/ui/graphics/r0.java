package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.t4;
import kotlin.Metadata;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a:\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroid/graphics/Bitmap;", "Landroidx/compose/ui/graphics/s4;", "c", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/s4;", "", "width", "height", "Landroidx/compose/ui/graphics/t4;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "a", "(IIIZLandroidx/compose/ui/graphics/colorspace/c;)Landroidx/compose/ui/graphics/s4;", "b", "(Landroidx/compose/ui/graphics/s4;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "d", "(I)Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {
    @fg.l
    public static final s4 a(int i4, int i5, int i6, boolean z4, @fg.l androidx.compose.ui.graphics.colorspace.c cVar) {
        Bitmap createBitmap;
        Bitmap.Config d5 = d(i6);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = j1.b(i4, i5, i6, z4, cVar);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i4, i5, d5);
            createBitmap.setHasAlpha(z4);
        }
        return new p0(createBitmap);
    }

    @fg.l
    public static final Bitmap b(@fg.l s4 s4Var) {
        if (s4Var instanceof p0) {
            return ((p0) s4Var).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @fg.l
    public static final s4 c(@fg.l Bitmap bitmap) {
        return new p0(bitmap);
    }

    @fg.l
    public static final Bitmap.Config d(int i4) {
        Bitmap.Config config;
        Bitmap.Config config2;
        t4.Companion companion = t4.INSTANCE;
        companion.getClass();
        if (t4.i(i4, t4.f18042c)) {
            return Bitmap.Config.ARGB_8888;
        }
        companion.getClass();
        if (t4.i(i4, t4.f18043d)) {
            return Bitmap.Config.ALPHA_8;
        }
        companion.getClass();
        if (t4.i(i4, t4.f18044e)) {
            return Bitmap.Config.RGB_565;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            companion.getClass();
            if (t4.i(i4, t4.f18045f)) {
                config2 = Bitmap.Config.RGBA_F16;
                return config2;
            }
        }
        if (i5 >= 26) {
            companion.getClass();
            if (t4.i(i4, t4.f18046g)) {
                config = Bitmap.Config.HARDWARE;
                return config;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int e(@fg.l Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            t4.INSTANCE.getClass();
            return t4.f18043d;
        }
        if (config == Bitmap.Config.RGB_565) {
            t4.INSTANCE.getClass();
            return t4.f18044e;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            t4.INSTANCE.getClass();
            return t4.f18042c;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                t4.INSTANCE.getClass();
                return t4.f18045f;
            }
        }
        if (i4 >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                t4.INSTANCE.getClass();
                return t4.f18046g;
            }
        }
        t4.INSTANCE.getClass();
        return t4.f18042c;
    }
}
