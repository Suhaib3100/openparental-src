package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: DecayAnimationSpec.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/z;", "Landroidx/compose/animation/core/i2;", "typeConverter", "initialValue", "initialVelocity", "b", "(Landroidx/compose/animation/core/z;Landroidx/compose/animation/core/i2;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "(Landroidx/compose/animation/core/z;FF)F", "frictionMultiplier", "absVelocityThreshold", "c", "(FF)Landroidx/compose/animation/core/z;", "Landroidx/compose/animation/core/r0;", "e", "(Landroidx/compose/animation/core/r0;)Landroidx/compose/animation/core/z;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b0 {
    public static final float a(@fg.l z<Float> zVar, float f4, float f5) {
        return ((o) zVar.a(k2.i(kotlin.jvm.internal.a0.f75283a)).d(new o(f4), new o(f5))).getValue();
    }

    public static final <T, V extends s> T b(@fg.l z<T> zVar, @fg.l i2<T, V> i2Var, T t4, T t5) {
        return i2Var.b().invoke(zVar.a(i2Var).d(i2Var.a().invoke(t4), i2Var.a().invoke(t5)));
    }

    @fg.l
    public static final <T> z<T> c(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f4, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f5) {
        return new a0(new t0(f4, f5));
    }

    public static /* synthetic */ z d(float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.1f;
        }
        return c(f4, f5);
    }

    @fg.l
    public static final <T> z<T> e(@fg.l r0 r0Var) {
        return new a0(r0Var);
    }
}
