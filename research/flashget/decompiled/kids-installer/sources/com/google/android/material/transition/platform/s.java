package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: ScaleProvider.java */
@x0(21)
/* loaded from: classes3.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    private float f14946a;

    /* renamed from: b, reason: collision with root package name */
    private float f14947b;

    /* renamed from: c, reason: collision with root package name */
    private float f14948c;

    /* renamed from: d, reason: collision with root package name */
    private float f14949d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14950e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14951f;

    /* compiled from: ScaleProvider.java */
    /* loaded from: classes2.dex */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14952a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14953b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14954c;

        a(View view, float f6, float f7) {
            this.f14952a = view;
            this.f14953b = f6;
            this.f14954c = f7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14952a.setScaleX(this.f14953b);
            this.f14952a.setScaleY(this.f14954c);
        }
    }

    public s() {
        this(true);
    }

    private static Animator c(View view, float f6, float f7) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f6, scaleX * f7), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f6 * scaleY, f7 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        return this.f14950e ? c(view, this.f14948c, this.f14949d) : c(view, this.f14947b, this.f14946a);
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        if (this.f14951f) {
            return this.f14950e ? c(view, this.f14946a, this.f14947b) : c(view, this.f14949d, this.f14948c);
        }
        return null;
    }

    public float d() {
        return this.f14949d;
    }

    public float e() {
        return this.f14948c;
    }

    public float f() {
        return this.f14947b;
    }

    public float g() {
        return this.f14946a;
    }

    public boolean h() {
        return this.f14950e;
    }

    public boolean i() {
        return this.f14951f;
    }

    public void j(boolean z5) {
        this.f14950e = z5;
    }

    public void k(float f6) {
        this.f14949d = f6;
    }

    public void l(float f6) {
        this.f14948c = f6;
    }

    public void m(float f6) {
        this.f14947b = f6;
    }

    public void n(float f6) {
        this.f14946a = f6;
    }

    public void o(boolean z5) {
        this.f14951f = z5;
    }

    public s(boolean z5) {
        this.f14946a = 1.0f;
        this.f14947b = 1.1f;
        this.f14948c = 0.8f;
        this.f14949d = 1.0f;
        this.f14951f = true;
        this.f14950e = z5;
    }
}
