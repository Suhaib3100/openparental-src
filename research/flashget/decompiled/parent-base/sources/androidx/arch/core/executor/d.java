package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2077a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f2078b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    @q0
    private volatile Handler f2079c;

    /* compiled from: DefaultTaskExecutor.java */
    class a implements ThreadFactory {

        /* renamed from: d, reason: collision with root package name */
        private static final String f2080d = "arch_disk_io_";

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f2081b = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f2081b.getAndIncrement());
            return thread;
        }
    }

    /* compiled from: DefaultTaskExecutor.java */
    @x0(28)
    private static class b {
        private b() {
        }

        @o0
        public static Handler a(@o0 Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @o0
    private static Handler e(@o0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // androidx.arch.core.executor.e
    public void a(@o0 Runnable runnable) {
        this.f2078b.execute(runnable);
    }

    @Override // androidx.arch.core.executor.e
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // androidx.arch.core.executor.e
    public void d(@o0 Runnable runnable) {
        if (this.f2079c == null) {
            synchronized (this.f2077a) {
                try {
                    if (this.f2079c == null) {
                        this.f2079c = e(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f2079c.post(runnable);
    }
}
