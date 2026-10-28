package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class o extends e {
    public ArrayList<e> A1;

    public o() {
        this.A1 = new ArrayList<>();
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void Q1(int i4, int i5) {
        this.f22956l0 = i4;
        this.f22958m0 = i5;
        int size = this.A1.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.A1.get(i6).Q1(Y(), Z());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void R0() {
        this.A1.clear();
        super.R0();
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void W0(androidx.constraintlayout.core.c cVar) {
        super.W0(cVar);
        int size = this.A1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.A1.get(i4).W0(cVar);
        }
    }

    public void a(e eVar) {
        this.A1.add(eVar);
        if (eVar.U() != null) {
            ((o) eVar.U()).o2(eVar);
        }
        eVar.S1(this);
    }

    public void k2(e... eVarArr) {
        for (e eVar : eVarArr) {
            a(eVar);
        }
    }

    public ArrayList<e> l2() {
        return this.A1;
    }

    public f m2() {
        e U = U();
        f fVar = this instanceof f ? (f) this : null;
        while (U != null) {
            e U2 = U.U();
            if (U instanceof f) {
                fVar = (f) U;
            }
            U = U2;
        }
        return fVar;
    }

    public void n2() {
        ArrayList<e> arrayList = this.A1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = this.A1.get(i4);
            if (eVar instanceof o) {
                ((o) eVar).n2();
            }
        }
    }

    public void o2(e eVar) {
        this.A1.remove(eVar);
        eVar.R0();
    }

    public void p2() {
        this.A1.clear();
    }

    public o(int i4, int i5, int i6, int i7) {
        super(i4, i5, i6, i7);
        this.A1 = new ArrayList<>();
    }

    public o(int i4, int i5) {
        super(0, 0, i4, i5);
        this.A1 = new ArrayList<>();
    }
}
