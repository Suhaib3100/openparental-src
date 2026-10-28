package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.o0;
import androidx.annotation.x;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: classes6.dex */
final class d extends h<CircularProgressIndicatorSpec> {

    /* renamed from: c, reason: collision with root package name */
    private int f53669c;

    /* renamed from: d, reason: collision with root package name */
    private float f53670d;

    /* renamed from: e, reason: collision with root package name */
    private float f53671e;

    /* renamed from: f, reason: collision with root package name */
    private float f53672f;

    public d(@o0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f53669c = 1;
    }

    private void h(Canvas canvas, Paint paint, float f4, float f5, float f6, boolean z4, RectF rectF) {
        float f7 = z4 ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f6);
        float f10 = f4 / 2.0f;
        float f11 = f7 * f5;
        canvas.drawRect((this.f53672f - f10) + f5, Math.min(0.0f, this.f53669c * f11), (this.f53672f + f10) - f5, Math.max(0.0f, f11 * this.f53669c), paint);
        canvas.translate((this.f53672f - f10) + f5, 0.0f);
        canvas.drawArc(rectF, 180.0f, (-f7) * 90.0f * this.f53669c, true, paint);
        canvas.translate(f4 - (f5 * 2.0f), 0.0f);
        canvas.drawArc(rectF, 0.0f, f7 * 90.0f * this.f53669c, true, paint);
        canvas.restore();
    }

    private int i() {
        S s4 = this.f53724a;
        return (((CircularProgressIndicatorSpec) s4).f53628h * 2) + ((CircularProgressIndicatorSpec) s4).f53627g;
    }

    @Override // com.google.android.material.progressindicator.h
    public void a(@o0 Canvas canvas, @x(from = 0.0d, to = 1.0d) float f4) {
        S s4 = this.f53724a;
        float f5 = (((CircularProgressIndicatorSpec) s4).f53627g / 2.0f) + ((CircularProgressIndicatorSpec) s4).f53628h;
        canvas.translate(f5, f5);
        canvas.rotate(-90.0f);
        float f6 = -f5;
        canvas.clipRect(f6, f6, f5, f5);
        this.f53669c = ((CircularProgressIndicatorSpec) this.f53724a).f53629i == 0 ? 1 : -1;
        this.f53670d = ((CircularProgressIndicatorSpec) r5).f53663a * f4;
        this.f53671e = ((CircularProgressIndicatorSpec) r5).f53664b * f4;
        this.f53672f = (((CircularProgressIndicatorSpec) r5).f53627g - ((CircularProgressIndicatorSpec) r5).f53663a) / 2.0f;
        if ((this.f53725b.n() && ((CircularProgressIndicatorSpec) this.f53724a).f53667e == 2) || (this.f53725b.m() && ((CircularProgressIndicatorSpec) this.f53724a).f53668f == 1)) {
            this.f53672f = (((1.0f - f4) * ((CircularProgressIndicatorSpec) this.f53724a).f53663a) / 2.0f) + this.f53672f;
        } else if ((this.f53725b.n() && ((CircularProgressIndicatorSpec) this.f53724a).f53667e == 1) || (this.f53725b.m() && ((CircularProgressIndicatorSpec) this.f53724a).f53668f == 2)) {
            this.f53672f -= ((1.0f - f4) * ((CircularProgressIndicatorSpec) this.f53724a).f53663a) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void b(@o0 Canvas canvas, @o0 Paint paint, @x(from = 0.0d, to = 1.0d) float f4, @x(from = 0.0d, to = 1.0d) float f5, @androidx.annotation.l int i4) {
        if (f4 == f5) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i4);
        paint.setStrokeWidth(this.f53670d);
        int i5 = this.f53669c;
        float f6 = f4 * 360.0f * i5;
        float f7 = (f5 >= f4 ? f5 - f4 : (f5 + 1.0f) - f4) * 360.0f * i5;
        float f10 = this.f53672f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), f6, f7, false, paint);
        if (this.f53671e <= 0.0f || Math.abs(f7) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        float f11 = this.f53671e;
        RectF rectF = new RectF(-f11, -f11, f11, f11);
        h(canvas, paint, this.f53670d, this.f53671e, f6, true, rectF);
        h(canvas, paint, this.f53670d, this.f53671e, f6 + f7, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.h
    void c(@o0 Canvas canvas, @o0 Paint paint) {
        int a5 = u8.a.a(((CircularProgressIndicatorSpec) this.f53724a).f53666d, this.f53725b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a5);
        paint.setStrokeWidth(this.f53670d);
        float f4 = this.f53672f;
        canvas.drawArc(new RectF(-f4, -f4, f4, f4), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.h
    public int d() {
        return i();
    }

    @Override // com.google.android.material.progressindicator.h
    public int e() {
        return i();
    }
}
