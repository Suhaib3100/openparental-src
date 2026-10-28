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
/* loaded from: classes3.dex */
abstract class d<Params, Progress, Result> {

    /* renamed from: g, reason: collision with root package name */
    private static final String f30525g = "AsyncTask";

    /* renamed from: h, reason: collision with root package name */
    private static final int f30526h = 5;

    /* renamed from: i, reason: collision with root package name */
    private static final int f30527i = 128;

    /* renamed from: j, reason: collision with root package name */
    private static final int f30528j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final ThreadFactory f30529k;

    /* renamed from: l, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f30530l;

    /* renamed from: m, reason: collision with root package name */
    public static final Executor f30531m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f30532n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f30533o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static f f30534p;

    /* renamed from: q, reason: collision with root package name */
    private static volatile Executor f30535q;

    /* renamed from: b, reason: collision with root package name */
    private final h<Params, Result> f30536b;

    /* renamed from: c, reason: collision with root package name */
    private final FutureTask<Result> f30537c;

    /* renamed from: d, reason: collision with root package name */
    private volatile g f30538d = g.PENDING;

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f30539e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f30540f = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    static class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f30541b = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f30541b.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            d.this.f30540f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f30547a);
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
            } catch (ExecutionException e4) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e4.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: androidx.loader.content.d$d, reason: collision with other inner class name */
    static /* synthetic */ class C0509d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30544a;

        static {
            int[] iArr = new int[g.values().length];
            f30544a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30544a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    private static class e<Data> {

        /* renamed from: a, reason: collision with root package name */
        final d f30545a;

        /* renamed from: b, reason: collision with root package name */
        final Data[] f30546b;

        e(d dVar, Data... dataArr) {
            this.f30545a = dVar;
            this.f30546b = dataArr;
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
            int i4 = message.what;
            if (i4 == 1) {
                eVar.f30545a.f(eVar.f30546b[0]);
            } else {
                if (i4 != 2) {
                    return;
                }
                eVar.f30545a.p(eVar.f30546b);
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
        Params[] f30547a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f30529k = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f30530l = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f30531m = threadPoolExecutor;
        f30535q = threadPoolExecutor;
    }

    d() {
        b bVar = new b();
        this.f30536b = bVar;
        this.f30537c = new c(bVar);
    }

    public static void d(Runnable runnable) {
        f30535q.execute(runnable);
    }

    private static Handler i() {
        f fVar;
        synchronized (d.class) {
            try {
                if (f30534p == null) {
                    f30534p = new f();
                }
                fVar = f30534p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public static void t(Executor executor) {
        f30535q = executor;
    }

    public final boolean a(boolean z4) {
        this.f30539e.set(true);
        return this.f30537c.cancel(z4);
    }

    protected abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Params... paramsArr) {
        return e(f30535q, paramsArr);
    }

    public final d<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.f30538d == g.PENDING) {
            this.f30538d = g.RUNNING;
            o();
            this.f30536b.f30547a = paramsArr;
            executor.execute(this.f30537c);
            return this;
        }
        int i4 = C0509d.f30544a[this.f30538d.ordinal()];
        if (i4 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i4 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void f(Result result) {
        if (this.f30539e.get()) {
            m(result);
        } else {
            n(result);
        }
        this.f30538d = g.FINISHED;
    }

    public final Result g() throws InterruptedException, ExecutionException {
        return this.f30537c.get();
    }

    public final Result h(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f30537c.get(j4, timeUnit);
    }

    public final g j() {
        return this.f30538d;
    }

    public final boolean k() {
        return this.f30539e.get();
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
        if (this.f30540f.get()) {
            return;
        }
        q(result);
    }

    protected final void s(Progress... progressArr) {
        if (this.f30539e.get()) {
            return;
        }
        i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
    }
}
