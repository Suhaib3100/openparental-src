package org.apache.commons.lang3.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.k1;

/* compiled from: TimedSemaphore.java */
/* loaded from: classes6.dex */
public class s {

    /* renamed from: l, reason: collision with root package name */
    public static final int f85931l = 0;

    /* renamed from: m, reason: collision with root package name */
    private static final int f85932m = 1;

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f85933a;

    /* renamed from: b, reason: collision with root package name */
    private final long f85934b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f85935c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f85936d;

    /* renamed from: e, reason: collision with root package name */
    private ScheduledFuture<?> f85937e;

    /* renamed from: f, reason: collision with root package name */
    private long f85938f;

    /* renamed from: g, reason: collision with root package name */
    private long f85939g;

    /* renamed from: h, reason: collision with root package name */
    private int f85940h;

    /* renamed from: i, reason: collision with root package name */
    private int f85941i;

    /* renamed from: j, reason: collision with root package name */
    private int f85942j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f85943k;

    public s(long j4, TimeUnit timeUnit, int i4) {
        this(null, j4, timeUnit, i4);
    }

    private boolean b() {
        if (i() > 0 && this.f85941i >= i()) {
            return false;
        }
        this.f85941i++;
        return true;
    }

    private void m() {
        if (l()) {
            throw new IllegalStateException("TimedSemaphore is shut down!");
        }
        if (this.f85937e == null) {
            this.f85937e = p();
        }
    }

    public synchronized void a() throws InterruptedException {
        boolean b5;
        m();
        do {
            b5 = b();
            if (!b5) {
                wait();
            }
        } while (!b5);
    }

    synchronized void c() {
        int i4 = this.f85941i;
        this.f85942j = i4;
        this.f85938f += i4;
        this.f85939g++;
        this.f85941i = 0;
        notifyAll();
    }

    public synchronized int d() {
        return this.f85941i;
    }

    public synchronized int e() {
        return i() - d();
    }

    public synchronized double f() {
        long j4;
        j4 = this.f85939g;
        return j4 == 0 ? com.google.firebase.remoteconfig.p.f60679p : this.f85938f / j4;
    }

    protected ScheduledExecutorService g() {
        return this.f85933a;
    }

    public synchronized int h() {
        return this.f85942j;
    }

    public final synchronized int i() {
        return this.f85940h;
    }

    public long j() {
        return this.f85934b;
    }

    public TimeUnit k() {
        return this.f85935c;
    }

    public synchronized boolean l() {
        return this.f85943k;
    }

    public final synchronized void n(int i4) {
        this.f85940h = i4;
    }

    public synchronized void o() {
        try {
            if (!this.f85943k) {
                if (this.f85936d) {
                    g().shutdownNow();
                }
                ScheduledFuture<?> scheduledFuture = this.f85937e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f85943k = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    protected ScheduledFuture<?> p() {
        return g().scheduleAtFixedRate(new Runnable() { // from class: org.apache.commons.lang3.concurrent.r
            @Override // java.lang.Runnable
            public final void run() {
                s.this.c();
            }
        }, j(), j(), k());
    }

    public synchronized boolean q() {
        m();
        return b();
    }

    public s(ScheduledExecutorService scheduledExecutorService, long j4, TimeUnit timeUnit, int i4) {
        k1.r(1L, Long.MAX_VALUE, j4, "Time period must be greater than 0!");
        this.f85934b = j4;
        this.f85935c = timeUnit;
        if (scheduledExecutorService != null) {
            this.f85933a = scheduledExecutorService;
            this.f85936d = false;
        } else {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            scheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            this.f85933a = scheduledThreadPoolExecutor;
            this.f85936d = true;
        }
        n(i4);
    }
}
