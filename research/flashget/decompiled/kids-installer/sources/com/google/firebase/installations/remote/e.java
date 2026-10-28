package com.google.firebase.installations.remote;

import androidx.annotation.b0;
import com.google.firebase.installations.t;
import java.util.concurrent.TimeUnit;

/* compiled from: RequestLimiter.java */
/* loaded from: classes2.dex */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f16960d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f16961e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final t f16962a;

    /* renamed from: b, reason: collision with root package name */
    @b0("this")
    private long f16963b;

    /* renamed from: c, reason: collision with root package name */
    @b0("this")
    private int f16964c;

    e(t tVar) {
        this.f16962a = tVar;
    }

    private synchronized long a(int i5) {
        if (c(i5)) {
            return (long) Math.min(Math.pow(2.0d, this.f16964c) + this.f16962a.e(), f16961e);
        }
        return f16960d;
    }

    private static boolean c(int i5) {
        return i5 == 429 || (i5 >= 500 && i5 < 600);
    }

    private static boolean d(int i5) {
        return (i5 >= 200 && i5 < 300) || i5 == 401 || i5 == 404;
    }

    private synchronized void e() {
        this.f16964c = 0;
    }

    public synchronized boolean b() {
        boolean z5;
        if (this.f16964c != 0) {
            z5 = this.f16962a.a() > this.f16963b;
        }
        return z5;
    }

    public synchronized void f(int i5) {
        if (d(i5)) {
            e();
            return;
        }
        this.f16964c++;
        this.f16963b = this.f16962a.a() + a(i5);
    }

    e() {
        this.f16962a = t.c();
    }
}
