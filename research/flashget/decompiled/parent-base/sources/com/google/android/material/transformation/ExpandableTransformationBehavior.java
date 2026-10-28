package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q0;

@Deprecated
/* loaded from: classes6.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: e, reason: collision with root package name */
    @q0
    private AnimatorSet f54514e;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f54514e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean K(View view, View view2, boolean z4, boolean z5) {
        AnimatorSet animatorSet = this.f54514e;
        boolean z6 = animatorSet != null;
        if (z6) {
            animatorSet.cancel();
        }
        AnimatorSet M = M(view, view2, z4, z6);
        this.f54514e = M;
        M.addListener(new a());
        this.f54514e.start();
        if (!z5) {
            this.f54514e.end();
        }
        return true;
    }

    @o0
    protected abstract AnimatorSet M(View view, View view2, boolean z4, boolean z5);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
