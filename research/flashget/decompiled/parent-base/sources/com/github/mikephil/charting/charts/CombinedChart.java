package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.g;
import com.github.mikephil.charting.data.i;
import com.github.mikephil.charting.data.l;
import com.github.mikephil.charting.data.n;
import com.github.mikephil.charting.data.v;
import com.github.mikephil.charting.highlight.c;
import com.github.mikephil.charting.highlight.d;
import e8.f;
import f8.b;

/* loaded from: classes5.dex */
public class CombinedChart extends BarLineChartBase<l> implements f {

    /* renamed from: n3, reason: collision with root package name */
    private boolean f50259n3;

    /* renamed from: o3, reason: collision with root package name */
    protected boolean f50260o3;

    /* renamed from: p3, reason: collision with root package name */
    private boolean f50261p3;

    /* renamed from: q3, reason: collision with root package name */
    protected a[] f50262q3;

    public enum a {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
        this.f50259n3 = true;
        this.f50260o3 = false;
        this.f50261p3 = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void P(Canvas canvas) {
        if (this.E == null || !B0() || !q1()) {
            return;
        }
        int i4 = 0;
        while (true) {
            d[] dVarArr = this.B;
            if (i4 >= dVarArr.length) {
                return;
            }
            d dVar = dVarArr[i4];
            b<? extends Entry> W = ((l) this.f50233c).W(dVar);
            Entry s4 = ((l) this.f50233c).s(dVar);
            if (s4 != null) {
                if (W.g(s4) <= this.f50252v.h() * W.h1()) {
                    float[] h02 = h0(dVar);
                    if (this.f50251u.G(h02[0], h02[1])) {
                        this.E.c(s4, dVar);
                        this.E.a(canvas, h02[0], h02[1]);
                    }
                }
            }
            i4++;
        }
    }

    public a[] X2() {
        return this.f50262q3;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: Y2, reason: merged with bridge method [inline-methods] */
    public void L0(l lVar) {
        super.L0(lVar);
        Y0(new c(this, this));
        ((com.github.mikephil.charting.renderer.f) this.f50249s).l();
        this.f50249s.j();
    }

    public void Z2(boolean z4) {
        this.f50261p3 = z4;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public d a0(float f4, float f5) {
        if (this.f50233c == 0) {
            return null;
        }
        d a5 = c0().a(f4, f5);
        return (a5 == null || !i()) ? a5 : new d(a5.h(), a5.j(), a5.i(), a5.k(), a5.d(), -1, a5.b());
    }

    public void a3(a[] aVarArr) {
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        this.f50262q3 = aVarArr;
    }

    public void b3(boolean z4) {
        this.f50259n3 = z4;
    }

    @Override // e8.c
    public g c() {
        T t4 = this.f50233c;
        if (t4 == 0) {
            return null;
        }
        return ((l) t4).S();
    }

    public void c3(boolean z4) {
        this.f50260o3 = z4;
    }

    @Override // e8.h
    public v e() {
        T t4 = this.f50233c;
        if (t4 == 0) {
            return null;
        }
        return ((l) t4).Y();
    }

    @Override // e8.a
    public boolean h() {
        return this.f50259n3;
    }

    @Override // e8.a
    public boolean i() {
        return this.f50260o3;
    }

    @Override // e8.g
    public n r() {
        T t4 = this.f50233c;
        if (t4 == 0) {
            return null;
        }
        return ((l) t4).X();
    }

    @Override // e8.f
    public l s() {
        return (l) this.f50233c;
    }

    @Override // e8.a
    public boolean t() {
        return this.f50261p3;
    }

    @Override // e8.a
    public com.github.mikephil.charting.data.a v() {
        T t4 = this.f50233c;
        if (t4 == 0) {
            return null;
        }
        return ((l) t4).R();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.f50262q3 = new a[]{a.BAR, a.BUBBLE, a.LINE, a.CANDLE, a.SCATTER};
        Y0(new c(this, this));
        c3(true);
        this.f50249s = new com.github.mikephil.charting.renderer.f(this, this.f50252v, this.f50251u);
    }

    @Override // e8.d
    public i z() {
        T t4 = this.f50233c;
        if (t4 == 0) {
            return null;
        }
        return ((l) t4).T();
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50259n3 = true;
        this.f50260o3 = false;
        this.f50261p3 = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f50259n3 = true;
        this.f50260o3 = false;
        this.f50261p3 = false;
    }
}
