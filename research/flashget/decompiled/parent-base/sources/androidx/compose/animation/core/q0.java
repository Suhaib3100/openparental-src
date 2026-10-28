package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: FloatAnimationSpec.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J/\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/q0;", "Landroidx/compose/animation/core/k;", "", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "d", "(JFFF)F", "e", "c", "(FFF)F", "f", "(FFF)J", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "converter", "Landroidx/compose/animation/core/q2;", "a", "(Landroidx/compose/animation/core/i2;)Landroidx/compose/animation/core/q2;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface q0 extends k<Float> {

    /* compiled from: FloatAnimationSpec.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static float a(@fg.l q0 q0Var, float f4, float f5, float f6) {
            return q0.super.c(f4, f5, f6);
        }

        @fg.l
        @Deprecated
        public static <V extends s> q2<V> b(@fg.l q0 q0Var, @fg.l i2<Float, V> i2Var) {
            return q0.g(q0Var, i2Var);
        }
    }

    static q2 g(q0 q0Var, i2 i2Var) {
        q0Var.getClass();
        return new q2(q0Var);
    }

    default float c(float initialValue, float targetValue, float initialVelocity) {
        return e(f(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    float d(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);

    float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);

    long f(float initialValue, float targetValue, float initialVelocity);

    @Override // androidx.compose.animation.core.k
    @fg.l
    default <V extends s> q2<V> a(@fg.l i2<Float, V> converter) {
        return new q2<>(this);
    }
}
