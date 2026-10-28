package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.o0;
import androidx.annotation.x;

/* compiled from: LinearDrawingDelegate.java */
/* loaded from: classes3.dex */
final class k extends h<LinearProgressIndicatorSpec> {

    /* renamed from: c, reason: collision with root package name */
    private float f13881c;

    /* renamed from: d, reason: collision with root package name */
    private float f13882d;

    /* renamed from: e, reason: collision with root package name */
    private float f13883e;

    public k(@o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f13881c = 300.0f;
    }

    private static void h(Canvas canvas, Paint paint, float f6, float f7, float f8, boolean z5, RectF rectF) {
        canvas.save();
        canvas.translate(f8, 0.0f);
        if (!z5) {
            canvas.rotate(180.0f);
        }
        float f9 = ((-f6) / 2.0f) + f7;
        float f10 = (f6 / 2.0f) - f7;
        canvas.drawRect(-f7, f9, 0.0f, f10, paint);
        canvas.save();
        canvas.translate(0.0f, f9);
        canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        canvas.restore();
        canvas.translate(0.0f, f10);
        canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.h
    public void a(@o0 Canvas canvas, @x(from = 0.0d, to = 1.0d) float f6) {
        Rect clipBounds = canvas.getClipBounds();
        this.f13881c = clipBounds.width();
        float f7 = ((LinearProgressIndicatorSpec) this.f13876a).f13828a;
        canvas.translate((clipBounds.width() / 2.0f) + clipBounds.left, Math.max(0.0f, (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f13876a).f13828a) / 2.0f) + (clipBounds.height() / 2.0f) + clipBounds.top);
        if (((LinearProgressIndicatorSpec) this.f13876a).f13810i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f13877b.m() && ((LinearProgressIndicatorSpec) this.f13876a).f13832e == 1) || (this.f13877b.l() && ((LinearProgressIndicatorSpec) this.f13876a).f13833f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f13877b.m() || this.f13877b.l()) {
            canvas.translate(0.0f, ((f6 - 1.0f) * ((LinearProgressIndicatorSpec) this.f13876a).f13828a) / 2.0f);
        }
        float f8 = this.f13881c;
        canvas.clipRect((-f8) / 2.0f, (-f7) / 2.0f, f8 / 2.0f, f7 / 2.0f);
        S s5 = this.f13876a;
        this.f13882d = ((LinearProgressIndicatorSpec) s5).f13828a * f6;
        this.f13883e = ((LinearProgressIndicatorSpec) s5).f13829b * f6;
    }

    @Override // com.google.android.material.progressindicator.h
    public void b(@o0 Canvas canvas, @o0 Paint paint, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, @androidx.annotation.l int i5) {
        if (f6 == f7) {
            return;
        }
        float f8 = this.f13881c;
        float f9 = this.f13883e;
        float f10 = ((f8 - (f9 * 2.0f)) * f6) + ((-f8) / 2.0f) + f9;
        float f11 = ((f8 - (f9 * 2.0f)) * f7) + ((-f8) / 2.0f) + f9;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i5);
        float f12 = this.f13882d;
        canvas.drawRect(f10, (-f12) / 2.0f, f11, f12 / 2.0f, paint);
        float f13 = this.f13883e;
        RectF rectF = new RectF(-f13, -f13, f13, f13);
        h(canvas, paint, this.f13882d, this.f13883e, f10, true, rectF);
        h(canvas, paint, this.f13882d, this.f13883e, f11, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.h
    void c(@o0 Canvas canvas, @o0 Paint paint) {
        int a6 = p1.a.a(((LinearProgressIndicatorSpec) this.f13876a).f13831d, this.f13877b.getAlpha());
        float f6 = ((-this.f13881c) / 2.0f) + this.f13883e;
        float f7 = -f6;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a6);
        float f8 = this.f13882d;
        canvas.drawRect(f6, (-f8) / 2.0f, f7, f8 / 2.0f, paint);
        float f9 = this.f13883e;
        RectF rectF = new RectF(-f9, -f9, f9, f9);
        h(canvas, paint, this.f13882d, this.f13883e, f6, true, rectF);
        h(canvas, paint, this.f13882d, this.f13883e, f7, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.h
    public int d() {
        return ((LinearProgressIndicatorSpec) this.f13876a).f13828a;
    }

    @Override // com.google.android.material.progressindicator.h
    public int e() {
        return -1;
    }
}
