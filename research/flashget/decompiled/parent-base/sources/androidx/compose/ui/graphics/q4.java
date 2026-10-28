package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: GraphicsLayerScope.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0006R*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010\"\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\u0006R\u001c\u0010%\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010\u0006R\u001c\u0010(\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0004\"\u0004\b'\u0010\u0006R\u001c\u0010+\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0004\"\u0004\b*\u0010\u0006R\"\u0010/\u001a\u00020,8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001c\u00105\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068f@&X¦\u000e¢\u0006\u0012\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010D\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010F\u001a\u00020E2\u0006\u0010F\u001a\u00020E8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010M\u001a\u00020K8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bL\u0010\u001aø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006NÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Landroidx/compose/ui/unit/d;", "", "K", "()F", "z", "(F)V", "scaleX", "f0", "Q", "scaleY", "g", "k", "alpha", "Y", "b0", "translationX", "X", "o", "translationY", "o6", "t3", "shadowElevation", "Landroidx/compose/ui/graphics/d2;", "ambientShadowColor", "o1", "()J", "T1", "(J)V", "spotShadowColor", "Q1", "t2", "a0", "H", "rotationX", "s", "J", "rotationY", "x", "O", "rotationZ", "C", "F", "cameraDistance", "Landroidx/compose/ui/graphics/p6;", "j2", "r2", "transformOrigin", "Landroidx/compose/ui/graphics/e6;", "K4", "()Landroidx/compose/ui/graphics/e6;", "h5", "(Landroidx/compose/ui/graphics/e6;)V", "shape", "", "j", "()Z", "g2", "(Z)V", "getClip$annotations", "()V", "clip", "Landroidx/compose/ui/graphics/s5;", "<anonymous parameter 0>", "m", "()Landroidx/compose/ui/graphics/s5;", "D", "(Landroidx/compose/ui/graphics/s5;)V", "renderEffect", "Landroidx/compose/ui/graphics/i4;", "compositingStrategy", "M", "()I", "r", "(I)V", "Li0/n;", "e", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface q4 extends androidx.compose.ui.unit.d {

    /* compiled from: GraphicsLayerScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static long a(@fg.l q4 q4Var) {
            return q4.c2(q4Var);
        }

        public static /* synthetic */ void b() {
        }

        @Deprecated
        public static int c(@fg.l q4 q4Var) {
            return q4.super.M();
        }

        @fg.m
        @Deprecated
        public static s5 d(@fg.l q4 q4Var) {
            q4Var.getClass();
            return null;
        }

        @Deprecated
        public static long e(@fg.l q4 q4Var) {
            return q4.super.e();
        }

        @Deprecated
        public static long f(@fg.l q4 q4Var) {
            return q4.d6(q4Var);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static int g(@fg.l q4 q4Var, long j4) {
            return q4.super.J5(j4);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static int h(@fg.l q4 q4Var, float f4) {
            return q4.super.q2(f4);
        }

        @Deprecated
        public static void i(@fg.l q4 q4Var, long j4) {
            q4Var.getClass();
        }

        @Deprecated
        public static void j(@fg.l q4 q4Var, int i4) {
            q4Var.getClass();
        }

        @Deprecated
        public static void k(@fg.l q4 q4Var, @fg.m s5 s5Var) {
            q4Var.getClass();
        }

        @Deprecated
        public static void l(@fg.l q4 q4Var, long j4) {
            q4Var.getClass();
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static float m(@fg.l q4 q4Var, long j4) {
            return q4.super.i(j4);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static float n(@fg.l q4 q4Var, float f4) {
            return q4.super.S(f4);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static float o(@fg.l q4 q4Var, int i4) {
            return q4.super.R(i4);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static long p(@fg.l q4 q4Var, long j4) {
            return q4.super.n(j4);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static float q(@fg.l q4 q4Var, long j4) {
            return q4.super.J2(j4);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static float r(@fg.l q4 q4Var, float f4) {
            return q4Var.b() * f4;
        }

        @androidx.compose.runtime.x4
        @fg.l
        @Deprecated
        public static i0.i s(@fg.l q4 q4Var, @fg.l androidx.compose.ui.unit.k kVar) {
            return q4.super.c5(kVar);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static long t(@fg.l q4 q4Var, long j4) {
            return q4.super.d0(j4);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static long u(@fg.l q4 q4Var, float f4) {
            return q4.super.h(f4);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static long v(@fg.l q4 q4Var, float f4) {
            return q4.super.w(f4);
        }

        @androidx.compose.runtime.x4
        @Deprecated
        public static long w(@fg.l q4 q4Var, int i4) {
            return q4.super.u(i4);
        }
    }

    static void B1(q4 q4Var, long j4) {
        q4Var.getClass();
    }

    static void B4(q4 q4Var, long j4) {
        q4Var.getClass();
    }

    static float E6(q4 q4Var, float f4) {
        return q4Var.b() * f4;
    }

    static s5 K5(q4 q4Var) {
        q4Var.getClass();
        return null;
    }

    static long c2(q4 q4Var) {
        q4Var.getClass();
        return r4.b();
    }

    static long d6(q4 q4Var) {
        q4Var.getClass();
        return r4.b();
    }

    static void f3(q4 q4Var, s5 s5Var) {
        q4Var.getClass();
    }

    static void u4(q4 q4Var, int i4) {
        q4Var.getClass();
    }

    float C();

    default void D(@fg.m s5 s5Var) {
    }

    void F(float f4);

    void H(float f4);

    void J(float f4);

    float K();

    @fg.l
    e6 K4();

    default int M() {
        i4.INSTANCE.getClass();
        return i4.f17852c;
    }

    void O(float f4);

    void Q(float f4);

    default long Q1() {
        return r4.b();
    }

    default void T1(long j4) {
    }

    float X();

    float Y();

    float a0();

    void b0(float f4);

    default long e() {
        i0.n.INSTANCE.getClass();
        return i0.n.f74172d;
    }

    float f0();

    float g();

    void g2(boolean z4);

    void h5(@fg.l e6 e6Var);

    boolean j();

    long j2();

    void k(float f4);

    @fg.m
    default s5 m() {
        return null;
    }

    void o(float f4);

    default long o1() {
        return r4.b();
    }

    float o6();

    default void r(int i4) {
    }

    void r2(long j4);

    float s();

    default void t2(long j4) {
    }

    void t3(float f4);

    float x();

    void z(float f4);
}
