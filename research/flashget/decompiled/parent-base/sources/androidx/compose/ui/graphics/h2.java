package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: ColorFilter.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/h2;", "Landroidx/compose/ui/graphics/e2;", "Landroidx/compose/ui/graphics/g2;", "colorMatrix", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "([FLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/w;)V", "([FLkotlin/jvm/internal/w;)V", "d", "()[F", "targetColorMatrix", "b", "([F)[F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h2 extends e2 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private float[] colorMatrix;

    public /* synthetic */ h2(float[] fArr, ColorFilter colorFilter, kotlin.jvm.internal.w wVar) {
        this(fArr, colorFilter);
    }

    public static /* synthetic */ float[] c(h2 h2Var, float[] fArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fArr = g2.c(null, 1, null);
        }
        return h2Var.b(fArr);
    }

    private final float[] d() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return fArr;
        }
        float[] b5 = m0.b(getNativeColorFilter());
        this.colorMatrix = b5;
        return b5;
    }

    @fg.l
    public final float[] b(@fg.l float[] targetColorMatrix) {
        kotlin.collections.l.H0(d(), targetColorMatrix, 0, 0, 0, 14, null);
        return targetColorMatrix;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof h2) && Arrays.equals(d(), ((h2) other).d());
    }

    public int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        sb.append((Object) (fArr == null ? "null" : g2.v(fArr)));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ h2(float[] fArr, kotlin.jvm.internal.w wVar) {
        this(fArr);
    }

    private h2(float[] fArr) {
        this(fArr, new ColorMatrixColorFilter(fArr));
    }

    private h2(float[] fArr, ColorFilter colorFilter) {
        super(colorFilter);
        this.colorMatrix = fArr;
    }
}
