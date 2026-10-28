package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.a;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.renderer.b;

/* loaded from: classes5.dex */
public class BarChart extends BarLineChartBase<a> implements e8.a {

    /* renamed from: n3, reason: collision with root package name */
    protected boolean f50207n3;

    /* renamed from: o3, reason: collision with root package name */
    private boolean f50208o3;

    /* renamed from: p3, reason: collision with root package name */
    private boolean f50209p3;

    /* renamed from: q3, reason: collision with root package name */
    private boolean f50210q3;

    public BarChart(Context context) {
        super(context);
        this.f50207n3 = false;
        this.f50208o3 = true;
        this.f50209p3 = false;
        this.f50210q3 = false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void I() {
        if (this.f50210q3) {
            this.f50240j.n(((a) this.f50233c).y() - (((a) this.f50233c).Q() / 2.0f), (((a) this.f50233c).Q() / 2.0f) + ((a) this.f50233c).x());
        } else {
            this.f50240j.n(((a) this.f50233c).y(), ((a) this.f50233c).x());
        }
        k kVar = this.W2;
        a aVar = (a) this.f50233c;
        k.a aVar2 = k.a.LEFT;
        kVar.n(aVar.C(aVar2), ((a) this.f50233c).A(aVar2));
        k kVar2 = this.X2;
        a aVar3 = (a) this.f50233c;
        k.a aVar4 = k.a.RIGHT;
        kVar2.n(aVar3.C(aVar4), ((a) this.f50233c).A(aVar4));
    }

    public RectF X2(BarEntry barEntry) {
        RectF rectF = new RectF();
        Y2(barEntry, rectF);
        return rectF;
    }

    public void Y2(BarEntry barEntry, RectF rectF) {
        f8.a aVar = (f8.a) ((a) this.f50233c).n(barEntry);
        if (aVar == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float c5 = barEntry.c();
        float j4 = barEntry.j();
        float Q = ((a) this.f50233c).Q() / 2.0f;
        float f4 = j4 - Q;
        float f5 = j4 + Q;
        float f6 = c5 >= 0.0f ? c5 : 0.0f;
        if (c5 > 0.0f) {
            c5 = 0.0f;
        }
        rectF.set(f4, f6, f5, c5);
        d(aVar.U()).t(rectF);
    }

    public void Z2(float f4, float f5, float f6) {
        if (v() == null) {
            throw new RuntimeException(ProtectedSandApp.s("쏪"));
        }
        v().S(f4, f5, f6);
        F0();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public d a0(float f4, float f5) {
        if (this.f50233c == 0) {
            return null;
        }
        d a5 = c0().a(f4, f5);
        return (a5 == null || !i()) ? a5 : new d(a5.h(), a5.j(), a5.i(), a5.k(), a5.d(), -1, a5.b());
    }

    public void a3(float f4, int i4, int i5) {
        w0(new d(f4, i4, i5), false);
    }

    public void b3(boolean z4) {
        this.f50209p3 = z4;
    }

    public void c3(boolean z4) {
        this.f50208o3 = z4;
    }

    public void d3(boolean z4) {
        this.f50210q3 = z4;
    }

    public void e3(boolean z4) {
        this.f50207n3 = z4;
    }

    @Override // e8.a
    public boolean h() {
        return this.f50208o3;
    }

    @Override // e8.a
    public boolean i() {
        return this.f50207n3;
    }

    @Override // e8.a
    public boolean t() {
        return this.f50209p3;
    }

    @Override // e8.a
    public a v() {
        return (a) this.f50233c;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.f50249s = new b(this, this.f50252v, this.f50251u);
        Y0(new com.github.mikephil.charting.highlight.a(this));
        o0().t0(0.5f);
        o0().s0(0.5f);
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50207n3 = false;
        this.f50208o3 = true;
        this.f50209p3 = false;
        this.f50210q3 = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f50207n3 = false;
        this.f50208o3 = true;
        this.f50209p3 = false;
        this.f50210q3 = false;
    }
}
