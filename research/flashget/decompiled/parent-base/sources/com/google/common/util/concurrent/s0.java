package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.k1;
import com.google.common.util.concurrent.w0;
import com.google.common.util.concurrent.y;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Futures.java */
@b0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class s0 extends v0 {

    /* compiled from: Futures.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Future f57936b;

        a(Future future) {
            this.f57936b = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57936b.cancel(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* compiled from: Futures.java */
    class b<O> implements Future<O> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Future f57937b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.x f57938c;

        b(Future future, com.google.common.base.x xVar) {
            this.f57937b = future;
            this.f57938c = xVar;
        }

        private O a(I i4) throws ExecutionException {
            try {
                return (O) this.f57938c.apply(i4);
            } catch (Throwable th) {
                throw new ExecutionException(th);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z4) {
            return this.f57937b.cancel(z4);
        }

        @Override // java.util.concurrent.Future
        public O get() throws InterruptedException, ExecutionException {
            return a(this.f57937b.get());
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f57937b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f57937b.isDone();
        }

        @Override // java.util.concurrent.Future
        public O get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return a(this.f57937b.get(j4, timeUnit));
        }
    }

    /* compiled from: Futures.java */
    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f57939b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3 f57940c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f57941d;

        c(g gVar, f3 f3Var, int i4) {
            this.f57939b = gVar;
            this.f57940c = f3Var;
            this.f57941d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57939b.f(this.f57940c, this.f57941d);
        }
    }

    /* compiled from: Futures.java */
    private static final class d<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final Future<V> f57942b;

        /* renamed from: c, reason: collision with root package name */
        final r0<? super V> f57943c;

        d(Future<V> future, r0<? super V> r0Var) {
            this.f57942b = future;
            this.f57943c = r0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable a5;
            Future<V> future = this.f57942b;
            if ((future instanceof com.google.common.util.concurrent.internal.a) && (a5 = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) future)) != null) {
                this.f57943c.onFailure(a5);
                return;
            }
            try {
                this.f57943c.onSuccess(s0.h(this.f57942b));
            } catch (Error e4) {
                e = e4;
                this.f57943c.onFailure(e);
            } catch (RuntimeException e5) {
                e = e5;
                this.f57943c.onFailure(e);
            } catch (ExecutionException e6) {
                this.f57943c.onFailure(e6.getCause());
            }
        }

        public String toString() {
            return com.google.common.base.d0.c(this).s(this.f57943c).toString();
        }
    }

    /* compiled from: Futures.java */
    @f9.a
    @d9.b
    @d9.a
    public static final class e<V> {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f57944a;

        /* renamed from: b, reason: collision with root package name */
        private final f3<ListenableFuture<? extends V>> f57945b;

        /* compiled from: Futures.java */
        class a implements Callable<Void> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f57946a;

            a(e eVar, Runnable runnable) {
                this.f57946a = runnable;
            }

            @Override // java.util.concurrent.Callable
            @zc.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f57946a.run();
                return null;
            }
        }

        /* synthetic */ e(boolean z4, f3 f3Var, a aVar) {
            this(z4, f3Var);
        }

        @f9.a
        public <C> ListenableFuture<C> a(Callable<C> callable, Executor executor) {
            return new z(this.f57945b, this.f57944a, executor, callable);
        }

        public <C> ListenableFuture<C> b(m<C> mVar, Executor executor) {
            return new z(this.f57945b, this.f57944a, executor, mVar);
        }

        public ListenableFuture<?> c(Runnable runnable, Executor executor) {
            return a(new a(this, runnable), executor);
        }

        private e(boolean z4, f3<ListenableFuture<? extends V>> f3Var) {
            this.f57944a = z4;
            this.f57945b = f3Var;
        }
    }

    /* compiled from: Futures.java */
    private static final class f<T> extends com.google.common.util.concurrent.c<T> {

        /* renamed from: j, reason: collision with root package name */
        @zc.a
        private g<T> f57947j;

        /* synthetic */ f(g gVar, a aVar) {
            this(gVar);
        }

        @Override // com.google.common.util.concurrent.c, java.util.concurrent.Future
        public boolean cancel(boolean z4) {
            g<T> gVar = this.f57947j;
            if (!super.cancel(z4)) {
                return false;
            }
            Objects.requireNonNull(gVar);
            gVar.g(z4);
            return true;
        }

        @Override // com.google.common.util.concurrent.c
        protected void m() {
            this.f57947j = null;
        }

        @Override // com.google.common.util.concurrent.c
        @zc.a
        protected String y() {
            g<T> gVar = this.f57947j;
            if (gVar == null) {
                return null;
            }
            int length = ((g) gVar).f57951d.length;
            int i4 = ((g) gVar).f57950c.get();
            StringBuilder sb = new StringBuilder(49);
            sb.append(ProtectedSandApp.s("﨤"));
            sb.append(length);
            sb.append(ProtectedSandApp.s("逸"));
            sb.append(i4);
            sb.append(ProtectedSandApp.s("都"));
            return sb.toString();
        }

        private f(g<T> gVar) {
            this.f57947j = gVar;
        }
    }

    /* compiled from: Futures.java */
    private static final class g<T> {

        /* renamed from: a, reason: collision with root package name */
        private boolean f57948a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f57949b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicInteger f57950c;

        /* renamed from: d, reason: collision with root package name */
        private final ListenableFuture<? extends T>[] f57951d;

        /* renamed from: e, reason: collision with root package name */
        private volatile int f57952e;

        /* synthetic */ g(ListenableFuture[] listenableFutureArr, a aVar) {
            this(listenableFutureArr);
        }

        private void e() {
            if (this.f57950c.decrementAndGet() == 0 && this.f57948a) {
                for (ListenableFuture<? extends T> listenableFuture : this.f57951d) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.f57949b);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(f3<com.google.common.util.concurrent.c<T>> f3Var, int i4) {
            ListenableFuture<? extends T> listenableFuture = this.f57951d[i4];
            Objects.requireNonNull(listenableFuture);
            ListenableFuture<? extends T> listenableFuture2 = listenableFuture;
            this.f57951d[i4] = null;
            for (int i5 = this.f57952e; i5 < f3Var.size(); i5++) {
                if (f3Var.get(i5).D(listenableFuture2)) {
                    e();
                    this.f57952e = i5 + 1;
                    return;
                }
            }
            this.f57952e = f3Var.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(boolean z4) {
            this.f57948a = true;
            if (!z4) {
                this.f57949b = false;
            }
            e();
        }

        private g(ListenableFuture<? extends T>[] listenableFutureArr) {
            this.f57948a = false;
            this.f57949b = true;
            this.f57952e = 0;
            this.f57951d = listenableFutureArr;
            this.f57950c = new AtomicInteger(listenableFutureArr.length);
        }
    }

    /* compiled from: Futures.java */
    private static final class h<V> extends c.j<V> implements Runnable {

        /* renamed from: j, reason: collision with root package name */
        @zc.a
        private ListenableFuture<V> f57953j;

        h(ListenableFuture<V> listenableFuture) {
            this.f57953j = listenableFuture;
        }

        @Override // com.google.common.util.concurrent.c
        protected void m() {
            this.f57953j = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<V> listenableFuture = this.f57953j;
            if (listenableFuture != null) {
                D(listenableFuture);
            }
        }

        @Override // com.google.common.util.concurrent.c
        @zc.a
        protected String y() {
            ListenableFuture<V> listenableFuture = this.f57953j;
            if (listenableFuture == null) {
                return null;
            }
            String valueOf = String.valueOf(listenableFuture);
            return com.google.common.base.h.a(valueOf.length() + 11, ProtectedSandApp.s("﨧"), valueOf, ProtectedSandApp.s("﨨"));
        }
    }

    private s0() {
    }

    @d9.a
    @SafeVarargs
    public static <V> e<V> A(ListenableFuture<? extends V>... listenableFutureArr) {
        return new e<>(false, f3.D(listenableFutureArr), null);
    }

    @d9.a
    public static <V> e<V> B(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new e<>(true, f3.w(iterable), null);
    }

    @d9.a
    @SafeVarargs
    public static <V> e<V> C(ListenableFuture<? extends V>... listenableFutureArr) {
        return new e<>(true, f3.D(listenableFutureArr), null);
    }

    @d9.a
    @d9.c
    public static <V> ListenableFuture<V> D(ListenableFuture<V> listenableFuture, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : g2.T(listenableFuture, j4, timeUnit, scheduledExecutorService);
    }

    private static void E(Throwable th) {
        if (!(th instanceof Error)) {
            throw new UncheckedExecutionException(th);
        }
        throw new c0(th);
    }

    public static <V> void a(ListenableFuture<V> listenableFuture, r0<? super V> r0Var, Executor executor) {
        r0Var.getClass();
        listenableFuture.n2(new d(listenableFuture, r0Var), executor);
    }

    @d9.a
    public static <V> ListenableFuture<List<V>> b(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new y.a(f3.w(iterable), true);
    }

    @d9.a
    @SafeVarargs
    public static <V> ListenableFuture<List<V>> c(ListenableFuture<? extends V>... listenableFutureArr) {
        return new y.a(f3.D(listenableFutureArr), true);
    }

    @d9.a
    @k1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> ListenableFuture<V> d(ListenableFuture<? extends V> listenableFuture, Class<X> cls, com.google.common.base.x<? super X, ? extends V> xVar, Executor executor) {
        return com.google.common.util.concurrent.a.P(listenableFuture, cls, xVar, executor);
    }

    @d9.a
    @k1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> ListenableFuture<V> e(ListenableFuture<? extends V> listenableFuture, Class<X> cls, n<? super X, ? extends V> nVar, Executor executor) {
        return com.google.common.util.concurrent.a.Q(listenableFuture, cls, nVar, executor);
    }

    @d9.c
    @f9.a
    @j1
    @d9.a
    public static <V, X extends Exception> V f(Future<V> future, Class<X> cls) throws Exception {
        return (V) t0.d(future, cls);
    }

    @d9.c
    @f9.a
    @j1
    @d9.a
    public static <V, X extends Exception> V g(Future<V> future, Class<X> cls, long j4, TimeUnit timeUnit) throws Exception {
        return (V) t0.e(future, cls, j4, timeUnit);
    }

    @f9.a
    @j1
    public static <V> V h(Future<V> future) throws ExecutionException {
        com.google.common.base.l0.x0(future.isDone(), ProtectedSandApp.s("﨩"), future);
        return (V) j2.f(future);
    }

    @f9.a
    @j1
    public static <V> V i(Future<V> future) {
        future.getClass();
        try {
            return (V) j2.f(future);
        } catch (ExecutionException e4) {
            E(e4.getCause());
            throw new AssertionError();
        }
    }

    private static <T> ListenableFuture<? extends T>[] j(Iterable<? extends ListenableFuture<? extends T>> iterable) {
        return (ListenableFuture[]) (iterable instanceof Collection ? (Collection) iterable : f3.w(iterable)).toArray(new ListenableFuture[0]);
    }

    public static <V> ListenableFuture<V> k() {
        w0.a<Object> aVar = w0.a.f57982j;
        return aVar != null ? aVar : new w0.a();
    }

    public static <V> ListenableFuture<V> l(Throwable th) {
        th.getClass();
        return new w0.b(th);
    }

    public static <V> ListenableFuture<V> m(@j1 V v4) {
        return v4 == null ? (ListenableFuture<V>) w0.f57979c : new w0(v4);
    }

    public static ListenableFuture<Void> n() {
        return w0.f57979c;
    }

    public static <T> f3<ListenableFuture<T>> o(Iterable<? extends ListenableFuture<? extends T>> iterable) {
        ListenableFuture[] j4 = j(iterable);
        a aVar = null;
        g gVar = new g(j4, aVar);
        f3.a s4 = f3.s(j4.length);
        for (int i4 = 0; i4 < j4.length; i4++) {
            s4.j(new f(gVar, aVar));
        }
        f3<ListenableFuture<T>> e4 = s4.e();
        for (int i5 = 0; i5 < j4.length; i5++) {
            j4[i5].n2(new c(gVar, e4, i5), a0.INSTANCE);
        }
        return e4;
    }

    @d9.a
    @d9.c
    public static <I, O> Future<O> p(Future<I> future, com.google.common.base.x<? super I, ? extends O> xVar) {
        future.getClass();
        xVar.getClass();
        return new b(future, xVar);
    }

    public static <V> ListenableFuture<V> q(ListenableFuture<V> listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        h hVar = new h(listenableFuture);
        listenableFuture.n2(hVar, a0.INSTANCE);
        return hVar;
    }

    @d9.c
    public static <O> ListenableFuture<O> r(m<O> mVar, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        h2 P = h2.P(mVar);
        P.n2(new a(scheduledExecutorService.schedule(P, j4, timeUnit)), a0.INSTANCE);
        return P;
    }

    public static ListenableFuture<Void> s(Runnable runnable, Executor executor) {
        h2 Q = h2.Q(runnable, null);
        executor.execute(Q);
        return Q;
    }

    public static <O> ListenableFuture<O> t(Callable<O> callable, Executor executor) {
        h2 R = h2.R(callable);
        executor.execute(R);
        return R;
    }

    public static <O> ListenableFuture<O> u(m<O> mVar, Executor executor) {
        h2 P = h2.P(mVar);
        executor.execute(P);
        return P;
    }

    @d9.a
    public static <V> ListenableFuture<List<V>> v(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new y.a(f3.w(iterable), false);
    }

    @d9.a
    @SafeVarargs
    public static <V> ListenableFuture<List<V>> w(ListenableFuture<? extends V>... listenableFutureArr) {
        return new y.a(f3.D(listenableFutureArr), false);
    }

    @d9.a
    public static <I, O> ListenableFuture<O> x(ListenableFuture<I> listenableFuture, com.google.common.base.x<? super I, ? extends O> xVar, Executor executor) {
        return com.google.common.util.concurrent.h.P(listenableFuture, xVar, executor);
    }

    @d9.a
    public static <I, O> ListenableFuture<O> y(ListenableFuture<I> listenableFuture, n<? super I, ? extends O> nVar, Executor executor) {
        return com.google.common.util.concurrent.h.Q(listenableFuture, nVar, executor);
    }

    @d9.a
    public static <V> e<V> z(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new e<>(false, f3.w(iterable), null);
    }
}
