package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class ChangeScroll extends Transition {
    private static final String L2 = "android:changeScroll:y";
    private static final String V1 = "android:changeScroll:x";
    private static final String[] M2 = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    private void J0(b0 b0Var) {
        b0Var.f34363a.put("android:changeScroll:x", Integer.valueOf(b0Var.f34364b.getScrollX()));
        b0Var.f34363a.put("android:changeScroll:y", Integer.valueOf(b0Var.f34364b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public String[] a0() {
        return M2;
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    public void p(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public Animator t(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 b0 b0Var, @androidx.annotation.q0 b0 b0Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (b0Var == null || b0Var2 == null) {
            return null;
        }
        View view = b0Var2.f34364b;
        int intValue = ((Integer) b0Var.f34363a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) b0Var2.f34363a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) b0Var.f34363a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) b0Var2.f34363a.get("android:changeScroll:y")).intValue();
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
        return a0.c(objectAnimator, objectAnimator2);
    }

    public ChangeScroll(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
