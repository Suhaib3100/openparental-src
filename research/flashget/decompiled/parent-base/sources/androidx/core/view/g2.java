package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.Objects;

/* compiled from: ViewParentCompat.java */
/* loaded from: classes3.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f27172a = "ViewParentCompat";

    /* renamed from: b, reason: collision with root package name */
    private static int[] f27173b;

    /* compiled from: ViewParentCompat.java */
    @androidx.annotation.x0(21)
    static class a {
        private a() {
        }

        static boolean a(ViewParent viewParent, View view, float f4, float f5, boolean z4) {
            return viewParent.onNestedFling(view, f4, f5, z4);
        }

        static boolean b(ViewParent viewParent, View view, float f4, float f5) {
            return viewParent.onNestedPreFling(view, f4, f5);
        }

        static void c(ViewParent viewParent, View view, int i4, int i5, int[] iArr) {
            viewParent.onNestedPreScroll(view, i4, i5, iArr);
        }

        static void d(ViewParent viewParent, View view, int i4, int i5, int i6, int i7) {
            viewParent.onNestedScroll(view, i4, i5, i6, i7);
        }

        static void e(ViewParent viewParent, View view, View view2, int i4) {
            viewParent.onNestedScrollAccepted(view, view2, i4);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i4) {
            return viewParent.onStartNestedScroll(view, view2, i4);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private g2() {
    }

    private static int[] a() {
        int[] iArr = f27173b;
        if (iArr == null) {
            f27173b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f27173b;
    }

    @androidx.annotation.w0(expression = "parent.notifySubtreeAccessibilityStateChanged(child, source, changeType)")
    @Deprecated
    public static void b(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i4);
    }

    public static boolean c(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, float f4, float f5, boolean z4) {
        try {
            return viewParent.onNestedFling(view, f4, f5, z4);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static boolean d(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, float f4, float f5) {
        try {
            return viewParent.onNestedPreFling(view, f4, f5);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void e(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i4, int i5, @androidx.annotation.o0 int[] iArr) {
        f(viewParent, view, i4, i5, iArr, 0);
    }

    public static void f(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i4, int i5, @androidx.annotation.o0 int[] iArr, int i6) {
        if (viewParent instanceof z0) {
            ((z0) viewParent).y(view, i4, i5, iArr, i6);
        } else if (i6 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i4, i5, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void g(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i4, int i5, int i6, int i7) {
        i(viewParent, view, i4, i5, i6, i7, 0, a());
    }

    public static void h(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i4, int i5, int i6, int i7, int i10) {
        i(viewParent, view, i4, i5, i6, i7, i10, a());
    }

    public static void i(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i4, int i5, int i6, int i7, int i10, @androidx.annotation.o0 int[] iArr) {
        if (viewParent instanceof a1) {
            ((a1) viewParent).o0(view, i4, i5, i6, i7, i10, iArr);
            return;
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (viewParent instanceof z0) {
            ((z0) viewParent).q0(view, i4, i5, i6, i7, i10);
        } else if (i10 == 0) {
            try {
                viewParent.onNestedScroll(view, i4, i5, i6, i7);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void j(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4) {
        k(viewParent, view, view2, i4, 0);
    }

    public static void k(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4, int i5) {
        if (viewParent instanceof z0) {
            ((z0) viewParent).u(view, view2, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i4);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean l(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4) {
        return m(viewParent, view, view2, i4, 0);
    }

    public static boolean m(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4, int i5) {
        if (viewParent instanceof z0) {
            return ((z0) viewParent).s0(view, view2, i4, i5);
        }
        if (i5 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i4);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void n(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view) {
        o(viewParent, view, 0);
    }

    public static void o(@androidx.annotation.o0 ViewParent viewParent, @androidx.annotation.o0 View view, int i4) {
        if (viewParent instanceof z0) {
            ((z0) viewParent).x(view, i4);
        } else if (i4 == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    @androidx.annotation.w0(expression = "parent.requestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
