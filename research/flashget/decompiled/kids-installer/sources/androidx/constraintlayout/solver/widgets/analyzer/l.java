package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.analyzer.g;
import java.util.Iterator;

/* compiled from: HelperReferences.java */
/* loaded from: classes3.dex */
class l extends q {
    public l(androidx.constraintlayout.solver.widgets.e eVar) {
        super(eVar);
    }

    private void u(g gVar) {
        this.f2456h.f2409k.add(gVar);
        gVar.f2410l.add(this.f2456h);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q, androidx.constraintlayout.solver.widgets.analyzer.d
    public void a(d dVar) {
        androidx.constraintlayout.solver.widgets.a aVar = (androidx.constraintlayout.solver.widgets.a) this.f2450b;
        int S1 = aVar.S1();
        Iterator<g> it = this.f2456h.f2410l.iterator();
        int i5 = 0;
        int i6 = -1;
        while (it.hasNext()) {
            int i7 = it.next().f2405g;
            if (i6 == -1 || i7 < i6) {
                i6 = i7;
            }
            if (i5 < i7) {
                i5 = i7;
            }
        }
        if (S1 == 0 || S1 == 2) {
            this.f2456h.e(aVar.T1() + i6);
        } else {
            this.f2456h.e(aVar.T1() + i5);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void d() {
        androidx.constraintlayout.solver.widgets.e eVar = this.f2450b;
        if (eVar instanceof androidx.constraintlayout.solver.widgets.a) {
            this.f2456h.f2400b = true;
            androidx.constraintlayout.solver.widgets.a aVar = (androidx.constraintlayout.solver.widgets.a) eVar;
            int S1 = aVar.S1();
            boolean R1 = aVar.R1();
            int i5 = 0;
            if (S1 == 0) {
                this.f2456h.f2403e = g.a.LEFT;
                while (i5 < aVar.f2619p1) {
                    androidx.constraintlayout.solver.widgets.e eVar2 = aVar.f2618o1[i5];
                    if (R1 || eVar2.i0() != 8) {
                        g gVar = eVar2.f2518e.f2456h;
                        gVar.f2409k.add(this.f2456h);
                        this.f2456h.f2410l.add(gVar);
                    }
                    i5++;
                }
                u(this.f2450b.f2518e.f2456h);
                u(this.f2450b.f2518e.f2457i);
                return;
            }
            if (S1 == 1) {
                this.f2456h.f2403e = g.a.RIGHT;
                while (i5 < aVar.f2619p1) {
                    androidx.constraintlayout.solver.widgets.e eVar3 = aVar.f2618o1[i5];
                    if (R1 || eVar3.i0() != 8) {
                        g gVar2 = eVar3.f2518e.f2457i;
                        gVar2.f2409k.add(this.f2456h);
                        this.f2456h.f2410l.add(gVar2);
                    }
                    i5++;
                }
                u(this.f2450b.f2518e.f2456h);
                u(this.f2450b.f2518e.f2457i);
                return;
            }
            if (S1 == 2) {
                this.f2456h.f2403e = g.a.TOP;
                while (i5 < aVar.f2619p1) {
                    androidx.constraintlayout.solver.widgets.e eVar4 = aVar.f2618o1[i5];
                    if (R1 || eVar4.i0() != 8) {
                        g gVar3 = eVar4.f2520f.f2456h;
                        gVar3.f2409k.add(this.f2456h);
                        this.f2456h.f2410l.add(gVar3);
                    }
                    i5++;
                }
                u(this.f2450b.f2520f.f2456h);
                u(this.f2450b.f2520f.f2457i);
                return;
            }
            if (S1 != 3) {
                return;
            }
            this.f2456h.f2403e = g.a.BOTTOM;
            while (i5 < aVar.f2619p1) {
                androidx.constraintlayout.solver.widgets.e eVar5 = aVar.f2618o1[i5];
                if (R1 || eVar5.i0() != 8) {
                    g gVar4 = eVar5.f2520f.f2457i;
                    gVar4.f2409k.add(this.f2456h);
                    this.f2456h.f2410l.add(gVar4);
                }
                i5++;
            }
            u(this.f2450b.f2520f.f2456h);
            u(this.f2450b.f2520f.f2457i);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    public void e() {
        androidx.constraintlayout.solver.widgets.e eVar = this.f2450b;
        if (eVar instanceof androidx.constraintlayout.solver.widgets.a) {
            int S1 = ((androidx.constraintlayout.solver.widgets.a) eVar).S1();
            if (S1 == 0 || S1 == 1) {
                this.f2450b.J1(this.f2456h.f2405g);
            } else {
                this.f2450b.K1(this.f2456h.f2405g);
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void f() {
        this.f2451c = null;
        this.f2456h.c();
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void n() {
        this.f2456h.f2408j = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    boolean p() {
        return false;
    }
}
