package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.o0;
import androidx.annotation.w0;
import androidx.annotation.x0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat.java */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f27588a = "PopupWindowCompatApi21";

    /* renamed from: b, reason: collision with root package name */
    private static Method f27589b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f27590c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f27591d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f27592e;

    /* renamed from: f, reason: collision with root package name */
    private static Field f27593f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f27594g;

    /* compiled from: PopupWindowCompat.java */
    @x0(23)
    static class a {
        private a() {
        }

        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z4) {
            popupWindow.setOverlapAnchor(z4);
        }

        static void d(PopupWindow popupWindow, int i4) {
            popupWindow.setWindowLayoutType(i4);
        }
    }

    private o() {
    }

    public static boolean a(@o0 PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(@o0 PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(@o0 PopupWindow popupWindow, boolean z4) {
        popupWindow.setOverlapAnchor(z4);
    }

    public static void d(@o0 PopupWindow popupWindow, int i4) {
        popupWindow.setWindowLayoutType(i4);
    }

    @w0(expression = "popup.showAsDropDown(anchor, xoff, yoff, gravity)")
    @Deprecated
    public static void e(@o0 PopupWindow popupWindow, @o0 View view, int i4, int i5, int i6) {
        popupWindow.showAsDropDown(view, i4, i5, i6);
    }
}
