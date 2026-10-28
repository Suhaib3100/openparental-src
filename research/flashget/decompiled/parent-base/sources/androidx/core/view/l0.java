package androidx.core.view;

import android.view.ViewGroup;

/* compiled from: MarginLayoutParamsCompat.java */
@Deprecated
/* loaded from: classes3.dex */
public final class l0 {
    private l0() {
    }

    @Deprecated
    public static int a(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    @androidx.annotation.w0(expression = "lp.getMarginEnd()")
    @Deprecated
    public static int b(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @androidx.annotation.w0(expression = "lp.getMarginStart()")
    @Deprecated
    public static int c(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @androidx.annotation.w0(expression = "lp.isMarginRelative()")
    @Deprecated
    public static boolean d(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @androidx.annotation.w0(expression = "lp.resolveLayoutDirection(layoutDirection)")
    @Deprecated
    public static void e(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.resolveLayoutDirection(i4);
    }

    @androidx.annotation.w0(expression = "lp.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void f(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.setLayoutDirection(i4);
    }

    @androidx.annotation.w0(expression = "lp.setMarginEnd(marginEnd)")
    @Deprecated
    public static void g(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.setMarginEnd(i4);
    }

    @androidx.annotation.w0(expression = "lp.setMarginStart(marginStart)")
    @Deprecated
    public static void h(@androidx.annotation.o0 ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        marginLayoutParams.setMarginStart(i4);
    }
}
