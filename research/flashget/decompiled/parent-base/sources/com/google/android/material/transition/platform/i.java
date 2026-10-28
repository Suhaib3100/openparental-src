package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: Hold.java */
@x0(21)
/* loaded from: classes6.dex */
public final class i extends Visibility {
    @Override // android.transition.Visibility
    @o0
    public Animator onAppear(@o0 ViewGroup viewGroup, @o0 View view, @q0 TransitionValues transitionValues, @q0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @o0
    public Animator onDisappear(@o0 ViewGroup viewGroup, @o0 View view, @q0 TransitionValues transitionValues, @q0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
