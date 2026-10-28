package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f22820a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f22821b = false;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f22823d = true;

    /* renamed from: c, reason: collision with root package name */
    private static b.a f22822c = new b.a();

    /* renamed from: e, reason: collision with root package name */
    private static int f22824e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f22825f = 0;

    private static boolean a(int i4, androidx.constraintlayout.core.widgets.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b H = eVar.H();
        e.b j02 = eVar.j0();
        androidx.constraintlayout.core.widgets.f fVar = eVar.U() != null ? (androidx.constraintlayout.core.widgets.f) eVar.U() : null;
        if (fVar != null) {
            fVar.H();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.j0();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z4 = H == bVar5 || eVar.G0() || H == e.b.WRAP_CONTENT || (H == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f22977w == 0 && eVar.f22944f0 == 0.0f && eVar.r0(0)) || (H == bVar2 && eVar.f22977w == 1 && eVar.u0(0, eVar.m0()));
        boolean z5 = j02 == bVar5 || eVar.H0() || j02 == e.b.WRAP_CONTENT || (j02 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f22979x == 0 && eVar.f22944f0 == 0.0f && eVar.r0(1)) || (j02 == bVar && eVar.f22979x == 1 && eVar.u0(1, eVar.D()));
        if (eVar.f22944f0 <= 0.0f || !(z4 || z5)) {
            return z4 && z5;
        }
        return true;
    }

    private static void b(int i4, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0389b interfaceC0389b, boolean z4) {
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.d dVar2;
        androidx.constraintlayout.core.widgets.d dVar3;
        androidx.constraintlayout.core.widgets.d dVar4;
        if (eVar.z0()) {
            return;
        }
        boolean z5 = true;
        f22824e++;
        if (!(eVar instanceof androidx.constraintlayout.core.widgets.f) && eVar.F0()) {
            int i5 = i4 + 1;
            if (a(i5, eVar)) {
                androidx.constraintlayout.core.widgets.f.R2(i5, eVar, interfaceC0389b, new b.a(), b.a.f22782k);
            }
        }
        androidx.constraintlayout.core.widgets.d r4 = eVar.r(d.b.LEFT);
        androidx.constraintlayout.core.widgets.d r5 = eVar.r(d.b.RIGHT);
        int f4 = r4.f();
        int f5 = r5.f();
        if (r4.e() != null && r4.o()) {
            Iterator<androidx.constraintlayout.core.widgets.d> it = r4.e().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.d next = it.next();
                androidx.constraintlayout.core.widgets.e eVar2 = next.f22900d;
                int i6 = i4 + 1;
                boolean a5 = a(i6, eVar2);
                if (eVar2.F0() && a5) {
                    androidx.constraintlayout.core.widgets.f.R2(i6, eVar2, interfaceC0389b, new b.a(), b.a.f22782k);
                }
                boolean z6 = ((next == eVar2.Q && (dVar4 = eVar2.S.f22902f) != null && dVar4.o()) || (next == eVar2.S && (dVar3 = eVar2.Q.f22902f) != null && dVar3.o())) ? z5 : false;
                e.b H = eVar2.H();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (H != bVar || a5) {
                    if (!eVar2.F0()) {
                        androidx.constraintlayout.core.widgets.d dVar5 = eVar2.Q;
                        if (next == dVar5 && eVar2.S.f22902f == null) {
                            int g4 = dVar5.g() + f4;
                            eVar2.q1(g4, eVar2.m0() + g4);
                            b(i6, eVar2, interfaceC0389b, z4);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar6 = eVar2.S;
                            if (next == dVar6 && dVar5.f22902f == null) {
                                int g5 = f4 - dVar6.g();
                                eVar2.q1(g5 - eVar2.m0(), g5);
                                b(i6, eVar2, interfaceC0389b, z4);
                            } else if (z6 && !eVar2.B0()) {
                                f(i6, interfaceC0389b, eVar2, z4);
                            }
                        }
                    }
                } else if (eVar2.H() == bVar && eVar2.A >= 0 && eVar2.f22983z >= 0 && ((eVar2.l0() == 8 || (eVar2.f22977w == 0 && eVar2.A() == 0.0f)) && !eVar2.B0() && !eVar2.E0() && z6 && !eVar2.B0())) {
                    g(i6, eVar, interfaceC0389b, eVar2, z4);
                }
                z5 = true;
            }
        }
        if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        if (r5.e() != null && r5.o()) {
            Iterator<androidx.constraintlayout.core.widgets.d> it2 = r5.e().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.d next2 = it2.next();
                androidx.constraintlayout.core.widgets.e eVar3 = next2.f22900d;
                int i7 = i4 + 1;
                boolean a6 = a(i7, eVar3);
                if (eVar3.F0() && a6) {
                    androidx.constraintlayout.core.widgets.f.R2(i7, eVar3, interfaceC0389b, new b.a(), b.a.f22782k);
                }
                boolean z7 = (next2 == eVar3.Q && (dVar2 = eVar3.S.f22902f) != null && dVar2.o()) || (next2 == eVar3.S && (dVar = eVar3.Q.f22902f) != null && dVar.o());
                e.b H2 = eVar3.H();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (H2 != bVar2 || a6) {
                    if (!eVar3.F0()) {
                        androidx.constraintlayout.core.widgets.d dVar7 = eVar3.Q;
                        if (next2 == dVar7 && eVar3.S.f22902f == null) {
                            int g6 = dVar7.g() + f5;
                            eVar3.q1(g6, eVar3.m0() + g6);
                            b(i7, eVar3, interfaceC0389b, z4);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar8 = eVar3.S;
                            if (next2 == dVar8 && dVar7.f22902f == null) {
                                int g7 = f5 - dVar8.g();
                                eVar3.q1(g7 - eVar3.m0(), g7);
                                b(i7, eVar3, interfaceC0389b, z4);
                            } else if (z7 && !eVar3.B0()) {
                                f(i7, interfaceC0389b, eVar3, z4);
                            }
                        }
                    }
                } else if (eVar3.H() == bVar2 && eVar3.A >= 0 && eVar3.f22983z >= 0 && (eVar3.l0() == 8 || (eVar3.f22977w == 0 && eVar3.A() == 0.0f))) {
                    if (!eVar3.B0() && !eVar3.E0() && z7 && !eVar3.B0()) {
                        g(i7, eVar, interfaceC0389b, eVar3, z4);
                    }
                }
            }
        }
        eVar.N0();
    }

    public static String c(int i4) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append("  ");
        }
        sb.append("+-(" + i4 + ") ");
        return sb.toString();
    }

    private static void d(int i4, androidx.constraintlayout.core.widgets.a aVar, b.InterfaceC0389b interfaceC0389b, int i5, boolean z4) {
        if (aVar.m2()) {
            if (i5 == 0) {
                b(i4 + 1, aVar, interfaceC0389b, z4);
            } else {
                k(i4 + 1, aVar, interfaceC0389b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d7, code lost:
    
        if (r6.f22900d == r0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0151  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(androidx.constraintlayout.core.widgets.f r20, androidx.constraintlayout.core.f r21, int r22, int r23, androidx.constraintlayout.core.widgets.c r24, boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.h.e(androidx.constraintlayout.core.widgets.f, androidx.constraintlayout.core.f, int, int, androidx.constraintlayout.core.widgets.c, boolean, boolean, boolean):boolean");
    }

    private static void f(int i4, b.InterfaceC0389b interfaceC0389b, androidx.constraintlayout.core.widgets.e eVar, boolean z4) {
        float E = eVar.E();
        int f4 = eVar.Q.f22902f.f();
        int f5 = eVar.S.f22902f.f();
        int g4 = eVar.Q.g() + f4;
        int g5 = f5 - eVar.S.g();
        if (f4 == f5) {
            E = 0.5f;
        } else {
            f4 = g4;
            f5 = g5;
        }
        int m02 = eVar.m0();
        int i5 = (f5 - f4) - m02;
        if (f4 > f5) {
            i5 = (f4 - f5) - m02;
        }
        int i6 = ((int) (i5 > 0 ? (E * i5) + 0.5f : E * i5)) + f4;
        int i7 = i6 + m02;
        if (f4 > f5) {
            i7 = i6 - m02;
        }
        eVar.q1(i6, i7);
        b(i4 + 1, eVar, interfaceC0389b, z4);
    }

    private static void g(int i4, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0389b interfaceC0389b, androidx.constraintlayout.core.widgets.e eVar2, boolean z4) {
        float E = eVar2.E();
        int g4 = eVar2.Q.g() + eVar2.Q.f22902f.f();
        int f4 = eVar2.S.f22902f.f() - eVar2.S.g();
        if (f4 >= g4) {
            int m02 = eVar2.m0();
            if (eVar2.l0() != 8) {
                int i5 = eVar2.f22977w;
                if (i5 == 2) {
                    m02 = (int) (eVar2.E() * 0.5f * (eVar instanceof androidx.constraintlayout.core.widgets.f ? eVar.m0() : eVar.U().m0()));
                } else if (i5 == 0) {
                    m02 = f4 - g4;
                }
                m02 = Math.max(eVar2.f22983z, m02);
                int i6 = eVar2.A;
                if (i6 > 0) {
                    m02 = Math.min(i6, m02);
                }
            }
            int i7 = g4 + ((int) ((E * ((f4 - g4) - m02)) + 0.5f));
            eVar2.q1(i7, m02 + i7);
            b(i4 + 1, eVar2, interfaceC0389b, z4);
        }
    }

    private static void h(int i4, b.InterfaceC0389b interfaceC0389b, androidx.constraintlayout.core.widgets.e eVar) {
        float g02 = eVar.g0();
        int f4 = eVar.R.f22902f.f();
        int f5 = eVar.T.f22902f.f();
        int g4 = eVar.R.g() + f4;
        int g5 = f5 - eVar.T.g();
        if (f4 == f5) {
            g02 = 0.5f;
        } else {
            f4 = g4;
            f5 = g5;
        }
        int D = eVar.D();
        int i5 = (f5 - f4) - D;
        if (f4 > f5) {
            i5 = (f4 - f5) - D;
        }
        int i6 = (int) (i5 > 0 ? (g02 * i5) + 0.5f : g02 * i5);
        int i7 = f4 + i6;
        int i10 = i7 + D;
        if (f4 > f5) {
            i7 = f4 - i6;
            i10 = i7 - D;
        }
        eVar.t1(i7, i10);
        k(i4 + 1, eVar, interfaceC0389b);
    }

    private static void i(int i4, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0389b interfaceC0389b, androidx.constraintlayout.core.widgets.e eVar2) {
        float g02 = eVar2.g0();
        int g4 = eVar2.R.g() + eVar2.R.f22902f.f();
        int f4 = eVar2.T.f22902f.f() - eVar2.T.g();
        if (f4 >= g4) {
            int D = eVar2.D();
            if (eVar2.l0() != 8) {
                int i5 = eVar2.f22979x;
                if (i5 == 2) {
                    D = (int) (g02 * 0.5f * (eVar instanceof androidx.constraintlayout.core.widgets.f ? eVar.D() : eVar.U().D()));
                } else if (i5 == 0) {
                    D = f4 - g4;
                }
                D = Math.max(eVar2.C, D);
                int i6 = eVar2.D;
                if (i6 > 0) {
                    D = Math.min(i6, D);
                }
            }
            int i7 = g4 + ((int) ((g02 * ((f4 - g4) - D)) + 0.5f));
            eVar2.t1(i7, D + i7);
            k(i4 + 1, eVar2, interfaceC0389b);
        }
    }

    public static void j(androidx.constraintlayout.core.widgets.f fVar, b.InterfaceC0389b interfaceC0389b) {
        e.b H = fVar.H();
        e.b j02 = fVar.j0();
        f22824e = 0;
        f22825f = 0;
        fVar.V0();
        ArrayList<androidx.constraintlayout.core.widgets.e> l22 = fVar.l2();
        int size = l22.size();
        for (int i4 = 0; i4 < size; i4++) {
            l22.get(i4).V0();
        }
        boolean O2 = fVar.O2();
        if (H == e.b.FIXED) {
            fVar.q1(0, fVar.m0());
        } else {
            fVar.r1(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            androidx.constraintlayout.core.widgets.e eVar = l22.get(i5);
            if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar;
                if (hVar.m2() == 1) {
                    if (hVar.n2() != -1) {
                        hVar.v2(hVar.n2());
                    } else if (hVar.p2() != -1 && fVar.G0()) {
                        hVar.v2(fVar.m0() - hVar.p2());
                    } else if (fVar.G0()) {
                        hVar.v2((int) ((hVar.q2() * fVar.m0()) + 0.5f));
                    }
                    z4 = true;
                }
            } else if ((eVar instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) eVar).r2() == 0) {
                z5 = true;
            }
        }
        if (z4) {
            for (int i6 = 0; i6 < size; i6++) {
                androidx.constraintlayout.core.widgets.e eVar2 = l22.get(i6);
                if (eVar2 instanceof androidx.constraintlayout.core.widgets.h) {
                    androidx.constraintlayout.core.widgets.h hVar2 = (androidx.constraintlayout.core.widgets.h) eVar2;
                    if (hVar2.m2() == 1) {
                        b(0, hVar2, interfaceC0389b, O2);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0389b, O2);
        if (z5) {
            for (int i7 = 0; i7 < size; i7++) {
                androidx.constraintlayout.core.widgets.e eVar3 = l22.get(i7);
                if (eVar3 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) eVar3;
                    if (aVar.r2() == 0) {
                        d(0, aVar, interfaceC0389b, 0, O2);
                    }
                }
            }
        }
        if (j02 == e.b.FIXED) {
            fVar.t1(0, fVar.D());
        } else {
            fVar.s1(0);
        }
        boolean z6 = false;
        boolean z7 = false;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.constraintlayout.core.widgets.e eVar4 = l22.get(i10);
            if (eVar4 instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar3 = (androidx.constraintlayout.core.widgets.h) eVar4;
                if (hVar3.m2() == 0) {
                    if (hVar3.n2() != -1) {
                        hVar3.v2(hVar3.n2());
                    } else if (hVar3.p2() != -1 && fVar.H0()) {
                        hVar3.v2(fVar.D() - hVar3.p2());
                    } else if (fVar.H0()) {
                        hVar3.v2((int) ((hVar3.q2() * fVar.D()) + 0.5f));
                    }
                    z6 = true;
                }
            } else if ((eVar4 instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) eVar4).r2() == 1) {
                z7 = true;
            }
        }
        if (z6) {
            for (int i11 = 0; i11 < size; i11++) {
                androidx.constraintlayout.core.widgets.e eVar5 = l22.get(i11);
                if (eVar5 instanceof androidx.constraintlayout.core.widgets.h) {
                    androidx.constraintlayout.core.widgets.h hVar4 = (androidx.constraintlayout.core.widgets.h) eVar5;
                    if (hVar4.m2() == 0) {
                        k(1, hVar4, interfaceC0389b);
                    }
                }
            }
        }
        k(0, fVar, interfaceC0389b);
        if (z7) {
            for (int i12 = 0; i12 < size; i12++) {
                androidx.constraintlayout.core.widgets.e eVar6 = l22.get(i12);
                if (eVar6 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) eVar6;
                    if (aVar2.r2() == 1) {
                        d(0, aVar2, interfaceC0389b, 1, O2);
                    }
                }
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            androidx.constraintlayout.core.widgets.e eVar7 = l22.get(i13);
            if (eVar7.F0() && a(0, eVar7)) {
                androidx.constraintlayout.core.widgets.f.R2(0, eVar7, interfaceC0389b, f22822c, b.a.f22782k);
                if (!(eVar7 instanceof androidx.constraintlayout.core.widgets.h)) {
                    b(0, eVar7, interfaceC0389b, O2);
                    k(0, eVar7, interfaceC0389b);
                } else if (((androidx.constraintlayout.core.widgets.h) eVar7).m2() == 0) {
                    k(0, eVar7, interfaceC0389b);
                } else {
                    b(0, eVar7, interfaceC0389b, O2);
                }
            }
        }
    }

    private static void k(int i4, androidx.constraintlayout.core.widgets.e eVar, b.InterfaceC0389b interfaceC0389b) {
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.d dVar2;
        androidx.constraintlayout.core.widgets.d dVar3;
        androidx.constraintlayout.core.widgets.d dVar4;
        if (eVar.L0()) {
            return;
        }
        f22825f++;
        if (!(eVar instanceof androidx.constraintlayout.core.widgets.f) && eVar.F0()) {
            int i5 = i4 + 1;
            if (a(i5, eVar)) {
                androidx.constraintlayout.core.widgets.f.R2(i5, eVar, interfaceC0389b, new b.a(), b.a.f22782k);
            }
        }
        androidx.constraintlayout.core.widgets.d r4 = eVar.r(d.b.TOP);
        androidx.constraintlayout.core.widgets.d r5 = eVar.r(d.b.BOTTOM);
        int f4 = r4.f();
        int f5 = r5.f();
        if (r4.e() != null && r4.o()) {
            Iterator<androidx.constraintlayout.core.widgets.d> it = r4.e().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.d next = it.next();
                androidx.constraintlayout.core.widgets.e eVar2 = next.f22900d;
                int i6 = i4 + 1;
                boolean a5 = a(i6, eVar2);
                if (eVar2.F0() && a5) {
                    androidx.constraintlayout.core.widgets.f.R2(i6, eVar2, interfaceC0389b, new b.a(), b.a.f22782k);
                }
                boolean z4 = (next == eVar2.R && (dVar4 = eVar2.T.f22902f) != null && dVar4.o()) || (next == eVar2.T && (dVar3 = eVar2.R.f22902f) != null && dVar3.o());
                e.b j02 = eVar2.j0();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (j02 != bVar || a5) {
                    if (!eVar2.F0()) {
                        androidx.constraintlayout.core.widgets.d dVar5 = eVar2.R;
                        if (next == dVar5 && eVar2.T.f22902f == null) {
                            int g4 = dVar5.g() + f4;
                            eVar2.t1(g4, eVar2.D() + g4);
                            k(i6, eVar2, interfaceC0389b);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar6 = eVar2.T;
                            if (next == dVar6 && dVar5.f22902f == null) {
                                int g5 = f4 - dVar6.g();
                                eVar2.t1(g5 - eVar2.D(), g5);
                                k(i6, eVar2, interfaceC0389b);
                            } else if (z4 && !eVar2.D0()) {
                                h(i6, interfaceC0389b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.j0() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && (eVar2.l0() == 8 || (eVar2.f22979x == 0 && eVar2.A() == 0.0f))) {
                    if (!eVar2.D0() && !eVar2.E0() && z4 && !eVar2.D0()) {
                        i(i6, eVar, interfaceC0389b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        if (r5.e() != null && r5.o()) {
            Iterator<androidx.constraintlayout.core.widgets.d> it2 = r5.e().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.d next2 = it2.next();
                androidx.constraintlayout.core.widgets.e eVar3 = next2.f22900d;
                int i7 = i4 + 1;
                boolean a6 = a(i7, eVar3);
                if (eVar3.F0() && a6) {
                    androidx.constraintlayout.core.widgets.f.R2(i7, eVar3, interfaceC0389b, new b.a(), b.a.f22782k);
                }
                boolean z5 = (next2 == eVar3.R && (dVar2 = eVar3.T.f22902f) != null && dVar2.o()) || (next2 == eVar3.T && (dVar = eVar3.R.f22902f) != null && dVar.o());
                e.b j03 = eVar3.j0();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (j03 != bVar2 || a6) {
                    if (!eVar3.F0()) {
                        androidx.constraintlayout.core.widgets.d dVar7 = eVar3.R;
                        if (next2 == dVar7 && eVar3.T.f22902f == null) {
                            int g6 = dVar7.g() + f5;
                            eVar3.t1(g6, eVar3.D() + g6);
                            k(i7, eVar3, interfaceC0389b);
                        } else {
                            androidx.constraintlayout.core.widgets.d dVar8 = eVar3.T;
                            if (next2 == dVar8 && dVar7.f22902f == null) {
                                int g7 = f5 - dVar8.g();
                                eVar3.t1(g7 - eVar3.D(), g7);
                                k(i7, eVar3, interfaceC0389b);
                            } else if (z5 && !eVar3.D0()) {
                                h(i7, interfaceC0389b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.j0() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.l0() == 8 || (eVar3.f22979x == 0 && eVar3.A() == 0.0f))) {
                    if (!eVar3.D0() && !eVar3.E0() && z5 && !eVar3.D0()) {
                        i(i7, eVar, interfaceC0389b, eVar3);
                    }
                }
            }
        }
        androidx.constraintlayout.core.widgets.d r6 = eVar.r(d.b.BASELINE);
        if (r6.e() != null && r6.o()) {
            int f6 = r6.f();
            Iterator<androidx.constraintlayout.core.widgets.d> it3 = r6.e().iterator();
            while (it3.hasNext()) {
                androidx.constraintlayout.core.widgets.d next3 = it3.next();
                androidx.constraintlayout.core.widgets.e eVar4 = next3.f22900d;
                int i10 = i4 + 1;
                boolean a7 = a(i10, eVar4);
                if (eVar4.F0() && a7) {
                    androidx.constraintlayout.core.widgets.f.R2(i10, eVar4, interfaceC0389b, new b.a(), b.a.f22782k);
                }
                if (eVar4.j0() != e.b.MATCH_CONSTRAINT || a7) {
                    if (!eVar4.F0() && next3 == eVar4.U) {
                        eVar4.o1(next3.g() + f6);
                        k(i10, eVar4, interfaceC0389b);
                    }
                }
            }
        }
        eVar.O0();
    }
}
