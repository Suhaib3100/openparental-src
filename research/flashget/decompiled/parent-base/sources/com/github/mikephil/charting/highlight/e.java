package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: HorizontalBarHighlighter.java */
/* loaded from: classes5.dex */
public class e extends a {
    public e(e8.a aVar) {
        super(aVar);
    }

    @Override // com.github.mikephil.charting.highlight.a, com.github.mikephil.charting.highlight.b, com.github.mikephil.charting.highlight.f
    public d a(float f4, float f5) {
        com.github.mikephil.charting.data.a v4 = ((e8.a) this.f50429a).v();
        com.github.mikephil.charting.utils.f j4 = j(f5, f4);
        d f6 = f((float) j4.f50633e, f5, f4);
        if (f6 == null) {
            return null;
        }
        f8.a aVar = (f8.a) v4.k(f6.d());
        if (aVar.d1()) {
            return l(f6, aVar, (float) j4.f50633e, (float) j4.f50632d);
        }
        com.github.mikephil.charting.utils.f.c(j4);
        return f6;
    }

    @Override // com.github.mikephil.charting.highlight.b
    protected List<d> b(f8.e eVar, int i4, float f4, m.a aVar) {
        Entry Q0;
        ArrayList arrayList = new ArrayList();
        List<Entry> N = eVar.N(f4);
        if (N.size() == 0 && (Q0 = eVar.Q0(f4, Float.NaN, aVar)) != null) {
            N = eVar.N(Q0.j());
        }
        if (N.size() == 0) {
            return arrayList;
        }
        for (Entry entry : N) {
            com.github.mikephil.charting.utils.f f5 = ((e8.a) this.f50429a).d(eVar.U()).f(entry.c(), entry.j());
            arrayList.add(new d(entry.j(), entry.c(), (float) f5.f50632d, (float) f5.f50633e, i4, eVar.U()));
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.highlight.a, com.github.mikephil.charting.highlight.b
    protected float e(float f4, float f5, float f6, float f7) {
        return Math.abs(f5 - f7);
    }
}
