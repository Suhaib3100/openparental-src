package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.e;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Flow.java */
/* loaded from: classes3.dex */
public class g extends m {

    /* renamed from: c2, reason: collision with root package name */
    public static final int f2575c2 = 0;

    /* renamed from: d2, reason: collision with root package name */
    public static final int f2576d2 = 1;

    /* renamed from: e2, reason: collision with root package name */
    public static final int f2577e2 = 2;

    /* renamed from: f2, reason: collision with root package name */
    public static final int f2578f2 = 0;

    /* renamed from: g2, reason: collision with root package name */
    public static final int f2579g2 = 1;

    /* renamed from: h2, reason: collision with root package name */
    public static final int f2580h2 = 2;

    /* renamed from: i2, reason: collision with root package name */
    public static final int f2581i2 = 3;

    /* renamed from: j2, reason: collision with root package name */
    public static final int f2582j2 = 0;

    /* renamed from: k2, reason: collision with root package name */
    public static final int f2583k2 = 1;

    /* renamed from: l2, reason: collision with root package name */
    public static final int f2584l2 = 2;

    /* renamed from: a2, reason: collision with root package name */
    private e[] f2585a2;
    private int D1 = -1;
    private int E1 = -1;
    private int F1 = -1;
    private int G1 = -1;
    private int H1 = -1;
    private int I1 = -1;
    private float J1 = 0.5f;
    private float K1 = 0.5f;
    private float L1 = 0.5f;
    private float M1 = 0.5f;
    private float N1 = 0.5f;
    private float O1 = 0.5f;
    private int P1 = 0;
    private int Q1 = 0;
    private int R1 = 2;
    private int S1 = 2;
    private int T1 = 0;
    private int U1 = -1;
    private int V1 = 0;
    private ArrayList<a> W1 = new ArrayList<>();
    private e[] X1 = null;
    private e[] Y1 = null;
    private int[] Z1 = null;

    /* renamed from: b2, reason: collision with root package name */
    private int f2586b2 = 0;

    /* compiled from: Flow.java */
    /* loaded from: classes.dex */
    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f2587a;

        /* renamed from: d, reason: collision with root package name */
        private d f2590d;

        /* renamed from: e, reason: collision with root package name */
        private d f2591e;

        /* renamed from: f, reason: collision with root package name */
        private d f2592f;

        /* renamed from: g, reason: collision with root package name */
        private d f2593g;

        /* renamed from: h, reason: collision with root package name */
        private int f2594h;

        /* renamed from: i, reason: collision with root package name */
        private int f2595i;

        /* renamed from: j, reason: collision with root package name */
        private int f2596j;

        /* renamed from: k, reason: collision with root package name */
        private int f2597k;

        /* renamed from: q, reason: collision with root package name */
        private int f2603q;

        /* renamed from: b, reason: collision with root package name */
        private e f2588b = null;

        /* renamed from: c, reason: collision with root package name */
        int f2589c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f2598l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f2599m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f2600n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f2601o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f2602p = 0;

        public a(int i5, d dVar, d dVar2, d dVar3, d dVar4, int i6) {
            this.f2594h = 0;
            this.f2595i = 0;
            this.f2596j = 0;
            this.f2597k = 0;
            this.f2603q = 0;
            this.f2587a = i5;
            this.f2590d = dVar;
            this.f2591e = dVar2;
            this.f2592f = dVar3;
            this.f2593g = dVar4;
            this.f2594h = g.this.V1();
            this.f2595i = g.this.X1();
            this.f2596j = g.this.W1();
            this.f2597k = g.this.U1();
            this.f2603q = i6;
        }

        private void h() {
            this.f2598l = 0;
            this.f2599m = 0;
            this.f2588b = null;
            this.f2589c = 0;
            int i5 = this.f2601o;
            for (int i6 = 0; i6 < i5 && this.f2600n + i6 < g.this.f2586b2; i6++) {
                e eVar = g.this.f2585a2[this.f2600n + i6];
                if (this.f2587a == 0) {
                    int j02 = eVar.j0();
                    int i7 = g.this.P1;
                    if (eVar.i0() == 8) {
                        i7 = 0;
                    }
                    this.f2598l = j02 + i7 + this.f2598l;
                    int G2 = g.this.G2(eVar, this.f2603q);
                    if (this.f2588b == null || this.f2589c < G2) {
                        this.f2588b = eVar;
                        this.f2589c = G2;
                        this.f2599m = G2;
                    }
                } else {
                    int H2 = g.this.H2(eVar, this.f2603q);
                    int G22 = g.this.G2(eVar, this.f2603q);
                    int i8 = g.this.Q1;
                    if (eVar.i0() == 8) {
                        i8 = 0;
                    }
                    this.f2599m = G22 + i8 + this.f2599m;
                    if (this.f2588b == null || this.f2589c < H2) {
                        this.f2588b = eVar;
                        this.f2589c = H2;
                        this.f2598l = H2;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f2587a == 0) {
                int H2 = g.this.H2(eVar, this.f2603q);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    this.f2602p++;
                    H2 = 0;
                }
                this.f2598l = H2 + (eVar.i0() != 8 ? g.this.P1 : 0) + this.f2598l;
                int G2 = g.this.G2(eVar, this.f2603q);
                if (this.f2588b == null || this.f2589c < G2) {
                    this.f2588b = eVar;
                    this.f2589c = G2;
                    this.f2599m = G2;
                }
            } else {
                int H22 = g.this.H2(eVar, this.f2603q);
                int G22 = g.this.G2(eVar, this.f2603q);
                if (eVar.g0() == e.b.MATCH_CONSTRAINT) {
                    this.f2602p++;
                    G22 = 0;
                }
                this.f2599m = G22 + (eVar.i0() != 8 ? g.this.Q1 : 0) + this.f2599m;
                if (this.f2588b == null || this.f2589c < H22) {
                    this.f2588b = eVar;
                    this.f2589c = H22;
                    this.f2598l = H22;
                }
            }
            this.f2601o++;
        }

        public void c() {
            this.f2589c = 0;
            this.f2588b = null;
            this.f2598l = 0;
            this.f2599m = 0;
            this.f2600n = 0;
            this.f2601o = 0;
            this.f2602p = 0;
        }

        public void d(boolean z5, int i5, boolean z6) {
            e eVar;
            char c6;
            int i6 = this.f2601o;
            for (int i7 = 0; i7 < i6 && this.f2600n + i7 < g.this.f2586b2; i7++) {
                e eVar2 = g.this.f2585a2[this.f2600n + i7];
                if (eVar2 != null) {
                    eVar2.I0();
                }
            }
            if (i6 == 0 || this.f2588b == null) {
                return;
            }
            boolean z7 = z6 && i5 == 0;
            int i8 = -1;
            int i9 = -1;
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = z5 ? (i6 - 1) - i10 : i10;
                if (this.f2600n + i11 >= g.this.f2586b2) {
                    break;
                }
                if (g.this.f2585a2[this.f2600n + i11].i0() == 0) {
                    if (i8 == -1) {
                        i8 = i10;
                    }
                    i9 = i10;
                }
            }
            e eVar3 = null;
            if (this.f2587a != 0) {
                e eVar4 = this.f2588b;
                eVar4.g1(g.this.D1);
                int i12 = this.f2594h;
                if (i5 > 0) {
                    i12 += g.this.P1;
                }
                if (z5) {
                    eVar4.L.a(this.f2592f, i12);
                    if (z6) {
                        eVar4.J.a(this.f2590d, this.f2596j);
                    }
                    if (i5 > 0) {
                        this.f2592f.f2489d.J.a(eVar4.L, 0);
                    }
                } else {
                    eVar4.J.a(this.f2590d, i12);
                    if (z6) {
                        eVar4.L.a(this.f2592f, this.f2596j);
                    }
                    if (i5 > 0) {
                        this.f2590d.f2489d.L.a(eVar4.J, 0);
                    }
                }
                int i13 = 0;
                while (i13 < i6 && this.f2600n + i13 < g.this.f2586b2) {
                    e eVar5 = g.this.f2585a2[this.f2600n + i13];
                    if (i13 == 0) {
                        eVar5.l(eVar5.K, this.f2591e, this.f2595i);
                        int i14 = g.this.E1;
                        float f6 = g.this.K1;
                        if (this.f2600n == 0 && g.this.G1 != -1) {
                            i14 = g.this.G1;
                            f6 = g.this.M1;
                        } else if (z6 && g.this.I1 != -1) {
                            i14 = g.this.I1;
                            f6 = g.this.O1;
                        }
                        eVar5.B1(i14);
                        eVar5.A1(f6);
                    }
                    if (i13 == i6 - 1) {
                        eVar5.l(eVar5.M, this.f2593g, this.f2597k);
                    }
                    if (eVar3 != null) {
                        eVar5.K.a(eVar3.M, g.this.Q1);
                        if (i13 == i8) {
                            eVar5.K.B(this.f2595i);
                        }
                        eVar3.M.a(eVar5.K, 0);
                        if (i13 == i9 + 1) {
                            eVar3.M.B(this.f2597k);
                        }
                    }
                    if (eVar5 != eVar4) {
                        if (z5) {
                            int i15 = g.this.R1;
                            if (i15 == 0) {
                                eVar5.L.a(eVar4.L, 0);
                            } else if (i15 == 1) {
                                eVar5.J.a(eVar4.J, 0);
                            } else if (i15 == 2) {
                                eVar5.J.a(eVar4.J, 0);
                                eVar5.L.a(eVar4.L, 0);
                            }
                        } else {
                            int i16 = g.this.R1;
                            if (i16 == 0) {
                                eVar5.J.a(eVar4.J, 0);
                            } else if (i16 == 1) {
                                eVar5.L.a(eVar4.L, 0);
                            } else if (i16 == 2) {
                                if (z7) {
                                    eVar5.J.a(this.f2590d, this.f2594h);
                                    eVar5.L.a(this.f2592f, this.f2596j);
                                } else {
                                    eVar5.J.a(eVar4.J, 0);
                                    eVar5.L.a(eVar4.L, 0);
                                }
                            }
                            i13++;
                            eVar3 = eVar5;
                        }
                    }
                    i13++;
                    eVar3 = eVar5;
                }
                return;
            }
            e eVar6 = this.f2588b;
            eVar6.B1(g.this.E1);
            int i17 = this.f2595i;
            if (i5 > 0) {
                i17 += g.this.Q1;
            }
            eVar6.K.a(this.f2591e, i17);
            if (z6) {
                eVar6.M.a(this.f2593g, this.f2597k);
            }
            if (i5 > 0) {
                this.f2591e.f2489d.M.a(eVar6.K, 0);
            }
            if (g.this.S1 == 3 && !eVar6.m0()) {
                for (int i18 = 0; i18 < i6; i18++) {
                    int i19 = z5 ? (i6 - 1) - i18 : i18;
                    if (this.f2600n + i19 >= g.this.f2586b2) {
                        break;
                    }
                    eVar = g.this.f2585a2[this.f2600n + i19];
                    if (eVar.m0()) {
                        break;
                    }
                }
            }
            eVar = eVar6;
            int i20 = 0;
            while (i20 < i6) {
                int i21 = z5 ? (i6 - 1) - i20 : i20;
                if (this.f2600n + i21 >= g.this.f2586b2) {
                    return;
                }
                e eVar7 = g.this.f2585a2[this.f2600n + i21];
                if (i20 == 0) {
                    eVar7.l(eVar7.J, this.f2590d, this.f2594h);
                }
                if (i21 == 0) {
                    int i22 = g.this.D1;
                    float f7 = g.this.J1;
                    if (this.f2600n == 0 && g.this.F1 != -1) {
                        i22 = g.this.F1;
                        f7 = g.this.L1;
                    } else if (z6 && g.this.H1 != -1) {
                        i22 = g.this.H1;
                        f7 = g.this.N1;
                    }
                    eVar7.g1(i22);
                    eVar7.f1(f7);
                }
                if (i20 == i6 - 1) {
                    eVar7.l(eVar7.L, this.f2592f, this.f2596j);
                }
                if (eVar3 != null) {
                    eVar7.J.a(eVar3.L, g.this.P1);
                    if (i20 == i8) {
                        eVar7.J.B(this.f2594h);
                    }
                    eVar3.L.a(eVar7.J, 0);
                    if (i20 == i9 + 1) {
                        eVar3.L.B(this.f2596j);
                    }
                }
                if (eVar7 != eVar6) {
                    c6 = 3;
                    if (g.this.S1 == 3 && eVar.m0() && eVar7 != eVar && eVar7.m0()) {
                        eVar7.N.a(eVar.N, 0);
                    } else {
                        int i23 = g.this.S1;
                        if (i23 == 0) {
                            eVar7.K.a(eVar6.K, 0);
                        } else if (i23 == 1) {
                            eVar7.M.a(eVar6.M, 0);
                        } else if (z7) {
                            eVar7.K.a(this.f2591e, this.f2595i);
                            eVar7.M.a(this.f2593g, this.f2597k);
                        } else {
                            eVar7.K.a(eVar6.K, 0);
                            eVar7.M.a(eVar6.M, 0);
                        }
                    }
                } else {
                    c6 = 3;
                }
                i20++;
                eVar3 = eVar7;
            }
        }

        public int e() {
            return this.f2587a == 1 ? this.f2599m - g.this.Q1 : this.f2599m;
        }

        public int f() {
            return this.f2587a == 0 ? this.f2598l - g.this.P1 : this.f2598l;
        }

        public void g(int i5) {
            int i6 = this.f2602p;
            if (i6 == 0) {
                return;
            }
            int i7 = this.f2601o;
            int i8 = i5 / i6;
            for (int i9 = 0; i9 < i7 && this.f2600n + i9 < g.this.f2586b2; i9++) {
                e eVar = g.this.f2585a2[this.f2600n + i9];
                if (this.f2587a == 0) {
                    if (eVar != null && eVar.H() == e.b.MATCH_CONSTRAINT && eVar.f2540p == 0) {
                        g.this.Z1(eVar, e.b.FIXED, i8, eVar.g0(), eVar.D());
                    }
                } else if (eVar != null && eVar.g0() == e.b.MATCH_CONSTRAINT && eVar.f2542q == 0) {
                    g.this.Z1(eVar, eVar.H(), eVar.j0(), e.b.FIXED, i8);
                }
            }
            h();
        }

        public void i(int i5) {
            this.f2600n = i5;
        }

        public void j(int i5, d dVar, d dVar2, d dVar3, d dVar4, int i6, int i7, int i8, int i9, int i10) {
            this.f2587a = i5;
            this.f2590d = dVar;
            this.f2591e = dVar2;
            this.f2592f = dVar3;
            this.f2593g = dVar4;
            this.f2594h = i6;
            this.f2595i = i7;
            this.f2596j = i8;
            this.f2597k = i9;
            this.f2603q = i10;
        }
    }

    private void F2(boolean z5) {
        e eVar;
        if (this.Z1 == null || this.Y1 == null || this.X1 == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f2586b2; i5++) {
            this.f2585a2[i5].I0();
        }
        int[] iArr = this.Z1;
        int i6 = iArr[0];
        int i7 = iArr[1];
        e eVar2 = null;
        for (int i8 = 0; i8 < i6; i8++) {
            e eVar3 = this.Y1[z5 ? (i6 - i8) - 1 : i8];
            if (eVar3 != null && eVar3.i0() != 8) {
                if (i8 == 0) {
                    eVar3.l(eVar3.J, this.J, V1());
                    eVar3.g1(this.D1);
                    eVar3.f1(this.J1);
                }
                if (i8 == i6 - 1) {
                    eVar3.l(eVar3.L, this.L, W1());
                }
                if (i8 > 0) {
                    eVar3.l(eVar3.J, eVar2.L, this.P1);
                    eVar2.l(eVar2.L, eVar3.J, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i9 = 0; i9 < i7; i9++) {
            e eVar4 = this.X1[i9];
            if (eVar4 != null && eVar4.i0() != 8) {
                if (i9 == 0) {
                    eVar4.l(eVar4.K, this.K, X1());
                    eVar4.B1(this.E1);
                    eVar4.A1(this.K1);
                }
                if (i9 == i7 - 1) {
                    eVar4.l(eVar4.M, this.M, U1());
                }
                if (i9 > 0) {
                    eVar4.l(eVar4.K, eVar2.M, this.Q1);
                    eVar2.l(eVar2.M, eVar4.K, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i10 = 0; i10 < i6; i10++) {
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = (i11 * i6) + i10;
                if (this.V1 == 1) {
                    i12 = (i10 * i7) + i11;
                }
                e[] eVarArr = this.f2585a2;
                if (i12 < eVarArr.length && (eVar = eVarArr[i12]) != null && eVar.i0() != 8) {
                    e eVar5 = this.Y1[i10];
                    e eVar6 = this.X1[i11];
                    if (eVar != eVar5) {
                        eVar.l(eVar.J, eVar5.J, 0);
                        eVar.l(eVar.L, eVar5.L, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.l(eVar.K, eVar6.K, 0);
                        eVar.l(eVar.M, eVar6.M, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G2(e eVar, int i5) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.g0() == e.b.MATCH_CONSTRAINT) {
            int i6 = eVar.f2542q;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (eVar.f2556x * i5);
                if (i7 != eVar.D()) {
                    eVar.s1(true);
                    Z1(eVar, eVar.H(), eVar.j0(), e.b.FIXED, i7);
                }
                return i7;
            }
            if (i6 == 1) {
                return eVar.D();
            }
            if (i6 == 3) {
                return (int) ((eVar.j0() * eVar.Y) + 0.5f);
            }
        }
        return eVar.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int H2(e eVar, int i5) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.H() == e.b.MATCH_CONSTRAINT) {
            int i6 = eVar.f2540p;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (eVar.f2550u * i5);
                if (i7 != eVar.j0()) {
                    eVar.s1(true);
                    Z1(eVar, e.b.FIXED, i7, eVar.g0(), eVar.D());
                }
                return i7;
            }
            if (i6 == 1) {
                return eVar.j0();
            }
            if (i6 == 3) {
                return (int) ((eVar.D() * eVar.Y) + 0.5f);
            }
        }
        return eVar.j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void I2(androidx.constraintlayout.solver.widgets.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.g.I2(androidx.constraintlayout.solver.widgets.e[], int, int, int, int[]):void");
    }

    private void J2(e[] eVarArr, int i5, int i6, int i7, int[] iArr) {
        int i8;
        int i9;
        int i10;
        d dVar;
        int W1;
        d dVar2;
        int U1;
        int i11;
        if (i5 == 0) {
            return;
        }
        this.W1.clear();
        a aVar = new a(i6, this.J, this.K, this.L, this.M, i7);
        this.W1.add(aVar);
        if (i6 == 0) {
            i8 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < i5) {
                e eVar = eVarArr[i13];
                int H2 = H2(eVar, i7);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i14 = i8;
                boolean z5 = (i12 == i7 || (this.P1 + i12) + H2 > i7) && aVar.f2588b != null;
                if (!z5 && i13 > 0 && (i11 = this.U1) > 0 && i13 % i11 == 0) {
                    z5 = true;
                }
                if (z5) {
                    aVar = new a(i6, this.J, this.K, this.L, this.M, i7);
                    aVar.i(i13);
                    this.W1.add(aVar);
                } else if (i13 > 0) {
                    i12 = this.P1 + H2 + i12;
                    aVar.b(eVar);
                    i13++;
                    i8 = i14;
                }
                i12 = H2;
                aVar.b(eVar);
                i13++;
                i8 = i14;
            }
        } else {
            i8 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < i5) {
                e eVar2 = eVarArr[i16];
                int G2 = G2(eVar2, i7);
                if (eVar2.g0() == e.b.MATCH_CONSTRAINT) {
                    i8++;
                }
                int i17 = i8;
                boolean z6 = (i15 == i7 || (this.Q1 + i15) + G2 > i7) && aVar.f2588b != null;
                if (!z6 && i16 > 0 && (i9 = this.U1) > 0 && i16 % i9 == 0) {
                    z6 = true;
                }
                if (z6) {
                    aVar = new a(i6, this.J, this.K, this.L, this.M, i7);
                    aVar.i(i16);
                    this.W1.add(aVar);
                } else if (i16 > 0) {
                    i15 = this.Q1 + G2 + i15;
                    aVar.b(eVar2);
                    i16++;
                    i8 = i17;
                }
                i15 = G2;
                aVar.b(eVar2);
                i16++;
                i8 = i17;
            }
        }
        int size = this.W1.size();
        d dVar3 = this.J;
        d dVar4 = this.K;
        d dVar5 = this.L;
        d dVar6 = this.M;
        int V1 = V1();
        int X1 = X1();
        int W12 = W1();
        int U12 = U1();
        e.b H = H();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z7 = H == bVar || g0() == bVar;
        if (i8 > 0 && z7) {
            for (int i18 = 0; i18 < size; i18++) {
                a aVar2 = this.W1.get(i18);
                if (i6 == 0) {
                    aVar2.g(i7 - aVar2.f());
                } else {
                    aVar2.g(i7 - aVar2.e());
                }
            }
        }
        int i19 = X1;
        int i20 = W12;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = V1;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i25 = U12;
        while (i23 < size) {
            a aVar3 = this.W1.get(i23);
            if (i6 == 0) {
                if (i23 < size - 1) {
                    dVar2 = this.W1.get(i23 + 1).f2588b.K;
                    U1 = 0;
                } else {
                    dVar2 = this.M;
                    U1 = U1();
                }
                d dVar9 = aVar3.f2588b.M;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i26 = i21;
                d dVar12 = dVar7;
                int i27 = i22;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i10 = i23;
                aVar3.j(i6, dVar10, dVar12, dVar13, dVar2, i24, i19, i20, U1, i7);
                int max = Math.max(i27, aVar3.f());
                i21 = i26 + aVar3.e();
                if (i10 > 0) {
                    i21 += this.Q1;
                }
                dVar8 = dVar11;
                i22 = max;
                i19 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i28 = U1;
                dVar6 = dVar2;
                i25 = i28;
            } else {
                d dVar15 = dVar8;
                int i29 = i21;
                int i30 = i22;
                i10 = i23;
                if (i10 < size - 1) {
                    dVar = this.W1.get(i10 + 1).f2588b.J;
                    W1 = 0;
                } else {
                    dVar = this.L;
                    W1 = W1();
                }
                d dVar16 = aVar3.f2588b.L;
                aVar3.j(i6, dVar15, dVar7, dVar, dVar6, i24, i19, W1, i25, i7);
                i22 = i30 + aVar3.f();
                int max2 = Math.max(i29, aVar3.e());
                if (i10 > 0) {
                    i22 += this.P1;
                }
                i21 = max2;
                i24 = 0;
                i20 = W1;
                dVar8 = dVar16;
            }
            i23 = i10 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i22;
        iArr[1] = i21;
    }

    private void K2(e[] eVarArr, int i5, int i6, int i7, int[] iArr) {
        a aVar;
        if (i5 == 0) {
            return;
        }
        if (this.W1.size() == 0) {
            aVar = new a(i6, this.J, this.K, this.L, this.M, i7);
            this.W1.add(aVar);
        } else {
            a aVar2 = this.W1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i6, this.J, this.K, this.L, this.M, V1(), X1(), W1(), U1(), i7);
        }
        for (int i8 = 0; i8 < i5; i8++) {
            aVar.b(eVarArr[i8]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void L2(float f6) {
        this.L1 = f6;
    }

    public void M2(int i5) {
        this.F1 = i5;
    }

    public void N2(float f6) {
        this.M1 = f6;
    }

    public void O2(int i5) {
        this.G1 = i5;
    }

    public void P2(int i5) {
        this.R1 = i5;
    }

    public void Q2(float f6) {
        this.J1 = f6;
    }

    public void R2(int i5) {
        this.P1 = i5;
    }

    public void S2(int i5) {
        this.D1 = i5;
    }

    public void T2(float f6) {
        this.N1 = f6;
    }

    public void U2(int i5) {
        this.H1 = i5;
    }

    public void V2(float f6) {
        this.O1 = f6;
    }

    public void W2(int i5) {
        this.I1 = i5;
    }

    public void X2(int i5) {
        this.U1 = i5;
    }

    @Override // androidx.constraintlayout.solver.widgets.m
    public void Y1(int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int[] iArr;
        boolean z5;
        if (this.f2619p1 > 0 && !a2()) {
            d2(0, 0);
            c2(false);
            return;
        }
        int V1 = V1();
        int W1 = W1();
        int X1 = X1();
        int U1 = U1();
        int[] iArr2 = new int[2];
        int i11 = (i6 - V1) - W1;
        int i12 = this.V1;
        if (i12 == 1) {
            i11 = (i8 - X1) - U1;
        }
        int i13 = i11;
        if (i12 == 0) {
            if (this.D1 == -1) {
                this.D1 = 0;
            }
            if (this.E1 == -1) {
                this.E1 = 0;
            }
        } else {
            if (this.D1 == -1) {
                this.D1 = 0;
            }
            if (this.E1 == -1) {
                this.E1 = 0;
            }
        }
        e[] eVarArr = this.f2618o1;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i9 = this.f2619p1;
            if (i14 >= i9) {
                break;
            }
            if (this.f2618o1[i14].i0() == 8) {
                i15++;
            }
            i14++;
        }
        if (i15 > 0) {
            eVarArr = new e[i9 - i15];
            int i16 = 0;
            for (int i17 = 0; i17 < this.f2619p1; i17++) {
                e eVar = this.f2618o1[i17];
                if (eVar.i0() != 8) {
                    eVarArr[i16] = eVar;
                    i16++;
                }
            }
            i10 = i16;
        } else {
            i10 = i9;
        }
        this.f2585a2 = eVarArr;
        this.f2586b2 = i10;
        int i18 = this.T1;
        if (i18 == 0) {
            iArr = iArr2;
            z5 = true;
            K2(eVarArr, i10, this.V1, i13, iArr2);
        } else if (i18 == 1) {
            z5 = true;
            iArr = iArr2;
            J2(eVarArr, i10, this.V1, i13, iArr2);
        } else if (i18 != 2) {
            z5 = true;
            iArr = iArr2;
        } else {
            z5 = true;
            iArr = iArr2;
            I2(eVarArr, i10, this.V1, i13, iArr2);
        }
        int i19 = iArr[0] + V1 + W1;
        int i20 = iArr[z5 ? 1 : 0] + X1 + U1;
        if (i5 == 1073741824) {
            i19 = i6;
        } else if (i5 == Integer.MIN_VALUE) {
            i19 = Math.min(i19, i6);
        } else if (i5 != 0) {
            i19 = 0;
        }
        if (i7 == 1073741824) {
            i20 = i8;
        } else if (i7 == Integer.MIN_VALUE) {
            i20 = Math.min(i20, i8);
        } else if (i7 != 0) {
            i20 = 0;
        }
        d2(i19, i20);
        H1(i19);
        d1(i20);
        if (this.f2619p1 <= 0) {
            z5 = false;
        }
        c2(z5);
    }

    public void Y2(int i5) {
        this.V1 = i5;
    }

    public void Z2(int i5) {
        this.S1 = i5;
    }

    public void a3(float f6) {
        this.K1 = f6;
    }

    public void b3(int i5) {
        this.Q1 = i5;
    }

    public void c3(int i5) {
        this.E1 = i5;
    }

    public void d3(int i5) {
        this.T1 = i5;
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void g(androidx.constraintlayout.solver.g gVar, boolean z5) {
        super.g(gVar, z5);
        boolean s22 = U() != null ? ((f) U()).s2() : false;
        int i5 = this.T1;
        if (i5 != 0) {
            if (i5 == 1) {
                int size = this.W1.size();
                int i6 = 0;
                while (i6 < size) {
                    this.W1.get(i6).d(s22, i6, i6 == size + (-1));
                    i6++;
                }
            } else if (i5 == 2) {
                F2(s22);
            }
        } else if (this.W1.size() > 0) {
            this.W1.get(0).d(s22, 0, true);
        }
        c2(false);
    }

    @Override // androidx.constraintlayout.solver.widgets.j, androidx.constraintlayout.solver.widgets.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        g gVar = (g) eVar;
        this.D1 = gVar.D1;
        this.E1 = gVar.E1;
        this.F1 = gVar.F1;
        this.G1 = gVar.G1;
        this.H1 = gVar.H1;
        this.I1 = gVar.I1;
        this.J1 = gVar.J1;
        this.K1 = gVar.K1;
        this.L1 = gVar.L1;
        this.M1 = gVar.M1;
        this.N1 = gVar.N1;
        this.O1 = gVar.O1;
        this.P1 = gVar.P1;
        this.Q1 = gVar.Q1;
        this.R1 = gVar.R1;
        this.S1 = gVar.S1;
        this.T1 = gVar.T1;
        this.U1 = gVar.U1;
        this.V1 = gVar.V1;
    }
}
