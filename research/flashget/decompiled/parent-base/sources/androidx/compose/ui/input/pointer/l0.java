package androidx.compose.ui.input.pointer;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: PointerInputTestUtil.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aD\u0010\u0018\u001a\u00020\u0014*\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aL\u0010\u001b\u001a\u00020\u0014*\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aX\u0010\u001f\u001a\u00020\u0014*\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u001d\"\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aR\u0010\"\u001a\u00020\u0014*\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120!2\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#*<\b\u0000\u0010$\"\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00102\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"", "id", "durationMillis", "", "x", "y", "Landroidx/compose/ui/input/pointer/b0;", "a", "(JJFF)Landroidx/compose/ui/input/pointer/b0;", "m", "(Landroidx/compose/ui/input/pointer/b0;JFF)Landroidx/compose/ui/input/pointer/b0;", "dx", "dy", "k", "o", "(Landroidx/compose/ui/input/pointer/b0;J)Landroidx/compose/ui/input/pointer/b0;", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/p;", "Landroidx/compose/ui/input/pointer/r;", "Landroidx/compose/ui/unit/u;", "Lkotlin/k2;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "c", "(Lld/q;Landroidx/compose/ui/input/pointer/p;J)V", "pointerEventPass", "e", "(Lld/q;Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "", "pointerEventPasses", "h", "(Lld/q;Landroidx/compose/ui/input/pointer/p;[Landroidx/compose/ui/input/pointer/r;J)V", "", "g", "(Lld/q;Landroidx/compose/ui/input/pointer/p;Ljava/util/List;J)V", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n1#2:149\n33#3,6:150\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n144#1:150,6\n*E\n"})
/* loaded from: classes.dex */
public final class l0 {
    @fg.l
    public static final b0 a(long j4, long j5, float f4, float f5) {
        return new b0(j4, j5, i0.g.a(f4, f5), true, 1.0f, j5, i0.g.a(f4, f5), false, false, 0, 0L, 1536, (kotlin.jvm.internal.w) null);
    }

    public static /* synthetic */ b0 b(long j4, long j5, float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = 0;
        }
        return a(j4, j5, (i4 & 4) != 0 ? 0.0f : f4, (i4 & 8) != 0 ? 0.0f : f5);
    }

    public static final void c(@fg.l ld.q<? super p, ? super r, ? super androidx.compose.ui.unit.u, k2> qVar, @fg.l p pVar, long j4) {
        g(qVar, pVar, kotlin.collections.w.O(r.Initial, r.Main, r.Final), j4);
    }

    public static /* synthetic */ void d(ld.q qVar, p pVar, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = androidx.compose.ui.unit.v.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        c(qVar, pVar, j4);
    }

    public static final void e(@fg.l ld.q<? super p, ? super r, ? super androidx.compose.ui.unit.u, k2> qVar, @fg.l p pVar, @fg.l r rVar, long j4) {
        g(qVar, pVar, kotlin.collections.w.k(rVar), j4);
    }

    public static /* synthetic */ void f(ld.q qVar, p pVar, r rVar, long j4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j4 = androidx.compose.ui.unit.v.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        e(qVar, pVar, rVar, j4);
    }

    public static final void g(@fg.l ld.q<? super p, ? super r, ? super androidx.compose.ui.unit.u, k2> qVar, @fg.l p pVar, @fg.l List<? extends r> list, long j4) {
        if (pVar.e().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            qVar.R(pVar, list.get(i4), androidx.compose.ui.unit.u.b(j4));
        }
    }

    public static final void h(@fg.l ld.q<? super p, ? super r, ? super androidx.compose.ui.unit.u, k2> qVar, @fg.l p pVar, @fg.l r[] rVarArr, long j4) {
        g(qVar, pVar, kotlin.collections.l.Ky(rVarArr), j4);
    }

    public static /* synthetic */ void i(ld.q qVar, p pVar, List list, long j4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j4 = androidx.compose.ui.unit.v.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        g(qVar, pVar, list, j4);
    }

    public static /* synthetic */ void j(ld.q qVar, p pVar, r[] rVarArr, long j4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j4 = androidx.compose.ui.unit.v.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        h(qVar, pVar, rVarArr, j4);
    }

    @fg.l
    public static final b0 k(@fg.l b0 b0Var, long j4, float f4, float f5) {
        long id2 = b0Var.getId();
        long uptimeMillis = b0Var.getUptimeMillis();
        boolean pressed = b0Var.getPressed();
        return new b0(id2, b0Var.getUptimeMillis() + j4, i0.g.a(i0.f.p(b0Var.getPosition()) + f4, i0.f.r(b0Var.getPosition()) + f5), true, 1.0f, uptimeMillis, b0Var.getPosition(), pressed, false, 0, 0L, 1536, (kotlin.jvm.internal.w) null);
    }

    public static /* synthetic */ b0 l(b0 b0Var, long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f5 = 0.0f;
        }
        return k(b0Var, j4, f4, f5);
    }

    @fg.l
    public static final b0 m(@fg.l b0 b0Var, long j4, float f4, float f5) {
        long id2 = b0Var.getId();
        long uptimeMillis = b0Var.getUptimeMillis();
        boolean pressed = b0Var.getPressed();
        return new b0(id2, j4, i0.g.a(f4, f5), true, 1.0f, uptimeMillis, b0Var.getPosition(), pressed, false, 0, 0L, 1536, (kotlin.jvm.internal.w) null);
    }

    public static /* synthetic */ b0 n(b0 b0Var, long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f5 = 0.0f;
        }
        return m(b0Var, j4, f4, f5);
    }

    @fg.l
    public static final b0 o(@fg.l b0 b0Var, long j4) {
        long id2 = b0Var.getId();
        long uptimeMillis = b0Var.getUptimeMillis();
        boolean pressed = b0Var.getPressed();
        return new b0(id2, j4, b0Var.getPosition(), false, 1.0f, uptimeMillis, b0Var.getPosition(), pressed, false, 0, 0L, 1536, (kotlin.jvm.internal.w) null);
    }
}
