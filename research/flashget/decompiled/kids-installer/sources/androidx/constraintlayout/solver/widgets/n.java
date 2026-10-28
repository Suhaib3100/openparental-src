package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes3.dex */
public class n extends e {

    /* renamed from: o1, reason: collision with root package name */
    public ArrayList<e> f2651o1;

    public n() {
        this.f2651o1 = new ArrayList<>();
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void F0() {
        this.f2651o1.clear();
        super.F0();
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void K0(androidx.constraintlayout.solver.c cVar) {
        super.K0(cVar);
        int size = this.f2651o1.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f2651o1.get(i5).K0(cVar);
        }
    }

    public void O1(e... eVarArr) {
        for (e eVar : eVarArr) {
            a(eVar);
        }
    }

    public ArrayList<e> P1() {
        return this.f2651o1;
    }

    public f Q1() {
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

    public void R1() {
        ArrayList<e> arrayList = this.f2651o1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.f2651o1.get(i5);
            if (eVar instanceof n) {
                ((n) eVar).R1();
            }
        }
    }

    public void S1(e eVar) {
        this.f2651o1.remove(eVar);
        eVar.F0();
    }

    public void T1() {
        this.f2651o1.clear();
    }

    public void a(e eVar) {
        this.f2651o1.add(eVar);
        if (eVar.U() != null) {
            ((n) eVar.U()).S1(eVar);
        }
        eVar.x1(this);
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void v1(int i5, int i6) {
        this.f2519e0 = i5;
        this.f2521f0 = i6;
        int size = this.f2651o1.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f2651o1.get(i7).v1(Y(), Z());
        }
    }

    public n(int i5, int i6, int i7, int i8) {
        super(i5, i6, i7, i8);
        this.f2651o1 = new ArrayList<>();
    }

    public n(int i5, int i6) {
        super(0, 0, i5, i6);
        this.f2651o1 = new ArrayList<>();
    }
}
