package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.progressindicator.c;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes6.dex */
public final class f<S extends c> extends g {

    /* renamed from: x, reason: collision with root package name */
    private static final int f53697x = 10000;

    /* renamed from: y, reason: collision with root package name */
    private static final float f53698y = 50.0f;

    /* renamed from: z, reason: collision with root package name */
    private static final androidx.dynamicanimation.animation.d<f> f53699z = new a(ProtectedSandApp.s("\uf207"));

    /* renamed from: s, reason: collision with root package name */
    private h<S> f53700s;

    /* renamed from: t, reason: collision with root package name */
    private final androidx.dynamicanimation.animation.h f53701t;

    /* renamed from: u, reason: collision with root package name */
    private final androidx.dynamicanimation.animation.g f53702u;

    /* renamed from: v, reason: collision with root package name */
    private float f53703v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f53704w;

    /* compiled from: DeterminateDrawable.java */
    static class a extends androidx.dynamicanimation.animation.d<f> {
        a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(f fVar) {
            return f.x(fVar) * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(f fVar, float f4) {
            fVar.E(f4 / 10000.0f);
        }
    }

    f(@o0 Context context, @o0 c cVar, @o0 h<S> hVar) {
        super(context, cVar);
        this.f53704w = false;
        D(hVar);
        androidx.dynamicanimation.animation.h hVar2 = new androidx.dynamicanimation.animation.h();
        this.f53701t = hVar2;
        hVar2.g(1.0f);
        hVar2.i(50.0f);
        androidx.dynamicanimation.animation.g gVar = new androidx.dynamicanimation.animation.g(this, f53699z);
        this.f53702u = gVar;
        gVar.D(hVar2);
        p(1.0f);
    }

    @o0
    public static f<LinearProgressIndicatorSpec> A(@o0 Context context, @o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new f<>(context, linearProgressIndicatorSpec, new k(linearProgressIndicatorSpec));
    }

    private float C() {
        return this.f53703v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(float f4) {
        this.f53703v = f4;
        invalidateSelf();
    }

    static float x(f fVar) {
        return fVar.f53703v;
    }

    @o0
    public static f<CircularProgressIndicatorSpec> z(@o0 Context context, @o0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new f<>(context, circularProgressIndicatorSpec, new d(circularProgressIndicatorSpec));
    }

    @o0
    h<S> B() {
        return this.f53700s;
    }

    void D(@o0 h<S> hVar) {
        this.f53700s = hVar;
        hVar.f(this);
    }

    void F(float f4) {
        setLevel((int) (f4 * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.g, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void b(@o0 b.a aVar) {
        super.b(aVar);
    }

    @Override // com.google.android.material.progressindicator.g, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f53700s.g(canvas, j());
            this.f53700s.c(canvas, this.f53720n);
            this.f53700s.b(canvas, this.f53720n, 0.0f, this.f53703v, u8.a.a(this.f53709c.f53665c[0], super.getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.g, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ boolean e(@o0 b.a aVar) {
        return super.e(aVar);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f53700s.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f53700s.e();
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
        this.f53702u.d();
        E(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.g
    public boolean l() {
        return v(false, false, false);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        if (this.f53704w) {
            this.f53702u.d();
            E(i4 / 10000.0f);
            return true;
        }
        this.f53702u.t(this.f53703v * 10000.0f);
        this.f53702u.z(i4);
        return true;
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i4) {
        super.setAlpha(i4);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@q0 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        return v(z4, z5, true);
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
    public /* bridge */ /* synthetic */ boolean v(boolean z4, boolean z5, boolean z6) {
        return super.v(z4, z5, z6);
    }

    @Override // com.google.android.material.progressindicator.g
    boolean w(boolean z4, boolean z5, boolean z6) {
        boolean w4 = super.w(z4, z5, z6);
        float a5 = this.f53710d.a(this.f53708b.getContentResolver());
        if (a5 == 0.0f) {
            this.f53704w = true;
        } else {
            this.f53704w = false;
            this.f53701t.i(50.0f / a5);
        }
        return w4;
    }
}
