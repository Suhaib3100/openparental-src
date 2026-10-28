package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: GhostViewPlatform.java */
@androidx.annotation.x0(21)
/* loaded from: classes3.dex */
class h implements f {

    /* renamed from: c, reason: collision with root package name */
    private static final String f34407c = "GhostViewApi21";

    /* renamed from: d, reason: collision with root package name */
    private static Class<?> f34408d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f34409e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f34410f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f34411g;

    /* renamed from: h, reason: collision with root package name */
    private static Method f34412h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f34413i;

    /* renamed from: b, reason: collision with root package name */
    private final View f34414b;

    private h(@androidx.annotation.o0 View view) {
        this.f34414b = view;
    }

    static f b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f34410f;
        if (method != null) {
            try {
                return new h((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (f34411g) {
            return;
        }
        try {
            d();
            Method declaredMethod = f34408d.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f34410f = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f34411g = true;
    }

    private static void d() {
        if (f34409e) {
            return;
        }
        try {
            f34408d = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException unused) {
        }
        f34409e = true;
    }

    private static void e() {
        if (f34413i) {
            return;
        }
        try {
            d();
            Method declaredMethod = f34408d.getDeclaredMethod("removeGhost", View.class);
            f34412h = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f34413i = true;
    }

    static void f(View view) {
        e();
        Method method = f34412h;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
    }

    @Override // androidx.transition.f
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.f
    public void setVisibility(int i4) {
        this.f34414b.setVisibility(i4);
    }
}
