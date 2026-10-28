package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
@androidx.annotation.x0(21)
/* loaded from: classes3.dex */
class u0 extends r0 {

    /* renamed from: i, reason: collision with root package name */
    private static boolean f35240i = true;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f35241j = true;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f35242k = true;

    u0() {
    }

    @Override // androidx.transition.a1
    @SuppressLint({"NewApi"})
    public void e(@androidx.annotation.o0 View view, @androidx.annotation.q0 Matrix matrix) {
        if (f35240i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f35240i = false;
            }
        }
    }

    @Override // androidx.transition.a1
    @SuppressLint({"NewApi"})
    public void i(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        if (f35241j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f35241j = false;
            }
        }
    }

    @Override // androidx.transition.a1
    @SuppressLint({"NewApi"})
    public void j(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        if (f35242k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f35242k = false;
            }
        }
    }
}
