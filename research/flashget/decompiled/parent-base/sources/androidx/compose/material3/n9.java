package androidx.compose.material3;

import androidx.compose.runtime.t;
import androidx.compose.ui.node.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\fH\u0003¢\u0006\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010#\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010#\"\u0014\u0010'\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#*b\b\u0002\u0010*\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006+"}, d2 = {"Landroidx/compose/material3/o9;", "hostState", "Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material3/k9;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "snackbar", "b", "(Landroidx/compose/material3/o9;Landroidx/compose/ui/q;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/material3/m9;", "", "hasAction", "Landroidx/compose/ui/platform/b;", "accessibilityManager", "", "h", "(Landroidx/compose/material3/m9;ZLandroidx/compose/ui/platform/b;)J", "current", "content", "a", "(Landroidx/compose/material3/k9;Landroidx/compose/ui/q;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/animation/core/k;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/b5;", "f", "(Landroidx/compose/animation/core/k;ZLld/a;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "g", "(Landroidx/compose/animation/core/k;ZLandroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "", "I", "SnackbarFadeInMillis", "SnackbarFadeOutMillis", "c", "SnackbarInBetweenDelayMillis", "Lkotlin/r0;", "name", "FadeInFadeOutTransition", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,464:1\n74#2:465\n1116#3,6:466\n1116#3,6:472\n1116#3,6:545\n1116#3,6:551\n1116#3,6:557\n1116#3,6:563\n151#4,3:478\n33#4,4:481\n154#4,2:485\n38#4:487\n156#4:488\n200#4,2:489\n33#4,4:491\n202#4,2:495\n38#4:497\n204#4:498\n33#4,6:534\n68#5,6:499\n74#5:533\n78#5:544\n78#6,11:505\n91#6:543\n456#7,8:516\n464#7,3:530\n467#7,3:540\n3737#8,6:524\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n*L\n227#1:465\n228#1:466,6\n348#1:472,6\n438#1:545,6\n439#1:551,6\n451#1:557,6\n452#1:563,6\n351#1:478,3\n351#1:481,4\n351#1:485,2\n351#1:487\n351#1:488\n356#1:489,2\n356#1:491,4\n356#1:495,2\n356#1:497\n356#1:498\n408#1:534,6\n406#1:499,6\n406#1:533\n406#1:544\n406#1:505,11\n406#1:543\n406#1:516,8\n406#1:530,3\n406#1:540,3\n406#1:524,6\n*E\n"})
/* loaded from: classes.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12708a = 150;

    /* renamed from: b, reason: collision with root package name */
    private static final int f12709b = 75;

    /* renamed from: c, reason: collision with root package name */
    private static final int f12710c = 0;

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "children", "a", "(Lld/p;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,464:1\n1116#2,6:465\n1116#2,6:471\n68#3,6:477\n74#3:511\n78#3:516\n78#4,11:483\n91#4:515\n456#5,8:494\n464#5,3:508\n467#5,3:512\n3737#6,6:502\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n*L\n373#1:465,6\n396#1:471,6\n389#1:477,6\n389#1:511\n389#1:516\n389#1:483,11\n389#1:515\n389#1:494,8\n389#1:508,3\n389#1:512,3\n389#1:502,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k9 f12711b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k9 f12712c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<k9> f12713d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m5<k9> f12714e;

        /* compiled from: SnackbarHost.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.n9$a$a, reason: collision with other inner class name */
        static final class C0276a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k9 f12715b;

            /* compiled from: SnackbarHost.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.n9$a$a$a, reason: collision with other inner class name */
            static final class C0277a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ k9 f12716b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0277a(k9 k9Var) {
                    super(0);
                    this.f12716b = k9Var;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    this.f12716b.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0276a(k9 k9Var) {
                super(1);
                this.f12715b = k9Var;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.g.INSTANCE.getClass();
                androidx.compose.ui.semantics.w.g1(zVar, androidx.compose.ui.semantics.g.f20299c);
                androidx.compose.ui.semantics.w.p(zVar, null, new C0277a(this.f12715b), 1, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: SnackbarHost.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k9 f12717b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m5<k9> f12718c;

            /* compiled from: SnackbarHost.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/material3/l5;", "Landroidx/compose/material3/k9;", "it", "", "a", "(Landroidx/compose/material3/l5;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.n9$a$b$a, reason: collision with other inner class name */
            static final class C0278a extends kotlin.jvm.internal.n0 implements ld.l<l5<k9>, Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ k9 f12719b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0278a(k9 k9Var) {
                    super(1);
                    this.f12719b = k9Var;
                }

                @Override // ld.l
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@fg.l l5<k9> l5Var) {
                    return Boolean.valueOf(kotlin.jvm.internal.l0.g(l5Var.e(), this.f12719b));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k9 k9Var, m5<k9> m5Var) {
                super(0);
                this.f12717b = k9Var;
                this.f12718c = m5Var;
            }

            public final void a() {
                if (kotlin.jvm.internal.l0.g(this.f12717b, this.f12718c.getCurrent())) {
                    return;
                }
                kotlin.collections.w.L0(this.f12718c.b(), new C0278a(this.f12717b));
                androidx.compose.runtime.e3 scope = this.f12718c.getScope();
                if (scope != null) {
                    scope.invalidate();
                }
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k9 k9Var, k9 k9Var2, List<k9> list, m5<k9> m5Var) {
            super(3);
            this.f12711b = k9Var;
            this.f12712c = k9Var2;
            this.f12713d = list;
            this.f12714e = m5Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(ld.p<? super androidx.compose.runtime.t, ? super Integer, ? extends kotlin.k2> pVar, androidx.compose.runtime.t tVar, Integer num) {
            a(pVar, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        @androidx.compose.runtime.i
        public final void a(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            if ((i4 & 6) == 0) {
                i5 = i4 | (tVar.S(pVar) ? 4 : 2);
            } else {
                i5 = i4;
            }
            if ((i5 & 19) == 18 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1654683077, i5, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:357)");
            }
            boolean g4 = kotlin.jvm.internal.l0.g(this.f12711b, this.f12712c);
            int i6 = g4 ? 150 : 75;
            int i7 = (!g4 || androidx.compose.ui.util.c.f(this.f12713d).size() == 1) ? 0 : 75;
            androidx.compose.animation.core.h2 h2Var = new androidx.compose.animation.core.h2(i6, i7, androidx.compose.animation.core.m0.e());
            tVar.P(870026295);
            boolean q02 = tVar.q0(this.f12711b) | tVar.S(this.f12714e);
            k9 k9Var = this.f12711b;
            m5<k9> m5Var = this.f12714e;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new b(k9Var, m5Var);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.runtime.b5 f4 = n9.f(h2Var, g4, (ld.a) Q, tVar, 0, 0);
            androidx.compose.runtime.b5 g5 = n9.g(new androidx.compose.animation.core.h2(i6, i7, androidx.compose.animation.core.m0.d()), g4, tVar, 0);
            androidx.compose.ui.q e4 = androidx.compose.ui.graphics.p4.e(androidx.compose.ui.q.INSTANCE, ((Number) g5.getValue()).floatValue(), ((Number) g5.getValue()).floatValue(), ((Number) f4.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            tVar.P(870027225);
            boolean q03 = tVar.q0(this.f12711b);
            k9 k9Var2 = this.f12711b;
            Object Q2 = tVar.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new C0276a(k9Var2);
                tVar.E(Q2);
            }
            tVar.p0();
            androidx.compose.ui.q f5 = androidx.compose.ui.semantics.o.f(e4, false, (ld.l) Q2, 1, null);
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(f5);
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
            androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a(i5 & 14, pVar, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<k9, androidx.compose.runtime.t, Integer, kotlin.k2> f12720b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k9 f12721c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.q<? super k9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, k9 k9Var) {
            super(2);
            this.f12720b = qVar;
            this.f12721c = k9Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1135367807, i4, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:410)");
            }
            ld.q<k9, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12720b;
            k9 k9Var = this.f12721c;
            kotlin.jvm.internal.l0.m(k9Var);
            qVar.R(k9Var, tVar, 0);
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

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k9 f12722b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12723c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<k9, androidx.compose.runtime.t, Integer, kotlin.k2> f12724d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f12725e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12726f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(k9 k9Var, androidx.compose.ui.q qVar, ld.q<? super k9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12722b = k9Var;
            this.f12723c = qVar;
            this.f12724d = qVar2;
            this.f12725e = i4;
            this.f12726f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n9.a(this.f12722b, this.f12723c, this.f12724d, tVar, androidx.compose.runtime.g3.b(this.f12725e | 1), this.f12726f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12727b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k9 f12728c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.b f12729d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k9 k9Var, androidx.compose.ui.platform.b bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f12728c = k9Var;
            this.f12729d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new d(this.f12728c, this.f12729d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12727b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                k9 k9Var = this.f12728c;
                if (k9Var != null) {
                    long h4 = n9.h(k9Var.getVisuals().getDuration(), this.f12728c.getVisuals().getActionLabel() != null, this.f12729d);
                    this.f12727b = 1;
                    if (kotlinx.coroutines.c1.b(h4, this) == aVar) {
                        return aVar;
                    }
                }
                return kotlin.k2.f75408a;
            }
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            this.f12728c.dismiss();
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o9 f12730b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12731c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<k9, androidx.compose.runtime.t, Integer, kotlin.k2> f12732d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f12733e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12734f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(o9 o9Var, androidx.compose.ui.q qVar, ld.q<? super k9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12730b = o9Var;
            this.f12731c = qVar;
            this.f12732d = qVar2;
            this.f12733e = i4;
            this.f12734f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n9.b(this.f12730b, this.f12731c, this.f12732d, tVar, androidx.compose.runtime.g3.b(this.f12733e | 1), this.f12734f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12735a;

        static {
            int[] iArr = new int[m9.values().length];
            try {
                iArr[m9.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m9.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m9.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12735a = iArr;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f12736b = new g(0);

        g() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public kotlin.k2 invoke() {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {440}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12737b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f12738c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12739d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<Float> f12740e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f12741f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar, boolean z4, androidx.compose.animation.core.k<Float> kVar, ld.a<kotlin.k2> aVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f12738c = bVar;
            this.f12739d = z4;
            this.f12740e = kVar;
            this.f12741f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new h(this.f12738c, this.f12739d, this.f12740e, this.f12741f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12737b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar = this.f12738c;
                Float f4 = new Float(this.f12739d ? 1.0f : 0.0f);
                androidx.compose.animation.core.k<Float> kVar = this.f12740e;
                this.f12737b = 1;
                if (androidx.compose.animation.core.b.i(bVar, f4, kVar, null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            this.f12741f.invoke();
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((h) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", i = {}, l = {453}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12742b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f12743c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12744d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<Float> f12745e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar, boolean z4, androidx.compose.animation.core.k<Float> kVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f12743c = bVar;
            this.f12744d = z4;
            this.f12745e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new i(this.f12743c, this.f12744d, this.f12745e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12742b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar = this.f12743c;
                Float f4 = new Float(this.f12744d ? 1.0f : 0.8f);
                androidx.compose.animation.core.k<Float> kVar = this.f12745e;
                this.f12742b = 1;
                if (androidx.compose.animation.core.b.i(bVar, f4, kVar, null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((i) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d A[LOOP:2: B:54:0x018b->B:55:0x018d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0048  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.material3.k9 r16, androidx.compose.ui.q r17, ld.q<? super androidx.compose.material3.k9, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r18, androidx.compose.runtime.t r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.n9.a(androidx.compose.material3.k9, androidx.compose.ui.q, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(@fg.l o9 o9Var, @fg.m androidx.compose.ui.q qVar, @fg.m ld.q<? super k9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(464178177);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (o4.q0(o9Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= o4.q0(qVar) ? 32 : 16;
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= o4.S(qVar2) ? 256 : 128;
        }
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (i10 != 0) {
                l3.f12176a.getClass();
                qVar2 = l3.f12177b;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(464178177, i6, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:224)");
            }
            k9 b5 = o9Var.b();
            androidx.compose.ui.platform.b bVar = (androidx.compose.ui.platform.b) o4.x(androidx.compose.ui.platform.h1.c());
            o4.P(-1401194142);
            boolean q02 = o4.q0(b5) | o4.S(bVar);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new d(b5, bVar, null);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.runtime.a1.h(b5, (ld.p) Q, o4, 0);
            a(o9Var.b(), qVar, qVar2, o4, i6 & 1008, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar3 = qVar;
        ld.q<? super k9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar4 = qVar2;
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new e(o9Var, qVar3, qVar4, i4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final androidx.compose.runtime.b5<Float> f(androidx.compose.animation.core.k<Float> kVar, boolean z4, ld.a<kotlin.k2> aVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1431889134);
        if ((i5 & 4) != 0) {
            aVar = g.f12736b;
        }
        ld.a<kotlin.k2> aVar2 = aVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1431889134, i4, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:436)");
        }
        tVar.P(1730440772);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = androidx.compose.animation.core.c.b(!z4 ? 1.0f : 0.0f, 0.0f, 2, null);
            tVar.E(Q);
        }
        androidx.compose.animation.core.b bVar = (androidx.compose.animation.core.b) Q;
        tVar.p0();
        Boolean valueOf = Boolean.valueOf(z4);
        tVar.P(1730440850);
        boolean S = tVar.S(bVar) | ((((i4 & 112) ^ 48) > 32 && tVar.b(z4)) || (i4 & 48) == 32) | tVar.S(kVar) | ((((i4 & 896) ^ 384) > 256 && tVar.q0(aVar2)) || (i4 & 384) == 256);
        Object Q2 = tVar.Q();
        if (S || Q2 == companion.a()) {
            Object hVar = new h(bVar, z4, kVar, aVar2, null);
            tVar.E(hVar);
            Q2 = hVar;
        }
        tVar.p0();
        androidx.compose.runtime.a1.h(valueOf, (ld.p) Q2, tVar, (i4 >> 3) & 14);
        androidx.compose.runtime.b5<Float> j4 = bVar.j();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final androidx.compose.runtime.b5<Float> g(androidx.compose.animation.core.k<Float> kVar, boolean z4, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1966809761);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1966809761, i4, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:449)");
        }
        tVar.P(-92311588);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = androidx.compose.animation.core.c.b(!z4 ? 1.0f : 0.8f, 0.0f, 2, null);
            tVar.E(Q);
        }
        androidx.compose.animation.core.b bVar = (androidx.compose.animation.core.b) Q;
        tVar.p0();
        Boolean valueOf = Boolean.valueOf(z4);
        tVar.P(-92311508);
        boolean S = tVar.S(bVar) | ((((i4 & 112) ^ 48) > 32 && tVar.b(z4)) || (i4 & 48) == 32) | tVar.S(kVar);
        Object Q2 = tVar.Q();
        if (S || Q2 == companion.a()) {
            Q2 = new i(bVar, z4, kVar, null);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.a1.h(valueOf, (ld.p) Q2, tVar, (i4 >> 3) & 14);
        androidx.compose.runtime.b5<Float> j4 = bVar.j();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }

    public static final long h(@fg.l m9 m9Var, boolean z4, @fg.m androidx.compose.ui.platform.b bVar) {
        long j4;
        int i4 = f.f12735a[m9Var.ordinal()];
        if (i4 == 1) {
            j4 = Long.MAX_VALUE;
        } else if (i4 == 2) {
            j4 = androidx.work.i0.f35991f;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j4 = 4000;
        }
        long j5 = j4;
        return bVar == null ? j5 : bVar.b(j5, true, true, z4);
    }
}
