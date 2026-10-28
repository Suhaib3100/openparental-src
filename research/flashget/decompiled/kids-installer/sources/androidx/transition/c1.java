package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
@androidx.annotation.x0(29)
/* loaded from: classes4.dex */
class c1 extends b1 {
    c1() {
    }

    @Override // androidx.transition.t0, androidx.transition.d1
    public float c(@androidx.annotation.o0 View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.transition.x0, androidx.transition.d1
    public void e(@androidx.annotation.o0 View view, @androidx.annotation.q0 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.z0, androidx.transition.d1
    public void f(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8) {
        view.setLeftTopRightBottom(i5, i6, i7, i8);
    }

    @Override // androidx.transition.t0, androidx.transition.d1
    public void g(@androidx.annotation.o0 View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // androidx.transition.b1, androidx.transition.d1
    public void h(@androidx.annotation.o0 View view, int i5) {
        view.setTransitionVisibility(i5);
    }

    @Override // androidx.transition.x0, androidx.transition.d1
    public void i(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.x0, androidx.transition.d1
    public void j(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
