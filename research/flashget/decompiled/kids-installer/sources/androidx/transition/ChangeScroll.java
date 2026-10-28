package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class ChangeScroll extends Transition {

    /* renamed from: l0, reason: collision with root package name */
    private static final String f9719l0 = "android:changeScroll:y";

    /* renamed from: k0, reason: collision with root package name */
    private static final String f9718k0 = "android:changeScroll:x";

    /* renamed from: m0, reason: collision with root package name */
    private static final String[] f9720m0 = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    private void P0(d0 d0Var) {
        d0Var.f9859a.put("android:changeScroll:x", Integer.valueOf(d0Var.f9860b.getScrollX()));
        d0Var.f9859a.put("android:changeScroll:y", Integer.valueOf(d0Var.f9860b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public String[] e0() {
        return f9720m0;
    }

    @Override // androidx.transition.Transition
    public void l(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    public void o(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public Animator u(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 d0 d0Var, @androidx.annotation.q0 d0 d0Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        View view = d0Var2.f9860b;
        int intValue = ((Integer) d0Var.f9859a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) d0Var2.f9859a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) d0Var.f9859a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) d0Var2.f9859a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return c0.c(objectAnimator, objectAnimator2);
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
