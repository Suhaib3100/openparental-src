package androidx.work.impl.utils;

import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class w {

    /* renamed from: f, reason: collision with root package name */
    private static final String f36555f = androidx.work.s.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f36556a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f36557b;

    /* renamed from: c, reason: collision with root package name */
    final Map<String, c> f36558c;

    /* renamed from: d, reason: collision with root package name */
    final Map<String, b> f36559d;

    /* renamed from: e, reason: collision with root package name */
    final Object f36560e;

    /* compiled from: WorkTimer.java */
    class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        private int f36561b = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@o0 Runnable r4) {
            Thread newThread = Executors.defaultThreadFactory().newThread(r4);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f36561b);
            this.f36561b = this.f36561b + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    @c1({c1.a.LIBRARY_GROUP})
    public interface b {
        void a(@o0 String workSpecId);
    }

    /* compiled from: WorkTimer.java */
    @c1({c1.a.LIBRARY_GROUP})
    public static class c implements Runnable {

        /* renamed from: d, reason: collision with root package name */
        static final String f36563d = "WrkTimerRunnable";

        /* renamed from: b, reason: collision with root package name */
        private final w f36564b;

        /* renamed from: c, reason: collision with root package name */
        private final String f36565c;

        c(@o0 w workTimer, @o0 String workSpecId) {
            this.f36564b = workTimer;
            this.f36565c = workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f36564b.f36560e) {
                try {
                    if (this.f36564b.f36558c.remove(this.f36565c) != null) {
                        b remove = this.f36564b.f36559d.remove(this.f36565c);
                        if (remove != null) {
                            remove.a(this.f36565c);
                        }
                    } else {
                        androidx.work.s.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f36565c), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public w() {
        a aVar = new a();
        this.f36556a = aVar;
        this.f36558c = new HashMap();
        this.f36559d = new HashMap();
        this.f36560e = new Object();
        this.f36557b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    @o0
    @m1
    public ScheduledExecutorService a() {
        return this.f36557b;
    }

    @o0
    @m1
    public synchronized Map<String, b> b() {
        return this.f36559d;
    }

    @o0
    @m1
    public synchronized Map<String, c> c() {
        return this.f36558c;
    }

    public void d() {
        if (this.f36557b.isShutdown()) {
            return;
        }
        this.f36557b.shutdownNow();
    }

    public void e(@o0 final String workSpecId, long processingTimeMillis, @o0 b listener) {
        synchronized (this.f36560e) {
            androidx.work.s.c().a(f36555f, String.format("Starting timer for %s", workSpecId), new Throwable[0]);
            f(workSpecId);
            c cVar = new c(this, workSpecId);
            this.f36558c.put(workSpecId, cVar);
            this.f36559d.put(workSpecId, listener);
            this.f36557b.schedule(cVar, processingTimeMillis, TimeUnit.MILLISECONDS);
        }
    }

    public void f(@o0 final String workSpecId) {
        synchronized (this.f36560e) {
            try {
                if (this.f36558c.remove(workSpecId) != null) {
                    androidx.work.s.c().a(f36555f, String.format("Stopping timer for %s", workSpecId), new Throwable[0]);
                    this.f36559d.remove(workSpecId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
