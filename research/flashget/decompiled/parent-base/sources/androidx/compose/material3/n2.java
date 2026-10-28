package androidx.compose.material3;

import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.profileinstaller.o;
import kotlin.Metadata;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aa\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0083\u0001\u0010\u0018\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aU\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aw\u0010\u001c\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a_\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u0011\u001a\u0081\u0001\u0010\u001f\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/material3/k2;", "colors", "Landroidx/compose/material3/m2;", "elevation", "Landroidx/compose/foundation/c0;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/u;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/k2;Landroidx/compose/material3/m2;Landroidx/compose/foundation/c0;Lld/q;Landroidx/compose/runtime/t;II)V", "Lkotlin/Function0;", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "b", "(Lld/a;Landroidx/compose/ui/q;ZLandroidx/compose/ui/graphics/e6;Landroidx/compose/material3/k2;Landroidx/compose/material3/m2;Landroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Lld/q;Landroidx/compose/runtime/t;II)V", "c", "(Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/k2;Landroidx/compose/material3/m2;Lld/q;Landroidx/compose/runtime/t;II)V", "d", "(Lld/a;Landroidx/compose/ui/q;ZLandroidx/compose/ui/graphics/e6;Landroidx/compose/material3/k2;Landroidx/compose/material3/m2;Landroidx/compose/foundation/interaction/k;Lld/q;Landroidx/compose/runtime/t;II)V", "e", "f", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,850:1\n1116#2,6:851\n1116#2,6:857\n1116#2,6:863\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n*L\n140#1:851,6\n237#1:857,6\n333#1:863,6\n*E\n"})
/* loaded from: classes.dex */
public final class n2 {

    /* compiled from: Card.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,850:1\n73#2,7:851\n80#2:886\n84#2:891\n78#3,11:858\n91#3:890\n456#4,8:869\n464#4,3:883\n467#4,3:887\n3737#5,6:877\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$1\n*L\n94#1:851,7\n94#1:886\n94#1:891\n94#1:858,11\n94#1:890\n94#1:869,8\n94#1:883,3\n94#1:887,3\n94#1:877,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12599b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f12599b = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(664103990, i4, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:93)");
            }
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12599b;
            tVar.P(-483455358);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, a5, tVar, B);
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

    /* compiled from: Card.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12600b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12601c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k2 f12602d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m2 f12603e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f12604f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12605g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12606h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12607i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, k2 k2Var, m2 m2Var, androidx.compose.foundation.c0 c0Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12600b = qVar;
            this.f12601c = e6Var;
            this.f12602d = k2Var;
            this.f12603e = m2Var;
            this.f12604f = c0Var;
            this.f12605g = qVar2;
            this.f12606h = i4;
            this.f12607i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n2.a(this.f12600b, this.f12601c, this.f12602d, this.f12603e, this.f12604f, this.f12605g, tVar, androidx.compose.runtime.g3.b(this.f12606h | 1), this.f12607i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Card.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,850:1\n73#2,7:851\n80#2:886\n84#2:891\n78#3,11:858\n91#3:890\n456#4,8:869\n464#4,3:883\n467#4,3:887\n3737#5,6:877\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$4\n*L\n155#1:851,7\n155#1:886\n155#1:891\n155#1:858,11\n155#1:890\n155#1:869,8\n155#1:883,3\n155#1:887,3\n155#1:877,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12608b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f12608b = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(776921067, i4, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:154)");
            }
            ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f12608b;
            tVar.P(-483455358);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, a5, tVar, B);
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

    /* compiled from: Card.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f12609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12610c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12611d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12612e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k2 f12613f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ m2 f12614g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f12615h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12616i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12617j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12618k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12619l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, k2 k2Var, m2 m2Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12609b = aVar;
            this.f12610c = qVar;
            this.f12611d = z4;
            this.f12612e = e6Var;
            this.f12613f = k2Var;
            this.f12614g = m2Var;
            this.f12615h = c0Var;
            this.f12616i = kVar;
            this.f12617j = qVar2;
            this.f12618k = i4;
            this.f12619l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n2.b(this.f12609b, this.f12610c, this.f12611d, this.f12612e, this.f12613f, this.f12614g, this.f12615h, this.f12616i, this.f12617j, tVar, androidx.compose.runtime.g3.b(this.f12618k | 1), this.f12619l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Card.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12620b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12621c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k2 f12622d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m2 f12623e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12624f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12625g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12626h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, k2 k2Var, m2 m2Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12620b = qVar;
            this.f12621c = e6Var;
            this.f12622d = k2Var;
            this.f12623e = m2Var;
            this.f12624f = qVar2;
            this.f12625g = i4;
            this.f12626h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n2.c(this.f12620b, this.f12621c, this.f12622d, this.f12623e, this.f12624f, tVar, androidx.compose.runtime.g3.b(this.f12625g | 1), this.f12626h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Card.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f12627b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12628c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12629d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12630e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k2 f12631f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ m2 f12632g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12633h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12634i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f12635j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12636k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, k2 k2Var, m2 m2Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12627b = aVar;
            this.f12628c = qVar;
            this.f12629d = z4;
            this.f12630e = e6Var;
            this.f12631f = k2Var;
            this.f12632g = m2Var;
            this.f12633h = kVar;
            this.f12634i = qVar2;
            this.f12635j = i4;
            this.f12636k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n2.d(this.f12627b, this.f12628c, this.f12629d, this.f12630e, this.f12631f, this.f12632g, this.f12633h, this.f12634i, tVar, androidx.compose.runtime.g3.b(this.f12635j | 1), this.f12636k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Card.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12637b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12638c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k2 f12639d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m2 f12640e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f12641f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12642g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12643h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f12644i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, k2 k2Var, m2 m2Var, androidx.compose.foundation.c0 c0Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12637b = qVar;
            this.f12638c = e6Var;
            this.f12639d = k2Var;
            this.f12640e = m2Var;
            this.f12641f = c0Var;
            this.f12642g = qVar2;
            this.f12643h = i4;
            this.f12644i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n2.e(this.f12637b, this.f12638c, this.f12639d, this.f12640e, this.f12641f, this.f12642g, tVar, androidx.compose.runtime.g3.b(this.f12643h | 1), this.f12644i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Card.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f12645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f12646c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12647d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f12648e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k2 f12649f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ m2 f12650g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f12651h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f12652i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f12653j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12654k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12655l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, k2 k2Var, m2 m2Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f12645b = aVar;
            this.f12646c = qVar;
            this.f12647d = z4;
            this.f12648e = e6Var;
            this.f12649f = k2Var;
            this.f12650g = m2Var;
            this.f12651h = c0Var;
            this.f12652i = kVar;
            this.f12653j = qVar2;
            this.f12654k = i4;
            this.f12655l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n2.f(this.f12645b, this.f12646c, this.f12647d, this.f12648e, this.f12649f, this.f12650g, this.f12651h, this.f12652i, this.f12653j, tVar, androidx.compose.runtime.g3.b(this.f12654k | 1), this.f12655l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.m androidx.compose.ui.q qVar, @fg.m androidx.compose.ui.graphics.e6 e6Var, @fg.m k2 k2Var, @fg.m m2 m2Var, @fg.m androidx.compose.foundation.c0 c0Var, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        androidx.compose.ui.q qVar3;
        int i6;
        androidx.compose.ui.graphics.e6 e6Var2;
        k2 k2Var2;
        m2 m2Var2;
        androidx.compose.foundation.c0 c0Var2;
        androidx.compose.ui.q qVar4;
        androidx.compose.ui.graphics.e6 e6Var3;
        k2 k2Var3;
        m2 m2Var3;
        androidx.compose.foundation.c0 c0Var3;
        int i7;
        m2 m2Var4;
        m2 m2Var5;
        androidx.compose.foundation.c0 c0Var4;
        int i10;
        int i11;
        int i12;
        androidx.compose.runtime.t o4 = tVar.o(1179621553);
        int i13 = i5 & 1;
        if (i13 != 0) {
            i6 = i4 | 6;
            qVar3 = qVar;
        } else if ((i4 & 6) == 0) {
            qVar3 = qVar;
            i6 = (o4.q0(qVar3) ? 4 : 2) | i4;
        } else {
            qVar3 = qVar;
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i5 & 2) == 0) {
                e6Var2 = e6Var;
                if (o4.q0(e6Var2)) {
                    i12 = 32;
                    i6 |= i12;
                }
            } else {
                e6Var2 = e6Var;
            }
            i12 = 16;
            i6 |= i12;
        } else {
            e6Var2 = e6Var;
        }
        if ((i4 & 384) == 0) {
            if ((i5 & 4) == 0) {
                k2Var2 = k2Var;
                if (o4.q0(k2Var2)) {
                    i11 = 256;
                    i6 |= i11;
                }
            } else {
                k2Var2 = k2Var;
            }
            i11 = 128;
            i6 |= i11;
        } else {
            k2Var2 = k2Var;
        }
        if ((i4 & 3072) == 0) {
            if ((i5 & 8) == 0) {
                m2Var2 = m2Var;
                if (o4.q0(m2Var2)) {
                    i10 = 2048;
                    i6 |= i10;
                }
            } else {
                m2Var2 = m2Var;
            }
            i10 = 1024;
            i6 |= i10;
        } else {
            m2Var2 = m2Var;
        }
        int i14 = i5 & 16;
        if (i14 != 0) {
            i6 |= 24576;
            c0Var2 = c0Var;
        } else {
            c0Var2 = c0Var;
            if ((i4 & 24576) == 0) {
                i6 |= o4.q0(c0Var2) ? 16384 : 8192;
            }
        }
        if ((i5 & 32) != 0) {
            i6 |= o.c.f32821k;
        } else if ((i4 & o.c.f32821k) == 0) {
            i6 |= o4.S(qVar2) ? 131072 : 65536;
        }
        if ((74899 & i6) == 74898 && o4.p()) {
            o4.d0();
            qVar4 = qVar3;
            e6Var3 = e6Var2;
            m2Var5 = m2Var2;
            c0Var4 = c0Var2;
        } else {
            o4.T();
            if ((i4 & 1) == 0 || o4.i0()) {
                qVar4 = i13 != 0 ? androidx.compose.ui.q.INSTANCE : qVar3;
                if ((i5 & 2) != 0) {
                    e6Var3 = l2.f12174a.l(o4, 6);
                    i6 &= -113;
                } else {
                    e6Var3 = e6Var2;
                }
                if ((i5 & 4) != 0) {
                    k2Var3 = l2.f12174a.a(o4, 6);
                    i6 &= -897;
                } else {
                    k2Var3 = k2Var2;
                }
                if ((i5 & 8) != 0) {
                    m2Var3 = l2.f12174a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, o4, 1572864, 63);
                    i6 &= -7169;
                } else {
                    m2Var3 = m2Var2;
                }
                c0Var3 = i14 != 0 ? null : c0Var;
                m2 m2Var6 = m2Var3;
                i7 = i6;
                m2Var4 = m2Var6;
            } else {
                o4.d0();
                if ((i5 & 2) != 0) {
                    i6 &= -113;
                }
                if ((i5 & 4) != 0) {
                    i6 &= -897;
                }
                if ((i5 & 8) != 0) {
                    i6 &= -7169;
                }
                qVar4 = qVar3;
                e6Var3 = e6Var2;
                k2Var3 = k2Var2;
                c0Var3 = c0Var2;
                i7 = i6;
                m2Var4 = m2Var2;
            }
            o4.I();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1179621553, i7, -1, "androidx.compose.material3.Card (Card.kt:83)");
            }
            m2 m2Var7 = m2Var4;
            x9.a(qVar4, e6Var3, k2Var3.a(true), k2Var3.b(true), m2Var4.g(true), m2Var4.f(true, null, o4, ((i7 >> 3) & 896) | 54).getValue().u(), c0Var3, androidx.compose.runtime.internal.c.b(o4, 664103990, true, new a(qVar2)), o4, (i7 & 14) | 12582912 | (i7 & 112) | (3670016 & (i7 << 6)), 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            k2Var2 = k2Var3;
            m2Var5 = m2Var7;
            c0Var4 = c0Var3;
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(qVar4, e6Var3, k2Var2, m2Var5, c0Var4, qVar2, i4, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l ld.a<kotlin.k2> r30, @fg.m androidx.compose.ui.q r31, boolean r32, @fg.m androidx.compose.ui.graphics.e6 r33, @fg.m androidx.compose.material3.k2 r34, @fg.m androidx.compose.material3.m2 r35, @fg.m androidx.compose.foundation.c0 r36, @fg.m androidx.compose.foundation.interaction.k r37, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.runtime.t r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.n2.b(ld.a, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, androidx.compose.material3.k2, androidx.compose.material3.m2, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.m androidx.compose.ui.q r19, @fg.m androidx.compose.ui.graphics.e6 r20, @fg.m androidx.compose.material3.k2 r21, @fg.m androidx.compose.material3.m2 r22, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r23, @fg.m androidx.compose.runtime.t r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.n2.c(androidx.compose.ui.q, androidx.compose.ui.graphics.e6, androidx.compose.material3.k2, androidx.compose.material3.m2, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00da  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.l ld.a<kotlin.k2> r24, @fg.m androidx.compose.ui.q r25, boolean r26, @fg.m androidx.compose.ui.graphics.e6 r27, @fg.m androidx.compose.material3.k2 r28, @fg.m androidx.compose.material3.m2 r29, @fg.m androidx.compose.foundation.interaction.k r30, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r31, @fg.m androidx.compose.runtime.t r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.n2.d(ld.a, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, androidx.compose.material3.k2, androidx.compose.material3.m2, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void e(@fg.m androidx.compose.ui.q qVar, @fg.m androidx.compose.ui.graphics.e6 e6Var, @fg.m k2 k2Var, @fg.m m2 m2Var, @fg.m androidx.compose.foundation.c0 c0Var, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        androidx.compose.ui.q qVar3;
        int i6;
        androidx.compose.ui.graphics.e6 e6Var2;
        k2 k2Var2;
        m2 m2Var2;
        androidx.compose.foundation.c0 c0Var2;
        androidx.compose.ui.q qVar4;
        androidx.compose.ui.graphics.e6 e6Var3;
        k2 k2Var3;
        androidx.compose.foundation.c0 c0Var3;
        m2 m2Var3;
        int i7;
        int i10;
        int i11;
        androidx.compose.runtime.t o4 = tVar.o(740336179);
        int i12 = i5 & 1;
        if (i12 != 0) {
            i6 = i4 | 6;
            qVar3 = qVar;
        } else if ((i4 & 6) == 0) {
            qVar3 = qVar;
            i6 = (o4.q0(qVar3) ? 4 : 2) | i4;
        } else {
            qVar3 = qVar;
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i5 & 2) == 0) {
                e6Var2 = e6Var;
                if (o4.q0(e6Var2)) {
                    i11 = 32;
                    i6 |= i11;
                }
            } else {
                e6Var2 = e6Var;
            }
            i11 = 16;
            i6 |= i11;
        } else {
            e6Var2 = e6Var;
        }
        if ((i4 & 384) == 0) {
            if ((i5 & 4) == 0) {
                k2Var2 = k2Var;
                if (o4.q0(k2Var2)) {
                    i10 = 256;
                    i6 |= i10;
                }
            } else {
                k2Var2 = k2Var;
            }
            i10 = 128;
            i6 |= i10;
        } else {
            k2Var2 = k2Var;
        }
        if ((i4 & 3072) == 0) {
            if ((i5 & 8) == 0) {
                m2Var2 = m2Var;
                if (o4.q0(m2Var2)) {
                    i7 = 2048;
                    i6 |= i7;
                }
            } else {
                m2Var2 = m2Var;
            }
            i7 = 1024;
            i6 |= i7;
        } else {
            m2Var2 = m2Var;
        }
        if ((i4 & 24576) == 0) {
            c0Var2 = c0Var;
            i6 |= ((i5 & 16) == 0 && o4.q0(c0Var2)) ? 16384 : 8192;
        } else {
            c0Var2 = c0Var;
        }
        if ((i5 & 32) != 0) {
            i6 |= o.c.f32821k;
        } else if ((i4 & o.c.f32821k) == 0) {
            i6 |= o4.S(qVar2) ? 131072 : 65536;
        }
        if ((74899 & i6) == 74898 && o4.p()) {
            o4.d0();
            qVar4 = qVar3;
            e6Var3 = e6Var2;
            k2Var3 = k2Var2;
            m2Var3 = m2Var2;
        } else {
            o4.T();
            if ((i4 & 1) == 0 || o4.i0()) {
                qVar4 = i12 != 0 ? androidx.compose.ui.q.INSTANCE : qVar3;
                if ((i5 & 2) != 0) {
                    e6Var3 = l2.f12174a.k(o4, 6);
                    i6 &= -113;
                } else {
                    e6Var3 = e6Var2;
                }
                if ((i5 & 4) != 0) {
                    k2Var3 = l2.f12174a.n(o4, 6);
                    i6 &= -897;
                } else {
                    k2Var3 = k2Var2;
                }
                if ((i5 & 8) != 0) {
                    i6 &= -7169;
                    m2Var2 = l2.f12174a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, o4, 1572864, 63);
                }
                if ((i5 & 16) != 0) {
                    c0Var3 = l2.f12174a.m(false, o4, 48, 1);
                    i6 &= -57345;
                } else {
                    c0Var3 = c0Var;
                }
            } else {
                o4.d0();
                if ((i5 & 2) != 0) {
                    i6 &= -113;
                }
                if ((i5 & 4) != 0) {
                    i6 &= -897;
                }
                if ((i5 & 8) != 0) {
                    i6 &= -7169;
                }
                if ((i5 & 16) != 0) {
                    i6 &= -57345;
                }
                qVar4 = qVar3;
                e6Var3 = e6Var2;
                k2Var3 = k2Var2;
                c0Var3 = c0Var2;
            }
            m2 m2Var4 = m2Var2;
            int i13 = i6;
            m2Var3 = m2Var4;
            o4.I();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(740336179, i13, -1, "androidx.compose.material3.OutlinedCard (Card.kt:283)");
            }
            a(qVar4, e6Var3, k2Var3, m2Var3, c0Var3, qVar2, o4, i13 & 524286, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            c0Var2 = c0Var3;
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new g(qVar4, e6Var3, k2Var3, m2Var3, c0Var2, qVar2, i4, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0182  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@fg.l ld.a<kotlin.k2> r24, @fg.m androidx.compose.ui.q r25, boolean r26, @fg.m androidx.compose.ui.graphics.e6 r27, @fg.m androidx.compose.material3.k2 r28, @fg.m androidx.compose.material3.m2 r29, @fg.m androidx.compose.foundation.c0 r30, @fg.m androidx.compose.foundation.interaction.k r31, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r32, @fg.m androidx.compose.runtime.t r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.n2.f(ld.a, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, androidx.compose.material3.k2, androidx.compose.material3.m2, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }
}
