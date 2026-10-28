package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.material.animation.h;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;

/* compiled from: MotionStrategy.java */
/* loaded from: classes2.dex */
interface f {
    void a();

    h b();

    @androidx.annotation.b
    int c();

    void d();

    @q0
    h e();

    boolean f();

    void g(@o0 Animator.AnimatorListener animatorListener);

    void h(@o0 Animator.AnimatorListener animatorListener);

    void i();

    void j(@q0 h hVar);

    AnimatorSet k();

    List<Animator.AnimatorListener> l();

    void m(@q0 ExtendedFloatingActionButton.j jVar);

    void onAnimationStart(Animator animator);
}
