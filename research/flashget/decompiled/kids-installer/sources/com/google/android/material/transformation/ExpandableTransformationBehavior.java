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
/* loaded from: classes3.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: e, reason: collision with root package name */
    @q0
    private AnimatorSet f14675e;

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f14675e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean K(View view, View view2, boolean z5, boolean z6) {
        AnimatorSet animatorSet = this.f14675e;
        boolean z7 = animatorSet != null;
        if (z7) {
            animatorSet.cancel();
        }
        AnimatorSet M = M(view, view2, z5, z7);
        this.f14675e = M;
        M.addListener(new a());
        this.f14675e.start();
        if (!z6) {
            this.f14675e.end();
        }
        return true;
    }

    @o0
    protected abstract AnimatorSet M(View view, View view2, boolean z5, boolean z6);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
