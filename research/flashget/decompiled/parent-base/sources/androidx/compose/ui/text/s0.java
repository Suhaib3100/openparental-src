package androidx.compose.ui.text;

import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.text.e;
import i0.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextPainter.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aj\u0010\u001b\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001a2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001ah\u0010)\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001af\u0010-\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001b\u00100\u001a\u00020\u0017*\u00020/2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u00101\u001a&\u00103\u001a\u000202*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Landroidx/compose/ui/text/o0;", "textMeasurer", "Landroidx/compose/ui/text/e;", "text", "Li0/f;", "topLeft", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Li0/n;", "size", "Landroidx/compose/ui/graphics/k1;", "blendMode", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/text/o0;Landroidx/compose/ui/text/e;JLandroidx/compose/ui/text/v0;IZILjava/util/List;JI)V", "", "f", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/text/o0;Ljava/lang/String;JLandroidx/compose/ui/text/v0;IZIJI)V", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Landroidx/compose/ui/graphics/d2;", "color", "", "alpha", "Landroidx/compose/ui/graphics/c6;", "shadow", "Landroidx/compose/ui/text/style/k;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "h", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/text/n0;JJFLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/drawscope/i;I)V", "Landroidx/compose/ui/graphics/t1;", "brush", "d", "(Landroidx/compose/ui/graphics/drawscope/f;Landroidx/compose/ui/text/n0;Landroidx/compose/ui/graphics/t1;JFLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/drawscope/i;I)V", "Landroidx/compose/ui/graphics/drawscope/j;", "a", "(Landroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/text/n0;)V", "Landroidx/compose/ui/unit/b;", "j", "(Landroidx/compose/ui/graphics/drawscope/f;JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,399:1\n262#2,11:400\n262#2,11:411\n262#2,8:422\n270#2,3:433\n262#2,11:436\n652#3:430\n658#3:431\n646#3:432\n159#4:447\n159#4:448\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n167#1:400,11\n233#1:411,11\n277#1:422,8\n277#1:433,3\n337#1:436,11\n284#1:430\n297#1:431\n297#1:432\n375#1:447\n387#1:448\n*E\n"})
/* loaded from: classes.dex */
public final class s0 {
    private static final void a(androidx.compose.ui.graphics.drawscope.j jVar, n0 n0Var) {
        if (n0Var.i()) {
            int overflow = n0Var.getLayoutInput().getOverflow();
            androidx.compose.ui.text.style.t.INSTANCE.getClass();
            if (androidx.compose.ui.text.style.t.g(overflow, androidx.compose.ui.text.style.t.f21406e)) {
                return;
            }
            androidx.compose.ui.graphics.drawscope.j.g(jVar, 0.0f, 0.0f, androidx.compose.ui.unit.u.m(n0Var.getSize()), (int) (n0Var.getSize() & 4294967295L), 0, 16, null);
        }
    }

    public static final void b(@fg.l androidx.compose.ui.graphics.drawscope.f fVar, @fg.l o0 o0Var, @fg.l e eVar, long j4, @fg.l v0 v0Var, int i4, boolean z4, int i5, @fg.l List<e.b<a0>> list, long j5, int i6) {
        n0 d5 = o0.d(o0Var, eVar, v0Var, i4, z4, i5, list, j(fVar, j5, j4), fVar.getLayoutDirection(), fVar, null, false, 1536, null);
        androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        androidx.compose.ui.graphics.drawscope.j transform = drawContext.getTransform();
        transform.translate(i0.f.p(j4), i0.f.r(j4));
        a(transform, d5);
        o.J(d5.getMultiParagraph(), fVar.getDrawContext().i(), 0L, null, null, null, i6, 30, null);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static void c(androidx.compose.ui.graphics.drawscope.f fVar, o0 o0Var, e eVar, long j4, v0 v0Var, int i4, boolean z4, int i5, List list, long j5, int i6, int i7, Object obj) {
        long j6;
        v0 v0Var2;
        int i10;
        long j7;
        if ((i7 & 4) != 0) {
            i0.f.INSTANCE.getClass();
            j6 = i0.f.f74147c;
        } else {
            j6 = j4;
        }
        if ((i7 & 8) != 0) {
            v0.INSTANCE.getClass();
            v0Var2 = v0.f21425f;
        } else {
            v0Var2 = v0Var;
        }
        if ((i7 & 16) != 0) {
            androidx.compose.ui.text.style.t.INSTANCE.getClass();
            i10 = androidx.compose.ui.text.style.t.f21404c;
        } else {
            i10 = i4;
        }
        boolean z5 = (i7 & 32) != 0 ? true : z4;
        int i11 = (i7 & 64) != 0 ? Integer.MAX_VALUE : i5;
        List list2 = (i7 & 128) != 0 ? kotlin.collections.j0.f74919b : list;
        if ((i7 & 256) != 0) {
            i0.n.INSTANCE.getClass();
            j7 = i0.n.f74172d;
        } else {
            j7 = j5;
        }
        b(fVar, o0Var, eVar, j6, v0Var2, i10, z5, i11, list2, j7, (i7 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.a() : i6);
    }

    public static final void d(@fg.l androidx.compose.ui.graphics.drawscope.f fVar, @fg.l n0 n0Var, @fg.l t1 t1Var, long j4, float f4, @fg.m c6 c6Var, @fg.m androidx.compose.ui.text.style.k kVar, @fg.m androidx.compose.ui.graphics.drawscope.i iVar, int i4) {
        c6 N = c6Var == null ? n0Var.getLayoutInput().getStyle().N() : c6Var;
        androidx.compose.ui.text.style.k S = kVar == null ? n0Var.getLayoutInput().getStyle().S() : kVar;
        androidx.compose.ui.graphics.drawscope.i u4 = iVar == null ? n0Var.getLayoutInput().getStyle().u() : iVar;
        androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        androidx.compose.ui.graphics.drawscope.j transform = drawContext.getTransform();
        transform.translate(i0.f.p(j4), i0.f.r(j4));
        a(transform, n0Var);
        o multiParagraph = n0Var.getMultiParagraph();
        v1 i5 = fVar.getDrawContext().i();
        float p4 = !Float.isNaN(f4) ? f4 : n0Var.getLayoutInput().getStyle().p();
        multiParagraph.getClass();
        androidx.compose.ui.text.platform.e.a(multiParagraph, i5, t1Var, p4, N, S, u4, i4);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static void e(androidx.compose.ui.graphics.drawscope.f fVar, n0 n0Var, t1 t1Var, long j4, float f4, c6 c6Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, Object obj) {
        long j5;
        if ((i5 & 4) != 0) {
            i0.f.INSTANCE.getClass();
            j5 = i0.f.f74147c;
        } else {
            j5 = j4;
        }
        d(fVar, n0Var, t1Var, j5, (i5 & 8) != 0 ? Float.NaN : f4, (i5 & 16) != 0 ? null : c6Var, (i5 & 32) != 0 ? null : kVar, (i5 & 64) != 0 ? null : iVar, (i5 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.a() : i4);
    }

    public static final void f(@fg.l androidx.compose.ui.graphics.drawscope.f fVar, @fg.l o0 o0Var, @fg.l String str, long j4, @fg.l v0 v0Var, int i4, boolean z4, int i5, long j5, int i6) {
        n0 d5 = o0.d(o0Var, new e(str, null, null, 6, null), v0Var, i4, z4, i5, null, j(fVar, j5, j4), fVar.getLayoutDirection(), fVar, null, false, 1568, null);
        androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        androidx.compose.ui.graphics.drawscope.j transform = drawContext.getTransform();
        transform.translate(i0.f.p(j4), i0.f.r(j4));
        a(transform, d5);
        o.J(d5.getMultiParagraph(), fVar.getDrawContext().i(), 0L, null, null, null, i6, 30, null);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static void g(androidx.compose.ui.graphics.drawscope.f fVar, o0 o0Var, String str, long j4, v0 v0Var, int i4, boolean z4, int i5, long j5, int i6, int i7, Object obj) {
        long j6;
        v0 v0Var2;
        int i10;
        long j7;
        if ((i7 & 4) != 0) {
            i0.f.INSTANCE.getClass();
            j6 = i0.f.f74147c;
        } else {
            j6 = j4;
        }
        if ((i7 & 8) != 0) {
            v0.INSTANCE.getClass();
            v0Var2 = v0.f21425f;
        } else {
            v0Var2 = v0Var;
        }
        if ((i7 & 16) != 0) {
            androidx.compose.ui.text.style.t.INSTANCE.getClass();
            i10 = androidx.compose.ui.text.style.t.f21404c;
        } else {
            i10 = i4;
        }
        boolean z5 = (i7 & 32) != 0 ? true : z4;
        int i11 = (i7 & 64) != 0 ? Integer.MAX_VALUE : i5;
        if ((i7 & 128) != 0) {
            i0.n.INSTANCE.getClass();
            j7 = i0.n.f74172d;
        } else {
            j7 = j5;
        }
        f(fVar, o0Var, str, j6, v0Var2, i10, z5, i11, j7, (i7 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.a() : i6);
    }

    public static final void h(@fg.l androidx.compose.ui.graphics.drawscope.f fVar, @fg.l n0 n0Var, long j4, long j5, float f4, @fg.m c6 c6Var, @fg.m androidx.compose.ui.text.style.k kVar, @fg.m androidx.compose.ui.graphics.drawscope.i iVar, int i4) {
        c6 N = c6Var == null ? n0Var.getLayoutInput().getStyle().N() : c6Var;
        androidx.compose.ui.text.style.k S = kVar == null ? n0Var.getLayoutInput().getStyle().S() : kVar;
        androidx.compose.ui.graphics.drawscope.i u4 = iVar == null ? n0Var.getLayoutInput().getStyle().u() : iVar;
        androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        androidx.compose.ui.graphics.drawscope.j transform = drawContext.getTransform();
        transform.translate(i0.f.p(j5), i0.f.r(j5));
        a(transform, n0Var);
        t1 s4 = n0Var.getLayoutInput().getStyle().s();
        if (s4 != null) {
            d2.INSTANCE.getClass();
            if (j4 == d2.f17778o) {
                o multiParagraph = n0Var.getMultiParagraph();
                v1 i5 = fVar.getDrawContext().i();
                float p4 = !Float.isNaN(f4) ? f4 : n0Var.getLayoutInput().getStyle().p();
                multiParagraph.getClass();
                androidx.compose.ui.text.platform.e.a(multiParagraph, i5, s4, p4, N, S, u4, i4);
                drawContext.i().o();
                drawContext.j(e4);
            }
        }
        o multiParagraph2 = n0Var.getMultiParagraph();
        v1 i6 = fVar.getDrawContext().i();
        d2.INSTANCE.getClass();
        multiParagraph2.I(i6, androidx.compose.ui.text.style.m.c(j4 != d2.f17778o ? j4 : n0Var.getLayoutInput().getStyle().t(), f4), N, S, u4, i4);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public static void i(androidx.compose.ui.graphics.drawscope.f fVar, n0 n0Var, long j4, long j5, float f4, c6 c6Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, Object obj) {
        long j6;
        long j7;
        if ((i5 & 2) != 0) {
            d2.INSTANCE.getClass();
            j6 = d2.f17778o;
        } else {
            j6 = j4;
        }
        if ((i5 & 4) != 0) {
            i0.f.INSTANCE.getClass();
            j7 = i0.f.f74147c;
        } else {
            j7 = j5;
        }
        h(fVar, n0Var, j6, j7, (i5 & 8) != 0 ? Float.NaN : f4, (i5 & 16) != 0 ? null : c6Var, (i5 & 32) != 0 ? null : kVar, (i5 & 64) == 0 ? iVar : null, (i5 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.a() : i4);
    }

    private static final long j(androidx.compose.ui.graphics.drawscope.f fVar, long j4, long j5) {
        int L0;
        int i4;
        int L02;
        n.Companion companion = i0.n.INSTANCE;
        companion.getClass();
        int i5 = 0;
        if (j4 == i0.n.f74172d || Float.isNaN(i0.n.t(j4))) {
            L0 = kotlin.math.b.L0((float) Math.ceil(i0.n.t(fVar.e()) - i0.f.p(j5)));
            i4 = 0;
        } else {
            i4 = kotlin.math.b.L0((float) Math.ceil(i0.n.t(j4)));
            L0 = i4;
        }
        companion.getClass();
        if (j4 == i0.n.f74172d || Float.isNaN(i0.n.m(j4))) {
            L02 = kotlin.math.b.L0((float) Math.ceil(i0.n.m(fVar.e()) - i0.f.r(j5)));
        } else {
            i5 = kotlin.math.b.L0((float) Math.ceil(i0.n.m(j4)));
            L02 = i5;
        }
        return androidx.compose.ui.unit.c.a(i4, L0, i5, L02);
    }
}
