package androidx.compose.foundation.gestures;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.c2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import kotlin.Metadata;

/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/foundation/gestures/q;", "Landroidx/compose/foundation/gestures/w0;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Lld/l;)V", "Landroidx/compose/foundation/a2;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/q0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "f", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delta", "b", "(F)F", "a", "Lld/l;", "l", "()Lld/l;", "Landroidx/compose/foundation/gestures/q0;", "scrollScope", "Landroidx/compose/foundation/c2;", "c", "Landroidx/compose/foundation/c2;", "scrollMutex", "Landroidx/compose/runtime/k2;", "", "d", "Landroidx/compose/runtime/k2;", "isScrollingState", "()Z", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class q implements w0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Float, Float> onDelta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q0 scrollScope = new b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2 scrollMutex = new c2();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<Boolean> isScrollingState;

    /* compiled from: ScrollableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4210b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a2 f4212d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<q0, kotlin.coroutines.d<? super kotlin.k2>, Object> f4213e;

        /* compiled from: ScrollableState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.q$a$a, reason: collision with other inner class name */
        static final class C0073a extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f4214b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f4215c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ q f4216d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.p<q0, kotlin.coroutines.d<? super kotlin.k2>, Object> f4217e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0073a(q qVar, ld.p<? super q0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, kotlin.coroutines.d<? super C0073a> dVar) {
                super(2, dVar);
                this.f4216d = qVar;
                this.f4217e = pVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((C0073a) create(q0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0073a c0073a = new C0073a(this.f4216d, this.f4217e, dVar);
                c0073a.f4215c = obj;
                return c0073a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f4214b;
                try {
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        q0 q0Var = (q0) this.f4215c;
                        this.f4216d.isScrollingState.setValue(Boolean.TRUE);
                        ld.p<q0, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f4217e;
                        this.f4214b = 1;
                        if (pVar.invoke(q0Var, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    this.f4216d.isScrollingState.setValue(Boolean.FALSE);
                    return kotlin.k2.f75408a;
                } catch (Throwable th) {
                    this.f4216d.isScrollingState.setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(a2 a2Var, ld.p<? super q0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f4212d = a2Var;
            this.f4213e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return q.this.new a(this.f4212d, this.f4213e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4210b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                c2 c2Var = q.this.scrollMutex;
                q0 q0Var = q.this.scrollScope;
                a2 a2Var = this.f4212d;
                C0073a c0073a = new C0073a(q.this, this.f4213e, null);
                this.f4210b = 1;
                if (c2Var.f(q0Var, a2Var, c0073a, this) == aVar) {
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
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: ScrollableState.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/q$b", "Landroidx/compose/foundation/gestures/q0;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements q0 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.q0
        public float a(float pixels) {
            if (Float.isNaN(pixels)) {
                return 0.0f;
            }
            return q.this.l().invoke(Float.valueOf(pixels)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@fg.l ld.l<? super Float, Float> lVar) {
        k2<Boolean> g4;
        this.onDelta = lVar;
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        this.isScrollingState = g4;
    }

    @Override // androidx.compose.foundation.gestures.w0
    public float b(float delta) {
        return this.onDelta.invoke(Float.valueOf(delta)).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.w0
    public boolean d() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.w0
    @fg.m
    public Object f(@fg.l a2 a2Var, @fg.l ld.p<? super q0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = kotlinx.coroutines.s0.g(new a(a2Var, pVar, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }

    @fg.l
    public final ld.l<Float, Float> l() {
        return this.onDelta;
    }
}
