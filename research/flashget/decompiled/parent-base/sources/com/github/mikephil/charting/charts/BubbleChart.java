package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.g;
import com.github.mikephil.charting.renderer.d;
import e8.c;

/* loaded from: classes5.dex */
public class BubbleChart extends BarLineChartBase<g> implements c {
    public BubbleChart(Context context) {
        super(context);
    }

    @Override // e8.c
    public g c() {
        return (g) this.f50233c;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.f50249s = new d(this, this.f50252v, this.f50251u);
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
