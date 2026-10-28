package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.e;
import java.util.HashSet;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class n extends j {
    private int C1 = 0;
    private int D1 = 0;
    private int E1 = 0;
    private int F1 = 0;
    private int G1 = 0;
    private int H1 = 0;
    private int I1 = 0;
    private int J1 = 0;
    private boolean K1 = false;
    private int L1 = 0;
    private int M1 = 0;
    protected b.a N1 = new b.a();
    b.InterfaceC0389b O1 = null;

    public void A2(int i4, int i5) {
        this.L1 = i4;
        this.M1 = i5;
    }

    public void B2(int i4) {
        this.E1 = i4;
        this.C1 = i4;
        this.F1 = i4;
        this.D1 = i4;
        this.G1 = i4;
        this.H1 = i4;
    }

    public void C2(int i4) {
        this.D1 = i4;
    }

    public void D2(int i4) {
        this.H1 = i4;
    }

    public void E2(int i4) {
        this.E1 = i4;
        this.I1 = i4;
    }

    public void F2(int i4) {
        this.F1 = i4;
        this.J1 = i4;
    }

    public void G2(int i4) {
        this.G1 = i4;
        this.I1 = i4;
        this.J1 = i4;
    }

    public void H2(int i4) {
        this.C1 = i4;
    }

    @Override // androidx.constraintlayout.core.widgets.j, androidx.constraintlayout.core.widgets.i
    public void c(f fVar) {
        n2();
    }

    public void m2(boolean z4) {
        int i4 = this.G1;
        if (i4 > 0 || this.H1 > 0) {
            if (z4) {
                this.I1 = this.H1;
                this.J1 = i4;
            } else {
                this.I1 = i4;
                this.J1 = this.H1;
            }
        }
    }

    public void n2() {
        for (int i4 = 0; i4 < this.B1; i4++) {
            e eVar = this.A1[i4];
            if (eVar != null) {
                eVar.I1(true);
            }
        }
    }

    public boolean o2(HashSet<e> hashSet) {
        for (int i4 = 0; i4 < this.B1; i4++) {
            if (hashSet.contains(this.A1[i4])) {
                return true;
            }
        }
        return false;
    }

    public int p2() {
        return this.M1;
    }

    public int q2() {
        return this.L1;
    }

    public int r2() {
        return this.D1;
    }

    public int s2() {
        return this.I1;
    }

    public int t2() {
        return this.J1;
    }

    public int u2() {
        return this.C1;
    }

    public void v2(int i4, int i5, int i6, int i7) {
    }

    protected void w2(e eVar, e.b bVar, int i4, e.b bVar2, int i5) {
        while (this.O1 == null && U() != null) {
            this.O1 = ((f) U()).G2();
        }
        b.a aVar = this.N1;
        aVar.f22785a = bVar;
        aVar.f22786b = bVar2;
        aVar.f22787c = i4;
        aVar.f22788d = i5;
        this.O1.b(eVar, aVar);
        eVar.c2(this.N1.f22789e);
        eVar.y1(this.N1.f22790f);
        eVar.x1(this.N1.f22792h);
        eVar.g1(this.N1.f22791g);
    }

    protected boolean x2() {
        e eVar = this.f22938c0;
        b.InterfaceC0389b G2 = eVar != null ? ((f) eVar).G2() : null;
        if (G2 == null) {
            return false;
        }
        for (int i4 = 0; i4 < this.B1; i4++) {
            e eVar2 = this.A1[i4];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b z4 = eVar2.z(0);
                e.b z5 = eVar2.z(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (z4 != bVar || eVar2.f22977w == 1 || z5 != bVar || eVar2.f22979x == 1) {
                    if (z4 == bVar) {
                        z4 = e.b.WRAP_CONTENT;
                    }
                    if (z5 == bVar) {
                        z5 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.N1;
                    aVar.f22785a = z4;
                    aVar.f22786b = z5;
                    aVar.f22787c = eVar2.m0();
                    this.N1.f22788d = eVar2.D();
                    G2.b(eVar2, this.N1);
                    eVar2.c2(this.N1.f22789e);
                    eVar2.y1(this.N1.f22790f);
                    eVar2.g1(this.N1.f22791g);
                }
            }
        }
        return true;
    }

    public boolean y2() {
        return this.K1;
    }

    protected void z2(boolean z4) {
        this.K1 = z4;
    }
}
