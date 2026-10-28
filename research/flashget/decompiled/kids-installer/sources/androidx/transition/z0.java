package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
@androidx.annotation.x0(22)
/* loaded from: classes3.dex */
class z0 extends x0 {

    /* renamed from: l, reason: collision with root package name */
    private static boolean f10131l = true;

    z0() {
    }

    @Override // androidx.transition.d1
    @SuppressLint({"NewApi"})
    public void f(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8) {
        if (f10131l) {
            try {
                view.setLeftTopRightBottom(i5, i6, i7, i8);
            } catch (NoSuchMethodError unused) {
                f10131l = false;
            }
        }
    }
}
