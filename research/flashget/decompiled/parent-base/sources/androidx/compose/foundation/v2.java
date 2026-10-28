package androidx.compose.foundation;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\r\u001a=\u0010\u0011\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "initial", "Landroidx/compose/foundation/w2;", "c", "(ILandroidx/compose/runtime/t;II)Landroidx/compose/foundation/w2;", "Landroidx/compose/ui/q;", "state", "", "enabled", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "reverseScrolling", "e", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/w2;ZLandroidx/compose/foundation/gestures/e0;Z)Landroidx/compose/ui/q;", "a", "isScrollable", "isVertical", "d", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/w2;ZLandroidx/compose/foundation/gestures/e0;ZZ)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,459:1\n1116#2,6:460\n135#3:466\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n75#1:460,6\n325#1:466\n*E\n"})
/* loaded from: classes.dex */
public final class v2 {

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/w2;", "a", "()Landroidx/compose/foundation/w2;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<w2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9122b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(0);
            this.f9122b = i4;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w2 invoke() {
            return new w2(this.f9122b);
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n1#1,170:1\n326#2,7:171\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w2 f9123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f9125d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9126e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9127f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w2 w2Var, boolean z4, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, boolean z6) {
            super(1);
            this.f9123b = w2Var;
            this.f9124c = z4;
            this.f9125d = e0Var;
            this.f9126e = z5;
            this.f9127f = z6;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("scroll");
            a2Var.getProperties().c("state", this.f9123b);
            h0.a(this.f9124c, a2Var.getProperties(), "reverseScrolling", a2Var).c("flingBehavior", this.f9125d);
            h0.a(this.f9126e, a2Var.getProperties(), "isScrollable", a2Var).c("isVertical", Boolean.valueOf(this.f9127f));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,459:1\n487#2,4:460\n491#2,2:468\n495#2:474\n25#3:464\n1116#4,3:465\n1119#4,3:471\n487#5:470\n74#6:475\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n*L\n274#1:460,4\n274#1:468,2\n274#1:474\n274#1:464\n274#1:465,3\n274#1:471,3\n274#1:470\n307#1:475\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9128b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9129c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w2 f9130d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9131e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f9132f;

        /* compiled from: Scroll.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f9133b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f9134c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f9135d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ w2 f9136e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f9137f;

            /* compiled from: Scroll.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "x", "y", "", "a", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.v2$c$a$a, reason: collision with other inner class name */
            static final class C0193a extends kotlin.jvm.internal.n0 implements ld.p<Float, Float, Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f9138b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f9139c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ w2 f9140d;

                /* compiled from: Scroll.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", i = {}, l = {293, 295}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.v2$c$a$a$a, reason: collision with other inner class name */
                static final class C0194a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f9141b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f9142c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ w2 f9143d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ float f9144e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ float f9145f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0194a(boolean z4, w2 w2Var, float f4, float f5, kotlin.coroutines.d<? super C0194a> dVar) {
                        super(2, dVar);
                        this.f9142c = z4;
                        this.f9143d = w2Var;
                        this.f9144e = f4;
                        this.f9145f = f5;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0194a(this.f9142c, this.f9143d, this.f9144e, this.f9145f, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f9141b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            if (this.f9142c) {
                                w2 w2Var = this.f9143d;
                                kotlin.jvm.internal.l0.n(w2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f4 = this.f9144e;
                                this.f9141b = 1;
                                if (androidx.compose.foundation.gestures.p0.b(w2Var, f4, null, this, 2, null) == aVar) {
                                    return aVar;
                                }
                            } else {
                                w2 w2Var2 = this.f9143d;
                                kotlin.jvm.internal.l0.n(w2Var2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f5 = this.f9145f;
                                this.f9141b = 2;
                                if (androidx.compose.foundation.gestures.p0.b(w2Var2, f5, null, this, 2, null) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i4 != 1 && i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a1.n(obj);
                        }
                        return kotlin.k2.f75408a;
                    }

                    @Override // ld.p
                    @fg.m
                    public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                        return ((C0194a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0193a(kotlinx.coroutines.r0 r0Var, boolean z4, w2 w2Var) {
                    super(2);
                    this.f9138b = r0Var;
                    this.f9139c = z4;
                    this.f9140d = w2Var;
                }

                @fg.l
                public final Boolean a(float f4, float f5) {
                    kotlinx.coroutines.k.f(this.f9138b, null, null, new C0194a(this.f9139c, this.f9140d, f5, f4, null), 3, null);
                    return Boolean.TRUE;
                }

                @Override // ld.p
                public /* bridge */ /* synthetic */ Boolean invoke(Float f4, Float f5) {
                    return a(f4.floatValue(), f5.floatValue());
                }
            }

            /* compiled from: Scroll.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.jvm.internal.n0 implements ld.a<Float> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ w2 f9146b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(w2 w2Var) {
                    super(0);
                    this.f9146b = w2Var;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    return Float.valueOf(this.f9146b.r());
                }
            }

            /* compiled from: Scroll.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.v2$c$a$c, reason: collision with other inner class name */
            static final class C0195c extends kotlin.jvm.internal.n0 implements ld.a<Float> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ w2 f9147b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0195c(w2 w2Var) {
                    super(0);
                    this.f9147b = w2Var;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    return Float.valueOf(this.f9147b.q());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z4, boolean z5, boolean z6, w2 w2Var, kotlinx.coroutines.r0 r0Var) {
                super(1);
                this.f9133b = z4;
                this.f9134c = z5;
                this.f9135d = z6;
                this.f9136e = w2Var;
                this.f9137f = r0Var;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.A1(zVar, true);
                androidx.compose.ui.semantics.j jVar = new androidx.compose.ui.semantics.j(new b(this.f9136e), new C0195c(this.f9136e), this.f9133b);
                if (this.f9134c) {
                    androidx.compose.ui.semantics.w.C1(zVar, jVar);
                } else {
                    androidx.compose.ui.semantics.w.e1(zVar, jVar);
                }
                if (this.f9135d) {
                    androidx.compose.ui.semantics.w.T0(zVar, null, new C0193a(this.f9137f, this.f9134c, this.f9136e), 1, null);
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z4, boolean z5, w2 w2Var, boolean z6, androidx.compose.foundation.gestures.e0 e0Var) {
            super(3);
            this.f9128b = z4;
            this.f9129c = z5;
            this.f9130d = w2Var;
            this.f9131e = z6;
            this.f9132f = e0Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(1478351300);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1478351300, i4, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:272)");
            }
            androidx.compose.foundation.gestures.r0 r0Var = androidx.compose.foundation.gestures.r0.f4232a;
            i2 c5 = r0Var.c(tVar, 6);
            tVar.P(773894976);
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
            }
            tVar.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) Q).getCoroutineScope();
            tVar.p0();
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(companion, false, new a(this.f9129c, this.f9128b, this.f9131e, this.f9130d, coroutineScope), 1, null);
            androidx.compose.foundation.gestures.j0 j0Var = this.f9128b ? androidx.compose.foundation.gestures.j0.Vertical : androidx.compose.foundation.gestures.j0.Horizontal;
            androidx.compose.ui.q w32 = j2.a(m0.a(f4, j0Var), c5).w3(androidx.compose.foundation.gestures.t0.l(companion, this.f9130d, j0Var, c5, this.f9131e, r0Var.d((androidx.compose.ui.unit.w) tVar.x(androidx.compose.ui.platform.h1.p()), j0Var, this.f9129c), this.f9132f, this.f9130d.getInternalInteractionSource(), null, 128, null)).w3(new ScrollingLayoutElement(this.f9130d, this.f9129c, this.f9128b));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return w32;
        }
    }

    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l w2 w2Var, boolean z4, @fg.m androidx.compose.foundation.gestures.e0 e0Var, boolean z5) {
        return d(qVar, w2Var, z5, e0Var, z4, false);
    }

    public static androidx.compose.ui.q b(androidx.compose.ui.q qVar, w2 w2Var, boolean z4, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        boolean z6 = z4;
        if ((i4 & 4) != 0) {
            e0Var = null;
        }
        androidx.compose.foundation.gestures.e0 e0Var2 = e0Var;
        if ((i4 & 8) != 0) {
            z5 = false;
        }
        return d(qVar, w2Var, z5, e0Var2, z6, false);
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final w2 c(int i4, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(-1464256199);
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1464256199, i5, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:73)");
        }
        Object[] objArr = new Object[0];
        w2.INSTANCE.getClass();
        androidx.compose.runtime.saveable.l lVar = w2.f9219k;
        tVar.P(546516376);
        boolean f4 = tVar.f(i4);
        Object Q = tVar.Q();
        if (f4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a(i4);
            tVar.E(Q);
        }
        tVar.p0();
        w2 w2Var = (w2) androidx.compose.runtime.saveable.d.d(objArr, lVar, null, (ld.a) Q, tVar, 72, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w2Var;
    }

    private static final androidx.compose.ui.q d(androidx.compose.ui.q qVar, w2 w2Var, boolean z4, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, boolean z6) {
        return androidx.compose.ui.i.e(qVar, androidx.compose.ui.platform.y1.e() ? new b(w2Var, z4, e0Var, z5, z6) : androidx.compose.ui.platform.y1.b(), new c(z6, z4, w2Var, z5, e0Var));
    }

    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, @fg.l w2 w2Var, boolean z4, @fg.m androidx.compose.foundation.gestures.e0 e0Var, boolean z5) {
        return d(qVar, w2Var, z5, e0Var, z4, true);
    }

    public static androidx.compose.ui.q f(androidx.compose.ui.q qVar, w2 w2Var, boolean z4, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        boolean z6 = z4;
        if ((i4 & 4) != 0) {
            e0Var = null;
        }
        androidx.compose.foundation.gestures.e0 e0Var2 = e0Var;
        if ((i4 & 8) != 0) {
            z5 = false;
        }
        return d(qVar, w2Var, z5, e0Var2, z6, true);
    }
}
