package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.x;
import androidx.compose.runtime.v3;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import kotlin.Metadata;

/* compiled from: Column.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aL\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/u;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/layout/i$m;Landroidx/compose/ui/c$b;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/layout/m0;", "b", "(Landroidx/compose/foundation/layout/i$m;Landroidx/compose/ui/c$b;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/layout/m0;", "Landroidx/compose/ui/layout/m0;", "c", "()Landroidx/compose/ui/layout/m0;", "d", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,232:1\n79#2,11:233\n92#2:264\n456#3,8:244\n464#3,6:258\n50#3:265\n49#3:266\n3737#4,6:252\n1116#5,6:267\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n79#1:233,11\n79#1:264\n79#1:244,8\n79#1:258,6\n105#1:265\n105#1:266\n79#1:252,6\n105#1:267,6\n*E\n"})
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.layout.m0 f5319a;

    static {
        a1 a1Var = a1.Vertical;
        i iVar = i.f5073a;
        i.m r4 = iVar.r();
        float spacing = iVar.r().getSpacing();
        x.Companion companion = x.INSTANCE;
        c.b u4 = androidx.compose.ui.c.INSTANCE.u();
        companion.getClass();
        x.e eVar = new x.e(u4);
        f5319a = new t1(a1Var, null, r4, spacing, d2.Wrap, eVar, null);
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.m androidx.compose.ui.q qVar, @fg.m i.m mVar, @fg.m c.b bVar, @fg.l ld.q<? super u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-483455358);
        if ((i5 & 1) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            mVar = i.f5073a.r();
        }
        if ((i5 & 4) != 0) {
            bVar = androidx.compose.ui.c.INSTANCE.u();
        }
        androidx.compose.ui.layout.m0 b5 = b(mVar, bVar, tVar, (i4 >> 3) & 126);
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
        if (tVar.l()) {
            tVar.F(a5);
        } else {
            tVar.C();
        }
        ld.p a6 = androidx.compose.animation.p.a(companion, tVar, b5, tVar, B);
        if (tVar.l() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, a6);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
        qVar2.R(v.f5347a, tVar, Integer.valueOf(((i4 >> 6) & 112) | 6));
        tVar.p0();
        tVar.H();
        tVar.p0();
        tVar.p0();
    }

    @fg.l
    @androidx.compose.runtime.i
    @kotlin.w0
    public static final androidx.compose.ui.layout.m0 b(@fg.l i.m mVar, @fg.l c.b bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.ui.layout.m0 m0Var;
        tVar.P(1089876336);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1089876336, i4, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:101)");
        }
        if (kotlin.jvm.internal.l0.g(mVar, i.f5073a.r()) && kotlin.jvm.internal.l0.g(bVar, androidx.compose.ui.c.INSTANCE.u())) {
            m0Var = f5319a;
        } else {
            tVar.P(511388516);
            boolean q02 = tVar.q0(mVar) | tVar.q0(bVar);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                a1 a1Var = a1.Vertical;
                float spacing = mVar.getSpacing();
                x.INSTANCE.getClass();
                i.e eVar = null;
                Q = new t1(a1Var, eVar, mVar, spacing, d2.Wrap, new x.e(bVar), null);
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

    @fg.l
    public static final androidx.compose.ui.layout.m0 c() {
        return f5319a;
    }

    @kotlin.w0
    public static /* synthetic */ void d() {
    }
}
