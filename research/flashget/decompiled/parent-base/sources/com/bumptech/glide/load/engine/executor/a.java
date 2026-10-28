package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.g0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GlideExecutor.java */
/* loaded from: classes3.dex */
public final class a implements ExecutorService {

    /* renamed from: e, reason: collision with root package name */
    static final int f43992e = 1;

    /* renamed from: j, reason: collision with root package name */
    private static final int f43997j = 4;

    /* renamed from: k, reason: collision with root package name */
    private static volatile int f43998k;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f43999b;

    /* renamed from: c, reason: collision with root package name */
    static final String f43990c = ProtectedSandApp.s("࣠");

    /* renamed from: d, reason: collision with root package name */
    static final String f43991d = ProtectedSandApp.s("࣡");

    /* renamed from: f, reason: collision with root package name */
    private static final String f43993f = ProtectedSandApp.s("\u08e2");

    /* renamed from: g, reason: collision with root package name */
    private static final String f43994g = ProtectedSandApp.s("ࣣ");

    /* renamed from: h, reason: collision with root package name */
    static final String f43995h = ProtectedSandApp.s("ࣤ");

    /* renamed from: i, reason: collision with root package name */
    private static final long f43996i = TimeUnit.SECONDS.toMillis(10);

    /* compiled from: GlideExecutor.java */
    public static final class b {

        /* renamed from: h, reason: collision with root package name */
        public static final long f44000h = 0;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44001a;

        /* renamed from: b, reason: collision with root package name */
        private int f44002b;

        /* renamed from: c, reason: collision with root package name */
        private int f44003c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private ThreadFactory f44004d = new c();

        /* renamed from: e, reason: collision with root package name */
        @o0
        private e f44005e = e.f44020d;

        /* renamed from: f, reason: collision with root package name */
        private String f44006f;

        /* renamed from: g, reason: collision with root package name */
        private long f44007g;

        b(boolean z4) {
            this.f44001a = z4;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f44006f)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ࣛ") + this.f44006f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f44002b, this.f44003c, this.f44007g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f44004d, this.f44006f, this.f44005e, this.f44001a));
            if (this.f44007g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f44006f = str;
            return this;
        }

        public b c(@g0(from = 1) int i4) {
            this.f44002b = i4;
            this.f44003c = i4;
            return this;
        }

        @Deprecated
        public b d(@o0 ThreadFactory threadFactory) {
            this.f44004d = threadFactory;
            return this;
        }

        public b e(long j4) {
            this.f44007g = j4;
            return this;
        }

        public b f(@o0 e eVar) {
            this.f44005e = eVar;
            return this;
        }
    }

    /* compiled from: GlideExecutor.java */
    private static final class c implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        private static final int f44008b = 9;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$c$a, reason: collision with other inner class name */
        class C0739a extends Thread {
            C0739a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@o0 Runnable runnable) {
            return new C0739a(runnable);
        }

        c(C0738a c0738a) {
        }
    }

    /* compiled from: GlideExecutor.java */
    private static final class d implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        private final ThreadFactory f44010b;

        /* renamed from: c, reason: collision with root package name */
        private final String f44011c;

        /* renamed from: d, reason: collision with root package name */
        final e f44012d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f44013e;

        /* renamed from: f, reason: collision with root package name */
        private final AtomicInteger f44014f = new AtomicInteger();

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$d$a, reason: collision with other inner class name */
        class RunnableC0740a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f44015b;

            RunnableC0740a(Runnable runnable) {
                this.f44015b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f44013e) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f44015b.run();
                } catch (Throwable th) {
                    d.this.f44012d.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z4) {
            this.f44010b = threadFactory;
            this.f44011c = str;
            this.f44012d = eVar;
            this.f44013e = z4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@o0 Runnable runnable) {
            Thread newThread = this.f44010b.newThread(new RunnableC0740a(runnable));
            newThread.setName(ProtectedSandApp.s("ࣜ") + this.f44011c + ProtectedSandApp.s("ࣝ") + this.f44014f.getAndIncrement());
            return newThread;
        }
    }

    /* compiled from: GlideExecutor.java */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f44017a = new C0741a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f44018b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f44019c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f44020d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.executor.a$e$a, reason: collision with other inner class name */
        class C0741a implements e {
            C0741a() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.e
            public void a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor.java */
        class b implements e {
            b() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.e
            public void a(Throwable th) {
                if (th != null) {
                    Log.isLoggable(ProtectedSandApp.s("ࣞ"), 6);
                }
            }
        }

        /* compiled from: GlideExecutor.java */
        class c implements e {
            c() {
            }

            @Override // com.bumptech.glide.load.engine.executor.a.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException(ProtectedSandApp.s("ࣟ"), th);
                }
            }
        }

        static {
            b bVar = new b();
            f44018b = bVar;
            f44019c = new c();
            f44020d = bVar;
        }

        void a(Throwable th);
    }

    @m1
    a(ExecutorService executorService) {
        this.f43999b = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f43998k == 0) {
            f43998k = Math.min(4, com.bumptech.glide.load.engine.executor.b.a());
        }
        return f43998k;
    }

    public static b c() {
        return new b(true).c(a()).b(ProtectedSandApp.s("ࣤ"));
    }

    public static a d() {
        return c().a();
    }

    @Deprecated
    public static a e(int i4, e eVar) {
        return c().c(i4).f(eVar).a();
    }

    public static b f() {
        return new b(true).c(1).b(ProtectedSandApp.s("࣡"));
    }

    public static a g() {
        return f().a();
    }

    @Deprecated
    public static a h(int i4, String str, e eVar) {
        return f().c(i4).b(str).f(eVar).a();
    }

    @Deprecated
    public static a i(e eVar) {
        return f().f(eVar).a();
    }

    public static b k() {
        return new b(false).c(b()).b(ProtectedSandApp.s("࣠"));
    }

    public static a l() {
        return k().a();
    }

    @Deprecated
    public static a m(int i4, String str, e eVar) {
        return k().c(i4).b(str).f(eVar).a();
    }

    @Deprecated
    public static a n(e eVar) {
        return k().f(eVar).a();
    }

    public static a o() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f43996i, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), ProtectedSandApp.s("ࣣ"), e.f44020d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j4, @o0 TimeUnit timeUnit) throws InterruptedException {
        return this.f43999b.awaitTermination(j4, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@o0 Runnable runnable) {
        this.f43999b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public <T> List<Future<T>> invokeAll(@o0 Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f43999b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public <T> T invokeAny(@o0 Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f43999b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f43999b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f43999b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f43999b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public List<Runnable> shutdownNow() {
        return this.f43999b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public Future<?> submit(@o0 Runnable runnable) {
        return this.f43999b.submit(runnable);
    }

    public String toString() {
        return this.f43999b.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public <T> List<Future<T>> invokeAll(@o0 Collection<? extends Callable<T>> collection, long j4, @o0 TimeUnit timeUnit) throws InterruptedException {
        return this.f43999b.invokeAll(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@o0 Collection<? extends Callable<T>> collection, long j4, @o0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f43999b.invokeAny(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @o0
    public <T> Future<T> submit(@o0 Runnable runnable, T t4) {
        return this.f43999b.submit(runnable, t4);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@o0 Callable<T> callable) {
        return this.f43999b.submit(callable);
    }
}
