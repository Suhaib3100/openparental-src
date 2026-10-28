package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.g0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: GlideExecutor.java */
/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: r, reason: collision with root package name */
    private static final int f11284r = 1;

    /* renamed from: w, reason: collision with root package name */
    private static final int f11289w = 4;

    /* renamed from: x, reason: collision with root package name */
    private static volatile int f11290x;

    /* renamed from: o, reason: collision with root package name */
    private final ExecutorService f11291o;

    /* renamed from: p, reason: collision with root package name */
    private static final String f11282p = ProtectedSandApp.s("ı");

    /* renamed from: q, reason: collision with root package name */
    private static final String f11283q = ProtectedSandApp.s("Ĳ");

    /* renamed from: s, reason: collision with root package name */
    private static final String f11285s = ProtectedSandApp.s("ĳ");

    /* renamed from: t, reason: collision with root package name */
    private static final String f11286t = ProtectedSandApp.s("Ĵ");

    /* renamed from: u, reason: collision with root package name */
    private static final String f11287u = ProtectedSandApp.s("ĵ");

    /* renamed from: v, reason: collision with root package name */
    private static final long f11288v = TimeUnit.SECONDS.toMillis(10);

    /* compiled from: GlideExecutor.java */
    /* renamed from: com.bumptech.glide.load.engine.executor.a$a, reason: collision with other inner class name */
    public static final class C0139a {

        /* renamed from: g, reason: collision with root package name */
        public static final long f11292g = 0;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f11293a;

        /* renamed from: b, reason: collision with root package name */
        private int f11294b;

        /* renamed from: c, reason: collision with root package name */
        private int f11295c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private c f11296d = c.f11308d;

        /* renamed from: e, reason: collision with root package name */
        private String f11297e;

        /* renamed from: f, reason: collision with root package name */
        private long f11298f;

        C0139a(boolean z5) {
            this.f11293a = z5;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f11297e)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("Į") + this.f11297e);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f11294b, this.f11295c, this.f11298f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f11297e, this.f11296d, this.f11293a));
            if (this.f11298f != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public C0139a b(String str) {
            this.f11297e = str;
            return this;
        }

        public C0139a c(@g0(from = 1) int i5) {
            this.f11294b = i5;
            this.f11295c = i5;
            return this;
        }

        public C0139a d(long j5) {
            this.f11298f = j5;
            return this;
        }

        public C0139a e(@o0 c cVar) {
            this.f11296d = cVar;
            return this;
        }
    }

    /* compiled from: GlideExecutor.java */
    private static final class b implements ThreadFactory {

        /* renamed from: e, reason: collision with root package name */
        private static final int f11299e = 9;

        /* renamed from: a, reason: collision with root package name */
        private final String f11300a;

        /* renamed from: b, reason: collision with root package name */
        final c f11301b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f11302c;

        /* renamed from: d, reason: collision with root package name */
        private int f11303d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$b$a, reason: collision with other inner class name */
        class C0140a extends Thread {
            C0140a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f11302c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.f11301b.a(th);
                }
            }
        }

        b(String str, c cVar, boolean z5) {
            this.f11300a = str;
            this.f11301b = cVar;
            this.f11302c = z5;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(@o0 Runnable runnable) {
            C0140a c0140a;
            String s5 = ProtectedSandApp.s("į");
            synchronized (this) {
                c0140a = new C0140a(runnable, s5 + this.f11300a + ProtectedSandApp.s("İ") + this.f11303d);
                this.f11303d = this.f11303d + 1;
            }
            return c0140a;
        }
    }

    /* compiled from: GlideExecutor.java */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11305a = new C0141a();

        /* renamed from: b, reason: collision with root package name */
        public static final c f11306b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f11307c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f11308d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0141a implements c {
            C0141a() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor.java */
        /* loaded from: classes3.dex */
        class b implements c {
            b() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(Throwable th) {
                if (th != null) {
                    Log.isLoggable(ProtectedSandApp.s("᳔"), 6);
                }
            }
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$c, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0142c implements c {
            C0142c() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.c
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException(ProtectedSandApp.s("᳕"), th);
                }
            }
        }

        static {
            b bVar = new b();
            f11306b = bVar;
            f11307c = new C0142c();
            f11308d = bVar;
        }

        void a(Throwable th);
    }

    @m1
    a(ExecutorService executorService) {
        this.f11291o = executorService;
    }

    public static int a() {
        if (f11290x == 0) {
            f11290x = Math.min(4, com.bumptech.glide.load.engine.executor.b.a());
        }
        return f11290x;
    }

    public static C0139a b() {
        return new C0139a(true).c(a() >= 4 ? 2 : 1).b(ProtectedSandApp.s("Ķ"));
    }

    public static a c() {
        return b().a();
    }

    @Deprecated
    public static a d(int i5, c cVar) {
        return b().c(i5).e(cVar).a();
    }

    public static C0139a e() {
        return new C0139a(true).c(1).b(ProtectedSandApp.s("ķ"));
    }

    public static a f() {
        return e().a();
    }

    @Deprecated
    public static a g(int i5, String str, c cVar) {
        return e().c(i5).b(str).e(cVar).a();
    }

    @Deprecated
    public static a h(c cVar) {
        return e().e(cVar).a();
    }

    public static C0139a i() {
        return new C0139a(false).c(a()).b(ProtectedSandApp.s("ĸ"));
    }

    public static a j() {
        return i().a();
    }

    @Deprecated
    public static a k(int i5, String str, c cVar) {
        return i().c(i5).b(str).e(cVar).a();
    }

    @Deprecated
    public static a m(c cVar) {
        return i().e(cVar).a();
    }

    public static a n() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f11288v, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b(ProtectedSandApp.s("Ĺ"), c.f11308d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j5, @o0 TimeUnit timeUnit) throws InterruptedException {
        return this.f11291o.awaitTermination(j5, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@o0 Runnable runnable) {
        this.f11291o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public <T> List<Future<T>> invokeAll(@o0 Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f11291o.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public <T> T invokeAny(@o0 Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f11291o.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f11291o.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f11291o.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f11291o.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public List<Runnable> shutdownNow() {
        return this.f11291o.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public Future<?> submit(@o0 Runnable runnable) {
        return this.f11291o.submit(runnable);
    }

    public String toString() {
        return this.f11291o.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public <T> List<Future<T>> invokeAll(@o0 Collection<? extends Callable<T>> collection, long j5, @o0 TimeUnit timeUnit) throws InterruptedException {
        return this.f11291o.invokeAll(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@o0 Collection<? extends Callable<T>> collection, long j5, @o0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f11291o.invokeAny(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public <T> Future<T> submit(@o0 Runnable runnable, T t5) {
        return this.f11291o.submit(runnable, t5);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@o0 Callable<T> callable) {
        return this.f11291o.submit(callable);
    }
}
