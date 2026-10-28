package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* compiled from: CircularPropagation.java */
/* loaded from: classes3.dex */
public class e extends e1 {

    /* renamed from: d, reason: collision with root package name */
    private float f9869d = 3.0f;

    private static float h(float f6, float f7, float f8, float f9) {
        float f10 = f8 - f6;
        float f11 = f9 - f7;
        return (float) Math.sqrt((f11 * f11) + (f10 * f10));
    }

    @Override // androidx.transition.a0
    public long c(ViewGroup viewGroup, Transition transition, d0 d0Var, d0 d0Var2) {
        int i5;
        int round;
        int i6;
        if (d0Var == null && d0Var2 == null) {
            return 0L;
        }
        if (d0Var2 == null || e(d0Var) == 0) {
            i5 = -1;
        } else {
            d0Var = d0Var2;
            i5 = 1;
        }
        int f6 = f(d0Var);
        int g5 = g(d0Var);
        Rect L = transition.L();
        if (L != null) {
            i6 = L.centerX();
            round = L.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r5[0]);
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r5[1]);
            i6 = round2;
        }
        float h5 = h(f6, g5, i6, round) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long K = transition.K();
        if (K < 0) {
            K = 300;
        }
        return Math.round(((K * i5) / this.f9869d) * h5);
    }

    public void i(float f6) {
        if (f6 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f9869d = f6;
    }
}
