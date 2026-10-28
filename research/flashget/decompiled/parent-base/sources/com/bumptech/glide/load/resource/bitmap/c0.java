package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HardwareConfigState.java */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f44439e = ProtectedSandApp.s("\u098e");

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f44440f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.k(api = 28)
    public static final boolean f44441g;

    /* renamed from: h, reason: collision with root package name */
    private static final File f44442h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f44443i = 50;

    /* renamed from: j, reason: collision with root package name */
    private static final int f44444j = 20000;

    /* renamed from: k, reason: collision with root package name */
    private static final int f44445k = 500;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f44446l = -1;

    /* renamed from: m, reason: collision with root package name */
    private static volatile c0 f44447m;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f44449b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f44450c = true;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f44451d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final int f44448a = 20000;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f44440f = i4 < 29;
        f44441g = i4 >= 28;
        f44442h = new File(ProtectedSandApp.s("এ"));
    }

    @m1
    c0() {
    }

    private boolean a() {
        return f44440f && !this.f44451d.get();
    }

    public static c0 c() {
        if (f44447m == null) {
            synchronized (c0.class) {
                try {
                    if (f44447m == null) {
                        f44447m = new c0();
                    }
                } finally {
                }
            }
        }
        return f44447m;
    }

    private int d() {
        if (f()) {
            return 500;
        }
        return this.f44448a;
    }

    private synchronized boolean e() {
        try {
            boolean z4 = true;
            int i4 = this.f44449b + 1;
            this.f44449b = i4;
            if (i4 >= 50) {
                this.f44449b = 0;
                if (f44442h.list().length >= d()) {
                    z4 = false;
                }
                this.f44450c = z4;
                if (!z4) {
                    Log.isLoggable(ProtectedSandApp.s("ঐ"), 5);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f44450c;
    }

    private static boolean f() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList(ProtectedSandApp.s("ও"), ProtectedSandApp.s("ঔ"), ProtectedSandApp.s("ক"), ProtectedSandApp.s("খ"), ProtectedSandApp.s("গ"), ProtectedSandApp.s("ঘ"), ProtectedSandApp.s("ঙ"), ProtectedSandApp.s("চ"), ProtectedSandApp.s("ছ"), ProtectedSandApp.s("জ"), ProtectedSandApp.s("ঝ"), ProtectedSandApp.s("ঞ"), ProtectedSandApp.s("\u0991"), ProtectedSandApp.s("\u0992")).iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        com.bumptech.glide.util.o.b();
        this.f44451d.set(false);
    }

    public boolean g(int i4, int i5, boolean z4, boolean z5) {
        String s4 = ProtectedSandApp.s("\u098e");
        if (!z4) {
            Log.isLoggable(s4, 2);
            return false;
        }
        if (!f44441g) {
            Log.isLoggable(s4, 2);
            return false;
        }
        if (a()) {
            Log.isLoggable(s4, 2);
            return false;
        }
        if (z5) {
            Log.isLoggable(s4, 2);
            return false;
        }
        if (i4 < 0 || i5 < 0) {
            Log.isLoggable(s4, 2);
            return false;
        }
        if (e()) {
            return true;
        }
        Log.isLoggable(s4, 2);
        return false;
    }

    @TargetApi(26)
    boolean h(int i4, int i5, BitmapFactory.Options options, boolean z4, boolean z5) {
        Bitmap.Config config;
        boolean g4 = g(i4, i5, z4, z5);
        if (g4) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return g4;
    }

    public void i() {
        com.bumptech.glide.util.o.b();
        this.f44451d.set(true);
    }
}
