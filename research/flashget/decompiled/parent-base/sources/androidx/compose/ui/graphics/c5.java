package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.b5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Outline.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aN\u0010\u0011\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aN\u0010\u0015\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u0013\u0010\u001e\u001a\u00020\u0018*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u001b*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001f\u001a¦\u0001\u0010+\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012,\u0010&\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00030!¢\u0006\u0002\b%2,\u0010(\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00030!¢\u0006\u0002\b%2,\u0010*\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030!¢\u0006\u0002\b%H\u0082\b¢\u0006\u0004\b+\u0010,\u001a!\u00100\u001a\u00020\u0003*\u00020-2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u000202*\u00020\u001dH\u0002¢\u0006\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/graphics/g5;", "Landroidx/compose/ui/graphics/b5;", "outline", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/b5;)V", "Landroidx/compose/ui/graphics/drawscope/f;", "Landroidx/compose/ui/graphics/d2;", "color", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/i;", "style", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "Landroidx/compose/ui/graphics/k1;", "blendMode", "f", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/graphics/b5;JFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/t1;", "brush", "d", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/graphics/b5;Landroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Li0/i;", "Li0/f;", "l", "(Li0/i;)J", "Li0/n;", "j", "Li0/l;", "m", "(Li0/l;)J", "k", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "rect", "Lkotlin/u;", "drawRectBlock", "rrect", "drawRoundedRectBlock", "path", "drawPathBlock", "h", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/graphics/b5;Lld/p;Lld/p;Lld/p;)V", "Landroidx/compose/ui/graphics/v1;", "Landroidx/compose/ui/graphics/d5;", "paint", "c", "(Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/graphics/b5;Landroidx/compose/ui/graphics/d5;)V", "", "i", "(Li0/l;)Z", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,306:1\n244#1,16:307\n244#1,16:323\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n155#1:307,16\n194#1:323,16\n*E\n"})
/* loaded from: classes.dex */
public final class c5 {
    public static final void b(@fg.l g5 g5Var, @fg.l b5 b5Var) {
        if (b5Var instanceof b5.b) {
            g5Var.k(((b5.b) b5Var).b());
        } else if (b5Var instanceof b5.c) {
            g5Var.r(((b5.c) b5Var).getRoundRect());
        } else {
            if (!(b5Var instanceof b5.a)) {
                throw new NoWhenBranchMatchedException();
            }
            g5.q(g5Var, ((b5.a) b5Var).getPath(), 0L, 2, null);
        }
    }

    public static final void c(@fg.l v1 v1Var, @fg.l b5 b5Var, @fg.l d5 d5Var) {
        if (b5Var instanceof b5.b) {
            v1Var.m(((b5.b) b5Var).b(), d5Var);
            return;
        }
        if (!(b5Var instanceof b5.c)) {
            if (!(b5Var instanceof b5.a)) {
                throw new NoWhenBranchMatchedException();
            }
            v1Var.J(((b5.a) b5Var).getPath(), d5Var);
        } else {
            b5.c cVar = (b5.c) b5Var;
            g5 roundRectPath = cVar.getRoundRectPath();
            if (roundRectPath != null) {
                v1Var.J(roundRectPath, d5Var);
            } else {
                v1Var.O(cVar.getRoundRect().q(), cVar.getRoundRect().s(), cVar.getRoundRect().r(), cVar.getRoundRect().m(), i0.a.m(cVar.getRoundRect().n()), i0.a.o(cVar.getRoundRect().n()), d5Var);
            }
        }
    }

    public static final void d(@fg.l androidx.compose.ui.graphics.drawscope.f fVar, @fg.l b5 b5Var, @fg.l t1 t1Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4, @fg.l androidx.compose.ui.graphics.drawscope.i iVar, @fg.m e2 e2Var, int i4) {
        g5 path;
        if (b5Var instanceof b5.b) {
            i0.i b5 = ((b5.b) b5Var).b();
            fVar.K3(t1Var, l(b5), j(b5), f4, iVar, e2Var, i4);
            return;
        }
        if (b5Var instanceof b5.c) {
            b5.c cVar = (b5.c) b5Var;
            path = cVar.getRoundRectPath();
            if (path == null) {
                i0.l roundRect = cVar.getRoundRect();
                fVar.f5(t1Var, m(roundRect), k(roundRect), i0.b.b(i0.a.m(roundRect.n()), 0.0f, 2, null), f4, iVar, e2Var, i4);
                return;
            }
        } else {
            if (!(b5Var instanceof b5.a)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((b5.a) b5Var).getPath();
        }
        fVar.G1(path, t1Var, f4, iVar, e2Var, i4);
    }

    public static /* synthetic */ void e(androidx.compose.ui.graphics.drawscope.f fVar, b5 b5Var, t1 t1Var, float f4, androidx.compose.ui.graphics.drawscope.i iVar, e2 e2Var, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            f4 = 1.0f;
        }
        float f5 = f4;
        if ((i5 & 8) != 0) {
            iVar = androidx.compose.ui.graphics.drawscope.m.f17797a;
        }
        androidx.compose.ui.graphics.drawscope.i iVar2 = iVar;
        if ((i5 & 16) != 0) {
            e2Var = null;
        }
        e2 e2Var2 = e2Var;
        if ((i5 & 32) != 0) {
            i4 = androidx.compose.ui.graphics.drawscope.f.INSTANCE.a();
        }
        d(fVar, b5Var, t1Var, f5, iVar2, e2Var2, i4);
    }

    public static final void f(@fg.l androidx.compose.ui.graphics.drawscope.f fVar, @fg.l b5 b5Var, long j4, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4, @fg.l androidx.compose.ui.graphics.drawscope.i iVar, @fg.m e2 e2Var, int i4) {
        g5 path;
        if (b5Var instanceof b5.b) {
            i0.i b5 = ((b5.b) b5Var).b();
            fVar.T3(j4, l(b5), j(b5), f4, iVar, e2Var, i4);
            return;
        }
        if (b5Var instanceof b5.c) {
            b5.c cVar = (b5.c) b5Var;
            path = cVar.getRoundRectPath();
            if (path == null) {
                i0.l roundRect = cVar.getRoundRect();
                fVar.G2(j4, m(roundRect), k(roundRect), i0.b.b(i0.a.m(roundRect.n()), 0.0f, 2, null), iVar, f4, e2Var, i4);
                return;
            }
        } else {
            if (!(b5Var instanceof b5.a)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((b5.a) b5Var).getPath();
        }
        fVar.R3(path, j4, f4, iVar, e2Var, i4);
    }

    private static final void h(androidx.compose.ui.graphics.drawscope.f fVar, b5 b5Var, ld.p<? super androidx.compose.ui.graphics.drawscope.f, ? super i0.i, kotlin.k2> pVar, ld.p<? super androidx.compose.ui.graphics.drawscope.f, ? super i0.l, kotlin.k2> pVar2, ld.p<? super androidx.compose.ui.graphics.drawscope.f, ? super g5, kotlin.k2> pVar3) {
        if (b5Var instanceof b5.b) {
            pVar.invoke(fVar, ((b5.b) b5Var).b());
            return;
        }
        if (!(b5Var instanceof b5.c)) {
            if (!(b5Var instanceof b5.a)) {
                throw new NoWhenBranchMatchedException();
            }
            pVar3.invoke(fVar, ((b5.a) b5Var).getPath());
        } else {
            b5.c cVar = (b5.c) b5Var;
            g5 roundRectPath = cVar.getRoundRectPath();
            if (roundRectPath != null) {
                pVar3.invoke(fVar, roundRectPath);
            } else {
                pVar2.invoke(fVar, cVar.getRoundRect());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(i0.l lVar) {
        return ((i0.a.m(lVar.n()) > i0.a.m(lVar.o()) ? 1 : (i0.a.m(lVar.n()) == i0.a.m(lVar.o()) ? 0 : -1)) == 0 && (i0.a.m(lVar.o()) > i0.a.m(lVar.u()) ? 1 : (i0.a.m(lVar.o()) == i0.a.m(lVar.u()) ? 0 : -1)) == 0 && (i0.a.m(lVar.u()) > i0.a.m(lVar.t()) ? 1 : (i0.a.m(lVar.u()) == i0.a.m(lVar.t()) ? 0 : -1)) == 0) && ((i0.a.o(lVar.n()) > i0.a.o(lVar.o()) ? 1 : (i0.a.o(lVar.n()) == i0.a.o(lVar.o()) ? 0 : -1)) == 0 && (i0.a.o(lVar.o()) > i0.a.o(lVar.u()) ? 1 : (i0.a.o(lVar.o()) == i0.a.o(lVar.u()) ? 0 : -1)) == 0 && (i0.a.o(lVar.u()) > i0.a.o(lVar.t()) ? 1 : (i0.a.o(lVar.u()) == i0.a.o(lVar.t()) ? 0 : -1)) == 0);
    }

    private static final long j(i0.i iVar) {
        return i0.o.a(iVar.G(), iVar.r());
    }

    private static final long k(i0.l lVar) {
        return i0.o.a(lVar.v(), lVar.p());
    }

    private static final long l(i0.i iVar) {
        return i0.g.a(iVar.t(), iVar.getTop());
    }

    private static final long m(i0.l lVar) {
        return i0.g.a(lVar.q(), lVar.s());
    }
}
