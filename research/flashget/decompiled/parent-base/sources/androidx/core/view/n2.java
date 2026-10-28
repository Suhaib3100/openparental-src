package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: WindowCompat.java */
/* loaded from: classes3.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27323a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final int f27324b = 9;

    /* renamed from: c, reason: collision with root package name */
    public static final int f27325c = 10;

    /* compiled from: WindowCompat.java */
    static class a {
        private a() {
        }

        static void a(@androidx.annotation.o0 Window window, boolean z4) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* compiled from: WindowCompat.java */
    @androidx.annotation.x0(28)
    static class b {
        private b() {
        }

        static <T> T a(Window window, int i4) {
            return (T) window.requireViewById(i4);
        }
    }

    /* compiled from: WindowCompat.java */
    @androidx.annotation.x0(30)
    static class c {
        private c() {
        }

        static void a(@androidx.annotation.o0 Window window, boolean z4) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z4);
        }
    }

    /* compiled from: WindowCompat.java */
    @androidx.annotation.x0(35)
    static class d {
        private d() {
        }

        static void a(@androidx.annotation.o0 Window window, boolean z4) {
            window.setDecorFitsSystemWindows(z4);
        }
    }

    private n2() {
    }

    @androidx.annotation.o0
    public static n4 a(@androidx.annotation.o0 Window window, @androidx.annotation.o0 View view) {
        return new n4(window, view);
    }

    @androidx.annotation.o0
    public static <T extends View> T b(@androidx.annotation.o0 Window window, @androidx.annotation.d0 int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i4);
        }
        T t4 = (T) window.findViewById(i4);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@androidx.annotation.o0 Window window, boolean z4) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            d.a(window, z4);
        } else if (i4 >= 30) {
            c.a(window, z4);
        } else {
            a.a(window, z4);
        }
    }
}
