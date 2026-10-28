package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.circularreveal.c;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes6.dex */
public final class a {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: com.google.android.material.circularreveal.a$a, reason: collision with other inner class name */
    static class C0804a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f53012b;

        C0804a(c cVar) {
            this.f53012b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f53012b.g();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f53012b.b();
        }
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public static Animator a(@o0 c cVar, float f4, float f5, float f6) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0806c.f53030a, (TypeEvaluator) c.b.f53028b, (Object[]) new c.e[]{new c.e(f4, f5, f6)});
        c.e a5 = cVar.a();
        if (a5 == null) {
            throw new IllegalStateException(ProtectedSandApp.s("\uf18d"));
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f4, (int) f5, a5.f53035c, f6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public static Animator b(c cVar, float f4, float f5, float f6, float f7) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0806c.f53030a, (TypeEvaluator) c.b.f53028b, (Object[]) new c.e[]{new c.e(f4, f5, f6), new c.e(f4, f5, f7)});
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f4, (int) f5, f6, f7);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    @o0
    public static Animator.AnimatorListener c(@o0 c cVar) {
        return new C0804a(cVar);
    }
}
