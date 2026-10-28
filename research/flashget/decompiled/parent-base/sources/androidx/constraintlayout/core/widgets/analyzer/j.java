package androidx.constraintlayout.core.widgets.analyzer;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
class j extends p {
    public j(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
        eVar.f22941e.f();
        eVar.f22943f.f();
        this.f22865f = ((androidx.constraintlayout.core.widgets.h) eVar).m2();
    }

    private void u(f fVar) {
        this.f22867h.f22817k.add(fVar);
        fVar.f22818l.add(this.f22867h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        f fVar = this.f22867h;
        if (fVar.f22809c && !fVar.f22816j) {
            f fVar2 = fVar.f22818l.get(0);
            this.f22867h.e((int) ((((androidx.constraintlayout.core.widgets.h) this.f22861b).q2() * fVar2.f22813g) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) this.f22861b;
        int n22 = hVar.n2();
        int p22 = hVar.p2();
        hVar.q2();
        if (hVar.m2() == 1) {
            if (n22 != -1) {
                this.f22867h.f22818l.add(this.f22861b.f22938c0.f22941e.f22867h);
                this.f22861b.f22938c0.f22941e.f22867h.f22817k.add(this.f22867h);
                this.f22867h.f22812f = n22;
            } else if (p22 != -1) {
                this.f22867h.f22818l.add(this.f22861b.f22938c0.f22941e.f22868i);
                this.f22861b.f22938c0.f22941e.f22868i.f22817k.add(this.f22867h);
                this.f22867h.f22812f = -p22;
            } else {
                f fVar = this.f22867h;
                fVar.f22808b = true;
                fVar.f22818l.add(this.f22861b.f22938c0.f22941e.f22868i);
                this.f22861b.f22938c0.f22941e.f22868i.f22817k.add(this.f22867h);
            }
            u(this.f22861b.f22941e.f22867h);
            u(this.f22861b.f22941e.f22868i);
            return;
        }
        if (n22 != -1) {
            this.f22867h.f22818l.add(this.f22861b.f22938c0.f22943f.f22867h);
            this.f22861b.f22938c0.f22943f.f22867h.f22817k.add(this.f22867h);
            this.f22867h.f22812f = n22;
        } else if (p22 != -1) {
            this.f22867h.f22818l.add(this.f22861b.f22938c0.f22943f.f22868i);
            this.f22861b.f22938c0.f22943f.f22868i.f22817k.add(this.f22867h);
            this.f22867h.f22812f = -p22;
        } else {
            f fVar2 = this.f22867h;
            fVar2.f22808b = true;
            fVar2.f22818l.add(this.f22861b.f22938c0.f22943f.f22868i);
            this.f22861b.f22938c0.f22943f.f22868i.f22817k.add(this.f22867h);
        }
        u(this.f22861b.f22943f.f22867h);
        u(this.f22861b.f22943f.f22868i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        if (((androidx.constraintlayout.core.widgets.h) this.f22861b).m2() == 1) {
            this.f22861b.f2(this.f22867h.f22813g);
        } else {
            this.f22861b.g2(this.f22867h.f22813g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f22867h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f22867h.f22816j = false;
        this.f22868i.f22816j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        return false;
    }
}
