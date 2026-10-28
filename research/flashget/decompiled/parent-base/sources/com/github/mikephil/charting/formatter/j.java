package com.github.mikephil.charting.formatter;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import java.text.DecimalFormat;

/* compiled from: PercentFormatter.java */
/* loaded from: classes5.dex */
public class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public DecimalFormat f50424a;

    /* renamed from: b, reason: collision with root package name */
    private PieChart f50425b;

    public j() {
        this.f50424a = new DecimalFormat(ProtectedSandApp.s("쐹"));
    }

    @Override // com.github.mikephil.charting.formatter.l
    public String h(float f4) {
        return this.f50424a.format(f4) + ProtectedSandApp.s("쐺");
    }

    @Override // com.github.mikephil.charting.formatter.l
    public String i(float f4, PieEntry pieEntry) {
        PieChart pieChart = this.f50425b;
        return (pieChart == null || !pieChart.c2()) ? this.f50424a.format(f4) : h(f4);
    }

    public j(PieChart pieChart) {
        this();
        this.f50425b = pieChart;
    }
}
