package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
@androidx.annotation.x0(19)
/* loaded from: classes3.dex */
class r0 extends a1 {

    /* renamed from: h, reason: collision with root package name */
    private static boolean f35196h = true;

    r0() {
    }

    @Override // androidx.transition.a1
    public void a(@androidx.annotation.o0 View view) {
    }

    @Override // androidx.transition.a1
    @SuppressLint({"NewApi"})
    public float c(@androidx.annotation.o0 View view) {
        float transitionAlpha;
        if (f35196h) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f35196h = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.a1
    public void d(@androidx.annotation.o0 View view) {
    }

    @Override // androidx.transition.a1
    @SuppressLint({"NewApi"})
    public void g(@androidx.annotation.o0 View view, float f4) {
        if (f35196h) {
            try {
                view.setTransitionAlpha(f4);
                return;
            } catch (NoSuchMethodError unused) {
                f35196h = false;
            }
        }
        view.setAlpha(f4);
    }
}
