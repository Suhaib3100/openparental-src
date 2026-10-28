package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.x1;

/* loaded from: classes3.dex */
public class ChangeClipBounds extends Transition {
    private static final String L2 = "android:clipBounds:bounds";
    private static final String V1 = "android:clipBounds:clip";
    private static final String[] M2 = {"android:clipBounds:clip"};

    class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f34259b;

        a(View view) {
            this.f34259b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x1.T1(this.f34259b, null);
        }
    }

    public ChangeClipBounds() {
    }

    private void J0(b0 b0Var) {
        View view = b0Var.f34364b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect Q = x1.Q(view);
        b0Var.f34363a.put("android:clipBounds:clip", Q);
        if (Q == null) {
            b0Var.f34363a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
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
        ObjectAnimator objectAnimator = null;
        if (b0Var != null && b0Var2 != null && b0Var.f34363a.containsKey("android:clipBounds:clip") && b0Var2.f34363a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) b0Var.f34363a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) b0Var2.f34363a.get("android:clipBounds:clip");
            boolean z4 = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) b0Var.f34363a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) b0Var2.f34363a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            x1.T1(b0Var2.f34364b, rect);
            objectAnimator = ObjectAnimator.ofObject(b0Var2.f34364b, (Property<View, V>) o0.f34453d, (TypeEvaluator) new r(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z4) {
                objectAnimator.addListener(new a(b0Var2.f34364b));
            }
        }
        return objectAnimator;
    }

    public ChangeClipBounds(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
