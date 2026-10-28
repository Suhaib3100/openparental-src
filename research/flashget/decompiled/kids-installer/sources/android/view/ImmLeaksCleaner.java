package android.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.a0;
import android.view.inputmethod.InputMethodManager;
import android.view.t;
import android.view.w;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.reflect.Field;

@x0(19)
/* loaded from: classes3.dex */
final class ImmLeaksCleaner implements w {

    /* renamed from: p, reason: collision with root package name */
    private static final int f73p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static final int f74q = 1;

    /* renamed from: r, reason: collision with root package name */
    private static final int f75r = 2;

    /* renamed from: s, reason: collision with root package name */
    private static int f76s;

    /* renamed from: t, reason: collision with root package name */
    private static Field f77t;

    /* renamed from: u, reason: collision with root package name */
    private static Field f78u;

    /* renamed from: v, reason: collision with root package name */
    private static Field f79v;

    /* renamed from: o, reason: collision with root package name */
    private Activity f80o;

    ImmLeaksCleaner(Activity activity) {
        this.f80o = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    @l0
    private static void g() {
        try {
            f76s = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f78u = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f79v = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f77t = declaredField3;
            declaredField3.setAccessible(true);
            f76s = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // android.view.w
    public void h(@o0 a0 a0Var, @o0 t.b bVar) {
        if (bVar != t.b.ON_DESTROY) {
            return;
        }
        if (f76s == 0) {
            g();
        }
        if (f76s == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f80o.getSystemService("input_method");
            try {
                Object obj = f77t.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f78u.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f79v.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
