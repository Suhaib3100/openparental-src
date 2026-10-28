package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
@androidx.annotation.x0(19)
/* loaded from: classes3.dex */
class t0 extends d1 {

    /* renamed from: h, reason: collision with root package name */
    private static boolean f10071h = true;

    t0() {
    }

    @Override // androidx.transition.d1
    public void a(@androidx.annotation.o0 View view) {
    }

    @Override // androidx.transition.d1
    @SuppressLint({"NewApi"})
    public float c(@androidx.annotation.o0 View view) {
        float transitionAlpha;
        if (f10071h) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f10071h = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.d1
    public void d(@androidx.annotation.o0 View view) {
    }

    @Override // androidx.transition.d1
    @SuppressLint({"NewApi"})
    public void g(@androidx.annotation.o0 View view, float f6) {
        if (f10071h) {
            try {
                view.setTransitionAlpha(f6);
                return;
            } catch (NoSuchMethodError unused) {
                f10071h = false;
            }
        }
        view.setAlpha(f6);
    }
}
