package com.github.mikephil.charting.data;

/* compiled from: PieData.java */
/* loaded from: classes5.dex */
public class r extends k<f8.i> {
    public r() {
    }

    public f8.i Q() {
        return (f8.i) this.f50395i.get(0);
    }

    @Override // com.github.mikephil.charting.data.k
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public f8.i k(int i4) {
        if (i4 == 0) {
            return Q();
        }
        return null;
    }

    @Override // com.github.mikephil.charting.data.k
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public f8.i l(String str, boolean z4) {
        if (z4) {
            if (str.equalsIgnoreCase(((f8.i) this.f50395i.get(0)).o())) {
                return (f8.i) this.f50395i.get(0);
            }
            return null;
        }
        if (str.equals(((f8.i) this.f50395i.get(0)).o())) {
            return (f8.i) this.f50395i.get(0);
        }
        return null;
    }

    public float T() {
        float f4 = 0.0f;
        for (int i4 = 0; i4 < Q().h1(); i4++) {
            f4 += Q().w(i4).c();
        }
        return f4;
    }

    public void U(f8.i iVar) {
        this.f50395i.clear();
        this.f50395i.add(iVar);
        E();
    }

    @Override // com.github.mikephil.charting.data.k
    public Entry s(com.github.mikephil.charting.highlight.d dVar) {
        return Q().w((int) dVar.h());
    }

    public r(f8.i iVar) {
        super(iVar);
    }
}
