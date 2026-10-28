package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.analyzer.g;

/* compiled from: DimensionDependency.java */
/* loaded from: classes3.dex */
class h extends g {

    /* renamed from: m, reason: collision with root package name */
    public int f2411m;

    public h(q qVar) {
        super(qVar);
        if (qVar instanceof m) {
            this.f2403e = g.a.HORIZONTAL_DIMENSION;
        } else {
            this.f2403e = g.a.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.g
    public void e(int i5) {
        if (this.f2408j) {
            return;
        }
        this.f2408j = true;
        this.f2405g = i5;
        for (d dVar : this.f2409k) {
            dVar.a(dVar);
        }
    }
}
