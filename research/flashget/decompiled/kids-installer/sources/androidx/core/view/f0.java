package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.c1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: KeyEventDispatcher.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5492a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f5493b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5494c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f5495d;

    /* compiled from: KeyEventDispatcher.java */
    public interface a {
        boolean x(@androidx.annotation.o0 KeyEvent keyEvent);
    }

    private f0() {
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f5492a) {
            try {
                f5493b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f5492a = true;
        }
        Method method = f5493b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (y1.z(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f6 = f(dialog);
        if (f6 != null && f6.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (y1.z(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean d(@androidx.annotation.o0 View view, @androidx.annotation.o0 KeyEvent keyEvent) {
        return y1.A(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    public static boolean e(@androidx.annotation.o0 a aVar, @androidx.annotation.q0 View view, @androidx.annotation.q0 Window.Callback callback, @androidx.annotation.o0 KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.x(keyEvent) : callback instanceof Activity ? b((Activity) callback, keyEvent) : callback instanceof Dialog ? c((Dialog) callback, keyEvent) : (view != null && y1.z(view, keyEvent)) || aVar.x(keyEvent);
    }

    private static DialogInterface.OnKeyListener f(Dialog dialog) {
        if (!f5494c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f5495d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5494c = true;
        }
        Field field = f5495d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
