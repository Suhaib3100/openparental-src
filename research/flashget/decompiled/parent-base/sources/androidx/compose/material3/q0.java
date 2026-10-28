package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008f\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u008f\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u008f\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u008f\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "Landroidx/compose/ui/q;", "modifier", "", "enabled", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/material3/n0;", "colors", "Landroidx/compose/material3/p0;", "elevation", "Landroidx/compose/foundation/c0;", "border", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/x1;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "a", "(Lld/a;Landroidx/compose/ui/q;ZLandroidx/compose/ui/graphics/e6;Landroidx/compose/material3/n0;Landroidx/compose/material3/p0;Landroidx/compose/foundation/c0;Landroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/interaction/k;Lld/q;Landroidx/compose/runtime/t;II)V", "b", "c", "d", "e", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1068:1\n1116#2,6:1069\n1116#2,6:1077\n1116#2,6:1083\n1116#2,6:1089\n1116#2,6:1095\n154#3:1075\n154#3:1076\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt\n*L\n113#1:1069,6\n204#1:1077,6\n274#1:1083,6\n343#1:1089,6\n414#1:1095,6\n118#1:1075\n119#1:1076\n*E\n"})
/* loaded from: classes.dex */
public final class q0 {

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13576b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20309c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f13577b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13578c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13579d;

        /* compiled from: Button.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt$Button$3$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1068:1\n91#2,2:1069\n93#2:1099\n97#2:1104\n78#3,11:1071\n91#3:1103\n456#4,8:1082\n464#4,3:1096\n467#4,3:1100\n3737#5,6:1090\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt$Button$3$1\n*L\n135#1:1069,2\n135#1:1099\n135#1:1104\n135#1:1071,11\n135#1:1103\n135#1:1082,8\n135#1:1096,3\n135#1:1100,3\n135#1:1090,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.l1 f13580b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13581c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.foundation.layout.l1 l1Var, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
                super(2);
                this.f13580b = l1Var;
                this.f13581c = qVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1327513942, i4, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:134)");
                }
                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                o0 o0Var = o0.f12901a;
                androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.foundation.layout.c2.a(companion, o0Var.v(), o0Var.u()), this.f13580b);
                i.f f4 = androidx.compose.foundation.layout.i.f5073a.f();
                c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
                ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f13581c;
                tVar.P(693286680);
                androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(f4, q4, tVar, 54);
                tVar.P(-1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(j4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a5);
                } else {
                    tVar.C();
                }
                ld.p a6 = androidx.compose.animation.p.a(companion2, tVar, d5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a6);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                qVar.R(androidx.compose.foundation.layout.y1.f5410a, tVar, 6);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j4, androidx.compose.foundation.layout.l1 l1Var, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f13577b = j4;
            this.f13578c = l1Var;
            this.f13579d = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(956488494, i4, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:131)");
            }
            w7.a(this.f13577b, p6.f13227a.c(tVar, 6).getLabelLarge(), androidx.compose.runtime.internal.c.b(tVar, 1327513942, true, new a(this.f13578c, this.f13579d)), tVar, 384);
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

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f13582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13583c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13584d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13585e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0 f13586f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p0 f13587g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f13588h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13589i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f13590j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13591k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13592l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13593m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, n0 n0Var, p0 p0Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f13582b = aVar;
            this.f13583c = qVar;
            this.f13584d = z4;
            this.f13585e = e6Var;
            this.f13586f = n0Var;
            this.f13587g = p0Var;
            this.f13588h = c0Var;
            this.f13589i = l1Var;
            this.f13590j = kVar;
            this.f13591k = qVar2;
            this.f13592l = i4;
            this.f13593m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q0.a(this.f13582b, this.f13583c, this.f13584d, this.f13585e, this.f13586f, this.f13587g, this.f13588h, this.f13589i, this.f13590j, this.f13591k, tVar, androidx.compose.runtime.g3.b(this.f13592l | 1), this.f13593m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f13594b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13595c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13596d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13597e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0 f13598f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p0 f13599g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f13600h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13601i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f13602j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13603k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13604l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13605m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, n0 n0Var, p0 p0Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f13594b = aVar;
            this.f13595c = qVar;
            this.f13596d = z4;
            this.f13597e = e6Var;
            this.f13598f = n0Var;
            this.f13599g = p0Var;
            this.f13600h = c0Var;
            this.f13601i = l1Var;
            this.f13602j = kVar;
            this.f13603k = qVar2;
            this.f13604l = i4;
            this.f13605m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q0.b(this.f13594b, this.f13595c, this.f13596d, this.f13597e, this.f13598f, this.f13599g, this.f13600h, this.f13601i, this.f13602j, this.f13603k, tVar, androidx.compose.runtime.g3.b(this.f13604l | 1), this.f13605m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f13606b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13607c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13608d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13609e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0 f13610f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p0 f13611g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f13612h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13613i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f13614j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13615k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13616l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13617m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, n0 n0Var, p0 p0Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f13606b = aVar;
            this.f13607c = qVar;
            this.f13608d = z4;
            this.f13609e = e6Var;
            this.f13610f = n0Var;
            this.f13611g = p0Var;
            this.f13612h = c0Var;
            this.f13613i = l1Var;
            this.f13614j = kVar;
            this.f13615k = qVar2;
            this.f13616l = i4;
            this.f13617m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q0.c(this.f13606b, this.f13607c, this.f13608d, this.f13609e, this.f13610f, this.f13611g, this.f13612h, this.f13613i, this.f13614j, this.f13615k, tVar, androidx.compose.runtime.g3.b(this.f13616l | 1), this.f13617m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f13618b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13619c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13620d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13621e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0 f13622f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p0 f13623g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f13624h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13625i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f13626j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13627k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13628l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13629m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, n0 n0Var, p0 p0Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f13618b = aVar;
            this.f13619c = qVar;
            this.f13620d = z4;
            this.f13621e = e6Var;
            this.f13622f = n0Var;
            this.f13623g = p0Var;
            this.f13624h = c0Var;
            this.f13625i = l1Var;
            this.f13626j = kVar;
            this.f13627k = qVar2;
            this.f13628l = i4;
            this.f13629m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q0.d(this.f13618b, this.f13619c, this.f13620d, this.f13621e, this.f13622f, this.f13623g, this.f13624h, this.f13625i, this.f13626j, this.f13627k, tVar, androidx.compose.runtime.g3.b(this.f13628l | 1), this.f13629m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f13630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13631c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13632d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13633e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0 f13634f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p0 f13635g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f13636h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13637i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f13638j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f13639k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13640l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13641m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, n0 n0Var, p0 p0Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f13630b = aVar;
            this.f13631c = qVar;
            this.f13632d = z4;
            this.f13633e = e6Var;
            this.f13634f = n0Var;
            this.f13635g = p0Var;
            this.f13636h = c0Var;
            this.f13637i = l1Var;
            this.f13638j = kVar;
            this.f13639k = qVar2;
            this.f13640l = i4;
            this.f13641m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q0.e(this.f13630b, this.f13631c, this.f13632d, this.f13633e, this.f13634f, this.f13635g, this.f13636h, this.f13637i, this.f13638j, this.f13639k, tVar, androidx.compose.runtime.g3.b(this.f13640l | 1), this.f13641m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018b  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l ld.a<kotlin.k2> r30, @fg.m androidx.compose.ui.q r31, boolean r32, @fg.m androidx.compose.ui.graphics.e6 r33, @fg.m androidx.compose.material3.n0 r34, @fg.m androidx.compose.material3.p0 r35, @fg.m androidx.compose.foundation.c0 r36, @fg.m androidx.compose.foundation.layout.l1 r37, @fg.m androidx.compose.foundation.interaction.k r38, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r39, @fg.m androidx.compose.runtime.t r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q0.a(ld.a, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, androidx.compose.material3.n0, androidx.compose.material3.p0, androidx.compose.foundation.c0, androidx.compose.foundation.layout.l1, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d2  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l ld.a<kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, boolean r28, @fg.m androidx.compose.ui.graphics.e6 r29, @fg.m androidx.compose.material3.n0 r30, @fg.m androidx.compose.material3.p0 r31, @fg.m androidx.compose.foundation.c0 r32, @fg.m androidx.compose.foundation.layout.l1 r33, @fg.m androidx.compose.foundation.interaction.k r34, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, @fg.m androidx.compose.runtime.t r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q0.b(ld.a, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, androidx.compose.material3.n0, androidx.compose.material3.p0, androidx.compose.foundation.c0, androidx.compose.foundation.layout.l1, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d2  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.l ld.a<kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, boolean r28, @fg.m androidx.compose.ui.graphics.e6 r29, @fg.m androidx.compose.material3.n0 r30, @fg.m androidx.compose.material3.p0 r31, @fg.m androidx.compose.foundation.c0 r32, @fg.m androidx.compose.foundation.layout.l1 r33, @fg.m androidx.compose.foundation.interaction.k r34, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, @fg.m androidx.compose.runtime.t r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q0.c(ld.a, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, androidx.compose.material3.n0, androidx.compose.material3.p0, androidx.compose.foundation.c0, androidx.compose.foundation.layout.l1, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bb  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.l ld.a<kotlin.k2> r27, @fg.m androidx.compose.ui.q r28, boolean r29, @fg.m androidx.compose.ui.graphics.e6 r30, @fg.m androidx.compose.material3.n0 r31, @fg.m androidx.compose.material3.p0 r32, @fg.m androidx.compose.foundation.c0 r33, @fg.m androidx.compose.foundation.layout.l1 r34, @fg.m androidx.compose.foundation.interaction.k r35, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r36, @fg.m androidx.compose.runtime.t r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q0.d(ld.a, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, androidx.compose.material3.n0, androidx.compose.material3.p0, androidx.compose.foundation.c0, androidx.compose.foundation.layout.l1, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b5  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@fg.l ld.a<kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, boolean r28, @fg.m androidx.compose.ui.graphics.e6 r29, @fg.m androidx.compose.material3.n0 r30, @fg.m androidx.compose.material3.p0 r31, @fg.m androidx.compose.foundation.c0 r32, @fg.m androidx.compose.foundation.layout.l1 r33, @fg.m androidx.compose.foundation.interaction.k r34, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, @fg.m androidx.compose.runtime.t r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q0.e(ld.a, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, androidx.compose.material3.n0, androidx.compose.material3.p0, androidx.compose.foundation.c0, androidx.compose.foundation.layout.l1, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }
}
