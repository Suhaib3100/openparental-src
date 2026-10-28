package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.r;

/* compiled from: PieHighlighter.java */
/* loaded from: classes5.dex */
public class g extends h<PieChart> {
    public g(PieChart pieChart) {
        super(pieChart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.highlight.h
    protected d b(int i4, float f4, float f5) {
        f8.i Q = ((r) ((PieChart) this.f50442a).b()).Q();
        return new d(i4, Q.w(i4).c(), f4, f5, 0, Q.U());
    }
}
