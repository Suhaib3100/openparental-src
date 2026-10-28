package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.o0;
import androidx.annotation.x;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: classes3.dex */
final class d extends h<CircularProgressIndicatorSpec> {

    /* renamed from: c, reason: collision with root package name */
    private int f13834c;

    /* renamed from: d, reason: collision with root package name */
    private float f13835d;

    /* renamed from: e, reason: collision with root package name */
    private float f13836e;

    /* renamed from: f, reason: collision with root package name */
    private float f13837f;

    public d(@o0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f13834c = 1;
    }

    private void h(Canvas canvas, Paint paint, float f6, float f7, float f8, boolean z5, RectF rectF) {
        float f9 = z5 ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f8);
        float f10 = f6 / 2.0f;
        float f11 = f9 * f7;
        canvas.drawRect((this.f13837f - f10) + f7, Math.min(0.0f, this.f13834c * f11), (this.f13837f + f10) - f7, Math.max(0.0f, f11 * this.f13834c), paint);
        canvas.translate((this.f13837f - f10) + f7, 0.0f);
        canvas.drawArc(rectF, 180.0f, (-f9) * 90.0f * this.f13834c, true, paint);
        canvas.translate(f6 - (f7 * 2.0f), 0.0f);
        canvas.drawArc(rectF, 0.0f, f9 * 90.0f * this.f13834c, true, paint);
        canvas.restore();
    }

    private int i() {
        S s5 = this.f13876a;
        return (((CircularProgressIndicatorSpec) s5).f13806h * 2) + ((CircularProgressIndicatorSpec) s5).f13805g;
    }

    @Override // com.google.android.material.progressindicator.h
    public void a(@o0 Canvas canvas, @x(from = 0.0d, to = 1.0d) float f6) {
        S s5 = this.f13876a;
        float f7 = (((CircularProgressIndicatorSpec) s5).f13805g / 2.0f) + ((CircularProgressIndicatorSpec) s5).f13806h;
        canvas.translate(f7, f7);
        canvas.rotate(-90.0f);
        float f8 = -f7;
        canvas.clipRect(f8, f8, f7, f7);
        this.f13834c = ((CircularProgressIndicatorSpec) this.f13876a).f13807i == 0 ? 1 : -1;
        this.f13835d = ((CircularProgressIndicatorSpec) r5).f13828a * f6;
        this.f13836e = ((CircularProgressIndicatorSpec) r5).f13829b * f6;
        this.f13837f = (((CircularProgressIndicatorSpec) r5).f13805g - ((CircularProgressIndicatorSpec) r5).f13828a) / 2.0f;
        if ((this.f13877b.m() && ((CircularProgressIndicatorSpec) this.f13876a).f13832e == 2) || (this.f13877b.l() && ((CircularProgressIndicatorSpec) this.f13876a).f13833f == 1)) {
            this.f13837f = (((1.0f - f6) * ((CircularProgressIndicatorSpec) this.f13876a).f13828a) / 2.0f) + this.f13837f;
        } else if ((this.f13877b.m() && ((CircularProgressIndicatorSpec) this.f13876a).f13832e == 1) || (this.f13877b.l() && ((CircularProgressIndicatorSpec) this.f13876a).f13833f == 2)) {
            this.f13837f -= ((1.0f - f6) * ((CircularProgressIndicatorSpec) this.f13876a).f13828a) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void b(@o0 Canvas canvas, @o0 Paint paint, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, @androidx.annotation.l int i5) {
        if (f6 == f7) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i5);
        paint.setStrokeWidth(this.f13835d);
        int i6 = this.f13834c;
        float f8 = f6 * 360.0f * i6;
        float f9 = (f7 >= f6 ? f7 - f6 : (f7 + 1.0f) - f6) * 360.0f * i6;
        float f10 = this.f13837f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), f8, f9, false, paint);
        if (this.f13836e <= 0.0f || Math.abs(f9) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        float f11 = this.f13836e;
        RectF rectF = new RectF(-f11, -f11, f11, f11);
        h(canvas, paint, this.f13835d, this.f13836e, f8, true, rectF);
        h(canvas, paint, this.f13835d, this.f13836e, f8 + f9, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.h
    void c(@o0 Canvas canvas, @o0 Paint paint) {
        int a6 = p1.a.a(((CircularProgressIndicatorSpec) this.f13876a).f13831d, this.f13877b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a6);
        paint.setStrokeWidth(this.f13835d);
        float f6 = this.f13837f;
        canvas.drawArc(new RectF(-f6, -f6, f6, f6), 0.0f, 360.0f, false, paint);
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
