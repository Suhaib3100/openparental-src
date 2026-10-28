package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5896a = "PopupWindowCompatApi21";

    /* renamed from: b, reason: collision with root package name */
    private static Method f5897b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5898c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f5899d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f5900e;

    /* renamed from: f, reason: collision with root package name */
    private static Field f5901f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f5902g;

    /* compiled from: PopupWindowCompat.java */
    @x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, View view, int i5, int i6, int i7) {
            popupWindow.showAsDropDown(view, i5, i6, i7);
        }
    }

    /* compiled from: PopupWindowCompat.java */
    @x0(23)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @androidx.annotation.u
        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @androidx.annotation.u
        static void c(PopupWindow popupWindow, boolean z5) {
            popupWindow.setOverlapAnchor(z5);
        }

        @androidx.annotation.u
        static void d(PopupWindow popupWindow, int i5) {
            popupWindow.setWindowLayoutType(i5);
        }
    }

    private q() {
    }

    public static boolean a(@o0 PopupWindow popupWindow) {
        return b.a(popupWindow);
    }

    public static int b(@o0 PopupWindow popupWindow) {
        return b.b(popupWindow);
    }

    public static void c(@o0 PopupWindow popupWindow, boolean z5) {
        b.c(popupWindow, z5);
    }

    public static void d(@o0 PopupWindow popupWindow, int i5) {
        b.d(popupWindow, i5);
    }

    public static void e(@o0 PopupWindow popupWindow, @o0 View view, int i5, int i6, int i7) {
        a.a(popupWindow, view, i5, i6, i7);
    }
}
