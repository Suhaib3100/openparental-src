package androidx.constraintlayout.core.widgets;

import androidx.compose.material3.j4;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import java.util.HashMap;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public class a extends j {
    public static final int G1 = 0;
    public static final int H1 = 1;
    public static final int I1 = 2;
    public static final int J1 = 3;
    private static final boolean K1 = true;
    private static final boolean L1 = false;
    private int C1 = 0;
    private boolean D1 = true;
    private int E1 = 0;
    boolean F1 = false;

    public a() {
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean G0() {
        return this.F1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean H0() {
        return this.F1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.f fVar, boolean z4) {
        d[] dVarArr;
        boolean z5;
        int i4;
        int i5;
        int i6;
        d[] dVarArr2 = this.Y;
        dVarArr2[0] = this.Q;
        dVarArr2[2] = this.R;
        dVarArr2[1] = this.S;
        dVarArr2[3] = this.T;
        int i7 = 0;
        while (true) {
            dVarArr = this.Y;
            if (i7 >= dVarArr.length) {
                break;
            }
            d dVar = dVarArr[i7];
            dVar.f22905i = fVar.u(dVar);
            i7++;
        }
        int i10 = this.C1;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        d dVar2 = dVarArr[i10];
        if (!this.F1) {
            m2();
        }
        if (this.F1) {
            this.F1 = false;
            int i11 = this.C1;
            if (i11 == 0 || i11 == 1) {
                fVar.f(this.Q.f22905i, this.f22948h0);
                fVar.f(this.S.f22905i, this.f22948h0);
                return;
            } else {
                if (i11 == 2 || i11 == 3) {
                    fVar.f(this.R.f22905i, this.f22950i0);
                    fVar.f(this.T.f22905i, this.f22950i0);
                    return;
                }
                return;
            }
        }
        for (int i12 = 0; i12 < this.B1; i12++) {
            e eVar = this.A1[i12];
            if ((this.D1 || eVar.h()) && ((((i5 = this.C1) == 0 || i5 == 1) && eVar.H() == e.b.MATCH_CONSTRAINT && eVar.Q.f22902f != null && eVar.S.f22902f != null) || (((i6 = this.C1) == 2 || i6 == 3) && eVar.j0() == e.b.MATCH_CONSTRAINT && eVar.R.f22902f != null && eVar.T.f22902f != null))) {
                z5 = true;
                break;
            }
        }
        z5 = false;
        boolean z6 = this.Q.m() || this.S.m();
        boolean z7 = this.R.m() || this.T.m();
        int i13 = !(!z5 && (((i4 = this.C1) == 0 && z6) || ((i4 == 2 && z7) || ((i4 == 1 && z6) || (i4 == 3 && z7))))) ? 4 : 5;
        for (int i14 = 0; i14 < this.B1; i14++) {
            e eVar2 = this.A1[i14];
            if (this.D1 || eVar2.h()) {
                androidx.constraintlayout.core.j u4 = fVar.u(eVar2.Y[this.C1]);
                d[] dVarArr3 = eVar2.Y;
                int i15 = this.C1;
                d dVar3 = dVarArr3[i15];
                dVar3.f22905i = u4;
                d dVar4 = dVar3.f22902f;
                int i16 = (dVar4 == null || dVar4.f22900d != this) ? 0 : dVar3.f22903g;
                if (i15 == 0 || i15 == 2) {
                    fVar.j(dVar2.f22905i, u4, this.E1 - i16, z5);
                } else {
                    fVar.h(dVar2.f22905i, u4, this.E1 + i16, z5);
                }
                fVar.e(dVar2.f22905i, u4, this.E1 + i16, i13);
            }
        }
        int i17 = this.C1;
        if (i17 == 0) {
            fVar.e(this.S.f22905i, this.Q.f22905i, 0, 8);
            fVar.e(this.Q.f22905i, this.f22938c0.S.f22905i, 0, 4);
            fVar.e(this.Q.f22905i, this.f22938c0.Q.f22905i, 0, 0);
            return;
        }
        if (i17 == 1) {
            fVar.e(this.Q.f22905i, this.S.f22905i, 0, 8);
            fVar.e(this.Q.f22905i, this.f22938c0.Q.f22905i, 0, 4);
            fVar.e(this.Q.f22905i, this.f22938c0.S.f22905i, 0, 0);
        } else if (i17 == 2) {
            fVar.e(this.T.f22905i, this.R.f22905i, 0, 8);
            fVar.e(this.R.f22905i, this.f22938c0.T.f22905i, 0, 4);
            fVar.e(this.R.f22905i, this.f22938c0.R.f22905i, 0, 0);
        } else if (i17 == 3) {
            fVar.e(this.R.f22905i, this.T.f22905i, 0, 8);
            fVar.e(this.R.f22905i, this.f22938c0.R.f22905i, 0, 4);
            fVar.e(this.R.f22905i, this.f22938c0.T.f22905i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean h() {
        return true;
    }

    public boolean m2() {
        int i4;
        int i5;
        int i6;
        boolean z4 = true;
        int i7 = 0;
        while (true) {
            i4 = this.B1;
            if (i7 >= i4) {
                break;
            }
            e eVar = this.A1[i7];
            if ((this.D1 || eVar.h()) && ((((i5 = this.C1) == 0 || i5 == 1) && !eVar.G0()) || (((i6 = this.C1) == 2 || i6 == 3) && !eVar.H0()))) {
                z4 = false;
            }
            i7++;
        }
        if (!z4 || i4 <= 0) {
            return false;
        }
        int i10 = 0;
        boolean z5 = false;
        for (int i11 = 0; i11 < this.B1; i11++) {
            e eVar2 = this.A1[i11];
            if (this.D1 || eVar2.h()) {
                if (!z5) {
                    int i12 = this.C1;
                    if (i12 == 0) {
                        i10 = eVar2.r(d.b.LEFT).f();
                    } else if (i12 == 1) {
                        i10 = eVar2.r(d.b.RIGHT).f();
                    } else if (i12 == 2) {
                        i10 = eVar2.r(d.b.TOP).f();
                    } else if (i12 == 3) {
                        i10 = eVar2.r(d.b.BOTTOM).f();
                    }
                    z5 = true;
                }
                int i13 = this.C1;
                if (i13 == 0) {
                    i10 = Math.min(i10, eVar2.r(d.b.LEFT).f());
                } else if (i13 == 1) {
                    i10 = Math.max(i10, eVar2.r(d.b.RIGHT).f());
                } else if (i13 == 2) {
                    i10 = Math.min(i10, eVar2.r(d.b.TOP).f());
                } else if (i13 == 3) {
                    i10 = Math.max(i10, eVar2.r(d.b.BOTTOM).f());
                }
            }
        }
        int i14 = i10 + this.E1;
        int i15 = this.C1;
        if (i15 == 0 || i15 == 1) {
            q1(i14, i14);
        } else {
            t1(i14, i14);
        }
        this.F1 = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.j, androidx.constraintlayout.core.widgets.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        a aVar = (a) eVar;
        this.C1 = aVar.C1;
        this.D1 = aVar.D1;
        this.E1 = aVar.E1;
    }

    @Deprecated
    public boolean n2() {
        return this.D1;
    }

    public boolean o2() {
        return this.D1;
    }

    public int p2() {
        return this.C1;
    }

    public int q2() {
        return this.E1;
    }

    public int r2() {
        int i4 = this.C1;
        if (i4 == 0 || i4 == 1) {
            return 0;
        }
        return (i4 == 2 || i4 == 3) ? 1 : -1;
    }

    protected void s2() {
        for (int i4 = 0; i4 < this.B1; i4++) {
            e eVar = this.A1[i4];
            if (this.D1 || eVar.h()) {
                int i5 = this.C1;
                if (i5 == 0 || i5 == 1) {
                    eVar.G1(0, true);
                } else if (i5 == 2 || i5 == 3) {
                    eVar.G1(1, true);
                }
            }
        }
    }

    public void t2(boolean z4) {
        this.D1 = z4;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public String toString() {
        String str = "[Barrier] " + y() + " {";
        for (int i4 = 0; i4 < this.B1; i4++) {
            e eVar = this.A1[i4];
            if (i4 > 0) {
                str = androidx.compose.runtime.changelist.j.a(str, ", ");
            }
            StringBuilder a5 = j4.a(str);
            a5.append(eVar.y());
            str = a5.toString();
        }
        return androidx.compose.runtime.changelist.j.a(str, "}");
    }

    public void u2(int i4) {
        this.C1 = i4;
    }

    public void v2(int i4) {
        this.E1 = i4;
    }

    public a(String str) {
        j1(str);
    }
}
