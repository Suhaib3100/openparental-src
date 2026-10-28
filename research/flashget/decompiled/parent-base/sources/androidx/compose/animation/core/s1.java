package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: Transition.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0086@¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/animation/core/s1;", "S", "Landroidx/compose/animation/core/g2;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/k2;", "l", "()V", "", "fraction", "m", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/p0;", "animationSpec", "i", "(Landroidx/compose/animation/core/p0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "Landroidx/compose/animation/core/e2;", "transition", "e", "(Landroidx/compose/animation/core/e2;)V", "c", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "d", "Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/core/b;", "Landroidx/compose/animation/core/o;", "Landroidx/compose/animation/core/b;", "animatedFraction", "Landroidx/compose/runtime/snapshots/g0;", "f", "Landroidx/compose/runtime/snapshots/g0;", "observer", "a", "currentState", "k", "()F", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@o0
/* loaded from: classes.dex */
public final class s1<S> extends g2<S> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f2888h = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final S targetState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2<S> transition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<Float, o> animatedFraction;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.snapshots.g0 observer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final S currentState;

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "Landroidx/compose/animation/core/b;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.b<Float, o>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s1<S> f2894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s1<S> s1Var) {
            super(1);
            this.f2894b = s1Var;
        }

        public final void a(@fg.l androidx.compose.animation.core.b<Float, o> bVar) {
            this.f2894b.l();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.b<Float, o> bVar) {
            a(bVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "Landroidx/compose/animation/core/b;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.b<Float, o>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s1<S> f2895b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s1<S> s1Var) {
            super(1);
            this.f2895b = s1Var;
        }

        public final void a(@fg.l androidx.compose.animation.core.b<Float, o> bVar) {
            this.f2895b.l();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.b<Float, o> bVar) {
            a(bVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "Lkotlin/Function0;", "Lkotlin/k2;", "it", "a", "(Lld/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<ld.a<? extends kotlin.k2>, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f2896b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l ld.a<kotlin.k2> aVar) {
            aVar.invoke();
        }

        @Override // ld.l
        public kotlin.k2 invoke(ld.a<? extends kotlin.k2> aVar) {
            aVar.invoke();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlin/k2;", "it", "a", "(Lkotlin/k2;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<kotlin.k2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s1<S> f2897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s1<S> s1Var) {
            super(1);
            this.f2897b = s1Var;
        }

        public final void a(@fg.l kotlin.k2 k2Var) {
            this.f2897b.l();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(kotlin.k2 k2Var) {
            a(k2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.g f2898b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2<S> f2899c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k1.g gVar, e2<S> e2Var) {
            super(0);
            this.f2898b = gVar;
            this.f2899c = e2Var;
        }

        public final void a() {
            this.f2898b.f75328b = this.f2899c.p();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0}, l = {228}, m = "snapToFraction", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f2900b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2901c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s1<S> f2902d;

        /* renamed from: e, reason: collision with root package name */
        int f2903e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(s1<S> s1Var, kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
            this.f2902d = s1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f2901c = obj;
            this.f2903e |= Integer.MIN_VALUE;
            return this.f2902d.m(0.0f, this);
        }
    }

    public s1(S s4, S s5) {
        super(null);
        this.targetState = s5;
        androidx.compose.animation.core.b<Float, o> b5 = androidx.compose.animation.core.c.b(0.0f, 0.0f, 2, null);
        b5.E(Float.valueOf(0.0f), Float.valueOf(1.0f));
        this.animatedFraction = b5;
        this.observer = new androidx.compose.runtime.snapshots.g0(c.f2896b);
        this.currentState = s4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object h(s1 s1Var, p0 p0Var, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = s1Var.animatedFraction.m();
        }
        return s1Var.g(p0Var, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(s1 s1Var, p0 p0Var, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            p0Var = s1Var.animatedFraction.m();
        }
        return s1Var.i(p0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        e2<S> e2Var = this.transition;
        if (e2Var == null) {
            return;
        }
        this.observer.q(kotlin.k2.f75408a, new d(this), new e(new k1.g(), e2Var));
        e2Var.C(this.currentState, this.targetState, kotlin.math.b.N0(this.animatedFraction.v().floatValue() * r1.f75328b));
    }

    @Override // androidx.compose.animation.core.g2
    public S a() {
        return this.currentState;
    }

    @Override // androidx.compose.animation.core.g2
    public S b() {
        return this.targetState;
    }

    @Override // androidx.compose.animation.core.g2
    public void e(@fg.l e2<S> transition) {
        e2<S> e2Var = this.transition;
        if (e2Var == null || kotlin.jvm.internal.l0.g(transition, e2Var)) {
            this.transition = transition;
            l();
        } else {
            throw new IllegalStateException(("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition).toString());
        }
    }

    @fg.m
    public final Object g(@fg.l p0<Float> p0Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        if (this.transition == null || kotlin.jvm.internal.l0.g(this.currentState, this.targetState)) {
            return kotlin.k2.f75408a;
        }
        Object i4 = androidx.compose.animation.core.b.i(this.animatedFraction, new Float(0.0f), p0Var, null, new a(this), dVar, 4, null);
        return i4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? i4 : kotlin.k2.f75408a;
    }

    @fg.m
    public final Object i(@fg.l p0<Float> p0Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        if (this.transition == null || kotlin.jvm.internal.l0.g(this.currentState, this.targetState)) {
            return kotlin.k2.f75408a;
        }
        Object i4 = androidx.compose.animation.core.b.i(this.animatedFraction, new Float(1.0f), p0Var, null, new b(this), dVar, 4, null);
        return i4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? i4 : kotlin.k2.f75408a;
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public final float k() {
        return this.animatedFraction.v().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@androidx.annotation.x(from = 0.0d, to = 1.0d) float r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.animation.core.s1.f
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.animation.core.s1$f r0 = (androidx.compose.animation.core.s1.f) r0
            int r1 = r0.f2903e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2903e = r1
            goto L18
        L13:
            androidx.compose.animation.core.s1$f r0 = new androidx.compose.animation.core.s1$f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2901c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f2903e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f2900b
            androidx.compose.animation.core.s1 r5 = (androidx.compose.animation.core.s1) r5
            kotlin.a1.n(r6)
            goto L61
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.a1.n(r6)
            r6 = 0
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 > 0) goto L67
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L67
            S r6 = r4.currentState
            S r2 = r4.targetState
            boolean r6 = kotlin.jvm.internal.l0.g(r6, r2)
            if (r6 == 0) goto L4e
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        L4e:
            androidx.compose.animation.core.b<java.lang.Float, androidx.compose.animation.core.o> r6 = r4.animatedFraction
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.f2900b = r4
            r0.f2903e = r3
            java.lang.Object r5 = r6.C(r2, r0)
            if (r5 != r1) goto L60
            return r1
        L60:
            r5 = r4
        L61:
            r5.l()
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        L67:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Expecting fraction between 0 and 1. Got "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.s1.m(float, kotlin.coroutines.d):java.lang.Object");
    }
}
