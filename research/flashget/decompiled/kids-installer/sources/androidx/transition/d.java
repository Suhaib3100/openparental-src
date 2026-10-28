package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CanvasUtils.java */
/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private static Method f9856a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f9857b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f9858c;

    private d() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static void a(@androidx.annotation.o0 Canvas canvas, boolean z5) {
        Method method;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            if (z5) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i5 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f9858c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f9856a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f9857b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f9858c = true;
        }
        if (z5) {
            try {
                Method method2 = f9856a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(e6.getCause());
            }
        }
        if (z5 || (method = f9857b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
