package androidx.compose.animation.core;

import androidx.compose.animation.core.c1;
import androidx.compose.animation.core.e1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a:\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u001a\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a:\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u001a\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b \u0010!\u001aH\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\u0004\b\u0000\u0010\u00002\u0006\u0010\"\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a;\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\u0004\b\u0000\u0010\u00002\u0006\u0010\"\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b,\u0010-\u001a@\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0004\b\u0000\u0010\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a3\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0004\b\u0000\u0010\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b1\u00102\u001a%\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "data", "b", "(Landroidx/compose/animation/core/i2;Ljava/lang/Object;)Landroidx/compose/animation/core/s;", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/d0;", "easing", "Landroidx/compose/animation/core/h2;", "q", "(IILandroidx/compose/animation/core/d0;)Landroidx/compose/animation/core/h2;", "", "dampingRatio", "stiffness", "visibilityThreshold", "Landroidx/compose/animation/core/y1;", "o", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/y1;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/c1$b;", "Lkotlin/k2;", "Lkotlin/u;", "init", "Landroidx/compose/animation/core/c1;", "g", "(Lld/l;)Landroidx/compose/animation/core/c1;", "Landroidx/compose/animation/core/e1$a;", "Landroidx/compose/animation/core/e1;", "h", "(Lld/l;)Landroidx/compose/animation/core/e1;", "iterations", "Landroidx/compose/animation/core/c0;", "animation", "Landroidx/compose/animation/core/q1;", "repeatMode", "Landroidx/compose/animation/core/z1;", "initialStartOffset", "Landroidx/compose/animation/core/r1;", "k", "(ILandroidx/compose/animation/core/c0;Landroidx/compose/animation/core/q1;J)Landroidx/compose/animation/core/r1;", "i", "(ILandroidx/compose/animation/core/c0;Landroidx/compose/animation/core/q1;)Landroidx/compose/animation/core/r1;", "Landroidx/compose/animation/core/x0;", "e", "(Landroidx/compose/animation/core/c0;Landroidx/compose/animation/core/q1;J)Landroidx/compose/animation/core/x0;", "c", "(Landroidx/compose/animation/core/c0;Landroidx/compose/animation/core/q1;)Landroidx/compose/animation/core/x0;", "Landroidx/compose/animation/core/t1;", "m", "(I)Landroidx/compose/animation/core/t1;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends s> V b(i2<T, V> i2Var, T t4) {
        if (t4 == null) {
            return null;
        }
        return i2Var.a().invoke(t4);
    }

    @x4
    @kotlin.k(level = kotlin.m.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ x0 c(c0 c0Var, q1 q1Var) {
        return new x0(c0Var, q1Var, z1.d(0, 0, 2, null), (kotlin.jvm.internal.w) null);
    }

    public static /* synthetic */ x0 d(c0 c0Var, q1 q1Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            q1Var = q1.Restart;
        }
        return c(c0Var, q1Var);
    }

    @x4
    @fg.l
    public static final <T> x0<T> e(@fg.l c0<T> c0Var, @fg.l q1 q1Var, long j4) {
        return new x0<>(c0Var, q1Var, j4, (kotlin.jvm.internal.w) null);
    }

    public static /* synthetic */ x0 f(c0 c0Var, q1 q1Var, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            q1Var = q1.Restart;
        }
        if ((i4 & 4) != 0) {
            j4 = z1.d(0, 0, 2, null);
        }
        return e(c0Var, q1Var, j4);
    }

    @x4
    @fg.l
    public static final <T> c1<T> g(@fg.l ld.l<? super c1.b<T>, kotlin.k2> lVar) {
        c1.b bVar = new c1.b();
        lVar.invoke(bVar);
        return new c1<>(bVar);
    }

    @n0
    @x4
    @fg.l
    public static final <T> e1<T> h(@fg.l ld.l<? super e1.a<T>, kotlin.k2> lVar) {
        e1.a aVar = new e1.a(null);
        lVar.invoke(aVar);
        return new e1<>(aVar);
    }

    @x4
    @kotlin.k(level = kotlin.m.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ r1 i(int i4, c0 c0Var, q1 q1Var) {
        return new r1(i4, c0Var, q1Var, z1.d(0, 0, 2, null), (kotlin.jvm.internal.w) null);
    }

    public static /* synthetic */ r1 j(int i4, c0 c0Var, q1 q1Var, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            q1Var = q1.Restart;
        }
        return i(i4, c0Var, q1Var);
    }

    @x4
    @fg.l
    public static final <T> r1<T> k(int i4, @fg.l c0<T> c0Var, @fg.l q1 q1Var, long j4) {
        return new r1<>(i4, c0Var, q1Var, j4, (kotlin.jvm.internal.w) null);
    }

    public static /* synthetic */ r1 l(int i4, c0 c0Var, q1 q1Var, long j4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            q1Var = q1.Restart;
        }
        if ((i5 & 8) != 0) {
            j4 = z1.d(0, 0, 2, null);
        }
        return k(i4, c0Var, q1Var, j4);
    }

    @x4
    @fg.l
    public static final <T> t1<T> m(int i4) {
        return new t1<>(i4);
    }

    public static t1 n(int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return new t1(i4);
    }

    @x4
    @fg.l
    public static final <T> y1<T> o(float f4, float f5, @fg.m T t4) {
        return new y1<>(f4, f5, t4);
    }

    public static y1 p(float f4, float f5, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 1500.0f;
        }
        if ((i4 & 4) != 0) {
            obj = null;
        }
        return new y1(f4, f5, obj);
    }

    @x4
    @fg.l
    public static final <T> h2<T> q(int i4, int i5, @fg.l d0 d0Var) {
        return new h2<>(i4, i5, d0Var);
    }

    public static h2 r(int i4, int i5, d0 d0Var, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 300;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            d0Var = m0.d();
        }
        return new h2(i4, i5, d0Var);
    }
}
