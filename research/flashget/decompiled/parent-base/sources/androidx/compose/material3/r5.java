package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001ao\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001ao\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001az\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008c\u0001\u0010\u001d\u001a\u00020\u00012\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 \"\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 \"\u0014\u0010#\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 \"\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 \"\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "Landroidx/compose/material3/p5;", "elevation", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/runtime/i;", "content", "c", "(Lld/a;Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/e6;JJLandroidx/compose/material3/p5;Landroidx/compose/foundation/interaction/k;Lld/p;Landroidx/compose/runtime/t;II)V", "e", "d", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/x1;", "Lkotlin/u;", "b", "(Lld/a;Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/e6;JJLandroidx/compose/material3/p5;Landroidx/compose/foundation/interaction/k;Lld/q;Landroidx/compose/runtime/t;II)V", "text", "icon", "", "expanded", "a", "(Lld/p;Lld/p;Lld/a;Landroidx/compose/ui/q;ZLandroidx/compose/ui/graphics/e6;JJLandroidx/compose/material3/p5;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/unit/h;", "F", "ExtendedFabStartIconPadding", "ExtendedFabEndIconPadding", "ExtendedFabTextPadding", "ExtendedFabMinimumWidth", "Landroidx/compose/animation/h0;", "Landroidx/compose/animation/h0;", "ExtendedFabCollapseAnimation", "Landroidx/compose/animation/f0;", "f", "Landroidx/compose/animation/f0;", "ExtendedFabExpandAnimation", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,671:1\n1116#2,6:672\n1116#2,6:678\n1116#2,6:684\n1116#2,6:690\n1116#2,6:696\n154#3:702\n154#3:703\n154#3:704\n154#3:705\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n*L\n101#1:672,6\n164#1:678,6\n216#1:684,6\n271#1:690,6\n341#1:696,6\n637#1:702\n639#1:703\n641#1:704\n643#1:705\n*E\n"})
/* loaded from: classes.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14005a = androidx.compose.ui.unit.h.g(16);

    /* renamed from: b, reason: collision with root package name */
    private static final float f14006b = 12;

    /* renamed from: c, reason: collision with root package name */
    private static final float f14007c = 20;

    /* renamed from: d, reason: collision with root package name */
    private static final float f14008d = 80;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.h0 f14009e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.f0 f14010f;

    /* compiled from: FloatingActionButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,671:1\n91#2,2:672\n93#2:702\n97#2:707\n78#3,11:674\n91#3:706\n456#4,8:685\n464#4,3:699\n467#4,3:703\n3737#5,6:693\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$2\n*L\n283#1:672,2\n283#1:702\n283#1:707\n283#1:674,11\n283#1:706\n283#1:685,8\n283#1:699,3\n283#1:703,3\n283#1:693,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f14011b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f14011b = qVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(398457247, i4, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:282)");
            }
            androidx.compose.ui.q m4 = androidx.compose.foundation.layout.j1.m(androidx.compose.foundation.layout.c2.A(androidx.compose.ui.q.INSTANCE, r5.f14008d, 0.0f, 0.0f, 0.0f, 14, null), r5.f14007c, 0.0f, 2, null);
            i.f f4 = androidx.compose.foundation.layout.i.f5073a.f();
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f14011b;
            tVar.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(f4, q4, tVar, 54);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(m4);
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

    /* compiled from: FloatingActionButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f14012b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14013c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14014d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14015e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f14016f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p5 f14017g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14018h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> f14019i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f14020j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f14021k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, p5 p5Var, androidx.compose.foundation.interaction.k kVar, ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f14012b = aVar;
            this.f14013c = qVar;
            this.f14014d = e6Var;
            this.f14015e = j4;
            this.f14016f = j5;
            this.f14017g = p5Var;
            this.f14018h = kVar;
            this.f14019i = qVar2;
            this.f14020j = i4;
            this.f14021k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r5.b(this.f14012b, this.f14013c, this.f14014d, this.f14015e, this.f14016f, this.f14017g, this.f14018h, this.f14019i, tVar, androidx.compose.runtime.g3.b(this.f14020j | 1), this.f14021k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: FloatingActionButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,671:1\n154#2:672\n154#2:673\n91#3,2:674\n93#3:704\n97#3:709\n78#4,11:676\n91#4:708\n456#5,8:687\n464#5,3:701\n467#5,3:705\n3737#6,6:695\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n*L\n352#1:672\n353#1:673\n355#1:674,2\n355#1:704\n355#1:709\n355#1:676,11\n355#1:708\n355#1:687,8\n355#1:701,3\n355#1:705,3\n355#1:695,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14022b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14023c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14024d;

        /* compiled from: FloatingActionButton.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/s;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/s;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,671:1\n87#2,6:672\n93#2:706\n97#2:711\n78#3,11:678\n91#3:710\n456#4,8:689\n464#4,3:703\n467#4,3:707\n3737#5,6:697\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1\n*L\n371#1:672,6\n371#1:706\n371#1:711\n371#1:678,11\n371#1:710\n371#1:689,8\n371#1:703,3\n371#1:707,3\n371#1:697,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14025b;

            /* compiled from: FloatingActionButton.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.r5$c$a$a, reason: collision with other inner class name */
            static final class C0290a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0290a f14026b = new C0290a(1);

                C0290a() {
                    super(1);
                }

                public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                }

                @Override // ld.l
                public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(3);
                this.f14025b = pVar;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.animation.s sVar, androidx.compose.runtime.t tVar, Integer num) {
                a(sVar, tVar, num.intValue());
                return kotlin.k2.f75408a;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.l androidx.compose.animation.s sVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(176242764, i4, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:370)");
                }
                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                androidx.compose.ui.q c5 = androidx.compose.ui.semantics.o.c(companion, C0290a.f14026b);
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14025b;
                tVar.P(693286680);
                androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(androidx.compose.foundation.layout.i.f5073a.p(), androidx.compose.ui.c.INSTANCE.w(), tVar, 0);
                tVar.P(-1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(c5);
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
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a6);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
                androidx.compose.foundation.layout.f2.a(androidx.compose.foundation.layout.c2.B(companion, r5.f14006b), tVar, 6);
                pVar.invoke(tVar, 0);
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(2);
            this.f14022b = z4;
            this.f14023c = pVar;
            this.f14024d = pVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1172118032, i4, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:351)");
            }
            androidx.compose.ui.q o4 = androidx.compose.foundation.layout.j1.o(androidx.compose.foundation.layout.c2.A(androidx.compose.ui.q.INSTANCE, this.f14022b ? r5.f14008d : c0.s.f38085a.e(), 0.0f, 0.0f, 0.0f, 14, null), this.f14022b ? r5.f14005a : androidx.compose.ui.unit.h.g(0), 0.0f, this.f14022b ? r5.f14007c : androidx.compose.ui.unit.h.g(0), 0.0f, 10, null);
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            i.e p4 = this.f14022b ? androidx.compose.foundation.layout.i.f5073a.p() : androidx.compose.foundation.layout.i.f5073a.f();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14023c;
            boolean z4 = this.f14022b;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f14024d;
            tVar.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(p4, q4, tVar, 48);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(o4);
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
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            pVar.invoke(tVar, 0);
            androidx.compose.animation.q.i(y1Var, z4, null, r5.f14010f, r5.f14009e, null, androidx.compose.runtime.internal.c.b(tVar, 176242764, true, new a(pVar2)), tVar, 1600518, 18);
            if (t.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: FloatingActionButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14027b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14028c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f14029d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14030e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14031f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14032g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f14033h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f14034i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ p5 f14035j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14036k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f14037l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f14038m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, p5 p5Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f14027b = pVar;
            this.f14028c = pVar2;
            this.f14029d = aVar;
            this.f14030e = qVar;
            this.f14031f = z4;
            this.f14032g = e6Var;
            this.f14033h = j4;
            this.f14034i = j5;
            this.f14035j = p5Var;
            this.f14036k = kVar;
            this.f14037l = i4;
            this.f14038m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r5.a(this.f14027b, this.f14028c, this.f14029d, this.f14030e, this.f14031f, this.f14032g, this.f14033h, this.f14034i, this.f14035j, this.f14036k, tVar, androidx.compose.runtime.g3.b(this.f14037l | 1), this.f14038m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: FloatingActionButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f14039b = new e(1);

        e() {
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

    /* compiled from: FloatingActionButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f14040b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14041c;

        /* compiled from: FloatingActionButton.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$3$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,671:1\n69#2,5:672\n74#2:705\n78#2:710\n78#3,11:677\n91#3:709\n456#4,8:688\n464#4,3:702\n467#4,3:706\n3737#5,6:696\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$3$1\n*L\n118#1:672,5\n118#1:705\n118#1:710\n118#1:677,11\n118#1:709\n118#1:688,8\n118#1:702,3\n118#1:706,3\n118#1:696,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14042b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14042b = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1771489750, i4, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:117)");
                }
                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                c0.s sVar = c0.s.f38085a;
                androidx.compose.ui.q a5 = androidx.compose.foundation.layout.c2.a(companion, sVar.e(), sVar.c());
                androidx.compose.ui.c i5 = androidx.compose.ui.c.INSTANCE.i();
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14042b;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 i6 = androidx.compose.foundation.layout.m.i(i5, false, tVar, 6);
                tVar.P(-1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(a5);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, i6, tVar, B);
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
        f(long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f14040b = j4;
            this.f14041c = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1249316354, i4, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:113)");
            }
            w7.a(this.f14040b, tb.a(p6.f13227a.c(tVar, 6), c0.p.f37848a.n()), androidx.compose.runtime.internal.c.b(tVar, -1771489750, true, new a(this.f14041c)), tVar, 384);
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

    /* compiled from: FloatingActionButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f14043b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14044c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14045d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14046e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f14047f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p5 f14048g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14049h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14050i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f14051j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f14052k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, p5 p5Var, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f14043b = aVar;
            this.f14044c = qVar;
            this.f14045d = e6Var;
            this.f14046e = j4;
            this.f14047f = j5;
            this.f14048g = p5Var;
            this.f14049h = kVar;
            this.f14050i = pVar;
            this.f14051j = i4;
            this.f14052k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r5.c(this.f14043b, this.f14044c, this.f14045d, this.f14046e, this.f14047f, this.f14048g, this.f14049h, this.f14050i, tVar, androidx.compose.runtime.g3.b(this.f14051j | 1), this.f14052k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: FloatingActionButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f14053b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14054c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14055d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14056e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f14057f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p5 f14058g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14059h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14060i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f14061j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f14062k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, p5 p5Var, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f14053b = aVar;
            this.f14054c = qVar;
            this.f14055d = e6Var;
            this.f14056e = j4;
            this.f14057f = j5;
            this.f14058g = p5Var;
            this.f14059h = kVar;
            this.f14060i = pVar;
            this.f14061j = i4;
            this.f14062k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r5.d(this.f14053b, this.f14054c, this.f14055d, this.f14056e, this.f14057f, this.f14058g, this.f14059h, this.f14060i, tVar, androidx.compose.runtime.g3.b(this.f14061j | 1), this.f14062k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: FloatingActionButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f14063b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14064c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f14065d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14066e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f14067f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p5 f14068g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14069h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14070i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f14071j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f14072k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, p5 p5Var, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f14063b = aVar;
            this.f14064c = qVar;
            this.f14065d = e6Var;
            this.f14066e = j4;
            this.f14067f = j5;
            this.f14068g = p5Var;
            this.f14069h = kVar;
            this.f14070i = pVar;
            this.f14071j = i4;
            this.f14072k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r5.e(this.f14063b, this.f14064c, this.f14065d, this.f14066e, this.f14067f, this.f14068g, this.f14069h, this.f14070i, tVar, androidx.compose.runtime.g3.b(this.f14071j | 1), this.f14072k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        c0.h0 h0Var = c0.h0.f37356a;
        androidx.compose.animation.h0 s4 = androidx.compose.animation.d0.s(androidx.compose.animation.core.l.r(100, 0, h0Var.g(), 2, null), 0.0f, 2, null);
        androidx.compose.animation.core.h2 r4 = androidx.compose.animation.core.l.r(500, 0, h0Var.b(), 2, null);
        c.Companion companion = androidx.compose.ui.c.INSTANCE;
        f14009e = s4.d(androidx.compose.animation.d0.A(r4, companion.u(), false, null, 12, null));
        f14010f = androidx.compose.animation.d0.q(new androidx.compose.animation.core.h2(200, 100, h0Var.g()), 0.0f, 2, null).c(androidx.compose.animation.d0.k(androidx.compose.animation.core.l.r(500, 0, h0Var.b(), 2, null), companion.u(), false, null, 12, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0199  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r30, @fg.l ld.a<kotlin.k2> r31, @fg.m androidx.compose.ui.q r32, boolean r33, @fg.m androidx.compose.ui.graphics.e6 r34, long r35, long r37, @fg.m androidx.compose.material3.p5 r39, @fg.m androidx.compose.foundation.interaction.k r40, @fg.m androidx.compose.runtime.t r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r5.a(ld.p, ld.p, ld.a, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, long, long, androidx.compose.material3.p5, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019c  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l ld.a<kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, @fg.m androidx.compose.ui.graphics.e6 r28, long r29, long r31, @fg.m androidx.compose.material3.p5 r33, @fg.m androidx.compose.foundation.interaction.k r34, @fg.l ld.q<? super androidx.compose.foundation.layout.x1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, @fg.m androidx.compose.runtime.t r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r5.b(ld.a, androidx.compose.ui.q, androidx.compose.ui.graphics.e6, long, long, androidx.compose.material3.p5, androidx.compose.foundation.interaction.k, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019c  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.l ld.a<kotlin.k2> r30, @fg.m androidx.compose.ui.q r31, @fg.m androidx.compose.ui.graphics.e6 r32, long r33, long r35, @fg.m androidx.compose.material3.p5 r37, @fg.m androidx.compose.foundation.interaction.k r38, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r39, @fg.m androidx.compose.runtime.t r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r5.c(ld.a, androidx.compose.ui.q, androidx.compose.ui.graphics.e6, long, long, androidx.compose.material3.p5, androidx.compose.foundation.interaction.k, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019b  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.l ld.a<kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, @fg.m androidx.compose.ui.graphics.e6 r28, long r29, long r31, @fg.m androidx.compose.material3.p5 r33, @fg.m androidx.compose.foundation.interaction.k r34, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, @fg.m androidx.compose.runtime.t r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r5.d(ld.a, androidx.compose.ui.q, androidx.compose.ui.graphics.e6, long, long, androidx.compose.material3.p5, androidx.compose.foundation.interaction.k, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019b  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@fg.l ld.a<kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, @fg.m androidx.compose.ui.graphics.e6 r28, long r29, long r31, @fg.m androidx.compose.material3.p5 r33, @fg.m androidx.compose.foundation.interaction.k r34, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, @fg.m androidx.compose.runtime.t r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.r5.e(ld.a, androidx.compose.ui.q, androidx.compose.ui.graphics.e6, long, long, androidx.compose.material3.p5, androidx.compose.foundation.interaction.k, ld.p, androidx.compose.runtime.t, int, int):void");
    }
}
