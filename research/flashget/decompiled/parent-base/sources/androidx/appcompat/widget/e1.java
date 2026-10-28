package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.annotation.c1;
import androidx.core.view.x1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtils.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1832a = "ViewUtils";

    /* renamed from: b, reason: collision with root package name */
    private static Method f1833b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.k(api = 27)
    static final boolean f1834c;

    static {
        f1834c = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1833b = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1833b.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    private e1() {
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1833b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(View view) {
        return x1.c0(view) == 1;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
