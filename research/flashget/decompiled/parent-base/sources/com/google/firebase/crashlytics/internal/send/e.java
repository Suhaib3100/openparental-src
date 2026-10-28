package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.f;
import com.google.android.datatransport.h;
import com.google.android.datatransport.l;
import com.google.android.datatransport.runtime.n;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.f0;
import com.google.firebase.crashlytics.internal.common.i1;
import com.google.firebase.crashlytics.internal.common.s0;
import com.google.firebase.crashlytics.internal.g;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ReportQueue.java */
/* loaded from: classes6.dex */
final class e {

    /* renamed from: l, reason: collision with root package name */
    private static final int f59455l = 1000;

    /* renamed from: m, reason: collision with root package name */
    private static final int f59456m = 60000;

    /* renamed from: n, reason: collision with root package name */
    private static final int f59457n = 3600000;

    /* renamed from: o, reason: collision with root package name */
    private static final int f59458o = 2000;

    /* renamed from: a, reason: collision with root package name */
    private final double f59459a;

    /* renamed from: b, reason: collision with root package name */
    private final double f59460b;

    /* renamed from: c, reason: collision with root package name */
    private final long f59461c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59462d;

    /* renamed from: e, reason: collision with root package name */
    private final int f59463e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<Runnable> f59464f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f59465g;

    /* renamed from: h, reason: collision with root package name */
    private final l<g0> f59466h;

    /* renamed from: i, reason: collision with root package name */
    private final s0 f59467i;

    /* renamed from: j, reason: collision with root package name */
    private int f59468j;

    /* renamed from: k, reason: collision with root package name */
    private long f59469k;

    /* compiled from: ReportQueue.java */
    private final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final f0 f59470b;

        /* renamed from: c, reason: collision with root package name */
        private final TaskCompletionSource<f0> f59471c;

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f59470b, this.f59471c);
            e.this.f59467i.e();
            double g4 = e.this.g();
            g.f().b(ProtectedSandApp.s("ﾡ") + String.format(Locale.US, ProtectedSandApp.s("ﾢ"), Double.valueOf(g4 / 1000.0d)) + ProtectedSandApp.s("ﾣ") + this.f59470b.d());
            e.q(g4);
        }

        private b(f0 f0Var, TaskCompletionSource<f0> taskCompletionSource) {
            this.f59470b = f0Var;
            this.f59471c = taskCompletionSource;
        }
    }

    e(l<g0> lVar, com.google.firebase.crashlytics.internal.settings.d dVar, s0 s0Var) {
        this(dVar.f59499f, dVar.f59500g, dVar.f59501h * 1000, lVar, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, Math.pow(this.f59460b, h()) * (60000.0d / this.f59459a));
    }

    private int h() {
        if (this.f59469k == 0) {
            this.f59469k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f59469k) / this.f59461c);
        int min = l() ? Math.min(100, this.f59468j + currentTimeMillis) : Math.max(0, this.f59468j - currentTimeMillis);
        if (this.f59468j != min) {
            this.f59468j = min;
            this.f59469k = System.currentTimeMillis();
        }
        return min;
    }

    private boolean k() {
        return this.f59464f.size() < this.f59463e;
    }

    private boolean l() {
        return this.f59464f.size() == this.f59463e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            n.a(this.f59466h, h.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(TaskCompletionSource taskCompletionSource, boolean z4, f0 f0Var, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z4) {
            j();
        }
        taskCompletionSource.trySetResult(f0Var);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final f0 f0Var, final TaskCompletionSource<f0> taskCompletionSource) {
        g.f().b(ProtectedSandApp.s("ﾤ") + f0Var.d());
        final boolean z4 = SystemClock.elapsedRealtime() - this.f59462d < 2000;
        this.f59466h.a(f.z(f0Var.b()), new com.google.android.datatransport.n() { // from class: com.google.firebase.crashlytics.internal.send.d
            @Override // com.google.android.datatransport.n
            public final void a(Exception exc) {
                e.this.n(taskCompletionSource, z4, f0Var, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d5) {
        try {
            Thread.sleep((long) d5);
        } catch (InterruptedException unused) {
        }
    }

    TaskCompletionSource<f0> i(f0 f0Var, boolean z4) {
        String s4 = ProtectedSandApp.s("ﾥ");
        String s5 = ProtectedSandApp.s("ﾦ");
        String s6 = ProtectedSandApp.s("ﾧ");
        String s7 = ProtectedSandApp.s("ﾨ");
        synchronized (this.f59464f) {
            try {
                TaskCompletionSource<f0> taskCompletionSource = new TaskCompletionSource<>();
                if (!z4) {
                    p(f0Var, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f59467i.d();
                if (!k()) {
                    h();
                    g.f().b(s4 + f0Var.d());
                    this.f59467i.c();
                    taskCompletionSource.trySetResult(f0Var);
                    return taskCompletionSource;
                }
                g.f().b(s7 + f0Var.d());
                g.f().b(s6 + this.f59464f.size());
                this.f59465g.execute(new b(f0Var, taskCompletionSource));
                g.f().b(s5 + f0Var.d());
                taskCompletionSource.trySetResult(f0Var);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.c
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        i1.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    e(double d5, double d6, long j4, l<g0> lVar, s0 s0Var) {
        this.f59459a = d5;
        this.f59460b = d6;
        this.f59461c = j4;
        this.f59466h = lVar;
        this.f59467i = s0Var;
        this.f59462d = SystemClock.elapsedRealtime();
        int i4 = (int) d5;
        this.f59463e = i4;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i4);
        this.f59464f = arrayBlockingQueue;
        this.f59465g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f59468j = 0;
        this.f59469k = 0L;
    }
}
