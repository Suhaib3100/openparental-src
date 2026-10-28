package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import androidx.compose.ui.graphics.h6;
import kotlin.Metadata;

/* compiled from: AndroidPathEffect.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0016\u0010\u001b\u001a\u00020\u001a*\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/h5;", "Landroid/graphics/PathEffect;", "e", "(Landroidx/compose/ui/graphics/h5;)Landroid/graphics/PathEffect;", "g", "(Landroid/graphics/PathEffect;)Landroidx/compose/ui/graphics/h5;", "", "radius", "b", "(F)Landroidx/compose/ui/graphics/h5;", "", "intervals", "phase", "c", "([FF)Landroidx/compose/ui/graphics/h5;", "outer", "inner", "a", "(Landroidx/compose/ui/graphics/h5;Landroidx/compose/ui/graphics/h5;)Landroidx/compose/ui/graphics/h5;", "Landroidx/compose/ui/graphics/g5;", "shape", "advance", "Landroidx/compose/ui/graphics/h6;", "style", "d", "(Landroidx/compose/ui/graphics/g5;FFI)Landroidx/compose/ui/graphics/h5;", "Landroid/graphics/PathDashPathEffect$Style;", "f", "(I)Landroid/graphics/PathDashPathEffect$Style;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidPathEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,67:1\n35#2,5:68\n*S KotlinDebug\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n*L\n53#1:68,5\n*E\n"})
/* loaded from: classes.dex */
public final class x0 {
    @fg.l
    public static final h5 a(@fg.l h5 h5Var, @fg.l h5 h5Var2) {
        kotlin.jvm.internal.l0.n(h5Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        PathEffect nativePathEffect = ((w0) h5Var).getNativePathEffect();
        kotlin.jvm.internal.l0.n(h5Var2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new w0(new ComposePathEffect(nativePathEffect, ((w0) h5Var2).getNativePathEffect()));
    }

    @fg.l
    public static final h5 b(float f4) {
        return new w0(new CornerPathEffect(f4));
    }

    @fg.l
    public static final h5 c(@fg.l float[] fArr, float f4) {
        return new w0(new DashPathEffect(fArr, f4));
    }

    @fg.l
    public static final h5 d(@fg.l g5 g5Var, float f4, float f5, int i4) {
        if (g5Var instanceof v0) {
            return new w0(new PathDashPathEffect(((v0) g5Var).getInternalPath(), f4, f5, f(i4)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @fg.l
    public static final PathEffect e(@fg.l h5 h5Var) {
        kotlin.jvm.internal.l0.n(h5Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((w0) h5Var).getNativePathEffect();
    }

    @fg.l
    public static final PathDashPathEffect.Style f(int i4) {
        h6.Companion companion = h6.INSTANCE;
        companion.getClass();
        if (h6.g(i4, h6.f17849e)) {
            return PathDashPathEffect.Style.MORPH;
        }
        companion.getClass();
        if (h6.g(i4, h6.f17848d)) {
            return PathDashPathEffect.Style.ROTATE;
        }
        companion.getClass();
        return h6.g(i4, h6.f17847c) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    @fg.l
    public static final h5 g(@fg.l PathEffect pathEffect) {
        return new w0(pathEffect);
    }
}
