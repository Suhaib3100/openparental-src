package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.t;
import androidx.annotation.c1;
import androidx.core.view.f0;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class ComponentActivity extends Activity implements android.view.a0, f0.a {

    /* renamed from: o, reason: collision with root package name */
    private androidx.collection.i<Class<? extends a>, a> f3970o = new androidx.collection.i<>();

    /* renamed from: p, reason: collision with root package name */
    private android.view.c0 f3971p = new android.view.c0(this);

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
    }

    private static boolean J(@androidx.annotation.q0 String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.getClass();
        switch (str) {
            case "--translation":
                if (Build.VERSION.SDK_INT >= 31) {
                    break;
                }
                break;
            case "--contentcapture":
                if (Build.VERSION.SDK_INT >= 29) {
                    break;
                }
                break;
            case "--autofill":
                if (Build.VERSION.SDK_INT >= 26) {
                    break;
                }
                break;
        }
        return true;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T extends a> T G(Class<T> cls) {
        return (T) this.f3970o.get(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void H(a aVar) {
        this.f3970o.put(aVar.getClass(), aVar);
    }

    protected final boolean I(@androidx.annotation.q0 String[] strArr) {
        return !J(strArr);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.f0.d(decorView, keyEvent)) {
            return androidx.core.view.f0.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.f0.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @androidx.annotation.o0
    public android.view.t getLifecycle() {
        return this.f3971p;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(@androidx.annotation.q0 Bundle bundle) {
        super.onCreate(bundle);
        android.view.q0.g(this);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onSaveInstanceState(@androidx.annotation.o0 Bundle bundle) {
        this.f3971p.l(t.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.core.view.f0.a
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean x(@androidx.annotation.o0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
