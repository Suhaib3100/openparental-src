package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import java.util.List;

/* compiled from: YAxisRendererRadarChart.java */
/* loaded from: classes5.dex */
public class v extends t {

    /* renamed from: r, reason: collision with root package name */
    private RadarChart f50617r;

    /* renamed from: s, reason: collision with root package name */
    private Path f50618s;

    public v(com.github.mikephil.charting.utils.l lVar, com.github.mikephil.charting.components.k kVar, RadarChart radarChart) {
        super(lVar, kVar, null);
        this.f50618s = new Path();
        this.f50617r = radarChart;
    }

    @Override // com.github.mikephil.charting.renderer.a
    protected void b(float f4, float f5) {
        int i4;
        float f6 = f4;
        int C = this.f50504b.C();
        double abs = Math.abs(f5 - f6);
        if (C == 0 || abs <= com.google.firebase.remoteconfig.p.f60679p || Double.isInfinite(abs)) {
            com.github.mikephil.charting.components.a aVar = this.f50504b;
            aVar.f50274l = new float[0];
            aVar.f50275m = new float[0];
            aVar.f50276n = 0;
            return;
        }
        double L = com.github.mikephil.charting.utils.k.L(abs / C);
        if (this.f50504b.S() && L < this.f50504b.y()) {
            L = this.f50504b.y();
        }
        double L2 = com.github.mikephil.charting.utils.k.L(Math.pow(10.0d, (int) Math.log10(L)));
        if (((int) (L / L2)) > 5) {
            L = Math.floor(L2 * 10.0d);
        }
        boolean L3 = this.f50504b.L();
        if (this.f50504b.R()) {
            float f7 = ((float) abs) / (C - 1);
            com.github.mikephil.charting.components.a aVar2 = this.f50504b;
            aVar2.f50276n = C;
            if (aVar2.f50274l.length < C) {
                aVar2.f50274l = new float[C];
            }
            for (int i5 = 0; i5 < C; i5++) {
                this.f50504b.f50274l[i5] = f6;
                f6 += f7;
            }
        } else {
            double ceil = L == com.google.firebase.remoteconfig.p.f60679p ? com.google.firebase.remoteconfig.p.f60679p : Math.ceil(f6 / L) * L;
            if (L3) {
                ceil -= L;
            }
            double J = L == com.google.firebase.remoteconfig.p.f60679p ? com.google.firebase.remoteconfig.p.f60679p : com.github.mikephil.charting.utils.k.J(Math.floor(f5 / L) * L);
            if (L != com.google.firebase.remoteconfig.p.f60679p) {
                i4 = L3 ? 1 : 0;
                for (double d5 = ceil; d5 <= J; d5 += L) {
                    i4++;
                }
            } else {
                i4 = L3 ? 1 : 0;
            }
            int i6 = i4 + 1;
            com.github.mikephil.charting.components.a aVar3 = this.f50504b;
            aVar3.f50276n = i6;
            if (aVar3.f50274l.length < i6) {
                aVar3.f50274l = new float[i6];
            }
            for (int i7 = 0; i7 < i6; i7++) {
                if (ceil == com.google.firebase.remoteconfig.p.f60679p) {
                    ceil = 0.0d;
                }
                this.f50504b.f50274l[i7] = (float) ceil;
                ceil += L;
            }
            C = i6;
        }
        if (L < 1.0d) {
            this.f50504b.f50277o = (int) Math.ceil(-Math.log10(L));
        } else {
            this.f50504b.f50277o = 0;
        }
        if (L3) {
            com.github.mikephil.charting.components.a aVar4 = this.f50504b;
            if (aVar4.f50275m.length < C) {
                aVar4.f50275m = new float[C];
            }
            float[] fArr = aVar4.f50274l;
            float f10 = (fArr[1] - fArr[0]) / 2.0f;
            for (int i10 = 0; i10 < C; i10++) {
                com.github.mikephil.charting.components.a aVar5 = this.f50504b;
                aVar5.f50275m[i10] = aVar5.f50274l[i10] + f10;
            }
        }
        com.github.mikephil.charting.components.a aVar6 = this.f50504b;
        float[] fArr2 = aVar6.f50274l;
        float f11 = fArr2[0];
        aVar6.H = f11;
        float f12 = fArr2[C - 1];
        aVar6.G = f12;
        aVar6.I = Math.abs(f12 - f11);
    }

    @Override // com.github.mikephil.charting.renderer.t, com.github.mikephil.charting.renderer.a
    public void g(Canvas canvas) {
        if (this.f50604h.f() && this.f50604h.P()) {
            this.f50507e.setTypeface(this.f50604h.c());
            this.f50507e.setTextSize(this.f50604h.b());
            this.f50507e.setColor(this.f50604h.a());
            com.github.mikephil.charting.utils.g j4 = this.f50617r.j();
            com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
            float I1 = this.f50617r.I1();
            int i4 = this.f50604h.G0() ? this.f50604h.f50276n : this.f50604h.f50276n - 1;
            for (int i5 = !this.f50604h.F0() ? 1 : 0; i5 < i4; i5++) {
                com.github.mikephil.charting.components.k kVar = this.f50604h;
                com.github.mikephil.charting.utils.k.B(j4, (kVar.f50274l[i5] - kVar.H) * I1, this.f50617r.C1(), c5);
                canvas.drawText(this.f50604h.x(i5), c5.f50636d + 10.0f, c5.f50637e, this.f50507e);
            }
            com.github.mikephil.charting.utils.g.h(j4);
            com.github.mikephil.charting.utils.g.h(c5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.t, com.github.mikephil.charting.renderer.a
    public void j(Canvas canvas) {
        List<com.github.mikephil.charting.components.g> D = this.f50604h.D();
        if (D == null) {
            return;
        }
        float K1 = this.f50617r.K1();
        float I1 = this.f50617r.I1();
        com.github.mikephil.charting.utils.g j4 = this.f50617r.j();
        com.github.mikephil.charting.utils.g c5 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        for (int i4 = 0; i4 < D.size(); i4++) {
            com.github.mikephil.charting.components.g gVar = D.get(i4);
            if (gVar.f()) {
                this.f50509g.setColor(gVar.s());
                this.f50509g.setPathEffect(gVar.o());
                this.f50509g.setStrokeWidth(gVar.t());
                float r4 = (gVar.r() - this.f50617r.k()) * I1;
                Path path = this.f50618s;
                path.reset();
                for (int i5 = 0; i5 < ((com.github.mikephil.charting.data.t) this.f50617r.b()).w().h1(); i5++) {
                    com.github.mikephil.charting.utils.k.B(j4, r4, this.f50617r.C1() + (i5 * K1), c5);
                    if (i5 == 0) {
                        path.moveTo(c5.f50636d, c5.f50637e);
                    } else {
                        path.lineTo(c5.f50636d, c5.f50637e);
                    }
                }
                path.close();
                canvas.drawPath(path, this.f50509g);
            }
        }
        com.github.mikephil.charting.utils.g.h(j4);
        com.github.mikephil.charting.utils.g.h(c5);
    }
}
