package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes3.dex */
public class k implements e {

    /* renamed from: k, reason: collision with root package name */
    private static final String f11180k = ProtectedSandApp.s("Ჩ");

    /* renamed from: l, reason: collision with root package name */
    private static final Bitmap.Config f11181l = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final l f11182a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f11183b;

    /* renamed from: c, reason: collision with root package name */
    private final long f11184c;

    /* renamed from: d, reason: collision with root package name */
    private final a f11185d;

    /* renamed from: e, reason: collision with root package name */
    private long f11186e;

    /* renamed from: f, reason: collision with root package name */
    private long f11187f;

    /* renamed from: g, reason: collision with root package name */
    private int f11188g;

    /* renamed from: h, reason: collision with root package name */
    private int f11189h;

    /* renamed from: i, reason: collision with root package name */
    private int f11190i;

    /* renamed from: j, reason: collision with root package name */
    private int f11191j;

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes.dex */
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
        private final Set<Bitmap> f11192a = Collections.synchronizedSet(new HashSet());

        private c() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
            if (!this.f11192a.contains(bitmap)) {
                throw new IllegalStateException(ProtectedSandApp.s("Ფ"));
            }
            this.f11192a.remove(bitmap);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
            if (!this.f11192a.contains(bitmap)) {
                this.f11192a.add(bitmap);
                return;
            }
            throw new IllegalStateException(ProtectedSandApp.s("Ქ") + bitmap + ProtectedSandApp.s("Ღ") + bitmap.getWidth() + ProtectedSandApp.s("Ყ") + bitmap.getHeight() + ProtectedSandApp.s("Შ"));
        }
    }

    k(long j5, l lVar, Set<Bitmap.Config> set) {
        this.f11184c = j5;
        this.f11186e = j5;
        this.f11182a = lVar;
        this.f11183b = set;
        this.f11185d = new b();
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
        throw new IllegalArgumentException(ProtectedSandApp.s("Ც") + config + ProtectedSandApp.s("Ძ"));
    }

    @o0
    private static Bitmap i(int i5, int i6, @q0 Bitmap.Config config) {
        if (config == null) {
            config = f11181l;
        }
        return Bitmap.createBitmap(i5, i6, config);
    }

    private void j() {
        if (Log.isLoggable(ProtectedSandApp.s("Წ"), 2)) {
            k();
        }
    }

    private void k() {
        Objects.toString(this.f11182a);
    }

    private void l() {
        v(this.f11186e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> o() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i5 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i5 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l p() {
        return new o();
    }

    @q0
    private synchronized Bitmap q(int i5, int i6, @q0 Bitmap.Config config) {
        Bitmap f6;
        h(config);
        f6 = this.f11182a.f(i5, i6, config != null ? config : f11181l);
        if (f6 == null) {
            if (Log.isLoggable(ProtectedSandApp.s("Ჭ"), 3)) {
                this.f11182a.a(i5, i6, config);
            }
            this.f11189h++;
        } else {
            this.f11188g++;
            this.f11187f -= this.f11182a.b(f6);
            this.f11185d.a(f6);
            u(f6);
        }
        if (Log.isLoggable(ProtectedSandApp.s("Ხ"), 2)) {
            this.f11182a.a(i5, i6, config);
        }
        j();
        return f6;
    }

    @TargetApi(19)
    private static void s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        bitmap.setPremultiplied(true);
    }

    private synchronized void v(long j5) {
        while (this.f11187f > j5) {
            Bitmap removeLast = this.f11182a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable(ProtectedSandApp.s("Ჯ"), 5)) {
                    k();
                }
                this.f11187f = 0L;
                return;
            } else {
                this.f11185d.a(removeLast);
                this.f11187f -= this.f11182a.b(removeLast);
                this.f11191j++;
                if (Log.isLoggable(ProtectedSandApp.s("Ჰ"), 3)) {
                    this.f11182a.c(removeLast);
                }
                j();
                removeLast.recycle();
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @SuppressLint({"InlinedApi"})
    public void a(int i5) {
        Log.isLoggable(ProtectedSandApp.s("Ჱ"), 3);
        if (i5 >= 40 || i5 >= 20) {
            b();
        } else if (i5 >= 20 || i5 == 15) {
            v(e() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b() {
        Log.isLoggable(ProtectedSandApp.s("Ჲ"), 3);
        v(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void c(float f6) {
        this.f11186e = Math.round(this.f11184c * f6);
        l();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException(ProtectedSandApp.s("Ჶ"));
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException(ProtectedSandApp.s("Ჵ"));
            }
            if (bitmap.isMutable() && this.f11182a.b(bitmap) <= this.f11186e && this.f11183b.contains(bitmap.getConfig())) {
                int b6 = this.f11182a.b(bitmap);
                this.f11182a.d(bitmap);
                this.f11185d.b(bitmap);
                this.f11190i++;
                this.f11187f += b6;
                if (Log.isLoggable(ProtectedSandApp.s("Ჳ"), 2)) {
                    this.f11182a.c(bitmap);
                }
                j();
                l();
                return;
            }
            if (Log.isLoggable(ProtectedSandApp.s("Ჴ"), 2)) {
                this.f11182a.c(bitmap);
                bitmap.isMutable();
                this.f11183b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long e() {
        return this.f11186e;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @o0
    public Bitmap f(int i5, int i6, Bitmap.Config config) {
        Bitmap q5 = q(i5, i6, config);
        if (q5 == null) {
            return i(i5, i6, config);
        }
        q5.eraseColor(0);
        return q5;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @o0
    public Bitmap g(int i5, int i6, Bitmap.Config config) {
        Bitmap q5 = q(i5, i6, config);
        return q5 == null ? i(i5, i6, config) : q5;
    }

    public long m() {
        return this.f11191j;
    }

    public long n() {
        return this.f11187f;
    }

    public long r() {
        return this.f11188g;
    }

    public long t() {
        return this.f11189h;
    }

    public k(long j5) {
        this(j5, new o(), o());
    }

    public k(long j5, Set<Bitmap.Config> set) {
        this(j5, new o(), set);
    }
}
