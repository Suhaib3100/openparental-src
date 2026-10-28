package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.l0;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.annotation.x;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes3.dex */
public class g extends c implements Choreographer.FrameCallback {

    /* renamed from: k, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.k f39383k;

    /* renamed from: d, reason: collision with root package name */
    private float f39376d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39377e = false;

    /* renamed from: f, reason: collision with root package name */
    private long f39378f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f39379g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private int f39380h = 0;

    /* renamed from: i, reason: collision with root package name */
    private float f39381i = -2.1474836E9f;

    /* renamed from: j, reason: collision with root package name */
    private float f39382j = 2.1474836E9f;

    /* renamed from: l, reason: collision with root package name */
    @m1
    protected boolean f39384l = false;

    private void F() {
        if (this.f39383k == null) {
            return;
        }
        float f4 = this.f39379g;
        if (f4 < this.f39381i || f4 > this.f39382j) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("˵"), Float.valueOf(this.f39381i), Float.valueOf(this.f39382j), Float.valueOf(this.f39379g)));
        }
    }

    private float m() {
        com.airbnb.lottie.k kVar = this.f39383k;
        if (kVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / kVar.i()) / Math.abs(this.f39376d);
    }

    private boolean q() {
        return p() < 0.0f;
    }

    public void A(float f4) {
        if (this.f39379g == f4) {
            return;
        }
        this.f39379g = i.c(f4, o(), n());
        this.f39378f = 0L;
        f();
    }

    public void B(float f4) {
        C(this.f39381i, f4);
    }

    public void C(float f4, float f5) {
        if (f4 > f5) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("˶"), Float.valueOf(f4), Float.valueOf(f5)));
        }
        com.airbnb.lottie.k kVar = this.f39383k;
        float r4 = kVar == null ? -3.4028235E38f : kVar.r();
        com.airbnb.lottie.k kVar2 = this.f39383k;
        float f6 = kVar2 == null ? Float.MAX_VALUE : kVar2.f();
        float c5 = i.c(f4, r4, f6);
        float c6 = i.c(f5, r4, f6);
        if (c5 == this.f39381i && c6 == this.f39382j) {
            return;
        }
        this.f39381i = c5;
        this.f39382j = c6;
        A((int) i.c(this.f39379g, c5, c6));
    }

    public void D(int i4) {
        C(i4, (int) this.f39382j);
    }

    public void E(float f4) {
        this.f39376d = f4;
    }

    @Override // com.airbnb.lottie.utils.c
    void b() {
        super.b();
        c(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @l0
    public void cancel() {
        b();
        u();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j4) {
        t();
        if (this.f39383k == null || !isRunning()) {
            return;
        }
        String s4 = ProtectedSandApp.s("˷");
        com.airbnb.lottie.e.a(s4);
        float m4 = (this.f39378f != 0 ? j4 - r1 : 0L) / m();
        float f4 = this.f39379g;
        if (q()) {
            m4 = -m4;
        }
        float f5 = f4 + m4;
        this.f39379g = f5;
        boolean e4 = i.e(f5, o(), n());
        this.f39379g = i.c(this.f39379g, o(), n());
        this.f39378f = j4;
        f();
        if (!e4) {
            if (getRepeatCount() == -1 || this.f39380h < getRepeatCount()) {
                d();
                this.f39380h++;
                if (getRepeatMode() == 2) {
                    this.f39377e = !this.f39377e;
                    y();
                } else {
                    this.f39379g = q() ? n() : o();
                }
                this.f39378f = j4;
            } else {
                this.f39379g = this.f39376d < 0.0f ? o() : n();
                u();
                c(q());
            }
        }
        F();
        com.airbnb.lottie.e.b(s4);
    }

    public void g() {
        this.f39383k = null;
        this.f39381i = -2.1474836E9f;
        this.f39382j = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator
    @x(from = p.f60679p, to = 1.0d)
    public float getAnimatedFraction() {
        float o4;
        float n4;
        float o5;
        if (this.f39383k == null) {
            return 0.0f;
        }
        if (q()) {
            o4 = n() - this.f39379g;
            n4 = n();
            o5 = o();
        } else {
            o4 = this.f39379g - o();
            n4 = n();
            o5 = o();
        }
        return o4 / (n4 - o5);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(k());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.k kVar = this.f39383k;
        if (kVar == null) {
            return 0L;
        }
        return (long) kVar.d();
    }

    @l0
    public void i() {
        u();
        c(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f39384l;
    }

    @x(from = p.f60679p, to = 1.0d)
    public float k() {
        com.airbnb.lottie.k kVar = this.f39383k;
        if (kVar == null) {
            return 0.0f;
        }
        return (this.f39379g - kVar.r()) / (this.f39383k.f() - this.f39383k.r());
    }

    public float l() {
        return this.f39379g;
    }

    public float n() {
        com.airbnb.lottie.k kVar = this.f39383k;
        if (kVar == null) {
            return 0.0f;
        }
        float f4 = this.f39382j;
        return f4 == 2.1474836E9f ? kVar.f() : f4;
    }

    public float o() {
        com.airbnb.lottie.k kVar = this.f39383k;
        if (kVar == null) {
            return 0.0f;
        }
        float f4 = this.f39381i;
        return f4 == -2.1474836E9f ? kVar.r() : f4;
    }

    public float p() {
        return this.f39376d;
    }

    @l0
    public void r() {
        u();
    }

    @l0
    public void s() {
        this.f39384l = true;
        e(q());
        A((int) (q() ? n() : o()));
        this.f39378f = 0L;
        this.f39380h = 0;
        t();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i4) {
        super.setRepeatMode(i4);
        if (i4 == 2 || !this.f39377e) {
            return;
        }
        this.f39377e = false;
        y();
    }

    protected void t() {
        if (isRunning()) {
            v(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @l0
    protected void u() {
        v(true);
    }

    @l0
    protected void v(boolean z4) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z4) {
            this.f39384l = false;
        }
    }

    @l0
    public void w() {
        this.f39384l = true;
        t();
        this.f39378f = 0L;
        if (q() && l() == o()) {
            this.f39379g = n();
        } else {
            if (q() || l() != n()) {
                return;
            }
            this.f39379g = o();
        }
    }

    public void y() {
        E(-p());
    }

    public void z(com.airbnb.lottie.k kVar) {
        boolean z4 = this.f39383k == null;
        this.f39383k = kVar;
        if (z4) {
            C((int) Math.max(this.f39381i, kVar.r()), (int) Math.min(this.f39382j, kVar.f()));
        } else {
            C((int) kVar.r(), (int) kVar.f());
        }
        float f4 = this.f39379g;
        this.f39379g = 0.0f;
        A((int) f4);
        f();
    }
}
