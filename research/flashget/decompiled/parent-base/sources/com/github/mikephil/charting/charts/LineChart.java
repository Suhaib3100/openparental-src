package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.n;
import com.github.mikephil.charting.renderer.j;
import e8.g;

/* loaded from: classes5.dex */
public class LineChart extends BarLineChartBase<n> implements g {
    public LineChart(Context context) {
        super(context);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.github.mikephil.charting.renderer.g gVar = this.f50249s;
        if (gVar != null && (gVar instanceof j)) {
            ((j) gVar).A();
        }
        super.onDetachedFromWindow();
    }

    @Override // e8.g
    public n r() {
        return (n) this.f50233c;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.f50249s = new j(this, this.f50252v, this.f50251u);
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
