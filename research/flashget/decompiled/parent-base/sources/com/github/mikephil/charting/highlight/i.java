package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.t;
import com.github.mikephil.charting.utils.k;
import java.util.List;

/* compiled from: RadarHighlighter.java */
/* loaded from: classes5.dex */
public class i extends h<RadarChart> {
    public i(RadarChart radarChart) {
        super(radarChart);
    }

    @Override // com.github.mikephil.charting.highlight.h
    protected d b(int i4, float f4, float f5) {
        List<d> c5 = c(i4);
        float r12 = ((RadarChart) this.f50442a).r1(f4, f5) / ((RadarChart) this.f50442a).I1();
        d dVar = null;
        float f6 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < c5.size(); i5++) {
            d dVar2 = c5.get(i5);
            float abs = Math.abs(dVar2.j() - r12);
            if (abs < f6) {
                dVar = dVar2;
                f6 = abs;
            }
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    protected List<d> c(int i4) {
        int i5 = i4;
        this.f50443b.clear();
        float h4 = ((RadarChart) this.f50442a).R().h();
        float i6 = ((RadarChart) this.f50442a).R().i();
        float K1 = ((RadarChart) this.f50442a).K1();
        float I1 = ((RadarChart) this.f50442a).I1();
        com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        int i7 = 0;
        while (i7 < ((t) ((RadarChart) this.f50442a).b()).m()) {
            f8.j k4 = ((t) ((RadarChart) this.f50442a).b()).k(i7);
            ?? w4 = k4.w(i5);
            float f4 = i5;
            k.B(((RadarChart) this.f50442a).j(), (w4.c() - ((RadarChart) this.f50442a).k()) * I1 * i6, ((RadarChart) this.f50442a).C1() + (K1 * f4 * h4), c5);
            this.f50443b.add(new d(f4, w4.c(), c5.f50636d, c5.f50637e, i7, k4.U()));
            i7++;
            i5 = i4;
        }
        return this.f50443b;
    }
}
