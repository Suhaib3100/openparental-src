package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import n1.a;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes3.dex */
final class m extends i<ObjectAnimator> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f13894l = 1800;

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f13895m = {533, 567, 850, 750};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f13896n = {1267, 1000, 333, 0};

    /* renamed from: o, reason: collision with root package name */
    private static final Property<m, Float> f13897o = new b(Float.class, ProtectedSandApp.s("✙"));

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f13898d;

    /* renamed from: e, reason: collision with root package name */
    private final Interpolator[] f13899e;

    /* renamed from: f, reason: collision with root package name */
    private final c f13900f;

    /* renamed from: g, reason: collision with root package name */
    private int f13901g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13902h;

    /* renamed from: i, reason: collision with root package name */
    private float f13903i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13904j;

    /* renamed from: k, reason: collision with root package name */
    b.a f13905k;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (m.this.f13904j) {
                m.this.f13898d.setRepeatCount(-1);
                m mVar = m.this;
                mVar.f13905k.b(mVar.f13878a);
                m.this.f13904j = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            m mVar = m.this;
            mVar.f13901g = (mVar.f13901g + 1) % m.this.f13900f.f13830c.length;
            m.this.f13902h = true;
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    static class b extends Property<m, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(m mVar) {
            return Float.valueOf(m.p(mVar));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(m mVar, Float f6) {
            mVar.u(f6.floatValue());
        }
    }

    public m(@o0 Context context, @o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f13901g = 0;
        this.f13905k = null;
        this.f13900f = linearProgressIndicatorSpec;
        this.f13899e = new Interpolator[]{AnimationUtils.loadInterpolator(context, a.b.f29151d), AnimationUtils.loadInterpolator(context, a.b.f29152e), AnimationUtils.loadInterpolator(context, a.b.f29153f), AnimationUtils.loadInterpolator(context, a.b.f29154g)};
    }

    static float p(m mVar) {
        return mVar.f13903i;
    }

    private float q() {
        return this.f13903i;
    }

    private void r() {
        if (this.f13898d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f13897o, 0.0f, 1.0f);
            this.f13898d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f13898d.setInterpolator(null);
            this.f13898d.setRepeatCount(-1);
            this.f13898d.addListener(new a());
        }
    }

    private void s() {
        if (this.f13902h) {
            Arrays.fill(this.f13880c, p1.a.a(this.f13900f.f13830c[this.f13901g], this.f13878a.getAlpha()));
            this.f13902h = false;
        }
    }

    private void v(int i5) {
        for (int i6 = 0; i6 < 4; i6++) {
            this.f13879b[i6] = Math.max(0.0f, Math.min(1.0f, this.f13899e[i6].getInterpolation((i5 - f13896n[i6]) / f13895m[i6])));
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f13898d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        t();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(@o0 b.a aVar) {
        this.f13905k = aVar;
    }

    @Override // com.google.android.material.progressindicator.i
    public void f() {
        if (!this.f13878a.isVisible()) {
            a();
        } else {
            this.f13904j = true;
            this.f13898d.setRepeatCount(0);
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void g() {
        r();
        t();
        this.f13898d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f13905k = null;
    }

    @m1
    void t() {
        this.f13901g = 0;
        int a6 = p1.a.a(this.f13900f.f13830c[0], this.f13878a.getAlpha());
        int[] iArr = this.f13880c;
        iArr[0] = a6;
        iArr[1] = a6;
    }

    @m1
    void u(float f6) {
        this.f13903i = f6;
        v((int) (f6 * 1800.0f));
        s();
        this.f13878a.invalidateSelf();
    }
}
