package androidx.concurrent.futures;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: CallbackToFutureAdapter.java */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        Object f21800a;

        /* renamed from: b, reason: collision with root package name */
        C0386d<T> f21801b;

        /* renamed from: c, reason: collision with root package name */
        private f<Void> f21802c = f.u();

        /* renamed from: d, reason: collision with root package name */
        private boolean f21803d;

        a() {
        }

        private void e() {
            this.f21800a = null;
            this.f21801b = null;
            this.f21802c = null;
        }

        public void a(@o0 Runnable runnable, @o0 Executor executor) {
            f<Void> fVar = this.f21802c;
            if (fVar != null) {
                fVar.n2(runnable, executor);
            }
        }

        void b() {
            this.f21800a = null;
            this.f21801b = null;
            this.f21802c.p(null);
        }

        public boolean c(T t4) {
            this.f21803d = true;
            C0386d<T> c0386d = this.f21801b;
            boolean z4 = c0386d != null && c0386d.b(t4);
            if (z4) {
                e();
            }
            return z4;
        }

        public boolean d() {
            this.f21803d = true;
            C0386d<T> c0386d = this.f21801b;
            boolean z4 = c0386d != null && c0386d.a(true);
            if (z4) {
                e();
            }
            return z4;
        }

        public boolean f(@o0 Throwable th) {
            this.f21803d = true;
            C0386d<T> c0386d = this.f21801b;
            boolean z4 = c0386d != null && c0386d.c(th);
            if (z4) {
                e();
            }
            return z4;
        }

        protected void finalize() {
            f<Void> fVar;
            C0386d<T> c0386d = this.f21801b;
            if (c0386d != null && !c0386d.isDone()) {
                c0386d.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f21800a));
            }
            if (this.f21803d || (fVar = this.f21802c) == null) {
                return;
            }
            fVar.p(null);
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
    /* renamed from: androidx.concurrent.futures.d$d, reason: collision with other inner class name */
    private static final class C0386d<T> implements ListenableFuture<T> {

        /* renamed from: b, reason: collision with root package name */
        final WeakReference<a<T>> f21804b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.concurrent.futures.b<T> f21805c = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        /* renamed from: androidx.concurrent.futures.d$d$a */
        class a extends androidx.concurrent.futures.b<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.b
            protected String m() {
                a<T> aVar = C0386d.this.f21804b.get();
                return aVar == null ? "Completer object has been garbage collected, future will fail soon" : i.a(new StringBuilder("tag=["), aVar.f21800a, "]");
            }
        }

        C0386d(a<T> aVar) {
            this.f21804b = new WeakReference<>(aVar);
        }

        boolean a(boolean z4) {
            return this.f21805c.cancel(z4);
        }

        boolean b(T t4) {
            return this.f21805c.p(t4);
        }

        boolean c(Throwable th) {
            return this.f21805c.q(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z4) {
            a<T> aVar = this.f21804b.get();
            boolean cancel = this.f21805c.cancel(z4);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.f21805c.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f21805c.f21777b instanceof b.c;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f21805c.isDone();
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void n2(@o0 Runnable runnable, @o0 Executor executor) {
            this.f21805c.n2(runnable, executor);
        }

        public String toString() {
            return this.f21805c.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j4, @o0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f21805c.get(j4, timeUnit);
        }
    }

    private d() {
    }

    @o0
    public static <T> ListenableFuture<T> a(@o0 c<T> cVar) {
        a<T> aVar = new a<>();
        C0386d<T> c0386d = new C0386d<>(aVar);
        aVar.f21801b = c0386d;
        aVar.f21800a = cVar.getClass();
        try {
            Object a5 = cVar.a(aVar);
            if (a5 != null) {
                aVar.f21800a = a5;
            }
        } catch (Exception e4) {
            c0386d.c(e4);
        }
        return c0386d;
    }
}
