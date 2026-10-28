package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/o2;", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/p2;", "initialValue", "targetValue", "initialVelocity", "", "b", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)J", "", "g", "()I", "durationMillis", "e", "delayMillis", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface o2<V extends s> extends p2<V> {

    /* compiled from: VectorizedAnimationSpec.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static <V extends s> long a(@fg.l o2<V> o2Var, @fg.l V v4, @fg.l V v5, @fg.l V v6) {
            return o2.super.b(v4, v5, v6);
        }

        @fg.l
        @Deprecated
        public static <V extends s> V b(@fg.l o2<V> o2Var, @fg.l V v4, @fg.l V v5, @fg.l V v6) {
            return (V) o2.super.f(v4, v5, v6);
        }

        @Deprecated
        public static <V extends s> boolean c(@fg.l o2<V> o2Var) {
            o2Var.getClass();
            return false;
        }
    }

    static boolean k(o2 o2Var) {
        o2Var.getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.l2
    default long b(@fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return (g() + e()) * 1000000;
    }

    int e();

    int g();
}
