package androidx.compose.foundation.layout;

import androidx.compose.runtime.m5;
import androidx.compose.ui.node.g;
import kotlin.Metadata;

/* compiled from: Spacer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSpacer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,56:1\n124#2,5:57\n130#2,5:70\n135#2:81\n137#2:84\n286#3,8:62\n294#3,2:82\n3737#4,6:75\n*S KotlinDebug\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n*L\n40#1:57,5\n40#1:70,5\n40#1:81\n40#1:84\n40#1:62,8\n40#1:82,2\n40#1:75,6\n*E\n"})
/* loaded from: classes.dex */
public final class f2 {

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/ui/layout/a0$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.node.g> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f5022b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f5022b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.g, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final androidx.compose.ui.node.g invoke() {
            return this.f5022b.invoke();
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-72882467);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-72882467, i4, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        g2 g2Var = g2.f5038a;
        tVar.P(544976794);
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        androidx.compose.ui.q l4 = androidx.compose.ui.i.l(tVar, qVar);
        androidx.compose.runtime.g0 B = tVar.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion.a();
        tVar.P(1405779621);
        if (tVar.s() == null) {
            androidx.compose.runtime.p.n();
        }
        tVar.W();
        if (tVar.getInserting()) {
            tVar.F(new a(a5));
        } else {
            tVar.C();
        }
        m5.j(tVar, g2Var, companion.f());
        m5.j(tVar, B, companion.h());
        m5.j(tVar, l4, companion.g());
        ld.p<androidx.compose.ui.node.g, Integer, kotlin.k2> b5 = companion.b();
        if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, b5);
        }
        tVar.H();
        tVar.p0();
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
    }
}
