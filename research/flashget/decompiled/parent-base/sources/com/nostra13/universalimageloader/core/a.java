package com.nostra13.universalimageloader.core;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultConfigurationFactory.java */
/* loaded from: classes6.dex */
public class a {

    /* compiled from: DefaultConfigurationFactory.java */
    /* renamed from: com.nostra13.universalimageloader.core.a$a, reason: collision with other inner class name */
    private static class ThreadFactoryC0986a implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private static final AtomicInteger f70253f = new AtomicInteger(1);

        /* renamed from: d, reason: collision with root package name */
        private final String f70256d;

        /* renamed from: e, reason: collision with root package name */
        private final int f70257e;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicInteger f70255c = new AtomicInteger(1);

        /* renamed from: b, reason: collision with root package name */
        private final ThreadGroup f70254b = Thread.currentThread().getThreadGroup();

        ThreadFactoryC0986a(int i4, String str) {
            this.f70257e = i4;
            StringBuilder a5 = j4.a(str);
            a5.append(f70253f.getAndIncrement());
            a5.append(ProtectedSandApp.s("ᨼ\u0001"));
            this.f70256d = a5.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f70254b, runnable, this.f70256d + this.f70255c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(this.f70257e);
            return thread;
        }
    }

    public static com.nostra13.universalimageloader.core.display.a a() {
        return new com.nostra13.universalimageloader.core.display.f();
    }

    public static nb.a b(Context context, ob.a aVar, long j4, int i4) {
        File h4 = h(context);
        if (j4 > 0 || i4 > 0) {
            try {
                return new com.nostra13.universalimageloader.cache.disc.impl.ext.b(com.nostra13.universalimageloader.utils.f.e(context, ProtectedSandApp.s("ᨽ\u0001")), h4, aVar, j4, i4);
            } catch (IOException e4) {
                com.nostra13.universalimageloader.utils.d.d(e4);
            }
        }
        return new com.nostra13.universalimageloader.cache.disc.impl.c(com.nostra13.universalimageloader.utils.f.b(context, true), h4, aVar);
    }

    public static Executor c(int i4, int i5, com.nostra13.universalimageloader.core.assist.g gVar) {
        return new ThreadPoolExecutor(i4, i4, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) (gVar == com.nostra13.universalimageloader.core.assist.g.LIFO ? new com.nostra13.universalimageloader.core.assist.deque.c() : new LinkedBlockingQueue()), new ThreadFactoryC0986a(i5, ProtectedSandApp.s("ᨾ\u0001")));
    }

    public static ob.a d() {
        return new ob.b();
    }

    public static com.nostra13.universalimageloader.core.decode.b e(boolean z4) {
        return new com.nostra13.universalimageloader.core.decode.a(z4);
    }

    public static com.nostra13.universalimageloader.core.download.b f(Context context) {
        return new com.nostra13.universalimageloader.core.download.a(context);
    }

    public static com.nostra13.universalimageloader.cache.memory.c g(Context context, int i4) {
        if (i4 == 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ProtectedSandApp.s("ᨿ\u0001"));
            int memoryClass = activityManager.getMemoryClass();
            if (m(context)) {
                memoryClass = activityManager.getLargeMemoryClass();
            }
            i4 = (memoryClass * 1048576) / 8;
        }
        return new com.nostra13.universalimageloader.cache.memory.impl.f(i4);
    }

    private static File h(Context context) {
        File b5 = com.nostra13.universalimageloader.utils.f.b(context, false);
        File file = new File(b5, ProtectedSandApp.s("ᨽ\u0001"));
        return (file.exists() || file.mkdir()) ? file : b5;
    }

    public static Executor i() {
        return Executors.newCachedThreadPool(new ThreadFactoryC0986a(5, ProtectedSandApp.s("ᩀ\u0001")));
    }

    private static ThreadFactory j(int i4, String str) {
        return new ThreadFactoryC0986a(i4, str);
    }

    @TargetApi(11)
    private static int k(ActivityManager activityManager) {
        return activityManager.getLargeMemoryClass();
    }

    private static boolean l() {
        return true;
    }

    @TargetApi(11)
    private static boolean m(Context context) {
        return (context.getApplicationInfo().flags & 1048576) != 0;
    }
}
