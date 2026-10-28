package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.components.g;
import com.github.mikephil.charting.components.k;
import java.util.List;

/* compiled from: YAxisRendererHorizontalBarChart.java */
/* loaded from: classes5.dex */
public class u extends t {

    /* renamed from: r, reason: collision with root package name */
    protected Path f50614r;

    /* renamed from: s, reason: collision with root package name */
    protected Path f50615s;

    /* renamed from: t, reason: collision with root package name */
    protected float[] f50616t;

    public u(com.github.mikephil.charting.utils.l lVar, com.github.mikephil.charting.components.k kVar, com.github.mikephil.charting.utils.i iVar) {
        super(lVar, kVar, iVar);
        this.f50614r = new Path();
        this.f50615s = new Path();
        this.f50616t = new float[4];
        this.f50509g.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void a(float f4, float f5, boolean z4) {
        float f6;
        double d5;
        if (this.f50589a.g() > 10.0f && !this.f50589a.E()) {
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

    @Override // com.github.mikephil.charting.renderer.t, com.github.mikephil.charting.renderer.a
    public void g(Canvas canvas) {
        float f4;
        if (this.f50604h.f() && this.f50604h.P()) {
            float[] n4 = n();
            this.f50507e.setTypeface(this.f50604h.c());
            this.f50507e.setTextSize(this.f50604h.b());
            this.f50507e.setColor(this.f50604h.a());
            this.f50507e.setTextAlign(Paint.Align.CENTER);
            float e4 = com.github.mikephil.charting.utils.k.e(2.5f);
            float a5 = com.github.mikephil.charting.utils.k.a(this.f50507e, ProtectedSandApp.s("쑖"));
            k.a v02 = this.f50604h.v0();
            k.b w02 = this.f50604h.w0();
            if (v02 == k.a.LEFT) {
                f4 = (w02 == k.b.OUTSIDE_CHART ? this.f50589a.j() : this.f50589a.j()) - e4;
            } else {
                f4 = (w02 == k.b.OUTSIDE_CHART ? this.f50589a.f() : this.f50589a.f()) + a5 + e4;
            }
            k(canvas, f4, n4, this.f50604h.e());
        }
    }

    @Override // com.github.mikephil.charting.renderer.t, com.github.mikephil.charting.renderer.a
    public void h(Canvas canvas) {
        if (this.f50604h.f() && this.f50604h.M()) {
            this.f50508f.setColor(this.f50604h.s());
            this.f50508f.setStrokeWidth(this.f50604h.u());
            if (this.f50604h.v0() == k.a.LEFT) {
                canvas.drawLine(this.f50589a.h(), this.f50589a.j(), this.f50589a.i(), this.f50589a.j(), this.f50508f);
            } else {
                canvas.drawLine(this.f50589a.h(), this.f50589a.f(), this.f50589a.i(), this.f50589a.f(), this.f50508f);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.t, com.github.mikephil.charting.renderer.a
    public void j(Canvas canvas) {
        List<com.github.mikephil.charting.components.g> D = this.f50604h.D();
        if (D == null || D.size() <= 0) {
            return;
        }
        float[] fArr = this.f50616t;
        float f4 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        Path path = this.f50615s;
        path.reset();
        int i4 = 0;
        while (i4 < D.size()) {
            com.github.mikephil.charting.components.g gVar = D.get(i4);
            if (gVar.f()) {
                int save = canvas.save();
                this.f50613q.set(this.f50589a.q());
                this.f50613q.inset(-gVar.t(), f4);
                canvas.clipRect(this.f50613q);
                fArr[0] = gVar.r();
                fArr[2] = gVar.r();
                this.f50505c.o(fArr);
                fArr[1] = this.f50589a.j();
                fArr[3] = this.f50589a.f();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                this.f50509g.setStyle(Paint.Style.STROKE);
                this.f50509g.setColor(gVar.s());
                this.f50509g.setPathEffect(gVar.o());
                this.f50509g.setStrokeWidth(gVar.t());
                canvas.drawPath(path, this.f50509g);
                path.reset();
                String p4 = gVar.p();
                if (p4 != null && !p4.equals("")) {
                    this.f50509g.setStyle(gVar.u());
                    this.f50509g.setPathEffect(null);
                    this.f50509g.setColor(gVar.a());
                    this.f50509g.setTypeface(gVar.c());
                    this.f50509g.setStrokeWidth(0.5f);
                    this.f50509g.setTextSize(gVar.b());
                    float d5 = gVar.d() + gVar.t();
                    float e4 = gVar.e() + com.github.mikephil.charting.utils.k.e(2.0f);
                    g.a q4 = gVar.q();
                    if (q4 == g.a.RIGHT_TOP) {
                        float a5 = com.github.mikephil.charting.utils.k.a(this.f50509g, p4);
                        this.f50509g.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(p4, fArr[0] + d5, this.f50589a.j() + e4 + a5, this.f50509g);
                    } else if (q4 == g.a.RIGHT_BOTTOM) {
                        this.f50509g.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(p4, fArr[0] + d5, this.f50589a.f() - e4, this.f50509g);
                    } else if (q4 == g.a.LEFT_TOP) {
                        this.f50509g.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(p4, fArr[0] - d5, this.f50589a.j() + e4 + com.github.mikephil.charting.utils.k.a(this.f50509g, p4), this.f50509g);
                    } else {
                        this.f50509g.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(p4, fArr[0] - d5, this.f50589a.f() - e4, this.f50509g);
                    }
                }
                canvas.restoreToCount(save);
            }
            i4++;
            f4 = 0.0f;
        }
    }

    @Override // com.github.mikephil.charting.renderer.t
    protected void k(Canvas canvas, float f4, float[] fArr, float f5) {
        this.f50507e.setTypeface(this.f50604h.c());
        this.f50507e.setTextSize(this.f50604h.b());
        this.f50507e.setColor(this.f50604h.a());
        int i4 = this.f50604h.G0() ? this.f50604h.f50276n : this.f50604h.f50276n - 1;
        for (int i5 = !this.f50604h.F0() ? 1 : 0; i5 < i4; i5++) {
            canvas.drawText(this.f50604h.x(i5), fArr[i5 * 2], f4 - f5, this.f50507e);
        }
    }

    @Override // com.github.mikephil.charting.renderer.t
    protected void l(Canvas canvas) {
        int save = canvas.save();
        this.f50610n.set(this.f50589a.q());
        this.f50610n.inset(-this.f50604h.E0(), 0.0f);
        canvas.clipRect(this.f50613q);
        com.github.mikephil.charting.utils.f f4 = this.f50505c.f(0.0f, 0.0f);
        this.f50605i.setColor(this.f50604h.D0());
        this.f50605i.setStrokeWidth(this.f50604h.E0());
        Path path = this.f50614r;
        path.reset();
        path.moveTo(((float) f4.f50632d) - 1.0f, this.f50589a.j());
        path.lineTo(((float) f4.f50632d) - 1.0f, this.f50589a.f());
        canvas.drawPath(path, this.f50605i);
        canvas.restoreToCount(save);
    }

    @Override // com.github.mikephil.charting.renderer.t
    public RectF m() {
        this.f50607k.set(this.f50589a.q());
        this.f50607k.inset(-this.f50504b.B(), 0.0f);
        return this.f50607k;
    }

    @Override // com.github.mikephil.charting.renderer.t
    protected float[] n() {
        int length = this.f50608l.length;
        int i4 = this.f50604h.f50276n;
        if (length != i4 * 2) {
            this.f50608l = new float[i4 * 2];
        }
        float[] fArr = this.f50608l;
        for (int i5 = 0; i5 < fArr.length; i5 += 2) {
            fArr[i5] = this.f50604h.f50274l[i5 / 2];
        }
        this.f50505c.o(fArr);
        return fArr;
    }

    @Override // com.github.mikephil.charting.renderer.t
    protected Path o(Path path, int i4, float[] fArr) {
        path.moveTo(fArr[i4], this.f50589a.j());
        path.lineTo(fArr[i4], this.f50589a.f());
        return path;
    }
}
