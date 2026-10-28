package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import com.google.common.collect.l4;
import com.google.common.util.concurrent.s0;
import java.io.Closeable;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ClosingFuture.java */
@b0
@f9.f("Use ClosingFuture.from(Futures.immediate*Future)")
/* loaded from: classes6.dex */
public final class x<V> {

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f57983d = Logger.getLogger(x.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<y> f57984a;

    /* renamed from: b, reason: collision with root package name */
    private final o f57985b;

    /* renamed from: c, reason: collision with root package name */
    private final h0<V> f57986c;

    /* compiled from: ClosingFuture.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f57987b;

        a(a0 a0Var) {
            this.f57987b = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.x(this.f57987b, x.this);
        }
    }

    /* compiled from: ClosingFuture.java */
    public interface a0<V> {
        void a(z<V> zVar);
    }

    /* compiled from: ClosingFuture.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Closeable f57989b;

        b(Closeable closeable) {
            this.f57989b = closeable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f57989b.close();
            } catch (IOException | RuntimeException e4) {
                x.f57983d.log(Level.WARNING, ProtectedSandApp.s("嘆"), e4);
            }
        }
    }

    /* compiled from: ClosingFuture.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57990a;

        static {
            int[] iArr = new int[y.values().length];
            f57990a = iArr;
            try {
                iArr[y.SUBSUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57990a[y.WILL_CREATE_VALUE_AND_CLOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57990a[y.WILL_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57990a[y.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57990a[y.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57990a[y.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ClosingFuture.java */
    class d implements r0<Closeable> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f57992b;

        d(Executor executor) {
            this.f57992b = executor;
        }

        @Override // com.google.common.util.concurrent.r0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@zc.a Closeable closeable) {
            x.this.f57985b.f58007b.a(closeable, this.f57992b);
        }

        @Override // com.google.common.util.concurrent.r0
        public void onFailure(Throwable th) {
        }
    }

    /* compiled from: ClosingFuture.java */
    class e implements Callable<V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f57993a;

        e(p pVar) {
            this.f57993a = pVar;
        }

        @Override // java.util.concurrent.Callable
        @j1
        public V call() throws Exception {
            return (V) this.f57993a.a(x.this.f57985b.f58007b);
        }

        public String toString() {
            return this.f57993a.toString();
        }
    }

    /* compiled from: ClosingFuture.java */
    class f implements com.google.common.util.concurrent.m<V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f57995a;

        f(m mVar) {
            this.f57995a = mVar;
        }

        @Override // com.google.common.util.concurrent.m
        public ListenableFuture<V> call() throws Exception {
            o oVar = new o(null);
            try {
                x<V> a5 = this.f57995a.a(oVar.f58007b);
                a5.i(x.this.f57985b);
                return ((x) a5).f57986c;
            } finally {
                x.this.f57985b.c(oVar, com.google.common.util.concurrent.a0.INSTANCE);
            }
        }

        public String toString() {
            return this.f57995a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* compiled from: ClosingFuture.java */
    class g<U> implements com.google.common.util.concurrent.n<V, U> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f57997a;

        g(q qVar) {
            this.f57997a = qVar;
        }

        @Override // com.google.common.util.concurrent.n
        public ListenableFuture<U> apply(V v4) throws Exception {
            return x.this.f57985b.e(this.f57997a, v4);
        }

        public String toString() {
            return this.f57997a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* compiled from: ClosingFuture.java */
    class h<U> implements com.google.common.util.concurrent.n<V, U> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f57999a;

        h(n nVar) {
            this.f57999a = nVar;
        }

        @Override // com.google.common.util.concurrent.n
        public ListenableFuture<U> apply(V v4) throws Exception {
            return x.this.f57985b.d(this.f57999a, v4);
        }

        public String toString() {
            return this.f57999a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* compiled from: ClosingFuture.java */
    class i<U> implements n<V, U> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.n f58001a;

        i(com.google.common.util.concurrent.n nVar) {
            this.f58001a = nVar;
        }

        @Override // com.google.common.util.concurrent.x.n
        public x<U> a(w wVar, V v4) throws Exception {
            return x.w(this.f58001a.apply(v4));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* compiled from: ClosingFuture.java */
    class j<W, X> implements com.google.common.util.concurrent.n<X, W> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f58002a;

        j(q qVar) {
            this.f58002a = qVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
        @Override // com.google.common.util.concurrent.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ListenableFuture apply(Throwable th) throws Exception {
            return x.this.f57985b.e(this.f58002a, th);
        }

        public String toString() {
            return this.f58002a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* compiled from: ClosingFuture.java */
    class k<W, X> implements com.google.common.util.concurrent.n<X, W> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f58004a;

        k(n nVar) {
            this.f58004a = nVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
        @Override // com.google.common.util.concurrent.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ListenableFuture apply(Throwable th) throws Exception {
            return x.this.f57985b.d(this.f58004a, th);
        }

        public String toString() {
            return this.f58004a.toString();
        }
    }

    /* compiled from: ClosingFuture.java */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x xVar = x.this;
            y yVar = y.WILL_CLOSE;
            y yVar2 = y.CLOSING;
            xVar.o(yVar, yVar2);
            x.this.p();
            x.this.o(yVar2, y.CLOSED);
        }
    }

    /* compiled from: ClosingFuture.java */
    public interface m<V> {
        x<V> a(w wVar) throws Exception;
    }

    /* compiled from: ClosingFuture.java */
    public interface n<T, U> {
        x<U> a(w wVar, @j1 T t4) throws Exception;
    }

    /* compiled from: ClosingFuture.java */
    public interface p<V> {
        @j1
        V a(w wVar) throws Exception;
    }

    /* compiled from: ClosingFuture.java */
    public interface q<T, U> {
        @j1
        U a(w wVar, @j1 T t4) throws Exception;
    }

    /* compiled from: ClosingFuture.java */
    @f9.f("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class r {

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.common.base.x<x<?>, h0<?>> f58010d = new c();

        /* renamed from: a, reason: collision with root package name */
        private final o f58011a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f58012b;

        /* renamed from: c, reason: collision with root package name */
        protected final f3<x<?>> f58013c;

        /* compiled from: ClosingFuture.java */
        class a implements Callable<V> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f58014a;

            a(e eVar) {
                this.f58014a = eVar;
            }

            @Override // java.util.concurrent.Callable
            @j1
            public V call() throws Exception {
                return (V) new C0893x(r.this.f58013c, null).c(this.f58014a, r.this.f58011a);
            }

            public String toString() {
                return this.f58014a.toString();
            }
        }

        /* compiled from: ClosingFuture.java */
        class b implements com.google.common.util.concurrent.m<V> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f58016a;

            b(d dVar) {
                this.f58016a = dVar;
            }

            @Override // com.google.common.util.concurrent.m
            public ListenableFuture<V> call() throws Exception {
                return new C0893x(r.this.f58013c, null).d(this.f58016a, r.this.f58011a);
            }

            public String toString() {
                return this.f58016a.toString();
            }
        }

        /* compiled from: ClosingFuture.java */
        class c implements com.google.common.base.x<x<?>, h0<?>> {
            c() {
            }

            @Override // com.google.common.base.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h0<?> apply(x<?> xVar) {
                return ((x) xVar).f57986c;
            }
        }

        /* compiled from: ClosingFuture.java */
        public interface d<V> {
            x<V> a(w wVar, C0893x c0893x) throws Exception;
        }

        /* compiled from: ClosingFuture.java */
        public interface e<V> {
            @j1
            V a(w wVar, C0893x c0893x) throws Exception;
        }

        /* synthetic */ r(boolean z4, Iterable iterable, d dVar) {
            this(z4, iterable);
        }

        private s0.e<Object> d() {
            return this.f58012b ? s0.B(e()) : s0.z(e());
        }

        private f3<h0<?>> e() {
            return com.google.common.collect.o1.F(this.f58013c).a0(f58010d).T();
        }

        public <V> x<V> b(e<V> eVar, Executor executor) {
            x<V> xVar = new x<>(d().a(new a(eVar), executor), (d) null);
            ((x) xVar).f57985b.c(this.f58011a, com.google.common.util.concurrent.a0.INSTANCE);
            return xVar;
        }

        public <V> x<V> c(d<V> dVar, Executor executor) {
            x<V> xVar = new x<>(d().b(new b(dVar), executor), (d) null);
            ((x) xVar).f57985b.c(this.f58011a, com.google.common.util.concurrent.a0.INSTANCE);
            return xVar;
        }

        private r(boolean z4, Iterable<? extends x<?>> iterable) {
            this.f58011a = new o(null);
            this.f58012b = z4;
            this.f58013c = f3.w(iterable);
            Iterator<? extends x<?>> it = iterable.iterator();
            while (it.hasNext()) {
                it.next().i(this.f58011a);
            }
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class s<V1, V2> extends r {

        /* renamed from: e, reason: collision with root package name */
        private final x<V1> f58018e;

        /* renamed from: f, reason: collision with root package name */
        private final x<V2> f58019f;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: ClosingFuture.java */
        class a<U> implements r.e<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f58020a;

            a(d dVar) {
                this.f58020a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.x.r.e
            @j1
            public U a(w wVar, C0893x c0893x) throws Exception {
                return (U) this.f58020a.a(wVar, c0893x.e(s.this.f58018e), c0893x.e(s.this.f58019f));
            }

            public String toString() {
                return this.f58020a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: ClosingFuture.java */
        class b<U> implements r.d<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f58022a;

            b(c cVar) {
                this.f58022a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.x.r.d
            public x<U> a(w wVar, C0893x c0893x) throws Exception {
                return this.f58022a.a(wVar, c0893x.e(s.this.f58018e), c0893x.e(s.this.f58019f));
            }

            public String toString() {
                return this.f58022a.toString();
            }
        }

        /* compiled from: ClosingFuture.java */
        public interface c<V1, V2, U> {
            x<U> a(w wVar, @j1 V1 v12, @j1 V2 v22) throws Exception;
        }

        /* compiled from: ClosingFuture.java */
        public interface d<V1, V2, U> {
            @j1
            U a(w wVar, @j1 V1 v12, @j1 V2 v22) throws Exception;
        }

        /* synthetic */ s(x xVar, x xVar2, d dVar) {
            this(xVar, xVar2);
        }

        public <U> x<U> h(d<V1, V2, U> dVar, Executor executor) {
            return b(new a(dVar), executor);
        }

        public <U> x<U> i(c<V1, V2, U> cVar, Executor executor) {
            return c(new b(cVar), executor);
        }

        private s(x<V1> xVar, x<V2> xVar2) {
            super(true, f3.K(xVar, xVar2), null);
            this.f58018e = xVar;
            this.f58019f = xVar2;
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class t<V1, V2, V3> extends r {

        /* renamed from: e, reason: collision with root package name */
        private final x<V1> f58024e;

        /* renamed from: f, reason: collision with root package name */
        private final x<V2> f58025f;

        /* renamed from: g, reason: collision with root package name */
        private final x<V3> f58026g;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: ClosingFuture.java */
        class a<U> implements r.e<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f58027a;

            a(d dVar) {
                this.f58027a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.x.r.e
            @j1
            public U a(w wVar, C0893x c0893x) throws Exception {
                return (U) this.f58027a.a(wVar, c0893x.e(t.this.f58024e), c0893x.e(t.this.f58025f), c0893x.e(t.this.f58026g));
            }

            public String toString() {
                return this.f58027a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: ClosingFuture.java */
        class b<U> implements r.d<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f58029a;

            b(c cVar) {
                this.f58029a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.x.r.d
            public x<U> a(w wVar, C0893x c0893x) throws Exception {
                return this.f58029a.a(wVar, c0893x.e(t.this.f58024e), c0893x.e(t.this.f58025f), c0893x.e(t.this.f58026g));
            }

            public String toString() {
                return this.f58029a.toString();
            }
        }

        /* compiled from: ClosingFuture.java */
        public interface c<V1, V2, V3, U> {
            x<U> a(w wVar, @j1 V1 v12, @j1 V2 v22, @j1 V3 v32) throws Exception;
        }

        /* compiled from: ClosingFuture.java */
        public interface d<V1, V2, V3, U> {
            @j1
            U a(w wVar, @j1 V1 v12, @j1 V2 v22, @j1 V3 v32) throws Exception;
        }

        /* synthetic */ t(x xVar, x xVar2, x xVar3, d dVar) {
            this(xVar, xVar2, xVar3);
        }

        public <U> x<U> i(d<V1, V2, V3, U> dVar, Executor executor) {
            return b(new a(dVar), executor);
        }

        public <U> x<U> j(c<V1, V2, V3, U> cVar, Executor executor) {
            return c(new b(cVar), executor);
        }

        private t(x<V1> xVar, x<V2> xVar2, x<V3> xVar3) {
            super(true, f3.L(xVar, xVar2, xVar3), null);
            this.f58024e = xVar;
            this.f58025f = xVar2;
            this.f58026g = xVar3;
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class u<V1, V2, V3, V4> extends r {

        /* renamed from: e, reason: collision with root package name */
        private final x<V1> f58031e;

        /* renamed from: f, reason: collision with root package name */
        private final x<V2> f58032f;

        /* renamed from: g, reason: collision with root package name */
        private final x<V3> f58033g;

        /* renamed from: h, reason: collision with root package name */
        private final x<V4> f58034h;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: ClosingFuture.java */
        class a<U> implements r.e<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f58035a;

            a(d dVar) {
                this.f58035a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.x.r.e
            @j1
            public U a(w wVar, C0893x c0893x) throws Exception {
                return (U) this.f58035a.a(wVar, c0893x.e(u.this.f58031e), c0893x.e(u.this.f58032f), c0893x.e(u.this.f58033g), c0893x.e(u.this.f58034h));
            }

            public String toString() {
                return this.f58035a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: ClosingFuture.java */
        class b<U> implements r.d<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f58037a;

            b(c cVar) {
                this.f58037a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.x.r.d
            public x<U> a(w wVar, C0893x c0893x) throws Exception {
                return this.f58037a.a(wVar, c0893x.e(u.this.f58031e), c0893x.e(u.this.f58032f), c0893x.e(u.this.f58033g), c0893x.e(u.this.f58034h));
            }

            public String toString() {
                return this.f58037a.toString();
            }
        }

        /* compiled from: ClosingFuture.java */
        public interface c<V1, V2, V3, V4, U> {
            x<U> a(w wVar, @j1 V1 v12, @j1 V2 v22, @j1 V3 v32, @j1 V4 v4) throws Exception;
        }

        /* compiled from: ClosingFuture.java */
        public interface d<V1, V2, V3, V4, U> {
            @j1
            U a(w wVar, @j1 V1 v12, @j1 V2 v22, @j1 V3 v32, @j1 V4 v4) throws Exception;
        }

        /* synthetic */ u(x xVar, x xVar2, x xVar3, x xVar4, d dVar) {
            this(xVar, xVar2, xVar3, xVar4);
        }

        public <U> x<U> j(d<V1, V2, V3, V4, U> dVar, Executor executor) {
            return b(new a(dVar), executor);
        }

        public <U> x<U> k(c<V1, V2, V3, V4, U> cVar, Executor executor) {
            return c(new b(cVar), executor);
        }

        private u(x<V1> xVar, x<V2> xVar2, x<V3> xVar3, x<V4> xVar4) {
            super(true, f3.O(xVar, xVar2, xVar3, xVar4), null);
            this.f58031e = xVar;
            this.f58032f = xVar2;
            this.f58033g = xVar3;
            this.f58034h = xVar4;
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class v<V1, V2, V3, V4, V5> extends r {

        /* renamed from: e, reason: collision with root package name */
        private final x<V1> f58039e;

        /* renamed from: f, reason: collision with root package name */
        private final x<V2> f58040f;

        /* renamed from: g, reason: collision with root package name */
        private final x<V3> f58041g;

        /* renamed from: h, reason: collision with root package name */
        private final x<V4> f58042h;

        /* renamed from: i, reason: collision with root package name */
        private final x<V5> f58043i;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: ClosingFuture.java */
        class a<U> implements r.e<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f58044a;

            a(d dVar) {
                this.f58044a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.x.r.e
            @j1
            public U a(w wVar, C0893x c0893x) throws Exception {
                return (U) this.f58044a.a(wVar, c0893x.e(v.this.f58039e), c0893x.e(v.this.f58040f), c0893x.e(v.this.f58041g), c0893x.e(v.this.f58042h), c0893x.e(v.this.f58043i));
            }

            public String toString() {
                return this.f58044a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* compiled from: ClosingFuture.java */
        class b<U> implements r.d<U> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f58046a;

            b(c cVar) {
                this.f58046a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.util.concurrent.x.r.d
            public x<U> a(w wVar, C0893x c0893x) throws Exception {
                return this.f58046a.a(wVar, c0893x.e(v.this.f58039e), c0893x.e(v.this.f58040f), c0893x.e(v.this.f58041g), c0893x.e(v.this.f58042h), c0893x.e(v.this.f58043i));
            }

            public String toString() {
                return this.f58046a.toString();
            }
        }

        /* compiled from: ClosingFuture.java */
        public interface c<V1, V2, V3, V4, V5, U> {
            x<U> a(w wVar, @j1 V1 v12, @j1 V2 v22, @j1 V3 v32, @j1 V4 v4, @j1 V5 v5) throws Exception;
        }

        /* compiled from: ClosingFuture.java */
        public interface d<V1, V2, V3, V4, V5, U> {
            @j1
            U a(w wVar, @j1 V1 v12, @j1 V2 v22, @j1 V3 v32, @j1 V4 v4, @j1 V5 v5) throws Exception;
        }

        /* synthetic */ v(x xVar, x xVar2, x xVar3, x xVar4, x xVar5, d dVar) {
            this(xVar, xVar2, xVar3, xVar4, xVar5);
        }

        public <U> x<U> k(d<V1, V2, V3, V4, V5, U> dVar, Executor executor) {
            return b(new a(dVar), executor);
        }

        public <U> x<U> l(c<V1, V2, V3, V4, V5, U> cVar, Executor executor) {
            return c(new b(cVar), executor);
        }

        private v(x<V1> xVar, x<V2> xVar2, x<V3> xVar3, x<V4> xVar4, x<V5> xVar5) {
            super(true, f3.P(xVar, xVar2, xVar3, xVar4, xVar5), null);
            this.f58039e = xVar;
            this.f58040f = xVar2;
            this.f58041g = xVar3;
            this.f58042h = xVar4;
            this.f58043i = xVar5;
        }
    }

    /* compiled from: ClosingFuture.java */
    public static final class w {

        /* renamed from: a, reason: collision with root package name */
        @ma.h
        private final o f58048a;

        w(o oVar) {
            this.f58048a = oVar;
        }

        @f9.a
        @j1
        public <C extends Closeable> C a(@j1 C c5, Executor executor) {
            executor.getClass();
            if (c5 != null) {
                this.f58048a.c(c5, executor);
            }
            return c5;
        }
    }

    /* compiled from: ClosingFuture.java */
    /* renamed from: com.google.common.util.concurrent.x$x, reason: collision with other inner class name */
    public static final class C0893x {

        /* renamed from: a, reason: collision with root package name */
        private final f3<x<?>> f58049a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f58050b;

        /* synthetic */ C0893x(f3 f3Var, d dVar) {
            this(f3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @j1
        public <V> V c(r.e<V> eVar, o oVar) throws Exception {
            this.f58050b = true;
            o oVar2 = new o(null);
            try {
                return eVar.a(oVar2.f58007b, this);
            } finally {
                oVar.c(oVar2, com.google.common.util.concurrent.a0.INSTANCE);
                this.f58050b = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <V> h0<V> d(r.d<V> dVar, o oVar) throws Exception {
            this.f58050b = true;
            o oVar2 = new o(null);
            try {
                x<V> a5 = dVar.a(oVar2.f58007b, this);
                a5.i(oVar);
                return ((x) a5).f57986c;
            } finally {
                oVar.c(oVar2, com.google.common.util.concurrent.a0.INSTANCE);
                this.f58050b = false;
            }
        }

        @j1
        public final <D> D e(x<D> xVar) throws ExecutionException {
            com.google.common.base.l0.g0(this.f58050b);
            com.google.common.base.l0.d(this.f58049a.contains(xVar));
            return (D) s0.h(((x) xVar).f57986c);
        }

        private C0893x(f3<x<?>> f3Var) {
            f3Var.getClass();
            this.f58049a = f3Var;
        }
    }

    /* compiled from: ClosingFuture.java */
    enum y {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    /* compiled from: ClosingFuture.java */
    public static final class z<V> {

        /* renamed from: a, reason: collision with root package name */
        private final x<? extends V> f58051a;

        z(x<? extends V> xVar) {
            xVar.getClass();
            this.f58051a = xVar;
        }

        public void a() {
            this.f58051a.p();
        }

        @j1
        public V b() throws ExecutionException {
            return (V) s0.h(((x) this.f58051a).f57986c);
        }
    }

    /* synthetic */ x(ListenableFuture listenableFuture, d dVar) {
        this(listenableFuture);
    }

    public static <V> x<V> A(m<V> mVar, Executor executor) {
        return new x<>(mVar, executor);
    }

    public static r D(x<?> xVar, x<?>... xVarArr) {
        return E(l4.c(xVar, xVarArr));
    }

    public static r E(Iterable<? extends x<?>> iterable) {
        return new r(false, iterable, null);
    }

    public static <V1, V2> s<V1, V2> F(x<V1> xVar, x<V2> xVar2) {
        return new s<>(xVar, xVar2, null);
    }

    public static <V1, V2, V3> t<V1, V2, V3> G(x<V1> xVar, x<V2> xVar2, x<V3> xVar3) {
        return new t<>(xVar, xVar2, xVar3, null);
    }

    public static <V1, V2, V3, V4> u<V1, V2, V3, V4> H(x<V1> xVar, x<V2> xVar2, x<V3> xVar3, x<V4> xVar4) {
        return new u<>(xVar, xVar2, xVar3, xVar4, null);
    }

    public static <V1, V2, V3, V4, V5> v<V1, V2, V3, V4, V5> I(x<V1> xVar, x<V2> xVar2, x<V3> xVar3, x<V4> xVar4, x<V5> xVar5) {
        return new v<>(xVar, xVar2, xVar3, xVar4, xVar5, null);
    }

    public static r J(x<?> xVar, x<?> xVar2, x<?> xVar3, x<?> xVar4, x<?> xVar5, x<?> xVar6, x<?>... xVarArr) {
        return K(com.google.common.collect.o1.Q(xVar, xVar2, xVar3, xVar4, xVar5, xVar6).h(xVarArr));
    }

    public static r K(Iterable<? extends x<?>> iterable) {
        return new r(true, iterable, null);
    }

    public static <V, U> n<V, U> M(com.google.common.util.concurrent.n<V, U> nVar) {
        nVar.getClass();
        return new i(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(o oVar) {
        o(y.OPEN, y.SUBSUMED);
        oVar.c(this.f57985b, com.google.common.util.concurrent.a0.INSTANCE);
    }

    private <X extends Throwable, W extends V> x<V> m(Class<X> cls, n<? super X, W> nVar, Executor executor) {
        nVar.getClass();
        k kVar = new k(nVar);
        h0<V> h0Var = this.f57986c;
        h0Var.getClass();
        return (x<V>) s((h0) com.google.common.util.concurrent.a.Q(h0Var, cls, kVar, executor));
    }

    private <X extends Throwable, W extends V> x<V> n(Class<X> cls, q<? super X, W> qVar, Executor executor) {
        qVar.getClass();
        j jVar = new j(qVar);
        h0<V> h0Var = this.f57986c;
        h0Var.getClass();
        return (x<V>) s((h0) com.google.common.util.concurrent.a.Q(h0Var, cls, jVar, executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(y yVar, y yVar2) {
        com.google.common.base.l0.B0(androidx.compose.animation.core.k1.a(this.f57984a, yVar, yVar2), ProtectedSandApp.s("慨"), yVar, yVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        f57983d.log(Level.FINER, ProtectedSandApp.s("憎"), this);
        this.f57985b.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(@zc.a Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new b(closeable));
        } catch (RejectedExecutionException e4) {
            Logger logger = f57983d;
            Level level = Level.WARNING;
            if (logger.isLoggable(level)) {
                logger.log(level, String.format(ProtectedSandApp.s("懲"), executor), (Throwable) e4);
            }
            q(closeable, com.google.common.util.concurrent.a0.INSTANCE);
        }
    }

    private boolean r(y yVar, y yVar2) {
        return androidx.compose.animation.core.k1.a(this.f57984a, yVar, yVar2);
    }

    private <U> x<U> s(h0<U> h0Var) {
        x<U> xVar = new x<>(h0Var);
        i(xVar.f57985b);
        return xVar;
    }

    @Deprecated
    public static <C extends Closeable> x<C> t(ListenableFuture<C> listenableFuture, Executor executor) {
        executor.getClass();
        x<C> xVar = new x<>(s0.q(listenableFuture));
        s0.a(listenableFuture, new d(executor), com.google.common.util.concurrent.a0.INSTANCE);
        return xVar;
    }

    public static <V> x<V> w(ListenableFuture<V> listenableFuture) {
        return new x<>(listenableFuture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <C, V extends C> void x(a0<C> a0Var, x<V> xVar) {
        a0Var.a(new z<>(xVar));
    }

    public static <V> x<V> z(p<V> pVar, Executor executor) {
        return new x<>(pVar, executor);
    }

    public <U> x<U> B(q<? super V, U> qVar, Executor executor) {
        qVar.getClass();
        g gVar = new g(qVar);
        h0<V> h0Var = this.f57986c;
        h0Var.getClass();
        return s((h0) com.google.common.util.concurrent.h.Q(h0Var, gVar, executor));
    }

    public <U> x<U> C(n<? super V, U> nVar, Executor executor) {
        nVar.getClass();
        h hVar = new h(nVar);
        h0<V> h0Var = this.f57986c;
        h0Var.getClass();
        return s((h0) com.google.common.util.concurrent.h.Q(h0Var, hVar, executor));
    }

    @d9.d
    CountDownLatch L() {
        return this.f57985b.f();
    }

    protected void finalize() {
        if (this.f57984a.get().equals(y.OPEN)) {
            f57983d.log(Level.SEVERE, ProtectedSandApp.s("敏"), this);
            u();
        }
    }

    @f9.a
    public boolean j(boolean z4) {
        f57983d.log(Level.FINER, ProtectedSandApp.s("既"), this);
        boolean cancel = this.f57986c.cancel(z4);
        if (cancel) {
            p();
        }
        return cancel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> x<V> k(Class<X> cls, q<? super X, ? extends V> qVar, Executor executor) {
        return n(cls, qVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> x<V> l(Class<X> cls, n<? super X, ? extends V> nVar, Executor executor) {
        return m(cls, nVar, executor);
    }

    public String toString() {
        return com.google.common.base.d0.c(this).f(ProtectedSandApp.s("暑"), this.f57984a.get()).s(this.f57986c).toString();
    }

    public h0<V> u() {
        if (!androidx.compose.animation.core.k1.a(this.f57984a, y.OPEN, y.WILL_CLOSE)) {
            switch (c.f57990a[this.f57984a.get().ordinal()]) {
                case 1:
                    throw new IllegalStateException(ProtectedSandApp.s("漢"));
                case 2:
                    throw new IllegalStateException(ProtectedSandApp.s("渚"));
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException(ProtectedSandApp.s("海"));
                case 6:
                    throw new AssertionError();
            }
        }
        f57983d.log(Level.FINER, ProtectedSandApp.s("梅"), this);
        this.f57986c.n2(new l(), com.google.common.util.concurrent.a0.INSTANCE);
        return this.f57986c;
    }

    public void v(a0<? super V> a0Var, Executor executor) {
        a0Var.getClass();
        if (androidx.compose.animation.core.k1.a(this.f57984a, y.OPEN, y.WILL_CREATE_VALUE_AND_CLOSER)) {
            this.f57986c.n2(new a(a0Var), executor);
            return;
        }
        int i4 = c.f57990a[this.f57984a.get().ordinal()];
        if (i4 == 1) {
            throw new IllegalStateException(ProtectedSandApp.s("琢"));
        }
        if (i4 == 2) {
            throw new IllegalStateException(ProtectedSandApp.s("爫"));
        }
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            throw new AssertionError(this.f57984a);
        }
        throw new IllegalStateException(ProtectedSandApp.s("煮"));
    }

    public ListenableFuture<?> y() {
        h0<V> h0Var = this.f57986c;
        com.google.common.base.x b5 = com.google.common.base.z.b(null);
        com.google.common.util.concurrent.a0 a0Var = com.google.common.util.concurrent.a0.INSTANCE;
        h0Var.getClass();
        return s0.q((h0) com.google.common.util.concurrent.h.P(h0Var, b5, a0Var));
    }

    /* compiled from: ClosingFuture.java */
    private static final class o extends IdentityHashMap<Closeable, Executor> implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        private final w f58007b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f58008c;

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        private volatile CountDownLatch f58009d;

        private o() {
            this.f58007b = new w(this);
        }

        void c(@zc.a Closeable closeable, Executor executor) {
            executor.getClass();
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f58008c) {
                        x.q(closeable, executor);
                    } else {
                        put(closeable, executor);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f58008c) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f58008c) {
                        return;
                    }
                    this.f58008c = true;
                    for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                        x.q(entry.getKey(), entry.getValue());
                    }
                    clear();
                    if (this.f58009d != null) {
                        this.f58009d.countDown();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        <V, U> h0<U> d(n<V, U> nVar, @j1 V v4) throws Exception {
            o oVar = new o();
            try {
                x<U> a5 = nVar.a(oVar.f58007b, v4);
                a5.i(oVar);
                return ((x) a5).f57986c;
            } finally {
                c(oVar, com.google.common.util.concurrent.a0.INSTANCE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        <V, U> ListenableFuture<U> e(q<? super V, U> qVar, @j1 V v4) throws Exception {
            o oVar = new o();
            try {
                return s0.m(qVar.a(oVar.f58007b, v4));
            } finally {
                c(oVar, com.google.common.util.concurrent.a0.INSTANCE);
            }
        }

        CountDownLatch f() {
            if (this.f58008c) {
                return new CountDownLatch(0);
            }
            synchronized (this) {
                try {
                    if (this.f58008c) {
                        return new CountDownLatch(0);
                    }
                    com.google.common.base.l0.g0(this.f58009d == null);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.f58009d = countDownLatch;
                    return countDownLatch;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* synthetic */ o(d dVar) {
            this();
        }
    }

    private x(ListenableFuture<V> listenableFuture) {
        this.f57984a = new AtomicReference<>(y.OPEN);
        this.f57985b = new o(null);
        this.f57986c = h0.L(listenableFuture);
    }

    private x(p<V> pVar, Executor executor) {
        this.f57984a = new AtomicReference<>(y.OPEN);
        this.f57985b = new o(null);
        pVar.getClass();
        h2 R = h2.R(new e(pVar));
        executor.execute(R);
        this.f57986c = R;
    }

    private x(m<V> mVar, Executor executor) {
        this.f57984a = new AtomicReference<>(y.OPEN);
        this.f57985b = new o(null);
        mVar.getClass();
        h2 P = h2.P(new f(mVar));
        executor.execute(P);
        this.f57986c = P;
    }
}
