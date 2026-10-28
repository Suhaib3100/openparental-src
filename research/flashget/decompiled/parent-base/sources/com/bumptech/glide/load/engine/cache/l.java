package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static final String f43959e = ProtectedSandApp.s("ࣕ");

    /* renamed from: f, reason: collision with root package name */
    @m1
    static final int f43960f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f43961g = 2;

    /* renamed from: a, reason: collision with root package name */
    private final int f43962a;

    /* renamed from: b, reason: collision with root package name */
    private final int f43963b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f43964c;

    /* renamed from: d, reason: collision with root package name */
    private final int f43965d;

    /* compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        @m1
        static final int f43966i = 2;

        /* renamed from: j, reason: collision with root package name */
        static final int f43967j;

        /* renamed from: k, reason: collision with root package name */
        static final float f43968k = 0.4f;

        /* renamed from: l, reason: collision with root package name */
        static final float f43969l = 0.33f;

        /* renamed from: m, reason: collision with root package name */
        static final int f43970m = 4194304;

        /* renamed from: a, reason: collision with root package name */
        final Context f43971a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f43972b;

        /* renamed from: c, reason: collision with root package name */
        c f43973c;

        /* renamed from: e, reason: collision with root package name */
        float f43975e;

        /* renamed from: d, reason: collision with root package name */
        float f43974d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f43976f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        float f43977g = f43969l;

        /* renamed from: h, reason: collision with root package name */
        int f43978h = 4194304;

        static {
            f43967j = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f43975e = f43967j;
            this.f43971a = context;
            this.f43972b = (ActivityManager) context.getSystemService(ProtectedSandApp.s("࣐"));
            this.f43973c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f43972b.isLowRamDevice()) {
                return;
            }
            this.f43975e = 0.0f;
        }

        public l a() {
            return new l(this);
        }

        @m1
        a b(ActivityManager activityManager) {
            this.f43972b = activityManager;
            return this;
        }

        public a c(int i4) {
            this.f43978h = i4;
            return this;
        }

        public a d(float f4) {
            com.bumptech.glide.util.m.b(f4 >= 0.0f, ProtectedSandApp.s("࣑"));
            this.f43975e = f4;
            return this;
        }

        public a e(float f4) {
            com.bumptech.glide.util.m.b(f4 >= 0.0f && f4 <= 1.0f, ProtectedSandApp.s("࣒"));
            this.f43977g = f4;
            return this;
        }

        public a f(float f4) {
            com.bumptech.glide.util.m.b(f4 >= 0.0f && f4 <= 1.0f, ProtectedSandApp.s("࣓"));
            this.f43976f = f4;
            return this;
        }

        public a g(float f4) {
            com.bumptech.glide.util.m.b(f4 >= 0.0f, ProtectedSandApp.s("ࣔ"));
            this.f43974d = f4;
            return this;
        }

        @m1
        a h(c cVar) {
            this.f43973c = cVar;
            return this;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f43979a;

        b(DisplayMetrics displayMetrics) {
            this.f43979a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int a() {
            return this.f43979a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int b() {
            return this.f43979a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    interface c {
        int a();

        int b();
    }

    l(a aVar) {
        this.f43964c = aVar.f43971a;
        int i4 = aVar.f43972b.isLowRamDevice() ? aVar.f43978h / 2 : aVar.f43978h;
        this.f43965d = i4;
        int c5 = c(aVar.f43972b, aVar.f43976f, aVar.f43977g);
        float b5 = aVar.f43973c.b() * aVar.f43973c.a() * 4;
        int round = Math.round(aVar.f43975e * b5);
        int round2 = Math.round(b5 * aVar.f43974d);
        int i5 = c5 - i4;
        if (round2 + round <= i5) {
            this.f43963b = round2;
            this.f43962a = round;
        } else {
            float f4 = i5;
            float f5 = aVar.f43975e;
            float f6 = aVar.f43974d;
            float f7 = f4 / (f5 + f6);
            this.f43963b = Math.round(f6 * f7);
            this.f43962a = Math.round(f7 * aVar.f43975e);
        }
        if (Log.isLoggable(ProtectedSandApp.s("ࣕ"), 3)) {
            f(this.f43963b);
            f(this.f43962a);
            f(i4);
            f(c5);
            aVar.f43972b.getMemoryClass();
            aVar.f43972b.isLowRamDevice();
        }
    }

    private static int c(ActivityManager activityManager, float f4, float f5) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (activityManager.isLowRamDevice()) {
            f4 = f5;
        }
        return Math.round(memoryClass * f4);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i4) {
        return Formatter.formatFileSize(this.f43964c, i4);
    }

    public int a() {
        return this.f43965d;
    }

    public int b() {
        return this.f43962a;
    }

    public int d() {
        return this.f43963b;
    }
}
