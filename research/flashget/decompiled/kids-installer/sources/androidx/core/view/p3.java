package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.Objects;

/* compiled from: ViewParentCompat.java */
/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5644a = "ViewParentCompat";

    /* renamed from: b, reason: collision with root package name */
    private static int[] f5645b;

    /* compiled from: ViewParentCompat.java */
    @androidx.annotation.x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(ViewParent viewParent, View view, View view2, int i5) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i5);
        }
    }

    /* compiled from: ViewParentCompat.java */
    @androidx.annotation.x0(21)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(ViewParent viewParent, View view, float f6, float f7, boolean z5) {
            return viewParent.onNestedFling(view, f6, f7, z5);
        }

        @androidx.annotation.u
        static boolean b(ViewParent viewParent, View view, float f6, float f7) {
            return viewParent.onNestedPreFling(view, f6, f7);
        }

        @androidx.annotation.u
        static void c(ViewParent viewParent, View view, int i5, int i6, int[] iArr) {
            viewParent.onNestedPreScroll(view, i5, i6, iArr);
        }

        @androidx.annotation.u
        static void d(ViewParent viewParent, View view, int i5, int i6, int i7, int i8) {
            viewParent.onNestedScroll(view, i5, i6, i7, i8);
        }

        @androidx.annotation.u
        static void e(ViewParent viewParent, View view, View view2, int i5) {
            viewParent.onNestedScrollAccepted(view, view2, i5);
        }

        @androidx.annotation.u
        static boolean f(ViewParent viewParent, View view, View view2, int i5) {
            return viewParent.onStartNestedScroll(view, view2, i5);
        }

        @androidx.annotation.u
        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private p3() {
    }

    private static int[] a() {
        int[] iArr = f5645b;
        if (iArr == null) {
            f5645b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f5645b;
    }

    public static void b(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i5) {
        a.a(viewParent, view, view2, i5);
    }

    public static boolean c(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, float f6, float f7, boolean z5) {
        try {
            return b.a(viewParent, view, f6, f7, z5);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static boolean d(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, float f6, float f7) {
        try {
            return b.b(viewParent, view, f6, f7);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void e(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i5, int i6, @androidx.annotation.o0 int[] iArr) {
        f(viewParent, view, i5, i6, iArr, 0);
    }

    public static void f(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i5, int i6, @androidx.annotation.o0 int[] iArr, int i7) {
        if (viewParent instanceof k1) {
            ((k1) viewParent).z(view, i5, i6, iArr, i7);
        } else if (i7 == 0) {
            try {
                b.c(viewParent, view, i5, i6, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void g(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i5, int i6, int i7, int i8) {
        i(viewParent, view, i5, i6, i7, i8, 0, a());
    }

    public static void h(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i5, int i6, int i7, int i8, int i9) {
        i(viewParent, view, i5, i6, i7, i8, i9, a());
    }

    public static void i(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i5, int i6, int i7, int i8, int i9, @androidx.annotation.o0 int[] iArr) {
        if (viewParent instanceof l1) {
            ((l1) viewParent).l(view, i5, i6, i7, i8, i9, iArr);
            return;
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (viewParent instanceof k1) {
            ((k1) viewParent).v(view, i5, i6, i7, i8, i9);
        } else if (i9 == 0) {
            try {
                b.d(viewParent, view, i5, i6, i7, i8);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void j(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i5) {
        k(viewParent, view, view2, i5, 0);
    }

    public static void k(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i5, int i6) {
        if (viewParent instanceof k1) {
            ((k1) viewParent).x(view, view2, i5, i6);
        } else if (i6 == 0) {
            try {
                b.e(viewParent, view, view2, i5);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean l(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i5) {
        return m(viewParent, view, view2, i5, 0);
    }

    public static boolean m(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i5, int i6) {
        if (viewParent instanceof k1) {
            return ((k1) viewParent).w(view, view2, i5, i6);
        }
        if (i6 != 0) {
            return false;
        }
        try {
            return b.f(viewParent, view, view2, i5);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void n(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view) {
        o(viewParent, view, 0);
    }

    public static void o(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i5) {
        if (viewParent instanceof k1) {
            ((k1) viewParent).y(view, i5);
        } else if (i5 == 0) {
            try {
                b.g(viewParent, view);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
