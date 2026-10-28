package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.e;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f2412a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f2413b = false;

    /* renamed from: c, reason: collision with root package name */
    private static b.a f2414c = new b.a();

    private static boolean a(androidx.constraintlayout.solver.widgets.e eVar) {
        e.b H = eVar.H();
        e.b g02 = eVar.g0();
        androidx.constraintlayout.solver.widgets.f fVar = eVar.U() != null ? (androidx.constraintlayout.solver.widgets.f) eVar.U() : null;
        if (fVar != null) {
            fVar.H();
            e.b bVar = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.g0();
            e.b bVar2 = e.b.FIXED;
        }
        e.b bVar3 = e.b.FIXED;
        boolean z5 = H == bVar3 || H == e.b.WRAP_CONTENT || (H == e.b.MATCH_CONSTRAINT && eVar.f2540p == 0 && eVar.Y == 0.0f && eVar.n0(0)) || eVar.x0();
        boolean z6 = g02 == bVar3 || g02 == e.b.WRAP_CONTENT || (g02 == e.b.MATCH_CONSTRAINT && eVar.f2542q == 0 && eVar.Y == 0.0f && eVar.n0(1)) || eVar.y0();
        if (eVar.Y <= 0.0f || !(z5 || z6)) {
            return z5 && z6;
        }
        return true;
    }

    private static void b(androidx.constraintlayout.solver.widgets.e eVar, b.InterfaceC0021b interfaceC0021b, boolean z5) {
        androidx.constraintlayout.solver.widgets.d dVar;
        androidx.constraintlayout.solver.widgets.d dVar2;
        androidx.constraintlayout.solver.widgets.d dVar3;
        androidx.constraintlayout.solver.widgets.d dVar4;
        androidx.constraintlayout.solver.widgets.d dVar5;
        if (!(eVar instanceof androidx.constraintlayout.solver.widgets.f) && eVar.w0() && a(eVar)) {
            androidx.constraintlayout.solver.widgets.f.v2(eVar, interfaceC0021b, new b.a(), b.a.f2374k);
        }
        androidx.constraintlayout.solver.widgets.d r5 = eVar.r(d.b.LEFT);
        androidx.constraintlayout.solver.widgets.d r6 = eVar.r(d.b.RIGHT);
        int f6 = r5.f();
        int f7 = r6.f();
        if (r5.e() != null && r5.o()) {
            Iterator<androidx.constraintlayout.solver.widgets.d> it = r5.e().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.solver.widgets.d next = it.next();
                androidx.constraintlayout.solver.widgets.e eVar2 = next.f2489d;
                boolean a6 = a(eVar2);
                if (eVar2.w0() && a6) {
                    androidx.constraintlayout.solver.widgets.f.v2(eVar2, interfaceC0021b, new b.a(), b.a.f2374k);
                }
                e.b H = eVar2.H();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (H != bVar || a6) {
                    if (!eVar2.w0()) {
                        androidx.constraintlayout.solver.widgets.d dVar6 = eVar2.J;
                        if (next == dVar6 && eVar2.L.f2491f == null) {
                            int g5 = dVar6.g() + f6;
                            eVar2.V0(g5, eVar2.j0() + g5);
                            b(eVar2, interfaceC0021b, z5);
                        } else {
                            androidx.constraintlayout.solver.widgets.d dVar7 = eVar2.L;
                            if (next == dVar7 && dVar6.f2491f == null) {
                                int g6 = f6 - dVar7.g();
                                eVar2.V0(g6 - eVar2.j0(), g6);
                                b(eVar2, interfaceC0021b, z5);
                            } else if (next == dVar6 && (dVar3 = dVar7.f2491f) != null && dVar3.o() && !eVar2.s0()) {
                                e(interfaceC0021b, eVar2, z5);
                            }
                        }
                    }
                } else if (eVar2.H() == bVar && eVar2.f2548t >= 0 && eVar2.f2546s >= 0 && (eVar2.i0() == 8 || (eVar2.f2540p == 0 && eVar2.A() == 0.0f))) {
                    if (!eVar2.s0() && !eVar2.v0()) {
                        if (((next == eVar2.J && (dVar5 = eVar2.L.f2491f) != null && dVar5.o()) || (next == eVar2.L && (dVar4 = eVar2.J.f2491f) != null && dVar4.o())) && !eVar2.s0()) {
                            f(eVar, interfaceC0021b, eVar2, z5);
                        }
                    }
                }
            }
        }
        if ((eVar instanceof androidx.constraintlayout.solver.widgets.h) || r6.e() == null || !r6.o()) {
            return;
        }
        Iterator<androidx.constraintlayout.solver.widgets.d> it2 = r6.e().iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.solver.widgets.d next2 = it2.next();
            androidx.constraintlayout.solver.widgets.e eVar3 = next2.f2489d;
            boolean a7 = a(eVar3);
            if (eVar3.w0() && a7) {
                androidx.constraintlayout.solver.widgets.f.v2(eVar3, interfaceC0021b, new b.a(), b.a.f2374k);
            }
            boolean z6 = (next2 == eVar3.J && (dVar2 = eVar3.L.f2491f) != null && dVar2.o()) || (next2 == eVar3.L && (dVar = eVar3.J.f2491f) != null && dVar.o());
            e.b H2 = eVar3.H();
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (H2 != bVar2 || a7) {
                if (!eVar3.w0()) {
                    androidx.constraintlayout.solver.widgets.d dVar8 = eVar3.J;
                    if (next2 == dVar8 && eVar3.L.f2491f == null) {
                        int g7 = dVar8.g() + f7;
                        eVar3.V0(g7, eVar3.j0() + g7);
                        b(eVar3, interfaceC0021b, z5);
                    } else {
                        androidx.constraintlayout.solver.widgets.d dVar9 = eVar3.L;
                        if (next2 == dVar9 && dVar8.f2491f == null) {
                            int g8 = f7 - dVar9.g();
                            eVar3.V0(g8 - eVar3.j0(), g8);
                            b(eVar3, interfaceC0021b, z5);
                        } else if (z6 && !eVar3.s0()) {
                            e(interfaceC0021b, eVar3, z5);
                        }
                    }
                }
            } else if (eVar3.H() == bVar2 && eVar3.f2548t >= 0 && eVar3.f2546s >= 0 && (eVar3.i0() == 8 || (eVar3.f2540p == 0 && eVar3.A() == 0.0f))) {
                if (!eVar3.s0() && !eVar3.v0() && z6 && !eVar3.s0()) {
                    f(eVar, interfaceC0021b, eVar3, z5);
                }
            }
        }
    }

    private static void c(androidx.constraintlayout.solver.widgets.a aVar, b.InterfaceC0021b interfaceC0021b, int i5, boolean z5) {
        if (aVar.Q1()) {
            if (i5 == 0) {
                b(aVar, interfaceC0021b, z5);
            } else {
                j(aVar, interfaceC0021b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d0, code lost:
    
        if (r6.f2489d == r2) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(androidx.constraintlayout.solver.widgets.f r18, androidx.constraintlayout.solver.g r19, int r20, int r21, androidx.constraintlayout.solver.widgets.c r22, boolean r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.i.d(androidx.constraintlayout.solver.widgets.f, androidx.constraintlayout.solver.g, int, int, androidx.constraintlayout.solver.widgets.c, boolean, boolean, boolean):boolean");
    }

    private static void e(b.InterfaceC0021b interfaceC0021b, androidx.constraintlayout.solver.widgets.e eVar, boolean z5) {
        float E = eVar.E();
        int f6 = eVar.J.f2491f.f();
        int f7 = eVar.L.f2491f.f();
        int g5 = eVar.J.g() + f6;
        int g6 = f7 - eVar.L.g();
        if (f6 == f7) {
            E = 0.5f;
        } else {
            f6 = g5;
            f7 = g6;
        }
        int j02 = eVar.j0();
        int i5 = (f7 - f6) - j02;
        if (f6 > f7) {
            i5 = (f6 - f7) - j02;
        }
        int i6 = ((int) ((E * i5) + 0.5f)) + f6;
        int i7 = i6 + j02;
        if (f6 > f7) {
            i7 = i6 - j02;
        }
        eVar.V0(i6, i7);
        b(eVar, interfaceC0021b, z5);
    }

    private static void f(androidx.constraintlayout.solver.widgets.e eVar, b.InterfaceC0021b interfaceC0021b, androidx.constraintlayout.solver.widgets.e eVar2, boolean z5) {
        float E = eVar2.E();
        int g5 = eVar2.J.g() + eVar2.J.f2491f.f();
        int f6 = eVar2.L.f2491f.f() - eVar2.L.g();
        if (f6 >= g5) {
            int j02 = eVar2.j0();
            if (eVar2.i0() != 8) {
                int i5 = eVar2.f2540p;
                if (i5 == 2) {
                    j02 = (int) (eVar2.E() * 0.5f * (eVar instanceof androidx.constraintlayout.solver.widgets.f ? eVar.j0() : eVar.U().j0()));
                } else if (i5 == 0) {
                    j02 = f6 - g5;
                }
                j02 = Math.max(eVar2.f2546s, j02);
                int i6 = eVar2.f2548t;
                if (i6 > 0) {
                    j02 = Math.min(i6, j02);
                }
            }
            int i7 = g5 + ((int) ((E * ((f6 - g5) - j02)) + 0.5f));
            eVar2.V0(i7, j02 + i7);
            b(eVar2, interfaceC0021b, z5);
        }
    }

    private static void g(b.InterfaceC0021b interfaceC0021b, androidx.constraintlayout.solver.widgets.e eVar) {
        float d02 = eVar.d0();
        int f6 = eVar.K.f2491f.f();
        int f7 = eVar.M.f2491f.f();
        int g5 = eVar.K.g() + f6;
        int g6 = f7 - eVar.M.g();
        if (f6 == f7) {
            d02 = 0.5f;
        } else {
            f6 = g5;
            f7 = g6;
        }
        int D = eVar.D();
        int i5 = (f7 - f6) - D;
        if (f6 > f7) {
            i5 = (f6 - f7) - D;
        }
        int i6 = (int) ((d02 * i5) + 0.5f);
        int i7 = f6 + i6;
        int i8 = i7 + D;
        if (f6 > f7) {
            i7 = f6 - i6;
            i8 = i7 - D;
        }
        eVar.Y0(i7, i8);
        j(eVar, interfaceC0021b);
    }

    private static void h(androidx.constraintlayout.solver.widgets.e eVar, b.InterfaceC0021b interfaceC0021b, androidx.constraintlayout.solver.widgets.e eVar2) {
        float d02 = eVar2.d0();
        int g5 = eVar2.K.g() + eVar2.K.f2491f.f();
        int f6 = eVar2.M.f2491f.f() - eVar2.M.g();
        if (f6 >= g5) {
            int D = eVar2.D();
            if (eVar2.i0() != 8) {
                int i5 = eVar2.f2542q;
                if (i5 == 2) {
                    D = (int) (d02 * 0.5f * (eVar instanceof androidx.constraintlayout.solver.widgets.f ? eVar.D() : eVar.U().D()));
                } else if (i5 == 0) {
                    D = f6 - g5;
                }
                D = Math.max(eVar2.f2552v, D);
                int i6 = eVar2.f2554w;
                if (i6 > 0) {
                    D = Math.min(i6, D);
                }
            }
            int i7 = g5 + ((int) ((d02 * ((f6 - g5) - D)) + 0.5f));
            eVar2.Y0(i7, D + i7);
            j(eVar2, interfaceC0021b);
        }
    }

    public static void i(androidx.constraintlayout.solver.widgets.f fVar, b.InterfaceC0021b interfaceC0021b) {
        e.b H = fVar.H();
        e.b g02 = fVar.g0();
        fVar.J0();
        ArrayList<androidx.constraintlayout.solver.widgets.e> P1 = fVar.P1();
        int size = P1.size();
        for (int i5 = 0; i5 < size; i5++) {
            P1.get(i5).J0();
        }
        boolean s22 = fVar.s2();
        if (H == e.b.FIXED) {
            fVar.V0(0, fVar.j0());
        } else {
            fVar.W0(0);
        }
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            androidx.constraintlayout.solver.widgets.e eVar = P1.get(i6);
            if (eVar instanceof androidx.constraintlayout.solver.widgets.h) {
                androidx.constraintlayout.solver.widgets.h hVar = (androidx.constraintlayout.solver.widgets.h) eVar;
                if (hVar.Q1() == 1) {
                    if (hVar.R1() != -1) {
                        hVar.Z1(hVar.R1());
                    } else if (hVar.T1() != -1 && fVar.x0()) {
                        hVar.Z1(fVar.j0() - hVar.T1());
                    } else if (fVar.x0()) {
                        hVar.Z1((int) ((hVar.U1() * fVar.j0()) + 0.5f));
                    }
                    z5 = true;
                }
            } else if ((eVar instanceof androidx.constraintlayout.solver.widgets.a) && ((androidx.constraintlayout.solver.widgets.a) eVar).U1() == 0) {
                z6 = true;
            }
        }
        if (z5) {
            for (int i7 = 0; i7 < size; i7++) {
                androidx.constraintlayout.solver.widgets.e eVar2 = P1.get(i7);
                if (eVar2 instanceof androidx.constraintlayout.solver.widgets.h) {
                    androidx.constraintlayout.solver.widgets.h hVar2 = (androidx.constraintlayout.solver.widgets.h) eVar2;
                    if (hVar2.Q1() == 1) {
                        b(hVar2, interfaceC0021b, s22);
                    }
                }
            }
        }
        b(fVar, interfaceC0021b, s22);
        if (z6) {
            for (int i8 = 0; i8 < size; i8++) {
                androidx.constraintlayout.solver.widgets.e eVar3 = P1.get(i8);
                if (eVar3 instanceof androidx.constraintlayout.solver.widgets.a) {
                    androidx.constraintlayout.solver.widgets.a aVar = (androidx.constraintlayout.solver.widgets.a) eVar3;
                    if (aVar.U1() == 0) {
                        c(aVar, interfaceC0021b, 0, s22);
                    }
                }
            }
        }
        if (g02 == e.b.FIXED) {
            fVar.Y0(0, fVar.D());
        } else {
            fVar.X0(0);
        }
        boolean z7 = false;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            androidx.constraintlayout.solver.widgets.e eVar4 = P1.get(i9);
            if (eVar4 instanceof androidx.constraintlayout.solver.widgets.h) {
                androidx.constraintlayout.solver.widgets.h hVar3 = (androidx.constraintlayout.solver.widgets.h) eVar4;
                if (hVar3.Q1() == 0) {
                    if (hVar3.R1() != -1) {
                        hVar3.Z1(hVar3.R1());
                    } else if (hVar3.T1() != -1 && fVar.y0()) {
                        hVar3.Z1(fVar.D() - hVar3.T1());
                    } else if (fVar.y0()) {
                        hVar3.Z1((int) ((hVar3.U1() * fVar.D()) + 0.5f));
                    }
                    z7 = true;
                }
            } else if ((eVar4 instanceof androidx.constraintlayout.solver.widgets.a) && ((androidx.constraintlayout.solver.widgets.a) eVar4).U1() == 1) {
                z8 = true;
            }
        }
        if (z7) {
            for (int i10 = 0; i10 < size; i10++) {
                androidx.constraintlayout.solver.widgets.e eVar5 = P1.get(i10);
                if (eVar5 instanceof androidx.constraintlayout.solver.widgets.h) {
                    androidx.constraintlayout.solver.widgets.h hVar4 = (androidx.constraintlayout.solver.widgets.h) eVar5;
                    if (hVar4.Q1() == 0) {
                        j(hVar4, interfaceC0021b);
                    }
                }
            }
        }
        j(fVar, interfaceC0021b);
        if (z8) {
            for (int i11 = 0; i11 < size; i11++) {
                androidx.constraintlayout.solver.widgets.e eVar6 = P1.get(i11);
                if (eVar6 instanceof androidx.constraintlayout.solver.widgets.a) {
                    androidx.constraintlayout.solver.widgets.a aVar2 = (androidx.constraintlayout.solver.widgets.a) eVar6;
                    if (aVar2.U1() == 1) {
                        c(aVar2, interfaceC0021b, 1, s22);
                    }
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            androidx.constraintlayout.solver.widgets.e eVar7 = P1.get(i12);
            if (eVar7.w0() && a(eVar7)) {
                androidx.constraintlayout.solver.widgets.f.v2(eVar7, interfaceC0021b, f2414c, b.a.f2374k);
                b(eVar7, interfaceC0021b, s22);
                j(eVar7, interfaceC0021b);
            }
        }
    }

    private static void j(androidx.constraintlayout.solver.widgets.e eVar, b.InterfaceC0021b interfaceC0021b) {
        androidx.constraintlayout.solver.widgets.d dVar;
        androidx.constraintlayout.solver.widgets.d dVar2;
        androidx.constraintlayout.solver.widgets.d dVar3;
        androidx.constraintlayout.solver.widgets.d dVar4;
        androidx.constraintlayout.solver.widgets.d dVar5;
        if (!(eVar instanceof androidx.constraintlayout.solver.widgets.f) && eVar.w0() && a(eVar)) {
            androidx.constraintlayout.solver.widgets.f.v2(eVar, interfaceC0021b, new b.a(), b.a.f2374k);
        }
        androidx.constraintlayout.solver.widgets.d r5 = eVar.r(d.b.TOP);
        androidx.constraintlayout.solver.widgets.d r6 = eVar.r(d.b.BOTTOM);
        int f6 = r5.f();
        int f7 = r6.f();
        if (r5.e() != null && r5.o()) {
            Iterator<androidx.constraintlayout.solver.widgets.d> it = r5.e().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.solver.widgets.d next = it.next();
                androidx.constraintlayout.solver.widgets.e eVar2 = next.f2489d;
                boolean a6 = a(eVar2);
                if (eVar2.w0() && a6) {
                    androidx.constraintlayout.solver.widgets.f.v2(eVar2, interfaceC0021b, new b.a(), b.a.f2374k);
                }
                e.b g02 = eVar2.g0();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (g02 != bVar || a6) {
                    if (!eVar2.w0()) {
                        androidx.constraintlayout.solver.widgets.d dVar6 = eVar2.K;
                        if (next == dVar6 && eVar2.M.f2491f == null) {
                            int g5 = dVar6.g() + f6;
                            eVar2.Y0(g5, eVar2.D() + g5);
                            j(eVar2, interfaceC0021b);
                        } else {
                            androidx.constraintlayout.solver.widgets.d dVar7 = eVar2.M;
                            if (next == dVar7 && dVar7.f2491f == null) {
                                int g6 = f6 - dVar7.g();
                                eVar2.Y0(g6 - eVar2.D(), g6);
                                j(eVar2, interfaceC0021b);
                            } else if (next == dVar6 && (dVar3 = dVar7.f2491f) != null && dVar3.o()) {
                                g(interfaceC0021b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.g0() == bVar && eVar2.f2554w >= 0 && eVar2.f2552v >= 0 && (eVar2.i0() == 8 || (eVar2.f2542q == 0 && eVar2.A() == 0.0f))) {
                    if (!eVar2.u0() && !eVar2.v0()) {
                        if (((next == eVar2.K && (dVar5 = eVar2.M.f2491f) != null && dVar5.o()) || (next == eVar2.M && (dVar4 = eVar2.K.f2491f) != null && dVar4.o())) && !eVar2.u0()) {
                            h(eVar, interfaceC0021b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof androidx.constraintlayout.solver.widgets.h) {
            return;
        }
        if (r6.e() != null && r6.o()) {
            Iterator<androidx.constraintlayout.solver.widgets.d> it2 = r6.e().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.solver.widgets.d next2 = it2.next();
                androidx.constraintlayout.solver.widgets.e eVar3 = next2.f2489d;
                boolean a7 = a(eVar3);
                if (eVar3.w0() && a7) {
                    androidx.constraintlayout.solver.widgets.f.v2(eVar3, interfaceC0021b, new b.a(), b.a.f2374k);
                }
                boolean z5 = (next2 == eVar3.K && (dVar2 = eVar3.M.f2491f) != null && dVar2.o()) || (next2 == eVar3.M && (dVar = eVar3.K.f2491f) != null && dVar.o());
                e.b g03 = eVar3.g0();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (g03 != bVar2 || a7) {
                    if (!eVar3.w0()) {
                        androidx.constraintlayout.solver.widgets.d dVar8 = eVar3.K;
                        if (next2 == dVar8 && eVar3.M.f2491f == null) {
                            int g7 = dVar8.g() + f7;
                            eVar3.Y0(g7, eVar3.D() + g7);
                            j(eVar3, interfaceC0021b);
                        } else {
                            androidx.constraintlayout.solver.widgets.d dVar9 = eVar3.M;
                            if (next2 == dVar9 && dVar8.f2491f == null) {
                                int g8 = f7 - dVar9.g();
                                eVar3.Y0(g8 - eVar3.D(), g8);
                                j(eVar3, interfaceC0021b);
                            } else if (z5 && !eVar3.u0()) {
                                g(interfaceC0021b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.g0() == bVar2 && eVar3.f2554w >= 0 && eVar3.f2552v >= 0 && (eVar3.i0() == 8 || (eVar3.f2542q == 0 && eVar3.A() == 0.0f))) {
                    if (!eVar3.u0() && !eVar3.v0() && z5 && !eVar3.u0()) {
                        h(eVar, interfaceC0021b, eVar3);
                    }
                }
            }
        }
        androidx.constraintlayout.solver.widgets.d r7 = eVar.r(d.b.BASELINE);
        if (r7.e() == null || !r7.o()) {
            return;
        }
        int f8 = r7.f();
        Iterator<androidx.constraintlayout.solver.widgets.d> it3 = r7.e().iterator();
        while (it3.hasNext()) {
            androidx.constraintlayout.solver.widgets.d next3 = it3.next();
            androidx.constraintlayout.solver.widgets.e eVar4 = next3.f2489d;
            boolean a8 = a(eVar4);
            if (eVar4.w0() && a8) {
                androidx.constraintlayout.solver.widgets.f.v2(eVar4, interfaceC0021b, new b.a(), b.a.f2374k);
            }
            if (eVar4.g0() != e.b.MATCH_CONSTRAINT || a8) {
                if (!eVar4.w0() && next3 == eVar4.N) {
                    eVar4.T0(f8);
                    j(eVar4, interfaceC0021b);
                }
            }
        }
    }
}
