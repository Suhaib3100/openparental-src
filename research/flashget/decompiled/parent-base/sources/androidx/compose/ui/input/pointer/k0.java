package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.x4;
import androidx.compose.ui.platform.s5;
import kotlin.Metadata;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J?\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H¦@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Landroidx/compose/ui/unit/d;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/c;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "o3", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/u;", "c", "()J", "size", "Li0/n;", "B", "extendedTouchPadding", "Landroidx/compose/ui/platform/s5;", "d", "()Landroidx/compose/ui/platform/s5;", "viewConfiguration", "", "<anonymous parameter 0>", "x5", "()Z", "U2", "(Z)V", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "interceptOutOfBoundsChildEvents", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface k0 extends androidx.compose.ui.unit.d {

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static long a(@fg.l k0 k0Var) {
            return k0.super.B();
        }

        @Deprecated
        public static boolean b(@fg.l k0 k0Var) {
            k0Var.getClass();
            return false;
        }

        public static /* synthetic */ void c() {
        }

        @x4
        @Deprecated
        public static int d(@fg.l k0 k0Var, long j4) {
            return k0.super.J5(j4);
        }

        @x4
        @Deprecated
        public static int e(@fg.l k0 k0Var, float f4) {
            return k0.super.q2(f4);
        }

        @Deprecated
        public static void f(@fg.l k0 k0Var, boolean z4) {
            k0Var.getClass();
        }

        @x4
        @Deprecated
        public static float g(@fg.l k0 k0Var, long j4) {
            return k0.super.i(j4);
        }

        @x4
        @Deprecated
        public static float h(@fg.l k0 k0Var, float f4) {
            return k0.super.S(f4);
        }

        @x4
        @Deprecated
        public static float i(@fg.l k0 k0Var, int i4) {
            return k0.super.R(i4);
        }

        @x4
        @Deprecated
        public static long j(@fg.l k0 k0Var, long j4) {
            return k0.super.n(j4);
        }

        @x4
        @Deprecated
        public static float k(@fg.l k0 k0Var, long j4) {
            return k0.super.J2(j4);
        }

        @x4
        @Deprecated
        public static float l(@fg.l k0 k0Var, float f4) {
            return k0Var.b() * f4;
        }

        @x4
        @fg.l
        @Deprecated
        public static i0.i m(@fg.l k0 k0Var, @fg.l androidx.compose.ui.unit.k kVar) {
            return k0.super.c5(kVar);
        }

        @x4
        @Deprecated
        public static long n(@fg.l k0 k0Var, long j4) {
            return k0.super.d0(j4);
        }

        @x4
        @Deprecated
        public static long o(@fg.l k0 k0Var, float f4) {
            return k0.super.h(f4);
        }

        @x4
        @Deprecated
        public static long p(@fg.l k0 k0Var, float f4) {
            return k0.super.w(f4);
        }

        @x4
        @Deprecated
        public static long q(@fg.l k0 k0Var, int i4) {
            return k0.super.u(i4);
        }
    }

    static boolean O0(k0 k0Var) {
        k0Var.getClass();
        return false;
    }

    static float b3(k0 k0Var, float f4) {
        return k0Var.b() * f4;
    }

    static void d1(k0 k0Var, boolean z4) {
        k0Var.getClass();
    }

    default long B() {
        i0.n.INSTANCE.getClass();
        return i0.n.f74171c;
    }

    default void U2(boolean z4) {
    }

    long c();

    @fg.l
    s5 d();

    @fg.m
    <R> Object o3(@fg.l ld.p<? super c, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super R> dVar);

    default boolean x5() {
        return false;
    }
}
