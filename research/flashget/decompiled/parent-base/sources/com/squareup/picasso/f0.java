package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* compiled from: Stats.java */
/* loaded from: classes6.dex */
class f0 {

    /* renamed from: o, reason: collision with root package name */
    private static final int f70837o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static final int f70838p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f70839q = 2;

    /* renamed from: r, reason: collision with root package name */
    private static final int f70840r = 3;

    /* renamed from: s, reason: collision with root package name */
    private static final int f70841s = 4;

    /* renamed from: t, reason: collision with root package name */
    private static final String f70842t = "Picasso-Stats";

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f70843a;

    /* renamed from: b, reason: collision with root package name */
    final e f70844b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f70845c;

    /* renamed from: d, reason: collision with root package name */
    long f70846d;

    /* renamed from: e, reason: collision with root package name */
    long f70847e;

    /* renamed from: f, reason: collision with root package name */
    long f70848f;

    /* renamed from: g, reason: collision with root package name */
    long f70849g;

    /* renamed from: h, reason: collision with root package name */
    long f70850h;

    /* renamed from: i, reason: collision with root package name */
    long f70851i;

    /* renamed from: j, reason: collision with root package name */
    long f70852j;

    /* renamed from: k, reason: collision with root package name */
    long f70853k;

    /* renamed from: l, reason: collision with root package name */
    int f70854l;

    /* renamed from: m, reason: collision with root package name */
    int f70855m;

    /* renamed from: n, reason: collision with root package name */
    int f70856n;

    /* compiled from: Stats.java */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final f0 f70857a;

        /* compiled from: Stats.java */
        /* renamed from: com.squareup.picasso.f0$a$a, reason: collision with other inner class name */
        class RunnableC0994a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Message f70858b;

            RunnableC0994a(Message message) {
                this.f70858b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f70858b.what);
            }
        }

        a(Looper looper, f0 f0Var) {
            super(looper);
            this.f70857a = f0Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                this.f70857a.j();
                return;
            }
            if (i4 == 1) {
                this.f70857a.k();
                return;
            }
            if (i4 == 2) {
                this.f70857a.h(message.arg1);
                return;
            }
            if (i4 == 3) {
                this.f70857a.i(message.arg1);
            } else if (i4 != 4) {
                w.f70969q.post(new RunnableC0994a(message));
            } else {
                this.f70857a.l((Long) message.obj);
            }
        }
    }

    f0(e eVar) {
        this.f70844b = eVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f70843a = handlerThread;
        handlerThread.start();
        k0.i(handlerThread.getLooper());
        this.f70845c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i4, long j4) {
        return j4 / i4;
    }

    private void m(Bitmap bitmap, int i4) {
        int j4 = k0.j(bitmap);
        Handler handler = this.f70845c;
        handler.sendMessage(handler.obtainMessage(i4, j4, 0));
    }

    g0 a() {
        return new g0(this.f70844b.o(), this.f70844b.size(), this.f70846d, this.f70847e, this.f70848f, this.f70849g, this.f70850h, this.f70851i, this.f70852j, this.f70853k, this.f70854l, this.f70855m, this.f70856n, System.currentTimeMillis());
    }

    void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    void d() {
        this.f70845c.sendEmptyMessage(0);
    }

    void e() {
        this.f70845c.sendEmptyMessage(1);
    }

    void f(long j4) {
        Handler handler = this.f70845c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j4)));
    }

    void h(long j4) {
        int i4 = this.f70855m + 1;
        this.f70855m = i4;
        long j5 = this.f70849g + j4;
        this.f70849g = j5;
        this.f70852j = j5 / i4;
    }

    void i(long j4) {
        this.f70856n++;
        long j5 = this.f70850h + j4;
        this.f70850h = j5;
        this.f70853k = j5 / this.f70855m;
    }

    void j() {
        this.f70846d++;
    }

    void k() {
        this.f70847e++;
    }

    void l(Long l4) {
        this.f70854l++;
        long longValue = l4.longValue() + this.f70848f;
        this.f70848f = longValue;
        this.f70851i = longValue / this.f70854l;
    }

    void n() {
        this.f70843a.quit();
    }
}
