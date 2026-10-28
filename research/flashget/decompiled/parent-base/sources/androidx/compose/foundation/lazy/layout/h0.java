package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: LazyLayoutSemantics.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/s;", "itemProviderLambda", "Landroidx/compose/foundation/lazy/layout/g0;", "state", "Landroidx/compose/foundation/gestures/j0;", "orientation", "", "userScrollEnabled", "reverseScrolling", "a", "(Landroidx/compose/ui/q;Lld/a;Landroidx/compose/foundation/lazy/layout/g0;Landroidx/compose/foundation/gestures/j0;ZZLandroidx/compose/runtime/t;I)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,170:1\n487#2,4:171\n491#2,2:179\n495#2:185\n25#3:175\n83#3,3:186\n1116#4,3:176\n1119#4,3:182\n1116#4,6:189\n487#5:181\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n*L\n48#1:171,4\n48#1:179,2\n48#1:185\n48#1:175\n50#1:186,3\n48#1:176,3\n48#1:182,3\n50#1:189,6\n48#1:181\n*E\n"})
/* loaded from: classes.dex */
public final class h0 {

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, Integer> f6032b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6033c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.j f6034d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<Float, Float, Boolean> f6035e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Boolean> f6036f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.b f6037g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<Object, Integer> lVar, boolean z4, androidx.compose.ui.semantics.j jVar, ld.p<? super Float, ? super Float, Boolean> pVar, ld.l<? super Integer, Boolean> lVar2, androidx.compose.ui.semantics.b bVar) {
            super(1);
            this.f6032b = lVar;
            this.f6033c = z4;
            this.f6034d = jVar;
            this.f6035e = pVar;
            this.f6036f = lVar2;
            this.f6037g = bVar;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.A1(zVar, true);
            androidx.compose.ui.semantics.w.l0(zVar, this.f6032b);
            if (this.f6033c) {
                androidx.compose.ui.semantics.w.C1(zVar, this.f6034d);
            } else {
                androidx.compose.ui.semantics.w.e1(zVar, this.f6034d);
            }
            ld.p<Float, Float, Boolean> pVar = this.f6035e;
            if (pVar != null) {
                androidx.compose.ui.semantics.w.T0(zVar, null, pVar, 1, null);
            }
            ld.l<Integer, Boolean> lVar = this.f6036f;
            if (lVar != null) {
                androidx.compose.ui.semantics.w.V0(zVar, null, lVar, 1, null);
            }
            androidx.compose.ui.semantics.w.X0(zVar, this.f6037g);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f6038b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g0 g0Var) {
            super(0);
            this.f6038b = g0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f6038b.b());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f6039b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g0 g0Var) {
            super(0);
            this.f6039b = g0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f6039b.h());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "needle", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Object, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<s> f6040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.a<? extends s> aVar) {
            super(1);
            this.f6040b = aVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l Object obj) {
            s invoke = this.f6040b.invoke();
            int b5 = invoke.b();
            int i4 = 0;
            while (true) {
                if (i4 >= b5) {
                    i4 = -1;
                    break;
                }
                if (kotlin.jvm.internal.l0.g(invoke.d(i4), obj)) {
                    break;
                }
                i4++;
            }
            return Integer.valueOf(i4);
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "x", "y", "", "a", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<Float, Float, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6041b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r0 f6042c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f6043d;

        /* compiled from: LazyLayoutSemantics.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f6044b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ g0 f6045c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f6046d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, float f4, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f6045c = g0Var;
                this.f6046d = f4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f6045c, this.f6046d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f6044b;
                if (i4 == 0) {
                    a1.n(obj);
                    g0 g0Var = this.f6045c;
                    float f4 = this.f6046d;
                    this.f6044b = 1;
                    if (g0Var.f(f4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z4, r0 r0Var, g0 g0Var) {
            super(2);
            this.f6041b = z4;
            this.f6042c = r0Var;
            this.f6043d = g0Var;
        }

        @fg.l
        public final Boolean a(float f4, float f5) {
            if (this.f6041b) {
                f4 = f5;
            }
            kotlinx.coroutines.k.f(this.f6042c, null, null, new a(this.f6043d, f4, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Boolean invoke(Float f4, Float f5) {
            return a(f4.floatValue(), f5.floatValue());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Integer, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<s> f6047b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r0 f6048c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f6049d;

        /* compiled from: LazyLayoutSemantics.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f6050b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ g0 f6051c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f6052d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, int i4, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f6051c = g0Var;
                this.f6052d = i4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f6051c, this.f6052d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f6050b;
                if (i4 == 0) {
                    a1.n(obj);
                    g0 g0Var = this.f6051c;
                    int i5 = this.f6052d;
                    this.f6050b = 1;
                    if (g0Var.e(i5, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ld.a<? extends s> aVar, r0 r0Var, g0 g0Var) {
            super(1);
            this.f6047b = aVar;
            this.f6048c = r0Var;
            this.f6049d = g0Var;
        }

        @fg.l
        public final Boolean a(int i4) {
            s invoke = this.f6047b.invoke();
            if (i4 >= 0 && i4 < invoke.b()) {
                kotlinx.coroutines.k.f(this.f6048c, null, null, new a(this.f6049d, i4, null), 3, null);
                return Boolean.TRUE;
            }
            StringBuilder a5 = androidx.collection.s.a("Can't scroll to index ", i4, ", it is out of bounds [0, ");
            a5.append(invoke.b());
            a5.append(')');
            throw new IllegalArgumentException(a5.toString().toString());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l ld.a<? extends s> aVar, @fg.l g0 g0Var, @fg.l androidx.compose.foundation.gestures.j0 j0Var, boolean z4, boolean z5, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1070136913);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1070136913, i4, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        Object a5 = androidx.compose.foundation.j.a(tVar, 773894976, -492369756);
        if (a5 == androidx.compose.runtime.t.INSTANCE.a()) {
            a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
        }
        tVar.p0();
        r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
        tVar.p0();
        Object[] objArr = {aVar, g0Var, j0Var, Boolean.valueOf(z4)};
        tVar.P(-568225417);
        boolean z6 = false;
        for (int i5 = 0; i5 < 4; i5++) {
            z6 |= tVar.q0(objArr[i5]);
        }
        Object Q = tVar.Q();
        if (z6 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            boolean z7 = j0Var == androidx.compose.foundation.gestures.j0.Vertical;
            Q = androidx.compose.ui.semantics.o.f(androidx.compose.ui.q.INSTANCE, false, new a(new d(aVar), z7, new androidx.compose.ui.semantics.j(new b(g0Var), new c(g0Var), z5), z4 ? new e(z7, coroutineScope, g0Var) : null, z4 ? new f(aVar, coroutineScope, g0Var) : null, g0Var.g()), 1, null);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.ui.q w32 = qVar.w3((androidx.compose.ui.q) Q);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w32;
    }
}
