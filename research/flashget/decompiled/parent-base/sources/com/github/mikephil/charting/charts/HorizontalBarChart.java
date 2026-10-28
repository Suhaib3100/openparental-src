package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.renderer.h;
import com.github.mikephil.charting.renderer.r;
import com.github.mikephil.charting.renderer.u;
import com.github.mikephil.charting.utils.e;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.i;
import f8.a;

/* loaded from: classes5.dex */
public class HorizontalBarChart extends BarChart {

    /* renamed from: r3, reason: collision with root package name */
    private RectF f50263r3;

    /* renamed from: s3, reason: collision with root package name */
    protected float[] f50264s3;

    public HorizontalBarChart(Context context) {
        super(context);
        this.f50263r3 = new RectF();
        this.f50264s3 = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public g G1(Entry entry, k.a aVar) {
        if (entry == null) {
            return null;
        }
        float[] fArr = this.f50264s3;
        fArr[0] = entry.c();
        fArr[1] = entry.j();
        d(aVar).o(fArr);
        return g.c(fArr[0], fArr[1]);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void J() {
        s1(this.f50263r3);
        RectF rectF = this.f50263r3;
        float f4 = rectF.left + 0.0f;
        float f5 = rectF.top + 0.0f;
        float f6 = rectF.right + 0.0f;
        float f7 = rectF.bottom + 0.0f;
        if (this.W2.L0()) {
            f5 += this.W2.z0(this.Y2.c());
        }
        if (this.X2.L0()) {
            f7 += this.X2.z0(this.Z2.c());
        }
        j jVar = this.f50240j;
        float f10 = jVar.L;
        if (jVar.f()) {
            if (this.f50240j.w0() == j.a.BOTTOM) {
                f4 += f10;
            } else {
                if (this.f50240j.w0() != j.a.TOP) {
                    if (this.f50240j.w0() == j.a.BOTH_SIDED) {
                        f4 += f10;
                    }
                }
                f6 += f10;
            }
        }
        float Z = Z() + f5;
        float Y = Y() + f6;
        float W = W() + f7;
        float X = X() + f4;
        float e4 = com.github.mikephil.charting.utils.k.e(this.T2);
        this.f50251u.U(Math.max(e4, X), Math.max(e4, Z), Math.max(e4, Y), Math.max(e4, W));
        if (this.f50232b) {
            this.f50251u.q().toString();
        }
        f2();
        g2();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void K2(float f4, float f5) {
        float f6 = this.f50240j.I;
        this.f50251u.b0(f6 / f4, f6 / f5);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void L2(float f4) {
        this.f50251u.d0(this.f50240j.I / f4);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void M2(float f4) {
        this.f50251u.Z(this.f50240j.I / f4);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void N2(float f4, float f5, k.a aVar) {
        this.f50251u.a0(z1(aVar) / f4, z1(aVar) / f5);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void O2(float f4, k.a aVar) {
        this.f50251u.c0(z1(aVar) / f4);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void P2(float f4, k.a aVar) {
        this.f50251u.Y(z1(aVar) / f4);
    }

    @Override // com.github.mikephil.charting.charts.BarChart
    public void Y2(BarEntry barEntry, RectF rectF) {
        a aVar = (a) ((com.github.mikephil.charting.data.a) this.f50233c).n(barEntry);
        if (aVar == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float c5 = barEntry.c();
        float j4 = barEntry.j();
        float Q = ((com.github.mikephil.charting.data.a) this.f50233c).Q() / 2.0f;
        float f4 = j4 - Q;
        float f5 = j4 + Q;
        float f6 = c5 >= 0.0f ? c5 : 0.0f;
        if (c5 > 0.0f) {
            c5 = 0.0f;
        }
        rectF.set(f6, f4, c5, f5);
        d(aVar.U()).t(rectF);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public d a0(float f4, float f5) {
        if (this.f50233c == 0) {
            return null;
        }
        return c0().a(f5, f4);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, e8.b
    public float f() {
        d(k.a.LEFT).k(this.f50251u.h(), this.f50251u.f(), this.f50221k3);
        return (float) Math.max(this.f50240j.H, this.f50221k3.f50633e);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, e8.b
    public float g() {
        d(k.a.LEFT).k(this.f50251u.h(), this.f50251u.j(), this.f50222l3);
        return (float) Math.min(this.f50240j.G, this.f50222l3.f50633e);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    protected void g2() {
        i iVar = this.f50212b3;
        k kVar = this.X2;
        float f4 = kVar.H;
        float f5 = kVar.I;
        j jVar = this.f50240j;
        iVar.q(f4, f5, jVar.I, jVar.H);
        i iVar2 = this.f50211a3;
        k kVar2 = this.W2;
        float f6 = kVar2.H;
        float f7 = kVar2.I;
        j jVar2 = this.f50240j;
        iVar2.q(f6, f7, jVar2.I, jVar2.H);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] h0(d dVar) {
        return new float[]{dVar.f(), dVar.e()};
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void y0() {
        this.f50251u = new e();
        super.y0();
        this.f50211a3 = new com.github.mikephil.charting.utils.j(this.f50251u);
        this.f50212b3 = new com.github.mikephil.charting.utils.j(this.f50251u);
        this.f50249s = new h(this, this.f50252v, this.f50251u);
        Y0(new com.github.mikephil.charting.highlight.e(this));
        this.Y2 = new u(this.f50251u, this.W2, this.f50211a3);
        this.Z2 = new u(this.f50251u, this.X2, this.f50212b3);
        this.f50213c3 = new r(this.f50251u, this.f50240j, this.f50211a3, this);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50263r3 = new RectF();
        this.f50264s3 = new float[2];
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f50263r3 = new RectF();
        this.f50264s3 = new float[2];
    }
}
