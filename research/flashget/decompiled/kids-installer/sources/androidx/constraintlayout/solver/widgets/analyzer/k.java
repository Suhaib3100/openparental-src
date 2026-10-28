package androidx.constraintlayout.solver.widgets.analyzer;

/* compiled from: GuidelineReference.java */
/* loaded from: classes3.dex */
class k extends q {
    public k(androidx.constraintlayout.solver.widgets.e eVar) {
        super(eVar);
        eVar.f2518e.f();
        eVar.f2520f.f();
        this.f2454f = ((androidx.constraintlayout.solver.widgets.h) eVar).Q1();
    }

    private void u(g gVar) {
        this.f2456h.f2409k.add(gVar);
        gVar.f2410l.add(this.f2456h);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q, androidx.constraintlayout.solver.widgets.analyzer.d
    public void a(d dVar) {
        g gVar = this.f2456h;
        if (gVar.f2401c && !gVar.f2408j) {
            g gVar2 = gVar.f2410l.get(0);
            this.f2456h.e((int) ((((androidx.constraintlayout.solver.widgets.h) this.f2450b).U1() * gVar2.f2405g) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void d() {
        androidx.constraintlayout.solver.widgets.h hVar = (androidx.constraintlayout.solver.widgets.h) this.f2450b;
        int R1 = hVar.R1();
        int T1 = hVar.T1();
        hVar.U1();
        if (hVar.Q1() == 1) {
            if (R1 != -1) {
                this.f2456h.f2410l.add(this.f2450b.V.f2518e.f2456h);
                this.f2450b.V.f2518e.f2456h.f2409k.add(this.f2456h);
                this.f2456h.f2404f = R1;
            } else if (T1 != -1) {
                this.f2456h.f2410l.add(this.f2450b.V.f2518e.f2457i);
                this.f2450b.V.f2518e.f2457i.f2409k.add(this.f2456h);
                this.f2456h.f2404f = -T1;
            } else {
                g gVar = this.f2456h;
                gVar.f2400b = true;
                gVar.f2410l.add(this.f2450b.V.f2518e.f2457i);
                this.f2450b.V.f2518e.f2457i.f2409k.add(this.f2456h);
            }
            u(this.f2450b.f2518e.f2456h);
            u(this.f2450b.f2518e.f2457i);
            return;
        }
        if (R1 != -1) {
            this.f2456h.f2410l.add(this.f2450b.V.f2520f.f2456h);
            this.f2450b.V.f2520f.f2456h.f2409k.add(this.f2456h);
            this.f2456h.f2404f = R1;
        } else if (T1 != -1) {
            this.f2456h.f2410l.add(this.f2450b.V.f2520f.f2457i);
            this.f2450b.V.f2520f.f2457i.f2409k.add(this.f2456h);
            this.f2456h.f2404f = -T1;
        } else {
            g gVar2 = this.f2456h;
            gVar2.f2400b = true;
            gVar2.f2410l.add(this.f2450b.V.f2520f.f2457i);
            this.f2450b.V.f2520f.f2457i.f2409k.add(this.f2456h);
        }
        u(this.f2450b.f2520f.f2456h);
        u(this.f2450b.f2520f.f2457i);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    public void e() {
        if (((androidx.constraintlayout.solver.widgets.h) this.f2450b).Q1() == 1) {
            this.f2450b.J1(this.f2456h.f2405g);
        } else {
            this.f2450b.K1(this.f2456h.f2405g);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void f() {
        this.f2456h.c();
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void n() {
        this.f2456h.f2408j = false;
        this.f2457i.f2408j = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    boolean p() {
        return false;
    }
}
