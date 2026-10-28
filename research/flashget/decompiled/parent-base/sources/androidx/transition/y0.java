package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
@androidx.annotation.x0(23)
/* loaded from: classes3.dex */
class y0 extends w0 {

    /* renamed from: m, reason: collision with root package name */
    private static boolean f35257m = true;

    y0() {
    }

    @Override // androidx.transition.a1
    @SuppressLint({"NewApi"})
    public void h(@androidx.annotation.o0 View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i4);
        } else if (f35257m) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f35257m = false;
            }
        }
    }
}
