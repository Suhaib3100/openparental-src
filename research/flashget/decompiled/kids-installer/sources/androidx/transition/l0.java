package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtils.java */
/* loaded from: classes.dex */
class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f9921a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Method f9922b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f9923c;

    private l0() {
    }

    static int a(@androidx.annotation.o0 ViewGroup viewGroup, int i5) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i5);
            return childDrawingOrder;
        }
        if (!f9923c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f9922b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f9923c = true;
        }
        Method method = f9922b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i5))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i5;
    }

    static i0 b(@androidx.annotation.o0 ViewGroup viewGroup) {
        return new h0(viewGroup);
    }

    @SuppressLint({"NewApi"})
    @androidx.annotation.x0(18)
    private static void c(@androidx.annotation.o0 ViewGroup viewGroup, boolean z5) {
        if (f9921a) {
            try {
                viewGroup.suppressLayout(z5);
            } catch (NoSuchMethodError unused) {
                f9921a = false;
            }
        }
    }

    static void d(@androidx.annotation.o0 ViewGroup viewGroup, boolean z5) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z5);
        } else {
            c(viewGroup, z5);
        }
    }
}
