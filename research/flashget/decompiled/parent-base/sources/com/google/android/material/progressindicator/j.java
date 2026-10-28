package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.vectordrawable.graphics.drawable.b;
import com.google.android.material.progressindicator.c;

/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes6.dex */
public final class j<S extends c> extends g {

    /* renamed from: s, reason: collision with root package name */
    private h<S> f53729s;

    /* renamed from: t, reason: collision with root package name */
    private i<ObjectAnimator> f53730t;

    j(@o0 Context context, @o0 c cVar, @o0 h<S> hVar, @o0 i<ObjectAnimator> iVar) {
        super(context, cVar);
        C(hVar);
        B(iVar);
    }

    @o0
    public static j<CircularProgressIndicatorSpec> x(@o0 Context context, @o0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new j<>(context, circularProgressIndicatorSpec, new d(circularProgressIndicatorSpec), new e(circularProgressIndicatorSpec));
    }

    @o0
    public static j<LinearProgressIndicatorSpec> y(@o0 Context context, @o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new j<>(context, linearProgressIndicatorSpec, new k(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f53631g == 0 ? new l(linearProgressIndicatorSpec) : new m(context, linearProgressIndicatorSpec));
    }

    @o0
    h<S> A() {
        return this.f53729s;
    }

    void B(@o0 i<ObjectAnimator> iVar) {
        this.f53730t = iVar;
        iVar.e(this);
    }

    void C(@o0 h<S> hVar) {
        this.f53729s = hVar;
        hVar.f(this);
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
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.f53729s.g(canvas, j());
        this.f53729s.c(canvas, this.f53720n);
        int i4 = 0;
        while (true) {
            i<ObjectAnimator> iVar = this.f53730t;
            int[] iArr = iVar.f53728c;
            if (i4 >= iArr.length) {
                canvas.restore();
                return;
            }
            h<S> hVar = this.f53729s;
            Paint paint = this.f53720n;
            float[] fArr = iVar.f53727b;
            int i5 = i4 * 2;
            hVar.b(canvas, paint, fArr[i5], fArr[i5 + 1], iArr[i4]);
            i4++;
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
        return this.f53729s.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f53729s.e();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
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
        if (!super.isRunning()) {
            this.f53730t.a();
        }
        this.f53710d.a(this.f53708b.getContentResolver());
        if (z4 && z6) {
            this.f53730t.g();
        }
        return w4;
    }

    @o0
    i<ObjectAnimator> z() {
        return this.f53730t;
    }
}
