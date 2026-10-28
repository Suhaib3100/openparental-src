package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;

/* compiled from: XAxisRendererRadarChart.java */
/* loaded from: classes5.dex */
public class s extends q {

    /* renamed from: p, reason: collision with root package name */
    private RadarChart f50602p;

    public s(com.github.mikephil.charting.utils.l lVar, com.github.mikephil.charting.components.j jVar, RadarChart radarChart) {
        super(lVar, jVar, null);
        this.f50602p = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void g(Canvas canvas) {
        if (this.f50592h.f() && this.f50592h.P()) {
            float v02 = this.f50592h.v0();
            com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.5f, 0.25f);
            this.f50507e.setTypeface(this.f50592h.c());
            this.f50507e.setTextSize(this.f50592h.b());
            this.f50507e.setColor(this.f50592h.a());
            float K1 = this.f50602p.K1();
            float I1 = this.f50602p.I1();
            com.github.mikephil.charting.utils.g j4 = this.f50602p.j();
            com.github.mikephil.charting.utils.g c6 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
            for (int i4 = 0; i4 < ((com.github.mikephil.charting.data.t) this.f50602p.b()).w().h1(); i4++) {
                float f4 = i4;
                String c7 = this.f50592h.H().c(f4, this.f50592h);
                com.github.mikephil.charting.utils.k.B(j4, (this.f50592h.L / 2.0f) + (this.f50602p.R1() * I1), (this.f50602p.C1() + (f4 * K1)) % 360.0f, c6);
                m(canvas, c7, c6.f50636d, c6.f50637e - (this.f50592h.M / 2.0f), c5, v02);
            }
            com.github.mikephil.charting.utils.g.h(j4);
            com.github.mikephil.charting.utils.g.h(c6);
            com.github.mikephil.charting.utils.g.h(c5);
        }
    }

    @Override // com.github.mikephil.charting.renderer.q, com.github.mikephil.charting.renderer.a
    public void j(Canvas canvas) {
    }
}
