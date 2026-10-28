package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.components.g;
import com.github.mikephil.charting.components.k;
import java.util.List;

/* compiled from: YAxisRenderer.java */
/* loaded from: classes5.dex */
public class t extends a {

    /* renamed from: h, reason: collision with root package name */
    protected com.github.mikephil.charting.components.k f50604h;

    /* renamed from: i, reason: collision with root package name */
    protected Paint f50605i;

    /* renamed from: j, reason: collision with root package name */
    protected Path f50606j;

    /* renamed from: k, reason: collision with root package name */
    protected RectF f50607k;

    /* renamed from: l, reason: collision with root package name */
    protected float[] f50608l;

    /* renamed from: m, reason: collision with root package name */
    protected Path f50609m;

    /* renamed from: n, reason: collision with root package name */
    protected RectF f50610n;

    /* renamed from: o, reason: collision with root package name */
    protected Path f50611o;

    /* renamed from: p, reason: collision with root package name */
    protected float[] f50612p;

    /* renamed from: q, reason: collision with root package name */
    protected RectF f50613q;

    public t(com.github.mikephil.charting.utils.l lVar, com.github.mikephil.charting.components.k kVar, com.github.mikephil.charting.utils.i iVar) {
        super(lVar, iVar, kVar);
        this.f50606j = new Path();
        this.f50607k = new RectF();
        this.f50608l = new float[2];
        this.f50609m = new Path();
        this.f50610n = new RectF();
        this.f50611o = new Path();
        this.f50612p = new float[2];
        this.f50613q = new RectF();
        this.f50604h = kVar;
        if (this.f50589a != null) {
            this.f50507e.setColor(x1.f27484y);
            this.f50507e.setTextSize(com.github.mikephil.charting.utils.k.e(10.0f));
            Paint paint = new Paint(1);
            this.f50605i = paint;
            paint.setColor(-7829368);
            this.f50605i.setStrokeWidth(1.0f);
            this.f50605i.setStyle(Paint.Style.STROKE);
        }
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void g(Canvas canvas) {
        float i4;
        float i5;
        float f4;
        if (this.f50604h.f() && this.f50604h.P()) {
            float[] n4 = n();
            this.f50507e.setTypeface(this.f50604h.c());
            this.f50507e.setTextSize(this.f50604h.b());
            this.f50507e.setColor(this.f50604h.a());
            float d5 = this.f50604h.d();
            float e4 = this.f50604h.e() + (com.github.mikephil.charting.utils.k.a(this.f50507e, ProtectedSandApp.s("쑕")) / 2.5f);
            k.a v02 = this.f50604h.v0();
            k.b w02 = this.f50604h.w0();
            if (v02 == k.a.LEFT) {
                if (w02 == k.b.OUTSIDE_CHART) {
                    this.f50507e.setTextAlign(Paint.Align.RIGHT);
                    i4 = this.f50589a.P();
                    f4 = i4 - d5;
                } else {
                    this.f50507e.setTextAlign(Paint.Align.LEFT);
                    i5 = this.f50589a.P();
                    f4 = i5 + d5;
                }
            } else if (w02 == k.b.OUTSIDE_CHART) {
                this.f50507e.setTextAlign(Paint.Align.LEFT);
                i5 = this.f50589a.i();
                f4 = i5 + d5;
            } else {
                this.f50507e.setTextAlign(Paint.Align.RIGHT);
                i4 = this.f50589a.i();
                f4 = i4 - d5;
            }
            k(canvas, f4, n4, e4);
        }
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void h(Canvas canvas) {
        if (this.f50604h.f() && this.f50604h.M()) {
            this.f50508f.setColor(this.f50604h.s());
            this.f50508f.setStrokeWidth(this.f50604h.u());
            if (this.f50604h.v0() == k.a.LEFT) {
                canvas.drawLine(this.f50589a.h(), this.f50589a.j(), this.f50589a.h(), this.f50589a.f(), this.f50508f);
            } else {
                canvas.drawLine(this.f50589a.i(), this.f50589a.j(), this.f50589a.i(), this.f50589a.f(), this.f50508f);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void i(Canvas canvas) {
        if (this.f50604h.f()) {
            if (this.f50604h.O()) {
                int save = canvas.save();
                canvas.clipRect(m());
                float[] n4 = n();
                this.f50506d.setColor(this.f50604h.z());
                this.f50506d.setStrokeWidth(this.f50604h.B());
                this.f50506d.setPathEffect(this.f50604h.A());
                Path path = this.f50606j;
                path.reset();
                for (int i4 = 0; i4 < n4.length; i4 += 2) {
                    canvas.drawPath(o(path, i4, n4), this.f50506d);
                    path.reset();
                }
                canvas.restoreToCount(save);
            }
            if (this.f50604h.H0()) {
                l(canvas);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.a
    public void j(Canvas canvas) {
        List<com.github.mikephil.charting.components.g> D = this.f50604h.D();
        if (D == null || D.size() <= 0) {
            return;
        }
        float[] fArr = this.f50612p;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.f50611o;
        path.reset();
        for (int i4 = 0; i4 < D.size(); i4++) {
            com.github.mikephil.charting.components.g gVar = D.get(i4);
            if (gVar.f()) {
                int save = canvas.save();
                this.f50613q.set(this.f50589a.q());
                this.f50613q.inset(0.0f, -gVar.t());
                canvas.clipRect(this.f50613q);
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
                    this.f50509g.setTypeface(gVar.c());
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

    protected void k(Canvas canvas, float f4, float[] fArr, float f5) {
        int i4 = this.f50604h.G0() ? this.f50604h.f50276n : this.f50604h.f50276n - 1;
        for (int i5 = !this.f50604h.F0() ? 1 : 0; i5 < i4; i5++) {
            canvas.drawText(this.f50604h.x(i5), f4, fArr[(i5 * 2) + 1] + f5, this.f50507e);
        }
    }

    protected void l(Canvas canvas) {
        int save = canvas.save();
        this.f50610n.set(this.f50589a.q());
        this.f50610n.inset(0.0f, -this.f50604h.E0());
        canvas.clipRect(this.f50610n);
        com.github.mikephil.charting.utils.f f4 = this.f50505c.f(0.0f, 0.0f);
        this.f50605i.setColor(this.f50604h.D0());
        this.f50605i.setStrokeWidth(this.f50604h.E0());
        Path path = this.f50609m;
        path.reset();
        path.moveTo(this.f50589a.h(), (float) f4.f50633e);
        path.lineTo(this.f50589a.i(), (float) f4.f50633e);
        canvas.drawPath(path, this.f50605i);
        canvas.restoreToCount(save);
    }

    public RectF m() {
        this.f50607k.set(this.f50589a.q());
        this.f50607k.inset(0.0f, -this.f50504b.B());
        return this.f50607k;
    }

    protected float[] n() {
        int length = this.f50608l.length;
        int i4 = this.f50604h.f50276n;
        if (length != i4 * 2) {
            this.f50608l = new float[i4 * 2];
        }
        float[] fArr = this.f50608l;
        for (int i5 = 0; i5 < fArr.length; i5 += 2) {
            fArr[i5 + 1] = this.f50604h.f50274l[i5 / 2];
        }
        this.f50505c.o(fArr);
        return fArr;
    }

    protected Path o(Path path, int i4, float[] fArr) {
        int i5 = i4 + 1;
        path.moveTo(this.f50589a.P(), fArr[i5]);
        path.lineTo(this.f50589a.i(), fArr[i5]);
        return path;
    }
}
