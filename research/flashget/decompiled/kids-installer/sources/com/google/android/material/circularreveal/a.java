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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.circularreveal.c;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: com.google.android.material.circularreveal.a$a, reason: collision with other inner class name */
    static class C0170a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f13260a;

        C0170a(c cVar) {
            this.f13260a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13260a.h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13260a.d();
        }
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public static Animator a(@o0 c cVar, float f6, float f7, float f8) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0172c.f13278a, (TypeEvaluator) c.b.f13276b, (Object[]) new c.e[]{new c.e(f6, f7, f8)});
        c.e a6 = cVar.a();
        if (a6 == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ሎ"));
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f6, (int) f7, a6.f13283c, f8);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public static Animator b(c cVar, float f6, float f7, float f8, float f9) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0172c.f13278a, (TypeEvaluator) c.b.f13276b, (Object[]) new c.e[]{new c.e(f6, f7, f8), new c.e(f6, f7, f9)});
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f6, (int) f7, f8, f9);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    @o0
    public static Animator.AnimatorListener c(@o0 c cVar) {
        return new C0170a(cVar);
    }
}
