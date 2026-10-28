package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.m;
import java.util.List;

/* compiled from: CombinedHighlighter.java */
/* loaded from: classes5.dex */
public class c extends b<e8.f> implements f {

    /* renamed from: c, reason: collision with root package name */
    protected a f50431c;

    public c(e8.f fVar, e8.a aVar) {
        super(fVar);
        this.f50431c = aVar.v() == null ? null : new a(aVar);
    }

    @Override // com.github.mikephil.charting.highlight.b
    protected List<d> h(float f4, float f5, float f6) {
        this.f50430b.clear();
        List<com.github.mikephil.charting.data.c> Q = ((e8.f) this.f50429a).s().Q();
        for (int i4 = 0; i4 < Q.size(); i4++) {
            com.github.mikephil.charting.data.c cVar = Q.get(i4);
            a aVar = this.f50431c;
            if (aVar == null || !(cVar instanceof com.github.mikephil.charting.data.a)) {
                int m4 = cVar.m();
                for (int i5 = 0; i5 < m4; i5++) {
                    f8.e k4 = Q.get(i4).k(i5);
                    if (k4.k1()) {
                        for (d dVar : b(k4, i5, f4, m.a.CLOSEST)) {
                            dVar.m(i4);
                            this.f50430b.add(dVar);
                        }
                    }
                }
            } else {
                d a5 = aVar.a(f5, f6);
                if (a5 != null) {
                    a5.m(i4);
                    this.f50430b.add(a5);
                }
            }
        }
        return this.f50430b;
    }
}
