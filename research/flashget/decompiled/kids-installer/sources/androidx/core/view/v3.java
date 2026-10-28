package androidx.core.view;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: WindowCompat.java */
/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5687a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5688b = 9;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5689c = 10;

    /* compiled from: WindowCompat.java */
    @androidx.annotation.x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.o0 Window window, boolean z5) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* compiled from: WindowCompat.java */
    @androidx.annotation.x0(28)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static <T> T a(Window window, int i5) {
            KeyEvent.Callback requireViewById;
            requireViewById = window.requireViewById(i5);
            return (T) requireViewById;
        }
    }

    /* compiled from: WindowCompat.java */
    @androidx.annotation.x0(30)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.o0 Window window, boolean z5) {
            window.setDecorFitsSystemWindows(z5);
        }
    }

    private v3() {
    }

    @androidx.annotation.o0
    public static z5 a(@androidx.annotation.o0 Window window, @androidx.annotation.o0 View view) {
        return new z5(window, view);
    }

    @androidx.annotation.o0
    public static <T extends View> T b(@androidx.annotation.o0 Window window, @androidx.annotation.d0 int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) b.a(window, i5);
        }
        T t5 = (T) window.findViewById(i5);
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void c(@androidx.annotation.o0 Window window, boolean z5) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(window, z5);
        } else {
            a.a(window, z5);
        }
    }
}
