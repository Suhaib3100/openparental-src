package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PieRadarHighlighter.java */
/* loaded from: classes5.dex */
public abstract class h<T extends PieRadarChartBase> implements f {

    /* renamed from: a, reason: collision with root package name */
    protected T f50442a;

    /* renamed from: b, reason: collision with root package name */
    protected List<d> f50443b = new ArrayList();

    public h(T t4) {
        this.f50442a = t4;
    }

    @Override // com.github.mikephil.charting.highlight.f
    public d a(float f4, float f5) {
        if (this.f50442a.r1(f4, f5) > this.f50442a.y1()) {
            return null;
        }
        float s12 = this.f50442a.s1(f4, f5);
        T t4 = this.f50442a;
        if (t4 instanceof PieChart) {
            s12 /= t4.R().i();
        }
        int u12 = this.f50442a.u1(s12);
        if (u12 < 0 || u12 >= this.f50442a.b().w().h1()) {
            return null;
        }
        return b(u12, f4, f5);
    }

    protected abstract d b(int i4, float f4, float f5);
}
