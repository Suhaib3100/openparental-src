package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.x4;
import androidx.compose.ui.platform.s5;
import kotlin.Metadata;

/* compiled from: SuspendingPointerInputFilter.kt */
@kotlin.coroutines.j
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/input/pointer/p;", "u3", "(Landroidx/compose/ui/input/pointer/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "P6", "(JLld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k5", "Landroidx/compose/ui/unit/u;", "c", "()J", "size", "Li0/n;", "B", "extendedTouchPadding", "v3", "()Landroidx/compose/ui/input/pointer/p;", "currentEvent", "Landroidx/compose/ui/platform/s5;", "d", "()Landroidx/compose/ui/platform/s5;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c extends androidx.compose.ui.unit.d {

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static long b(@fg.l c cVar) {
            return c.super.B();
        }

        @x4
        @Deprecated
        public static int c(@fg.l c cVar, long j4) {
            return c.super.J5(j4);
        }

        @x4
        @Deprecated
        public static int d(@fg.l c cVar, float f4) {
            return c.super.q2(f4);
        }

        @x4
        @Deprecated
        public static float e(@fg.l c cVar, long j4) {
            return c.super.i(j4);
        }

        @x4
        @Deprecated
        public static float f(@fg.l c cVar, float f4) {
            return c.super.S(f4);
        }

        @x4
        @Deprecated
        public static float g(@fg.l c cVar, int i4) {
            return c.super.R(i4);
        }

        @x4
        @Deprecated
        public static long h(@fg.l c cVar, long j4) {
            return c.super.n(j4);
        }

        @x4
        @Deprecated
        public static float i(@fg.l c cVar, long j4) {
            return c.super.J2(j4);
        }

        @x4
        @Deprecated
        public static float j(@fg.l c cVar, float f4) {
            return cVar.getDensity() * f4;
        }

        @x4
        @fg.l
        @Deprecated
        public static i0.i k(@fg.l c cVar, @fg.l androidx.compose.ui.unit.k kVar) {
            return c.super.c5(kVar);
        }

        @x4
        @Deprecated
        public static long l(@fg.l c cVar, long j4) {
            return c.super.d0(j4);
        }

        @x4
        @Deprecated
        public static long m(@fg.l c cVar, float f4) {
            return c.super.h(f4);
        }

        @x4
        @Deprecated
        public static long n(@fg.l c cVar, float f4) {
            return c.super.w(f4);
        }

        @x4
        @Deprecated
        public static long o(@fg.l c cVar, int i4) {
            return c.super.u(i4);
        }

        @fg.m
        @Deprecated
        public static <T> Object p(@fg.l c cVar, long j4, @fg.l ld.p<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
            return c.D2(cVar, j4, pVar, dVar);
        }

        @fg.m
        @Deprecated
        public static <T> Object q(@fg.l c cVar, long j4, @fg.l ld.p<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
            return c.U5(cVar, j4, pVar, dVar);
        }
    }

    static Object D2(c cVar, long j4, ld.p pVar, kotlin.coroutines.d dVar) {
        cVar.getClass();
        return pVar.invoke(cVar, dVar);
    }

    static Object U5(c cVar, long j4, ld.p pVar, kotlin.coroutines.d dVar) {
        cVar.getClass();
        return pVar.invoke(cVar, dVar);
    }

    static /* synthetic */ Object a1(c cVar, r rVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i4 & 1) != 0) {
            rVar = r.Main;
        }
        return cVar.u3(rVar, dVar);
    }

    static float j6(c cVar, float f4) {
        return cVar.getDensity() * f4;
    }

    default long B() {
        i0.n.INSTANCE.getClass();
        return i0.n.f74171c;
    }

    @fg.m
    default <T> Object P6(long j4, @fg.l ld.p<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return pVar.invoke(this, dVar);
    }

    long c();

    @fg.l
    s5 d();

    @fg.m
    default <T> Object k5(long j4, @fg.l ld.p<? super c, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return pVar.invoke(this, dVar);
    }

    @fg.m
    Object u3(@fg.l r rVar, @fg.l kotlin.coroutines.d<? super p> dVar);

    @fg.l
    p v3();
}
