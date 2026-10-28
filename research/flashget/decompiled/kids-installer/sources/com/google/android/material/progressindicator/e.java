package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes3.dex */
final class e extends i<ObjectAnimator> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f13838l = 4;

    /* renamed from: m, reason: collision with root package name */
    private static final int f13839m = 5400;

    /* renamed from: n, reason: collision with root package name */
    private static final int f13840n = 667;

    /* renamed from: o, reason: collision with root package name */
    private static final int f13841o = 667;

    /* renamed from: p, reason: collision with root package name */
    private static final int f13842p = 333;

    /* renamed from: q, reason: collision with root package name */
    private static final int f13843q = 333;

    /* renamed from: u, reason: collision with root package name */
    private static final int f13847u = -20;

    /* renamed from: v, reason: collision with root package name */
    private static final int f13848v = 250;

    /* renamed from: w, reason: collision with root package name */
    private static final int f13849w = 1520;

    /* renamed from: d, reason: collision with root package name */
    private ObjectAnimator f13852d;

    /* renamed from: e, reason: collision with root package name */
    private ObjectAnimator f13853e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.interpolator.view.animation.b f13854f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.material.progressindicator.c f13855g;

    /* renamed from: h, reason: collision with root package name */
    private int f13856h;

    /* renamed from: i, reason: collision with root package name */
    private float f13857i;

    /* renamed from: j, reason: collision with root package name */
    private float f13858j;

    /* renamed from: k, reason: collision with root package name */
    b.a f13859k;

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f13844r = {0, 1350, 2700, 4050};

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f13845s = {667, 2017, 3367, 4717};

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f13846t = {1000, 2350, 3700, 5050};

    /* renamed from: x, reason: collision with root package name */
    private static final Property<e, Float> f13850x = new c(Float.class, ProtectedSandApp.s("✒"));

    /* renamed from: y, reason: collision with root package name */
    private static final Property<e, Float> f13851y = new d(Float.class, ProtectedSandApp.s("✓"));

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            e eVar = e.this;
            eVar.f13856h = (eVar.f13856h + 4) % e.this.f13855g.f13830c.length;
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes2.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.a();
            e eVar = e.this;
            eVar.f13859k.b(eVar.f13878a);
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes2.dex */
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
        public void set(e eVar, Float f6) {
            eVar.t(f6.floatValue());
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes2.dex */
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
        public void set(e eVar, Float f6) {
            e.n(eVar, f6.floatValue());
        }
    }

    public e(@o0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f13856h = 0;
        this.f13859k = null;
        this.f13855g = circularProgressIndicatorSpec;
        this.f13854f = new androidx.interpolator.view.animation.b();
    }

    static float l(e eVar) {
        return eVar.f13857i;
    }

    static float m(e eVar) {
        return eVar.f13858j;
    }

    static void n(e eVar, float f6) {
        eVar.f13858j = f6;
    }

    private float o() {
        return this.f13857i;
    }

    private float p() {
        return this.f13858j;
    }

    private void q() {
        if (this.f13852d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f13850x, 0.0f, 1.0f);
            this.f13852d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f13852d.setInterpolator(null);
            this.f13852d.setRepeatCount(-1);
            this.f13852d.addListener(new a());
        }
        if (this.f13853e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f13851y, 0.0f, 1.0f);
            this.f13853e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f13853e.setInterpolator(this.f13854f);
            this.f13853e.addListener(new b());
        }
    }

    private void r(int i5) {
        for (int i6 = 0; i6 < 4; i6++) {
            float f6 = (i5 - f13846t[i6]) / 333;
            if (f6 >= 0.0f && f6 <= 1.0f) {
                int i7 = i6 + this.f13856h;
                int[] iArr = this.f13855g.f13830c;
                int length = i7 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                this.f13880c[0] = com.google.android.material.animation.c.b().evaluate(this.f13854f.getInterpolation(f6), Integer.valueOf(p1.a.a(iArr[length], this.f13878a.getAlpha())), Integer.valueOf(p1.a.a(this.f13855g.f13830c[length2], this.f13878a.getAlpha()))).intValue();
                return;
            }
        }
    }

    private void u(float f6) {
        this.f13858j = f6;
    }

    private void v(int i5) {
        float[] fArr = this.f13879b;
        float f6 = this.f13857i;
        fArr[0] = (f6 * 1520.0f) - 20.0f;
        fArr[1] = f6 * 1520.0f;
        for (int i6 = 0; i6 < 4; i6++) {
            float f7 = 667;
            float[] fArr2 = this.f13879b;
            fArr2[1] = (this.f13854f.getInterpolation((i5 - f13844r[i6]) / f7) * 250.0f) + fArr2[1];
            float f8 = (i5 - f13845s[i6]) / f7;
            float[] fArr3 = this.f13879b;
            fArr3[0] = (this.f13854f.getInterpolation(f8) * 250.0f) + fArr3[0];
        }
        float[] fArr4 = this.f13879b;
        float f9 = fArr4[0];
        float f10 = fArr4[1];
        float f11 = ((f10 - f9) * this.f13858j) + f9;
        fArr4[0] = f11;
        fArr4[0] = f11 / 360.0f;
        fArr4[1] = f10 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    void a() {
        ObjectAnimator objectAnimator = this.f13852d;
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
        this.f13859k = aVar;
    }

    @Override // com.google.android.material.progressindicator.i
    void f() {
        if (this.f13853e.isRunning()) {
            return;
        }
        if (this.f13878a.isVisible()) {
            this.f13853e.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void g() {
        q();
        s();
        this.f13852d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f13859k = null;
    }

    @m1
    void s() {
        this.f13856h = 0;
        this.f13880c[0] = p1.a.a(this.f13855g.f13830c[0], this.f13878a.getAlpha());
        this.f13858j = 0.0f;
    }

    @m1
    void t(float f6) {
        this.f13857i = f6;
        int i5 = (int) (f6 * 5400.0f);
        v(i5);
        r(i5);
        this.f13878a.invalidateSelf();
    }
}
