package androidx.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import java.lang.reflect.Field;

@x0(19)
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC1416b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f390c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f391d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f392e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static int f393f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f394g;

    /* renamed from: h, reason: collision with root package name */
    private static Field f395h;

    /* renamed from: i, reason: collision with root package name */
    private static Field f396i;

    /* renamed from: b, reason: collision with root package name */
    private Activity f397b;

    ImmLeaksCleaner(Activity activity) {
        this.f397b = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    @l0
    private static void a() {
        try {
            f393f = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f395h = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f396i = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f394g = declaredField3;
            declaredField3.setAccessible(true);
            f393f = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.view.InterfaceC1416b0
    public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar) {
        if (aVar != AbstractC1450w.a.ON_DESTROY) {
            return;
        }
        if (f393f == 0) {
            a();
        }
        if (f393f == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f397b.getSystemService("input_method");
            try {
                Object obj = f394g.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f395h.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f396i.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
