package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: HelperWidget.java */
/* loaded from: classes3.dex */
public class j extends e implements i {

    /* renamed from: o1, reason: collision with root package name */
    public e[] f2618o1 = new e[4];

    /* renamed from: p1, reason: collision with root package name */
    public int f2619p1 = 0;

    public void O1(ArrayList<p> arrayList, int i5, p pVar) {
        for (int i6 = 0; i6 < this.f2619p1; i6++) {
            pVar.a(this.f2618o1[i6]);
        }
        for (int i7 = 0; i7 < this.f2619p1; i7++) {
            androidx.constraintlayout.solver.widgets.analyzer.j.a(this.f2618o1[i7], i5, arrayList, pVar);
        }
    }

    public int P1(int i5) {
        int i6;
        int i7;
        for (int i8 = 0; i8 < this.f2619p1; i8++) {
            e eVar = this.f2618o1[i8];
            if (i5 == 0 && (i7 = eVar.K0) != -1) {
                return i7;
            }
            if (i5 == 1 && (i6 = eVar.L0) != -1) {
                return i6;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.solver.widgets.i
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i5 = this.f2619p1 + 1;
        e[] eVarArr = this.f2618o1;
        if (i5 > eVarArr.length) {
            this.f2618o1 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f2618o1;
        int i6 = this.f2619p1;
        eVarArr2[i6] = eVar;
        this.f2619p1 = i6 + 1;
    }

    @Override // androidx.constraintlayout.solver.widgets.i
    public void b() {
        this.f2619p1 = 0;
        Arrays.fill(this.f2618o1, (Object) null);
    }

    @Override // androidx.constraintlayout.solver.widgets.i
    public void c(f fVar) {
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        j jVar = (j) eVar;
        this.f2619p1 = 0;
        int i5 = jVar.f2619p1;
        for (int i6 = 0; i6 < i5; i6++) {
            a(hashMap.get(jVar.f2618o1[i6]));
        }
    }
}
