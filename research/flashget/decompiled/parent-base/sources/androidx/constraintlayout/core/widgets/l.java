package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.d;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class l extends n {
    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.f fVar, boolean z4) {
        super.g(fVar, z4);
        if (this.B1 > 0) {
            e eVar = this.A1[0];
            eVar.S0();
            d.b bVar = d.b.LEFT;
            eVar.j(bVar, this, bVar);
            d.b bVar2 = d.b.RIGHT;
            eVar.j(bVar2, this, bVar2);
            d.b bVar3 = d.b.TOP;
            eVar.j(bVar3, this, bVar3);
            d.b bVar4 = d.b.BOTTOM;
            eVar.j(bVar4, this, bVar4);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.n
    public void v2(int i4, int i5, int i6, int i7) {
        int s22 = s2() + t2();
        int u22 = u2() + r2();
        if (this.B1 > 0) {
            s22 += this.A1[0].m0();
            u22 += this.A1[0].D();
        }
        int max = Math.max(Q(), s22);
        int max2 = Math.max(P(), u22);
        if (i4 != 1073741824) {
            i5 = i4 == Integer.MIN_VALUE ? Math.min(max, i5) : i4 == 0 ? max : 0;
        }
        if (i6 != 1073741824) {
            i7 = i6 == Integer.MIN_VALUE ? Math.min(max2, i7) : i6 == 0 ? max2 : 0;
        }
        A2(i5, i7);
        c2(i5);
        y1(i7);
        z2(this.B1 > 0);
    }
}
