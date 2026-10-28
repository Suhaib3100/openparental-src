package androidx.compose.ui.graphics;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Canvas.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J<\u0010(\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020 H&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J$\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010!\u001a\u00020 H&ø\u0001\u0000¢\u0006\u0004\b,\u0010-J*\u00101\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\u000bJ7\u00104\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b4\u00105JG\u00108\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010\u000bJ7\u0010;\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b;\u00105J*\u0010>\u001a\u00020\u00022\u0006\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b>\u0010?J7\u0010D\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010C\u001a\u00020B2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bD\u0010EJO\u0010F\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010C\u001a\u00020B2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\bF\u0010GJ7\u0010J\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020\f2\u0006\u0010C\u001a\u00020B2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bJ\u0010EJ\u001f\u0010K\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\bK\u0010LJ*\u0010P\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020.2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bP\u0010QJJ\u0010X\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\b\b\u0002\u0010S\u001a\u00020R2\b\b\u0002\u0010U\u001a\u00020T2\b\b\u0002\u0010V\u001a\u00020R2\b\b\u0002\u0010W\u001a\u00020T2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ0\u0010^\u001a\u00020\u00022\u0006\u0010[\u001a\u00020Z2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020.0\\2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b^\u0010_J*\u0010a\u001a\u00020\u00022\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020`2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ*\u0010g\u001a\u00020\u00022\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020e2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0002H&¢\u0006\u0004\bi\u0010\u0004J\u000f\u0010j\u001a\u00020\u0002H&¢\u0006\u0004\bj\u0010\u0004ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006kÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/v1;", "", "Lkotlin/k2;", "C", "()V", "o", "Li0/i;", "bounds", "Landroidx/compose/ui/graphics/d5;", "paint", "z", "(Li0/i;Landroidx/compose/ui/graphics/d5;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "d", "degrees", "y", "(F)V", "B", "sxRad", "syRad", "x", "Landroidx/compose/ui/graphics/y4;", "matrix", "E", "([F)V", "rect", "Landroidx/compose/ui/graphics/c2;", "clipOp", "l", "(Li0/i;I)V", "left", "top", "right", "bottom", "b", "(FFFFI)V", "Landroidx/compose/ui/graphics/g5;", "path", "c", "(Landroidx/compose/ui/graphics/g5;I)V", "Li0/f;", "p1", "p2", "w", "(JJLandroidx/compose/ui/graphics/d5;)V", "m", "e", "(FFFFLandroidx/compose/ui/graphics/d5;)V", "radiusX", "radiusY", "O", "(FFFFFFLandroidx/compose/ui/graphics/d5;)V", "u", "f", "center", "radius", "K", "(JFLandroidx/compose/ui/graphics/d5;)V", "startAngle", "sweepAngle", "", "useCenter", "s", "(Li0/i;FFZLandroidx/compose/ui/graphics/d5;)V", "r", "(FFFFFFZLandroidx/compose/ui/graphics/d5;)V", "startAngleRad", "sweepAngleRad", "p", "J", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/graphics/s4;", "image", "topLeftOffset", "i", "(Landroidx/compose/ui/graphics/s4;JLandroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/unit/q;", "srcOffset", "Landroidx/compose/ui/unit/u;", "srcSize", "dstOffset", "dstSize", "h", "(Landroidx/compose/ui/graphics/s4;JJJJLandroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/graphics/n5;", "pointMode", "", "points", "g", "(ILjava/util/List;Landroidx/compose/ui/graphics/d5;)V", "", "j", "(I[FLandroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/graphics/s6;", "vertices", "Landroidx/compose/ui/graphics/k1;", "blendMode", "k", "(Landroidx/compose/ui/graphics/s6;ILandroidx/compose/ui/graphics/d5;)V", "t", "D", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface v1 {

    /* compiled from: Canvas.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static void c(@fg.l v1 v1Var, @fg.l i0.i iVar, int i4) {
            v1.super.l(iVar, i4);
        }

        @Deprecated
        public static void e(@fg.l v1 v1Var, @fg.l i0.i iVar, float f4, float f5, boolean z4, @fg.l d5 d5Var) {
            v1.super.s(iVar, f4, f5, z4, d5Var);
        }

        @Deprecated
        public static void f(@fg.l v1 v1Var, @fg.l i0.i iVar, float f4, float f5, boolean z4, @fg.l d5 d5Var) {
            v1.super.p(iVar, f4, f5, z4, d5Var);
        }

        @Deprecated
        public static void h(@fg.l v1 v1Var, @fg.l i0.i iVar, @fg.l d5 d5Var) {
            v1.super.u(iVar, d5Var);
        }

        @Deprecated
        public static void i(@fg.l v1 v1Var, @fg.l i0.i iVar, @fg.l d5 d5Var) {
            v1.super.m(iVar, d5Var);
        }

        @Deprecated
        public static void k(@fg.l v1 v1Var, float f4, float f5) {
            v1.super.x(f4, f5);
        }
    }

    static /* synthetic */ void A(v1 v1Var, float f4, float f5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i4 & 2) != 0) {
            f5 = f4;
        }
        v1Var.d(f4, f5);
    }

    static void F(v1 v1Var, i0.i iVar, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i5 & 2) != 0) {
            c2.INSTANCE.getClass();
            i4 = c2.f17637d;
        }
        v1Var.l(iVar, i4);
    }

    static void L(v1 v1Var, s4 s4Var, long j4, long j5, long j6, long j7, d5 d5Var, int i4, Object obj) {
        long j10;
        long j11;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            j10 = androidx.compose.ui.unit.q.f21519c;
        } else {
            j10 = j4;
        }
        long a5 = (i4 & 4) != 0 ? androidx.compose.ui.unit.v.a(s4Var.getWidth(), s4Var.getHeight()) : j5;
        if ((i4 & 8) != 0) {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            j11 = androidx.compose.ui.unit.q.f21519c;
        } else {
            j11 = j6;
        }
        v1Var.h(s4Var, j10, a5, j11, (i4 & 16) != 0 ? a5 : j7, d5Var);
    }

    static void q(v1 v1Var, g5 g5Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i5 & 2) != 0) {
            c2.INSTANCE.getClass();
            i4 = c2.f17637d;
        }
        v1Var.c(g5Var, i4);
    }

    static void v(v1 v1Var, float f4, float f5, float f6, float f7, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i5 & 16) != 0) {
            c2.INSTANCE.getClass();
            i4 = c2.f17637d;
        }
        v1Var.b(f4, f5, f6, f7, i4);
    }

    void B(float sx, float sy);

    void C();

    void D();

    void E(@fg.l float[] matrix);

    void J(@fg.l g5 path, @fg.l d5 paint);

    void K(long center, float radius, @fg.l d5 paint);

    void O(float left, float top2, float right, float bottom, float radiusX, float radiusY, @fg.l d5 paint);

    void b(float left, float top2, float right, float bottom, int clipOp);

    void c(@fg.l g5 path, int clipOp);

    void d(float sx, float sy);

    void e(float left, float top2, float right, float bottom, @fg.l d5 paint);

    void f(float left, float top2, float right, float bottom, @fg.l d5 paint);

    void g(int pointMode, @fg.l List<i0.f> points, @fg.l d5 paint);

    void h(@fg.l s4 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @fg.l d5 paint);

    void i(@fg.l s4 image, long topLeftOffset, @fg.l d5 paint);

    void j(int pointMode, @fg.l float[] points, @fg.l d5 paint);

    void k(@fg.l s6 vertices, int blendMode, @fg.l d5 paint);

    default void l(@fg.l i0.i rect, int clipOp) {
        b(rect.t(), rect.getTop(), rect.x(), rect.j(), clipOp);
    }

    default void m(@fg.l i0.i rect, @fg.l d5 paint) {
        e(rect.t(), rect.getTop(), rect.x(), rect.j(), paint);
    }

    void o();

    default void p(@fg.l i0.i rect, float startAngleRad, float sweepAngleRad, boolean useCenter, @fg.l d5 paint) {
        s(rect, startAngleRad * 57.29578f, sweepAngleRad * 57.29578f, useCenter, paint);
    }

    void r(float left, float top2, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @fg.l d5 paint);

    default void s(@fg.l i0.i rect, float startAngle, float sweepAngle, boolean useCenter, @fg.l d5 paint) {
        r(rect.t(), rect.getTop(), rect.x(), rect.j(), startAngle, sweepAngle, useCenter, paint);
    }

    void t();

    void translate(float dx, float dy);

    default void u(@fg.l i0.i rect, @fg.l d5 paint) {
        f(rect.t(), rect.getTop(), rect.x(), rect.j(), paint);
    }

    void w(long p12, long p22, @fg.l d5 paint);

    default void x(float sxRad, float syRad) {
        B(sxRad * 57.29578f, syRad * 57.29578f);
    }

    void y(float degrees);

    void z(@fg.l i0.i bounds, @fg.l d5 paint);
}
