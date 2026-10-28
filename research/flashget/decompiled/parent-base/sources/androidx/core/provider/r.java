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
/* loaded from: classes3.dex */
class r {

    /* compiled from: RequestExecutor.java */
    private static class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        private String f26630b;

        /* renamed from: c, reason: collision with root package name */
        private int f26631c;

        /* compiled from: RequestExecutor.java */
        /* renamed from: androidx.core.provider.r$a$a, reason: collision with other inner class name */
        private static class C0426a extends Thread {

            /* renamed from: b, reason: collision with root package name */
            private final int f26632b;

            C0426a(Runnable runnable, String str, int i4) {
                super(runnable, str);
                this.f26632b = i4;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f26632b);
                super.run();
            }
        }

        a(@o0 String str, int i4) {
            this.f26630b = str;
            this.f26631c = i4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0426a(runnable, this.f26630b, this.f26631c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RequestExecutor.java */
    static class b implements Executor {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f26633b;

        b(@o0 Handler handler) {
            handler.getClass();
            this.f26633b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@o0 Runnable runnable) {
            Handler handler = this.f26633b;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f26633b + " is shutting down");
        }
    }

    /* compiled from: RequestExecutor.java */
    private static class c<T> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @o0
        private Callable<T> f26634b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private androidx.core.util.e<T> f26635c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private Handler f26636d;

        /* compiled from: RequestExecutor.java */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.e f26637b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f26638c;

            a(androidx.core.util.e eVar, Object obj) {
                this.f26637b = eVar;
                this.f26638c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f26637b.accept(this.f26638c);
            }
        }

        c(@o0 Handler handler, @o0 Callable<T> callable, @o0 androidx.core.util.e<T> eVar) {
            this.f26634b = callable;
            this.f26635c = eVar;
            this.f26636d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t4;
            try {
                t4 = this.f26634b.call();
            } catch (Exception unused) {
                t4 = null;
            }
            this.f26636d.post(new a(this.f26635c, t4));
        }
    }

    private r() {
    }

    static ThreadPoolExecutor a(@o0 String str, int i4, @g0(from = 0) int i5) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(@o0 Handler handler) {
        return new b(handler);
    }

    static <T> void c(@o0 Executor executor, @o0 Callable<T> callable, @o0 androidx.core.util.e<T> eVar) {
        executor.execute(new c(androidx.core.provider.b.a(), callable, eVar));
    }

    static <T> T d(@o0 ExecutorService executorService, @o0 Callable<T> callable, @g0(from = 0) int i4) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i4, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw e4;
        } catch (ExecutionException e5) {
            throw new RuntimeException(e5);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
