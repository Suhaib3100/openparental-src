package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public class g extends n {

    /* renamed from: o2, reason: collision with root package name */
    public static final int f22998o2 = 0;

    /* renamed from: p2, reason: collision with root package name */
    public static final int f22999p2 = 1;

    /* renamed from: q2, reason: collision with root package name */
    public static final int f23000q2 = 2;

    /* renamed from: r2, reason: collision with root package name */
    public static final int f23001r2 = 0;

    /* renamed from: s2, reason: collision with root package name */
    public static final int f23002s2 = 1;

    /* renamed from: t2, reason: collision with root package name */
    public static final int f23003t2 = 2;

    /* renamed from: u2, reason: collision with root package name */
    public static final int f23004u2 = 3;

    /* renamed from: v2, reason: collision with root package name */
    public static final int f23005v2 = 0;

    /* renamed from: w2, reason: collision with root package name */
    public static final int f23006w2 = 1;

    /* renamed from: x2, reason: collision with root package name */
    public static final int f23007x2 = 2;

    /* renamed from: y2, reason: collision with root package name */
    public static final int f23008y2 = 3;

    /* renamed from: m2, reason: collision with root package name */
    private e[] f23021m2;
    private int P1 = -1;
    private int Q1 = -1;
    private int R1 = -1;
    private int S1 = -1;
    private int T1 = -1;
    private int U1 = -1;
    private float V1 = 0.5f;
    private float W1 = 0.5f;
    private float X1 = 0.5f;
    private float Y1 = 0.5f;
    private float Z1 = 0.5f;

    /* renamed from: a2, reason: collision with root package name */
    private float f23009a2 = 0.5f;

    /* renamed from: b2, reason: collision with root package name */
    private int f23010b2 = 0;

    /* renamed from: c2, reason: collision with root package name */
    private int f23011c2 = 0;

    /* renamed from: d2, reason: collision with root package name */
    private int f23012d2 = 2;

    /* renamed from: e2, reason: collision with root package name */
    private int f23013e2 = 2;

    /* renamed from: f2, reason: collision with root package name */
    private int f23014f2 = 0;

    /* renamed from: g2, reason: collision with root package name */
    private int f23015g2 = -1;

    /* renamed from: h2, reason: collision with root package name */
    private int f23016h2 = 0;

    /* renamed from: i2, reason: collision with root package name */
    private ArrayList<a> f23017i2 = new ArrayList<>();

    /* renamed from: j2, reason: collision with root package name */
    private e[] f23018j2 = null;

    /* renamed from: k2, reason: collision with root package name */
    private e[] f23019k2 = null;

    /* renamed from: l2, reason: collision with root package name */
    private int[] f23020l2 = null;

    /* renamed from: n2, reason: collision with root package name */
    private int f23022n2 = 0;

    /* compiled from: Flow.java */
    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f23023a;

        /* renamed from: d, reason: collision with root package name */
        private d f23026d;

        /* renamed from: e, reason: collision with root package name */
        private d f23027e;

        /* renamed from: f, reason: collision with root package name */
        private d f23028f;

        /* renamed from: g, reason: collision with root package name */
        private d f23029g;

        /* renamed from: h, reason: collision with root package name */
        private int f23030h;

        /* renamed from: i, reason: collision with root package name */
        private int f23031i;

        /* renamed from: j, reason: collision with root package name */
        private int f23032j;

        /* renamed from: k, reason: collision with root package name */
        private int f23033k;

        /* renamed from: q, reason: collision with root package name */
        private int f23039q;

        /* renamed from: b, reason: collision with root package name */
        private e f23024b = null;

        /* renamed from: c, reason: collision with root package name */
        int f23025c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f23034l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f23035m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f23036n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f23037o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f23038p = 0;

        public a(int i4, d dVar, d dVar2, d dVar3, d dVar4, int i5) {
            this.f23030h = 0;
            this.f23031i = 0;
            this.f23032j = 0;
            this.f23033k = 0;
            this.f23039q = 0;
            this.f23023a = i4;
            this.f23026d = dVar;
            this.f23027e = dVar2;
            this.f23028f = dVar3;
            this.f23029g = dVar4;
            this.f23030h = g.this.s2();
            this.f23031i = g.this.u2();
            this.f23032j = g.this.t2();
            this.f23033k = g.this.r2();
            this.f23039q = i5;
        }

        private void h() {
            this.f23034l = 0;
            this.f23035m = 0;
            this.f23024b = null;
            this.f23025c = 0;
            int i4 = this.f23037o;
            for (int i5 = 0; i5 < i4 && this.f23036n + i5 < g.this.f23022n2; i5++) {
                e eVar = g.this.f23021m2[this.f23036n + i5];
                if (this.f23023a == 0) {
                    int m02 = eVar.m0();
                    int i6 = g.this.f23010b2;
                    if (eVar.l0() == 8) {
                        i6 = 0;
                    }
                    this.f23034l = m02 + i6 + this.f23034l;
                    int e32 = g.this.e3(eVar, this.f23039q);
                    if (this.f23024b == null || this.f23025c < e32) {
                        this.f23024b = eVar;
                        this.f23025c = e32;
                        this.f23035m = e32;
                    }
                } else {
                    int f32 = g.this.f3(eVar, this.f23039q);
                    int e33 = g.this.e3(eVar, this.f23039q);
                    int i7 = g.this.f23011c2;
                    if (eVar.l0() == 8) {
                        i7 = 0;
                    }
                    this.f23035m = e33 + i7 + this.f23035m;
                    if (this.f23024b == null || this.f23025c < f32) {
                        this.f23024b = eVar;
                        this.f23025c = f32;
                        this.f23034l = f32;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f23023a == 0) {
                int f32 = g.this.f3(eVar, this.f23039q);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    this.f23038p++;
                    f32 = 0;
                }
                this.f23034l = f32 + (eVar.l0() != 8 ? g.this.f23010b2 : 0) + this.f23034l;
                int e32 = g.this.e3(eVar, this.f23039q);
                if (this.f23024b == null || this.f23025c < e32) {
                    this.f23024b = eVar;
                    this.f23025c = e32;
                    this.f23035m = e32;
                }
            } else {
                int f33 = g.this.f3(eVar, this.f23039q);
                int e33 = g.this.e3(eVar, this.f23039q);
                if (eVar.j0() == e.b.MATCH_CONSTRAINT) {
                    this.f23038p++;
                    e33 = 0;
                }
                this.f23035m = e33 + (eVar.l0() != 8 ? g.this.f23011c2 : 0) + this.f23035m;
                if (this.f23024b == null || this.f23025c < f33) {
                    this.f23024b = eVar;
                    this.f23025c = f33;
                    this.f23034l = f33;
                }
            }
            this.f23037o++;
        }

        public void c() {
            this.f23025c = 0;
            this.f23024b = null;
            this.f23034l = 0;
            this.f23035m = 0;
            this.f23036n = 0;
            this.f23037o = 0;
            this.f23038p = 0;
        }

        public void d(boolean z4, int i4, boolean z5) {
            e eVar;
            char c5;
            float f4;
            float f5;
            int i5 = this.f23037o;
            for (int i6 = 0; i6 < i5 && this.f23036n + i6 < g.this.f23022n2; i6++) {
                e eVar2 = g.this.f23021m2[this.f23036n + i6];
                if (eVar2 != null) {
                    eVar2.U0();
                }
            }
            if (i5 == 0 || this.f23024b == null) {
                return;
            }
            boolean z6 = z5 && i4 == 0;
            int i7 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < i5; i11++) {
                int i12 = z4 ? (i5 - 1) - i11 : i11;
                if (this.f23036n + i12 >= g.this.f23022n2) {
                    break;
                }
                e eVar3 = g.this.f23021m2[this.f23036n + i12];
                if (eVar3 != null && eVar3.l0() == 0) {
                    if (i7 == -1) {
                        i7 = i11;
                    }
                    i10 = i11;
                }
            }
            e eVar4 = null;
            if (this.f23023a != 0) {
                e eVar5 = this.f23024b;
                eVar5.B1(g.this.P1);
                int i13 = this.f23030h;
                if (i4 > 0) {
                    i13 += g.this.f23010b2;
                }
                if (z4) {
                    eVar5.S.a(this.f23028f, i13);
                    if (z5) {
                        eVar5.Q.a(this.f23026d, this.f23032j);
                    }
                    if (i4 > 0) {
                        this.f23028f.f22900d.Q.a(eVar5.S, 0);
                    }
                } else {
                    eVar5.Q.a(this.f23026d, i13);
                    if (z5) {
                        eVar5.S.a(this.f23028f, this.f23032j);
                    }
                    if (i4 > 0) {
                        this.f23026d.f22900d.S.a(eVar5.Q, 0);
                    }
                }
                for (int i14 = 0; i14 < i5 && this.f23036n + i14 < g.this.f23022n2; i14++) {
                    e eVar6 = g.this.f23021m2[this.f23036n + i14];
                    if (eVar6 != null) {
                        if (i14 == 0) {
                            eVar6.l(eVar6.R, this.f23027e, this.f23031i);
                            int i15 = g.this.Q1;
                            float f6 = g.this.W1;
                            if (this.f23036n == 0 && g.this.S1 != -1) {
                                i15 = g.this.S1;
                                f6 = g.this.Y1;
                            } else if (z5 && g.this.U1 != -1) {
                                i15 = g.this.U1;
                                f6 = g.this.f23009a2;
                            }
                            eVar6.W1(i15);
                            eVar6.V1(f6);
                        }
                        if (i14 == i5 - 1) {
                            eVar6.l(eVar6.T, this.f23029g, this.f23033k);
                        }
                        if (eVar4 != null) {
                            eVar6.R.a(eVar4.T, g.this.f23011c2);
                            if (i14 == i7) {
                                eVar6.R.B(this.f23031i);
                            }
                            eVar4.T.a(eVar6.R, 0);
                            if (i14 == i10 + 1) {
                                eVar4.T.B(this.f23033k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z4) {
                                int i16 = g.this.f23012d2;
                                if (i16 == 0) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i16 == 1) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i16 == 2) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                    eVar6.S.a(eVar5.S, 0);
                                }
                            } else {
                                int i17 = g.this.f23012d2;
                                if (i17 == 0) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i17 == 1) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i17 == 2) {
                                    if (z6) {
                                        eVar6.Q.a(this.f23026d, this.f23030h);
                                        eVar6.S.a(this.f23028f, this.f23032j);
                                    } else {
                                        eVar6.Q.a(eVar5.Q, 0);
                                        eVar6.S.a(eVar5.S, 0);
                                    }
                                }
                                eVar4 = eVar6;
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.f23024b;
            eVar7.W1(g.this.Q1);
            int i18 = this.f23031i;
            if (i4 > 0) {
                i18 += g.this.f23011c2;
            }
            eVar7.R.a(this.f23027e, i18);
            if (z5) {
                eVar7.T.a(this.f23029g, this.f23033k);
            }
            if (i4 > 0) {
                this.f23027e.f22900d.T.a(eVar7.R, 0);
            }
            char c6 = 3;
            if (g.this.f23013e2 == 3 && !eVar7.q0()) {
                for (int i19 = 0; i19 < i5; i19++) {
                    int i20 = z4 ? (i5 - 1) - i19 : i19;
                    if (this.f23036n + i20 >= g.this.f23022n2) {
                        break;
                    }
                    eVar = g.this.f23021m2[this.f23036n + i20];
                    if (eVar.q0()) {
                        break;
                    }
                }
            }
            eVar = eVar7;
            int i21 = 0;
            while (i21 < i5) {
                int i22 = z4 ? (i5 - 1) - i21 : i21;
                if (this.f23036n + i22 >= g.this.f23022n2) {
                    return;
                }
                e eVar8 = g.this.f23021m2[this.f23036n + i22];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c5 = c6;
                } else {
                    if (i21 == 0) {
                        eVar8.l(eVar8.Q, this.f23026d, this.f23030h);
                    }
                    if (i22 == 0) {
                        int i23 = g.this.P1;
                        float f7 = g.this.V1;
                        if (z4) {
                            f7 = 1.0f - f7;
                        }
                        if (this.f23036n == 0 && g.this.R1 != -1) {
                            i23 = g.this.R1;
                            if (z4) {
                                f5 = g.this.X1;
                                f4 = 1.0f - f5;
                                f7 = f4;
                            } else {
                                f4 = g.this.X1;
                                f7 = f4;
                            }
                        } else if (z5 && g.this.T1 != -1) {
                            i23 = g.this.T1;
                            if (z4) {
                                f5 = g.this.Z1;
                                f4 = 1.0f - f5;
                                f7 = f4;
                            } else {
                                f4 = g.this.Z1;
                                f7 = f4;
                            }
                        }
                        eVar8.B1(i23);
                        eVar8.A1(f7);
                    }
                    if (i21 == i5 - 1) {
                        eVar8.l(eVar8.S, this.f23028f, this.f23032j);
                    }
                    if (eVar4 != null) {
                        eVar8.Q.a(eVar4.S, g.this.f23010b2);
                        if (i21 == i7) {
                            eVar8.Q.B(this.f23030h);
                        }
                        eVar4.S.a(eVar8.Q, 0);
                        if (i21 == i10 + 1) {
                            eVar4.S.B(this.f23032j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c5 = 3;
                        if (g.this.f23013e2 == 3 && eVar.q0() && eVar8 != eVar && eVar8.q0()) {
                            eVar8.U.a(eVar.U, 0);
                        } else {
                            int i24 = g.this.f23013e2;
                            if (i24 == 0) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (i24 == 1) {
                                eVar8.T.a(eVar7.T, 0);
                            } else if (z6) {
                                eVar8.R.a(this.f23027e, this.f23031i);
                                eVar8.T.a(this.f23029g, this.f23033k);
                            } else {
                                eVar8.R.a(eVar7.R, 0);
                                eVar8.T.a(eVar7.T, 0);
                            }
                        }
                    } else {
                        c5 = 3;
                    }
                }
                i21++;
                c6 = c5;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f23023a == 1 ? this.f23035m - g.this.f23011c2 : this.f23035m;
        }

        public int f() {
            return this.f23023a == 0 ? this.f23034l - g.this.f23010b2 : this.f23034l;
        }

        public void g(int i4) {
            int i5 = this.f23038p;
            if (i5 == 0) {
                return;
            }
            int i6 = this.f23037o;
            int i7 = i4 / i5;
            for (int i10 = 0; i10 < i6 && this.f23036n + i10 < g.this.f23022n2; i10++) {
                e eVar = g.this.f23021m2[this.f23036n + i10];
                if (this.f23023a == 0) {
                    if (eVar != null && eVar.H() == e.b.MATCH_CONSTRAINT && eVar.f22977w == 0) {
                        g.this.w2(eVar, e.b.FIXED, i7, eVar.j0(), eVar.D());
                    }
                } else if (eVar != null && eVar.j0() == e.b.MATCH_CONSTRAINT && eVar.f22979x == 0) {
                    g.this.w2(eVar, eVar.H(), eVar.m0(), e.b.FIXED, i7);
                }
            }
            h();
        }

        public void i(int i4) {
            this.f23036n = i4;
        }

        public void j(int i4, d dVar, d dVar2, d dVar3, d dVar4, int i5, int i6, int i7, int i10, int i11) {
            this.f23023a = i4;
            this.f23026d = dVar;
            this.f23027e = dVar2;
            this.f23028f = dVar3;
            this.f23029g = dVar4;
            this.f23030h = i5;
            this.f23031i = i6;
            this.f23032j = i7;
            this.f23033k = i10;
            this.f23039q = i11;
        }
    }

    private void c3(boolean z4) {
        e eVar;
        float f4;
        int i4;
        if (this.f23020l2 == null || this.f23019k2 == null || this.f23018j2 == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f23022n2; i5++) {
            this.f23021m2[i5].U0();
        }
        int[] iArr = this.f23020l2;
        int i6 = iArr[0];
        int i7 = iArr[1];
        float f5 = this.V1;
        e eVar2 = null;
        int i10 = 0;
        while (i10 < i6) {
            if (z4) {
                i4 = (i6 - i10) - 1;
                f4 = 1.0f - this.V1;
            } else {
                f4 = f5;
                i4 = i10;
            }
            e eVar3 = this.f23019k2[i4];
            if (eVar3 != null && eVar3.l0() != 8) {
                if (i10 == 0) {
                    eVar3.l(eVar3.Q, this.Q, s2());
                    eVar3.B1(this.P1);
                    eVar3.A1(f4);
                }
                if (i10 == i6 - 1) {
                    eVar3.l(eVar3.S, this.S, t2());
                }
                if (i10 > 0 && eVar2 != null) {
                    eVar3.l(eVar3.Q, eVar2.S, this.f23010b2);
                    eVar2.l(eVar2.S, eVar3.Q, 0);
                }
                eVar2 = eVar3;
            }
            i10++;
            f5 = f4;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            e eVar4 = this.f23018j2[i11];
            if (eVar4 != null && eVar4.l0() != 8) {
                if (i11 == 0) {
                    eVar4.l(eVar4.R, this.R, u2());
                    eVar4.W1(this.Q1);
                    eVar4.V1(this.W1);
                }
                if (i11 == i7 - 1) {
                    eVar4.l(eVar4.T, this.T, r2());
                }
                if (i11 > 0 && eVar2 != null) {
                    eVar4.l(eVar4.R, eVar2.T, this.f23011c2);
                    eVar2.l(eVar2.T, eVar4.R, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            for (int i13 = 0; i13 < i7; i13++) {
                int i14 = (i13 * i6) + i12;
                if (this.f23016h2 == 1) {
                    i14 = (i12 * i7) + i13;
                }
                e[] eVarArr = this.f23021m2;
                if (i14 < eVarArr.length && (eVar = eVarArr[i14]) != null && eVar.l0() != 8) {
                    e eVar5 = this.f23019k2[i12];
                    e eVar6 = this.f23018j2[i13];
                    if (eVar != eVar5) {
                        eVar.l(eVar.Q, eVar5.Q, 0);
                        eVar.l(eVar.S, eVar5.S, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.l(eVar.R, eVar6.R, 0);
                        eVar.l(eVar.T, eVar6.T, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e3(e eVar, int i4) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.j0() == e.b.MATCH_CONSTRAINT) {
            int i5 = eVar.f22979x;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (eVar.E * i4);
                if (i6 != eVar.D()) {
                    eVar.N1(true);
                    w2(eVar, eVar.H(), eVar.m0(), e.b.FIXED, i6);
                }
                return i6;
            }
            if (i5 == 1) {
                return eVar.D();
            }
            if (i5 == 3) {
                return (int) ((eVar.m0() * eVar.f22944f0) + 0.5f);
            }
        }
        return eVar.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f3(e eVar, int i4) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.H() == e.b.MATCH_CONSTRAINT) {
            int i5 = eVar.f22977w;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (eVar.B * i4);
                if (i6 != eVar.m0()) {
                    eVar.N1(true);
                    w2(eVar, e.b.FIXED, i6, eVar.j0(), eVar.D());
                }
                return i6;
            }
            if (i5 == 1) {
                return eVar.m0();
            }
            if (i5 == 3) {
                return (int) ((eVar.D() * eVar.f22944f0) + 0.5f);
            }
        }
        return eVar.m0();
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
    private void g3(androidx.constraintlayout.core.widgets.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.g.g3(androidx.constraintlayout.core.widgets.e[], int, int, int, int[]):void");
    }

    private void h3(e[] eVarArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        int i10;
        int i11;
        d dVar;
        int t22;
        d dVar2;
        int r22;
        int i12;
        if (i4 == 0) {
            return;
        }
        this.f23017i2.clear();
        a aVar = new a(i5, this.Q, this.R, this.S, this.T, i6);
        this.f23017i2.add(aVar);
        if (i5 == 0) {
            i7 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i4) {
                e eVar = eVarArr[i14];
                int f32 = f3(eVar, i6);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i15 = i7;
                boolean z4 = (i13 == i6 || (this.f23010b2 + i13) + f32 > i6) && aVar.f23024b != null;
                if (!z4 && i14 > 0 && (i12 = this.f23015g2) > 0 && i14 % i12 == 0) {
                    z4 = true;
                }
                if (z4) {
                    aVar = new a(i5, this.Q, this.R, this.S, this.T, i6);
                    aVar.i(i14);
                    this.f23017i2.add(aVar);
                } else if (i14 > 0) {
                    i13 = this.f23010b2 + f32 + i13;
                    aVar.b(eVar);
                    i14++;
                    i7 = i15;
                }
                i13 = f32;
                aVar.b(eVar);
                i14++;
                i7 = i15;
            }
        } else {
            i7 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < i4) {
                e eVar2 = eVarArr[i17];
                int e32 = e3(eVar2, i6);
                if (eVar2.j0() == e.b.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i18 = i7;
                boolean z5 = (i16 == i6 || (this.f23011c2 + i16) + e32 > i6) && aVar.f23024b != null;
                if (!z5 && i17 > 0 && (i10 = this.f23015g2) > 0 && i17 % i10 == 0) {
                    z5 = true;
                }
                if (z5) {
                    aVar = new a(i5, this.Q, this.R, this.S, this.T, i6);
                    aVar.i(i17);
                    this.f23017i2.add(aVar);
                } else if (i17 > 0) {
                    i16 = this.f23011c2 + e32 + i16;
                    aVar.b(eVar2);
                    i17++;
                    i7 = i18;
                }
                i16 = e32;
                aVar.b(eVar2);
                i17++;
                i7 = i18;
            }
        }
        int size = this.f23017i2.size();
        d dVar3 = this.Q;
        d dVar4 = this.R;
        d dVar5 = this.S;
        d dVar6 = this.T;
        int s22 = s2();
        int u22 = u2();
        int t23 = t2();
        int r23 = r2();
        e.b H = H();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z6 = H == bVar || j0() == bVar;
        if (i7 > 0 && z6) {
            for (int i19 = 0; i19 < size; i19++) {
                a aVar2 = this.f23017i2.get(i19);
                if (i5 == 0) {
                    aVar2.g(i6 - aVar2.f());
                } else {
                    aVar2.g(i6 - aVar2.e());
                }
            }
        }
        int i20 = u22;
        int i21 = t23;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = s22;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i26 = r23;
        while (i24 < size) {
            a aVar3 = this.f23017i2.get(i24);
            if (i5 == 0) {
                if (i24 < size - 1) {
                    dVar2 = this.f23017i2.get(i24 + 1).f23024b.R;
                    r22 = 0;
                } else {
                    dVar2 = this.T;
                    r22 = r2();
                }
                d dVar9 = aVar3.f23024b.T;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i27 = i22;
                d dVar12 = dVar7;
                int i28 = i23;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i11 = i24;
                aVar3.j(i5, dVar10, dVar12, dVar13, dVar2, i25, i20, i21, r22, i6);
                int max = Math.max(i28, aVar3.f());
                i22 = i27 + aVar3.e();
                if (i11 > 0) {
                    i22 += this.f23011c2;
                }
                dVar8 = dVar11;
                i23 = max;
                i20 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i29 = r22;
                dVar6 = dVar2;
                i26 = i29;
            } else {
                d dVar15 = dVar8;
                int i30 = i22;
                int i31 = i23;
                i11 = i24;
                if (i11 < size - 1) {
                    dVar = this.f23017i2.get(i11 + 1).f23024b.Q;
                    t22 = 0;
                } else {
                    dVar = this.S;
                    t22 = t2();
                }
                d dVar16 = aVar3.f23024b.S;
                aVar3.j(i5, dVar15, dVar7, dVar, dVar6, i25, i20, t22, i26, i6);
                i23 = i31 + aVar3.f();
                int max2 = Math.max(i30, aVar3.e());
                if (i11 > 0) {
                    i23 += this.f23010b2;
                }
                i22 = max2;
                i25 = 0;
                i21 = t22;
                dVar8 = dVar16;
            }
            i24 = i11 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i23;
        iArr[1] = i22;
    }

    private void i3(e[] eVarArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        int i10;
        int i11;
        d dVar;
        int t22;
        d dVar2;
        int r22;
        int i12;
        if (i4 == 0) {
            return;
        }
        this.f23017i2.clear();
        a aVar = new a(i5, this.Q, this.R, this.S, this.T, i6);
        this.f23017i2.add(aVar);
        if (i5 == 0) {
            int i13 = 0;
            i7 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i4) {
                int i16 = i13 + 1;
                e eVar = eVarArr[i15];
                int f32 = f3(eVar, i6);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i17 = i7;
                boolean z4 = (i14 == i6 || (this.f23010b2 + i14) + f32 > i6) && aVar.f23024b != null;
                if (!z4 && i15 > 0 && (i12 = this.f23015g2) > 0 && i16 > i12) {
                    z4 = true;
                }
                if (z4) {
                    aVar = new a(i5, this.Q, this.R, this.S, this.T, i6);
                    aVar.i(i15);
                    this.f23017i2.add(aVar);
                    i13 = i16;
                    i14 = f32;
                } else {
                    i14 = i15 > 0 ? this.f23010b2 + f32 + i14 : f32;
                    i13 = 0;
                }
                aVar.b(eVar);
                i15++;
                i7 = i17;
            }
        } else {
            int i18 = 0;
            i7 = 0;
            int i19 = 0;
            while (i19 < i4) {
                e eVar2 = eVarArr[i19];
                int e32 = e3(eVar2, i6);
                if (eVar2.j0() == e.b.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i20 = i7;
                boolean z5 = (i18 == i6 || (this.f23011c2 + i18) + e32 > i6) && aVar.f23024b != null;
                if (!z5 && i19 > 0 && (i10 = this.f23015g2) > 0 && i10 < 0) {
                    z5 = true;
                }
                if (z5) {
                    aVar = new a(i5, this.Q, this.R, this.S, this.T, i6);
                    aVar.i(i19);
                    this.f23017i2.add(aVar);
                } else if (i19 > 0) {
                    i18 = this.f23011c2 + e32 + i18;
                    aVar.b(eVar2);
                    i19++;
                    i7 = i20;
                }
                i18 = e32;
                aVar.b(eVar2);
                i19++;
                i7 = i20;
            }
        }
        int size = this.f23017i2.size();
        d dVar3 = this.Q;
        d dVar4 = this.R;
        d dVar5 = this.S;
        d dVar6 = this.T;
        int s22 = s2();
        int u22 = u2();
        int t23 = t2();
        int r23 = r2();
        e.b H = H();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z6 = H == bVar || j0() == bVar;
        if (i7 > 0 && z6) {
            for (int i21 = 0; i21 < size; i21++) {
                a aVar2 = this.f23017i2.get(i21);
                if (i5 == 0) {
                    aVar2.g(i6 - aVar2.f());
                } else {
                    aVar2.g(i6 - aVar2.e());
                }
            }
        }
        int i22 = u22;
        int i23 = t23;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = s22;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i28 = r23;
        while (i26 < size) {
            a aVar3 = this.f23017i2.get(i26);
            if (i5 == 0) {
                if (i26 < size - 1) {
                    dVar2 = this.f23017i2.get(i26 + 1).f23024b.R;
                    r22 = 0;
                } else {
                    dVar2 = this.T;
                    r22 = r2();
                }
                d dVar9 = aVar3.f23024b.T;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i29 = i24;
                d dVar12 = dVar7;
                int i30 = i25;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i11 = i26;
                aVar3.j(i5, dVar10, dVar12, dVar13, dVar2, i27, i22, i23, r22, i6);
                int max = Math.max(i30, aVar3.f());
                i24 = i29 + aVar3.e();
                if (i11 > 0) {
                    i24 += this.f23011c2;
                }
                dVar8 = dVar11;
                i25 = max;
                i22 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i31 = r22;
                dVar6 = dVar2;
                i28 = i31;
            } else {
                d dVar15 = dVar8;
                int i32 = i24;
                int i33 = i25;
                i11 = i26;
                if (i11 < size - 1) {
                    dVar = this.f23017i2.get(i11 + 1).f23024b.Q;
                    t22 = 0;
                } else {
                    dVar = this.S;
                    t22 = t2();
                }
                d dVar16 = aVar3.f23024b.S;
                aVar3.j(i5, dVar15, dVar7, dVar, dVar6, i27, i22, t22, i28, i6);
                i25 = i33 + aVar3.f();
                int max2 = Math.max(i32, aVar3.e());
                if (i11 > 0) {
                    i25 += this.f23010b2;
                }
                i24 = max2;
                i27 = 0;
                i23 = t22;
                dVar8 = dVar16;
            }
            i26 = i11 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i25;
        iArr[1] = i24;
    }

    private void j3(e[] eVarArr, int i4, int i5, int i6, int[] iArr) {
        a aVar;
        if (i4 == 0) {
            return;
        }
        if (this.f23017i2.size() == 0) {
            aVar = new a(i5, this.Q, this.R, this.S, this.T, i6);
            this.f23017i2.add(aVar);
        } else {
            a aVar2 = this.f23017i2.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i5, this.Q, this.R, this.S, this.T, s2(), u2(), t2(), r2(), i6);
        }
        for (int i7 = 0; i7 < i4; i7++) {
            aVar.b(eVarArr[i7]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A3(int i4) {
        this.f23011c2 = i4;
    }

    public void B3(int i4) {
        this.Q1 = i4;
    }

    public void C3(int i4) {
        this.f23014f2 = i4;
    }

    public float d3() {
        return this.f23015g2;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.f fVar, boolean z4) {
        super.g(fVar, z4);
        boolean z5 = U() != null && ((f) U()).O2();
        int i4 = this.f23014f2;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = this.f23017i2.size();
                int i5 = 0;
                while (i5 < size) {
                    this.f23017i2.get(i5).d(z5, i5, i5 == size + (-1));
                    i5++;
                }
            } else if (i4 == 2) {
                c3(z5);
            } else if (i4 == 3) {
                int size2 = this.f23017i2.size();
                int i6 = 0;
                while (i6 < size2) {
                    this.f23017i2.get(i6).d(z5, i6, i6 == size2 + (-1));
                    i6++;
                }
            }
        } else if (this.f23017i2.size() > 0) {
            this.f23017i2.get(0).d(z5, 0, true);
        }
        z2(false);
    }

    public void k3(float f4) {
        this.X1 = f4;
    }

    public void l3(int i4) {
        this.R1 = i4;
    }

    public void m3(float f4) {
        this.Y1 = f4;
    }

    @Override // androidx.constraintlayout.core.widgets.j, androidx.constraintlayout.core.widgets.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        g gVar = (g) eVar;
        this.P1 = gVar.P1;
        this.Q1 = gVar.Q1;
        this.R1 = gVar.R1;
        this.S1 = gVar.S1;
        this.T1 = gVar.T1;
        this.U1 = gVar.U1;
        this.V1 = gVar.V1;
        this.W1 = gVar.W1;
        this.X1 = gVar.X1;
        this.Y1 = gVar.Y1;
        this.Z1 = gVar.Z1;
        this.f23009a2 = gVar.f23009a2;
        this.f23010b2 = gVar.f23010b2;
        this.f23011c2 = gVar.f23011c2;
        this.f23012d2 = gVar.f23012d2;
        this.f23013e2 = gVar.f23013e2;
        this.f23014f2 = gVar.f23014f2;
        this.f23015g2 = gVar.f23015g2;
        this.f23016h2 = gVar.f23016h2;
    }

    public void n3(int i4) {
        this.S1 = i4;
    }

    public void o3(int i4) {
        this.f23012d2 = i4;
    }

    public void p3(float f4) {
        this.V1 = f4;
    }

    public void q3(int i4) {
        this.f23010b2 = i4;
    }

    public void r3(int i4) {
        this.P1 = i4;
    }

    public void s3(float f4) {
        this.Z1 = f4;
    }

    public void t3(int i4) {
        this.T1 = i4;
    }

    public void u3(float f4) {
        this.f23009a2 = f4;
    }

    @Override // androidx.constraintlayout.core.widgets.n
    public void v2(int i4, int i5, int i6, int i7) {
        int i10;
        int i11;
        int[] iArr;
        boolean z4;
        if (this.B1 > 0 && !x2()) {
            A2(0, 0);
            z2(false);
            return;
        }
        int s22 = s2();
        int t22 = t2();
        int u22 = u2();
        int r22 = r2();
        int[] iArr2 = new int[2];
        int i12 = (i5 - s22) - t22;
        int i13 = this.f23016h2;
        if (i13 == 1) {
            i12 = (i7 - u22) - r22;
        }
        int i14 = i12;
        if (i13 == 0) {
            if (this.P1 == -1) {
                this.P1 = 0;
            }
            if (this.Q1 == -1) {
                this.Q1 = 0;
            }
        } else {
            if (this.P1 == -1) {
                this.P1 = 0;
            }
            if (this.Q1 == -1) {
                this.Q1 = 0;
            }
        }
        e[] eVarArr = this.A1;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = this.B1;
            if (i15 >= i10) {
                break;
            }
            if (this.A1[i15].l0() == 8) {
                i16++;
            }
            i15++;
        }
        if (i16 > 0) {
            eVarArr = new e[i10 - i16];
            int i17 = 0;
            for (int i18 = 0; i18 < this.B1; i18++) {
                e eVar = this.A1[i18];
                if (eVar.l0() != 8) {
                    eVarArr[i17] = eVar;
                    i17++;
                }
            }
            i11 = i17;
        } else {
            i11 = i10;
        }
        this.f23021m2 = eVarArr;
        this.f23022n2 = i11;
        int i19 = this.f23014f2;
        if (i19 == 0) {
            iArr = iArr2;
            z4 = true;
            j3(eVarArr, i11, this.f23016h2, i14, iArr2);
        } else if (i19 == 1) {
            z4 = true;
            iArr = iArr2;
            h3(eVarArr, i11, this.f23016h2, i14, iArr2);
        } else if (i19 == 2) {
            z4 = true;
            iArr = iArr2;
            g3(eVarArr, i11, this.f23016h2, i14, iArr2);
        } else if (i19 != 3) {
            z4 = true;
            iArr = iArr2;
        } else {
            z4 = true;
            iArr = iArr2;
            i3(eVarArr, i11, this.f23016h2, i14, iArr2);
        }
        int i20 = iArr[0] + s22 + t22;
        int i21 = iArr[z4 ? 1 : 0] + u22 + r22;
        if (i4 == 1073741824) {
            i20 = i5;
        } else if (i4 == Integer.MIN_VALUE) {
            i20 = Math.min(i20, i5);
        } else if (i4 != 0) {
            i20 = 0;
        }
        if (i6 == 1073741824) {
            i21 = i7;
        } else if (i6 == Integer.MIN_VALUE) {
            i21 = Math.min(i21, i7);
        } else if (i6 != 0) {
            i21 = 0;
        }
        A2(i20, i21);
        c2(i20);
        y1(i21);
        if (this.B1 <= 0) {
            z4 = false;
        }
        z2(z4);
    }

    public void v3(int i4) {
        this.U1 = i4;
    }

    public void w3(int i4) {
        this.f23015g2 = i4;
    }

    public void x3(int i4) {
        this.f23016h2 = i4;
    }

    public void y3(int i4) {
        this.f23013e2 = i4;
    }

    public void z3(float f4) {
        this.W1 = f4;
    }
}
