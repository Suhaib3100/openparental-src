package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.e;
import java.util.HashMap;

/* compiled from: Barrier.java */
/* loaded from: classes3.dex */
public class a extends j {

    /* renamed from: u1, reason: collision with root package name */
    public static final int f2353u1 = 0;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f2354v1 = 1;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f2355w1 = 2;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f2356x1 = 3;

    /* renamed from: y1, reason: collision with root package name */
    private static final boolean f2357y1 = true;

    /* renamed from: z1, reason: collision with root package name */
    private static final boolean f2358z1 = false;

    /* renamed from: q1, reason: collision with root package name */
    private int f2359q1 = 0;

    /* renamed from: r1, reason: collision with root package name */
    private boolean f2360r1 = f2357y1;

    /* renamed from: s1, reason: collision with root package name */
    private int f2361s1 = 0;

    /* renamed from: t1, reason: collision with root package name */
    boolean f2362t1 = false;

    public a() {
    }

    public boolean Q1() {
        int i5;
        int i6;
        int i7;
        boolean z5 = true;
        int i8 = 0;
        while (true) {
            i5 = this.f2619p1;
            if (i8 >= i5) {
                break;
            }
            e eVar = this.f2618o1[i8];
            if ((this.f2360r1 || eVar.h()) && ((((i6 = this.f2359q1) == 0 || i6 == 1) && !eVar.x0()) || (((i7 = this.f2359q1) == 2 || i7 == 3) && !eVar.y0()))) {
                z5 = false;
            }
            i8++;
        }
        if (!z5 || i5 <= 0) {
            return false;
        }
        int i9 = 0;
        boolean z6 = false;
        for (int i10 = 0; i10 < this.f2619p1; i10++) {
            e eVar2 = this.f2618o1[i10];
            if (this.f2360r1 || eVar2.h()) {
                if (!z6) {
                    int i11 = this.f2359q1;
                    if (i11 == 0) {
                        i9 = eVar2.r(d.b.LEFT).f();
                    } else if (i11 == 1) {
                        i9 = eVar2.r(d.b.RIGHT).f();
                    } else if (i11 == 2) {
                        i9 = eVar2.r(d.b.TOP).f();
                    } else if (i11 == 3) {
                        i9 = eVar2.r(d.b.BOTTOM).f();
                    }
                    z6 = true;
                }
                int i12 = this.f2359q1;
                if (i12 == 0) {
                    i9 = Math.min(i9, eVar2.r(d.b.LEFT).f());
                } else if (i12 == 1) {
                    i9 = Math.max(i9, eVar2.r(d.b.RIGHT).f());
                } else if (i12 == 2) {
                    i9 = Math.min(i9, eVar2.r(d.b.TOP).f());
                } else if (i12 == 3) {
                    i9 = Math.max(i9, eVar2.r(d.b.BOTTOM).f());
                }
            }
        }
        int i13 = i9 + this.f2361s1;
        int i14 = this.f2359q1;
        if (i14 == 0 || i14 == 1) {
            V0(i13, i13);
        } else {
            Y0(i13, i13);
        }
        this.f2362t1 = f2357y1;
        return f2357y1;
    }

    public boolean R1() {
        return this.f2360r1;
    }

    public int S1() {
        return this.f2359q1;
    }

    public int T1() {
        return this.f2361s1;
    }

    public int U1() {
        int i5 = this.f2359q1;
        if (i5 == 0 || i5 == 1) {
            return 0;
        }
        return (i5 == 2 || i5 == 3) ? 1 : -1;
    }

    protected void V1() {
        for (int i5 = 0; i5 < this.f2619p1; i5++) {
            e eVar = this.f2618o1[i5];
            int i6 = this.f2359q1;
            if (i6 == 0 || i6 == 1) {
                eVar.l1(0, f2357y1);
            } else if (i6 == 2 || i6 == 3) {
                eVar.l1(1, f2357y1);
            }
        }
    }

    public void W1(boolean z5) {
        this.f2360r1 = z5;
    }

    public void X1(int i5) {
        this.f2359q1 = i5;
    }

    public void Y1(int i5) {
        this.f2361s1 = i5;
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void g(androidx.constraintlayout.solver.g gVar, boolean z5) {
        d[] dVarArr;
        boolean z6;
        int i5;
        int i6;
        int i7;
        d[] dVarArr2 = this.R;
        dVarArr2[0] = this.J;
        dVarArr2[2] = this.K;
        dVarArr2[1] = this.L;
        dVarArr2[3] = this.M;
        int i8 = 0;
        while (true) {
            dVarArr = this.R;
            if (i8 >= dVarArr.length) {
                break;
            }
            d dVar = dVarArr[i8];
            dVar.f2494i = gVar.u(dVar);
            i8++;
        }
        int i9 = this.f2359q1;
        if (i9 < 0 || i9 >= 4) {
            return;
        }
        d dVar2 = dVarArr[i9];
        if (!this.f2362t1) {
            Q1();
        }
        if (this.f2362t1) {
            this.f2362t1 = false;
            int i10 = this.f2359q1;
            if (i10 == 0 || i10 == 1) {
                gVar.f(this.J.f2494i, this.f2511a0);
                gVar.f(this.L.f2494i, this.f2511a0);
                return;
            } else {
                if (i10 == 2 || i10 == 3) {
                    gVar.f(this.K.f2494i, this.f2513b0);
                    gVar.f(this.M.f2494i, this.f2513b0);
                    return;
                }
                return;
            }
        }
        for (int i11 = 0; i11 < this.f2619p1; i11++) {
            e eVar = this.f2618o1[i11];
            if ((this.f2360r1 || eVar.h()) && ((((i6 = this.f2359q1) == 0 || i6 == 1) && eVar.H() == e.b.MATCH_CONSTRAINT && eVar.J.f2491f != null && eVar.L.f2491f != null) || (((i7 = this.f2359q1) == 2 || i7 == 3) && eVar.g0() == e.b.MATCH_CONSTRAINT && eVar.K.f2491f != null && eVar.M.f2491f != null))) {
                z6 = true;
                break;
            }
        }
        z6 = false;
        boolean z7 = this.J.m() || this.L.m();
        boolean z8 = this.K.m() || this.M.m();
        int i12 = !(!z6 && (((i5 = this.f2359q1) == 0 && z7) || ((i5 == 2 && z8) || ((i5 == 1 && z7) || (i5 == 3 && z8))))) ? 4 : 5;
        for (int i13 = 0; i13 < this.f2619p1; i13++) {
            e eVar2 = this.f2618o1[i13];
            if (this.f2360r1 || eVar2.h()) {
                androidx.constraintlayout.solver.k u5 = gVar.u(eVar2.R[this.f2359q1]);
                d[] dVarArr3 = eVar2.R;
                int i14 = this.f2359q1;
                d dVar3 = dVarArr3[i14];
                dVar3.f2494i = u5;
                d dVar4 = dVar3.f2491f;
                int i15 = (dVar4 == null || dVar4.f2489d != this) ? 0 : dVar3.f2492g + 0;
                if (i14 == 0 || i14 == 2) {
                    gVar.j(dVar2.f2494i, u5, this.f2361s1 - i15, z6);
                } else {
                    gVar.h(dVar2.f2494i, u5, this.f2361s1 + i15, z6);
                }
                gVar.e(dVar2.f2494i, u5, this.f2361s1 + i15, i12);
            }
        }
        int i16 = this.f2359q1;
        if (i16 == 0) {
            gVar.e(this.L.f2494i, this.J.f2494i, 0, 8);
            gVar.e(this.J.f2494i, this.V.L.f2494i, 0, 4);
            gVar.e(this.J.f2494i, this.V.J.f2494i, 0, 0);
            return;
        }
        if (i16 == 1) {
            gVar.e(this.J.f2494i, this.L.f2494i, 0, 8);
            gVar.e(this.J.f2494i, this.V.J.f2494i, 0, 4);
            gVar.e(this.J.f2494i, this.V.L.f2494i, 0, 0);
        } else if (i16 == 2) {
            gVar.e(this.M.f2494i, this.K.f2494i, 0, 8);
            gVar.e(this.K.f2494i, this.V.M.f2494i, 0, 4);
            gVar.e(this.K.f2494i, this.V.K.f2494i, 0, 0);
        } else if (i16 == 3) {
            gVar.e(this.K.f2494i, this.M.f2494i, 0, 8);
            gVar.e(this.K.f2494i, this.V.K.f2494i, 0, 4);
            gVar.e(this.K.f2494i, this.V.M.f2494i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public boolean h() {
        return f2357y1;
    }

    @Override // androidx.constraintlayout.solver.widgets.j, androidx.constraintlayout.solver.widgets.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        a aVar = (a) eVar;
        this.f2359q1 = aVar.f2359q1;
        this.f2360r1 = aVar.f2360r1;
        this.f2361s1 = aVar.f2361s1;
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public String toString() {
        String str = "[Barrier] " + y() + " {";
        for (int i5 = 0; i5 < this.f2619p1; i5++) {
            e eVar = this.f2618o1[i5];
            if (i5 > 0) {
                str = androidx.concurrent.futures.b.a(str, ", ");
            }
            StringBuilder a6 = r.a(str);
            a6.append(eVar.y());
            str = a6.toString();
        }
        return androidx.concurrent.futures.b.a(str, "}");
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public boolean x0() {
        return this.f2362t1;
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public boolean y0() {
        return this.f2362t1;
    }

    public a(String str) {
        O0(str);
    }
}
