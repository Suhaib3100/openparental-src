package androidx.compose.material3;

import androidx.compose.ui.node.g;
import kotlin.Metadata;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001am\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u008f\u0001\u0010\u0017\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0097\u0001\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009d\u0001\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00132\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u001d2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a8\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010&\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070(8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "color", "contentColor", "Landroidx/compose/ui/unit/h;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/c0;", "border", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/e6;JJFFLandroidx/compose/foundation/c0;Lld/p;Landroidx/compose/runtime/t;II)V", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "d", "(Lld/a;Landroidx/compose/ui/q;ZLandroidx/compose/ui/graphics/e6;JJFFLandroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Lld/p;Landroidx/compose/runtime/t;III)V", "selected", "b", "(ZLld/a;Landroidx/compose/ui/q;ZLandroidx/compose/ui/graphics/e6;JJFFLandroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Lld/p;Landroidx/compose/runtime/t;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "c", "(ZLld/l;Landroidx/compose/ui/q;ZLandroidx/compose/ui/graphics/e6;JJFFLandroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Lld/p;Landroidx/compose/runtime/t;III)V", "backgroundColor", "", "h", "(Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/e6;JLandroidx/compose/foundation/c0;F)Landroidx/compose/ui/q;", "elevation", "i", "(JFLandroidx/compose/runtime/t;I)J", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "g", "()Landroidx/compose/runtime/a3;", "LocalAbsoluteTonalElevation", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,493:1\n154#2:494\n154#2:495\n154#2:498\n154#2:499\n154#2:508\n154#2:509\n154#2:518\n154#2:519\n74#3:496\n74#3:506\n74#3:516\n74#3:526\n51#4:497\n51#4:507\n51#4:517\n51#4:527\n1116#5,6:500\n1116#5,6:510\n1116#5,6:520\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n*L\n106#1:494\n107#1:495\n211#1:498\n212#1:499\n321#1:508\n322#1:509\n432#1:518\n433#1:519\n111#1:496\n217#1:506\n327#1:516\n438#1:526\n111#1:497\n217#1:507\n327#1:517\n438#1:527\n214#1:500,6\n324#1:510,6\n435#1:520,6\n*E\n"})
/* loaded from: classes.dex */
public final class x9 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<androidx.compose.ui.unit.h> f15622a = androidx.compose.runtime.f0.e(null, a.f15623b, 1, null);

    /* compiled from: Surface.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/h;", "a", "()F"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$LocalAbsoluteTonalElevation$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,493:1\n154#2:494\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$LocalAbsoluteTonalElevation$1\n*L\n492#1:494\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.unit.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15623b = new a(0);

        a() {
            super(0);
        }

        public final float a() {
            return androidx.compose.ui.unit.h.g(0);
        }

        @Override // ld.a
        public androidx.compose.ui.unit.h invoke() {
            return androidx.compose.ui.unit.h.d(androidx.compose.ui.unit.h.g(0));
        }
    }

    /* compiled from: Surface.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,493:1\n74#2:494\n1#3:495\n68#4,6:496\n74#4:530\n78#4:535\n78#5,11:502\n91#5:534\n456#6,8:513\n464#6,3:527\n467#6,3:531\n3737#7,6:521\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$1\n*L\n125#1:494\n116#1:496,6\n116#1:530\n116#1:535\n116#1:502,11\n116#1:534\n116#1:513,8\n116#1:527,3\n116#1:531,3\n116#1:521,6\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15624b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15625c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15626d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f15627e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15628f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f15629g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15630h;

        /* compiled from: Surface.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f15631b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.Z0(zVar, true);
            }

            @Override // ld.l
            public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.Z0(zVar, true);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: Surface.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.x9$b$b, reason: collision with other inner class name */
        static final class C0300b extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f15632b;

            C0300b(kotlin.coroutines.d<? super C0300b> dVar) {
                super(2, dVar);
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((C0300b) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0300b(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f15632b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, float f4, androidx.compose.foundation.c0 c0Var, float f5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f15624b = qVar;
            this.f15625c = e6Var;
            this.f15626d = j4;
            this.f15627e = f4;
            this.f15628f = c0Var;
            this.f15629g = f5;
            this.f15630h = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-70914509, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:115)");
            }
            androidx.compose.ui.q e4 = androidx.compose.ui.input.pointer.u0.e(androidx.compose.ui.semantics.o.e(x9.h(this.f15624b, this.f15625c, x9.i(this.f15626d, this.f15627e, tVar, 0), this.f15628f, ((androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i())).v5(this.f15629g)), false, a.f15631b), kotlin.k2.f75408a, new C0300b(2, null));
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f15630h;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, true, tVar, 48, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(e4);
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

    /* compiled from: Surface.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,493:1\n74#2:494\n1#3:495\n68#4,6:496\n74#4:530\n78#4:535\n78#5,11:502\n91#5:534\n456#6,8:513\n464#6,3:527\n467#6,3:531\n3737#7,6:521\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$3\n*L\n233#1:494\n223#1:496,6\n223#1:530\n223#1:535\n223#1:502,11\n223#1:534\n223#1:513,8\n223#1:527,3\n223#1:531,3\n223#1:521,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15633b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15634c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15635d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f15636e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15637f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15638g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f15639h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15640i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f15641j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15642k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, float f4, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, boolean z4, ld.a<kotlin.k2> aVar, float f5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f15633b = qVar;
            this.f15634c = e6Var;
            this.f15635d = j4;
            this.f15636e = f4;
            this.f15637f = c0Var;
            this.f15638g = kVar;
            this.f15639h = z4;
            this.f15640i = aVar;
            this.f15641j = f5;
            this.f15642k = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1279702876, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:221)");
            }
            androidx.compose.ui.q d5 = androidx.compose.foundation.g0.d(x9.h(a6.f(this.f15633b), this.f15634c, x9.i(this.f15635d, this.f15636e, tVar, 0), this.f15637f, ((androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i())).v5(this.f15641j)), this.f15638g, androidx.compose.material.ripple.p.e(false, 0.0f, 0L, tVar, 0, 7), this.f15639h, null, null, this.f15640i, 24, null);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f15642k;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, true, tVar, 48, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(d5);
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

    /* compiled from: Surface.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$5\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,493:1\n74#2:494\n1#3:495\n68#4,6:496\n74#4:530\n78#4:535\n78#5,11:502\n91#5:534\n456#6,8:513\n464#6,3:527\n467#6,3:531\n3737#7,6:521\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$5\n*L\n343#1:494\n333#1:496,6\n333#1:530\n333#1:535\n333#1:502,11\n333#1:534\n333#1:513,8\n333#1:527,3\n333#1:531,3\n333#1:521,6\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15643b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15644c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15645d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f15646e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15647f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15648g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15649h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f15650i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15651j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f15652k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15653l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, float f4, androidx.compose.foundation.c0 c0Var, boolean z4, androidx.compose.foundation.interaction.k kVar, boolean z5, ld.a<kotlin.k2> aVar, float f5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f15643b = qVar;
            this.f15644c = e6Var;
            this.f15645d = j4;
            this.f15646e = f4;
            this.f15647f = c0Var;
            this.f15648g = z4;
            this.f15649h = kVar;
            this.f15650i = z5;
            this.f15651j = aVar;
            this.f15652k = f5;
            this.f15653l = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1164547968, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:331)");
            }
            androidx.compose.ui.q b5 = androidx.compose.foundation.selection.b.b(x9.h(a6.f(this.f15643b), this.f15644c, x9.i(this.f15645d, this.f15646e, tVar, 0), this.f15647f, ((androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i())).v5(this.f15652k)), this.f15648g, this.f15649h, androidx.compose.material.ripple.p.e(false, 0.0f, 0L, tVar, 0, 7), this.f15650i, null, this.f15651j, 16, null);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f15653l;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, true, tVar, 48, -1323940314);
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

    /* compiled from: Surface.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$7\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,493:1\n74#2:494\n1#3:495\n68#4,6:496\n74#4:530\n78#4:535\n78#5,11:502\n91#5:534\n456#6,8:513\n464#6,3:527\n467#6,3:531\n3737#7,6:521\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$7\n*L\n454#1:494\n444#1:496,6\n444#1:530\n444#1:535\n444#1:502,11\n444#1:534\n444#1:513,8\n444#1:527,3\n444#1:531,3\n444#1:521,6\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15654b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15655c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15656d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f15657e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15658f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15659g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15660h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f15661i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f15662j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f15663k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15664l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, float f4, androidx.compose.foundation.c0 c0Var, boolean z4, androidx.compose.foundation.interaction.k kVar, boolean z5, ld.l<? super Boolean, kotlin.k2> lVar, float f5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f15654b = qVar;
            this.f15655c = e6Var;
            this.f15656d = j4;
            this.f15657e = f4;
            this.f15658f = c0Var;
            this.f15659g = z4;
            this.f15660h = kVar;
            this.f15661i = z5;
            this.f15662j = lVar;
            this.f15663k = f5;
            this.f15664l = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(712720927, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:442)");
            }
            androidx.compose.ui.q b5 = androidx.compose.foundation.selection.c.b(x9.h(a6.f(this.f15654b), this.f15655c, x9.i(this.f15656d, this.f15657e, tVar, 0), this.f15658f, ((androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i())).v5(this.f15663k)), this.f15659g, this.f15660h, androidx.compose.material.ripple.p.e(false, 0.0f, 0L, tVar, 0, 7), this.f15661i, null, this.f15662j, 16, null);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f15664l;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, true, tVar, 48, -1323940314);
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

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.m androidx.compose.ui.q qVar, @fg.m androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f4, float f5, @fg.m androidx.compose.foundation.c0 c0Var, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-513881741);
        androidx.compose.ui.q qVar2 = (i5 & 1) != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
        androidx.compose.ui.graphics.e6 a5 = (i5 & 2) != 0 ? androidx.compose.ui.graphics.r5.a() : e6Var;
        long surface = (i5 & 4) != 0 ? p6.f13227a.a(tVar, 6).getSurface() : j4;
        long c5 = (i5 & 8) != 0 ? b3.c(surface, tVar, (i4 >> 6) & 14) : j5;
        float g4 = (i5 & 16) != 0 ? androidx.compose.ui.unit.h.g(0) : f4;
        float g5 = (i5 & 32) != 0 ? androidx.compose.ui.unit.h.g(0) : f5;
        androidx.compose.foundation.c0 c0Var2 = (i5 & 64) != 0 ? null : c0Var;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-513881741, i4, -1, "androidx.compose.material3.Surface (Surface.kt:109)");
        }
        androidx.compose.runtime.a3<androidx.compose.ui.unit.h> a3Var = f15622a;
        float u4 = ((androidx.compose.ui.unit.h) tVar.x(a3Var)).u() + g4;
        androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(c5)), a3Var.e(androidx.compose.ui.unit.h.d(u4))}, androidx.compose.runtime.internal.c.b(tVar, -70914509, true, new b(qVar2, a5, surface, u4, c0Var2, g5, pVar)), tVar, 48);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(boolean z4, @fg.l ld.a<kotlin.k2> aVar, @fg.m androidx.compose.ui.q qVar, boolean z5, @fg.m androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f4, float f5, @fg.m androidx.compose.foundation.c0 c0Var, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        androidx.compose.foundation.interaction.k kVar2;
        tVar.P(540296512);
        androidx.compose.ui.q qVar2 = (i6 & 4) != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
        boolean z6 = (i6 & 8) != 0 ? true : z5;
        androidx.compose.ui.graphics.e6 a5 = (i6 & 16) != 0 ? androidx.compose.ui.graphics.r5.a() : e6Var;
        long surface = (i6 & 32) != 0 ? p6.f13227a.a(tVar, 6).getSurface() : j4;
        long c5 = (i6 & 64) != 0 ? b3.c(surface, tVar, (i4 >> 15) & 14) : j5;
        float g4 = (i6 & 128) != 0 ? androidx.compose.ui.unit.h.g(0) : f4;
        float g5 = (i6 & 256) != 0 ? androidx.compose.ui.unit.h.g(0) : f5;
        androidx.compose.foundation.c0 c0Var2 = (i6 & 512) != 0 ? null : c0Var;
        if ((i6 & 1024) != 0) {
            tVar.P(-746935250);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = androidx.compose.foundation.interaction.j.a();
                tVar.E(Q);
            }
            tVar.p0();
            kVar2 = (androidx.compose.foundation.interaction.k) Q;
        } else {
            kVar2 = kVar;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(540296512, i4, i5, "androidx.compose.material3.Surface (Surface.kt:325)");
        }
        androidx.compose.runtime.a3<androidx.compose.ui.unit.h> a3Var = f15622a;
        float u4 = g4 + ((androidx.compose.ui.unit.h) tVar.x(a3Var)).u();
        androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(c5)), a3Var.e(androidx.compose.ui.unit.h.d(u4))}, androidx.compose.runtime.internal.c.b(tVar, -1164547968, true, new d(qVar2, a5, surface, u4, c0Var2, z4, kVar2, z6, aVar, g5, pVar)), tVar, 48);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(boolean z4, @fg.l ld.l<? super Boolean, kotlin.k2> lVar, @fg.m androidx.compose.ui.q qVar, boolean z5, @fg.m androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f4, float f5, @fg.m androidx.compose.foundation.c0 c0Var, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        androidx.compose.foundation.interaction.k kVar2;
        tVar.P(-1877401889);
        androidx.compose.ui.q qVar2 = (i6 & 4) != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
        boolean z6 = (i6 & 8) != 0 ? true : z5;
        androidx.compose.ui.graphics.e6 a5 = (i6 & 16) != 0 ? androidx.compose.ui.graphics.r5.a() : e6Var;
        long surface = (i6 & 32) != 0 ? p6.f13227a.a(tVar, 6).getSurface() : j4;
        long c5 = (i6 & 64) != 0 ? b3.c(surface, tVar, (i4 >> 15) & 14) : j5;
        float g4 = (i6 & 128) != 0 ? androidx.compose.ui.unit.h.g(0) : f4;
        float g5 = (i6 & 256) != 0 ? androidx.compose.ui.unit.h.g(0) : f5;
        androidx.compose.foundation.c0 c0Var2 = (i6 & 512) != 0 ? null : c0Var;
        if ((i6 & 1024) != 0) {
            tVar.P(-746929488);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = androidx.compose.foundation.interaction.j.a();
                tVar.E(Q);
            }
            tVar.p0();
            kVar2 = (androidx.compose.foundation.interaction.k) Q;
        } else {
            kVar2 = kVar;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1877401889, i4, i5, "androidx.compose.material3.Surface (Surface.kt:436)");
        }
        androidx.compose.runtime.a3<androidx.compose.ui.unit.h> a3Var = f15622a;
        float u4 = g4 + ((androidx.compose.ui.unit.h) tVar.x(a3Var)).u();
        androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(c5)), a3Var.e(androidx.compose.ui.unit.h.d(u4))}, androidx.compose.runtime.internal.c.b(tVar, 712720927, true, new e(qVar2, a5, surface, u4, c0Var2, z4, kVar2, z6, lVar, g5, pVar)), tVar, 48);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void d(@fg.l ld.a<kotlin.k2> aVar, @fg.m androidx.compose.ui.q qVar, boolean z4, @fg.m androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f4, float f5, @fg.m androidx.compose.foundation.c0 c0Var, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        androidx.compose.foundation.interaction.k kVar2;
        tVar.P(-789752804);
        androidx.compose.ui.q qVar2 = (i6 & 2) != 0 ? androidx.compose.ui.q.INSTANCE : qVar;
        boolean z5 = (i6 & 4) != 0 ? true : z4;
        androidx.compose.ui.graphics.e6 a5 = (i6 & 8) != 0 ? androidx.compose.ui.graphics.r5.a() : e6Var;
        long surface = (i6 & 16) != 0 ? p6.f13227a.a(tVar, 6).getSurface() : j4;
        long c5 = (i6 & 32) != 0 ? b3.c(surface, tVar, (i4 >> 12) & 14) : j5;
        float g4 = (i6 & 64) != 0 ? androidx.compose.ui.unit.h.g(0) : f4;
        float g5 = (i6 & 128) != 0 ? androidx.compose.ui.unit.h.g(0) : f5;
        androidx.compose.foundation.c0 c0Var2 = (i6 & 256) != 0 ? null : c0Var;
        if ((i6 & 512) != 0) {
            tVar.P(-746940902);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = androidx.compose.foundation.interaction.j.a();
                tVar.E(Q);
            }
            tVar.p0();
            kVar2 = (androidx.compose.foundation.interaction.k) Q;
        } else {
            kVar2 = kVar;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-789752804, i4, i5, "androidx.compose.material3.Surface (Surface.kt:215)");
        }
        androidx.compose.runtime.a3<androidx.compose.ui.unit.h> a3Var = f15622a;
        float u4 = g4 + ((androidx.compose.ui.unit.h) tVar.x(a3Var)).u();
        androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(c5)), a3Var.e(androidx.compose.ui.unit.h.d(u4))}, androidx.compose.runtime.internal.c.b(tVar, 1279702876, true, new c(qVar2, a5, surface, u4, c0Var2, kVar2, z5, aVar, g5, pVar)), tVar, 48);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
    }

    @fg.l
    public static final androidx.compose.runtime.a3<androidx.compose.ui.unit.h> g() {
        return f15622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.x4
    public static final androidx.compose.ui.q h(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.e6 e6Var, long j4, androidx.compose.foundation.c0 c0Var, float f4) {
        androidx.compose.ui.graphics.e6 e6Var2;
        androidx.compose.ui.q qVar2;
        androidx.compose.ui.q e4 = androidx.compose.ui.graphics.p4.e(qVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f4, 0.0f, 0.0f, 0.0f, 0.0f, 0L, e6Var, false, null, 0L, 0L, 0, 124895, null);
        if (c0Var != null) {
            e6Var2 = e6Var;
            qVar2 = androidx.compose.foundation.z.e(androidx.compose.ui.q.INSTANCE, c0Var, e6Var2);
        } else {
            e6Var2 = e6Var;
            qVar2 = androidx.compose.ui.q.INSTANCE;
        }
        return androidx.compose.ui.draw.h.a(androidx.compose.foundation.n.c(e4.w3(qVar2), j4, e6Var2), e6Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final long i(long j4, float f4, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-2079918090);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2079918090, i4, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:483)");
        }
        long a5 = b3.a(p6.f13227a.a(tVar, 6), j4, f4, tVar, (i4 << 3) & 1008);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return a5;
    }
}
