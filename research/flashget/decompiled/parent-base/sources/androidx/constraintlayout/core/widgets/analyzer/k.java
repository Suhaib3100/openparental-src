package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;
import java.util.Iterator;

/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
class k extends p {
    public k(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
    }

    private void u(f fVar) {
        this.f22867h.f22817k.add(fVar);
        fVar.f22818l.add(this.f22867h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f22861b;
        int p22 = aVar.p2();
        Iterator<f> it = this.f22867h.f22818l.iterator();
        int i4 = 0;
        int i5 = -1;
        while (it.hasNext()) {
            int i6 = it.next().f22813g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (p22 == 0 || p22 == 2) {
            this.f22867h.e(aVar.q2() + i5);
        } else {
            this.f22867h.e(aVar.q2() + i4);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        androidx.constraintlayout.core.widgets.e eVar = this.f22861b;
        if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
            this.f22867h.f22808b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) eVar;
            int p22 = aVar.p2();
            boolean o22 = aVar.o2();
            int i4 = 0;
            if (p22 == 0) {
                this.f22867h.f22811e = f.a.LEFT;
                while (i4 < aVar.B1) {
                    androidx.constraintlayout.core.widgets.e eVar2 = aVar.A1[i4];
                    if (o22 || eVar2.l0() != 8) {
                        f fVar = eVar2.f22941e.f22867h;
                        fVar.f22817k.add(this.f22867h);
                        this.f22867h.f22818l.add(fVar);
                    }
                    i4++;
                }
                u(this.f22861b.f22941e.f22867h);
                u(this.f22861b.f22941e.f22868i);
                return;
            }
            if (p22 == 1) {
                this.f22867h.f22811e = f.a.RIGHT;
                while (i4 < aVar.B1) {
                    androidx.constraintlayout.core.widgets.e eVar3 = aVar.A1[i4];
                    if (o22 || eVar3.l0() != 8) {
                        f fVar2 = eVar3.f22941e.f22868i;
                        fVar2.f22817k.add(this.f22867h);
                        this.f22867h.f22818l.add(fVar2);
                    }
                    i4++;
                }
                u(this.f22861b.f22941e.f22867h);
                u(this.f22861b.f22941e.f22868i);
                return;
            }
            if (p22 == 2) {
                this.f22867h.f22811e = f.a.TOP;
                while (i4 < aVar.B1) {
                    androidx.constraintlayout.core.widgets.e eVar4 = aVar.A1[i4];
                    if (o22 || eVar4.l0() != 8) {
                        f fVar3 = eVar4.f22943f.f22867h;
                        fVar3.f22817k.add(this.f22867h);
                        this.f22867h.f22818l.add(fVar3);
                    }
                    i4++;
                }
                u(this.f22861b.f22943f.f22867h);
                u(this.f22861b.f22943f.f22868i);
                return;
            }
            if (p22 != 3) {
                return;
            }
            this.f22867h.f22811e = f.a.BOTTOM;
            while (i4 < aVar.B1) {
                androidx.constraintlayout.core.widgets.e eVar5 = aVar.A1[i4];
                if (o22 || eVar5.l0() != 8) {
                    f fVar4 = eVar5.f22943f.f22868i;
                    fVar4.f22817k.add(this.f22867h);
                    this.f22867h.f22818l.add(fVar4);
                }
                i4++;
            }
            u(this.f22861b.f22943f.f22867h);
            u(this.f22861b.f22943f.f22868i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        androidx.constraintlayout.core.widgets.e eVar = this.f22861b;
        if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
            int p22 = ((androidx.constraintlayout.core.widgets.a) eVar).p2();
            if (p22 == 0 || p22 == 1) {
                this.f22861b.f2(this.f22867h.f22813g);
            } else {
                this.f22861b.g2(this.f22867h.f22813g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f22862c = null;
        this.f22867h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f22867h.f22816j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        return false;
    }
}
