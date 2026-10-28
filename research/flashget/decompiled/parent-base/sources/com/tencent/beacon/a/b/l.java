package com.tencent.beacon.a.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BeaconAsyncTask.java */
/* loaded from: classes6.dex */
public class l extends b {

    /* renamed from: d, reason: collision with root package name */
    private static final int f71052d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f71053e;

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f71054f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f71055g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseArray<a> f71056h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseArray<Handler> f71057i;

    /* renamed from: j, reason: collision with root package name */
    private final m f71058j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f71059k;

    /* compiled from: BeaconAsyncTask.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f71060a;

        /* renamed from: b, reason: collision with root package name */
        private final long f71061b;

        /* renamed from: c, reason: collision with root package name */
        private final long f71062c;

        /* renamed from: d, reason: collision with root package name */
        private final TimeUnit f71063d;

        /* renamed from: e, reason: collision with root package name */
        private Future<?> f71064e;

        a(Future<?> future, Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
            this.f71064e = future;
            this.f71060a = runnable;
            this.f71061b = j4;
            this.f71062c = j5;
            this.f71063d = timeUnit;
        }

        boolean a(boolean z4) {
            return this.f71064e.cancel(z4);
        }

        boolean a() {
            return this.f71064e.isCancelled();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f71052d = availableProcessors;
        f71053e = Math.max(2, Math.min(availableProcessors - 1, 3));
        f71054f = new AtomicInteger(0);
    }

    protected l() {
        this(null);
    }

    private Runnable b(Runnable runnable) {
        return new k(this, runnable);
    }

    private boolean d() {
        if (!this.f71059k) {
            return false;
        }
        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〢\u0001"), new Object[0]);
        return true;
    }

    @Override // com.tencent.beacon.a.b.b
    public synchronized void a(@o0 Runnable runnable) {
        if (d()) {
            return;
        }
        this.f71055g.execute(b(runnable));
    }

    protected l(ScheduledExecutorService scheduledExecutorService) {
        this.f71059k = false;
        m mVar = new m();
        this.f71058j = mVar;
        this.f71055g = scheduledExecutorService == null ? Executors.newScheduledThreadPool(f71053e, mVar) : scheduledExecutorService;
        this.f71056h = new SparseArray<>();
        this.f71057i = new SparseArray<>();
    }

    @Override // com.tencent.beacon.a.b.b
    public synchronized void a(long j4, @o0 Runnable runnable) {
        if (d()) {
            return;
        }
        Runnable b5 = b(runnable);
        if (j4 <= 0) {
            j4 = 0;
        }
        this.f71055g.schedule(b5, j4, TimeUnit.MILLISECONDS);
    }

    @Override // com.tencent.beacon.a.b.b
    public synchronized void a(int i4, long j4, long j5, @o0 Runnable runnable) {
        if (d()) {
            return;
        }
        a aVar = this.f71056h.get(i4);
        if (aVar == null || aVar.a()) {
            Runnable b5 = b(runnable);
            if (j4 <= 0) {
                j4 = 0;
            }
            if (j5 < 100) {
                j5 = 100;
            }
            ScheduledExecutorService scheduledExecutorService = this.f71055g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a aVar2 = new a(scheduledExecutorService.scheduleAtFixedRate(b5, j4, j5, timeUnit), b5, j4, j5, timeUnit);
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〣\u0001"), Integer.valueOf(i4), Long.valueOf(j5));
            this.f71056h.put(i4, aVar2);
        }
    }

    @Override // com.tencent.beacon.a.b.b
    public void a(int i4, boolean z4, int i5) {
        a aVar = this.f71056h.get(i4);
        if (aVar != null && !aVar.a()) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〤\u0001"), new Object[0]);
            aVar.a(z4);
        }
        this.f71024b = i5;
    }

    @Override // com.tencent.beacon.a.b.b
    public synchronized void a(boolean z4, int i4) {
        try {
            if (d()) {
                return;
            }
            for (int i5 = 0; i5 < this.f71056h.size(); i5++) {
                a(this.f71056h.keyAt(i5), z4, i4);
            }
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〦\u0001"), new Object[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tencent.beacon.a.b.b
    public synchronized void a(long j4, int i4) {
        try {
            if (i4 < this.f71024b) {
                return;
            }
            if (d()) {
                return;
            }
            for (int i5 = 0; i5 < this.f71056h.size(); i5++) {
                a(this.f71056h.keyAt(i5), j4, i4);
            }
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〥\u0001"), new Object[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tencent.beacon.a.b.b
    public synchronized void a(int i4, long j4, int i5) {
        try {
            if (i5 < this.f71024b) {
                return;
            }
            a aVar = this.f71056h.get(i4);
            if (aVar != null) {
                if (!aVar.a()) {
                    return;
                } else {
                    aVar.f71064e = this.f71055g.scheduleAtFixedRate(aVar.f71060a, j4, aVar.f71062c, aVar.f71063d);
                }
            }
            this.f71024b = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tencent.beacon.a.b.b
    public synchronized Handler a(int i4) {
        Handler handler;
        try {
            handler = this.f71057i.get(i4);
            if (handler == null) {
                HandlerThread handlerThread = new HandlerThread(this.f71058j.a());
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
            }
            this.f71057i.put(i4, handler);
        } catch (Throwable th) {
            throw th;
        }
        return handler;
    }
}
