package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes3.dex */
abstract class g extends Drawable implements androidx.vectordrawable.graphics.drawable.b {
    private static final boolean C = false;
    private static final int D = 500;
    private static final Property<g, Float> E = new c(Float.class, ProtectedSandApp.s("✔"));
    private int B;

    /* renamed from: o, reason: collision with root package name */
    final Context f13862o;

    /* renamed from: p, reason: collision with root package name */
    final com.google.android.material.progressindicator.c f13863p;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f13865r;

    /* renamed from: s, reason: collision with root package name */
    private ValueAnimator f13866s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13867t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13868u;

    /* renamed from: v, reason: collision with root package name */
    private float f13869v;

    /* renamed from: w, reason: collision with root package name */
    private List<b.a> f13870w;

    /* renamed from: x, reason: collision with root package name */
    private b.a f13871x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13872y;

    /* renamed from: z, reason: collision with root package name */
    private float f13873z;
    final Paint A = new Paint();

    /* renamed from: q, reason: collision with root package name */
    com.google.android.material.progressindicator.a f13864q = new com.google.android.material.progressindicator.a();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.g();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes2.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.f();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes2.dex */
    static class c extends Property<g, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(g gVar) {
            return Float.valueOf(gVar.i());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(g gVar, Float f6) {
            gVar.o(f6.floatValue());
        }
    }

    g(@o0 Context context, @o0 com.google.android.material.progressindicator.c cVar) {
        this.f13862o = context;
        this.f13863p = cVar;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        b.a aVar = this.f13871x;
        if (aVar != null) {
            aVar.b(this);
        }
        List<b.a> list = this.f13870w;
        if (list == null || this.f13872y) {
            return;
        }
        Iterator<b.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        b.a aVar = this.f13871x;
        if (aVar != null) {
            aVar.c(this);
        }
        List<b.a> list = this.f13870w;
        if (list == null || this.f13872y) {
            return;
        }
        Iterator<b.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    private void h(@o0 ValueAnimator... valueAnimatorArr) {
        boolean z5 = this.f13872y;
        this.f13872y = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f13872y = z5;
    }

    private void n() {
        if (this.f13865r == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, E, 0.0f, 1.0f);
            this.f13865r = ofFloat;
            ofFloat.setDuration(500L);
            this.f13865r.setInterpolator(com.google.android.material.animation.a.f12779b);
            t(this.f13865r);
        }
        if (this.f13866s == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, E, 1.0f, 0.0f);
            this.f13866s = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f13866s.setInterpolator(com.google.android.material.animation.a.f12779b);
            p(this.f13866s);
        }
    }

    private void p(@o0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f13866s;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("✕"));
        }
        this.f13866s = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void t(@o0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f13865r;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("✖"));
        }
        this.f13865r = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public void b(@o0 b.a aVar) {
        if (this.f13870w == null) {
            this.f13870w = new ArrayList();
        }
        if (this.f13870w.contains(aVar)) {
            return;
        }
        this.f13870w.add(aVar);
    }

    public boolean c(@o0 b.a aVar) {
        List<b.a> list = this.f13870w;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.f13870w.remove(aVar);
        if (!this.f13870w.isEmpty()) {
            return true;
        }
        this.f13870w = null;
        return true;
    }

    public void clearAnimationCallbacks() {
        this.f13870w.clear();
        this.f13870w = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    float i() {
        if (this.f13863p.b() || this.f13863p.a()) {
            return (this.f13868u || this.f13867t) ? this.f13869v : this.f13873z;
        }
        return 1.0f;
    }

    public boolean isRunning() {
        return m() || l();
    }

    @o0
    ValueAnimator j() {
        return this.f13866s;
    }

    public boolean k() {
        return u(false, false, false);
    }

    public boolean l() {
        ValueAnimator valueAnimator = this.f13866s;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f13868u;
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.f13865r;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f13867t;
    }

    void o(@x(from = 0.0d, to = 1.0d) float f6) {
        if (this.f13873z != f6) {
            this.f13873z = f6;
            invalidateSelf();
        }
    }

    void q(@o0 b.a aVar) {
        this.f13871x = aVar;
    }

    @m1
    void r(boolean z5, @x(from = 0.0d, to = 1.0d) float f6) {
        this.f13868u = z5;
        this.f13869v = f6;
    }

    @m1
    void s(boolean z5, @x(from = 0.0d, to = 1.0d) float f6) {
        this.f13867t = z5;
        this.f13869v = f6;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.B = i5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        this.A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        return u(z5, z6, true);
    }

    public void start() {
        v(true, true, false);
    }

    public void stop() {
        v(false, true, false);
    }

    public boolean u(boolean z5, boolean z6, boolean z7) {
        return v(z5, z6, z7 && this.f13864q.a(this.f13862o.getContentResolver()) > 0.0f);
    }

    boolean v(boolean z5, boolean z6, boolean z7) {
        n();
        if (!isVisible() && !z5) {
            return false;
        }
        ValueAnimator valueAnimator = z5 ? this.f13865r : this.f13866s;
        if (!z7) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                h(valueAnimator);
            }
            return super.setVisible(z5, false);
        }
        if (z7 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z8 = !z5 || super.setVisible(z5, false);
        if (!(z5 ? this.f13863p.b() : this.f13863p.a())) {
            h(valueAnimator);
            return z8;
        }
        if (z6 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z8;
    }
}
