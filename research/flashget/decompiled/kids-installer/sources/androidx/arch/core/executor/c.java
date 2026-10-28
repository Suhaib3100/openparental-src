package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1418a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f1419b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    @q0
    private volatile Handler f1420c;

    /* compiled from: DefaultTaskExecutor.java */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: c, reason: collision with root package name */
        private static final String f1421c = "arch_disk_io_%d";

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f1422a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f1422a.getAndIncrement())));
            return thread;
        }
    }

    private static Handler e(@o0 Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // androidx.arch.core.executor.d
    public void a(Runnable runnable) {
        this.f1419b.execute(runnable);
    }

    @Override // androidx.arch.core.executor.d
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // androidx.arch.core.executor.d
    public void d(Runnable runnable) {
        if (this.f1420c == null) {
            synchronized (this.f1418a) {
                if (this.f1420c == null) {
                    this.f1420c = e(Looper.getMainLooper());
                }
            }
        }
        this.f1420c.post(runnable);
    }
}
