package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: AndroidColorFilter.android.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u000b\u001a\u00060\u0001j\u0002`\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000f\u001a\u00060\u0001j\u0002`\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a&\u0010\u0013\u001a\u00060\u0001j\u0002`\n2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0001j\u0002`\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001a*\f\b\u0000\u0010\u001c\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/e2;", "Landroid/graphics/ColorFilter;", "e", "(Landroidx/compose/ui/graphics/e2;)Landroid/graphics/ColorFilter;", "f", "(Landroid/graphics/ColorFilter;)Landroidx/compose/ui/graphics/e2;", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/k1;", "blendMode", "Landroidx/compose/ui/graphics/NativeColorFilter;", "d", "(JI)Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/g2;", "colorMatrix", "a", "([F)Landroid/graphics/ColorFilter;", "multiply", "add", "c", "(JJ)Landroid/graphics/ColorFilter;", "filter", "b", "(Landroid/graphics/ColorFilter;)[F", "", "g", "()Z", "h", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m0 {
    @fg.l
    public static final ColorFilter a(@fg.l float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    @fg.l
    public static final float[] b(@fg.l ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && g()) {
            return j2.f17866a.a((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    @fg.l
    public static final ColorFilter c(long j4, long j5) {
        return new LightingColorFilter(f2.r(j4), f2.r(j5));
    }

    @fg.l
    public static final ColorFilter d(long j4, int i4) {
        return Build.VERSION.SDK_INT >= 29 ? q1.f18009a.a(j4, i4) : new PorterDuffColorFilter(f2.r(j4), f0.d(i4));
    }

    @fg.l
    public static final ColorFilter e(@fg.l e2 e2Var) {
        return e2Var.getNativeColorFilter();
    }

    @fg.l
    public static final e2 f(@fg.l ColorFilter colorFilter) {
        e2 h2Var;
        int colorMultiply;
        int colorAdd;
        if (29 <= Build.VERSION.SDK_INT && i0.a(colorFilter)) {
            return q1.f18009a.b(j0.a(colorFilter));
        }
        if ((colorFilter instanceof LightingColorFilter) && h()) {
            LightingColorFilter lightingColorFilter = (LightingColorFilter) colorFilter;
            colorMultiply = lightingColorFilter.getColorMultiply();
            long b5 = f2.b(colorMultiply);
            colorAdd = lightingColorFilter.getColorAdd();
            h2Var = new v4(b5, f2.b(colorAdd), colorFilter, null);
        } else {
            h2Var = ((colorFilter instanceof ColorMatrixColorFilter) && g()) ? new h2(null, colorFilter, null) : new e2(colorFilter);
        }
        return h2Var;
    }

    public static final boolean g() {
        return 26 <= Build.VERSION.SDK_INT;
    }

    public static final boolean h() {
        return 26 <= Build.VERSION.SDK_INT;
    }
}
