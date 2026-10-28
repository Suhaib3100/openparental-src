package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes6.dex */
final class l extends i<ObjectAnimator> {

    /* renamed from: j, reason: collision with root package name */
    private static final int f53734j = 667;

    /* renamed from: k, reason: collision with root package name */
    private static final int f53735k = 333;

    /* renamed from: l, reason: collision with root package name */
    private static final Property<l, Float> f53736l = new b(Float.class, ProtectedSandApp.s("\uf208"));

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f53737d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.interpolator.view.animation.b f53738e;

    /* renamed from: f, reason: collision with root package name */
    private final c f53739f;

    /* renamed from: g, reason: collision with root package name */
    private int f53740g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f53741h;

    /* renamed from: i, reason: collision with root package name */
    private float f53742i;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            l lVar = l.this;
            lVar.f53740g = (lVar.f53740g + 1) % l.this.f53739f.f53665c.length;
            l.this.f53741h = true;
        }
    }

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
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
        public void set(l lVar, Float f4) {
            lVar.r(f4.floatValue());
        }
    }

    public l(@o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f53740g = 1;
        this.f53739f = linearProgressIndicatorSpec;
        this.f53738e = new androidx.interpolator.view.animation.b();
    }

    static float m(l lVar) {
        return lVar.f53742i;
    }

    private float n() {
        return this.f53742i;
    }

    private void o() {
        if (this.f53737d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f53736l, 0.0f, 1.0f);
            this.f53737d = ofFloat;
            ofFloat.setDuration(333L);
            this.f53737d.setInterpolator(null);
            this.f53737d.setRepeatCount(-1);
            this.f53737d.addListener(new a());
        }
    }

    private void p() {
        if (!this.f53741h || this.f53727b[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.f53728c;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = u8.a.a(this.f53739f.f53665c[this.f53740g], this.f53726a.getAlpha());
        this.f53741h = false;
    }

    private void s(int i4) {
        this.f53727b[0] = 0.0f;
        float b5 = b(i4, 0, f53734j);
        float[] fArr = this.f53727b;
        float interpolation = this.f53738e.getInterpolation(b5);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f53727b;
        float interpolation2 = this.f53738e.getInterpolation(b5 + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f53727b[5] = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f53737d;
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
        this.f53737d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
    }

    @m1
    void q() {
        this.f53741h = true;
        this.f53740g = 1;
        Arrays.fill(this.f53728c, u8.a.a(this.f53739f.f53665c[0], this.f53726a.getAlpha()));
    }

    @m1
    void r(float f4) {
        this.f53742i = f4;
        s((int) (f4 * 333.0f));
        p();
        this.f53726a.invalidateSelf();
    }
}
