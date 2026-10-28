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

/* loaded from: classes6.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: e, reason: collision with root package name */
    protected static final int f52661e = 225;

    /* renamed from: f, reason: collision with root package name */
    protected static final int f52662f = 175;

    /* renamed from: g, reason: collision with root package name */
    private static final int f52663g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f52664h = 2;

    /* renamed from: a, reason: collision with root package name */
    private int f52665a;

    /* renamed from: b, reason: collision with root package name */
    private int f52666b;

    /* renamed from: c, reason: collision with root package name */
    private int f52667c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private ViewPropertyAnimator f52668d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f52668d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f52665a = 0;
        this.f52666b = 2;
        this.f52667c = 0;
    }

    private void H(@o0 V v4, int i4, long j4, TimeInterpolator timeInterpolator) {
        this.f52668d = v4.animate().translationY(i4).setInterpolator(timeInterpolator).setDuration(j4).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, @o0 View view2, int i4, int i5) {
        return i4 == 2;
    }

    public void I(@o0 V v4, @r int i4) {
        this.f52667c = i4;
        if (this.f52666b == 1) {
            v4.setTranslationY(this.f52665a + i4);
        }
    }

    public void J(@o0 V v4) {
        if (this.f52666b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f52668d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v4.clearAnimation();
        }
        this.f52666b = 1;
        H(v4, this.f52665a + this.f52667c, 175L, com.google.android.material.animation.a.f52468c);
    }

    public void K(@o0 V v4) {
        if (this.f52666b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f52668d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v4.clearAnimation();
        }
        this.f52666b = 2;
        H(v4, 0, 225L, com.google.android.material.animation.a.f52469d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, int i4) {
        this.f52665a = v4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v4.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void u(CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, int i4, int i5, int i6, int i7, int i10, @o0 int[] iArr) {
        if (i5 > 0) {
            J(v4);
        } else if (i5 < 0) {
            K(v4);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52665a = 0;
        this.f52666b = 2;
        this.f52667c = 0;
    }
}
