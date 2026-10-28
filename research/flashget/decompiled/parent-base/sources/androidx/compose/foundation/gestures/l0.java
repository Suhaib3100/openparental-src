package androidx.compose.foundation.gestures;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/l0;", "Landroidx/compose/ui/unit/d;", "Lkotlin/k2;", "f4", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "A2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l0 extends androidx.compose.ui.unit.d {

    /* compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @x4
        @Deprecated
        public static int a(@fg.l l0 l0Var, long j4) {
            return l0.super.J5(j4);
        }

        @x4
        @Deprecated
        public static int b(@fg.l l0 l0Var, float f4) {
            return l0.super.q2(f4);
        }

        @x4
        @Deprecated
        public static float c(@fg.l l0 l0Var, long j4) {
            return l0.super.i(j4);
        }

        @x4
        @Deprecated
        public static float d(@fg.l l0 l0Var, float f4) {
            return l0.super.S(f4);
        }

        @x4
        @Deprecated
        public static float e(@fg.l l0 l0Var, int i4) {
            return l0.super.R(i4);
        }

        @x4
        @Deprecated
        public static long f(@fg.l l0 l0Var, long j4) {
            return l0.super.n(j4);
        }

        @x4
        @Deprecated
        public static float g(@fg.l l0 l0Var, long j4) {
            return l0.super.J2(j4);
        }

        @x4
        @Deprecated
        public static float h(@fg.l l0 l0Var, float f4) {
            return l0Var.getDensity() * f4;
        }

        @x4
        @fg.l
        @Deprecated
        public static i0.i i(@fg.l l0 l0Var, @fg.l androidx.compose.ui.unit.k kVar) {
            return l0.super.c5(kVar);
        }

        @x4
        @Deprecated
        public static long j(@fg.l l0 l0Var, long j4) {
            return l0.super.d0(j4);
        }

        @x4
        @Deprecated
        public static long k(@fg.l l0 l0Var, float f4) {
            return l0.super.h(f4);
        }

        @x4
        @Deprecated
        public static long l(@fg.l l0 l0Var, float f4) {
            return l0.super.w(f4);
        }

        @x4
        @Deprecated
        public static long m(@fg.l l0 l0Var, int i4) {
            return l0.super.u(i4);
        }
    }

    static float I3(l0 l0Var, float f4) {
        return l0Var.getDensity() * f4;
    }

    @fg.m
    Object A2(@fg.l kotlin.coroutines.d<? super Boolean> dVar);

    @fg.m
    Object f4(@fg.l kotlin.coroutines.d<? super k2> dVar);
}
