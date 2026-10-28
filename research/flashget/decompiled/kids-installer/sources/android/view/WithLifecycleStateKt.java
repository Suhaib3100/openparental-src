package android.view;

import android.view.t;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.s;
import kotlinx.coroutines.y2;
import q3.a;
import q3.l;

/* compiled from: WithLifecycleState.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a-\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a5\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a-\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a5\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081Hø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0007\u001aC\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"R", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/t$c;", "state", "Lkotlin/Function0;", "block", "n", "(Landroidx/lifecycle/t;Landroidx/lifecycle/t$c;Lq3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "(Landroidx/lifecycle/t;Lq3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "f", "Landroidx/lifecycle/a0;", "o", "(Landroidx/lifecycle/a0;Landroidx/lifecycle/t$c;Lq3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "(Landroidx/lifecycle/a0;Lq3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "g", "r", "", "dispatchNeeded", "Lkotlinx/coroutines/o0;", "lifecycleDispatcher", "a", "(Landroidx/lifecycle/t;Landroidx/lifecycle/t$c;ZLkotlinx/coroutines/o0;Lq3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt {

    /* compiled from: WithLifecycleState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"R", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ t f8470o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f8471p;

        a(t tVar, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            this.f8470o = tVar;
            this.f8471p = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8470o.a(this.f8471p);
        }
    }

    /* compiled from: WithLifecycleState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"R", "", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    static final class b extends Lambda implements l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ o0 f8472p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ t f8473q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f8474r;

        /* compiled from: WithLifecycleState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"R", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* loaded from: classes.dex */
        static final class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ t f8475o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f8476p;

            a(t tVar, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
                this.f8475o = tVar;
                this.f8476p = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8475o.c(this.f8476p);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var, t tVar, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            super(1);
            this.f8472p = o0Var;
            this.f8473q = tVar;
            this.f8474r = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@e Throwable th) {
            o0 o0Var = this.f8472p;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23294o;
            if (o0Var.B0(emptyCoroutineContext)) {
                this.f8472p.y0(emptyCoroutineContext, new a(this.f8473q, this.f8474r));
            } else {
                this.f8473q.c(this.f8474r);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: WithLifecycleState.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"R", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c<R> extends Lambda implements q3.a<R> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.a<R> f8477p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(q3.a<? extends R> aVar) {
            super(0);
            this.f8477p = aVar;
        }

        @Override // q3.a
        public final R n() {
            return this.f8477p.n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.z] */
    @e
    @PublishedApi
    public static final <R> Object a(@d final t tVar, @d final t.c cVar, boolean z5, @d o0 o0Var, @d final q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        final s sVar = new s(e6, 1);
        sVar.X();
        ?? r12 = new w() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // android.view.w
            public void h(@d a0 source, @d t.b event) {
                Object a6;
                l0.p(source, "source");
                l0.p(event, "event");
                if (event != t.b.upTo(t.c.this)) {
                    if (event == t.b.ON_DESTROY) {
                        tVar.c(this);
                        Continuation continuation2 = sVar;
                        LifecycleDestroyedException lifecycleDestroyedException = new LifecycleDestroyedException();
                        Result.a aVar2 = Result.f27242p;
                        continuation2.s(a1.a(lifecycleDestroyedException));
                        return;
                    }
                    return;
                }
                tVar.c(this);
                Continuation continuation3 = sVar;
                a<R> aVar3 = aVar;
                try {
                    Result.a aVar4 = Result.f27242p;
                    a6 = aVar3.n();
                } catch (Throwable th) {
                    Result.a aVar5 = Result.f27242p;
                    a6 = a1.a(th);
                }
                continuation3.s(a6);
            }
        };
        if (z5) {
            o0Var.y0(EmptyCoroutineContext.f23294o, new a(tVar, r12));
        } else {
            tVar.a(r12);
        }
        sVar.K(new b(o0Var, tVar, r12));
        Object A = sVar.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            h.c(continuation);
        }
        return A;
    }

    @e
    public static final <R> Object b(@d t tVar, @d q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        t.c cVar = t.c.CREATED;
        y2 J0 = m1.e().J0();
        boolean B0 = J0.B0(continuation.getContext());
        if (!B0) {
            if (tVar.b() == t.c.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (tVar.b().compareTo(cVar) >= 0) {
                return aVar.n();
            }
        }
        return a(tVar, cVar, B0, J0, new c(aVar), continuation);
    }

    @e
    public static final <R> Object c(@d a0 a0Var, @d q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        t.c cVar = t.c.CREATED;
        y2 J0 = m1.e().J0();
        boolean B0 = J0.B0(continuation.getContext());
        if (!B0) {
            if (lifecycle.b() == t.c.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(cVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, cVar, B0, J0, new c(aVar), continuation);
    }

    private static final <R> Object d(t tVar, q3.a<? extends R> aVar, Continuation<? super R> continuation) {
        t.c cVar = t.c.CREATED;
        m1.e().J0();
        throw null;
    }

    private static final <R> Object e(a0 a0Var, q3.a<? extends R> aVar, Continuation<? super R> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        t.c cVar = t.c.CREATED;
        m1.e().J0();
        throw null;
    }

    @e
    public static final <R> Object f(@d t tVar, @d q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        t.c cVar = t.c.RESUMED;
        y2 J0 = m1.e().J0();
        boolean B0 = J0.B0(continuation.getContext());
        if (!B0) {
            if (tVar.b() == t.c.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (tVar.b().compareTo(cVar) >= 0) {
                return aVar.n();
            }
        }
        return a(tVar, cVar, B0, J0, new c(aVar), continuation);
    }

    @e
    public static final <R> Object g(@d a0 a0Var, @d q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        t.c cVar = t.c.RESUMED;
        y2 J0 = m1.e().J0();
        boolean B0 = J0.B0(continuation.getContext());
        if (!B0) {
            if (lifecycle.b() == t.c.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(cVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, cVar, B0, J0, new c(aVar), continuation);
    }

    private static final <R> Object h(t tVar, q3.a<? extends R> aVar, Continuation<? super R> continuation) {
        t.c cVar = t.c.RESUMED;
        m1.e().J0();
        throw null;
    }

    private static final <R> Object i(a0 a0Var, q3.a<? extends R> aVar, Continuation<? super R> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        t.c cVar = t.c.RESUMED;
        m1.e().J0();
        throw null;
    }

    @e
    public static final <R> Object j(@d t tVar, @d q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        t.c cVar = t.c.STARTED;
        y2 J0 = m1.e().J0();
        boolean B0 = J0.B0(continuation.getContext());
        if (!B0) {
            if (tVar.b() == t.c.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (tVar.b().compareTo(cVar) >= 0) {
                return aVar.n();
            }
        }
        return a(tVar, cVar, B0, J0, new c(aVar), continuation);
    }

    @e
    public static final <R> Object k(@d a0 a0Var, @d q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        t.c cVar = t.c.STARTED;
        y2 J0 = m1.e().J0();
        boolean B0 = J0.B0(continuation.getContext());
        if (!B0) {
            if (lifecycle.b() == t.c.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(cVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, cVar, B0, J0, new c(aVar), continuation);
    }

    private static final <R> Object l(t tVar, q3.a<? extends R> aVar, Continuation<? super R> continuation) {
        t.c cVar = t.c.STARTED;
        m1.e().J0();
        throw null;
    }

    private static final <R> Object m(a0 a0Var, q3.a<? extends R> aVar, Continuation<? super R> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        t.c cVar = t.c.STARTED;
        m1.e().J0();
        throw null;
    }

    @e
    public static final <R> Object n(@d t tVar, @d t.c cVar, @d q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        if (!(cVar.compareTo(t.c.CREATED) >= 0)) {
            throw new IllegalArgumentException(l0.C("target state must be CREATED or greater, found ", cVar).toString());
        }
        y2 J0 = m1.e().J0();
        boolean B0 = J0.B0(continuation.getContext());
        if (!B0) {
            if (tVar.b() == t.c.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (tVar.b().compareTo(cVar) >= 0) {
                return aVar.n();
            }
        }
        return a(tVar, cVar, B0, J0, new c(aVar), continuation);
    }

    @e
    public static final <R> Object o(@d a0 a0Var, @d t.c cVar, @d q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        if (!(cVar.compareTo(t.c.CREATED) >= 0)) {
            throw new IllegalArgumentException(l0.C("target state must be CREATED or greater, found ", cVar).toString());
        }
        y2 J0 = m1.e().J0();
        boolean B0 = J0.B0(continuation.getContext());
        if (!B0) {
            if (lifecycle.b() == t.c.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(cVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, cVar, B0, J0, new c(aVar), continuation);
    }

    private static final <R> Object p(t tVar, t.c cVar, q3.a<? extends R> aVar, Continuation<? super R> continuation) {
        if (!(cVar.compareTo(t.c.CREATED) >= 0)) {
            throw new IllegalArgumentException(l0.C("target state must be CREATED or greater, found ", cVar).toString());
        }
        m1.e().J0();
        throw null;
    }

    private static final <R> Object q(a0 a0Var, t.c cVar, q3.a<? extends R> aVar, Continuation<? super R> continuation) {
        t lifecycle = a0Var.getLifecycle();
        l0.o(lifecycle, "lifecycle");
        if (!(cVar.compareTo(t.c.CREATED) >= 0)) {
            throw new IllegalArgumentException(l0.C("target state must be CREATED or greater, found ", cVar).toString());
        }
        m1.e().J0();
        throw null;
    }

    @e
    @PublishedApi
    public static final <R> Object r(@d t tVar, @d t.c cVar, @d q3.a<? extends R> aVar, @d Continuation<? super R> continuation) {
        y2 J0 = m1.e().J0();
        boolean B0 = J0.B0(continuation.getContext());
        if (!B0) {
            if (tVar.b() == t.c.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (tVar.b().compareTo(cVar) >= 0) {
                return aVar.n();
            }
        }
        return a(tVar, cVar, B0, J0, new c(aVar), continuation);
    }

    @PublishedApi
    private static final <R> Object s(t tVar, t.c cVar, q3.a<? extends R> aVar, Continuation<? super R> continuation) {
        m1.e().J0();
        throw null;
    }
}
