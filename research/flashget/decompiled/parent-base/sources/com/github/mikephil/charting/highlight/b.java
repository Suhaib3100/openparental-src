package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.m;
import e8.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChartHighlighter.java */
/* loaded from: classes5.dex */
public class b<T extends e8.b> implements f {

    /* renamed from: a, reason: collision with root package name */
    protected T f50429a;

    /* renamed from: b, reason: collision with root package name */
    protected List<d> f50430b = new ArrayList();

    public b(T t4) {
        this.f50429a = t4;
    }

    @Override // com.github.mikephil.charting.highlight.f
    public d a(float f4, float f5) {
        com.github.mikephil.charting.utils.f j4 = j(f4, f5);
        float f6 = (float) j4.f50632d;
        com.github.mikephil.charting.utils.f.c(j4);
        return f(f6, f4, f5);
    }

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
            com.github.mikephil.charting.utils.f f5 = this.f50429a.d(eVar.U()).f(entry.j(), entry.c());
            arrayList.add(new d(entry.j(), entry.c(), (float) f5.f50632d, (float) f5.f50633e, i4, eVar.U()));
        }
        return arrayList;
    }

    public d c(List<d> list, float f4, float f5, k.a aVar, float f6) {
        d dVar = null;
        for (int i4 = 0; i4 < list.size(); i4++) {
            d dVar2 = list.get(i4);
            if (aVar == null || dVar2.b() == aVar) {
                float e4 = e(f4, f5, dVar2.i(), dVar2.k());
                if (e4 < f6) {
                    dVar = dVar2;
                    f6 = e4;
                }
            }
        }
        return dVar;
    }

    protected com.github.mikephil.charting.data.c d() {
        return this.f50429a.b();
    }

    protected float e(float f4, float f5, float f6, float f7) {
        return (float) Math.hypot(f4 - f6, f5 - f7);
    }

    protected d f(float f4, float f5, float f6) {
        List<d> h4 = h(f4, f5, f6);
        if (h4.isEmpty()) {
            return null;
        }
        k.a aVar = k.a.LEFT;
        float i4 = i(h4, f6, aVar);
        k.a aVar2 = k.a.RIGHT;
        return c(h4, f5, f6, i4 < i(h4, f6, aVar2) ? aVar : aVar2, this.f50429a.p());
    }

    protected float g(d dVar) {
        return dVar.k();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f8.e] */
    protected List<d> h(float f4, float f5, float f6) {
        this.f50430b.clear();
        com.github.mikephil.charting.data.c d5 = d();
        if (d5 == null) {
            return this.f50430b;
        }
        int m4 = d5.m();
        for (int i4 = 0; i4 < m4; i4++) {
            ?? k4 = d5.k(i4);
            if (k4.k1()) {
                this.f50430b.addAll(b(k4, i4, f4, m.a.CLOSEST));
            }
        }
        return this.f50430b;
    }

    protected float i(List<d> list, float f4, k.a aVar) {
        float f5 = Float.MAX_VALUE;
        for (int i4 = 0; i4 < list.size(); i4++) {
            d dVar = list.get(i4);
            if (dVar.b() == aVar) {
                float abs = Math.abs(g(dVar) - f4);
                if (abs < f5) {
                    f5 = abs;
                }
            }
        }
        return f5;
    }

    protected com.github.mikephil.charting.utils.f j(float f4, float f5) {
        return this.f50429a.d(k.a.LEFT).j(f4, f5);
    }
}
