package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes3.dex */
final class l extends i<ObjectAnimator> {

    /* renamed from: j, reason: collision with root package name */
    private static final int f13884j = 667;

    /* renamed from: k, reason: collision with root package name */
    private static final int f13885k = 333;

    /* renamed from: l, reason: collision with root package name */
    private static final Property<l, Float> f13886l = new b(Float.class, ProtectedSandApp.s("✘"));

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f13887d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.interpolator.view.animation.b f13888e;

    /* renamed from: f, reason: collision with root package name */
    private final c f13889f;

    /* renamed from: g, reason: collision with root package name */
    private int f13890g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13891h;

    /* renamed from: i, reason: collision with root package name */
    private float f13892i;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            l lVar = l.this;
            lVar.f13890g = (lVar.f13890g + 1) % l.this.f13889f.f13830c.length;
            l.this.f13891h = true;
        }
    }

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    static class b extends Property<l, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(l lVar) {
            return Float.valueOf(l.m(lVar));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(l lVar, Float f6) {
            lVar.r(f6.floatValue());
        }
    }

    public l(@o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f13890g = 1;
        this.f13889f = linearProgressIndicatorSpec;
        this.f13888e = new androidx.interpolator.view.animation.b();
    }

    static float m(l lVar) {
        return lVar.f13892i;
    }

    private float n() {
        return this.f13892i;
    }

    private void o() {
        if (this.f13887d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f13886l, 0.0f, 1.0f);
            this.f13887d = ofFloat;
            ofFloat.setDuration(333L);
            this.f13887d.setInterpolator(null);
            this.f13887d.setRepeatCount(-1);
            this.f13887d.addListener(new a());
        }
    }

    private void p() {
        if (!this.f13891h || this.f13879b[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.f13880c;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = p1.a.a(this.f13889f.f13830c[this.f13890g], this.f13878a.getAlpha());
        this.f13891h = false;
    }

    private void s(int i5) {
        float[] fArr = this.f13879b;
        fArr[0] = 0.0f;
        float f6 = (i5 - 0) / f13884j;
        float interpolation = this.f13888e.getInterpolation(f6);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f13879b;
        float interpolation2 = this.f13888e.getInterpolation(f6 + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f13879b[5] = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f13887d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(@q0 b.a aVar) {
    }

    @Override // com.google.android.material.progressindicator.i
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.i
    public void g() {
        o();
        q();
        this.f13887d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
    }

    @m1
    void q() {
        this.f13891h = true;
        this.f13890g = 1;
        Arrays.fill(this.f13880c, p1.a.a(this.f13889f.f13830c[0], this.f13878a.getAlpha()));
    }

    @m1
    void r(float f6) {
        this.f13892i = f6;
        s((int) (f6 * 333.0f));
        p();
        this.f13878a.invalidateSelf();
    }
}
