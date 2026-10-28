package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.q;

/* loaded from: classes3.dex */
public class Explode extends Visibility {
    private int[] R2;
    private static final String U2 = "android:explode:screenBounds";
    private static final TimeInterpolator S2 = new DecelerateInterpolator();
    private static final TimeInterpolator T2 = new AccelerateInterpolator();

    public Explode() {
        this.R2 = new int[2];
        F0(new c());
    }

    private void J0(b0 b0Var) {
        View view = b0Var.f34364b;
        view.getLocationOnScreen(this.R2);
        int[] iArr = this.R2;
        int i4 = iArr[0];
        int i5 = iArr[1];
        b0Var.f34363a.put("android:explode:screenBounds", new Rect(i4, i5, view.getWidth() + i4, view.getHeight() + i5));
    }

    private static float U0(float f4, float f5) {
        return (float) Math.sqrt((f5 * f5) + (f4 * f4));
    }

    private static float V0(View view, int i4, int i5) {
        return U0(Math.max(i4, view.getWidth() - i4), Math.max(i5, view.getHeight() - i5));
    }

    private void W0(View view, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        view.getLocationOnScreen(this.R2);
        int[] iArr2 = this.R2;
        int i4 = iArr2[0];
        int i5 = iArr2[1];
        Rect K = K();
        if (K == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i4;
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i5;
        } else {
            centerX = K.centerX();
            centerY = K.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float U0 = U0(centerX2, centerY2);
        float V0 = V0(view, centerX - i4, centerY - i5);
        iArr[0] = Math.round((centerX2 / U0) * V0);
        iArr[1] = Math.round(V0 * (centerY2 / U0));
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.q0
    public Animator P0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        if (b0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) b0Var2.f34363a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        W0(viewGroup, rect, this.R2);
        int[] iArr = this.R2;
        return d0.a(view, b0Var2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, S2, this);
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.q0
    public Animator R0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        float f4;
        float f5;
        if (b0Var == null) {
            return null;
        }
        Rect rect = (Rect) b0Var.f34363a.get("android:explode:screenBounds");
        int i4 = rect.left;
        int i5 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) b0Var.f34364b.getTag(q.g.T1);
        if (iArr != null) {
            f4 = (r7 - rect.left) + translationX;
            f5 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f4 = translationX;
            f5 = translationY;
        }
        W0(viewGroup, rect, this.R2);
        int[] iArr2 = this.R2;
        return d0.a(view, b0Var, i4, i5, translationX, translationY, f4 + iArr2[0], f5 + iArr2[1], T2, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void m(@androidx.annotation.o0 b0 b0Var) {
        super.m(b0Var);
        J0(b0Var);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void p(@androidx.annotation.o0 b0 b0Var) {
        super.p(b0Var);
        J0(b0Var);
    }

    public Explode(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R2 = new int[2];
        F0(new c());
    }
}
