package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.b5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ShapeContainingUtil.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a:\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/b5;", "outline", "", "x", "y", "Landroidx/compose/ui/graphics/g5;", "tmpTouchPointPath", "tmpOpPath", "", "b", "(Landroidx/compose/ui/graphics/b5;FFLandroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/g5;)Z", "Li0/i;", "rect", "e", "(Li0/i;FF)Z", "Landroidx/compose/ui/graphics/b5$c;", "touchPointPath", "opPath", "f", "(Landroidx/compose/ui/graphics/b5$c;FFLandroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/g5;)Z", "Li0/l;", "a", "(Li0/l;)Z", "Li0/a;", "cornerRadius", "centerX", "centerY", "g", "(FFJFF)Z", "path", "d", "(Landroidx/compose/ui/graphics/g5;FFLandroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/g5;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f5 {
    private static final boolean a(i0.l lVar) {
        if (i0.a.m(lVar.u()) + i0.a.m(lVar.t()) <= lVar.v()) {
            if (i0.a.m(lVar.o()) + i0.a.m(lVar.n()) <= lVar.v()) {
                if (i0.a.o(lVar.n()) + i0.a.o(lVar.t()) <= lVar.p()) {
                    if (i0.a.o(lVar.o()) + i0.a.o(lVar.u()) <= lVar.p()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean b(@fg.l androidx.compose.ui.graphics.b5 b5Var, float f4, float f5, @fg.m androidx.compose.ui.graphics.g5 g5Var, @fg.m androidx.compose.ui.graphics.g5 g5Var2) {
        if (b5Var instanceof b5.b) {
            return e(((b5.b) b5Var).b(), f4, f5);
        }
        if (b5Var instanceof b5.c) {
            return f((b5.c) b5Var, f4, f5, g5Var, g5Var2);
        }
        if (b5Var instanceof b5.a) {
            return d(((b5.a) b5Var).getPath(), f4, f5, g5Var, g5Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean c(androidx.compose.ui.graphics.b5 b5Var, float f4, float f5, androidx.compose.ui.graphics.g5 g5Var, androidx.compose.ui.graphics.g5 g5Var2, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            g5Var = null;
        }
        if ((i4 & 16) != 0) {
            g5Var2 = null;
        }
        return b(b5Var, f4, f5, g5Var, g5Var2);
    }

    private static final boolean d(androidx.compose.ui.graphics.g5 g5Var, float f4, float f5, androidx.compose.ui.graphics.g5 g5Var2, androidx.compose.ui.graphics.g5 g5Var3) {
        i0.i iVar = new i0.i(f4 - 0.005f, f5 - 0.005f, f4 + 0.005f, f5 + 0.005f);
        if (g5Var2 == null) {
            g5Var2 = androidx.compose.ui.graphics.a1.a();
        }
        g5Var2.k(iVar);
        if (g5Var3 == null) {
            g5Var3 = androidx.compose.ui.graphics.a1.a();
        }
        androidx.compose.ui.graphics.k5.INSTANCE.getClass();
        g5Var3.u(g5Var, g5Var2, androidx.compose.ui.graphics.k5.f17901d);
        boolean isEmpty = g5Var3.isEmpty();
        g5Var3.reset();
        g5Var2.reset();
        return !isEmpty;
    }

    private static final boolean e(i0.i iVar, float f4, float f5) {
        return iVar.t() <= f4 && f4 < iVar.x() && iVar.getTop() <= f5 && f5 < iVar.j();
    }

    private static final boolean f(b5.c cVar, float f4, float f5, androidx.compose.ui.graphics.g5 g5Var, androidx.compose.ui.graphics.g5 g5Var2) {
        i0.l roundRect = cVar.getRoundRect();
        if (f4 < roundRect.q() || f4 >= roundRect.r() || f5 < roundRect.s() || f5 >= roundRect.m()) {
            return false;
        }
        if (!a(roundRect)) {
            androidx.compose.ui.graphics.g5 a5 = g5Var2 == null ? androidx.compose.ui.graphics.a1.a() : g5Var2;
            a5.r(roundRect);
            return d(a5, f4, f5, g5Var, g5Var2);
        }
        float m4 = i0.a.m(roundRect.t()) + roundRect.q();
        float o4 = i0.a.o(roundRect.t()) + roundRect.s();
        float r4 = roundRect.r() - i0.a.m(roundRect.u());
        float o5 = i0.a.o(roundRect.u()) + roundRect.s();
        float r5 = roundRect.r() - i0.a.m(roundRect.o());
        float m5 = roundRect.m() - i0.a.o(roundRect.o());
        float m6 = roundRect.m() - i0.a.o(roundRect.n());
        float m7 = i0.a.m(roundRect.n()) + roundRect.q();
        if (f4 < m4 && f5 < o4) {
            return g(f4, f5, roundRect.t(), m4, o4);
        }
        if (f4 < m7 && f5 > m6) {
            return g(f4, f5, roundRect.n(), m7, m6);
        }
        if (f4 > r4 && f5 < o5) {
            return g(f4, f5, roundRect.u(), r4, o5);
        }
        if (f4 <= r5 || f5 <= m5) {
            return true;
        }
        return g(f4, f5, roundRect.o(), r5, m5);
    }

    private static final boolean g(float f4, float f5, long j4, float f6, float f7) {
        float f10 = f4 - f6;
        float f11 = f5 - f7;
        float m4 = i0.a.m(j4);
        float o4 = i0.a.o(j4);
        return ((f11 * f11) / (o4 * o4)) + ((f10 * f10) / (m4 * m4)) <= 1.0f;
    }
}
