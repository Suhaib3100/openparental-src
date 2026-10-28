package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
@androidx.annotation.x0(22)
/* loaded from: classes3.dex */
class w0 extends u0 {

    /* renamed from: l, reason: collision with root package name */
    private static boolean f35246l = true;

    w0() {
    }

    @Override // androidx.transition.a1
    @SuppressLint({"NewApi"})
    public void f(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7) {
        if (f35246l) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f35246l = false;
            }
        }
    }
}
