package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.components.g;
import com.github.mikephil.charting.components.j;
import java.util.List;

/* compiled from: XAxisRenderer.java */
/* loaded from: classes5.dex */
public class q extends a {

    /* renamed from: h, reason: collision with root package name */
    protected com.github.mikephil.charting.components.j f50592h;

    /* renamed from: i, reason: collision with root package name */
    protected Path f50593i;

    /* renamed from: j, reason: collision with root package name */
    protected float[] f50594j;

    /* renamed from: k, reason: collision with root package name */
    protected RectF f50595k;

    /* renamed from: l, reason: collision with root package name */
    protected float[] f50596l;

    /* renamed from: m, reason: collision with root package name */
    protected RectF f50597m;

    /* renamed from: n, reason: collision with root package name */
    float[] f50598n;

    /* renamed from: o, reason: collision with root package name */
    private Path f50599o;

    public q(com.github.mikephil.charting.utils.l lVar, com.github.mikephil.charting.components.j jVar, com.github.mikephil.charting.utils.i iVar) {
        super(lVar, iVar, jVar);
        this.f50593i = new Path();
        this.f50594j = new float[2];
        this.f50595k = new RectF();
        this.f50596l = new float[2];
        this.f50597m = new RectF();
        this.f50598n = new float[4];
        this.f50599o = new Path();
        this.f50592h = jVar;
        this.f50507e.setColor(x1.f27484y);
        this.f50507e.setTextAlign(Paint.Align.CENTER);
        this.f50507e.setTextSize(com.github.mikephil.charting.utils.k.e(10.0f));
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void a(float f4, float f5, boolean z4) {
        float f6;
        double d5;
        if (this.f50589a.k() > 10.0f && !this.f50589a.E()) {
            com.github.mikephil.charting.utils.f j4 = this.f50505c.j(this.f50589a.h(), this.f50589a.j());
            com.github.mikephil.charting.utils.f j5 = this.f50505c.j(this.f50589a.i(), this.f50589a.j());
            if (z4) {
                f6 = (float) j5.f50632d;
                d5 = j4.f50632d;
            } else {
                f6 = (float) j4.f50632d;
                d5 = j5.f50632d;
            }
            float f7 = (float) d5;
            com.github.mikephil.charting.utils.f.c(j4);
            com.github.mikephil.charting.utils.f.c(j5);
            f4 = f6;
            f5 = f7;
        }
        b(f4, f5);
    }

    @Override // com.github.mikephil.charting.renderer.a
    protected void b(float f4, float f5) {
        super.b(f4, f5);
        k();
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void g(Canvas canvas) {
        if (this.f50592h.f() && this.f50592h.P()) {
            float e4 = this.f50592h.e();
            this.f50507e.setTypeface(this.f50592h.c());
            this.f50507e.setTextSize(this.f50592h.b());
            this.f50507e.setColor(this.f50592h.a());
            com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
            if (this.f50592h.w0() == j.a.TOP) {
                c5.f50636d = 0.5f;
                c5.f50637e = 1.0f;
                n(canvas, this.f50589a.j() - e4, c5);
            } else if (this.f50592h.w0() == j.a.TOP_INSIDE) {
                c5.f50636d = 0.5f;
                c5.f50637e = 1.0f;
                n(canvas, this.f50589a.j() + e4 + this.f50592h.M, c5);
            } else if (this.f50592h.w0() == j.a.BOTTOM) {
                c5.f50636d = 0.5f;
                c5.f50637e = 0.0f;
                n(canvas, this.f50589a.f() + e4, c5);
            } else if (this.f50592h.w0() == j.a.BOTTOM_INSIDE) {
                c5.f50636d = 0.5f;
                c5.f50637e = 0.0f;
                n(canvas, (this.f50589a.f() - e4) - this.f50592h.M, c5);
            } else {
                c5.f50636d = 0.5f;
                c5.f50637e = 1.0f;
                n(canvas, this.f50589a.j() - e4, c5);
                c5.f50636d = 0.5f;
                c5.f50637e = 0.0f;
                n(canvas, this.f50589a.f() + e4, c5);
            }
            com.github.mikephil.charting.utils.g.h(c5);
        }
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void h(Canvas canvas) {
        if (this.f50592h.M() && this.f50592h.f()) {
            this.f50508f.setColor(this.f50592h.s());
            this.f50508f.setStrokeWidth(this.f50592h.u());
            this.f50508f.setPathEffect(this.f50592h.t());
            if (this.f50592h.w0() == j.a.TOP || this.f50592h.w0() == j.a.TOP_INSIDE || this.f50592h.w0() == j.a.BOTH_SIDED) {
                canvas.drawLine(this.f50589a.h(), this.f50589a.j(), this.f50589a.i(), this.f50589a.j(), this.f50508f);
            }
            if (this.f50592h.w0() == j.a.BOTTOM || this.f50592h.w0() == j.a.BOTTOM_INSIDE || this.f50592h.w0() == j.a.BOTH_SIDED) {
                canvas.drawLine(this.f50589a.h(), this.f50589a.f(), this.f50589a.i(), this.f50589a.f(), this.f50508f);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void i(Canvas canvas) {
        if (this.f50592h.O() && this.f50592h.f()) {
            int save = canvas.save();
            canvas.clipRect(o());
            if (this.f50594j.length != this.f50504b.f50276n * 2) {
                this.f50594j = new float[this.f50592h.f50276n * 2];
            }
            float[] fArr = this.f50594j;
            for (int i4 = 0; i4 < fArr.length; i4 += 2) {
                float[] fArr2 = this.f50592h.f50274l;
                int i5 = i4 / 2;
                fArr[i4] = fArr2[i5];
                fArr[i4 + 1] = fArr2[i5];
            }
            this.f50505c.o(fArr);
            r();
            Path path = this.f50593i;
            path.reset();
            for (int i6 = 0; i6 < fArr.length; i6 += 2) {
                l(canvas, fArr[i6], fArr[i6 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void j(Canvas canvas) {
        List<com.github.mikephil.charting.components.g> D = this.f50592h.D();
        if (D == null || D.size() <= 0) {
            return;
        }
        float[] fArr = this.f50596l;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        for (int i4 = 0; i4 < D.size(); i4++) {
            com.github.mikephil.charting.components.g gVar = D.get(i4);
            if (gVar.f()) {
                int save = canvas.save();
                this.f50597m.set(this.f50589a.q());
                this.f50597m.inset(-gVar.t(), 0.0f);
                canvas.clipRect(this.f50597m);
                fArr[0] = gVar.r();
                fArr[1] = 0.0f;
                this.f50505c.o(fArr);
                q(canvas, gVar, fArr);
                p(canvas, gVar, fArr, gVar.e() + 2.0f);
                canvas.restoreToCount(save);
            }
        }
    }

    protected void k() {
        String E = this.f50592h.E();
        this.f50507e.setTypeface(this.f50592h.c());
        this.f50507e.setTextSize(this.f50592h.b());
        com.github.mikephil.charting.utils.c b5 = com.github.mikephil.charting.utils.k.b(this.f50507e, E);
        float f4 = b5.f50628d;
        float a5 = com.github.mikephil.charting.utils.k.a(this.f50507e, ProtectedSandApp.s("쑔"));
        com.github.mikephil.charting.utils.c D = com.github.mikephil.charting.utils.k.D(f4, a5, this.f50592h.v0());
        this.f50592h.J = Math.round(f4);
        this.f50592h.K = Math.round(a5);
        this.f50592h.L = Math.round(D.f50628d);
        this.f50592h.M = Math.round(D.f50629e);
        com.github.mikephil.charting.utils.c.c(D);
        com.github.mikephil.charting.utils.c.c(b5);
    }

    protected void l(Canvas canvas, float f4, float f5, Path path) {
        path.moveTo(f4, this.f50589a.f());
        path.lineTo(f4, this.f50589a.j());
        canvas.drawPath(path, this.f50506d);
        path.reset();
    }

    protected void m(Canvas canvas, String str, float f4, float f5, com.github.mikephil.charting.utils.g gVar, float f6) {
        com.github.mikephil.charting.utils.k.n(canvas, str, f4, f5, this.f50507e, gVar, f6);
    }

    protected void n(Canvas canvas, float f4, com.github.mikephil.charting.utils.g gVar) {
        float f5;
        float v02 = this.f50592h.v0();
        boolean L = this.f50592h.L();
        int i4 = this.f50592h.f50276n * 2;
        float[] fArr = new float[i4];
        for (int i5 = 0; i5 < i4; i5 += 2) {
            if (L) {
                fArr[i5] = this.f50592h.f50275m[i5 / 2];
            } else {
                fArr[i5] = this.f50592h.f50274l[i5 / 2];
            }
        }
        this.f50505c.o(fArr);
        for (int i6 = 0; i6 < i4; i6 += 2) {
            float f6 = fArr[i6];
            if (this.f50589a.L(f6)) {
                com.github.mikephil.charting.formatter.l H = this.f50592h.H();
                com.github.mikephil.charting.components.j jVar = this.f50592h;
                int i7 = i6 / 2;
                String c5 = H.c(jVar.f50274l[i7], jVar);
                if (this.f50592h.x0()) {
                    int i10 = this.f50592h.f50276n;
                    if (i7 == i10 - 1 && i10 > 1) {
                        float d5 = com.github.mikephil.charting.utils.k.d(this.f50507e, c5);
                        if (d5 > this.f50589a.Q() * 2.0f && f6 + d5 > this.f50589a.o()) {
                            f6 -= d5 / 2.0f;
                        }
                    } else if (i6 == 0) {
                        f5 = (com.github.mikephil.charting.utils.k.d(this.f50507e, c5) / 2.0f) + f6;
                        m(canvas, c5, f5, f4, gVar, v02);
                    }
                }
                f5 = f6;
                m(canvas, c5, f5, f4, gVar, v02);
            }
        }
    }

    public RectF o() {
        this.f50595k.set(this.f50589a.q());
        this.f50595k.inset(-this.f50504b.B(), 0.0f);
        return this.f50595k;
    }

    public void p(Canvas canvas, com.github.mikephil.charting.components.g gVar, float[] fArr, float f4) {
        String p4 = gVar.p();
        if (p4 == null || p4.equals("")) {
            return;
        }
        this.f50509g.setStyle(gVar.u());
        this.f50509g.setPathEffect(null);
        this.f50509g.setColor(gVar.a());
        this.f50509g.setStrokeWidth(0.5f);
        this.f50509g.setTextSize(gVar.b());
        float d5 = gVar.d() + gVar.t();
        g.a q4 = gVar.q();
        if (q4 == g.a.RIGHT_TOP) {
            float a5 = com.github.mikephil.charting.utils.k.a(this.f50509g, p4);
            this.f50509g.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(p4, fArr[0] + d5, this.f50589a.j() + f4 + a5, this.f50509g);
        } else if (q4 == g.a.RIGHT_BOTTOM) {
            this.f50509g.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(p4, fArr[0] + d5, this.f50589a.f() - f4, this.f50509g);
        } else if (q4 != g.a.LEFT_TOP) {
            this.f50509g.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(p4, fArr[0] - d5, this.f50589a.f() - f4, this.f50509g);
        } else {
            this.f50509g.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(p4, fArr[0] - d5, this.f50589a.j() + f4 + com.github.mikephil.charting.utils.k.a(this.f50509g, p4), this.f50509g);
        }
    }

    public void q(Canvas canvas, com.github.mikephil.charting.components.g gVar, float[] fArr) {
        float[] fArr2 = this.f50598n;
        fArr2[0] = fArr[0];
        fArr2[1] = this.f50589a.j();
        float[] fArr3 = this.f50598n;
        fArr3[2] = fArr[0];
        fArr3[3] = this.f50589a.f();
        this.f50599o.reset();
        Path path = this.f50599o;
        float[] fArr4 = this.f50598n;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.f50599o;
        float[] fArr5 = this.f50598n;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.f50509g.setStyle(Paint.Style.STROKE);
        this.f50509g.setColor(gVar.s());
        this.f50509g.setStrokeWidth(gVar.t());
        this.f50509g.setPathEffect(gVar.o());
        canvas.drawPath(this.f50599o, this.f50509g);
    }

    protected void r() {
        this.f50506d.setColor(this.f50592h.z());
        this.f50506d.setStrokeWidth(this.f50592h.B());
        this.f50506d.setPathEffect(this.f50592h.A());
    }
}
