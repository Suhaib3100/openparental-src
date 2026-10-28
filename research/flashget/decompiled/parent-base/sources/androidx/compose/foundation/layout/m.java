package androidx.compose.foundation.layout;

import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v3;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aL\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u001c\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 \"\u001a\u0010$\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\"\u0010#\"\u001a\u0010(\u001a\u0004\u0018\u00010%*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0018\u0010+\u001a\u00020\u0004*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/c;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/o;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "b", "(Landroidx/compose/ui/q;Landroidx/compose/ui/c;ZLld/q;Landroidx/compose/runtime/t;II)V", "alignment", "Landroidx/compose/ui/layout/m0;", "i", "(Landroidx/compose/ui/c;ZLandroidx/compose/runtime/t;I)Landroidx/compose/ui/layout/m0;", "Landroidx/compose/ui/layout/i1$a;", "Landroidx/compose/ui/layout/i1;", "placeable", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/w;", "layoutDirection", "", "boxWidth", "boxHeight", "h", "(Landroidx/compose/ui/layout/i1$a;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/unit/w;IILandroidx/compose/ui/c;)V", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/layout/m0;", "DefaultBoxMeasurePolicy", "f", "()Landroidx/compose/ui/layout/m0;", "EmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/l;", "e", "(Landroidx/compose/ui/layout/l0;)Landroidx/compose/foundation/layout/l;", "boxChildDataNode", "g", "(Landroidx/compose/ui/layout/l0;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,310:1\n79#2,11:311\n92#2:342\n124#2,5:351\n130#2,5:364\n135#2:375\n137#2:378\n456#3,8:322\n464#3,6:336\n50#3:343\n49#3:344\n286#3,8:356\n294#3,2:376\n3737#4,6:330\n3737#4,6:369\n1116#5,6:345\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n73#1:311,11\n73#1:342\n209#1:351,5\n209#1:364,5\n209#1:375\n209#1:378\n73#1:322,8\n73#1:336,6\n88#1:343\n88#1:344\n209#1:356,8\n209#1:376,2\n73#1:330,6\n209#1:369,6\n88#1:345,6\n*E\n"})
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.layout.m0 f5197a = new n(androidx.compose.ui.c.INSTANCE.C(), false);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.layout.m0 f5198b = c.f5202a;

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/ui/layout/a0$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.node.g> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f5199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f5199b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.g, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final androidx.compose.ui.node.g invoke() {
            return this.f5199b.invoke();
        }
    }

    /* compiled from: Box.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f5200b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.q qVar, int i4) {
            super(2);
            this.f5200b = qVar;
            this.f5201c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            m.a(this.f5200b, tVar, androidx.compose.runtime.g3.b(this.f5201c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class c implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5202a = new c();

        /* compiled from: Box.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f5203b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l i1.a aVar) {
            }

            @Override // ld.l
            public kotlin.k2 invoke(i1.a aVar) {
                return kotlin.k2.f75408a;
            }
        }

        c() {
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.q(j4), null, a.f5203b, 4, null);
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-211209833);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-211209833, i5, -1, "androidx.compose.foundation.layout.Box (Box.kt:207)");
            }
            androidx.compose.ui.layout.m0 m0Var = f5198b;
            o4.P(544976794);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.ui.q l4 = androidx.compose.ui.i.l(o4, qVar);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            o4.P(1405779621);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.l()) {
                o4.F(new a(a5));
            } else {
                o4.C();
            }
            m5.j(o4, m0Var, companion.f());
            m5.j(o4, B, companion.h());
            m5.j(o4, l4, companion.g());
            ld.p<androidx.compose.ui.node.g, Integer, kotlin.k2> b5 = companion.b();
            if (o4.l() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, b5);
            }
            o4.H();
            o4.p0();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(qVar, i4));
        }
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(@fg.m androidx.compose.ui.q qVar, @fg.m androidx.compose.ui.c cVar, boolean z4, @fg.l ld.q<? super o, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(733328855);
        if ((i5 & 1) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.C();
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        androidx.compose.ui.layout.m0 i6 = i(cVar, z4, tVar, (i4 >> 3) & 126);
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
        ld.p a6 = androidx.compose.animation.p.a(companion, tVar, i6, tVar, B);
        if (tVar.l() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, a6);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
        qVar2.R(p.f5235a, tVar, Integer.valueOf(((i4 >> 6) & 112) | 6));
        tVar.p0();
        tVar.H();
        tVar.p0();
        tVar.p0();
    }

    private static final l e(androidx.compose.ui.layout.l0 l0Var) {
        Object a5 = l0Var.a();
        if (a5 instanceof l) {
            return (l) a5;
        }
        return null;
    }

    @fg.l
    public static final androidx.compose.ui.layout.m0 f() {
        return f5198b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(androidx.compose.ui.layout.l0 l0Var) {
        l e4 = e(l0Var);
        if (e4 != null) {
            return e4.getMatchParentSize();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(i1.a aVar, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.w wVar, int i4, int i5, androidx.compose.ui.c cVar) {
        androidx.compose.ui.c alignment;
        l e4 = e(l0Var);
        i1.a.i(aVar, i1Var, ((e4 == null || (alignment = e4.getAlignment()) == null) ? cVar : alignment).a(androidx.compose.ui.unit.v.a(i1Var.getWidth(), i1Var.getHeight()), androidx.compose.ui.unit.v.a(i4, i5), wVar), 0.0f, 2, null);
    }

    @fg.l
    @androidx.compose.runtime.i
    @kotlin.w0
    public static final androidx.compose.ui.layout.m0 i(@fg.l androidx.compose.ui.c cVar, boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.ui.layout.m0 m0Var;
        tVar.P(56522820);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(56522820, i4, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:84)");
        }
        if (!kotlin.jvm.internal.l0.g(cVar, androidx.compose.ui.c.INSTANCE.C()) || z4) {
            Boolean valueOf = Boolean.valueOf(z4);
            tVar.P(511388516);
            boolean q02 = tVar.q0(valueOf) | tVar.q0(cVar);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new n(cVar, z4);
                tVar.E(Q);
            }
            tVar.p0();
            m0Var = (androidx.compose.ui.layout.m0) Q;
        } else {
            m0Var = f5197a;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return m0Var;
    }
}
