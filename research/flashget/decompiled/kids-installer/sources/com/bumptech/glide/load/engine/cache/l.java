package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static final String f11251e = ProtectedSandApp.s("ĭ");

    /* renamed from: f, reason: collision with root package name */
    @m1
    static final int f11252f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f11253g = 2;

    /* renamed from: a, reason: collision with root package name */
    private final int f11254a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11255b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f11256c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11257d;

    /* compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        @m1
        static final int f11258i = 2;

        /* renamed from: j, reason: collision with root package name */
        static final int f11259j;

        /* renamed from: k, reason: collision with root package name */
        static final float f11260k = 0.4f;

        /* renamed from: l, reason: collision with root package name */
        static final float f11261l = 0.33f;

        /* renamed from: m, reason: collision with root package name */
        static final int f11262m = 4194304;

        /* renamed from: a, reason: collision with root package name */
        final Context f11263a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f11264b;

        /* renamed from: c, reason: collision with root package name */
        c f11265c;

        /* renamed from: e, reason: collision with root package name */
        float f11267e;

        /* renamed from: d, reason: collision with root package name */
        float f11266d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f11268f = f11260k;

        /* renamed from: g, reason: collision with root package name */
        float f11269g = f11261l;

        /* renamed from: h, reason: collision with root package name */
        int f11270h = 4194304;

        static {
            f11259j = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f11267e = f11259j;
            this.f11263a = context;
            this.f11264b = (ActivityManager) context.getSystemService(ProtectedSandApp.s("ħ"));
            this.f11265c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f11264b.isLowRamDevice()) {
                return;
            }
            this.f11267e = 0.0f;
        }

        public l a() {
            return new l(this);
        }

        @m1
        a b(ActivityManager activityManager) {
            this.f11264b = activityManager;
            return this;
        }

        public a c(int i5) {
            this.f11270h = i5;
            return this;
        }

        public a d(float f6) {
            com.bumptech.glide.util.l.a(f6 >= 0.0f, ProtectedSandApp.s("Ĩ"));
            this.f11267e = f6;
            return this;
        }

        public a e(float f6) {
            com.bumptech.glide.util.l.a(f6 >= 0.0f && f6 <= 1.0f, ProtectedSandApp.s("ĩ"));
            this.f11269g = f6;
            return this;
        }

        public a f(float f6) {
            com.bumptech.glide.util.l.a(f6 >= 0.0f && f6 <= 1.0f, ProtectedSandApp.s("Ī"));
            this.f11268f = f6;
            return this;
        }

        public a g(float f6) {
            com.bumptech.glide.util.l.a(f6 >= 0.0f, ProtectedSandApp.s("ī"));
            this.f11266d = f6;
            return this;
        }

        @m1
        a h(c cVar) {
            this.f11265c = cVar;
            return this;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes3.dex */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f11271a;

        b(DisplayMetrics displayMetrics) {
            this.f11271a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int a() {
            return this.f11271a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int b() {
            return this.f11271a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    interface c {
        int a();

        int b();
    }

    l(a aVar) {
        this.f11256c = aVar.f11263a;
        int i5 = aVar.f11264b.isLowRamDevice() ? aVar.f11270h / 2 : aVar.f11270h;
        this.f11257d = i5;
        int c6 = c(aVar.f11264b, aVar.f11268f, aVar.f11269g);
        float b6 = aVar.f11265c.b() * aVar.f11265c.a() * 4;
        int round = Math.round(aVar.f11267e * b6);
        int round2 = Math.round(b6 * aVar.f11266d);
        int i6 = c6 - i5;
        if (round2 + round <= i6) {
            this.f11255b = round2;
            this.f11254a = round;
        } else {
            float f6 = i6;
            float f7 = aVar.f11267e;
            float f8 = aVar.f11266d;
            float f9 = f6 / (f7 + f8);
            this.f11255b = Math.round(f8 * f9);
            this.f11254a = Math.round(f9 * aVar.f11267e);
        }
        if (Log.isLoggable(ProtectedSandApp.s("Ĭ"), 3)) {
            f(this.f11255b);
            f(this.f11254a);
            f(i5);
            f(c6);
            aVar.f11264b.getMemoryClass();
            aVar.f11264b.isLowRamDevice();
        }
    }

    private static int c(ActivityManager activityManager, float f6, float f7) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (activityManager.isLowRamDevice()) {
            f6 = f7;
        }
        return Math.round(memoryClass * f6);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i5) {
        return Formatter.formatFileSize(this.f11256c, i5);
    }

    public int a() {
        return this.f11257d;
    }

    public int b() {
        return this.f11254a;
    }

    public int d() {
        return this.f11255b;
    }
}
