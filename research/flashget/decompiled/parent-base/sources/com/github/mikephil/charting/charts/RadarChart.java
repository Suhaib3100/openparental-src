package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.e;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.data.t;
import com.github.mikephil.charting.highlight.i;
import com.github.mikephil.charting.renderer.n;
import com.github.mikephil.charting.renderer.s;
import com.github.mikephil.charting.renderer.v;

/* loaded from: classes5.dex */
public class RadarChart extends PieRadarChartBase<t> {
    private int L2;
    private int M2;
    private int N2;
    private boolean O2;
    private int P2;
    private float Q1;
    private k Q2;
    protected v R2;
    protected s S2;
    private float V1;

    public RadarChart(Context context) {
        super(context);
        this.Q1 = 2.5f;
        this.V1 = 1.5f;
        this.L2 = Color.rgb(122, 122, 122);
        this.M2 = Color.rgb(122, 122, 122);
        this.N2 = 150;
        this.O2 = true;
        this.P2 = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float A1() {
        return (this.f50240j.f() && this.f50240j.P()) ? this.f50240j.L : com.github.mikephil.charting.utils.k.e(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float B1() {
        return this.f50248r.e().getTextSize() * 4.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void F0() {
        if (this.f50233c == 0) {
            return;
        }
        I();
        v vVar = this.R2;
        k kVar = this.Q2;
        vVar.a(kVar.H, kVar.G, kVar.I0());
        s sVar = this.S2;
        j jVar = this.f50240j;
        sVar.a(jVar.H, jVar.G, false);
        e eVar = this.f50243m;
        if (eVar != null && !eVar.I()) {
            this.f50248r.a(this.f50233c);
        }
        J();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void I() {
        k kVar = this.Q2;
        t tVar = (t) this.f50233c;
        k.a aVar = k.a.LEFT;
        kVar.n(tVar.C(aVar), ((t) this.f50233c).A(aVar));
        this.f50240j.n(0.0f, ((t) this.f50233c).w().h1());
    }

    public float I1() {
        RectF q4 = this.f50251u.q();
        return Math.min(q4.width() / 2.0f, q4.height() / 2.0f) / this.Q2.I;
    }

    public int J1() {
        return this.P2;
    }

    public float K1() {
        return 360.0f / ((t) this.f50233c).w().h1();
    }

    public int L1() {
        return this.N2;
    }

    public int M1() {
        return this.L2;
    }

    public int N1() {
        return this.M2;
    }

    public float O1() {
        return this.Q1;
    }

    public float P1() {
        return this.V1;
    }

    public k Q1() {
        return this.Q2;
    }

    public float R1() {
        return this.Q2.I;
    }

    public void S1(boolean z4) {
        this.O2 = z4;
    }

    public void T1(int i4) {
        this.P2 = Math.max(0, i4);
    }

    public void U1(int i4) {
        this.N2 = i4;
    }

    public void V1(int i4) {
        this.L2 = i4;
    }

    public void W1(int i4) {
        this.M2 = i4;
    }

    public void X1(float f4) {
        this.Q1 = com.github.mikephil.charting.utils.k.e(f4);
    }

    public void Y1(float f4) {
        this.V1 = com.github.mikephil.charting.utils.k.e(f4);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, e8.e
    public float k() {
        return this.Q2.H;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, e8.e
    public float l() {
        return this.Q2.G;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50233c == 0) {
            return;
        }
        if (this.f50240j.f()) {
            s sVar = this.S2;
            j jVar = this.f50240j;
            sVar.a(jVar.H, jVar.G, false);
        }
        this.S2.g(canvas);
        if (this.O2) {
            this.f50249s.c(canvas);
        }
        if (this.Q2.f() && this.Q2.Q()) {
            this.R2.j(canvas);
        }
        this.f50249s.b(canvas);
        if (q1()) {
            this.f50249s.d(canvas, this.B);
        }
        if (this.Q2.f() && !this.Q2.Q()) {
            this.R2.j(canvas);
        }
        this.R2.g(canvas);
        this.f50249s.f(canvas);
        this.f50248r.f(canvas);
        O(canvas);
        P(canvas);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int u1(float f4) {
        float z4 = com.github.mikephil.charting.utils.k.z(f4 - C1());
        float K1 = K1();
        int h12 = ((t) this.f50233c).w().h1();
        int i4 = 0;
        while (i4 < h12) {
            int i5 = i4 + 1;
            if ((i5 * K1) - (K1 / 2.0f) > z4) {
                return i4;
            }
            i4 = i5;
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.Q2 = new k(k.a.LEFT);
        this.Q1 = com.github.mikephil.charting.utils.k.e(1.5f);
        this.V1 = com.github.mikephil.charting.utils.k.e(0.75f);
        this.f50249s = new n(this, this.f50252v, this.f50251u);
        this.R2 = new v(this.f50251u, this.Q2, this);
        this.S2 = new s(this.f50251u, this.f50240j, this);
        this.f50250t = new i(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float y1() {
        RectF q4 = this.f50251u.q();
        return Math.min(q4.width() / 2.0f, q4.height() / 2.0f);
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q1 = 2.5f;
        this.V1 = 1.5f;
        this.L2 = Color.rgb(122, 122, 122);
        this.M2 = Color.rgb(122, 122, 122);
        this.N2 = 150;
        this.O2 = true;
        this.P2 = 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.Q1 = 2.5f;
        this.V1 = 1.5f;
        this.L2 = Color.rgb(122, 122, 122);
        this.M2 = Color.rgb(122, 122, 122);
        this.N2 = 150;
        this.O2 = true;
        this.P2 = 0;
    }
}
