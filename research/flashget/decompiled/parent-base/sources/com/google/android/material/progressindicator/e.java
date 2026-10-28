package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes6.dex */
final class e extends i<ObjectAnimator> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f53673l = 4;

    /* renamed from: m, reason: collision with root package name */
    private static final int f53674m = 5400;

    /* renamed from: n, reason: collision with root package name */
    private static final int f53675n = 667;

    /* renamed from: o, reason: collision with root package name */
    private static final int f53676o = 667;

    /* renamed from: p, reason: collision with root package name */
    private static final int f53677p = 333;

    /* renamed from: q, reason: collision with root package name */
    private static final int f53678q = 333;

    /* renamed from: u, reason: collision with root package name */
    private static final int f53682u = -20;

    /* renamed from: v, reason: collision with root package name */
    private static final int f53683v = 250;

    /* renamed from: w, reason: collision with root package name */
    private static final int f53684w = 1520;

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f53687d;

    /* renamed from: e, reason: collision with root package name */
    private ObjectAnimator f53688e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.interpolator.view.animation.b f53689f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.material.progressindicator.c f53690g;

    /* renamed from: h, reason: collision with root package name */
    private int f53691h;

    /* renamed from: i, reason: collision with root package name */
    private float f53692i;

    /* renamed from: j, reason: collision with root package name */
    private float f53693j;

    /* renamed from: k, reason: collision with root package name */
    b.a f53694k;

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f53679r = {0, 1350, 2700, 4050};

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f53680s = {667, 2017, 3367, 4717};

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f53681t = {1000, 2350, 3700, 5050};

    /* renamed from: x, reason: collision with root package name */
    private static final Property<e, Float> f53685x = new c(Float.class, ProtectedSandApp.s("\uf202"));

    /* renamed from: y, reason: collision with root package name */
    private static final Property<e, Float> f53686y = new d(Float.class, ProtectedSandApp.s("\uf203"));

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            e eVar = e.this;
            eVar.f53691h = (eVar.f53691h + 4) % e.this.f53690g.f53665c.length;
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.a();
            e eVar = e.this;
            eVar.f53694k.b(eVar.f53726a);
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    static class c extends Property<e, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(e.l(eVar));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f4) {
            eVar.t(f4.floatValue());
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    static class d extends Property<e, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(e.m(eVar));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f4) {
            e.n(eVar, f4.floatValue());
        }
    }

    public e(@o0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f53691h = 0;
        this.f53694k = null;
        this.f53690g = circularProgressIndicatorSpec;
        this.f53689f = new androidx.interpolator.view.animation.b();
    }

    static float l(e eVar) {
        return eVar.f53692i;
    }

    static float m(e eVar) {
        return eVar.f53693j;
    }

    static void n(e eVar, float f4) {
        eVar.f53693j = f4;
    }

    private float o() {
        return this.f53692i;
    }

    private float p() {
        return this.f53693j;
    }

    private void q() {
        if (this.f53687d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f53685x, 0.0f, 1.0f);
            this.f53687d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f53687d.setInterpolator(null);
            this.f53687d.setRepeatCount(-1);
            this.f53687d.addListener(new a());
        }
        if (this.f53688e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f53686y, 0.0f, 1.0f);
            this.f53688e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f53688e.setInterpolator(this.f53689f);
            this.f53688e.addListener(new b());
        }
    }

    private void r(int i4) {
        for (int i5 = 0; i5 < 4; i5++) {
            float b5 = b(i4, f53681t[i5], 333);
            if (b5 >= 0.0f && b5 <= 1.0f) {
                int i6 = i5 + this.f53691h;
                int[] iArr = this.f53690g.f53665c;
                int length = i6 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                this.f53728c[0] = com.google.android.material.animation.c.b().evaluate(this.f53689f.getInterpolation(b5), Integer.valueOf(u8.a.a(iArr[length], this.f53726a.getAlpha())), Integer.valueOf(u8.a.a(this.f53690g.f53665c[length2], this.f53726a.getAlpha()))).intValue();
                return;
            }
        }
    }

    private void u(float f4) {
        this.f53693j = f4;
    }

    private void v(int i4) {
        float[] fArr = this.f53727b;
        float f4 = this.f53692i;
        fArr[0] = (f4 * 1520.0f) - 20.0f;
        fArr[1] = f4 * 1520.0f;
        for (int i5 = 0; i5 < 4; i5++) {
            float b5 = b(i4, f53679r[i5], 667);
            float[] fArr2 = this.f53727b;
            fArr2[1] = (this.f53689f.getInterpolation(b5) * 250.0f) + fArr2[1];
            float b6 = b(i4, f53680s[i5], 667);
            float[] fArr3 = this.f53727b;
            fArr3[0] = (this.f53689f.getInterpolation(b6) * 250.0f) + fArr3[0];
        }
        float[] fArr4 = this.f53727b;
        float f5 = fArr4[0];
        float f6 = fArr4[1];
        float f7 = ((f6 - f5) * this.f53693j) + f5;
        fArr4[0] = f7;
        fArr4[0] = f7 / 360.0f;
        fArr4[1] = f6 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    void a() {
        ObjectAnimator objectAnimator = this.f53687d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        s();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(@o0 b.a aVar) {
        this.f53694k = aVar;
    }

    @Override // com.google.android.material.progressindicator.i
    void f() {
        if (this.f53688e.isRunning()) {
            return;
        }
        if (this.f53726a.isVisible()) {
            this.f53688e.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void g() {
        q();
        s();
        this.f53687d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f53694k = null;
    }

    @m1
    void s() {
        this.f53691h = 0;
        this.f53728c[0] = u8.a.a(this.f53690g.f53665c[0], this.f53726a.getAlpha());
        this.f53693j = 0.0f;
    }

    @m1
    void t(float f4) {
        this.f53692i = f4;
        int i4 = (int) (f4 * 5400.0f);
        v(i4);
        r(i4);
        this.f53726a.invalidateSelf();
    }
}
