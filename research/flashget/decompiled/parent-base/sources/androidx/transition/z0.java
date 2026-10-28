package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
@androidx.annotation.x0(29)
/* loaded from: classes3.dex */
class z0 extends y0 {
    z0() {
    }

    @Override // androidx.transition.r0, androidx.transition.a1
    public float c(@androidx.annotation.o0 View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.transition.u0, androidx.transition.a1
    public void e(@androidx.annotation.o0 View view, @androidx.annotation.q0 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.w0, androidx.transition.a1
    public void f(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    @Override // androidx.transition.r0, androidx.transition.a1
    public void g(@androidx.annotation.o0 View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    @Override // androidx.transition.y0, androidx.transition.a1
    public void h(@androidx.annotation.o0 View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // androidx.transition.u0, androidx.transition.a1
    public void i(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.u0, androidx.transition.a1
    public void j(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
