package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.x;
import androidx.compose.runtime.v3;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import kotlin.Metadata;

/* compiled from: Row.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aL\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/x1;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/ui/c$c;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/layout/m0;", "d", "(Landroidx/compose/foundation/layout/i$e;Landroidx/compose/ui/c$c;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/layout/m0;", "Landroidx/compose/ui/layout/m0;", "b", "()Landroidx/compose/ui/layout/m0;", "c", "()V", "DefaultRowMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,264:1\n79#2,11:265\n92#2:296\n456#3,8:276\n464#3,6:290\n50#3:297\n49#3:298\n3737#4,6:284\n1116#5,6:299\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n92#1:265,11\n92#1:296\n92#1:276,8\n92#1:290,6\n121#1:297\n121#1:298\n92#1:284,6\n121#1:299,6\n*E\n"})
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.layout.m0 f5392a;

    static {
        a1 a1Var = a1.Horizontal;
        i iVar = i.f5073a;
        i.e p4 = iVar.p();
        float spacing = iVar.p().getSpacing();
        x.Companion companion = x.INSTANCE;
        c.InterfaceC0326c w4 = androidx.compose.ui.c.INSTANCE.w();
        companion.getClass();
        f5392a = new t1(a1Var, p4, null, spacing, d2.Wrap, new x.g(w4), null);
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.m androidx.compose.ui.q qVar, @fg.m i.e eVar, @fg.m c.InterfaceC0326c interfaceC0326c, @fg.l ld.q<? super x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(693286680);
        if ((i5 & 1) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            eVar = i.f5073a.p();
        }
        if ((i5 & 4) != 0) {
            interfaceC0326c = androidx.compose.ui.c.INSTANCE.w();
        }
        androidx.compose.ui.layout.m0 d5 = d(eVar, interfaceC0326c, tVar, (i4 >> 3) & 126);
        tVar.P(-1323940314);
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        androidx.compose.runtime.g0 B = tVar.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion.a();
        ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(qVar);
        if (tVar.s() == null) {
            androidx.compose.runtime.p.n();
        }
        tVar.W();
        if (tVar.getInserting()) {
            tVar.F(a5);
        } else {
            tVar.C();
        }
        ld.p a6 = androidx.compose.animation.p.a(companion, tVar, d5, tVar, B);
        if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, a6);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
        qVar2.R(y1.f5410a, tVar, Integer.valueOf(((i4 >> 6) & 112) | 6));
        tVar.p0();
        tVar.H();
        tVar.p0();
        tVar.p0();
    }

    @fg.l
    public static final androidx.compose.ui.layout.m0 b() {
        return f5392a;
    }

    @kotlin.w0
    public static /* synthetic */ void c() {
    }

    @fg.l
    @androidx.compose.runtime.i
    @kotlin.w0
    public static final androidx.compose.ui.layout.m0 d(@fg.l i.e eVar, @fg.l c.InterfaceC0326c interfaceC0326c, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.ui.layout.m0 m0Var;
        tVar.P(-837807694);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-837807694, i4, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:117)");
        }
        if (kotlin.jvm.internal.l0.g(eVar, i.f5073a.p()) && kotlin.jvm.internal.l0.g(interfaceC0326c, androidx.compose.ui.c.INSTANCE.w())) {
            m0Var = f5392a;
        } else {
            tVar.P(511388516);
            boolean q02 = tVar.q0(eVar) | tVar.q0(interfaceC0326c);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                a1 a1Var = a1.Horizontal;
                float spacing = eVar.getSpacing();
                x.INSTANCE.getClass();
                Q = new t1(a1Var, eVar, null, spacing, d2.Wrap, new x.g(interfaceC0326c), null);
                tVar.E(Q);
            }
            tVar.p0();
            m0Var = (androidx.compose.ui.layout.m0) Q;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return m0Var;
    }
}
