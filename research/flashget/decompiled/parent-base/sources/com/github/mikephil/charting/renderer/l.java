package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: LineScatterCandleRadarRenderer.java */
/* loaded from: classes5.dex */
public abstract class l extends c {

    /* renamed from: h, reason: collision with root package name */
    private Path f50566h;

    public l(com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
        this.f50566h = new Path();
    }

    protected void n(Canvas canvas, float f4, float f5, f8.h hVar) {
        this.f50537d.setColor(hVar.f1());
        this.f50537d.setStrokeWidth(hVar.u0());
        this.f50537d.setPathEffect(hVar.R0());
        if (hVar.Z()) {
            this.f50566h.reset();
            this.f50566h.moveTo(f4, this.f50589a.j());
            this.f50566h.lineTo(f4, this.f50589a.f());
            canvas.drawPath(this.f50566h, this.f50537d);
        }
        if (hVar.o1()) {
            this.f50566h.reset();
            this.f50566h.moveTo(this.f50589a.h(), f5);
            this.f50566h.lineTo(this.f50589a.i(), f5);
            canvas.drawPath(this.f50566h, this.f50537d);
        }
    }
}
