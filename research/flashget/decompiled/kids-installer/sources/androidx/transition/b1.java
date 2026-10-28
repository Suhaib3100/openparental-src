package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
@androidx.annotation.x0(23)
/* loaded from: classes4.dex */
class b1 extends z0 {

    /* renamed from: m, reason: collision with root package name */
    private static boolean f9848m = true;

    b1() {
    }

    @Override // androidx.transition.d1
    @SuppressLint({"NewApi"})
    public void h(@androidx.annotation.o0 View view, int i5) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i5);
        } else if (f9848m) {
            try {
                view.setTransitionVisibility(i5);
            } catch (NoSuchMethodError unused) {
                f9848m = false;
            }
        }
    }
}
