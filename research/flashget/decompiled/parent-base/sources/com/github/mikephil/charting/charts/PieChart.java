package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.data.r;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.renderer.m;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.k;
import f8.i;
import java.util.List;

/* loaded from: classes5.dex */
public class PieChart extends PieRadarChartBase<r> {
    private float[] L2;
    private float[] M2;
    private boolean N2;
    private boolean O2;
    private boolean P2;
    private RectF Q1;
    private boolean Q2;
    private CharSequence R2;
    private g S2;
    private float T2;
    protected float U2;
    private boolean V1;
    private boolean V2;
    private float W2;
    protected float X2;
    private float Y2;

    public PieChart(Context context) {
        super(context);
        this.Q1 = new RectF();
        this.V1 = true;
        this.L2 = new float[1];
        this.M2 = new float[1];
        this.N2 = true;
        this.O2 = false;
        this.P2 = false;
        this.Q2 = false;
        this.R2 = "";
        this.S2 = g.c(0.0f, 0.0f);
        this.T2 = 50.0f;
        this.U2 = 55.0f;
        this.V2 = true;
        this.W2 = 100.0f;
        this.X2 = 360.0f;
        this.Y2 = 0.0f;
    }

    private float I1(float f4) {
        return J1(f4, ((r) this.f50233c).T());
    }

    private float J1(float f4, float f5) {
        return (f4 / f5) * this.X2;
    }

    private void K1() {
        int r4 = ((r) this.f50233c).r();
        if (this.L2.length != r4) {
            this.L2 = new float[r4];
        } else {
            for (int i4 = 0; i4 < r4; i4++) {
                this.L2[i4] = 0.0f;
            }
        }
        if (this.M2.length != r4) {
            this.M2 = new float[r4];
        } else {
            for (int i5 = 0; i5 < r4; i5++) {
                this.M2[i5] = 0.0f;
            }
        }
        float T = ((r) this.f50233c).T();
        List<i> q4 = ((r) this.f50233c).q();
        float f4 = this.Y2;
        boolean z4 = f4 != 0.0f && ((float) r4) * f4 <= this.X2;
        float[] fArr = new float[r4];
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < ((r) this.f50233c).m(); i7++) {
            i iVar = q4.get(i7);
            for (int i10 = 0; i10 < iVar.h1(); i10++) {
                float J1 = J1(Math.abs(iVar.w(i10).c()), T);
                if (z4) {
                    float f7 = this.Y2;
                    float f10 = J1 - f7;
                    if (f10 <= 0.0f) {
                        fArr[i6] = f7;
                        f5 += -f10;
                    } else {
                        fArr[i6] = J1;
                        f6 += f10;
                    }
                }
                this.L2[i6] = J1;
                if (i6 == 0) {
                    this.M2[i6] = J1;
                } else {
                    float[] fArr2 = this.M2;
                    fArr2[i6] = fArr2[i6 - 1] + J1;
                }
                i6++;
            }
        }
        if (z4) {
            for (int i11 = 0; i11 < r4; i11++) {
                float f11 = fArr[i11];
                float f12 = f11 - (((f11 - this.Y2) / f6) * f5);
                fArr[i11] = f12;
                if (i11 == 0) {
                    this.M2[0] = fArr[0];
                } else {
                    float[] fArr3 = this.M2;
                    fArr3[i11] = fArr3[i11 - 1] + f12;
                }
            }
            this.L2 = fArr;
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float A1() {
        return 0.0f;
    }

    public void A2(float f4) {
        this.U2 = f4;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float B1() {
        return this.f50248r.e().getTextSize() * 2.0f;
    }

    public void B2(boolean z4) {
        this.P2 = z4;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void I() {
        K1();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void J() {
        super.J();
        if (this.f50233c == 0) {
            return;
        }
        float t12 = t1() / 2.0f;
        g j4 = j();
        float Q = ((r) this.f50233c).Q().Q();
        RectF rectF = this.Q1;
        float f4 = j4.f50636d;
        float f5 = j4.f50637e;
        rectF.set((f4 - t12) + Q, (f5 - t12) + Q, (f4 + t12) - Q, (f5 + t12) - Q);
        g.h(j4);
    }

    public float[] L1() {
        return this.M2;
    }

    public g M1() {
        return g.c(this.Q1.centerX(), this.Q1.centerY());
    }

    public CharSequence N1() {
        return this.R2;
    }

    public g O1() {
        g gVar = this.S2;
        return g.c(gVar.f50636d, gVar.f50637e);
    }

    public float P1() {
        return this.W2;
    }

    public RectF Q1() {
        return this.Q1;
    }

    public int R1(int i4) {
        List<i> q4 = ((r) this.f50233c).q();
        for (int i5 = 0; i5 < q4.size(); i5++) {
            if (q4.get(i5).o0(i4, Float.NaN) != null) {
                return i5;
            }
        }
        return -1;
    }

    public float[] S1() {
        return this.L2;
    }

    public float T1() {
        return this.T2;
    }

    public float U1() {
        return this.X2;
    }

    public float V1() {
        return this.Y2;
    }

    public float W1() {
        return this.U2;
    }

    public boolean X1() {
        return this.V2;
    }

    public boolean Y1() {
        return this.V1;
    }

    public boolean Z1() {
        return this.N2;
    }

    public boolean a2() {
        return this.Q2;
    }

    public boolean b2() {
        return this.O2;
    }

    public boolean c2() {
        return this.P2;
    }

    public boolean d2(int i4) {
        if (!q1()) {
            return false;
        }
        int i5 = 0;
        while (true) {
            d[] dVarArr = this.B;
            if (i5 >= dVarArr.length) {
                return false;
            }
            if (((int) dVarArr[i5].h()) == i4) {
                return true;
            }
            i5++;
        }
    }

    public void e2(CharSequence charSequence) {
        if (charSequence == null) {
            this.R2 = "";
        } else {
            this.R2 = charSequence;
        }
    }

    public void f2(int i4) {
        ((m) this.f50249s).r().setColor(i4);
    }

    public void g2(float f4, float f5) {
        this.S2.f50636d = k.e(f4);
        this.S2.f50637e = k.e(f5);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] h0(d dVar) {
        g M1 = M1();
        float y12 = y1();
        float f4 = (y12 / 10.0f) * 3.6f;
        if (Z1()) {
            f4 = (y12 - (T1() * (y12 / 100.0f))) / 2.0f;
        }
        float f5 = y12 - f4;
        float C1 = C1();
        float f6 = this.L2[(int) dVar.h()] / 2.0f;
        double d5 = f5;
        float cos = (float) ((Math.cos(Math.toRadians(this.f50252v.i() * ((this.M2[r11] + C1) - f6))) * d5) + M1.f50636d);
        float sin = (float) ((Math.sin(Math.toRadians(this.f50252v.i() * ((C1 + this.M2[r11]) - f6))) * d5) + M1.f50637e);
        g.h(M1);
        return new float[]{cos, sin};
    }

    public void h2(float f4) {
        this.W2 = f4;
    }

    public void i2(float f4) {
        ((m) this.f50249s).r().setTextSize(k.e(f4));
    }

    public void j2(float f4) {
        ((m) this.f50249s).r().setTextSize(f4);
    }

    public void k2(Typeface typeface) {
        ((m) this.f50249s).r().setTypeface(typeface);
    }

    public void l2(boolean z4) {
        this.V2 = z4;
    }

    public void m2(boolean z4) {
        this.V1 = z4;
    }

    public void n2(boolean z4) {
        this.N2 = z4;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public j o0() {
        throw new RuntimeException(ProtectedSandApp.s("쏱"));
    }

    public void o2(boolean z4) {
        this.Q2 = z4;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.github.mikephil.charting.renderer.g gVar = this.f50249s;
        if (gVar != null && (gVar instanceof m)) {
            ((m) gVar).w();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50233c == 0) {
            return;
        }
        this.f50249s.b(canvas);
        if (q1()) {
            this.f50249s.d(canvas, this.B);
        }
        this.f50249s.c(canvas);
        this.f50249s.f(canvas);
        this.f50248r.f(canvas);
        O(canvas);
        P(canvas);
    }

    @Deprecated
    public void p2(boolean z4) {
        this.V1 = z4;
    }

    public void q2(boolean z4) {
        this.O2 = z4;
    }

    public void r2(int i4) {
        ((m) this.f50249s).s().setColor(i4);
    }

    public void s2(float f4) {
        ((m) this.f50249s).s().setTextSize(k.e(f4));
    }

    public void t2(Typeface typeface) {
        ((m) this.f50249s).s().setTypeface(typeface);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int u1(float f4) {
        float z4 = k.z(f4 - C1());
        int i4 = 0;
        while (true) {
            float[] fArr = this.M2;
            if (i4 >= fArr.length) {
                return -1;
            }
            if (fArr[i4] > z4) {
                return i4;
            }
            i4++;
        }
    }

    public void u2(int i4) {
        ((m) this.f50249s).t().setColor(i4);
    }

    public void v2(float f4) {
        this.T2 = f4;
    }

    public void w2(float f4) {
        if (f4 > 360.0f) {
            f4 = 360.0f;
        }
        if (f4 < 90.0f) {
            f4 = 90.0f;
        }
        this.X2 = f4;
    }

    public void x2(float f4) {
        float f5 = this.X2;
        if (f4 > f5 / 2.0f) {
            f4 = f5 / 2.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        this.Y2 = f4;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.f50249s = new m(this, this.f50252v, this.f50251u);
        this.f50240j = null;
        this.f50250t = new com.github.mikephil.charting.highlight.g(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float y1() {
        RectF rectF = this.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.Q1.height() / 2.0f);
    }

    public void y2(int i4) {
        ((m) this.f50249s).u().setAlpha(i4);
    }

    public void z2(int i4) {
        Paint u4 = ((m) this.f50249s).u();
        int alpha = u4.getAlpha();
        u4.setColor(i4);
        u4.setAlpha(alpha);
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q1 = new RectF();
        this.V1 = true;
        this.L2 = new float[1];
        this.M2 = new float[1];
        this.N2 = true;
        this.O2 = false;
        this.P2 = false;
        this.Q2 = false;
        this.R2 = "";
        this.S2 = g.c(0.0f, 0.0f);
        this.T2 = 50.0f;
        this.U2 = 55.0f;
        this.V2 = true;
        this.W2 = 100.0f;
        this.X2 = 360.0f;
        this.Y2 = 0.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.Q1 = new RectF();
        this.V1 = true;
        this.L2 = new float[1];
        this.M2 = new float[1];
        this.N2 = true;
        this.O2 = false;
        this.P2 = false;
        this.Q2 = false;
        this.R2 = "";
        this.S2 = g.c(0.0f, 0.0f);
        this.T2 = 50.0f;
        this.U2 = 55.0f;
        this.V2 = true;
        this.W2 = 100.0f;
        this.X2 = 360.0f;
        this.Y2 = 0.0f;
    }
}
