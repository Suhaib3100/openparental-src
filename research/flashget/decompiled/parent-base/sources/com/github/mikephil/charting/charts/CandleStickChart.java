package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.i;
import com.github.mikephil.charting.renderer.e;
import e8.d;

/* loaded from: classes5.dex */
public class CandleStickChart extends BarLineChartBase<i> implements d {
    public CandleStickChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.f50249s = new e(this, this.f50252v, this.f50251u);
        o0().t0(0.5f);
        o0().s0(0.5f);
    }

    @Override // e8.d
    public i z() {
        return (i) this.f50233c;
    }

    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
