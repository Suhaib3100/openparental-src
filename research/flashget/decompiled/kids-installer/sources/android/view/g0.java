package android.view;

import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.u0;
import q3.p;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/g0;", "T", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/p1;", "c", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g;", "a", "Landroidx/lifecycle/g;", "()Landroidx/lifecycle/g;", "e", "(Landroidx/lifecycle/g;)V", "target", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "coroutineContext", "d", "()Ljava/lang/Object;", "latestValue", "context", "<init>", "(Landroidx/lifecycle/g;Lkotlin/coroutines/g;)V", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class g0<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private C0530g<T> target;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final CoroutineContext coroutineContext;

    /* compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8571s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ g0<T> f8572t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ T f8573u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g0<T> g0Var, T t5, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8572t = g0Var;
            this.f8573u = t5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f8571s;
            if (i5 == 0) {
                a1.n(obj);
                C0530g<T> a6 = this.f8572t.a();
                this.f8571s = 1;
                if (a6.u(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            this.f8572t.a().q(this.f8573u);
            return m2.f23662a;
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d u0 u0Var, @e Continuation<? super m2> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            return new a(this.f8572t, this.f8573u, continuation);
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/p1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class b extends SuspendLambda implements p<u0, Continuation<? super p1>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8574s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ g0<T> f8575t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f8576u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g0<T> g0Var, LiveData<T> liveData, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f8575t = g0Var;
            this.f8576u = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f8574s;
            if (i5 == 0) {
                a1.n(obj);
                C0530g<T> a6 = this.f8575t.a();
                LiveData<T> liveData = this.f8576u;
                this.f8574s = 1;
                obj = a6.v(liveData, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return obj;
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d u0 u0Var, @e Continuation<? super p1> continuation) {
            return ((b) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            return new b(this.f8575t, this.f8576u, continuation);
        }
    }

    public g0(@d C0530g<T> target, @d CoroutineContext context) {
        l0.p(target, "target");
        l0.p(context, "context");
        this.target = target;
        this.coroutineContext = context.B(m1.e().J0());
    }

    @d
    public final C0530g<T> a() {
        return this.target;
    }

    @Override // android.view.f0
    @e
    public Object b(T t5, @d Continuation<? super m2> continuation) {
        Object h5 = j.h(this.coroutineContext, new a(this, t5, null), continuation);
        return h5 == CoroutineSingletons.COROUTINE_SUSPENDED ? h5 : m2.f23662a;
    }

    @Override // android.view.f0
    @e
    public Object c(@d LiveData<T> liveData, @d Continuation<? super p1> continuation) {
        return j.h(this.coroutineContext, new b(this, liveData, null), continuation);
    }

    @Override // android.view.f0
    @e
    public T d() {
        return this.target.f();
    }

    public final void e(@d C0530g<T> c0530g) {
        l0.p(c0530g, "<set-?>");
        this.target = c0530g;
    }
}
