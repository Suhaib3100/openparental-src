package com.google.firebase.messaging.threads;

import android.annotation.SuppressLint;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import f9.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PoolableExecutors.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.messaging.threads.a f60324a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.google.firebase.messaging.threads.a f60325b;

    /* compiled from: PoolableExecutors.java */
    /* renamed from: com.google.firebase.messaging.threads.b$b, reason: collision with other inner class name */
    private static class C0929b implements com.google.firebase.messaging.threads.a {

        /* renamed from: a, reason: collision with root package name */
        private static final long f60326a = 60;

        private C0929b() {
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService a(c cVar) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService b(int i4, ThreadFactory threadFactory, c cVar) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i4, threadFactory));
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        public ExecutorService c(c cVar) {
            return h(1, cVar);
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public Future<?> d(@d String str, @d String str2, c cVar, Runnable runnable) {
            FutureTask futureTask = new FutureTask(runnable, null);
            new Thread(futureTask, str2).start();
            return futureTask;
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public void e(@d String str, @d String str2, c cVar, Runnable runnable) {
            new Thread(runnable, str2).start();
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService f(int i4, c cVar) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i4));
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService g(int i4, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i4, i4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        public ExecutorService h(int i4, c cVar) {
            return g(i4, Executors.defaultThreadFactory(), cVar);
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        public ExecutorService i(ThreadFactory threadFactory, c cVar) {
            return g(1, threadFactory, cVar);
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService j(ThreadFactory threadFactory, c cVar) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
        }

        C0929b(a aVar) {
        }
    }

    static {
        C0929b c0929b = new C0929b();
        f60324a = c0929b;
        f60325b = c0929b;
    }

    private b() {
    }

    public static com.google.firebase.messaging.threads.a a() {
        return f60325b;
    }

    static void b(com.google.firebase.messaging.threads.a aVar) {
        if (f60325b != f60324a) {
            throw new IllegalStateException(ProtectedSandApp.s("̀\u0001"));
        }
        f60325b = aVar;
    }
}
