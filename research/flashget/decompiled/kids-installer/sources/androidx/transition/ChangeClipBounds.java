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
import androidx.core.view.y1;

/* loaded from: classes3.dex */
public class ChangeClipBounds extends Transition {

    /* renamed from: l0, reason: collision with root package name */
    private static final String f9708l0 = "android:clipBounds:bounds";

    /* renamed from: k0, reason: collision with root package name */
    private static final String f9707k0 = "android:clipBounds:clip";

    /* renamed from: m0, reason: collision with root package name */
    private static final String[] f9709m0 = {"android:clipBounds:clip"};

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f9710a;

        a(View view) {
            this.f9710a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y1.M1(this.f9710a, null);
        }
    }

    public ChangeClipBounds() {
    }

    private void P0(d0 d0Var) {
        View view = d0Var.f9860b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect P = y1.P(view);
        d0Var.f9859a.put("android:clipBounds:clip", P);
        if (P == null) {
            d0Var.f9859a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public String[] e0() {
        return f9709m0;
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
    public Animator u(@androidx.annotation.o0 ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        ObjectAnimator objectAnimator = null;
        if (d0Var != null && d0Var2 != null && d0Var.f9859a.containsKey("android:clipBounds:clip") && d0Var2.f9859a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) d0Var.f9859a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) d0Var2.f9859a.get("android:clipBounds:clip");
            boolean z5 = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) d0Var.f9859a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) d0Var2.f9859a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            y1.M1(d0Var2.f9860b, rect);
            objectAnimator = ObjectAnimator.ofObject(d0Var2.f9860b, (Property<View, V>) q0.f9952d, (TypeEvaluator) new t(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z5) {
                objectAnimator.addListener(new a(d0Var2.f9860b));
            }
        }
        return objectAnimator;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
