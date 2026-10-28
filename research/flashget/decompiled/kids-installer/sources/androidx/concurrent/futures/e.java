package androidx.concurrent.futures;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: CallbackToFutureAdapter.java */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        Object f1572a;

        /* renamed from: b, reason: collision with root package name */
        d<T> f1573b;

        /* renamed from: c, reason: collision with root package name */
        private g<Void> f1574c = g.F();

        /* renamed from: d, reason: collision with root package name */
        private boolean f1575d;

        a() {
        }

        private void e() {
            this.f1572a = null;
            this.f1573b = null;
            this.f1574c = null;
        }

        public void a(@o0 Runnable runnable, @o0 Executor executor) {
            g<Void> gVar = this.f1574c;
            if (gVar != null) {
                gVar.g(runnable, executor);
            }
        }

        void b() {
            this.f1572a = null;
            this.f1573b = null;
            this.f1574c.A(null);
        }

        public boolean c(T t5) {
            this.f1575d = true;
            d<T> dVar = this.f1573b;
            boolean z5 = dVar != null && dVar.b(t5);
            if (z5) {
                e();
            }
            return z5;
        }

        public boolean d() {
            this.f1575d = true;
            d<T> dVar = this.f1573b;
            boolean z5 = dVar != null && dVar.a(true);
            if (z5) {
                e();
            }
            return z5;
        }

        public boolean f(@o0 Throwable th) {
            this.f1575d = true;
            d<T> dVar = this.f1573b;
            boolean z5 = dVar != null && dVar.c(th);
            if (z5) {
                e();
            }
            return z5;
        }

        protected void finalize() {
            g<Void> gVar;
            d<T> dVar = this.f1573b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1572a));
            }
            if (this.f1575d || (gVar = this.f1574c) == null) {
                return;
            }
            gVar.A(null);
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    public interface c<T> {
        @q0
        Object a(@o0 a<T> aVar) throws Exception;
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes2.dex */
    private static final class d<T> implements w1.a<T> {

        /* renamed from: o, reason: collision with root package name */
        final WeakReference<a<T>> f1576o;

        /* renamed from: p, reason: collision with root package name */
        private final androidx.concurrent.futures.c<T> f1577p = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        /* loaded from: classes3.dex */
        class a extends androidx.concurrent.futures.c<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.c
            protected String x() {
                a<T> aVar = d.this.f1576o.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1572a + "]";
            }
        }

        d(a<T> aVar) {
            this.f1576o = new WeakReference<>(aVar);
        }

        boolean a(boolean z5) {
            return this.f1577p.cancel(z5);
        }

        boolean b(T t5) {
            return this.f1577p.A(t5);
        }

        boolean c(Throwable th) {
            return this.f1577p.B(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z5) {
            a<T> aVar = this.f1576o.get();
            boolean cancel = this.f1577p.cancel(z5);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        @Override // w1.a
        public void g(@o0 Runnable runnable, @o0 Executor executor) {
            this.f1577p.g(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.f1577p.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f1577p.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f1577p.isDone();
        }

        public String toString() {
            return this.f1577p.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j5, @o0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f1577p.get(j5, timeUnit);
        }
    }

    private e() {
    }

    @o0
    public static <T> w1.a<T> a(@o0 c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f1573b = dVar;
        aVar.f1572a = cVar.getClass();
        try {
            Object a6 = cVar.a(aVar);
            if (a6 != null) {
                aVar.f1572a = a6;
            }
        } catch (Exception e6) {
            dVar.c(e6);
        }
        return dVar;
    }
}
