package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f22771d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final int f22772e = 30;

    /* renamed from: f, reason: collision with root package name */
    public static final int f22773f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f22774g = 1073741824;

    /* renamed from: h, reason: collision with root package name */
    public static final int f22775h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public static final int f22776i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f22777j = -2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f22778k = -3;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<androidx.constraintlayout.core.widgets.e> f22779a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private a f22780b = new a();

    /* renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.f f22781c;

    /* compiled from: BasicMeasure.java */
    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f22782k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f22783l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f22784m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f22785a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f22786b;

        /* renamed from: c, reason: collision with root package name */
        public int f22787c;

        /* renamed from: d, reason: collision with root package name */
        public int f22788d;

        /* renamed from: e, reason: collision with root package name */
        public int f22789e;

        /* renamed from: f, reason: collision with root package name */
        public int f22790f;

        /* renamed from: g, reason: collision with root package name */
        public int f22791g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f22792h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f22793i;

        /* renamed from: j, reason: collision with root package name */
        public int f22794j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b, reason: collision with other inner class name */
    public interface InterfaceC0389b {
        void a();

        void b(androidx.constraintlayout.core.widgets.e eVar, a aVar);
    }

    public b(androidx.constraintlayout.core.widgets.f fVar) {
        this.f22781c = fVar;
    }

    private boolean a(InterfaceC0389b interfaceC0389b, androidx.constraintlayout.core.widgets.e eVar, int i4) {
        this.f22780b.f22785a = eVar.H();
        this.f22780b.f22786b = eVar.j0();
        this.f22780b.f22787c = eVar.m0();
        this.f22780b.f22788d = eVar.D();
        a aVar = this.f22780b;
        aVar.f22793i = false;
        aVar.f22794j = i4;
        e.b bVar = aVar.f22785a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z4 = bVar == bVar2;
        boolean z5 = aVar.f22786b == bVar2;
        boolean z6 = z4 && eVar.f22944f0 > 0.0f;
        boolean z7 = z5 && eVar.f22944f0 > 0.0f;
        if (z6 && eVar.f22981y[0] == 4) {
            aVar.f22785a = e.b.FIXED;
        }
        if (z7 && eVar.f22981y[1] == 4) {
            aVar.f22786b = e.b.FIXED;
        }
        interfaceC0389b.b(eVar, aVar);
        eVar.c2(this.f22780b.f22789e);
        eVar.y1(this.f22780b.f22790f);
        eVar.x1(this.f22780b.f22792h);
        eVar.g1(this.f22780b.f22791g);
        a aVar2 = this.f22780b;
        aVar2.f22794j = a.f22782k;
        return aVar2.f22793i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (r5.f22944f0 <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(androidx.constraintlayout.core.widgets.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e> r0 = r13.A1
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.S2(r1)
            androidx.constraintlayout.core.widgets.analyzer.b$b r2 = r13.G2()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e> r5 = r13.A1
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.e r5 = (androidx.constraintlayout.core.widgets.e) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.h
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.a
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.E0()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.l r6 = r5.f22941e
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.n r7 = r5.f22943f
            if (r7 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.g r6 = r6.f22864e
            boolean r6 = r6.f22816j
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.g r6 = r7.f22864e
            boolean r6 = r6.f22816j
            if (r6 == 0) goto L48
            goto Lac
        L48:
            androidx.constraintlayout.core.widgets.e$b r6 = r5.z(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.e$b r8 = r5.z(r7)
            androidx.constraintlayout.core.widgets.e$b r9 = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.f22977w
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.f22979x
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.S2(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.n
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.f22977w
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.B0()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.f22979x
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.B0()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.f22944f0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.b.a.f22782k
            r12.a(r2, r5, r6)
            androidx.constraintlayout.core.g r5 = r13.G1
            if (r5 == 0) goto Lac
            long r6 = r5.f21863c
            r8 = 1
            long r6 = r6 + r8
            r5.f21863c = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.b.b(androidx.constraintlayout.core.widgets.f):void");
    }

    private void c(androidx.constraintlayout.core.widgets.f fVar, String str, int i4, int i5, int i6) {
        int Q = fVar.Q();
        int P = fVar.P();
        fVar.P1(0);
        fVar.O1(0);
        fVar.c2(i5);
        fVar.y1(i6);
        fVar.P1(Q);
        fVar.O1(P);
        this.f22781c.X2(i4);
        this.f22781c.n2();
    }

    public long d(androidx.constraintlayout.core.widgets.f fVar, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14) {
        boolean z4;
        int i15;
        int i16;
        boolean z5;
        int i17;
        InterfaceC0389b interfaceC0389b;
        int i18;
        int i19;
        int i20;
        boolean z6;
        androidx.constraintlayout.core.g gVar;
        InterfaceC0389b G2 = fVar.G2();
        int size = fVar.A1.size();
        int m02 = fVar.m0();
        int D = fVar.D();
        boolean b5 = androidx.constraintlayout.core.widgets.k.b(i4, 128);
        boolean z7 = b5 || androidx.constraintlayout.core.widgets.k.b(i4, 64);
        if (z7) {
            for (int i21 = 0; i21 < size; i21++) {
                androidx.constraintlayout.core.widgets.e eVar = fVar.A1.get(i21);
                e.b H = eVar.H();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z10 = (H == bVar) && (eVar.j0() == bVar) && eVar.A() > 0.0f;
                if ((eVar.B0() && z10) || ((eVar.D0() && z10) || (eVar instanceof androidx.constraintlayout.core.widgets.n) || eVar.B0() || eVar.D0())) {
                    z7 = false;
                    break;
                }
            }
        }
        if (z7 && (gVar = androidx.constraintlayout.core.f.C) != null) {
            gVar.f21865e++;
        }
        boolean z11 = z7 & ((i7 == 1073741824 && i11 == 1073741824) || b5);
        int i22 = 2;
        if (z11) {
            int min = Math.min(fVar.O(), i10);
            int min2 = Math.min(fVar.N(), i12);
            if (i7 == 1073741824 && fVar.m0() != min) {
                fVar.c2(min);
                fVar.L2();
            }
            if (i11 == 1073741824 && fVar.D() != min2) {
                fVar.y1(min2);
                fVar.L2();
            }
            if (i7 == 1073741824 && i11 == 1073741824) {
                z4 = fVar.B2(b5);
                i15 = 2;
            } else {
                boolean C2 = fVar.C2(b5);
                if (i7 == 1073741824) {
                    C2 &= fVar.D2(b5, 0);
                    i15 = 1;
                } else {
                    i15 = 0;
                }
                if (i11 == 1073741824) {
                    z4 = fVar.D2(b5, 1) & C2;
                    i15++;
                } else {
                    z4 = C2;
                }
            }
            if (z4) {
                fVar.i2(i7 == 1073741824, i11 == 1073741824);
            }
        } else {
            z4 = false;
            i15 = 0;
        }
        if (z4 && i15 == 2) {
            return 0L;
        }
        int H2 = fVar.H2();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.f22779a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, m02, D);
        }
        if (size2 > 0) {
            e.b H3 = fVar.H();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z12 = H3 == bVar2;
            boolean z13 = fVar.j0() == bVar2;
            int max = Math.max(fVar.m0(), this.f22781c.Q());
            int max2 = Math.max(fVar.D(), this.f22781c.P());
            int i23 = 0;
            boolean z14 = false;
            while (i23 < size2) {
                androidx.constraintlayout.core.widgets.e eVar2 = this.f22779a.get(i23);
                if (eVar2 instanceof androidx.constraintlayout.core.widgets.n) {
                    int m03 = eVar2.m0();
                    i18 = H2;
                    int D2 = eVar2.D();
                    i19 = D;
                    boolean a5 = a(G2, eVar2, a.f22783l) | z14;
                    androidx.constraintlayout.core.g gVar2 = fVar.G1;
                    i20 = m02;
                    if (gVar2 != null) {
                        gVar2.f21864d++;
                    }
                    int m04 = eVar2.m0();
                    int D3 = eVar2.D();
                    if (m04 != m03) {
                        eVar2.c2(m04);
                        if (z12 && eVar2.X() > max) {
                            max = Math.max(max, eVar2.r(d.b.RIGHT).g() + eVar2.X());
                        }
                        z6 = true;
                    } else {
                        z6 = a5;
                    }
                    if (D3 != D2) {
                        eVar2.y1(D3);
                        if (z13 && eVar2.v() > max2) {
                            max2 = Math.max(max2, eVar2.r(d.b.BOTTOM).g() + eVar2.v());
                        }
                        z6 = true;
                    }
                    z14 = z6 | ((androidx.constraintlayout.core.widgets.n) eVar2).y2();
                } else {
                    i18 = H2;
                    i20 = m02;
                    i19 = D;
                }
                i23++;
                H2 = i18;
                D = i19;
                m02 = i20;
                i22 = 2;
            }
            int i24 = H2;
            int i25 = m02;
            int i26 = D;
            int i27 = i22;
            int i28 = 0;
            while (i28 < i27) {
                int i29 = 0;
                while (i29 < size2) {
                    androidx.constraintlayout.core.widgets.e eVar3 = this.f22779a.get(i29);
                    if (((eVar3 instanceof androidx.constraintlayout.core.widgets.i) && !(eVar3 instanceof androidx.constraintlayout.core.widgets.n)) || (eVar3 instanceof androidx.constraintlayout.core.widgets.h) || eVar3.l0() == 8 || ((z11 && eVar3.f22941e.f22864e.f22816j && eVar3.f22943f.f22864e.f22816j) || (eVar3 instanceof androidx.constraintlayout.core.widgets.n))) {
                        z5 = z11;
                        i17 = size2;
                        interfaceC0389b = G2;
                    } else {
                        int m05 = eVar3.m0();
                        int D4 = eVar3.D();
                        int t4 = eVar3.t();
                        int i30 = a.f22783l;
                        z5 = z11;
                        if (i28 == 1) {
                            i30 = a.f22784m;
                        }
                        boolean a6 = a(G2, eVar3, i30) | z14;
                        androidx.constraintlayout.core.g gVar3 = fVar.G1;
                        i17 = size2;
                        interfaceC0389b = G2;
                        if (gVar3 != null) {
                            gVar3.f21864d++;
                        }
                        int m06 = eVar3.m0();
                        int D5 = eVar3.D();
                        if (m06 != m05) {
                            eVar3.c2(m06);
                            if (z12 && eVar3.X() > max) {
                                max = Math.max(max, eVar3.r(d.b.RIGHT).g() + eVar3.X());
                            }
                            a6 = true;
                        }
                        if (D5 != D4) {
                            eVar3.y1(D5);
                            if (z13 && eVar3.v() > max2) {
                                max2 = Math.max(max2, eVar3.r(d.b.BOTTOM).g() + eVar3.v());
                            }
                            a6 = true;
                        }
                        z14 = (!eVar3.q0() || t4 == eVar3.t()) ? a6 : true;
                    }
                    i29++;
                    G2 = interfaceC0389b;
                    z11 = z5;
                    size2 = i17;
                }
                boolean z15 = z11;
                int i31 = size2;
                InterfaceC0389b interfaceC0389b2 = G2;
                if (!z14) {
                    break;
                }
                i28++;
                c(fVar, "intermediate pass", i28, i25, i26);
                G2 = interfaceC0389b2;
                z11 = z15;
                size2 = i31;
                i27 = 2;
                z14 = false;
            }
            i16 = i24;
        } else {
            i16 = H2;
        }
        fVar.V2(i16);
        return 0L;
    }

    public void e(androidx.constraintlayout.core.widgets.f fVar) {
        this.f22779a.clear();
        int size = fVar.A1.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.constraintlayout.core.widgets.e eVar = fVar.A1.get(i4);
            e.b H = eVar.H();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (H == bVar || eVar.j0() == bVar) {
                this.f22779a.add(eVar);
            }
        }
        fVar.L2();
    }
}
