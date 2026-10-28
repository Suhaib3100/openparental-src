package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.transition.Visibility;
import androidx.transition.b0;

/* compiled from: Hold.java */
/* loaded from: classes6.dex */
public final class i extends Visibility {
    @Override // androidx.transition.Visibility
    @o0
    public Animator P0(@o0 ViewGroup viewGroup, @o0 View view, @q0 b0 b0Var, @q0 b0 b0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.Visibility
    @o0
    public Animator R0(@o0 ViewGroup viewGroup, @o0 View view, @q0 b0 b0Var, @q0 b0 b0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
