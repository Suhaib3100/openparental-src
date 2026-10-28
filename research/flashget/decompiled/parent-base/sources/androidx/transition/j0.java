package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtils.java */
/* loaded from: classes3.dex */
class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f34422a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Method f34423b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f34424c;

    private j0() {
    }

    static int a(@androidx.annotation.o0 ViewGroup viewGroup, int i4) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i4);
            return childDrawingOrder;
        }
        if (!f34424c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f34423b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f34424c = true;
        }
        Method method = f34423b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i4))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i4;
    }

    static g0 b(@androidx.annotation.o0 ViewGroup viewGroup) {
        return new f0(viewGroup);
    }

    @SuppressLint({"NewApi"})
    @androidx.annotation.x0(18)
    private static void c(@androidx.annotation.o0 ViewGroup viewGroup, boolean z4) {
        if (f34422a) {
            try {
                viewGroup.suppressLayout(z4);
            } catch (NoSuchMethodError unused) {
                f34422a = false;
            }
        }
    }

    static void d(@androidx.annotation.o0 ViewGroup viewGroup, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z4);
        } else {
            c(viewGroup, z4);
        }
    }
}
