package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarEntry;

/* compiled from: RadarChartRenderer.java */
/* loaded from: classes5.dex */
public class n extends k {

    /* renamed from: i, reason: collision with root package name */
    protected RadarChart f50584i;

    /* renamed from: j, reason: collision with root package name */
    protected Paint f50585j;

    /* renamed from: k, reason: collision with root package name */
    protected Paint f50586k;

    /* renamed from: l, reason: collision with root package name */
    protected Path f50587l;

    /* renamed from: m, reason: collision with root package name */
    protected Path f50588m;

    public n(RadarChart radarChart, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
        this.f50587l = new Path();
        this.f50588m = new Path();
        this.f50584i = radarChart;
        Paint paint = new Paint(1);
        this.f50537d = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f50537d.setStrokeWidth(2.0f);
        this.f50537d.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.f50585j = paint2;
        paint2.setStyle(style);
        this.f50586k = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas) {
        com.github.mikephil.charting.data.t tVar = (com.github.mikephil.charting.data.t) this.f50584i.b();
        int h12 = tVar.w().h1();
        for (f8.j jVar : tVar.q()) {
            if (jVar.isVisible()) {
                r(canvas, jVar, h12);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas) {
        t(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        int i4;
        int i5;
        float K1 = this.f50584i.K1();
        float I1 = this.f50584i.I1();
        com.github.mikephil.charting.utils.g j4 = this.f50584i.j();
        com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        com.github.mikephil.charting.data.t tVar = (com.github.mikephil.charting.data.t) this.f50584i.b();
        int length = dVarArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i7 < length) {
            com.github.mikephil.charting.highlight.d dVar = dVarArr[i7];
            f8.j k4 = tVar.k(dVar.d());
            if (k4 != null && k4.k1()) {
                Entry entry = (RadarEntry) k4.w((int) dVar.h());
                if (l(entry, k4)) {
                    com.github.mikephil.charting.utils.k.B(j4, this.f50535b.i() * (entry.c() - this.f50584i.k()) * I1, this.f50584i.C1() + (this.f50535b.h() * dVar.h() * K1), c5);
                    dVar.n(c5.f50636d, c5.f50637e);
                    n(canvas, c5.f50636d, c5.f50637e, k4);
                    if (k4.p0() && !Float.isNaN(c5.f50636d) && !Float.isNaN(c5.f50637e)) {
                        int h4 = k4.h();
                        if (h4 == 1122867) {
                            h4 = k4.G0(i6);
                        }
                        if (k4.i0() < 255) {
                            h4 = com.github.mikephil.charting.utils.a.a(h4, k4.i0());
                        }
                        i4 = i7;
                        i5 = i6;
                        s(canvas, c5, k4.h0(), k4.q(), k4.c(), h4, k4.b0());
                        i7 = i4 + 1;
                        i6 = i5;
                    }
                }
            }
            i4 = i7;
            i5 = i6;
            i7 = i4 + 1;
            i6 = i5;
        }
        com.github.mikephil.charting.utils.g.h(j4);
        com.github.mikephil.charting.utils.g.h(c5);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas, String str, float f4, float f5, int i4) {
        this.f50539f.setColor(i4);
        canvas.drawText(str, f4, f5, this.f50539f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas) {
        int i4;
        float f4;
        RadarEntry radarEntry;
        int i5;
        f8.j jVar;
        int i6;
        float f5;
        com.github.mikephil.charting.utils.g gVar;
        com.github.mikephil.charting.formatter.l lVar;
        float h4 = this.f50535b.h();
        float i7 = this.f50535b.i();
        float K1 = this.f50584i.K1();
        float I1 = this.f50584i.I1();
        com.github.mikephil.charting.utils.g j4 = this.f50584i.j();
        com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        com.github.mikephil.charting.utils.g c6 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        float e4 = com.github.mikephil.charting.utils.k.e(5.0f);
        int i10 = 0;
        while (i10 < ((com.github.mikephil.charting.data.t) this.f50584i.b()).m()) {
            f8.j k4 = ((com.github.mikephil.charting.data.t) this.f50584i.b()).k(i10);
            if (m(k4)) {
                a(k4);
                com.github.mikephil.charting.formatter.l u4 = k4.u();
                com.github.mikephil.charting.utils.g d5 = com.github.mikephil.charting.utils.g.d(k4.i1());
                d5.f50636d = com.github.mikephil.charting.utils.k.e(d5.f50636d);
                d5.f50637e = com.github.mikephil.charting.utils.k.e(d5.f50637e);
                int i11 = 0;
                while (i11 < k4.h1()) {
                    RadarEntry radarEntry2 = (RadarEntry) k4.w(i11);
                    com.github.mikephil.charting.utils.g gVar2 = d5;
                    float f6 = i11 * K1 * h4;
                    com.github.mikephil.charting.utils.k.B(j4, (radarEntry2.c() - this.f50584i.k()) * I1 * i7, this.f50584i.C1() + f6, c5);
                    if (k4.S()) {
                        radarEntry = radarEntry2;
                        i5 = i11;
                        f5 = h4;
                        gVar = gVar2;
                        lVar = u4;
                        jVar = k4;
                        i6 = i10;
                        e(canvas, u4.k(radarEntry2), c5.f50636d, c5.f50637e - e4, k4.E(i11));
                    } else {
                        radarEntry = radarEntry2;
                        i5 = i11;
                        jVar = k4;
                        i6 = i10;
                        f5 = h4;
                        gVar = gVar2;
                        lVar = u4;
                    }
                    if (radarEntry.b() != null && jVar.q0()) {
                        Drawable b5 = radarEntry.b();
                        com.github.mikephil.charting.utils.k.B(j4, (radarEntry.c() * I1 * i7) + gVar.f50637e, this.f50584i.C1() + f6, c6);
                        float f7 = c6.f50637e + gVar.f50636d;
                        c6.f50637e = f7;
                        com.github.mikephil.charting.utils.k.k(canvas, b5, (int) c6.f50636d, (int) f7, b5.getIntrinsicWidth(), b5.getIntrinsicHeight());
                    }
                    i11 = i5 + 1;
                    d5 = gVar;
                    k4 = jVar;
                    u4 = lVar;
                    i10 = i6;
                    h4 = f5;
                }
                i4 = i10;
                f4 = h4;
                com.github.mikephil.charting.utils.g.h(d5);
            } else {
                i4 = i10;
                f4 = h4;
            }
            i10 = i4 + 1;
            h4 = f4;
        }
        com.github.mikephil.charting.utils.g.h(j4);
        com.github.mikephil.charting.utils.g.h(c5);
        com.github.mikephil.charting.utils.g.h(c6);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r(Canvas canvas, f8.j jVar, int i4) {
        float h4 = this.f50535b.h();
        float i5 = this.f50535b.i();
        float K1 = this.f50584i.K1();
        float I1 = this.f50584i.I1();
        com.github.mikephil.charting.utils.g j4 = this.f50584i.j();
        com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        Path path = this.f50587l;
        path.reset();
        boolean z4 = false;
        for (int i6 = 0; i6 < jVar.h1(); i6++) {
            this.f50536c.setColor(jVar.G0(i6));
            com.github.mikephil.charting.utils.k.B(j4, (((RadarEntry) jVar.w(i6)).c() - this.f50584i.k()) * I1 * i5, this.f50584i.C1() + (i6 * K1 * h4), c5);
            if (!Float.isNaN(c5.f50636d)) {
                if (z4) {
                    path.lineTo(c5.f50636d, c5.f50637e);
                } else {
                    path.moveTo(c5.f50636d, c5.f50637e);
                    z4 = true;
                }
            }
        }
        if (jVar.h1() > i4) {
            path.lineTo(j4.f50636d, j4.f50637e);
        }
        path.close();
        if (jVar.D0()) {
            Drawable t4 = jVar.t();
            if (t4 != null) {
                q(canvas, path, t4);
            } else {
                p(canvas, path, jVar.f0(), jVar.e());
            }
        }
        this.f50536c.setStrokeWidth(jVar.i());
        this.f50536c.setStyle(Paint.Style.STROKE);
        if (!jVar.D0() || jVar.e() < 255) {
            canvas.drawPath(path, this.f50536c);
        }
        com.github.mikephil.charting.utils.g.h(j4);
        com.github.mikephil.charting.utils.g.h(c5);
    }

    public void s(Canvas canvas, com.github.mikephil.charting.utils.g gVar, float f4, float f5, int i4, int i5, float f6) {
        canvas.save();
        float e4 = com.github.mikephil.charting.utils.k.e(f5);
        float e5 = com.github.mikephil.charting.utils.k.e(f4);
        if (i4 != 1122867) {
            Path path = this.f50588m;
            path.reset();
            path.addCircle(gVar.f50636d, gVar.f50637e, e4, Path.Direction.CW);
            if (e5 > 0.0f) {
                path.addCircle(gVar.f50636d, gVar.f50637e, e5, Path.Direction.CCW);
            }
            this.f50586k.setColor(i4);
            this.f50586k.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.f50586k);
        }
        if (i5 != 1122867) {
            this.f50586k.setColor(i5);
            this.f50586k.setStyle(Paint.Style.STROKE);
            this.f50586k.setStrokeWidth(com.github.mikephil.charting.utils.k.e(f6));
            canvas.drawCircle(gVar.f50636d, gVar.f50637e, e4, this.f50586k);
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void t(Canvas canvas) {
        float K1 = this.f50584i.K1();
        float I1 = this.f50584i.I1();
        float C1 = this.f50584i.C1();
        com.github.mikephil.charting.utils.g j4 = this.f50584i.j();
        this.f50585j.setStrokeWidth(this.f50584i.O1());
        this.f50585j.setColor(this.f50584i.M1());
        this.f50585j.setAlpha(this.f50584i.L1());
        int J1 = this.f50584i.J1() + 1;
        int h12 = ((com.github.mikephil.charting.data.t) this.f50584i.b()).w().h1();
        com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        for (int i4 = 0; i4 < h12; i4 += J1) {
            com.github.mikephil.charting.utils.k.B(j4, this.f50584i.R1() * I1, (i4 * K1) + C1, c5);
            canvas.drawLine(j4.f50636d, j4.f50637e, c5.f50636d, c5.f50637e, this.f50585j);
        }
        com.github.mikephil.charting.utils.g.h(c5);
        this.f50585j.setStrokeWidth(this.f50584i.P1());
        this.f50585j.setColor(this.f50584i.N1());
        this.f50585j.setAlpha(this.f50584i.L1());
        int i5 = this.f50584i.Q1().f50276n;
        com.github.mikephil.charting.utils.g c6 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        com.github.mikephil.charting.utils.g c7 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            while (i7 < ((com.github.mikephil.charting.data.t) this.f50584i.b()).r()) {
                float k4 = (this.f50584i.Q1().f50274l[i6] - this.f50584i.k()) * I1;
                com.github.mikephil.charting.utils.k.B(j4, k4, (i7 * K1) + C1, c6);
                i7++;
                com.github.mikephil.charting.utils.k.B(j4, k4, (i7 * K1) + C1, c7);
                canvas.drawLine(c6.f50636d, c6.f50637e, c7.f50636d, c7.f50637e, this.f50585j);
            }
        }
        com.github.mikephil.charting.utils.g.h(c6);
        com.github.mikephil.charting.utils.g.h(c7);
    }

    public Paint u() {
        return this.f50585j;
    }
}
