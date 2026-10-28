package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.material.animation.h;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;

/* compiled from: MotionStrategy.java */
/* loaded from: classes6.dex */
interface f {
    h a();

    void b();

    @q0
    h c();

    boolean d();

    void e(@o0 Animator.AnimatorListener animatorListener);

    void f();

    @androidx.annotation.b
    int g();

    void h(@o0 Animator.AnimatorListener animatorListener);

    void i();

    void j(@q0 h hVar);

    AnimatorSet k();

    List<Animator.AnimatorListener> l();

    void m(@q0 ExtendedFloatingActionButton.j jVar);

    void onAnimationStart(Animator animator);
}
