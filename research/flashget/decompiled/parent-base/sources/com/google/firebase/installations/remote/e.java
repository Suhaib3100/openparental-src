package com.google.firebase.installations.remote;

import androidx.annotation.b0;
import com.google.firebase.installations.t;
import java.util.concurrent.TimeUnit;

/* compiled from: RequestLimiter.java */
/* loaded from: classes6.dex */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f59828d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f59829e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final t f59830a;

    /* renamed from: b, reason: collision with root package name */
    @b0("this")
    private long f59831b;

    /* renamed from: c, reason: collision with root package name */
    @b0("this")
    private int f59832c;

    e(t tVar) {
        this.f59830a = tVar;
    }

    private synchronized long a(int i4) {
        if (c(i4)) {
            return (long) Math.min(Math.pow(2.0d, this.f59832c) + this.f59830a.e(), f59829e);
        }
        return f59828d;
    }

    private static boolean c(int i4) {
        return i4 == 429 || (i4 >= 500 && i4 < 600);
    }

    private static boolean d(int i4) {
        return (i4 >= 200 && i4 < 300) || i4 == 401 || i4 == 404;
    }

    private synchronized void e() {
        this.f59832c = 0;
    }

    public synchronized boolean b() {
        boolean z4;
        if (this.f59832c != 0) {
            z4 = this.f59830a.a() > this.f59831b;
        }
        return z4;
    }

    public synchronized void f(int i4) {
        if (d(i4)) {
            e();
            return;
        }
        this.f59832c++;
        this.f59831b = this.f59830a.a() + a(i4);
    }

    e() {
        this.f59830a = t.c();
    }
}
