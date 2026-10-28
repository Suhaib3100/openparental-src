package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class j extends e implements i {
    public e[] A1 = new e[4];
    public int B1 = 0;

    @Override // androidx.constraintlayout.core.widgets.i
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i4 = this.B1 + 1;
        e[] eVarArr = this.A1;
        if (i4 > eVarArr.length) {
            this.A1 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.A1;
        int i5 = this.B1;
        eVarArr2[i5] = eVar;
        this.B1 = i5 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.i
    public void b() {
        this.B1 = 0;
        Arrays.fill(this.A1, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.i
    public void c(f fVar) {
    }

    public void k2(ArrayList<androidx.constraintlayout.core.widgets.analyzer.o> arrayList, int i4, androidx.constraintlayout.core.widgets.analyzer.o oVar) {
        for (int i5 = 0; i5 < this.B1; i5++) {
            oVar.a(this.A1[i5]);
        }
        for (int i6 = 0; i6 < this.B1; i6++) {
            androidx.constraintlayout.core.widgets.analyzer.i.a(this.A1[i6], i4, arrayList, oVar);
        }
    }

    public int l2(int i4) {
        int i5;
        int i6;
        for (int i7 = 0; i7 < this.B1; i7++) {
            e eVar = this.A1[i7];
            if (i4 == 0 && (i6 = eVar.S0) != -1) {
                return i6;
            }
            if (i4 == 1 && (i5 = eVar.T0) != -1) {
                return i5;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        j jVar = (j) eVar;
        this.B1 = 0;
        int i4 = jVar.B1;
        for (int i5 = 0; i5 < i4; i5++) {
            a(hashMap.get(jVar.A1[i5]));
        }
    }
}
