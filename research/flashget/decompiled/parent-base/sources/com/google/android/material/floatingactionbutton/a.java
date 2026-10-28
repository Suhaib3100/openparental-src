package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.q0;

/* compiled from: AnimatorTracker.java */
/* loaded from: classes6.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private Animator f53278a;

    a() {
    }

    public void a() {
        Animator animator = this.f53278a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f53278a = null;
    }

    public void c(Animator animator) {
        a();
        this.f53278a = animator;
    }
}
