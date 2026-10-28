package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.g0;
import androidx.annotation.o0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
class i {

    /* compiled from: RequestExecutor.java */
    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f5067a;

        /* renamed from: b, reason: collision with root package name */
        private int f5068b;

        /* compiled from: RequestExecutor.java */
        /* renamed from: androidx.core.provider.i$a$a, reason: collision with other inner class name */
        private static class C0046a extends Thread {

            /* renamed from: o, reason: collision with root package name */
            private final int f5069o;

            C0046a(Runnable runnable, String str, int i5) {
                super(runnable, str);
                this.f5069o = i5;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f5069o);
                super.run();
            }
        }

        a(@o0 String str, int i5) {
            this.f5067a = str;
            this.f5068b = i5;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0046a(runnable, this.f5067a, this.f5068b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RequestExecutor.java */
    static class b implements Executor {

        /* renamed from: o, reason: collision with root package name */
        private final Handler f5070o;

        b(@o0 Handler handler) {
            handler.getClass();
            this.f5070o = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            Handler handler = this.f5070o;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f5070o + " is shutting down");
        }
    }

    /* compiled from: RequestExecutor.java */
    private static class c<T> implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        @o0
        private Callable<T> f5071o;

        /* renamed from: p, reason: collision with root package name */
        @o0
        private androidx.core.util.c<T> f5072p;

        /* renamed from: q, reason: collision with root package name */
        @o0
        private Handler f5073q;

        /* compiled from: RequestExecutor.java */
        class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.c f5074o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Object f5075p;

            a(androidx.core.util.c cVar, Object obj) {
                this.f5074o = cVar;
                this.f5075p = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f5074o.accept(this.f5075p);
            }
        }

        c(@o0 Handler handler, @o0 Callable<T> callable, @o0 androidx.core.util.c<T> cVar) {
            this.f5071o = callable;
            this.f5072p = cVar;
            this.f5073q = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t5;
            try {
                t5 = this.f5071o.call();
            } catch (Exception unused) {
                t5 = null;
            }
            this.f5073q.post(new a(this.f5072p, t5));
        }
    }

    private i() {
    }

    static ThreadPoolExecutor a(@o0 String str, int i5, @g0(from = 0) int i6) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i6, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i5));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(@o0 Handler handler) {
        return new b(handler);
    }

    static <T> void c(@o0 Executor executor, @o0 Callable<T> callable, @o0 androidx.core.util.c<T> cVar) {
        executor.execute(new c(androidx.core.provider.b.a(), callable, cVar));
    }

    static <T> T d(@o0 ExecutorService executorService, @o0 Callable<T> callable, @g0(from = 0) int i5) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i5, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            throw e6;
        } catch (ExecutionException e7) {
            throw new RuntimeException(e7);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
