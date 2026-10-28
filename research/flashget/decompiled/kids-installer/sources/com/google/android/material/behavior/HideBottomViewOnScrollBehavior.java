package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: e, reason: collision with root package name */
    protected static final int f12937e = 225;

    /* renamed from: f, reason: collision with root package name */
    protected static final int f12938f = 175;

    /* renamed from: g, reason: collision with root package name */
    private static final int f12939g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f12940h = 2;

    /* renamed from: a, reason: collision with root package name */
    private int f12941a;

    /* renamed from: b, reason: collision with root package name */
    private int f12942b;

    /* renamed from: c, reason: collision with root package name */
    private int f12943c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private ViewPropertyAnimator f12944d;

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f12944d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f12941a = 0;
        this.f12942b = 2;
        this.f12943c = 0;
    }

    private void H(@o0 V v5, int i5, long j5, TimeInterpolator timeInterpolator) {
        this.f12944d = v5.animate().translationY(i5).setInterpolator(timeInterpolator).setDuration(j5).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, @o0 View view2, int i5, int i6) {
        return i5 == 2;
    }

    public void I(@o0 V v5, @r int i5) {
        this.f12943c = i5;
        if (this.f12942b == 1) {
            v5.setTranslationY(this.f12941a + i5);
        }
    }

    public void J(@o0 V v5) {
        if (this.f12942b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f12944d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v5.clearAnimation();
        }
        this.f12942b = 1;
        H(v5, this.f12941a + this.f12943c, 175L, com.google.android.material.animation.a.f12780c);
    }

    public void K(@o0 V v5) {
        if (this.f12942b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f12944d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v5.clearAnimation();
        }
        this.f12942b = 2;
        H(v5, 0, 225L, com.google.android.material.animation.a.f12781d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, int i5) {
        this.f12941a = v5.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v5.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void u(CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5, int i6, int i7, int i8, int i9, @o0 int[] iArr) {
        if (i6 > 0) {
            J(v5);
        } else if (i6 < 0) {
            K(v5);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12941a = 0;
        this.f12942b = 2;
        this.f12943c = 0;
    }
}
