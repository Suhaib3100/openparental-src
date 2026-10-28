package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes6.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f58743a = 2;

    /* compiled from: ExecutorUtils.java */
    class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f58744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f58745c;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: com.google.firebase.crashlytics.internal.common.k0$a$a, reason: collision with other inner class name */
        class C0896a extends d {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f58746b;

            C0896a(Runnable runnable) {
                this.f58746b = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.d
            public void a() {
                this.f58746b.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f58744b = str;
            this.f58745c = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0896a(runnable));
            newThread.setName(this.f58744b + this.f58745c.getAndIncrement());
            return newThread;
        }
    }

    /* compiled from: ExecutorUtils.java */
    class b extends d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f58748b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ExecutorService f58749c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f58750d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TimeUnit f58751e;

        b(String str, ExecutorService executorService, long j4, TimeUnit timeUnit) {
            this.f58748b = str;
            this.f58749c = executorService;
            this.f58750d = j4;
            this.f58751e = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.d
        public void a() {
            String s4 = ProtectedSandApp.s("ﱗ");
            try {
                com.google.firebase.crashlytics.internal.g.f().b(s4 + this.f58748b);
                this.f58749c.shutdown();
                if (this.f58749c.awaitTermination(this.f58750d, this.f58751e)) {
                    return;
                }
                com.google.firebase.crashlytics.internal.g.f().b(this.f58748b + ProtectedSandApp.s("ﱘ"));
                this.f58749c.shutdownNow();
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.internal.g.f().b(String.format(Locale.US, ProtectedSandApp.s("ﱙ"), this.f58748b));
                this.f58749c.shutdownNow();
            }
        }
    }

    private k0() {
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j4, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j4, timeUnit), androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ﱚ"), str)));
    }

    public static Executor c(Executor executor) {
        return com.google.firebase.concurrent.z.h(executor);
    }

    public static ExecutorService d(String str) {
        ExecutorService g4 = g(f(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, g4);
        return g4;
    }

    public static ScheduledExecutorService e(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(f(str));
        a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    public static ThreadFactory f(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService g(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
