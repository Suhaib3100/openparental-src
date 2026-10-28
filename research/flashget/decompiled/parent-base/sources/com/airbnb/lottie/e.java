package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.c1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: L.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f38877a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final String f38878b = ProtectedSandApp.s("č");

    /* renamed from: c, reason: collision with root package name */
    private static final int f38879c = 20;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f38880d;

    /* renamed from: e, reason: collision with root package name */
    private static String[] f38881e;

    /* renamed from: f, reason: collision with root package name */
    private static long[] f38882f;

    /* renamed from: g, reason: collision with root package name */
    private static int f38883g;

    /* renamed from: h, reason: collision with root package name */
    private static int f38884h;

    /* renamed from: i, reason: collision with root package name */
    private static com.airbnb.lottie.network.f f38885i;

    /* renamed from: j, reason: collision with root package name */
    private static com.airbnb.lottie.network.e f38886j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.h f38887k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.g f38888l;

    /* compiled from: L.java */
    class a implements com.airbnb.lottie.network.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38889a;

        a(Context context) {
            this.f38889a = context;
        }

        @Override // com.airbnb.lottie.network.e
        @androidx.annotation.o0
        public File a() {
            return new File(this.f38889a.getCacheDir(), ProtectedSandApp.s("Č"));
        }
    }

    private e() {
    }

    public static void a(String str) {
        if (f38880d) {
            int i4 = f38883g;
            if (i4 == 20) {
                f38884h++;
                return;
            }
            f38881e[i4] = str;
            f38882f[i4] = System.nanoTime();
            androidx.core.os.p0.b(str);
            f38883g++;
        }
    }

    public static float b(String str) {
        int i4 = f38884h;
        if (i4 > 0) {
            f38884h = i4 - 1;
            return 0.0f;
        }
        if (!f38880d) {
            return 0.0f;
        }
        int i5 = f38883g - 1;
        f38883g = i5;
        if (i5 == -1) {
            throw new IllegalStateException(ProtectedSandApp.s("đ"));
        }
        if (!str.equals(f38881e[i5])) {
            throw new IllegalStateException(android.support.v4.media.c.a(androidx.appcompat.view.g.a(ProtectedSandApp.s("Ď"), str, ProtectedSandApp.s("ď")), f38881e[f38883g], ProtectedSandApp.s("Đ")));
        }
        androidx.core.os.p0.d();
        return (System.nanoTime() - f38882f[f38883g]) / 1000000.0f;
    }

    @androidx.annotation.o0
    public static com.airbnb.lottie.network.g c(@androidx.annotation.o0 Context context) {
        Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.g gVar = f38888l;
        if (gVar == null) {
            synchronized (com.airbnb.lottie.network.g.class) {
                try {
                    gVar = f38888l;
                    if (gVar == null) {
                        com.airbnb.lottie.network.e eVar = f38886j;
                        if (eVar == null) {
                            eVar = new a(applicationContext);
                        }
                        gVar = new com.airbnb.lottie.network.g(eVar);
                        f38888l = gVar;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }

    @androidx.annotation.o0
    public static com.airbnb.lottie.network.h d(@androidx.annotation.o0 Context context) {
        com.airbnb.lottie.network.h hVar = f38887k;
        if (hVar == null) {
            synchronized (com.airbnb.lottie.network.h.class) {
                try {
                    hVar = f38887k;
                    if (hVar == null) {
                        com.airbnb.lottie.network.g c5 = c(context);
                        com.airbnb.lottie.network.f fVar = f38885i;
                        if (fVar == null) {
                            fVar = new com.airbnb.lottie.network.b();
                        }
                        hVar = new com.airbnb.lottie.network.h(c5, fVar);
                        f38887k = hVar;
                    }
                } finally {
                }
            }
        }
        return hVar;
    }

    public static void e(com.airbnb.lottie.network.e eVar) {
        f38886j = eVar;
    }

    public static void f(com.airbnb.lottie.network.f fVar) {
        f38885i = fVar;
    }

    public static void g(boolean z4) {
        if (f38880d == z4) {
            return;
        }
        f38880d = z4;
        if (z4) {
            f38881e = new String[20];
            f38882f = new long[20];
        }
    }
}
