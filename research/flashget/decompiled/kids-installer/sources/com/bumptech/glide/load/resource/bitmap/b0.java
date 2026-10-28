package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HardwareConfigState.java */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: g, reason: collision with root package name */
    private static final String f11678g = ProtectedSandApp.s("Ů");

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f11679h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f11680i;

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final int f11681j = 128;

    /* renamed from: k, reason: collision with root package name */
    private static final int f11682k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final File f11683l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f11684m = 50;

    /* renamed from: n, reason: collision with root package name */
    private static final int f11685n = 700;

    /* renamed from: o, reason: collision with root package name */
    private static final int f11686o = 20000;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11687p = -1;

    /* renamed from: q, reason: collision with root package name */
    private static volatile b0 f11688q;

    /* renamed from: r, reason: collision with root package name */
    private static volatile int f11689r;

    /* renamed from: b, reason: collision with root package name */
    private final int f11691b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11692c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f11693d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f11694e = true;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f11695f = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11690a = h();

    static {
        int i5 = Build.VERSION.SDK_INT;
        f11679h = i5 < 29;
        f11680i = i5 >= 26;
        f11683l = new File(ProtectedSandApp.s("ů"));
        f11689r = -1;
    }

    @m1
    b0() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11691b = 20000;
            this.f11692c = 0;
        } else {
            this.f11691b = f11685n;
            this.f11692c = 128;
        }
    }

    private boolean b() {
        return f11679h && !this.f11695f.get();
    }

    public static b0 d() {
        if (f11688q == null) {
            synchronized (b0.class) {
                if (f11688q == null) {
                    f11688q = new b0();
                }
            }
        }
        return f11688q;
    }

    private int e() {
        return f11689r != -1 ? f11689r : this.f11691b;
    }

    private synchronized boolean f() {
        boolean z5 = true;
        int i5 = this.f11693d + 1;
        this.f11693d = i5;
        if (i5 >= 50) {
            this.f11693d = 0;
            if (f11683l.list().length >= e()) {
                z5 = false;
            }
            this.f11694e = z5;
            if (!z5) {
                Log.isLoggable(ProtectedSandApp.s("Ű"), 5);
            }
        }
        return this.f11694e;
    }

    private static boolean h() {
        return (i() || j()) ? false : true;
    }

    private static boolean i() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList(ProtectedSandApp.s("ű"), ProtectedSandApp.s("Ų"), ProtectedSandApp.s("ų"), ProtectedSandApp.s("Ŵ"), ProtectedSandApp.s("ŵ"), ProtectedSandApp.s("Ŷ"), ProtectedSandApp.s("ŷ"), ProtectedSandApp.s("Ÿ"), ProtectedSandApp.s("Ź"), ProtectedSandApp.s("ź"), ProtectedSandApp.s("Ż"), ProtectedSandApp.s("ż"), ProtectedSandApp.s("Ž"), ProtectedSandApp.s("ž"), ProtectedSandApp.s("ſ"), ProtectedSandApp.s("ƀ"), ProtectedSandApp.s("Ɓ")).iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean j() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList(ProtectedSandApp.s("Ƃ"), ProtectedSandApp.s("ƃ"), ProtectedSandApp.s("Ƅ"), ProtectedSandApp.s("ƅ"), ProtectedSandApp.s("Ɔ"), ProtectedSandApp.s("Ƈ"), ProtectedSandApp.s("ƈ"), ProtectedSandApp.s("Ɖ"), ProtectedSandApp.s("Ɗ"), ProtectedSandApp.s("Ƌ"), ProtectedSandApp.s("ƌ"), ProtectedSandApp.s("ƍ"), ProtectedSandApp.s("Ǝ"), ProtectedSandApp.s("Ə"), ProtectedSandApp.s("Ɛ"), ProtectedSandApp.s("Ƒ"), ProtectedSandApp.s("ƒ"), ProtectedSandApp.s("Ɠ"), ProtectedSandApp.s("Ɣ"), ProtectedSandApp.s("ƕ"), ProtectedSandApp.s("Ɩ")).contains(Build.MODEL);
    }

    public boolean a() {
        com.bumptech.glide.util.n.b();
        return !this.f11695f.get();
    }

    public void c() {
        com.bumptech.glide.util.n.b();
        this.f11695f.set(false);
    }

    public boolean g(int i5, int i6, boolean z5, boolean z6) {
        String s5 = ProtectedSandApp.s("Ɨ");
        if (!z5) {
            Log.isLoggable(s5, 2);
            return false;
        }
        if (!this.f11690a) {
            Log.isLoggable(s5, 2);
            return false;
        }
        if (!f11680i) {
            Log.isLoggable(s5, 2);
            return false;
        }
        if (b()) {
            Log.isLoggable(s5, 2);
            return false;
        }
        if (z6) {
            Log.isLoggable(s5, 2);
            return false;
        }
        int i7 = this.f11692c;
        if (i5 < i7) {
            Log.isLoggable(s5, 2);
            return false;
        }
        if (i6 < i7) {
            Log.isLoggable(s5, 2);
            return false;
        }
        if (f()) {
            return true;
        }
        Log.isLoggable(s5, 2);
        return false;
    }

    @TargetApi(26)
    boolean k(int i5, int i6, BitmapFactory.Options options, boolean z5, boolean z6) {
        Bitmap.Config config;
        boolean g5 = g(i5, i6, z5, z6);
        if (g5) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return g5;
    }

    public void l() {
        com.bumptech.glide.util.n.b();
        this.f11695f.set(true);
    }
}
