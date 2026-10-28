package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Locale;
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
/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f15553a = 2;

    /* compiled from: ExecutorUtils.java */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15554a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f15555b;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: com.google.firebase.crashlytics.internal.common.b0$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0193a extends d {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Runnable f15556o;

            C0193a(Runnable runnable) {
                this.f15556o = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.d
            public void a() {
                this.f15556o.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f15554a = str;
            this.f15555b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0193a(runnable));
            newThread.setName(this.f15554a + this.f15555b.getAndIncrement());
            return newThread;
        }
    }

    /* compiled from: ExecutorUtils.java */
    /* loaded from: classes3.dex */
    class b extends d {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f15558o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ExecutorService f15559p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f15560q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ TimeUnit f15561r;

        b(String str, ExecutorService executorService, long j5, TimeUnit timeUnit) {
            this.f15558o = str;
            this.f15559p = executorService;
            this.f15560q = j5;
            this.f15561r = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.d
        public void a() {
            String s5 = ProtectedSandApp.s("⠀");
            try {
                com.google.firebase.crashlytics.internal.g.f().b(s5 + this.f15558o);
                this.f15559p.shutdown();
                if (this.f15559p.awaitTermination(this.f15560q, this.f15561r)) {
                    return;
                }
                com.google.firebase.crashlytics.internal.g.f().b(this.f15558o + ProtectedSandApp.s("⠁"));
                this.f15559p.shutdownNow();
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.internal.g.f().b(String.format(Locale.US, ProtectedSandApp.s("⠂"), this.f15558o));
                this.f15559p.shutdownNow();
            }
        }
    }

    private b0() {
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, f15553a, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j5, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j5, timeUnit), androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("Ꮦ"), str)));
    }

    public static ExecutorService c(String str) {
        ExecutorService f6 = f(e(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, f6);
        return f6;
    }

    public static ScheduledExecutorService d(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(e(str));
        a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    public static ThreadFactory e(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService f(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
