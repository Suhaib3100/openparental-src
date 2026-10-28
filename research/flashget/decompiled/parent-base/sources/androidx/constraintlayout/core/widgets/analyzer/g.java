package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;

/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f22819m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f22811e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f22811e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public void e(int i4) {
        if (this.f22816j) {
            return;
        }
        this.f22816j = true;
        this.f22813g = i4;
        for (d dVar : this.f22817k) {
            dVar.a(dVar);
        }
    }
}
