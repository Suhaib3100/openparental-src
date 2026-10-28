package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: DrawScope.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u0013\u0010\u0012\u001aB\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aB\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u001aJ\u0010\u001d\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aB\u0010 \u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001ab\u0010#\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020!2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aB\u0010'\u001a\u00020\u0007*\u00020\u00002\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\"\u001a\u00020!2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a(\u0010*\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b*\u0010+\u001aF\u0010/\u001a\u00020\u0007*\u00020\u00002\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b/\u00100\u001aP\u00108\u001a\u00020\u0007*\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020)2\u0006\u00107\u001a\u0002062\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "", "left", "top", "right", "bottom", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "block", "g", "(Landroidx/compose/ui/graphics/drawscope/f;FFFFLld/l;)V", "inset", "i", "(Landroidx/compose/ui/graphics/drawscope/f;FLld/l;)V", "horizontal", "vertical", "h", "(Landroidx/compose/ui/graphics/drawscope/f;FFLld/l;)V", "s", "degrees", "Li0/f;", "pivot", "k", "(Landroidx/compose/ui/graphics/drawscope/f;FJLld/l;)V", "radians", "m", "scaleX", "scaleY", "o", "(Landroidx/compose/ui/graphics/drawscope/f;FFJLld/l;)V", "scale", "q", "Landroidx/compose/ui/graphics/c2;", "clipOp", "c", "(Landroidx/compose/ui/graphics/drawscope/f;FFFFILld/l;)V", "Landroidx/compose/ui/graphics/g5;", "path", "a", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/graphics/g5;ILld/l;)V", "Landroidx/compose/ui/graphics/v1;", "f", "(Landroidx/compose/ui/graphics/drawscope/f;Lld/l;)V", "Landroidx/compose/ui/graphics/drawscope/j;", "transformBlock", "drawBlock", "u", "(Landroidx/compose/ui/graphics/drawscope/f;Lld/l;Lld/l;)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "canvas", "Li0/n;", "size", "e", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/graphics/v1;JLld/l;)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1000:1\n67#1,4:1001\n262#1,11:1005\n262#1,11:1016\n262#1,11:1027\n262#1,11:1038\n262#1,11:1049\n262#1,11:1060\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n105#1:1001,4\n141#1:1005,11\n158#1:1016,11\n179#1:1027,11\n196#1:1038,11\n222#1:1049,11\n238#1:1060,11\n*E\n"})
/* loaded from: classes.dex */
public final class g {
    public static final void a(@fg.l f fVar, @fg.l g5 g5Var, int i4, @fg.l ld.l<? super f, k2> lVar) {
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().c(g5Var, i4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static void b(f fVar, g5 g5Var, int i4, ld.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            c2.INSTANCE.getClass();
            i4 = c2.f17637d;
        }
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().c(g5Var, i4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static final void c(@fg.l f fVar, float f4, float f5, float f6, float f7, int i4, @fg.l ld.l<? super f, k2> lVar) {
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().b(f4, f5, f6, f7, i4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static void d(f fVar, float f4, float f5, float f6, float f7, int i4, ld.l lVar, int i5, Object obj) {
        float f10 = (i5 & 1) != 0 ? 0.0f : f4;
        float f11 = (i5 & 2) != 0 ? 0.0f : f5;
        if ((i5 & 4) != 0) {
            f6 = i0.n.t(fVar.e());
        }
        float f12 = f6;
        if ((i5 & 8) != 0) {
            f7 = i0.n.m(fVar.e());
        }
        float f13 = f7;
        if ((i5 & 16) != 0) {
            c2.INSTANCE.getClass();
            i4 = c2.f17637d;
        }
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().b(f10, f11, f12, f13, i4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static final void e(@fg.l f fVar, @fg.l androidx.compose.ui.unit.d dVar, @fg.l w wVar, @fg.l v1 v1Var, long j4, @fg.l ld.l<? super f, k2> lVar) {
        androidx.compose.ui.unit.d b5 = fVar.getDrawContext().b();
        w layoutDirection = fVar.getDrawContext().getLayoutDirection();
        v1 i4 = fVar.getDrawContext().i();
        long e4 = fVar.getDrawContext().e();
        d drawContext = fVar.getDrawContext();
        drawContext.g(dVar);
        drawContext.a(wVar);
        drawContext.k(v1Var);
        drawContext.j(j4);
        v1Var.C();
        lVar.invoke(fVar);
        v1Var.o();
        d drawContext2 = fVar.getDrawContext();
        drawContext2.g(b5);
        drawContext2.a(layoutDirection);
        drawContext2.k(i4);
        drawContext2.j(e4);
    }

    public static final void f(@fg.l f fVar, @fg.l ld.l<? super v1, k2> lVar) {
        lVar.invoke(fVar.getDrawContext().i());
    }

    public static final void g(@fg.l f fVar, float f4, float f5, float f6, float f7, @fg.l ld.l<? super f, k2> lVar) {
        fVar.getDrawContext().getTransform().m(f4, f5, f6, f7);
        lVar.invoke(fVar);
        fVar.getDrawContext().getTransform().m(-f4, -f5, -f6, -f7);
    }

    public static final void h(@fg.l f fVar, float f4, float f5, @fg.l ld.l<? super f, k2> lVar) {
        fVar.getDrawContext().getTransform().m(f4, f5, f4, f5);
        lVar.invoke(fVar);
        float f6 = -f4;
        float f7 = -f5;
        fVar.getDrawContext().getTransform().m(f6, f7, f6, f7);
    }

    public static final void i(@fg.l f fVar, float f4, @fg.l ld.l<? super f, k2> lVar) {
        fVar.getDrawContext().getTransform().m(f4, f4, f4, f4);
        lVar.invoke(fVar);
        float f5 = -f4;
        fVar.getDrawContext().getTransform().m(f5, f5, f5, f5);
    }

    public static /* synthetic */ void j(f fVar, float f4, float f5, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        fVar.getDrawContext().getTransform().m(f4, f5, f4, f5);
        lVar.invoke(fVar);
        float f6 = -f4;
        float f7 = -f5;
        fVar.getDrawContext().getTransform().m(f6, f7, f6, f7);
    }

    public static final void k(@fg.l f fVar, float f4, long j4, @fg.l ld.l<? super f, k2> lVar) {
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().j(f4, j4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static /* synthetic */ void l(f fVar, float f4, long j4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = fVar.c0();
        }
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().j(f4, j4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static final void m(@fg.l f fVar, float f4, long j4, @fg.l ld.l<? super f, k2> lVar) {
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().j(f4 * 57.29578f, j4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static void n(f fVar, float f4, long j4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = fVar.c0();
        }
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().j(f4 * 57.29578f, j4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static final void o(@fg.l f fVar, float f4, float f5, long j4, @fg.l ld.l<? super f, k2> lVar) {
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().i(f4, f5, j4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static /* synthetic */ void p(f fVar, float f4, float f5, long j4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j4 = fVar.c0();
        }
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().i(f4, f5, j4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static final void q(@fg.l f fVar, float f4, long j4, @fg.l ld.l<? super f, k2> lVar) {
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().i(f4, f4, j4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static /* synthetic */ void r(f fVar, float f4, long j4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = fVar.c0();
        }
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().i(f4, f4, j4);
        lVar.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static final void s(@fg.l f fVar, float f4, float f5, @fg.l ld.l<? super f, k2> lVar) {
        fVar.getDrawContext().getTransform().translate(f4, f5);
        lVar.invoke(fVar);
        fVar.getDrawContext().getTransform().translate(-f4, -f5);
    }

    public static /* synthetic */ void t(f fVar, float f4, float f5, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        fVar.getDrawContext().getTransform().translate(f4, f5);
        lVar.invoke(fVar);
        fVar.getDrawContext().getTransform().translate(-f4, -f5);
    }

    public static final void u(@fg.l f fVar, @fg.l ld.l<? super j, k2> lVar, @fg.l ld.l<? super f, k2> lVar2) {
        d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        lVar.invoke(drawContext.getTransform());
        lVar2.invoke(fVar);
        drawContext.i().o();
        drawContext.j(e4);
    }
}
