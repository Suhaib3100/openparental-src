package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CombinedData.java */
/* loaded from: classes5.dex */
public class l extends c<f8.b<? extends Entry>> {

    /* renamed from: j, reason: collision with root package name */
    private n f50396j;

    /* renamed from: k, reason: collision with root package name */
    private a f50397k;

    /* renamed from: l, reason: collision with root package name */
    private v f50398l;

    /* renamed from: m, reason: collision with root package name */
    private i f50399m;

    /* renamed from: n, reason: collision with root package name */
    private g f50400n;

    @Override // com.github.mikephil.charting.data.k
    public void E() {
        n nVar = this.f50396j;
        if (nVar != null) {
            nVar.E();
        }
        a aVar = this.f50397k;
        if (aVar != null) {
            aVar.E();
        }
        i iVar = this.f50399m;
        if (iVar != null) {
            iVar.E();
        }
        v vVar = this.f50398l;
        if (vVar != null) {
            vVar.E();
        }
        g gVar = this.f50400n;
        if (gVar != null) {
            gVar.E();
        }
        d();
    }

    @Override // com.github.mikephil.charting.data.k
    @Deprecated
    public boolean F(int i4) {
        return false;
    }

    @Override // com.github.mikephil.charting.data.k
    @Deprecated
    public boolean H(float f4, int i4) {
        return false;
    }

    @Override // com.github.mikephil.charting.data.k
    @Deprecated
    public boolean I(Entry entry, int i4) {
        return false;
    }

    public List<c> Q() {
        ArrayList arrayList = new ArrayList();
        n nVar = this.f50396j;
        if (nVar != null) {
            arrayList.add(nVar);
        }
        a aVar = this.f50397k;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        v vVar = this.f50398l;
        if (vVar != null) {
            arrayList.add(vVar);
        }
        i iVar = this.f50399m;
        if (iVar != null) {
            arrayList.add(iVar);
        }
        g gVar = this.f50400n;
        if (gVar != null) {
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public a R() {
        return this.f50397k;
    }

    public g S() {
        return this.f50400n;
    }

    public i T() {
        return this.f50399m;
    }

    public c U(int i4) {
        return Q().get(i4);
    }

    public int V(k kVar) {
        return Q().indexOf(kVar);
    }

    public f8.b<? extends Entry> W(com.github.mikephil.charting.highlight.d dVar) {
        if (dVar.c() >= Q().size()) {
            return null;
        }
        c U = U(dVar.c());
        if (dVar.d() >= U.m()) {
            return null;
        }
        return (f8.b) U.q().get(dVar.d());
    }

    public n X() {
        return this.f50396j;
    }

    public v Y() {
        return this.f50398l;
    }

    @Override // com.github.mikephil.charting.data.k
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public boolean G(f8.b<? extends Entry> bVar) {
        Iterator<c> it = Q().iterator();
        boolean z4 = false;
        while (it.hasNext() && !(z4 = it.next().G(bVar))) {
        }
        return z4;
    }

    public void a0(a aVar) {
        this.f50397k = aVar;
        E();
    }

    public void b0(g gVar) {
        this.f50400n = gVar;
        E();
    }

    public void c0(i iVar) {
        this.f50399m = iVar;
        E();
    }

    @Override // com.github.mikephil.charting.data.k
    public void d() {
        if (this.f50395i == null) {
            this.f50395i = new ArrayList();
        }
        this.f50395i.clear();
        this.f50387a = -3.4028235E38f;
        this.f50388b = Float.MAX_VALUE;
        this.f50389c = -3.4028235E38f;
        this.f50390d = Float.MAX_VALUE;
        this.f50391e = -3.4028235E38f;
        this.f50392f = Float.MAX_VALUE;
        this.f50393g = -3.4028235E38f;
        this.f50394h = Float.MAX_VALUE;
        for (c cVar : Q()) {
            cVar.d();
            this.f50395i.addAll(cVar.q());
            if (cVar.z() > this.f50387a) {
                this.f50387a = cVar.z();
            }
            if (cVar.B() < this.f50388b) {
                this.f50388b = cVar.B();
            }
            if (cVar.x() > this.f50389c) {
                this.f50389c = cVar.x();
            }
            if (cVar.y() < this.f50390d) {
                this.f50390d = cVar.y();
            }
            float f4 = cVar.f50391e;
            if (f4 > this.f50391e) {
                this.f50391e = f4;
            }
            float f5 = cVar.f50392f;
            if (f5 < this.f50392f) {
                this.f50392f = f5;
            }
            float f6 = cVar.f50393g;
            if (f6 > this.f50393g) {
                this.f50393g = f6;
            }
            float f7 = cVar.f50394h;
            if (f7 < this.f50394h) {
                this.f50394h = f7;
            }
        }
    }

    public void d0(n nVar) {
        this.f50396j = nVar;
        E();
    }

    public void e0(v vVar) {
        this.f50398l = vVar;
        E();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f8.e] */
    @Override // com.github.mikephil.charting.data.k
    public Entry s(com.github.mikephil.charting.highlight.d dVar) {
        if (dVar.c() >= Q().size()) {
            return null;
        }
        c U = U(dVar.c());
        if (dVar.d() >= U.m()) {
            return null;
        }
        for (Entry entry : U.k(dVar.d()).N(dVar.h())) {
            if (entry.c() == dVar.j() || Float.isNaN(dVar.j())) {
                return entry;
            }
        }
        return null;
    }
}
