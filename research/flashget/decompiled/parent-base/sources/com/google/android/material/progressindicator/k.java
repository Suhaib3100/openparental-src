package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.o0;
import androidx.annotation.x;

/* compiled from: LinearDrawingDelegate.java */
/* loaded from: classes6.dex */
final class k extends h<LinearProgressIndicatorSpec> {

    /* renamed from: c, reason: collision with root package name */
    private float f53731c;

    /* renamed from: d, reason: collision with root package name */
    private float f53732d;

    /* renamed from: e, reason: collision with root package name */
    private float f53733e;

    public k(@o0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f53731c = 300.0f;
    }

    private static void h(Canvas canvas, Paint paint, float f4, float f5, float f6, boolean z4, RectF rectF) {
        canvas.save();
        canvas.translate(f6, 0.0f);
        if (!z4) {
            canvas.rotate(180.0f);
        }
        float f7 = ((-f4) / 2.0f) + f5;
        float f10 = (f4 / 2.0f) - f5;
        canvas.drawRect(-f5, f7, 0.0f, f10, paint);
        canvas.save();
        canvas.translate(0.0f, f7);
        canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        canvas.restore();
        canvas.translate(0.0f, f10);
        canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.h
    public void a(@o0 Canvas canvas, @x(from = 0.0d, to = 1.0d) float f4) {
        Rect clipBounds = canvas.getClipBounds();
        this.f53731c = clipBounds.width();
        float f5 = ((LinearProgressIndicatorSpec) this.f53724a).f53663a;
        canvas.translate((clipBounds.width() / 2.0f) + clipBounds.left, Math.max(0.0f, (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f53724a).f53663a) / 2.0f) + (clipBounds.height() / 2.0f) + clipBounds.top);
        if (((LinearProgressIndicatorSpec) this.f53724a).f53633i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f53725b.n() && ((LinearProgressIndicatorSpec) this.f53724a).f53667e == 1) || (this.f53725b.m() && ((LinearProgressIndicatorSpec) this.f53724a).f53668f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f53725b.n() || this.f53725b.m()) {
            canvas.translate(0.0f, ((f4 - 1.0f) * ((LinearProgressIndicatorSpec) this.f53724a).f53663a) / 2.0f);
        }
        float f6 = this.f53731c;
        canvas.clipRect((-f6) / 2.0f, (-f5) / 2.0f, f6 / 2.0f, f5 / 2.0f);
        S s4 = this.f53724a;
        this.f53732d = ((LinearProgressIndicatorSpec) s4).f53663a * f4;
        this.f53733e = ((LinearProgressIndicatorSpec) s4).f53664b * f4;
    }

    @Override // com.google.android.material.progressindicator.h
    public void b(@o0 Canvas canvas, @o0 Paint paint, @x(from = 0.0d, to = 1.0d) float f4, @x(from = 0.0d, to = 1.0d) float f5, @androidx.annotation.l int i4) {
        if (f4 == f5) {
            return;
        }
        float f6 = this.f53731c;
        float f7 = this.f53733e;
        float f10 = ((f6 - (f7 * 2.0f)) * f4) + ((-f6) / 2.0f) + f7;
        float f11 = ((f6 - (f7 * 2.0f)) * f5) + ((-f6) / 2.0f) + f7;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i4);
        float f12 = this.f53732d;
        canvas.drawRect(f10, (-f12) / 2.0f, f11, f12 / 2.0f, paint);
        float f13 = this.f53733e;
        RectF rectF = new RectF(-f13, -f13, f13, f13);
        h(canvas, paint, this.f53732d, this.f53733e, f10, true, rectF);
        h(canvas, paint, this.f53732d, this.f53733e, f11, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.h
    void c(@o0 Canvas canvas, @o0 Paint paint) {
        int a5 = u8.a.a(((LinearProgressIndicatorSpec) this.f53724a).f53666d, this.f53725b.getAlpha());
        float f4 = ((-this.f53731c) / 2.0f) + this.f53733e;
        float f5 = -f4;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a5);
        float f6 = this.f53732d;
        canvas.drawRect(f4, (-f6) / 2.0f, f5, f6 / 2.0f, paint);
        float f7 = this.f53733e;
        RectF rectF = new RectF(-f7, -f7, f7, f7);
        h(canvas, paint, this.f53732d, this.f53733e, f4, true, rectF);
        h(canvas, paint, this.f53732d, this.f53733e, f5, false, rectF);
    }

    @Override // com.google.android.material.progressindicator.h
    public int d() {
        return ((LinearProgressIndicatorSpec) this.f53724a).f53663a;
    }

    @Override // com.google.android.material.progressindicator.h
    public int e() {
        return -1;
    }
}
