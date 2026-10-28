package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.annotation.c1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ModernAsyncTask.java */
/* loaded from: classes.dex */
abstract class d<Params, Progress, Result> {
    private static final int A = 1;
    private static final int B = 2;
    private static f C = null;
    private static volatile Executor D = null;

    /* renamed from: t, reason: collision with root package name */
    private static final String f8746t = "AsyncTask";

    /* renamed from: u, reason: collision with root package name */
    private static final int f8747u = 5;

    /* renamed from: v, reason: collision with root package name */
    private static final int f8748v = 128;

    /* renamed from: w, reason: collision with root package name */
    private static final int f8749w = 1;

    /* renamed from: x, reason: collision with root package name */
    private static final ThreadFactory f8750x;

    /* renamed from: y, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f8751y;

    /* renamed from: z, reason: collision with root package name */
    public static final Executor f8752z;

    /* renamed from: o, reason: collision with root package name */
    private final h<Params, Result> f8753o;

    /* renamed from: p, reason: collision with root package name */
    private final FutureTask<Result> f8754p;

    /* renamed from: q, reason: collision with root package name */
    private volatile g f8755q = g.PENDING;

    /* renamed from: r, reason: collision with root package name */
    final AtomicBoolean f8756r = new AtomicBoolean();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f8757s = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f8758a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f8758a.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes3.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            d.this.f8757s.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f8764a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.r(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                d.this.r(null);
            } catch (ExecutionException e6) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e6.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: androidx.loader.content.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C0104d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8761a;

        static {
            int[] iArr = new int[g.values().length];
            f8761a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8761a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    private static class e<Data> {

        /* renamed from: a, reason: collision with root package name */
        final d f8762a;

        /* renamed from: b, reason: collision with root package name */
        final Data[] f8763b;

        e(d dVar, Data... dataArr) {
            this.f8762a = dVar;
            this.f8763b = dataArr;
        }
    }

    /* compiled from: ModernAsyncTask.java */
    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i5 = message.what;
            if (i5 == 1) {
                eVar.f8762a.f(eVar.f8763b[0]);
            } else {
                if (i5 != 2) {
                    return;
                }
                eVar.f8762a.p(eVar.f8763b);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask.java */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a, reason: collision with root package name */
        Params[] f8764a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f8750x = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f8751y = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f8752z = threadPoolExecutor;
        D = threadPoolExecutor;
    }

    d() {
        b bVar = new b();
        this.f8753o = bVar;
        this.f8754p = new c(bVar);
    }

    public static void d(Runnable runnable) {
        D.execute(runnable);
    }

    private static Handler i() {
        f fVar;
        synchronized (d.class) {
            if (C == null) {
                C = new f();
            }
            fVar = C;
        }
        return fVar;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public static void t(Executor executor) {
        D = executor;
    }

    public final boolean a(boolean z5) {
        this.f8756r.set(true);
        return this.f8754p.cancel(z5);
    }

    protected abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Params... paramsArr) {
        return e(D, paramsArr);
    }

    public final d<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.f8755q == g.PENDING) {
            this.f8755q = g.RUNNING;
            o();
            this.f8753o.f8764a = paramsArr;
            executor.execute(this.f8754p);
            return this;
        }
        int i5 = C0104d.f8761a[this.f8755q.ordinal()];
        if (i5 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i5 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.f8755q = g.FINISHED;
    }

    public final Result g() throws InterruptedException, ExecutionException {
        return this.f8754p.get();
    }

    public final Result h(long j5, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f8754p.get(j5, timeUnit);
    }

    public final g j() {
        return this.f8755q;
    }

    public final boolean k() {
        return this.f8756r.get();
    }

    protected void l() {
    }

    protected void m(Result result) {
        l();
    }

    protected void n(Result result) {
    }

    protected void o() {
    }

    protected void p(Progress... progressArr) {
    }

    Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void r(Result result) {
        if (this.f8757s.get()) {
            return;
        }
        q(result);
    }

    protected final void s(Progress... progressArr) {
        if (k()) {
            return;
        }
        i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
    }
}
