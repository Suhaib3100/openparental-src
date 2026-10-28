package androidx.compose.foundation.gestures;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.c2;
import androidx.compose.runtime.t4;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TransformableState.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BT\u0012K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\f\u0010\rJA\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\\\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/foundation/gestures/r;", "Landroidx/compose/foundation/gestures/f1;", "Lkotlin/Function3;", "", "Lkotlin/r0;", "name", "zoomChange", "Li0/f;", "panChange", "rotationChange", "Lkotlin/k2;", "onTransformation", "<init>", "(Lld/q;)V", "Landroidx/compose/foundation/a2;", "transformPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/c1;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "a", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lld/q;", "g", "()Lld/q;", "b", "Landroidx/compose/foundation/gestures/c1;", "transformScope", "Landroidx/compose/foundation/c2;", "c", "Landroidx/compose/foundation/c2;", "transformMutex", "Landroidx/compose/runtime/k2;", "", "d", "Landroidx/compose/runtime/k2;", "isTransformingState", "()Z", "isTransformInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class r implements f1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<Float, i0.f, Float, k2> onTransformation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c1 transformScope = new b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2 transformMutex = new c2();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2<Boolean> isTransformingState;

    /* compiled from: TransformableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4223b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a2 f4225d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<c1, kotlin.coroutines.d<? super k2>, Object> f4226e;

        /* compiled from: TransformableState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/c1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/c1;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.r$a$a, reason: collision with other inner class name */
        static final class C0074a extends kotlin.coroutines.jvm.internal.o implements ld.p<c1, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f4227b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f4228c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ r f4229d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.p<c1, kotlin.coroutines.d<? super k2>, Object> f4230e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0074a(r rVar, ld.p<? super c1, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super C0074a> dVar) {
                super(2, dVar);
                this.f4229d = rVar;
                this.f4230e = pVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l c1 c1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0074a) create(c1Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0074a c0074a = new C0074a(this.f4229d, this.f4230e, dVar);
                c0074a.f4228c = obj;
                return c0074a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f4227b;
                try {
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        c1 c1Var = (c1) this.f4228c;
                        this.f4229d.isTransformingState.setValue(Boolean.TRUE);
                        ld.p<c1, kotlin.coroutines.d<? super k2>, Object> pVar = this.f4230e;
                        this.f4227b = 1;
                        if (pVar.invoke(c1Var, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    this.f4229d.isTransformingState.setValue(Boolean.FALSE);
                    return k2.f75408a;
                } catch (Throwable th) {
                    this.f4229d.isTransformingState.setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(a2 a2Var, ld.p<? super c1, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f4225d = a2Var;
            this.f4226e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return r.this.new a(this.f4225d, this.f4226e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4223b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                c2 c2Var = r.this.transformMutex;
                c1 c1Var = r.this.transformScope;
                a2 a2Var = this.f4225d;
                C0074a c0074a = new C0074a(r.this, this.f4226e, null);
                this.f4223b = 1;
                if (c2Var.f(c1Var, a2Var, c0074a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"androidx/compose/foundation/gestures/r$b", "Landroidx/compose/foundation/gestures/c1;", "", "zoomChange", "Li0/f;", "panChange", "rotationChange", "Lkotlin/k2;", "a", "(FJF)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements c1 {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.c1
        public void a(float zoomChange, long panChange, float rotationChange) {
            r.this.g().R(Float.valueOf(zoomChange), i0.f.d(panChange), Float.valueOf(rotationChange));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@fg.l ld.q<? super Float, ? super i0.f, ? super Float, k2> qVar) {
        androidx.compose.runtime.k2<Boolean> g4;
        this.onTransformation = qVar;
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        this.isTransformingState = g4;
    }

    @Override // androidx.compose.foundation.gestures.f1
    @fg.m
    public Object a(@fg.l a2 a2Var, @fg.l ld.p<? super c1, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object g4 = kotlinx.coroutines.s0.g(new a(a2Var, pVar, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    @Override // androidx.compose.foundation.gestures.f1
    public boolean b() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @fg.l
    public final ld.q<Float, i0.f, Float, k2> g() {
        return this.onTransformation;
    }
}
