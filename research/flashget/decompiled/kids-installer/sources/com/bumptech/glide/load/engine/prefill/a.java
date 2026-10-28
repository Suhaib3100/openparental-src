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
import com.bumptech.glide.load.resource.bitmap.g;
import com.bumptech.glide.util.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: BitmapPreFillRunner.java */
/* loaded from: classes.dex */
final class a implements Runnable {
    static final int A = 4;

    /* renamed from: y, reason: collision with root package name */
    static final long f11430y = 32;

    /* renamed from: z, reason: collision with root package name */
    static final long f11431z = 40;

    /* renamed from: o, reason: collision with root package name */
    private final e f11432o;

    /* renamed from: p, reason: collision with root package name */
    private final j f11433p;

    /* renamed from: q, reason: collision with root package name */
    private final c f11434q;

    /* renamed from: r, reason: collision with root package name */
    private final C0145a f11435r;

    /* renamed from: s, reason: collision with root package name */
    private final Set<d> f11436s;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f11437t;

    /* renamed from: u, reason: collision with root package name */
    private long f11438u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11439v;

    /* renamed from: w, reason: collision with root package name */
    @m1
    static final String f11428w = ProtectedSandApp.s("œ");

    /* renamed from: x, reason: collision with root package name */
    private static final C0145a f11429x = new C0145a();
    static final long B = TimeUnit.SECONDS.toMillis(1);

    /* compiled from: BitmapPreFillRunner.java */
    @m1
    /* renamed from: com.bumptech.glide.load.engine.prefill.a$a, reason: collision with other inner class name */
    static class C0145a {
        C0145a() {
        }

        long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* compiled from: BitmapPreFillRunner.java */
    /* loaded from: classes3.dex */
    private static final class b implements f {
        b() {
        }

        @Override // com.bumptech.glide.load.f
        public void a(@o0 MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public a(e eVar, j jVar, c cVar) {
        this(eVar, jVar, cVar, f11429x, new Handler(Looper.getMainLooper()));
    }

    private long c() {
        return this.f11433p.e() - this.f11433p.d();
    }

    private long d() {
        long j5 = this.f11438u;
        this.f11438u = Math.min(4 * j5, B);
        return j5;
    }

    private boolean e(long j5) {
        return this.f11435r.a() - j5 >= f11430y;
    }

    @m1
    boolean a() {
        Bitmap createBitmap;
        long a6 = this.f11435r.a();
        while (!this.f11434q.b() && !e(a6)) {
            d c6 = this.f11434q.c();
            if (this.f11436s.contains(c6)) {
                createBitmap = Bitmap.createBitmap(c6.d(), c6.b(), c6.a());
            } else {
                this.f11436s.add(c6);
                createBitmap = this.f11432o.g(c6.d(), c6.b(), c6.a());
            }
            if (c() >= n.h(createBitmap)) {
                this.f11433p.f(new b(), g.e(createBitmap, this.f11432o));
            } else {
                this.f11432o.d(createBitmap);
            }
            if (Log.isLoggable(ProtectedSandApp.s("Ŕ"), 3)) {
                c6.d();
                c6.b();
                Objects.toString(c6.a());
            }
        }
        return (this.f11439v || this.f11434q.b()) ? false : true;
    }

    public void b() {
        this.f11439v = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f11437t.postDelayed(this, d());
        }
    }

    @m1
    a(e eVar, j jVar, c cVar, C0145a c0145a, Handler handler) {
        this.f11436s = new HashSet();
        this.f11438u = f11431z;
        this.f11432o = eVar;
        this.f11433p = jVar;
        this.f11434q = cVar;
        this.f11435r = c0145a;
        this.f11437t = handler;
    }
}
