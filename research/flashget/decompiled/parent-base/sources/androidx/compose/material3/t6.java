package androidx.compose.material3;

import androidx.compose.animation.core.e2;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import kotlin.Metadata;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a[\u0010\u0010\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0082\u0001\u0010\u001e\u001a\u00020\f2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0002\b\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012¢\u0006\u0002\b\r2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012¢\u0006\u0002\b\r2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0000¢\u0006\u0004\b#\u0010$\"\u001a\u0010)\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(\"\u0014\u0010+\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&\"\u001a\u0010.\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0014\u0010/\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&\"\u0014\u00101\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010&\"\u0014\u00105\u001a\u0002028\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00107\u001a\u0002028\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u00104¨\u0006;²\u0006\f\u00109\u001a\u0002088\nX\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u0002088\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/animation/core/h1;", "", "expandedState", "Landroidx/compose/runtime/k2;", "Landroidx/compose/ui/graphics/p6;", "transformOriginState", "Landroidx/compose/foundation/w2;", "scrollState", "Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/u;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "a", "(Landroidx/compose/animation/core/h1;Landroidx/compose/runtime/k2;Landroidx/compose/foundation/w2;Landroidx/compose/ui/q;Lld/q;Landroidx/compose/runtime/t;II)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/s6;", "colors", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "d", "(Lld/p;Lld/a;Landroidx/compose/ui/q;Lld/p;Lld/p;ZLandroidx/compose/material3/s6;Landroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/unit/s;", "anchorBounds", "menuBounds", "h", "(Landroidx/compose/ui/unit/s;Landroidx/compose/ui/unit/s;)J", "Landroidx/compose/ui/unit/h;", "F", "j", "()F", "MenuVerticalMargin", "b", "DropdownMenuItemHorizontalPadding", "c", "i", "DropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "e", "DropdownMenuItemDefaultMaxWidth", "", "f", "I", "InTransitionDuration", "g", "OutTransitionDuration", "", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,407:1\n1163#2,4:408\n1083#2,5:412\n1163#2,4:417\n1083#2,5:421\n1116#3,6:426\n87#4,6:432\n93#4:466\n97#4:471\n78#5,11:438\n91#5:470\n456#6,8:449\n464#6,3:463\n467#6,3:467\n3737#7,6:457\n81#8:472\n81#8:473\n154#9:474\n154#9:475\n154#9:476\n154#9:477\n154#9:478\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n*L\n238#1:408,4\n238#1:412,5\n258#1:417,4\n258#1:421,5\n273#1:426,6\n307#1:432,6\n307#1:466\n307#1:471\n307#1:438,11\n307#1:470\n307#1:449,8\n307#1:463,3\n307#1:467,3\n307#1:457,6\n238#1:472\n258#1:473\n398#1:474\n399#1:475\n400#1:476\n401#1:477\n402#1:478\n*E\n"})
/* loaded from: classes.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14575a = androidx.compose.ui.unit.h.g(48);

    /* renamed from: b, reason: collision with root package name */
    private static final float f14576b = 12;

    /* renamed from: c, reason: collision with root package name */
    private static final float f14577c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final float f14578d = 112;

    /* renamed from: e, reason: collision with root package name */
    private static final float f14579e = 280;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14580f = 120;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14581g = 75;

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.q4, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.graphics.p6> f14582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f14583c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f14584d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.runtime.k2<androidx.compose.ui.graphics.p6> k2Var, androidx.compose.runtime.b5<Float> b5Var, androidx.compose.runtime.b5<Float> b5Var2) {
            super(1);
            this.f14582b = k2Var;
            this.f14583c = b5Var;
            this.f14584d = b5Var2;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.q4 q4Var) {
            q4Var.z(t6.b(this.f14583c));
            q4Var.Q(t6.b(this.f14583c));
            q4Var.k(t6.c(this.f14584d));
            q4Var.r2(this.f14582b.getValue().getPackedValue());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.q4 q4Var) {
            a(q4Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,407:1\n74#2,6:408\n80#2:442\n84#2:447\n78#3,11:414\n91#3:446\n456#4,8:425\n464#4,3:439\n467#4,3:443\n3737#5,6:433\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuContent$2\n*L\n284#1:408,6\n284#1:442\n284#1:447\n284#1:414,11\n284#1:446\n284#1:425,8\n284#1:439,3\n284#1:443,3\n284#1:433,6\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.w2 f14586c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f14587d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, androidx.compose.foundation.w2 w2Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2) {
            super(2);
            this.f14585b = qVar;
            this.f14586c = w2Var;
            this.f14587d = qVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1266256833, i4, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:283)");
            }
            androidx.compose.ui.q f4 = androidx.compose.foundation.v2.f(androidx.compose.foundation.layout.v0.d(androidx.compose.foundation.layout.j1.m(this.f14585b, 0.0f, t6.i(), 1, null), androidx.compose.foundation.layout.x0.Max), this.f14586c, false, null, false, 14, null);
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f14587d;
            tVar.P(-483455358);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(f4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            qVar.R(androidx.compose.foundation.layout.v.f5347a, tVar, 6);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.h1<Boolean> f14588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.graphics.p6> f14589c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.w2 f14590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14591e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f14592f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14593g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14594h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.animation.core.h1<Boolean> h1Var, androidx.compose.runtime.k2<androidx.compose.ui.graphics.p6> k2Var, androidx.compose.foundation.w2 w2Var, androidx.compose.ui.q qVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f14588b = h1Var;
            this.f14589c = k2Var;
            this.f14590d = w2Var;
            this.f14591e = qVar;
            this.f14592f = qVar2;
            this.f14593g = i4;
            this.f14594h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            t6.a(this.f14588b, this.f14589c, this.f14590d, this.f14591e, this.f14592f, tVar, androidx.compose.runtime.g3.b(this.f14593g | 1), this.f14594h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<e2.b<Boolean>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f14595b = new d(3);

        d() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(e2.b<Boolean> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<Boolean> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-1498621383);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1498621383, i4, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:259)");
            }
            androidx.compose.animation.core.h2 r4 = bVar.j(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.l.r(30, 0, null, 6, null) : androidx.compose.animation.core.l.r(75, 0, null, 6, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return r4;
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<e2.b<Boolean>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f14596b = new e(3);

        e() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(e2.b<Boolean> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<Boolean> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-952455731);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-952455731, i4, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:239)");
            }
            androidx.compose.animation.core.h2 r4 = bVar.j(Boolean.FALSE, Boolean.TRUE) ? androidx.compose.animation.core.l.r(120, 0, androidx.compose.animation.core.m0.f(), 2, null) : androidx.compose.animation.core.l.r(1, 74, null, 4, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return r4;
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14597b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s6 f14598c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14599d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14600e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.x1 f14601f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14602g;

        /* compiled from: Menu.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,407:1\n68#2,6:408\n74#2:442\n78#2:447\n78#3,11:414\n91#3:446\n456#4,8:425\n464#4,3:439\n467#4,3:443\n3737#5,6:433\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$1\n*L\n330#1:408,6\n330#1:442\n330#1:447\n330#1:414,11\n330#1:446\n330#1:425,8\n330#1:439,3\n330#1:443,3\n330#1:433,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14603b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14603b = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(2035552199, i4, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:329)");
                }
                androidx.compose.ui.q b5 = androidx.compose.foundation.layout.c2.b(androidx.compose.ui.q.INSTANCE, c0.g0.f37304a.p(), 0.0f, 2, null);
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14603b;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(b5);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: Menu.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,407:1\n154#2:408\n154#2:409\n68#3,6:410\n74#3:444\n78#3:449\n78#4,11:416\n91#4:448\n456#5,8:427\n464#5,3:441\n467#5,3:445\n3737#6,6:435\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$2\n*L\n343#1:408\n348#1:409\n336#1:410,6\n336#1:444\n336#1:449\n336#1:416,11\n336#1:448\n336#1:427,8\n336#1:441,3\n336#1:445,3\n336#1:435,6\n*E\n"})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.x1 f14604b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14605c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14606d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14607e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.compose.foundation.layout.x1 x1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3) {
                super(2);
                this.f14604b = x1Var;
                this.f14605c = pVar;
                this.f14606d = pVar2;
                this.f14607e = pVar3;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1728894036, i4, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:335)");
                }
                androidx.compose.ui.q o4 = androidx.compose.foundation.layout.j1.o(androidx.compose.foundation.layout.x1.e(this.f14604b, androidx.compose.ui.q.INSTANCE, 1.0f, false, 2, null), this.f14605c != null ? t6.f14576b : androidx.compose.ui.unit.h.g(0), 0.0f, this.f14606d != null ? t6.f14576b : androidx.compose.ui.unit.h.g(0), 0.0f, 10, null);
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14607e;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(o4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: Menu.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,407:1\n68#2,6:408\n74#2:442\n78#2:447\n78#3,11:414\n91#3:446\n456#4,8:425\n464#4,3:439\n467#4,3:443\n3737#5,6:433\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuItemContent$1$1$3\n*L\n359#1:408,6\n359#1:442\n359#1:447\n359#1:414,11\n359#1:446\n359#1:425,8\n359#1:439,3\n359#1:443,3\n359#1:433,6\n*E\n"})
        static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14608b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14608b = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(580312062, i4, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:358)");
                }
                androidx.compose.ui.q b5 = androidx.compose.foundation.layout.c2.b(androidx.compose.ui.q.INSTANCE, c0.g0.f37304a.w(), 0.0f, 2, null);
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14608b;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(b5);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, s6 s6Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.foundation.layout.x1 x1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3) {
            super(2);
            this.f14597b = pVar;
            this.f14598c = s6Var;
            this.f14599d = z4;
            this.f14600e = pVar2;
            this.f14601f = x1Var;
            this.f14602g = pVar3;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1065051884, i4, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:325)");
            }
            tVar.P(1426260804);
            if (this.f14597b != null) {
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(this.f14598c.i(this.f14599d, tVar, 0))), androidx.compose.runtime.internal.c.b(tVar, 2035552199, true, new a(this.f14597b)), tVar, androidx.compose.runtime.b3.f15974d | 48);
            }
            tVar.p0();
            androidx.compose.runtime.b3<androidx.compose.ui.graphics.d2> e4 = p3.a().e(this.f14598c.j(this.f14599d, tVar, 0).getValue());
            androidx.compose.runtime.internal.a b5 = androidx.compose.runtime.internal.c.b(tVar, -1728894036, true, new b(this.f14601f, this.f14597b, this.f14600e, this.f14602g));
            int i5 = androidx.compose.runtime.b3.f15974d;
            androidx.compose.runtime.f0.b(e4, b5, tVar, i5 | 48);
            if (this.f14600e != null) {
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(this.f14598c.k(this.f14599d, tVar, 0))), androidx.compose.runtime.internal.c.b(tVar, 580312062, true, new c(this.f14600e)), tVar, i5 | 48);
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f14610c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14611d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14612e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14613f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f14614g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ s6 f14615h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f14616i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14617j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f14618k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, boolean z4, s6 s6Var, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, int i4) {
            super(2);
            this.f14609b = pVar;
            this.f14610c = aVar;
            this.f14611d = qVar;
            this.f14612e = pVar2;
            this.f14613f = pVar3;
            this.f14614g = z4;
            this.f14615h = s6Var;
            this.f14616i = l1Var;
            this.f14617j = kVar;
            this.f14618k = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            t6.d(this.f14609b, this.f14610c, this.f14611d, this.f14612e, this.f14613f, this.f14614g, this.f14615h, this.f14616i, this.f14617j, tVar, androidx.compose.runtime.g3.b(this.f14618k | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.animation.core.h1<java.lang.Boolean> r23, @fg.l androidx.compose.runtime.k2<androidx.compose.ui.graphics.p6> r24, @fg.l androidx.compose.foundation.w2 r25, @fg.m androidx.compose.ui.q r26, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m androidx.compose.runtime.t r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.t6.a(androidx.compose.animation.core.h1, androidx.compose.runtime.k2, androidx.compose.foundation.w2, androidx.compose.ui.q, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(androidx.compose.runtime.b5<Float> b5Var) {
        return b5Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(androidx.compose.runtime.b5<Float> b5Var) {
        return b5Var.getValue().floatValue();
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void d(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.l ld.a<kotlin.k2> aVar, @fg.l androidx.compose.ui.q qVar, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, boolean z4, @fg.l s6 s6Var, @fg.l androidx.compose.foundation.layout.l1 l1Var, @fg.l androidx.compose.foundation.interaction.k kVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1564716777);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(pVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(aVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.q0(qVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(pVar2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.b(z4) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.q0(s6Var) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.q0(l1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= o4.q0(kVar) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((38347923 & i5) == 38347922 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1564716777, i5, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:304)");
            }
            androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(androidx.compose.foundation.g0.d(qVar, kVar, androidx.compose.material.ripple.p.e(true, 0.0f, 0L, o4, 6, 6), z4, null, null, aVar, 24, null), 0.0f, 1, null);
            float f4 = f14578d;
            float f5 = f14579e;
            c0.g0 g0Var = c0.g0.f37304a;
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.foundation.layout.c2.A(h4, f4, g0Var.e(), f5, 0.0f, 8, null), l1Var);
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            o4.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(androidx.compose.foundation.layout.i.f5073a.p(), q4, o4, 48);
            o4.P(-1323940314);
            int j5 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(j4);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, o4, d5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, o4, j5, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            xa.a(tb.a(p6.f13227a.c(o4, 6), g0Var.l()), androidx.compose.runtime.internal.c.b(o4, 1065051884, true, new f(pVar2, s6Var, z4, pVar3, androidx.compose.foundation.layout.y1.f5410a, pVar)), o4, 48);
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new g(pVar, aVar, qVar, pVar2, pVar3, z4, s6Var, l1Var, kVar, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long h(@fg.l androidx.compose.ui.unit.s r5, @fg.l androidx.compose.ui.unit.s r6) {
        /*
            int r0 = r6.t()
            int r1 = r5.x()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lf
        Ld:
            r0 = r3
            goto L49
        Lf:
            int r0 = r6.x()
            int r1 = r5.t()
            if (r0 > r1) goto L1b
            r0 = r2
            goto L49
        L1b:
            int r0 = r6.G()
            if (r0 != 0) goto L22
            goto Ld
        L22:
            int r0 = r5.t()
            int r1 = r6.t()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.x()
            int r4 = r6.x()
            int r1 = java.lang.Math.min(r1, r4)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r0 = r6.t()
            int r1 = r1 - r0
            float r0 = (float) r1
            int r1 = r6.G()
            float r1 = (float) r1
            float r0 = r0 / r1
        L49:
            int r1 = r6.getTop()
            int r4 = r5.j()
            if (r1 < r4) goto L55
        L53:
            r2 = r3
            goto L8f
        L55:
            int r1 = r6.j()
            int r4 = r5.getTop()
            if (r1 > r4) goto L60
            goto L8f
        L60:
            int r1 = r6.r()
            if (r1 != 0) goto L67
            goto L53
        L67:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.j()
            int r2 = r6.j()
            int r5 = java.lang.Math.min(r5, r2)
            int r5 = r5 + r1
            int r5 = r5 / 2
            int r1 = r6.getTop()
            int r5 = r5 - r1
            float r5 = (float) r5
            int r6 = r6.r()
            float r6 = (float) r6
            float r2 = r5 / r6
        L8f:
            long r5 = androidx.compose.ui.graphics.q6.a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.t6.h(androidx.compose.ui.unit.s, androidx.compose.ui.unit.s):long");
    }

    public static final float i() {
        return f14577c;
    }

    public static final float j() {
        return f14575a;
    }
}
