package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes3.dex */
public class k implements e {

    /* renamed from: k, reason: collision with root package name */
    private static final String f43888k = ProtectedSandApp.s("ࢬ");

    /* renamed from: l, reason: collision with root package name */
    private static final Bitmap.Config f43889l = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final l f43890a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f43891b;

    /* renamed from: c, reason: collision with root package name */
    private final long f43892c;

    /* renamed from: d, reason: collision with root package name */
    private final a f43893d;

    /* renamed from: e, reason: collision with root package name */
    private long f43894e;

    /* renamed from: f, reason: collision with root package name */
    private long f43895f;

    /* renamed from: g, reason: collision with root package name */
    private int f43896g;

    /* renamed from: h, reason: collision with root package name */
    private int f43897h;

    /* renamed from: i, reason: collision with root package name */
    private int f43898i;

    /* renamed from: j, reason: collision with root package name */
    private int f43899j;

    /* compiled from: LruBitmapPool.java */
    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool.java */
    private static final class b implements a {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
        }
    }

    /* compiled from: LruBitmapPool.java */
    private static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Bitmap> f43900a = Collections.synchronizedSet(new HashSet());

        private c() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
            if (!this.f43900a.contains(bitmap)) {
                throw new IllegalStateException(ProtectedSandApp.s("ࢧ"));
            }
            this.f43900a.remove(bitmap);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
            if (!this.f43900a.contains(bitmap)) {
                this.f43900a.add(bitmap);
                return;
            }
            throw new IllegalStateException(ProtectedSandApp.s("ࢨ") + bitmap + ProtectedSandApp.s("ࢩ") + bitmap.getWidth() + ProtectedSandApp.s("ࢪ") + bitmap.getHeight() + ProtectedSandApp.s("ࢫ"));
        }
    }

    k(long j4, l lVar, Set<Bitmap.Config> set) {
        this.f43892c = j4;
        this.f43894e = j4;
        this.f43890a = lVar;
        this.f43891b = set;
        this.f43893d = new b();
    }

    @TargetApi(26)
    private static void h(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        config2 = Bitmap.Config.HARDWARE;
        if (config != config2) {
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ࢭ") + config + ProtectedSandApp.s("ࢮ"));
    }

    @o0
    private static Bitmap i(int i4, int i5, @q0 Bitmap.Config config) {
        if (config == null) {
            config = f43889l;
        }
        return Bitmap.createBitmap(i4, i5, config);
    }

    private void j() {
        if (Log.isLoggable(ProtectedSandApp.s("ࢬ"), 2)) {
            k();
        }
    }

    private void k() {
        Objects.toString(this.f43890a);
    }

    private void l() {
        v(this.f43894e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> o() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i4 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i4 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l p() {
        return new o();
    }

    @q0
    private synchronized Bitmap q(int i4, int i5, @q0 Bitmap.Config config) {
        Bitmap f4;
        try {
            h(config);
            f4 = this.f43890a.f(i4, i5, config != null ? config : f43889l);
            if (f4 == null) {
                if (Log.isLoggable(ProtectedSandApp.s("ࢬ"), 3)) {
                    this.f43890a.b(i4, i5, config);
                }
                this.f43897h++;
            } else {
                this.f43896g++;
                this.f43895f -= this.f43890a.c(f4);
                this.f43893d.a(f4);
                u(f4);
            }
            if (Log.isLoggable(ProtectedSandApp.s("ࢬ"), 2)) {
                this.f43890a.b(i4, i5, config);
            }
            j();
        } catch (Throwable th) {
            throw th;
        }
        return f4;
    }

    @TargetApi(19)
    private static void s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        bitmap.setPremultiplied(true);
    }

    private synchronized void v(long j4) {
        while (this.f43895f > j4) {
            try {
                Bitmap removeLast = this.f43890a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable(ProtectedSandApp.s("ࢬ"), 5)) {
                        k();
                    }
                    this.f43895f = 0L;
                    return;
                } else {
                    this.f43893d.a(removeLast);
                    this.f43895f -= this.f43890a.c(removeLast);
                    this.f43899j++;
                    if (Log.isLoggable(ProtectedSandApp.s("ࢬ"), 3)) {
                        this.f43890a.a(removeLast);
                    }
                    j();
                    removeLast.recycle();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long a() {
        return this.f43894e;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @SuppressLint({"InlinedApi"})
    public void b(int i4) {
        Log.isLoggable(ProtectedSandApp.s("ࢬ"), 3);
        if (i4 >= 40 || i4 >= 20) {
            c();
        } else if (i4 >= 20 || i4 == 15) {
            v(a() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void c() {
        Log.isLoggable(ProtectedSandApp.s("ࢬ"), 3);
        v(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void d(float f4) {
        this.f43894e = Math.round(this.f43892c * f4);
        l();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void e(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException(ProtectedSandApp.s("ࢰ"));
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException(ProtectedSandApp.s("ࢯ"));
            }
            if (bitmap.isMutable() && this.f43890a.c(bitmap) <= this.f43894e && this.f43891b.contains(bitmap.getConfig())) {
                int c5 = this.f43890a.c(bitmap);
                this.f43890a.e(bitmap);
                this.f43893d.b(bitmap);
                this.f43898i++;
                this.f43895f += c5;
                if (Log.isLoggable(ProtectedSandApp.s("ࢬ"), 2)) {
                    this.f43890a.a(bitmap);
                }
                j();
                l();
                return;
            }
            if (Log.isLoggable(ProtectedSandApp.s("ࢬ"), 2)) {
                this.f43890a.a(bitmap);
                bitmap.isMutable();
                this.f43891b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @o0
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        Bitmap q4 = q(i4, i5, config);
        if (q4 == null) {
            return i(i4, i5, config);
        }
        q4.eraseColor(0);
        return q4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @o0
    public Bitmap g(int i4, int i5, Bitmap.Config config) {
        Bitmap q4 = q(i4, i5, config);
        return q4 == null ? i(i4, i5, config) : q4;
    }

    public long m() {
        return this.f43899j;
    }

    public long n() {
        return this.f43895f;
    }

    public long r() {
        return this.f43896g;
    }

    public long t() {
        return this.f43897h;
    }

    public k(long j4) {
        this(j4, new o(), o());
    }

    public k(long j4, Set<Bitmap.Config> set) {
        this(j4, new o(), set);
    }
}
