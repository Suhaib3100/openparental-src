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
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes6.dex */
abstract class g extends Drawable implements androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: p, reason: collision with root package name */
    private static final boolean f53705p = false;

    /* renamed from: q, reason: collision with root package name */
    private static final int f53706q = 500;

    /* renamed from: r, reason: collision with root package name */
    private static final Property<g, Float> f53707r = new c(Float.class, ProtectedSandApp.s("\uf204"));

    /* renamed from: b, reason: collision with root package name */
    final Context f53708b;

    /* renamed from: c, reason: collision with root package name */
    final com.google.android.material.progressindicator.c f53709c;

    /* renamed from: e, reason: collision with root package name */
    private ValueAnimator f53711e;

    /* renamed from: f, reason: collision with root package name */
    private ValueAnimator f53712f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f53713g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f53714h;

    /* renamed from: i, reason: collision with root package name */
    private float f53715i;

    /* renamed from: j, reason: collision with root package name */
    private List<b.a> f53716j;

    /* renamed from: k, reason: collision with root package name */
    private b.a f53717k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f53718l;

    /* renamed from: m, reason: collision with root package name */
    private float f53719m;

    /* renamed from: o, reason: collision with root package name */
    private int f53721o;

    /* renamed from: n, reason: collision with root package name */
    final Paint f53720n = new Paint();

    /* renamed from: d, reason: collision with root package name */
    com.google.android.material.progressindicator.a f53710d = new com.google.android.material.progressindicator.a();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.h();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.g();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    static class c extends Property<g, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(g gVar) {
            return Float.valueOf(gVar.j());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(g gVar, Float f4) {
            gVar.p(f4.floatValue());
        }
    }

    g(@o0 Context context, @o0 com.google.android.material.progressindicator.c cVar) {
        this.f53708b = context;
        this.f53709c = cVar;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        b.a aVar = this.f53717k;
        if (aVar != null) {
            aVar.b(this);
        }
        List<b.a> list = this.f53716j;
        if (list == null || this.f53718l) {
            return;
        }
        Iterator<b.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        b.a aVar = this.f53717k;
        if (aVar != null) {
            aVar.c(this);
        }
        List<b.a> list = this.f53716j;
        if (list == null || this.f53718l) {
            return;
        }
        Iterator<b.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    private void i(@o0 ValueAnimator... valueAnimatorArr) {
        boolean z4 = this.f53718l;
        this.f53718l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f53718l = z4;
    }

    private void o() {
        if (this.f53711e == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f53707r, 0.0f, 1.0f);
            this.f53711e = ofFloat;
            ofFloat.setDuration(500L);
            this.f53711e.setInterpolator(com.google.android.material.animation.a.f52467b);
            u(this.f53711e);
        }
        if (this.f53712f == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f53707r, 1.0f, 0.0f);
            this.f53712f = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f53712f.setInterpolator(com.google.android.material.animation.a.f52467b);
            q(this.f53712f);
        }
    }

    private void q(@o0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f53712f;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf205"));
        }
        this.f53712f = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void u(@o0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f53711e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf206"));
        }
        this.f53711e = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public void b(@o0 b.a aVar) {
        if (this.f53716j == null) {
            this.f53716j = new ArrayList();
        }
        if (this.f53716j.contains(aVar)) {
            return;
        }
        this.f53716j.add(aVar);
    }

    public void d() {
        this.f53716j.clear();
        this.f53716j = null;
    }

    public boolean e(@o0 b.a aVar) {
        List<b.a> list = this.f53716j;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.f53716j.remove(aVar);
        if (!this.f53716j.isEmpty()) {
            return true;
        }
        this.f53716j = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f53721o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return n() || m();
    }

    float j() {
        if (this.f53709c.b() || this.f53709c.a()) {
            return (this.f53714h || this.f53713g) ? this.f53715i : this.f53719m;
        }
        return 1.0f;
    }

    @o0
    ValueAnimator k() {
        return this.f53712f;
    }

    public boolean l() {
        return v(false, false, false);
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.f53712f;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f53714h;
    }

    public boolean n() {
        ValueAnimator valueAnimator = this.f53711e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f53713g;
    }

    void p(@x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f53719m != f4) {
            this.f53719m = f4;
            invalidateSelf();
        }
    }

    void r(@o0 b.a aVar) {
        this.f53717k = aVar;
    }

    @m1
    void s(boolean z4, @x(from = 0.0d, to = 1.0d) float f4) {
        this.f53714h = z4;
        this.f53715i = f4;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f53721o = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        this.f53720n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        return v(z4, z5, true);
    }

    public void start() {
        w(true, true, false);
    }

    public void stop() {
        w(false, true, false);
    }

    @m1
    void t(boolean z4, @x(from = 0.0d, to = 1.0d) float f4) {
        this.f53713g = z4;
        this.f53715i = f4;
    }

    public boolean v(boolean z4, boolean z5, boolean z6) {
        return w(z4, z5, z6 && this.f53710d.a(this.f53708b.getContentResolver()) > 0.0f);
    }

    boolean w(boolean z4, boolean z5, boolean z6) {
        o();
        if (!isVisible() && !z4) {
            return false;
        }
        ValueAnimator valueAnimator = z4 ? this.f53711e : this.f53712f;
        if (!z6) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                i(valueAnimator);
            }
            return super.setVisible(z4, false);
        }
        if (z6 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z7 = !z4 || super.setVisible(z4, false);
        if (!(z4 ? this.f53709c.b() : this.f53709c.a())) {
            i(valueAnimator);
            return z7;
        }
        if (z5 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z7;
    }
}
