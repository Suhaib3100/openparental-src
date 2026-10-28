package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.progressindicator.c;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes3.dex */
public final class f<S extends c> extends g {
    private static final int K = 10000;
    private static final float L = 50.0f;
    private static final androidx.dynamicanimation.animation.d<f> M = new a(ProtectedSandApp.s("✗"));
    private h<S> F;
    private final androidx.dynamicanimation.animation.h G;
    private final androidx.dynamicanimation.animation.g H;
    private float I;
    private boolean J;

    /* compiled from: DeterminateDrawable.java */
    static class a extends androidx.dynamicanimation.animation.d<f> {
        a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(f fVar) {
            return f.w(fVar) * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(f fVar, float f6) {
            fVar.D(f6 / 10000.0f);
        }
    }

    f(@o0 Context context, @o0 c cVar, @o0 h<S> hVar) {
        super(context, cVar);
        this.J = false;
        C(hVar);
        androidx.dynamicanimation.animation.h hVar2 = new androidx.dynamicanimation.animation.h();
        this.G = hVar2;
        hVar2.g(1.0f);
        hVar2.i(50.0f);
        androidx.dynamicanimation.animation.g gVar = new androidx.dynamicanimation.animation.g(this, M);
        this.H = gVar;
        gVar.D(hVar2);
        o(1.0f);
    }

    private float B() {
        return this.I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(float f6) {
        this.I = f6;
        invalidateSelf();
    }

    static float w(f fVar) {
        return fVar.I;
    }

    @o0
    public static f<CircularProgressIndicatorSpec> y(@o0 Context context, @o0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new f<>(context, circularProgressIndicatorSpec, new d(circularProgressIndicatorSpec));
    }

    @o0
    public static f<LinearProgressIndicatorSpec> z(@o0 Context context, @o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new f<>(context, linearProgressIndicatorSpec, new k(linearProgressIndicatorSpec));
    }

    @o0
    h<S> A() {
        return this.F;
    }

    void C(@o0 h<S> hVar) {
        this.F = hVar;
        hVar.f(this);
    }

    void E(float f6) {
        setLevel((int) (f6 * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.g, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void b(@o0 b.a aVar) {
        super.b(aVar);
    }

    @Override // com.google.android.material.progressindicator.g, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ boolean c(@o0 b.a aVar) {
        return super.c(aVar);
    }

    @Override // com.google.android.material.progressindicator.g, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.F.g(canvas, i());
            this.F.c(canvas, this.A);
            this.F.b(canvas, this.A, 0.0f, this.I, p1.a.a(this.f13863p.f13830c[0], super.getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.F.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.F.e();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.H.d();
        D(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.g
    public boolean k() {
        return u(false, false, false);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        if (this.J) {
            this.H.d();
            D(i5 / 10000.0f);
            return true;
        }
        this.H.t(this.I * 10000.0f);
        this.H.z(i5);
        return true;
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i5) {
        super.setAlpha(i5);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@q0 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        return u(z5, z6, true);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean u(boolean z5, boolean z6, boolean z7) {
        return super.u(z5, z6, z7);
    }

    @Override // com.google.android.material.progressindicator.g
    boolean v(boolean z5, boolean z6, boolean z7) {
        boolean v5 = super.v(z5, z6, z7);
        float a6 = this.f13864q.a(this.f13862o.getContentResolver());
        if (a6 == 0.0f) {
            this.J = true;
        } else {
            this.J = false;
            this.G.i(50.0f / a6);
        }
        return v5;
    }
}
