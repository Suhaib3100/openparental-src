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
/* loaded from: classes6.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    private float f54785a;

    /* renamed from: b, reason: collision with root package name */
    private float f54786b;

    /* renamed from: c, reason: collision with root package name */
    private float f54787c;

    /* renamed from: d, reason: collision with root package name */
    private float f54788d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f54789e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f54790f;

    /* compiled from: ScaleProvider.java */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54791b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54792c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f54793d;

        a(View view, float f4, float f5) {
            this.f54791b = view;
            this.f54792c = f4;
            this.f54793d = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54791b.setScaleX(this.f54792c);
            this.f54791b.setScaleY(this.f54793d);
        }
    }

    public s() {
        this(true);
    }

    private static Animator c(View view, float f4, float f5) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f4, scaleX * f5), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f4 * scaleY, f5 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        if (this.f54790f) {
            return this.f54789e ? c(view, this.f54785a, this.f54786b) : c(view, this.f54788d, this.f54787c);
        }
        return null;
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        return this.f54789e ? c(view, this.f54787c, this.f54788d) : c(view, this.f54786b, this.f54785a);
    }

    public float d() {
        return this.f54788d;
    }

    public float e() {
        return this.f54787c;
    }

    public float f() {
        return this.f54786b;
    }

    public float g() {
        return this.f54785a;
    }

    public boolean h() {
        return this.f54789e;
    }

    public boolean i() {
        return this.f54790f;
    }

    public void j(boolean z4) {
        this.f54789e = z4;
    }

    public void k(float f4) {
        this.f54788d = f4;
    }

    public void l(float f4) {
        this.f54787c = f4;
    }

    public void m(float f4) {
        this.f54786b = f4;
    }

    public void n(float f4) {
        this.f54785a = f4;
    }

    public void o(boolean z4) {
        this.f54790f = z4;
    }

    public s(boolean z4) {
        this.f54785a = 1.0f;
        this.f54786b = 1.1f;
        this.f54787c = 0.8f;
        this.f54788d = 1.0f;
        this.f54790f = true;
        this.f54789e = z4;
    }
}
