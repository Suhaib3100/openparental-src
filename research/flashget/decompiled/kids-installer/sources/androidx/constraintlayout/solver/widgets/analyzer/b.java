package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.e;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f2363d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final int f2364e = 30;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2365f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2366g = 1073741824;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2367h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2368i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2369j = -2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2370k = -3;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<androidx.constraintlayout.solver.widgets.e> f2371a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private a f2372b = new a();

    /* renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.solver.widgets.f f2373c;

    /* compiled from: BasicMeasure.java */
    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f2374k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f2375l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f2376m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f2377a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f2378b;

        /* renamed from: c, reason: collision with root package name */
        public int f2379c;

        /* renamed from: d, reason: collision with root package name */
        public int f2380d;

        /* renamed from: e, reason: collision with root package name */
        public int f2381e;

        /* renamed from: f, reason: collision with root package name */
        public int f2382f;

        /* renamed from: g, reason: collision with root package name */
        public int f2383g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2384h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2385i;

        /* renamed from: j, reason: collision with root package name */
        public int f2386j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.b$b, reason: collision with other inner class name */
    public interface InterfaceC0021b {
        void a();

        void b(androidx.constraintlayout.solver.widgets.e eVar, a aVar);
    }

    public b(androidx.constraintlayout.solver.widgets.f fVar) {
        this.f2373c = fVar;
    }

    private boolean a(InterfaceC0021b interfaceC0021b, androidx.constraintlayout.solver.widgets.e eVar, int i5) {
        this.f2372b.f2377a = eVar.H();
        this.f2372b.f2378b = eVar.g0();
        this.f2372b.f2379c = eVar.j0();
        this.f2372b.f2380d = eVar.D();
        a aVar = this.f2372b;
        aVar.f2385i = false;
        aVar.f2386j = i5;
        e.b bVar = aVar.f2377a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z5 = bVar == bVar2;
        boolean z6 = aVar.f2378b == bVar2;
        boolean z7 = z5 && eVar.Y > 0.0f;
        boolean z8 = z6 && eVar.Y > 0.0f;
        if (z7 && eVar.f2544r[0] == 4) {
            aVar.f2377a = e.b.FIXED;
        }
        if (z8 && eVar.f2544r[1] == 4) {
            aVar.f2378b = e.b.FIXED;
        }
        interfaceC0021b.b(eVar, aVar);
        eVar.H1(this.f2372b.f2381e);
        eVar.d1(this.f2372b.f2382f);
        eVar.c1(this.f2372b.f2384h);
        eVar.L0(this.f2372b.f2383g);
        a aVar2 = this.f2372b;
        aVar2.f2386j = a.f2374k;
        return aVar2.f2385i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (r5.Y <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(androidx.constraintlayout.solver.widgets.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e> r0 = r13.f2651o1
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.w2(r1)
            androidx.constraintlayout.solver.widgets.analyzer.b$b r2 = r13.k2()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e> r5 = r13.f2651o1
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.solver.widgets.e r5 = (androidx.constraintlayout.solver.widgets.e) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.h
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.a
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.v0()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            androidx.constraintlayout.solver.widgets.analyzer.m r6 = r5.f2518e
            if (r6 == 0) goto L48
            androidx.constraintlayout.solver.widgets.analyzer.o r7 = r5.f2520f
            if (r7 == 0) goto L48
            androidx.constraintlayout.solver.widgets.analyzer.h r6 = r6.f2453e
            boolean r6 = r6.f2408j
            if (r6 == 0) goto L48
            androidx.constraintlayout.solver.widgets.analyzer.h r6 = r7.f2453e
            boolean r6 = r6.f2408j
            if (r6 == 0) goto L48
            goto Lac
        L48:
            androidx.constraintlayout.solver.widgets.e$b r6 = r5.z(r3)
            r7 = 1
            androidx.constraintlayout.solver.widgets.e$b r8 = r5.z(r7)
            androidx.constraintlayout.solver.widgets.e$b r9 = androidx.constraintlayout.solver.widgets.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.f2540p
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.f2542q
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.w2(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof androidx.constraintlayout.solver.widgets.m
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.f2540p
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.s0()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.f2542q
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.s0()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.Y
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
            int r6 = androidx.constraintlayout.solver.widgets.analyzer.b.a.f2374k
            r12.a(r2, r5, r6)
            androidx.constraintlayout.solver.h r5 = r13.f2568t1
            if (r5 == 0) goto Lac
            long r6 = r5.f2181c
            r8 = 1
            long r6 = r6 + r8
            r5.f2181c = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.b.b(androidx.constraintlayout.solver.widgets.f):void");
    }

    private void c(androidx.constraintlayout.solver.widgets.f fVar, String str, int i5, int i6) {
        int Q = fVar.Q();
        int P = fVar.P();
        fVar.u1(0);
        fVar.t1(0);
        fVar.H1(i5);
        fVar.d1(i6);
        fVar.u1(Q);
        fVar.t1(P);
        this.f2373c.R1();
    }

    public long d(androidx.constraintlayout.solver.widgets.f fVar, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        boolean z5;
        int i14;
        int i15;
        boolean z6;
        boolean z7;
        boolean z8;
        int i16;
        InterfaceC0021b interfaceC0021b;
        int i17;
        int i18;
        int i19;
        boolean z9;
        androidx.constraintlayout.solver.h hVar;
        InterfaceC0021b k22 = fVar.k2();
        int size = fVar.f2651o1.size();
        int j02 = fVar.j0();
        int D = fVar.D();
        boolean b6 = androidx.constraintlayout.solver.widgets.k.b(i5, 128);
        boolean z10 = b6 || androidx.constraintlayout.solver.widgets.k.b(i5, 64);
        if (z10) {
            for (int i20 = 0; i20 < size; i20++) {
                androidx.constraintlayout.solver.widgets.e eVar = fVar.f2651o1.get(i20);
                e.b H = eVar.H();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z11 = (H == bVar) && (eVar.g0() == bVar) && eVar.A() > 0.0f;
                if ((eVar.s0() && z11) || ((eVar.u0() && z11) || (eVar instanceof androidx.constraintlayout.solver.widgets.m) || eVar.s0() || eVar.u0())) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10 && (hVar = androidx.constraintlayout.solver.g.C) != null) {
            hVar.f2183e++;
        }
        boolean z12 = z10 & ((i8 == 1073741824 && i10 == 1073741824) || b6);
        int i21 = 2;
        if (z12) {
            int min = Math.min(fVar.O(), i9);
            int min2 = Math.min(fVar.N(), i11);
            if (i8 == 1073741824 && fVar.j0() != min) {
                fVar.H1(min);
                fVar.p2();
            }
            if (i10 == 1073741824 && fVar.D() != min2) {
                fVar.d1(min2);
                fVar.p2();
            }
            if (i8 == 1073741824 && i10 == 1073741824) {
                z5 = fVar.f2(b6);
                i14 = 2;
            } else {
                boolean g22 = fVar.g2(b6);
                if (i8 == 1073741824) {
                    g22 &= fVar.h2(b6, 0);
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if (i10 == 1073741824) {
                    z5 = fVar.h2(b6, 1) & g22;
                    i14++;
                } else {
                    z5 = g22;
                }
            }
            if (z5) {
                fVar.M1(i8 == 1073741824, i10 == 1073741824);
            }
        } else {
            z5 = false;
            i14 = 0;
        }
        if (z5 && i14 == 2) {
            return 0L;
        }
        int l22 = fVar.l2();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.f2371a.size();
        if (size > 0) {
            c(fVar, "First pass", j02, D);
        }
        if (size2 > 0) {
            e.b H2 = fVar.H();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z13 = H2 == bVar2;
            boolean z14 = fVar.g0() == bVar2;
            int max = Math.max(fVar.j0(), this.f2373c.Q());
            int max2 = Math.max(fVar.D(), this.f2373c.P());
            int i22 = 0;
            boolean z15 = false;
            while (i22 < size2) {
                androidx.constraintlayout.solver.widgets.e eVar2 = this.f2371a.get(i22);
                if (eVar2 instanceof androidx.constraintlayout.solver.widgets.m) {
                    int j03 = eVar2.j0();
                    i17 = l22;
                    int D2 = eVar2.D();
                    i18 = j02;
                    boolean a6 = a(k22, eVar2, a.f2375l) | z15;
                    androidx.constraintlayout.solver.h hVar2 = fVar.f2568t1;
                    i19 = D;
                    if (hVar2 != null) {
                        hVar2.f2182d++;
                    }
                    int j04 = eVar2.j0();
                    int D3 = eVar2.D();
                    if (j04 != j03) {
                        eVar2.H1(j04);
                        if (z13 && eVar2.X() > max) {
                            max = Math.max(max, eVar2.r(d.b.RIGHT).g() + eVar2.X());
                        }
                        z9 = true;
                    } else {
                        z9 = a6;
                    }
                    if (D3 != D2) {
                        eVar2.d1(D3);
                        if (z14 && eVar2.v() > max2) {
                            max2 = Math.max(max2, eVar2.r(d.b.BOTTOM).g() + eVar2.v());
                        }
                        z9 = true;
                    }
                    z15 = z9 | ((androidx.constraintlayout.solver.widgets.m) eVar2).b2();
                } else {
                    i17 = l22;
                    i18 = j02;
                    i19 = D;
                }
                i22++;
                l22 = i17;
                j02 = i18;
                D = i19;
                i21 = 2;
            }
            int i23 = l22;
            int i24 = j02;
            int i25 = D;
            int i26 = i21;
            int i27 = 0;
            while (i27 < i26) {
                int i28 = 0;
                while (i28 < size2) {
                    androidx.constraintlayout.solver.widgets.e eVar3 = this.f2371a.get(i28);
                    if (((eVar3 instanceof androidx.constraintlayout.solver.widgets.i) && !(eVar3 instanceof androidx.constraintlayout.solver.widgets.m)) || (eVar3 instanceof androidx.constraintlayout.solver.widgets.h) || eVar3.i0() == 8 || ((z12 && eVar3.f2518e.f2453e.f2408j && eVar3.f2520f.f2453e.f2408j) || (eVar3 instanceof androidx.constraintlayout.solver.widgets.m))) {
                        z8 = z12;
                        i16 = size2;
                        interfaceC0021b = k22;
                    } else {
                        int j05 = eVar3.j0();
                        int D4 = eVar3.D();
                        int t5 = eVar3.t();
                        int i29 = a.f2375l;
                        z8 = z12;
                        if (i27 == 1) {
                            i29 = a.f2376m;
                        }
                        boolean a7 = a(k22, eVar3, i29) | z15;
                        androidx.constraintlayout.solver.h hVar3 = fVar.f2568t1;
                        i16 = size2;
                        interfaceC0021b = k22;
                        if (hVar3 != null) {
                            hVar3.f2182d++;
                        }
                        int j06 = eVar3.j0();
                        int D5 = eVar3.D();
                        if (j06 != j05) {
                            eVar3.H1(j06);
                            if (z13 && eVar3.X() > max) {
                                max = Math.max(max, eVar3.r(d.b.RIGHT).g() + eVar3.X());
                            }
                            a7 = true;
                        }
                        if (D5 != D4) {
                            eVar3.d1(D5);
                            if (z14 && eVar3.v() > max2) {
                                max2 = Math.max(max2, eVar3.r(d.b.BOTTOM).g() + eVar3.v());
                            }
                            a7 = true;
                        }
                        z15 = (!eVar3.m0() || t5 == eVar3.t()) ? a7 : true;
                    }
                    i28++;
                    size2 = i16;
                    k22 = interfaceC0021b;
                    z12 = z8;
                }
                boolean z16 = z12;
                int i30 = size2;
                InterfaceC0021b interfaceC0021b2 = k22;
                if (!z15) {
                    break;
                }
                c(fVar, "intermediate pass", i24, i25);
                i27++;
                k22 = interfaceC0021b2;
                z12 = z16;
                i26 = 2;
                z15 = false;
                size2 = i30;
            }
            if (z15) {
                c(fVar, "2nd pass", i24, i25);
                if (fVar.j0() < max) {
                    fVar.H1(max);
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (fVar.D() < max2) {
                    fVar.d1(max2);
                    z7 = true;
                } else {
                    z7 = z6;
                }
                if (z7) {
                    c(fVar, "3rd pass", i24, i25);
                }
            }
            i15 = i23;
        } else {
            i15 = l22;
        }
        fVar.z2(i15);
        return 0L;
    }

    public void e(androidx.constraintlayout.solver.widgets.f fVar) {
        this.f2371a.clear();
        int size = fVar.f2651o1.size();
        for (int i5 = 0; i5 < size; i5++) {
            androidx.constraintlayout.solver.widgets.e eVar = fVar.f2651o1.get(i5);
            e.b H = eVar.H();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (H == bVar || eVar.g0() == bVar) {
                this.f2371a.add(eVar);
            }
        }
        fVar.p2();
    }
}
