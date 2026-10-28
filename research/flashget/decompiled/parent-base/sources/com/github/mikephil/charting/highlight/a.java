package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarEntry;

/* compiled from: BarHighlighter.java */
/* loaded from: classes5.dex */
public class a extends b<e8.a> {
    public a(e8.a aVar) {
        super(aVar);
    }

    @Override // com.github.mikephil.charting.highlight.b, com.github.mikephil.charting.highlight.f
    public d a(float f4, float f5) {
        d a5 = super.a(f4, f5);
        if (a5 == null) {
            return null;
        }
        com.github.mikephil.charting.utils.f j4 = j(f4, f5);
        f8.a aVar = (f8.a) ((e8.a) this.f50429a).v().k(a5.d());
        if (aVar.d1()) {
            return l(a5, aVar, (float) j4.f50632d, (float) j4.f50633e);
        }
        com.github.mikephil.charting.utils.f.c(j4);
        return a5;
    }

    @Override // com.github.mikephil.charting.highlight.b
    protected com.github.mikephil.charting.data.c d() {
        return ((e8.a) this.f50429a).v();
    }

    @Override // com.github.mikephil.charting.highlight.b
    protected float e(float f4, float f5, float f6, float f7) {
        return Math.abs(f4 - f6);
    }

    protected int k(j[] jVarArr, float f4) {
        if (jVarArr == null || jVarArr.length == 0) {
            return 0;
        }
        int i4 = 0;
        for (j jVar : jVarArr) {
            if (jVar.a(f4)) {
                return i4;
            }
            i4++;
        }
        int max = Math.max(jVarArr.length - 1, 0);
        if (f4 > jVarArr[max].f50445b) {
            return max;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d l(d dVar, f8.a aVar, float f4, float f5) {
        BarEntry barEntry = (BarEntry) aVar.o0(f4, f5);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.y() == null) {
            return dVar;
        }
        j[] w4 = barEntry.w();
        if (w4.length <= 0) {
            return null;
        }
        int k4 = k(w4, f5);
        com.github.mikephil.charting.utils.f f6 = ((e8.a) this.f50429a).d(aVar.U()).f(dVar.h(), w4[k4].f50445b);
        d dVar2 = new d(barEntry.j(), barEntry.c(), (float) f6.f50632d, (float) f6.f50633e, dVar.d(), k4, dVar.b());
        com.github.mikephil.charting.utils.f.c(f6);
        return dVar2;
    }
}
