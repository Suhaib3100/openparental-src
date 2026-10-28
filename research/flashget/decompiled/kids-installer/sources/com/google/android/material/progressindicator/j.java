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
/* loaded from: classes3.dex */
public final class j<S extends c> extends g {
    private h<S> F;
    private i<ObjectAnimator> G;

    j(@o0 Context context, @o0 c cVar, @o0 h<S> hVar, @o0 i<ObjectAnimator> iVar) {
        super(context, cVar);
        B(hVar);
        A(iVar);
    }

    @o0
    public static j<CircularProgressIndicatorSpec> w(@o0 Context context, @o0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new j<>(context, circularProgressIndicatorSpec, new d(circularProgressIndicatorSpec), new e(circularProgressIndicatorSpec));
    }

    @o0
    public static j<LinearProgressIndicatorSpec> x(@o0 Context context, @o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new j<>(context, linearProgressIndicatorSpec, new k(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f13808g == 0 ? new l(linearProgressIndicatorSpec) : new m(context, linearProgressIndicatorSpec));
    }

    void A(@o0 i<ObjectAnimator> iVar) {
        this.G = iVar;
        iVar.e(this);
    }

    void B(@o0 h<S> hVar) {
        this.F = hVar;
        hVar.f(this);
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
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.F.g(canvas, i());
        this.F.c(canvas, this.A);
        int i5 = 0;
        while (true) {
            i<ObjectAnimator> iVar = this.G;
            int[] iArr = iVar.f13880c;
            if (i5 >= iArr.length) {
                canvas.restore();
                return;
            }
            h<S> hVar = this.F;
            Paint paint = this.A;
            float[] fArr = iVar.f13879b;
            int i6 = i5 * 2;
            hVar.b(canvas, paint, fArr[i6], fArr[i6 + 1], iArr[i5]);
            i5++;
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
        if (!super.isRunning()) {
            this.G.a();
        }
        this.f13864q.a(this.f13862o.getContentResolver());
        if (z5 && z7) {
            this.G.g();
        }
        return v5;
    }

    @o0
    i<ObjectAnimator> y() {
        return this.G;
    }

    @o0
    h<S> z() {
        return this.F;
    }
}
