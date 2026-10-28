package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: GhostViewPlatform.java */
@androidx.annotation.x0(21)
/* loaded from: classes3.dex */
class j implements h {

    /* renamed from: p, reason: collision with root package name */
    private static final String f9906p = "GhostViewApi21";

    /* renamed from: q, reason: collision with root package name */
    private static Class<?> f9907q;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f9908r;

    /* renamed from: s, reason: collision with root package name */
    private static Method f9909s;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f9910t;

    /* renamed from: u, reason: collision with root package name */
    private static Method f9911u;

    /* renamed from: v, reason: collision with root package name */
    private static boolean f9912v;

    /* renamed from: o, reason: collision with root package name */
    private final View f9913o;

    private j(@androidx.annotation.o0 View view) {
        this.f9913o = view;
    }

    static h b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f9909s;
        if (method != null) {
            try {
                return new j((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(e6.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (f9910t) {
            return;
        }
        try {
            d();
            Method declaredMethod = f9907q.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f9909s = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f9910t = true;
    }

    private static void d() {
        if (f9908r) {
            return;
        }
        try {
            f9907q = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException unused) {
        }
        f9908r = true;
    }

    private static void e() {
        if (f9912v) {
            return;
        }
        try {
            d();
            Method declaredMethod = f9907q.getDeclaredMethod("removeGhost", View.class);
            f9911u = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f9912v = true;
    }

    static void f(View view) {
        e();
        Method method = f9911u;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(e6.getCause());
            }
        }
    }

    @Override // androidx.transition.h
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.h
    public void setVisibility(int i5) {
        this.f9913o.setVisibility(i5);
    }
}
