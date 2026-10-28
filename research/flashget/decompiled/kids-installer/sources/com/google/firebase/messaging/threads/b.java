package com.google.firebase.messaging.threads;

import android.annotation.SuppressLint;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x1.d;

/* compiled from: PoolableExecutors.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.messaging.threads.a f17623a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.google.firebase.messaging.threads.a f17624b;

    /* compiled from: PoolableExecutors.java */
    /* renamed from: com.google.firebase.messaging.threads.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0224b implements com.google.firebase.messaging.threads.a {

        /* renamed from: a, reason: collision with root package name */
        private static final long f17625a = 60;

        private C0224b() {
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService a(c cVar) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        public ExecutorService b(c cVar) {
            return h(1, cVar);
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public Future<?> c(@d String str, @d String str2, c cVar, Runnable runnable) {
            FutureTask futureTask = new FutureTask(runnable, null);
            new Thread(futureTask, str2).start();
            return futureTask;
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public void d(@d String str, @d String str2, c cVar, Runnable runnable) {
            new Thread(runnable, str2).start();
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService e(int i5, ThreadFactory threadFactory, c cVar) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i5, threadFactory));
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService f(int i5, c cVar) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i5));
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService g(int i5, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i5, i5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @Override // com.google.firebase.messaging.threads.a
        @o0
        public ExecutorService h(int i5, c cVar) {
            return g(i5, Executors.defaultThreadFactory(), cVar);
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

        C0224b(a aVar) {
        }
    }

    static {
        C0224b c0224b = new C0224b(null);
        f17623a = c0224b;
        f17624b = c0224b;
    }

    private b() {
    }

    public static com.google.firebase.messaging.threads.a a() {
        return f17624b;
    }

    static void b(com.google.firebase.messaging.threads.a aVar) {
        if (f17624b != f17623a) {
            throw new IllegalStateException(ProtectedSandApp.s("ᢹ"));
        }
        f17624b = aVar;
    }
}
