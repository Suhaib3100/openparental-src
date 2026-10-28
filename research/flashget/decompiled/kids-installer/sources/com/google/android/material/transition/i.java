package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.transition.Visibility;
import androidx.transition.d0;

/* compiled from: Hold.java */
/* loaded from: classes3.dex */
public final class i extends Visibility {
    @Override // androidx.transition.Visibility
    @o0
    public Animator U0(@o0 ViewGroup viewGroup, @o0 View view, @q0 d0 d0Var, @q0 d0 d0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.Visibility
    @o0
    public Animator W0(@o0 ViewGroup viewGroup, @o0 View view, @q0 d0 d0Var, @q0 d0 d0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
