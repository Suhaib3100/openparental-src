package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.g;
import com.github.mikephil.charting.components.j;
import java.util.List;

/* compiled from: XAxisRendererHorizontalBarChart.java */
/* loaded from: classes5.dex */
public class r extends q {

    /* renamed from: p, reason: collision with root package name */
    protected BarChart f50600p;

    /* renamed from: q, reason: collision with root package name */
    protected Path f50601q;

    public r(com.github.mikephil.charting.utils.l lVar, com.github.mikephil.charting.components.j jVar, com.github.mikephil.charting.utils.i iVar, BarChart barChart) {
        super(lVar, jVar, iVar);
        this.f50601q = new Path();
        this.f50600p = barChart;
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void a(float f4, float f5, boolean z4) {
        float f6;
        double d5;
        if (this.f50589a.k() > 10.0f && !this.f50589a.F()) {
            com.github.mikephil.charting.utils.f j4 = this.f50505c.j(this.f50589a.h(), this.f50589a.f());
            com.github.mikephil.charting.utils.f j5 = this.f50505c.j(this.f50589a.h(), this.f50589a.j());
            if (z4) {
                f6 = (float) j5.f50633e;
                d5 = j4.f50633e;
            } else {
                f6 = (float) j4.f50633e;
                d5 = j5.f50633e;
            }
            float f7 = (float) d5;
            com.github.mikephil.charting.utils.f.c(j4);
            com.github.mikephil.charting.utils.f.c(j5);
            f4 = f6;
            f5 = f7;
        }
        b(f4, f5);
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void g(Canvas canvas) {
        if (this.f50592h.f() && this.f50592h.P()) {
            float d5 = this.f50592h.d();
            this.f50507e.setTypeface(this.f50592h.c());
            this.f50507e.setTextSize(this.f50592h.b());
            this.f50507e.setColor(this.f50592h.a());
            com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
            if (this.f50592h.w0() == j.a.TOP) {
                c5.f50636d = 0.0f;
                c5.f50637e = 0.5f;
                n(canvas, this.f50589a.i() + d5, c5);
            } else if (this.f50592h.w0() == j.a.TOP_INSIDE) {
                c5.f50636d = 1.0f;
                c5.f50637e = 0.5f;
                n(canvas, this.f50589a.i() - d5, c5);
            } else if (this.f50592h.w0() == j.a.BOTTOM) {
                c5.f50636d = 1.0f;
                c5.f50637e = 0.5f;
                n(canvas, this.f50589a.h() - d5, c5);
            } else if (this.f50592h.w0() == j.a.BOTTOM_INSIDE) {
                c5.f50636d = 1.0f;
                c5.f50637e = 0.5f;
                n(canvas, this.f50589a.h() + d5, c5);
            } else {
                c5.f50636d = 0.0f;
                c5.f50637e = 0.5f;
                n(canvas, this.f50589a.i() + d5, c5);
                c5.f50636d = 1.0f;
                c5.f50637e = 0.5f;
                n(canvas, this.f50589a.h() - d5, c5);
            }
            com.github.mikephil.charting.utils.g.h(c5);
        }
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void h(Canvas canvas) {
        if (this.f50592h.M() && this.f50592h.f()) {
            this.f50508f.setColor(this.f50592h.s());
            this.f50508f.setStrokeWidth(this.f50592h.u());
            if (this.f50592h.w0() == j.a.TOP || this.f50592h.w0() == j.a.TOP_INSIDE || this.f50592h.w0() == j.a.BOTH_SIDED) {
                canvas.drawLine(this.f50589a.i(), this.f50589a.j(), this.f50589a.i(), this.f50589a.f(), this.f50508f);
            }
            if (this.f50592h.w0() == j.a.BOTTOM || this.f50592h.w0() == j.a.BOTTOM_INSIDE || this.f50592h.w0() == j.a.BOTH_SIDED) {
                canvas.drawLine(this.f50589a.h(), this.f50589a.j(), this.f50589a.h(), this.f50589a.f(), this.f50508f);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void j(Canvas canvas) {
        List<com.github.mikephil.charting.components.g> D = this.f50592h.D();
        if (D == null || D.size() <= 0) {
            return;
        }
        float[] fArr = this.f50596l;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.f50601q;
        path.reset();
        for (int i4 = 0; i4 < D.size(); i4++) {
            com.github.mikephil.charting.components.g gVar = D.get(i4);
            if (gVar.f()) {
                int save = canvas.save();
                this.f50597m.set(this.f50589a.q());
                this.f50597m.inset(0.0f, -gVar.t());
                canvas.clipRect(this.f50597m);
                this.f50509g.setStyle(Paint.Style.STROKE);
                this.f50509g.setColor(gVar.s());
                this.f50509g.setStrokeWidth(gVar.t());
                this.f50509g.setPathEffect(gVar.o());
                fArr[1] = gVar.r();
                this.f50505c.o(fArr);
                path.moveTo(this.f50589a.h(), fArr[1]);
                path.lineTo(this.f50589a.i(), fArr[1]);
                canvas.drawPath(path, this.f50509g);
                path.reset();
                String p4 = gVar.p();
                if (p4 != null && !p4.equals("")) {
                    this.f50509g.setStyle(gVar.u());
                    this.f50509g.setPathEffect(null);
                    this.f50509g.setColor(gVar.a());
                    this.f50509g.setStrokeWidth(0.5f);
                    this.f50509g.setTextSize(gVar.b());
                    float a5 = com.github.mikephil.charting.utils.k.a(this.f50509g, p4);
                    float d5 = gVar.d() + com.github.mikephil.charting.utils.k.e(4.0f);
                    float e4 = gVar.e() + gVar.t() + a5;
                    g.a q4 = gVar.q();
                    if (q4 == g.a.RIGHT_TOP) {
                        this.f50509g.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(p4, this.f50589a.i() - d5, (fArr[1] - e4) + a5, this.f50509g);
                    } else if (q4 == g.a.RIGHT_BOTTOM) {
                        this.f50509g.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(p4, this.f50589a.i() - d5, fArr[1] + e4, this.f50509g);
                    } else if (q4 == g.a.LEFT_TOP) {
                        this.f50509g.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(p4, this.f50589a.h() + d5, (fArr[1] - e4) + a5, this.f50509g);
                    } else {
                        this.f50509g.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(p4, this.f50589a.P() + d5, fArr[1] + e4, this.f50509g);
                    }
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.q
    protected void k() {
        this.f50507e.setTypeface(this.f50592h.c());
        this.f50507e.setTextSize(this.f50592h.b());
        com.github.mikephil.charting.utils.c b5 = com.github.mikephil.charting.utils.k.b(this.f50507e, this.f50592h.E());
        float d5 = (int) ((this.f50592h.d() * 3.5f) + b5.f50628d);
        float f4 = b5.f50629e;
        com.github.mikephil.charting.utils.c D = com.github.mikephil.charting.utils.k.D(b5.f50628d, f4, this.f50592h.v0());
        this.f50592h.J = Math.round(d5);
        this.f50592h.K = Math.round(f4);
        com.github.mikephil.charting.components.j jVar = this.f50592h;
        jVar.L = (int) ((jVar.d() * 3.5f) + D.f50628d);
        this.f50592h.M = Math.round(D.f50629e);
        com.github.mikephil.charting.utils.c.c(D);
    }

    @Override // com.github.mikephil.charting.renderer.q
    protected void l(Canvas canvas, float f4, float f5, Path path) {
        path.moveTo(this.f50589a.i(), f5);
        path.lineTo(this.f50589a.h(), f5);
        canvas.drawPath(path, this.f50506d);
        path.reset();
    }

    @Override // com.github.mikephil.charting.renderer.q
    protected void n(Canvas canvas, float f4, com.github.mikephil.charting.utils.g gVar) {
        float v02 = this.f50592h.v0();
        boolean L = this.f50592h.L();
        int i4 = this.f50592h.f50276n * 2;
        float[] fArr = new float[i4];
        for (int i5 = 0; i5 < i4; i5 += 2) {
            if (L) {
                fArr[i5 + 1] = this.f50592h.f50275m[i5 / 2];
            } else {
                fArr[i5 + 1] = this.f50592h.f50274l[i5 / 2];
            }
        }
        this.f50505c.o(fArr);
        for (int i6 = 0; i6 < i4; i6 += 2) {
            float f5 = fArr[i6 + 1];
            if (this.f50589a.M(f5)) {
                com.github.mikephil.charting.formatter.l H = this.f50592h.H();
                com.github.mikephil.charting.components.j jVar = this.f50592h;
                m(canvas, H.c(jVar.f50274l[i6 / 2], jVar), f4, f5, gVar, v02);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.q
    public RectF o() {
        this.f50595k.set(this.f50589a.q());
        this.f50595k.inset(0.0f, -this.f50504b.B());
        return this.f50595k;
    }
}
