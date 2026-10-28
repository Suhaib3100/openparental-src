package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: AnimatorUtils.java */
/* loaded from: classes.dex */
class a {

    /* compiled from: AnimatorUtils.java */
    /* renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    interface InterfaceC0120a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    private a() {
    }

    static void a(@androidx.annotation.o0 Animator animator, @androidx.annotation.o0 AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    static void b(@androidx.annotation.o0 Animator animator) {
        animator.pause();
    }

    static void c(@androidx.annotation.o0 Animator animator) {
        animator.resume();
    }
}
