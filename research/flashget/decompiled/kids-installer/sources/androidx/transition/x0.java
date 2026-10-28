package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
@androidx.annotation.x0(21)
/* loaded from: classes3.dex */
class x0 extends t0 {

    /* renamed from: i, reason: collision with root package name */
    private static boolean f10118i = true;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f10119j = true;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f10120k = true;

    x0() {
    }

    @Override // androidx.transition.d1
    @SuppressLint({"NewApi"})
    public void e(@androidx.annotation.o0 View view, @androidx.annotation.q0 Matrix matrix) {
        if (f10118i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f10118i = false;
            }
        }
    }

    @Override // androidx.transition.d1
    @SuppressLint({"NewApi"})
    public void i(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        if (f10119j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f10119j = false;
            }
        }
    }

    @Override // androidx.transition.d1
    @SuppressLint({"NewApi"})
    public void j(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        if (f10120k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f10120k = false;
            }
        }
    }
}
