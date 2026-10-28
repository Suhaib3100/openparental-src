package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.g5;
import kotlin.Metadata;

/* compiled from: DrawTransform.kt */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJD\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH&ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020!8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b%\u0010#ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006'À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/j;", "", "", "left", "top", "right", "bottom", "Lkotlin/k2;", "m", "(FFFF)V", "Landroidx/compose/ui/graphics/c2;", "clipOp", "b", "(FFFFI)V", "Landroidx/compose/ui/graphics/g5;", "path", "c", "(Landroidx/compose/ui/graphics/g5;I)V", "translate", "(FF)V", "degrees", "Li0/f;", "pivot", "j", "(FJ)V", "scaleX", "scaleY", "i", "(FFJ)V", "Landroidx/compose/ui/graphics/y4;", "matrix", "a", "([F)V", "Li0/n;", "e", "()J", "size", "c0", "center", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface j {

    /* compiled from: DrawTransform.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static long c(@fg.l j jVar) {
            return j.super.c0();
        }
    }

    static /* synthetic */ void d(j jVar, float f4, float f5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        jVar.translate(f4, f5);
    }

    static void f(j jVar, g5 g5Var, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i5 & 2) != 0) {
            c2.INSTANCE.getClass();
            i4 = c2.f17637d;
        }
        jVar.c(g5Var, i4);
    }

    static void g(j jVar, float f4, float f5, float f6, float f7, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i5 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f6 = i0.n.t(jVar.e());
        }
        if ((i5 & 8) != 0) {
            f7 = i0.n.m(jVar.e());
        }
        if ((i5 & 16) != 0) {
            c2.INSTANCE.getClass();
            i4 = c2.f17637d;
        }
        jVar.b(f4, f5, f6, f7, i4);
    }

    static /* synthetic */ void k(j jVar, float f4, float f5, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i4 & 4) != 0) {
            j4 = jVar.c0();
        }
        jVar.i(f4, f5, j4);
    }

    static /* synthetic */ void l(j jVar, float f4, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i4 & 2) != 0) {
            j4 = jVar.c0();
        }
        jVar.j(f4, j4);
    }

    void a(@fg.l float[] matrix);

    void b(float left, float top2, float right, float bottom, int clipOp);

    void c(@fg.l g5 path, int clipOp);

    default long c0() {
        float f4 = 2;
        return i0.g.a(i0.n.t(e()) / f4, i0.n.m(e()) / f4);
    }

    long e();

    void i(float scaleX, float scaleY, long pivot);

    void j(float degrees, long pivot);

    void m(float left, float top2, float right, float bottom);

    void translate(float left, float top2);
}
