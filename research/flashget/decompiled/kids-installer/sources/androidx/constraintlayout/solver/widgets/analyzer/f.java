package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f2389j = true;

    /* renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.solver.widgets.f f2390a;

    /* renamed from: d, reason: collision with root package name */
    private androidx.constraintlayout.solver.widgets.f f2393d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2391b = f2389j;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2392c = f2389j;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<q> f2394e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<n> f2395f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0021b f2396g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f2397h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<n> f2398i = new ArrayList<>();

    public f(androidx.constraintlayout.solver.widgets.f fVar) {
        this.f2390a = fVar;
        this.f2393d = fVar;
    }

    private void a(g gVar, int i5, int i6, g gVar2, ArrayList<n> arrayList, n nVar) {
        q qVar = gVar.f2402d;
        if (qVar.f2451c == null) {
            androidx.constraintlayout.solver.widgets.f fVar = this.f2390a;
            if (qVar == fVar.f2518e || qVar == fVar.f2520f) {
                return;
            }
            if (nVar == null) {
                nVar = new n(qVar, i6);
                arrayList.add(nVar);
            }
            qVar.f2451c = nVar;
            nVar.a(qVar);
            for (d dVar : qVar.f2456h.f2409k) {
                if (dVar instanceof g) {
                    a((g) dVar, i5, 0, gVar2, arrayList, nVar);
                }
            }
            for (d dVar2 : qVar.f2457i.f2409k) {
                if (dVar2 instanceof g) {
                    a((g) dVar2, i5, 1, gVar2, arrayList, nVar);
                }
            }
            if (i5 == 1 && (qVar instanceof o)) {
                for (d dVar3 : ((o) qVar).f2430k.f2409k) {
                    if (dVar3 instanceof g) {
                        a((g) dVar3, i5, 2, gVar2, arrayList, nVar);
                    }
                }
            }
            for (g gVar3 : qVar.f2456h.f2410l) {
                if (gVar3 == gVar2) {
                    nVar.f2424b = f2389j;
                }
                a(gVar3, i5, 0, gVar2, arrayList, nVar);
            }
            for (g gVar4 : qVar.f2457i.f2410l) {
                if (gVar4 == gVar2) {
                    nVar.f2424b = f2389j;
                }
                a(gVar4, i5, 1, gVar2, arrayList, nVar);
            }
            if (i5 == 1 && (qVar instanceof o)) {
                Iterator<g> it = ((o) qVar).f2430k.f2410l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i5, 2, gVar2, arrayList, nVar);
                }
            }
        }
    }

    private boolean b(androidx.constraintlayout.solver.widgets.f fVar) {
        int i5;
        e.b bVar;
        int i6;
        e.b bVar2;
        e.b[] bVarArr;
        e.b bVar3;
        e.b bVar4;
        e.b bVar5;
        e.b bVar6;
        Iterator<androidx.constraintlayout.solver.widgets.e> it = fVar.f2651o1.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.solver.widgets.e next = it.next();
            e.b[] bVarArr2 = next.U;
            e.b bVar7 = bVarArr2[0];
            e.b bVar8 = bVarArr2[1];
            if (next.i0() == 8) {
                next.f2510a = f2389j;
            } else {
                if (next.f2550u < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    next.f2540p = 2;
                }
                if (next.f2556x < 1.0f && bVar8 == e.b.MATCH_CONSTRAINT) {
                    next.f2542q = 2;
                }
                if (next.A() > 0.0f) {
                    e.b bVar9 = e.b.MATCH_CONSTRAINT;
                    if (bVar7 == bVar9 && (bVar8 == e.b.WRAP_CONTENT || bVar8 == e.b.FIXED)) {
                        next.f2540p = 3;
                    } else if (bVar8 == bVar9 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        next.f2542q = 3;
                    } else if (bVar7 == bVar9 && bVar8 == bVar9) {
                        if (next.f2540p == 0) {
                            next.f2540p = 3;
                        }
                        if (next.f2542q == 0) {
                            next.f2542q = 3;
                        }
                    }
                }
                e.b bVar10 = e.b.MATCH_CONSTRAINT;
                if (bVar7 == bVar10 && next.f2540p == 1 && (next.J.f2491f == null || next.L.f2491f == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                e.b bVar11 = bVar7;
                if (bVar8 == bVar10 && next.f2542q == 1 && (next.K.f2491f == null || next.M.f2491f == null)) {
                    bVar8 = e.b.WRAP_CONTENT;
                }
                e.b bVar12 = bVar8;
                m mVar = next.f2518e;
                mVar.f2452d = bVar11;
                int i7 = next.f2540p;
                mVar.f2449a = i7;
                o oVar = next.f2520f;
                oVar.f2452d = bVar12;
                int i8 = next.f2542q;
                oVar.f2449a = i8;
                e.b bVar13 = e.b.MATCH_PARENT;
                if ((bVar11 == bVar13 || bVar11 == e.b.FIXED || bVar11 == e.b.WRAP_CONTENT) && (bVar12 == bVar13 || bVar12 == e.b.FIXED || bVar12 == e.b.WRAP_CONTENT)) {
                    int j02 = next.j0();
                    if (bVar11 == bVar13) {
                        i5 = (fVar.j0() - next.J.f2492g) - next.L.f2492g;
                        bVar = e.b.FIXED;
                    } else {
                        i5 = j02;
                        bVar = bVar11;
                    }
                    int D = next.D();
                    if (bVar12 == bVar13) {
                        i6 = (fVar.D() - next.K.f2492g) - next.M.f2492g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i6 = D;
                        bVar2 = bVar12;
                    }
                    r(next, bVar, i5, bVar2, i6);
                    next.f2518e.f2453e.e(next.j0());
                    next.f2520f.f2453e.e(next.D());
                    next.f2510a = f2389j;
                } else {
                    if (bVar11 == bVar10 && (bVar12 == (bVar6 = e.b.WRAP_CONTENT) || bVar12 == e.b.FIXED)) {
                        if (i7 == 3) {
                            if (bVar12 == bVar6) {
                                r(next, bVar6, 0, bVar6, 0);
                            }
                            int D2 = next.D();
                            int i9 = (int) ((D2 * next.Y) + 0.5f);
                            e.b bVar14 = e.b.FIXED;
                            r(next, bVar14, i9, bVar14, D2);
                            next.f2518e.f2453e.e(next.j0());
                            next.f2520f.f2453e.e(next.D());
                            next.f2510a = f2389j;
                        } else if (i7 == 1) {
                            r(next, bVar6, 0, bVar12, 0);
                            next.f2518e.f2453e.f2411m = next.j0();
                        } else if (i7 == 2) {
                            e.b bVar15 = fVar.U[0];
                            e.b bVar16 = e.b.FIXED;
                            if (bVar15 == bVar16 || bVar15 == bVar13) {
                                r(next, bVar16, (int) ((next.f2550u * fVar.j0()) + 0.5f), bVar12, next.D());
                                next.f2518e.f2453e.e(next.j0());
                                next.f2520f.f2453e.e(next.D());
                                next.f2510a = f2389j;
                            }
                        } else {
                            androidx.constraintlayout.solver.widgets.d[] dVarArr = next.R;
                            if (dVarArr[0].f2491f == null || dVarArr[1].f2491f == null) {
                                r(next, bVar6, 0, bVar12, 0);
                                next.f2518e.f2453e.e(next.j0());
                                next.f2520f.f2453e.e(next.D());
                                next.f2510a = f2389j;
                            }
                        }
                    }
                    if (bVar12 == bVar10 && (bVar11 == (bVar5 = e.b.WRAP_CONTENT) || bVar11 == e.b.FIXED)) {
                        if (i8 == 3) {
                            if (bVar11 == bVar5) {
                                r(next, bVar5, 0, bVar5, 0);
                            }
                            int j03 = next.j0();
                            float f6 = next.Y;
                            if (next.B() == -1) {
                                f6 = 1.0f / f6;
                            }
                            e.b bVar17 = e.b.FIXED;
                            r(next, bVar17, j03, bVar17, (int) ((j03 * f6) + 0.5f));
                            next.f2518e.f2453e.e(next.j0());
                            next.f2520f.f2453e.e(next.D());
                            next.f2510a = f2389j;
                        } else if (i8 == 1) {
                            r(next, bVar11, 0, bVar5, 0);
                            next.f2520f.f2453e.f2411m = next.D();
                        } else if (i8 == 2) {
                            e.b bVar18 = fVar.U[1];
                            e.b bVar19 = e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar13) {
                                r(next, bVar11, next.j0(), bVar19, (int) ((next.f2556x * fVar.D()) + 0.5f));
                                next.f2518e.f2453e.e(next.j0());
                                next.f2520f.f2453e.e(next.D());
                                next.f2510a = f2389j;
                            }
                        } else {
                            androidx.constraintlayout.solver.widgets.d[] dVarArr2 = next.R;
                            if (dVarArr2[2].f2491f == null || dVarArr2[3].f2491f == null) {
                                r(next, bVar5, 0, bVar12, 0);
                                next.f2518e.f2453e.e(next.j0());
                                next.f2520f.f2453e.e(next.D());
                                next.f2510a = f2389j;
                            }
                        }
                    }
                    if (bVar11 == bVar10 && bVar12 == bVar10) {
                        if (i7 == 1 || i8 == 1) {
                            e.b bVar20 = e.b.WRAP_CONTENT;
                            r(next, bVar20, 0, bVar20, 0);
                            next.f2518e.f2453e.f2411m = next.j0();
                            next.f2520f.f2453e.f2411m = next.D();
                        } else if (i8 == 2 && i7 == 2 && ((bVar3 = (bVarArr = fVar.U)[0]) == (bVar4 = e.b.FIXED) || bVar3 == bVar4)) {
                            e.b bVar21 = bVarArr[1];
                            if (bVar21 == bVar4 || bVar21 == bVar4) {
                                r(next, bVar4, (int) ((next.f2550u * fVar.j0()) + 0.5f), bVar4, (int) ((next.f2556x * fVar.D()) + 0.5f));
                                next.f2518e.f2453e.e(next.j0());
                                next.f2520f.f2453e.e(next.D());
                                next.f2510a = f2389j;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(androidx.constraintlayout.solver.widgets.f fVar, int i5) {
        int size = this.f2398i.size();
        long j5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            j5 = Math.max(j5, this.f2398i.get(i6).b(fVar, i5));
        }
        return (int) j5;
    }

    private void j() {
        Iterator<q> it = this.f2394e.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = m(it.next(), str);
        }
        String a6 = androidx.concurrent.futures.b.a(str, "\n}\n");
        System.out.println("content:<<\n" + a6 + "\n>>");
    }

    private void k(q qVar, int i5, ArrayList<n> arrayList) {
        for (d dVar : qVar.f2456h.f2409k) {
            if (dVar instanceof g) {
                a((g) dVar, i5, 0, qVar.f2457i, arrayList, null);
            } else if (dVar instanceof q) {
                a(((q) dVar).f2456h, i5, 0, qVar.f2457i, arrayList, null);
            }
        }
        for (d dVar2 : qVar.f2457i.f2409k) {
            if (dVar2 instanceof g) {
                a((g) dVar2, i5, 1, qVar.f2456h, arrayList, null);
            } else if (dVar2 instanceof q) {
                a(((q) dVar2).f2457i, i5, 1, qVar.f2456h, arrayList, null);
            }
        }
        if (i5 == 1) {
            for (d dVar3 : ((o) qVar).f2430k.f2409k) {
                if (dVar3 instanceof g) {
                    a((g) dVar3, i5, 2, null, arrayList, null);
                }
            }
        }
    }

    private String l(c cVar, String str) {
        int i5 = cVar.f2454f;
        String str2 = "cluster_" + cVar.f2450b.y();
        String a6 = e.a("subgraph ", i5 == 0 ? androidx.concurrent.futures.b.a(str2, "_h") : androidx.concurrent.futures.b.a(str2, "_v"), " {\n");
        Iterator<q> it = cVar.f2387k.iterator();
        String str3 = "";
        while (it.hasNext()) {
            q next = it.next();
            String y5 = next.f2450b.y();
            a6 = a6 + (i5 == 0 ? androidx.concurrent.futures.b.a(y5, "_HORIZONTAL") : androidx.concurrent.futures.b.a(y5, "_VERTICAL")) + ";\n";
            str3 = m(next, str3);
        }
        return str + str3 + androidx.concurrent.futures.b.a(a6, "}\n");
    }

    private String m(q qVar, String str) {
        boolean z5;
        g gVar = qVar.f2456h;
        g gVar2 = qVar.f2457i;
        if (!(qVar instanceof l) && gVar.f2409k.isEmpty() && (gVar2.f2409k.isEmpty() && gVar.f2410l.isEmpty()) && gVar2.f2410l.isEmpty()) {
            return str;
        }
        StringBuilder a6 = r.a(str);
        a6.append(t(qVar));
        String sb = a6.toString();
        boolean q5 = q(gVar, gVar2);
        String n5 = n(gVar2, q5, n(gVar, q5, sb));
        boolean z6 = qVar instanceof o;
        if (z6) {
            n5 = n(((o) qVar).f2430k, q5, n5);
        }
        if ((qVar instanceof m) || (((z5 = qVar instanceof c)) && ((c) qVar).f2454f == 0)) {
            e.b H = qVar.f2450b.H();
            if (H == e.b.FIXED || H == e.b.WRAP_CONTENT) {
                if (!gVar.f2410l.isEmpty() && gVar2.f2410l.isEmpty()) {
                    n5 = androidx.concurrent.futures.b.a(n5, "\n" + gVar2.d() + " -> " + gVar.d() + "\n");
                } else if (gVar.f2410l.isEmpty() && !gVar2.f2410l.isEmpty()) {
                    n5 = androidx.concurrent.futures.b.a(n5, "\n" + gVar.d() + " -> " + gVar2.d() + "\n");
                }
            } else if (H == e.b.MATCH_CONSTRAINT && qVar.f2450b.A() > 0.0f) {
                qVar.f2450b.y();
            }
        } else if (z6 || (z5 && ((c) qVar).f2454f == 1)) {
            e.b g02 = qVar.f2450b.g0();
            if (g02 == e.b.FIXED || g02 == e.b.WRAP_CONTENT) {
                if (!gVar.f2410l.isEmpty() && gVar2.f2410l.isEmpty()) {
                    n5 = androidx.concurrent.futures.b.a(n5, "\n" + gVar2.d() + " -> " + gVar.d() + "\n");
                } else if (gVar.f2410l.isEmpty() && !gVar2.f2410l.isEmpty()) {
                    n5 = androidx.concurrent.futures.b.a(n5, "\n" + gVar.d() + " -> " + gVar2.d() + "\n");
                }
            } else if (g02 == e.b.MATCH_CONSTRAINT && qVar.f2450b.A() > 0.0f) {
                qVar.f2450b.y();
            }
        }
        return qVar instanceof c ? l((c) qVar, n5) : n5;
    }

    private String n(g gVar, boolean z5, String str) {
        for (g gVar2 : gVar.f2410l) {
            StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a("\n" + gVar.d(), " -> ");
            a6.append(gVar2.d());
            String sb = a6.toString();
            if (gVar.f2404f > 0 || z5 || (gVar.f2402d instanceof l)) {
                String a7 = androidx.concurrent.futures.b.a(sb, "[");
                if (gVar.f2404f > 0) {
                    a7 = androidx.constraintlayout.solver.e.a(androidx.constraintlayout.motion.widget.c.a(a7, "label=\""), gVar.f2404f, "\"");
                    if (z5) {
                        a7 = androidx.concurrent.futures.b.a(a7, ",");
                    }
                }
                if (z5) {
                    a7 = androidx.concurrent.futures.b.a(a7, " style=dashed ");
                }
                if (gVar.f2402d instanceof l) {
                    a7 = androidx.concurrent.futures.b.a(a7, " style=bold,color=gray ");
                }
                sb = androidx.concurrent.futures.b.a(a7, "]");
            }
            str = androidx.concurrent.futures.b.a(str, androidx.concurrent.futures.b.a(sb, "\n"));
        }
        return str;
    }

    private boolean q(g gVar, g gVar2) {
        Iterator<g> it = gVar.f2410l.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (it.next() != gVar2) {
                i5++;
            }
        }
        Iterator<g> it2 = gVar2.f2410l.iterator();
        int i6 = 0;
        while (it2.hasNext()) {
            if (it2.next() != gVar) {
                i6++;
            }
        }
        if (i5 <= 0 || i6 <= 0) {
            return false;
        }
        return f2389j;
    }

    private void r(androidx.constraintlayout.solver.widgets.e eVar, e.b bVar, int i5, e.b bVar2, int i6) {
        b.a aVar = this.f2397h;
        aVar.f2377a = bVar;
        aVar.f2378b = bVar2;
        aVar.f2379c = i5;
        aVar.f2380d = i6;
        this.f2396g.b(eVar, aVar);
        eVar.H1(this.f2397h.f2381e);
        eVar.d1(this.f2397h.f2382f);
        eVar.c1(this.f2397h.f2384h);
        eVar.L0(this.f2397h.f2383g);
    }

    private String t(q qVar) {
        String a6;
        String str;
        String a7;
        boolean z5 = qVar instanceof o;
        String y5 = qVar.f2450b.y();
        androidx.constraintlayout.solver.widgets.e eVar = qVar.f2450b;
        e.b H = !z5 ? eVar.H() : eVar.g0();
        n nVar = qVar.f2451c;
        String a8 = androidx.concurrent.futures.b.a(androidx.concurrent.futures.b.a(androidx.concurrent.futures.b.a(!z5 ? androidx.concurrent.futures.b.a(y5, "_HORIZONTAL") : androidx.concurrent.futures.b.a(y5, "_VERTICAL"), " [shape=none, label=<"), "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"), "  <TR>");
        if (z5) {
            String a9 = androidx.concurrent.futures.b.a(a8, "    <TD ");
            if (qVar.f2456h.f2408j) {
                a9 = androidx.concurrent.futures.b.a(a9, " BGCOLOR=\"green\"");
            }
            a6 = androidx.concurrent.futures.b.a(a9, " PORT=\"TOP\" BORDER=\"1\">T</TD>");
        } else {
            String a10 = androidx.concurrent.futures.b.a(a8, "    <TD ");
            if (qVar.f2456h.f2408j) {
                a10 = androidx.concurrent.futures.b.a(a10, " BGCOLOR=\"green\"");
            }
            a6 = androidx.concurrent.futures.b.a(a10, " PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        String a11 = androidx.concurrent.futures.b.a(a6, "    <TD BORDER=\"1\" ");
        boolean z6 = qVar.f2453e.f2408j;
        if (z6 && !qVar.f2450b.f2510a) {
            a11 = androidx.concurrent.futures.b.a(a11, " BGCOLOR=\"green\" ");
        } else if (z6 && qVar.f2450b.f2510a) {
            a11 = androidx.concurrent.futures.b.a(a11, " BGCOLOR=\"lightgray\" ");
        } else if (!z6 && qVar.f2450b.f2510a) {
            a11 = androidx.concurrent.futures.b.a(a11, " BGCOLOR=\"yellow\" ");
        }
        if (H == e.b.MATCH_CONSTRAINT) {
            a11 = androidx.concurrent.futures.b.a(a11, "style=\"dashed\"");
        }
        if (nVar != null) {
            StringBuilder sb = new StringBuilder(" [");
            sb.append(nVar.f2428f + 1);
            sb.append("/");
            str = androidx.constraintlayout.solver.e.a(sb, n.f2422k, "]");
        } else {
            str = "";
        }
        String str2 = a11 + ">" + y5 + str + " </TD>";
        if (z5) {
            String a12 = androidx.concurrent.futures.b.a(str2, "    <TD ");
            if ((qVar instanceof o) && ((o) qVar).f2430k.f2408j) {
                a12 = androidx.concurrent.futures.b.a(a12, " BGCOLOR=\"green\"");
            }
            String a13 = androidx.concurrent.futures.b.a(androidx.concurrent.futures.b.a(a12, " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"), "    <TD ");
            if (qVar.f2457i.f2408j) {
                a13 = androidx.concurrent.futures.b.a(a13, " BGCOLOR=\"green\"");
            }
            a7 = androidx.concurrent.futures.b.a(a13, " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        } else {
            String a14 = androidx.concurrent.futures.b.a(str2, "    <TD ");
            if (qVar.f2457i.f2408j) {
                a14 = androidx.concurrent.futures.b.a(a14, " BGCOLOR=\"green\"");
            }
            a7 = androidx.concurrent.futures.b.a(a14, " PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        return androidx.concurrent.futures.b.a(androidx.concurrent.futures.b.a(a7, "  </TR></TABLE>"), ">];\n");
    }

    public void c() {
        d(this.f2394e);
        this.f2398i.clear();
        n.f2422k = 0;
        k(this.f2390a.f2518e, 0, this.f2398i);
        k(this.f2390a.f2520f, 1, this.f2398i);
        this.f2391b = false;
    }

    public void d(ArrayList<q> arrayList) {
        arrayList.clear();
        this.f2393d.f2518e.f();
        this.f2393d.f2520f.f();
        arrayList.add(this.f2393d.f2518e);
        arrayList.add(this.f2393d.f2520f);
        Iterator<androidx.constraintlayout.solver.widgets.e> it = this.f2393d.f2651o1.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            androidx.constraintlayout.solver.widgets.e next = it.next();
            if (next instanceof androidx.constraintlayout.solver.widgets.h) {
                arrayList.add(new k(next));
            } else {
                if (next.s0()) {
                    if (next.f2514c == null) {
                        next.f2514c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2514c);
                } else {
                    arrayList.add(next.f2518e);
                }
                if (next.u0()) {
                    if (next.f2516d == null) {
                        next.f2516d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2516d);
                } else {
                    arrayList.add(next.f2520f);
                }
                if (next instanceof androidx.constraintlayout.solver.widgets.j) {
                    arrayList.add(new l(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<q> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<q> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            q next2 = it3.next();
            if (next2.f2450b != this.f2393d) {
                next2.d();
            }
        }
    }

    public void f(e.b bVar, e.b bVar2) {
        if (this.f2391b) {
            c();
            Iterator<androidx.constraintlayout.solver.widgets.e> it = this.f2390a.f2651o1.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                androidx.constraintlayout.solver.widgets.e next = it.next();
                boolean[] zArr = next.f2522g;
                zArr[0] = f2389j;
                zArr[1] = f2389j;
                if (next instanceof androidx.constraintlayout.solver.widgets.a) {
                    z5 = true;
                }
            }
            if (z5) {
                return;
            }
            Iterator<n> it2 = this.f2398i.iterator();
            while (it2.hasNext()) {
                n next2 = it2.next();
                e.b bVar3 = e.b.WRAP_CONTENT;
                next2.d(bVar == bVar3, bVar2 == bVar3);
            }
        }
    }

    public boolean g(boolean z5) {
        boolean z6;
        boolean z7 = f2389j;
        boolean z8 = z5 & f2389j;
        if (this.f2391b || this.f2392c) {
            Iterator<androidx.constraintlayout.solver.widgets.e> it = this.f2390a.f2651o1.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.solver.widgets.e next = it.next();
                next.q();
                next.f2510a = false;
                next.f2518e.n();
                next.f2520f.n();
            }
            this.f2390a.q();
            androidx.constraintlayout.solver.widgets.f fVar = this.f2390a;
            fVar.f2510a = false;
            fVar.f2518e.n();
            this.f2390a.f2520f.n();
            this.f2392c = false;
        }
        if (b(this.f2393d)) {
            return false;
        }
        this.f2390a.J1(0);
        this.f2390a.K1(0);
        e.b z9 = this.f2390a.z(0);
        e.b z10 = this.f2390a.z(1);
        if (this.f2391b) {
            c();
        }
        int k02 = this.f2390a.k0();
        int l02 = this.f2390a.l0();
        this.f2390a.f2518e.f2456h.e(k02);
        this.f2390a.f2520f.f2456h.e(l02);
        s();
        e.b bVar = e.b.WRAP_CONTENT;
        if (z9 == bVar || z10 == bVar) {
            if (z8) {
                Iterator<q> it2 = this.f2394e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().p()) {
                        z8 = false;
                        break;
                    }
                }
            }
            if (z8 && z9 == e.b.WRAP_CONTENT) {
                this.f2390a.i1(e.b.FIXED);
                androidx.constraintlayout.solver.widgets.f fVar2 = this.f2390a;
                fVar2.H1(e(fVar2, 0));
                androidx.constraintlayout.solver.widgets.f fVar3 = this.f2390a;
                fVar3.f2518e.f2453e.e(fVar3.j0());
            }
            if (z8 && z10 == e.b.WRAP_CONTENT) {
                this.f2390a.D1(e.b.FIXED);
                androidx.constraintlayout.solver.widgets.f fVar4 = this.f2390a;
                fVar4.d1(e(fVar4, 1));
                androidx.constraintlayout.solver.widgets.f fVar5 = this.f2390a;
                fVar5.f2520f.f2453e.e(fVar5.D());
            }
        }
        androidx.constraintlayout.solver.widgets.f fVar6 = this.f2390a;
        e.b bVar2 = fVar6.U[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int j02 = fVar6.j0() + k02;
            this.f2390a.f2518e.f2457i.e(j02);
            this.f2390a.f2518e.f2453e.e(j02 - k02);
            s();
            androidx.constraintlayout.solver.widgets.f fVar7 = this.f2390a;
            e.b bVar4 = fVar7.U[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int D = fVar7.D() + l02;
                this.f2390a.f2520f.f2457i.e(D);
                this.f2390a.f2520f.f2453e.e(D - l02);
            }
            s();
            z6 = true;
        } else {
            z6 = false;
        }
        Iterator<q> it3 = this.f2394e.iterator();
        while (it3.hasNext()) {
            q next2 = it3.next();
            if (next2.f2450b != this.f2390a || next2.f2455g) {
                next2.e();
            }
        }
        Iterator<q> it4 = this.f2394e.iterator();
        while (it4.hasNext()) {
            q next3 = it4.next();
            if (z6 || next3.f2450b != this.f2390a) {
                if (!next3.f2456h.f2408j || ((!next3.f2457i.f2408j && !(next3 instanceof k)) || (!next3.f2453e.f2408j && !(next3 instanceof c) && !(next3 instanceof k)))) {
                    z7 = false;
                    break;
                }
            }
        }
        this.f2390a.i1(z9);
        this.f2390a.D1(z10);
        return z7;
    }

    public boolean h(boolean z5) {
        if (this.f2391b) {
            Iterator<androidx.constraintlayout.solver.widgets.e> it = this.f2390a.f2651o1.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.solver.widgets.e next = it.next();
                next.q();
                next.f2510a = false;
                m mVar = next.f2518e;
                mVar.f2453e.f2408j = false;
                mVar.f2455g = false;
                mVar.n();
                o oVar = next.f2520f;
                oVar.f2453e.f2408j = false;
                oVar.f2455g = false;
                oVar.n();
            }
            this.f2390a.q();
            androidx.constraintlayout.solver.widgets.f fVar = this.f2390a;
            fVar.f2510a = false;
            m mVar2 = fVar.f2518e;
            mVar2.f2453e.f2408j = false;
            mVar2.f2455g = false;
            mVar2.n();
            o oVar2 = this.f2390a.f2520f;
            oVar2.f2453e.f2408j = false;
            oVar2.f2455g = false;
            oVar2.n();
            c();
        }
        if (b(this.f2393d)) {
            return false;
        }
        this.f2390a.J1(0);
        this.f2390a.K1(0);
        this.f2390a.f2518e.f2456h.e(0);
        this.f2390a.f2520f.f2456h.e(0);
        return f2389j;
    }

    public boolean i(boolean z5, int i5) {
        boolean z6;
        e.b bVar;
        boolean z7 = f2389j;
        boolean z8 = z5 & f2389j;
        e.b z9 = this.f2390a.z(0);
        e.b z10 = this.f2390a.z(1);
        int k02 = this.f2390a.k0();
        int l02 = this.f2390a.l0();
        if (z8 && (z9 == (bVar = e.b.WRAP_CONTENT) || z10 == bVar)) {
            Iterator<q> it = this.f2394e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                q next = it.next();
                if (next.f2454f == i5 && !next.p()) {
                    z8 = false;
                    break;
                }
            }
            if (i5 == 0) {
                if (z8 && z9 == e.b.WRAP_CONTENT) {
                    this.f2390a.i1(e.b.FIXED);
                    androidx.constraintlayout.solver.widgets.f fVar = this.f2390a;
                    fVar.H1(e(fVar, 0));
                    androidx.constraintlayout.solver.widgets.f fVar2 = this.f2390a;
                    fVar2.f2518e.f2453e.e(fVar2.j0());
                }
            } else if (z8 && z10 == e.b.WRAP_CONTENT) {
                this.f2390a.D1(e.b.FIXED);
                androidx.constraintlayout.solver.widgets.f fVar3 = this.f2390a;
                fVar3.d1(e(fVar3, 1));
                androidx.constraintlayout.solver.widgets.f fVar4 = this.f2390a;
                fVar4.f2520f.f2453e.e(fVar4.D());
            }
        }
        if (i5 == 0) {
            androidx.constraintlayout.solver.widgets.f fVar5 = this.f2390a;
            e.b bVar2 = fVar5.U[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int j02 = fVar5.j0() + k02;
                this.f2390a.f2518e.f2457i.e(j02);
                this.f2390a.f2518e.f2453e.e(j02 - k02);
                z6 = true;
            }
            z6 = false;
        } else {
            androidx.constraintlayout.solver.widgets.f fVar6 = this.f2390a;
            e.b bVar3 = fVar6.U[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int D = fVar6.D() + l02;
                this.f2390a.f2520f.f2457i.e(D);
                this.f2390a.f2520f.f2453e.e(D - l02);
                z6 = true;
            }
            z6 = false;
        }
        s();
        Iterator<q> it2 = this.f2394e.iterator();
        while (it2.hasNext()) {
            q next2 = it2.next();
            if (next2.f2454f == i5 && (next2.f2450b != this.f2390a || next2.f2455g)) {
                next2.e();
            }
        }
        Iterator<q> it3 = this.f2394e.iterator();
        while (it3.hasNext()) {
            q next3 = it3.next();
            if (next3.f2454f == i5 && (z6 || next3.f2450b != this.f2390a)) {
                if (!next3.f2456h.f2408j || !next3.f2457i.f2408j || (!(next3 instanceof c) && !next3.f2453e.f2408j)) {
                    z7 = false;
                    break;
                }
            }
        }
        this.f2390a.i1(z9);
        this.f2390a.D1(z10);
        return z7;
    }

    public void o() {
        this.f2391b = f2389j;
    }

    public void p() {
        this.f2392c = f2389j;
    }

    public void s() {
        h hVar;
        Iterator<androidx.constraintlayout.solver.widgets.e> it = this.f2390a.f2651o1.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.solver.widgets.e next = it.next();
            if (!next.f2510a) {
                e.b[] bVarArr = next.U;
                boolean z5 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i5 = next.f2540p;
                int i6 = next.f2542q;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z6 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i5 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i6 == 1)) {
                    z5 = true;
                }
                h hVar2 = next.f2518e.f2453e;
                boolean z7 = hVar2.f2408j;
                h hVar3 = next.f2520f.f2453e;
                boolean z8 = hVar3.f2408j;
                if (z7 && z8) {
                    e.b bVar4 = e.b.FIXED;
                    r(next, bVar4, hVar2.f2405g, bVar4, hVar3.f2405g);
                    next.f2510a = f2389j;
                } else if (z7 && z5) {
                    r(next, e.b.FIXED, hVar2.f2405g, bVar3, hVar3.f2405g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f2520f.f2453e.f2411m = next.D();
                    } else {
                        next.f2520f.f2453e.e(next.D());
                        next.f2510a = f2389j;
                    }
                } else if (z8 && z6) {
                    r(next, bVar3, hVar2.f2405g, e.b.FIXED, hVar3.f2405g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f2518e.f2453e.f2411m = next.j0();
                    } else {
                        next.f2518e.f2453e.e(next.j0());
                        next.f2510a = f2389j;
                    }
                }
                if (next.f2510a && (hVar = next.f2520f.f2431l) != null) {
                    hVar.e(next.t());
                }
            }
        }
    }

    public void u(b.InterfaceC0021b interfaceC0021b) {
        this.f2396g = interfaceC0021b;
    }
}
