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
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import s8.a;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes6.dex */
final class m extends i<ObjectAnimator> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f53744l = 1800;

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f53745m = {533, 567, 850, 750};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f53746n = {1267, 1000, 333, 0};

    /* renamed from: o, reason: collision with root package name */
    private static final Property<m, Float> f53747o = new b(Float.class, ProtectedSandApp.s("\uf209"));

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f53748d;

    /* renamed from: e, reason: collision with root package name */
    private final Interpolator[] f53749e;

    /* renamed from: f, reason: collision with root package name */
    private final c f53750f;

    /* renamed from: g, reason: collision with root package name */
    private int f53751g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f53752h;

    /* renamed from: i, reason: collision with root package name */
    private float f53753i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f53754j;

    /* renamed from: k, reason: collision with root package name */
    b.a f53755k;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (m.this.f53754j) {
                m.this.f53748d.setRepeatCount(-1);
                m mVar = m.this;
                mVar.f53755k.b(mVar.f53726a);
                m.this.f53754j = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            m mVar = m.this;
            mVar.f53751g = (mVar.f53751g + 1) % m.this.f53750f.f53665c.length;
            m.this.f53752h = true;
        }
    }

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
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
        public void set(m mVar, Float f4) {
            mVar.u(f4.floatValue());
        }
    }

    public m(@o0 Context context, @o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f53751g = 0;
        this.f53755k = null;
        this.f53750f = linearProgressIndicatorSpec;
        this.f53749e = new Interpolator[]{AnimationUtils.loadInterpolator(context, a.b.f90306d), AnimationUtils.loadInterpolator(context, a.b.f90307e), AnimationUtils.loadInterpolator(context, a.b.f90308f), AnimationUtils.loadInterpolator(context, a.b.f90309g)};
    }

    static float p(m mVar) {
        return mVar.f53753i;
    }

    private float q() {
        return this.f53753i;
    }

    private void r() {
        if (this.f53748d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f53747o, 0.0f, 1.0f);
            this.f53748d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f53748d.setInterpolator(null);
            this.f53748d.setRepeatCount(-1);
            this.f53748d.addListener(new a());
        }
    }

    private void s() {
        if (this.f53752h) {
            Arrays.fill(this.f53728c, u8.a.a(this.f53750f.f53665c[this.f53751g], this.f53726a.getAlpha()));
            this.f53752h = false;
        }
    }

    private void v(int i4) {
        for (int i5 = 0; i5 < 4; i5++) {
            this.f53727b[i5] = Math.max(0.0f, Math.min(1.0f, this.f53749e[i5].getInterpolation(b(i4, f53746n[i5], f53745m[i5]))));
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f53748d;
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
        this.f53755k = aVar;
    }

    @Override // com.google.android.material.progressindicator.i
    public void f() {
        if (!this.f53726a.isVisible()) {
            a();
        } else {
            this.f53754j = true;
            this.f53748d.setRepeatCount(0);
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void g() {
        r();
        t();
        this.f53748d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f53755k = null;
    }

    @m1
    void t() {
        this.f53751g = 0;
        int a5 = u8.a.a(this.f53750f.f53665c[0], this.f53726a.getAlpha());
        int[] iArr = this.f53728c;
        iArr[0] = a5;
        iArr[1] = a5;
    }

    @m1
    void u(float f4) {
        this.f53753i = f4;
        v((int) (f4 * 1800.0f));
        s();
        this.f53726a.invalidateSelf();
    }
}
