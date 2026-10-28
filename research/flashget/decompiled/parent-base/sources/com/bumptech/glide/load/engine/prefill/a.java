package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.bitmap.h;
import com.bumptech.glide.util.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: BitmapPreFillRunner.java */
/* loaded from: classes3.dex */
final class a implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    static final long f44168l = 32;

    /* renamed from: m, reason: collision with root package name */
    static final long f44169m = 40;

    /* renamed from: n, reason: collision with root package name */
    static final int f44170n = 4;

    /* renamed from: b, reason: collision with root package name */
    private final e f44172b;

    /* renamed from: c, reason: collision with root package name */
    private final j f44173c;

    /* renamed from: d, reason: collision with root package name */
    private final c f44174d;

    /* renamed from: e, reason: collision with root package name */
    private final C0744a f44175e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<d> f44176f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f44177g;

    /* renamed from: h, reason: collision with root package name */
    private long f44178h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f44179i;

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final String f44166j = ProtectedSandApp.s("ळ");

    /* renamed from: k, reason: collision with root package name */
    private static final C0744a f44167k = new C0744a();

    /* renamed from: o, reason: collision with root package name */
    static final long f44171o = TimeUnit.SECONDS.toMillis(1);

    /* compiled from: BitmapPreFillRunner.java */
    @m1
    /* renamed from: com.bumptech.glide.load.engine.prefill.a$a, reason: collision with other inner class name */
    static class C0744a {
        C0744a() {
        }

        long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* compiled from: BitmapPreFillRunner.java */
    private static final class b implements f {
        b() {
        }

        @Override // com.bumptech.glide.load.f
        public void b(@o0 MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public a(e eVar, j jVar, c cVar) {
        this(eVar, jVar, cVar, f44167k, new Handler(Looper.getMainLooper()));
    }

    private long c() {
        return this.f44173c.a() - this.f44173c.e();
    }

    private long d() {
        long j4 = this.f44178h;
        this.f44178h = Math.min(4 * j4, f44171o);
        return j4;
    }

    private boolean e(long j4) {
        return this.f44175e.a() - j4 >= 32;
    }

    @m1
    boolean a() {
        Bitmap createBitmap;
        long a5 = this.f44175e.a();
        while (!this.f44174d.b() && !e(a5)) {
            d c5 = this.f44174d.c();
            if (this.f44176f.contains(c5)) {
                createBitmap = Bitmap.createBitmap(c5.d(), c5.b(), c5.a());
            } else {
                this.f44176f.add(c5);
                createBitmap = this.f44172b.g(c5.d(), c5.b(), c5.a());
            }
            if (c() >= o.i(createBitmap)) {
                this.f44173c.f(new b(), h.d(createBitmap, this.f44172b));
            } else {
                this.f44172b.e(createBitmap);
            }
            if (Log.isLoggable(ProtectedSandApp.s("ळ"), 3)) {
                c5.d();
                c5.b();
                Objects.toString(c5.a());
            }
        }
        return (this.f44179i || this.f44174d.b()) ? false : true;
    }

    public void b() {
        this.f44179i = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f44177g.postDelayed(this, d());
        }
    }

    @m1
    a(e eVar, j jVar, c cVar, C0744a c0744a, Handler handler) {
        this.f44176f = new HashSet();
        this.f44178h = f44169m;
        this.f44172b = eVar;
        this.f44173c = jVar;
        this.f44174d = cVar;
        this.f44175e = c0744a;
        this.f44177g = handler;
    }
}
