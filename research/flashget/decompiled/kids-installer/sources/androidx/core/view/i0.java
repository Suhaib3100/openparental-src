package androidx.core.view;

import android.view.ViewGroup;

/* compiled from: MarginLayoutParamsCompat.java */
/* loaded from: classes.dex */
public final class i0 {

    /* compiled from: MarginLayoutParamsCompat.java */
    @androidx.annotation.x0(17)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @androidx.annotation.u
        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @androidx.annotation.u
        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @androidx.annotation.u
        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @androidx.annotation.u
        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
            marginLayoutParams.resolveLayoutDirection(i5);
        }

        @androidx.annotation.u
        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
            marginLayoutParams.setLayoutDirection(i5);
        }

        @androidx.annotation.u
        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
            marginLayoutParams.setMarginEnd(i5);
        }

        @androidx.annotation.u
        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
            marginLayoutParams.setMarginStart(i5);
        }
    }

    private i0() {
    }

    public static int a(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        int a6 = a.a(marginLayoutParams);
        if (a6 == 0 || a6 == 1) {
            return a6;
        }
        return 0;
    }

    public static int b(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int c(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static boolean d(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.d(marginLayoutParams);
    }

    public static void e(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
        a.e(marginLayoutParams, i5);
    }

    public static void f(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
        a.f(marginLayoutParams, i5);
    }

    public static void g(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
        a.g(marginLayoutParams, i5);
    }

    public static void h(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i5) {
        a.h(marginLayoutParams, i5);
    }
}
