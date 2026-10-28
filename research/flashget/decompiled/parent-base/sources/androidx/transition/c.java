package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* compiled from: CircularPropagation.java */
/* loaded from: classes3.dex */
public class c extends b1 {

    /* renamed from: d, reason: collision with root package name */
    private float f34369d = 3.0f;

    private static float h(float f4, float f5, float f6, float f7) {
        float f10 = f6 - f4;
        float f11 = f7 - f5;
        return (float) Math.sqrt((f11 * f11) + (f10 * f10));
    }

    @Override // androidx.transition.y
    public long c(ViewGroup viewGroup, Transition transition, b0 b0Var, b0 b0Var2) {
        int i4;
        int round;
        int i5;
        if (b0Var == null && b0Var2 == null) {
            return 0L;
        }
        if (b0Var2 == null || e(b0Var) == 0) {
            i4 = -1;
        } else {
            b0Var = b0Var2;
            i4 = 1;
        }
        int f4 = f(b0Var);
        int g4 = g(b0Var);
        Rect K = transition.K();
        if (K != null) {
            i5 = K.centerX();
            round = K.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r5[0]);
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r5[1]);
            i5 = round2;
        }
        float h4 = h(f4, g4, i5, round) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long J = transition.J();
        if (J < 0) {
            J = 300;
        }
        return Math.round(((J * i4) / this.f34369d) * h4);
    }

    public void i(float f4) {
        if (f4 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f34369d = f4;
    }
}
