package bolts;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AndroidExecutors.java */
/* loaded from: classes3.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f36852b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final int f36853c;

    /* renamed from: d, reason: collision with root package name */
    static final int f36854d;

    /* renamed from: e, reason: collision with root package name */
    static final int f36855e;

    /* renamed from: f, reason: collision with root package name */
    static final long f36856f = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f36857a = new b();

    /* compiled from: AndroidExecutors.java */
    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }

        b(C0656a c0656a) {
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f36853c = availableProcessors;
        f36854d = availableProcessors + 1;
        f36855e = (availableProcessors * 2) + 1;
    }

    private a() {
    }

    @SuppressLint({"NewApi"})
    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z4) {
        threadPoolExecutor.allowCoreThreadTimeOut(z4);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f36854d, f36855e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ExecutorService c(ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f36854d, f36855e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor d() {
        return f36852b.f36857a;
    }
}
