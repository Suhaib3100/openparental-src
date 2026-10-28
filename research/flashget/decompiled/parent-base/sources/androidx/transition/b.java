package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CanvasUtils.java */
/* loaded from: classes3.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static Method f34360a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f34361b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f34362c;

    private b() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    static void a(@androidx.annotation.o0 Canvas canvas, boolean z4) {
        Method method;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            if (z4) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i4 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f34362c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f34360a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                f34361b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f34362c = true;
        }
        if (z4) {
            try {
                Method method2 = f34360a;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
        if (z4 || (method = f34361b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
