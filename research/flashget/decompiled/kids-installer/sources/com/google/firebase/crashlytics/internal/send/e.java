package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.h;
import com.google.android.datatransport.j;
import com.google.android.datatransport.runtime.n;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.c1;
import com.google.firebase.crashlytics.internal.common.i0;
import com.google.firebase.crashlytics.internal.common.w;
import com.google.firebase.crashlytics.internal.g;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ReportQueue.java */
/* loaded from: classes2.dex */
final class e {

    /* renamed from: l, reason: collision with root package name */
    private static final int f16329l = 1000;

    /* renamed from: m, reason: collision with root package name */
    private static final int f16330m = 60000;

    /* renamed from: n, reason: collision with root package name */
    private static final int f16331n = 3600000;

    /* renamed from: o, reason: collision with root package name */
    private static final int f16332o = 2000;

    /* renamed from: a, reason: collision with root package name */
    private final double f16333a;

    /* renamed from: b, reason: collision with root package name */
    private final double f16334b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16335c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16336d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16337e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<Runnable> f16338f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f16339g;

    /* renamed from: h, reason: collision with root package name */
    private final h<f0> f16340h;

    /* renamed from: i, reason: collision with root package name */
    private final i0 f16341i;

    /* renamed from: j, reason: collision with root package name */
    private int f16342j;

    /* renamed from: k, reason: collision with root package name */
    private long f16343k;

    /* compiled from: ReportQueue.java */
    private final class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final w f16344o;

        /* renamed from: p, reason: collision with root package name */
        private final TaskCompletionSource<w> f16345p;

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f16344o, this.f16345p);
            e.this.f16341i.e();
            double g5 = e.this.g();
            g.f().b(ProtectedSandApp.s("ᗋ") + String.format(Locale.US, ProtectedSandApp.s("ᗌ"), Double.valueOf(g5 / 1000.0d)) + ProtectedSandApp.s("ᗍ") + this.f16344o.d());
            try {
                Thread.sleep((long) g5);
            } catch (InterruptedException unused) {
            }
        }

        private b(w wVar, TaskCompletionSource<w> taskCompletionSource) {
            this.f16344o = wVar;
            this.f16345p = taskCompletionSource;
        }
    }

    e(h<f0> hVar, com.google.firebase.crashlytics.internal.settings.d dVar, i0 i0Var) {
        this(dVar.f16373f, dVar.f16374g, dVar.f16375h * 1000, hVar, i0Var);
    }

    static void f(double d6) {
        try {
            Thread.sleep((long) d6);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, Math.pow(this.f16334b, h()) * (60000.0d / this.f16333a));
    }

    private int h() {
        if (this.f16343k == 0) {
            this.f16343k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f16343k) / this.f16335c);
        int min = l() ? Math.min(100, this.f16342j + currentTimeMillis) : Math.max(0, this.f16342j - currentTimeMillis);
        if (this.f16342j != min) {
            this.f16342j = min;
            this.f16343k = System.currentTimeMillis();
        }
        return min;
    }

    private boolean k() {
        return this.f16338f.size() < this.f16337e;
    }

    private boolean l() {
        return this.f16338f.size() == this.f16337e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            n.a(this.f16340h, com.google.android.datatransport.e.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(TaskCompletionSource taskCompletionSource, boolean z5, w wVar, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z5) {
            j();
        }
        taskCompletionSource.trySetResult(wVar);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final w wVar, final TaskCompletionSource<w> taskCompletionSource) {
        g.f().b(ProtectedSandApp.s("ᗎ") + wVar.d());
        final boolean z5 = SystemClock.elapsedRealtime() - this.f16336d < 2000;
        this.f16340h.b(com.google.android.datatransport.d.i(wVar.b()), new j() { // from class: com.google.firebase.crashlytics.internal.send.c
            @Override // com.google.android.datatransport.j
            public final void a(Exception exc) {
                e.this.n(taskCompletionSource, z5, wVar, exc);
            }
        });
    }

    private static void q(double d6) {
        try {
            Thread.sleep((long) d6);
        } catch (InterruptedException unused) {
        }
    }

    TaskCompletionSource<w> i(w wVar, boolean z5) {
        String s5 = ProtectedSandApp.s("ᗏ");
        String s6 = ProtectedSandApp.s("ᗐ");
        String s7 = ProtectedSandApp.s("ᗑ");
        String s8 = ProtectedSandApp.s("ᗒ");
        synchronized (this.f16338f) {
            TaskCompletionSource<w> taskCompletionSource = new TaskCompletionSource<>();
            if (!z5) {
                p(wVar, taskCompletionSource);
                return taskCompletionSource;
            }
            this.f16341i.d();
            if (!k()) {
                h();
                g.f().b(s7 + wVar.d());
                this.f16341i.c();
                taskCompletionSource.trySetResult(wVar);
                return taskCompletionSource;
            }
            g.f().b(s8 + wVar.d());
            g.f().b(s6 + this.f16338f.size());
            this.f16339g.execute(new b(wVar, taskCompletionSource));
            g.f().b(s5 + wVar.d());
            taskCompletionSource.trySetResult(wVar);
            return taskCompletionSource;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        c1.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    e(double d6, double d7, long j5, h<f0> hVar, i0 i0Var) {
        this.f16333a = d6;
        this.f16334b = d7;
        this.f16335c = j5;
        this.f16340h = hVar;
        this.f16341i = i0Var;
        this.f16336d = SystemClock.elapsedRealtime();
        int i5 = (int) d6;
        this.f16337e = i5;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i5);
        this.f16338f = arrayBlockingQueue;
        this.f16339g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f16342j = 0;
        this.f16343k = 0L;
    }
}
