package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f22797j = true;

    /* renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.f f22798a;

    /* renamed from: d, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.f f22801d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22799b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22800c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<p> f22802e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<m> f22803f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0389b f22804g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f22805h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<m> f22806i = new ArrayList<>();

    public e(androidx.constraintlayout.core.widgets.f fVar) {
        this.f22798a = fVar;
        this.f22801d = fVar;
    }

    private void a(f fVar, int i4, int i5, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f22810d;
        if (pVar.f22862c == null) {
            androidx.constraintlayout.core.widgets.f fVar3 = this.f22798a;
            if (pVar == fVar3.f22941e || pVar == fVar3.f22943f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i5);
                arrayList.add(mVar);
            }
            pVar.f22862c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f22867h.f22817k) {
                if (dVar instanceof f) {
                    a((f) dVar, i4, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f22868i.f22817k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i4, 1, fVar2, arrayList, mVar);
                }
            }
            if (i4 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f22841k.f22817k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i4, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f22867h.f22818l) {
                if (fVar4 == fVar2) {
                    mVar.f22835b = true;
                }
                a(fVar4, i4, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f22868i.f22818l) {
                if (fVar5 == fVar2) {
                    mVar.f22835b = true;
                }
                a(fVar5, i4, 1, fVar2, arrayList, mVar);
            }
            if (i4 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f22841k.f22818l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i4, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(androidx.constraintlayout.core.widgets.f fVar) {
        int i4;
        e.b bVar;
        int i5;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator<androidx.constraintlayout.core.widgets.e> it = fVar.A1.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e next = it.next();
            e.b[] bVarArr = next.f22936b0;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (next.l0() == 8) {
                next.f22933a = true;
            } else {
                if (next.B < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.f22977w = 2;
                }
                if (next.E < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.f22979x = 2;
                }
                if (next.A() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        next.f22977w = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.f22979x = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f22977w == 0) {
                            next.f22977w = 3;
                        }
                        if (next.f22979x == 0) {
                            next.f22979x = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f22977w == 1 && (next.Q.f22902f == null || next.S.f22902f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f22979x == 1 && (next.R.f22902f == null || next.T.f22902f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = next.f22941e;
                lVar.f22863d = bVar9;
                int i6 = next.f22977w;
                lVar.f22860a = i6;
                n nVar = next.f22943f;
                nVar.f22863d = bVar10;
                int i7 = next.f22979x;
                nVar.f22860a = i7;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int m02 = next.m0();
                    if (bVar9 == bVar11) {
                        i4 = (fVar.m0() - next.Q.f22903g) - next.S.f22903g;
                        bVar = e.b.FIXED;
                    } else {
                        i4 = m02;
                        bVar = bVar9;
                    }
                    int D = next.D();
                    if (bVar10 == bVar11) {
                        i5 = (fVar.D() - next.R.f22903g) - next.T.f22903g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i5 = D;
                        bVar2 = bVar10;
                    }
                    r(next, bVar, i4, bVar2, i5);
                    next.f22941e.f22864e.e(next.m0());
                    next.f22943f.f22864e.e(next.D());
                    next.f22933a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i6 == 3) {
                            if (bVar10 == bVar4) {
                                r(next, bVar4, 0, bVar4, 0);
                            }
                            int D2 = next.D();
                            int i10 = (int) ((D2 * next.f22944f0) + 0.5f);
                            e.b bVar12 = e.b.FIXED;
                            r(next, bVar12, i10, bVar12, D2);
                            next.f22941e.f22864e.e(next.m0());
                            next.f22943f.f22864e.e(next.D());
                            next.f22933a = true;
                        } else if (i6 == 1) {
                            r(next, bVar4, 0, bVar10, 0);
                            next.f22941e.f22864e.f22819m = next.m0();
                        } else if (i6 == 2) {
                            e.b bVar13 = fVar.f22936b0[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                r(next, bVar14, (int) ((next.B * fVar.m0()) + 0.5f), bVar10, next.D());
                                next.f22941e.f22864e.e(next.m0());
                                next.f22943f.f22864e.e(next.D());
                                next.f22933a = true;
                            }
                        } else {
                            androidx.constraintlayout.core.widgets.d[] dVarArr = next.Y;
                            if (dVarArr[0].f22902f == null || dVarArr[1].f22902f == null) {
                                r(next, bVar4, 0, bVar10, 0);
                                next.f22941e.f22864e.e(next.m0());
                                next.f22943f.f22864e.e(next.D());
                                next.f22933a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i7 == 3) {
                            if (bVar9 == bVar3) {
                                r(next, bVar3, 0, bVar3, 0);
                            }
                            int m03 = next.m0();
                            float f4 = next.f22944f0;
                            if (next.B() == -1) {
                                f4 = 1.0f / f4;
                            }
                            e.b bVar15 = e.b.FIXED;
                            r(next, bVar15, m03, bVar15, (int) ((m03 * f4) + 0.5f));
                            next.f22941e.f22864e.e(next.m0());
                            next.f22943f.f22864e.e(next.D());
                            next.f22933a = true;
                        } else if (i7 == 1) {
                            r(next, bVar9, 0, bVar3, 0);
                            next.f22943f.f22864e.f22819m = next.D();
                        } else if (i7 == 2) {
                            e.b bVar16 = fVar.f22936b0[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                r(next, bVar9, next.m0(), bVar17, (int) ((next.E * fVar.D()) + 0.5f));
                                next.f22941e.f22864e.e(next.m0());
                                next.f22943f.f22864e.e(next.D());
                                next.f22933a = true;
                            }
                        } else {
                            androidx.constraintlayout.core.widgets.d[] dVarArr2 = next.Y;
                            if (dVarArr2[2].f22902f == null || dVarArr2[3].f22902f == null) {
                                r(next, bVar3, 0, bVar10, 0);
                                next.f22941e.f22864e.e(next.m0());
                                next.f22943f.f22864e.e(next.D());
                                next.f22933a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i6 == 1 || i7 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            r(next, bVar18, 0, bVar18, 0);
                            next.f22941e.f22864e.f22819m = next.m0();
                            next.f22943f.f22864e.f22819m = next.D();
                        } else if (i7 == 2 && i6 == 2) {
                            e.b[] bVarArr2 = fVar.f22936b0;
                            e.b bVar19 = bVarArr2[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr2[1] == bVar20) {
                                r(next, bVar20, (int) ((next.B * fVar.m0()) + 0.5f), bVar20, (int) ((next.E * fVar.D()) + 0.5f));
                                next.f22941e.f22864e.e(next.m0());
                                next.f22943f.f22864e.e(next.D());
                                next.f22933a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(androidx.constraintlayout.core.widgets.f fVar, int i4) {
        int size = this.f22806i.size();
        long j4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j4 = Math.max(j4, this.f22806i.get(i5).b(fVar, i4));
        }
        return (int) j4;
    }

    private void j() {
        Iterator<p> it = this.f22802e.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = m(it.next(), str);
        }
        String a5 = androidx.compose.runtime.changelist.j.a(str, "\n}\n");
        System.out.println("content:<<\n" + a5 + "\n>>");
    }

    private void k(p pVar, int i4, ArrayList<m> arrayList) {
        for (d dVar : pVar.f22867h.f22817k) {
            if (dVar instanceof f) {
                a((f) dVar, i4, 0, pVar.f22868i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f22867h, i4, 0, pVar.f22868i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f22868i.f22817k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i4, 1, pVar.f22867h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f22868i, i4, 1, pVar.f22867h, arrayList, null);
            }
        }
        if (i4 == 1) {
            for (d dVar3 : ((n) pVar).f22841k.f22817k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i4, 2, null, arrayList, null);
                }
            }
        }
    }

    private String l(c cVar, String str) {
        int i4 = cVar.f22865f;
        StringBuilder sb = new StringBuilder("subgraph cluster_");
        sb.append(cVar.f22861b.y());
        if (i4 == 0) {
            sb.append("_h");
        } else {
            sb.append("_v");
        }
        sb.append(" {\n");
        Iterator<p> it = cVar.f22795k.iterator();
        String str2 = "";
        while (it.hasNext()) {
            p next = it.next();
            sb.append(next.f22861b.y());
            if (i4 == 0) {
                sb.append("_HORIZONTAL");
            } else {
                sb.append("_VERTICAL");
            }
            sb.append(";\n");
            str2 = m(next, str2);
        }
        sb.append("}\n");
        return str + str2 + ((Object) sb);
    }

    private String m(p pVar, String str) {
        boolean z4;
        f fVar = pVar.f22867h;
        f fVar2 = pVar.f22868i;
        StringBuilder sb = new StringBuilder(str);
        if (!(pVar instanceof k) && fVar.f22817k.isEmpty() && (fVar2.f22817k.isEmpty() && fVar.f22818l.isEmpty()) && fVar2.f22818l.isEmpty()) {
            return str;
        }
        sb.append(t(pVar));
        boolean q4 = q(fVar, fVar2);
        String n4 = n(fVar2, q4, n(fVar, q4, str));
        boolean z5 = pVar instanceof n;
        if (z5) {
            n4 = n(((n) pVar).f22841k, q4, n4);
        }
        if ((pVar instanceof l) || (((z4 = pVar instanceof c)) && ((c) pVar).f22865f == 0)) {
            e.b H = pVar.f22861b.H();
            if (H == e.b.FIXED || H == e.b.WRAP_CONTENT) {
                if (!fVar.f22818l.isEmpty() && fVar2.f22818l.isEmpty()) {
                    sb.append("\n");
                    sb.append(fVar2.d());
                    sb.append(" -> ");
                    sb.append(fVar.d());
                    sb.append("\n");
                } else if (fVar.f22818l.isEmpty() && !fVar2.f22818l.isEmpty()) {
                    sb.append("\n");
                    sb.append(fVar.d());
                    sb.append(" -> ");
                    sb.append(fVar2.d());
                    sb.append("\n");
                }
            } else if (H == e.b.MATCH_CONSTRAINT && pVar.f22861b.A() > 0.0f) {
                sb.append("\n");
                sb.append(pVar.f22861b.y());
                sb.append("_HORIZONTAL -> ");
                sb.append(pVar.f22861b.y());
                sb.append("_VERTICAL;\n");
            }
        } else if (z5 || (z4 && ((c) pVar).f22865f == 1)) {
            e.b j02 = pVar.f22861b.j0();
            if (j02 == e.b.FIXED || j02 == e.b.WRAP_CONTENT) {
                if (!fVar.f22818l.isEmpty() && fVar2.f22818l.isEmpty()) {
                    sb.append("\n");
                    sb.append(fVar2.d());
                    sb.append(" -> ");
                    sb.append(fVar.d());
                    sb.append("\n");
                } else if (fVar.f22818l.isEmpty() && !fVar2.f22818l.isEmpty()) {
                    sb.append("\n");
                    sb.append(fVar.d());
                    sb.append(" -> ");
                    sb.append(fVar2.d());
                    sb.append("\n");
                }
            } else if (j02 == e.b.MATCH_CONSTRAINT && pVar.f22861b.A() > 0.0f) {
                sb.append("\n");
                sb.append(pVar.f22861b.y());
                sb.append("_VERTICAL -> ");
                sb.append(pVar.f22861b.y());
                sb.append("_HORIZONTAL;\n");
            }
        }
        return pVar instanceof c ? l((c) pVar, n4) : sb.toString();
    }

    private String n(f fVar, boolean z4, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (f fVar2 : fVar.f22818l) {
            StringBuilder a5 = androidx.constraintlayout.core.e.a("\n" + fVar.d(), " -> ");
            a5.append(fVar2.d());
            String sb2 = a5.toString();
            if (fVar.f22812f > 0 || z4 || (fVar.f22810d instanceof k)) {
                String a6 = androidx.compose.runtime.changelist.j.a(sb2, "[");
                if (fVar.f22812f > 0) {
                    a6 = android.support.v4.media.b.a(androidx.constraintlayout.core.e.a(a6, "label=\""), fVar.f22812f, "\"");
                    if (z4) {
                        a6 = androidx.compose.runtime.changelist.j.a(a6, ",");
                    }
                }
                if (z4) {
                    a6 = androidx.compose.runtime.changelist.j.a(a6, " style=dashed ");
                }
                if (fVar.f22810d instanceof k) {
                    a6 = androidx.compose.runtime.changelist.j.a(a6, " style=bold,color=gray ");
                }
                sb2 = androidx.compose.runtime.changelist.j.a(a6, "]");
            }
            sb.append(sb2 + "\n");
        }
        return sb.toString();
    }

    private boolean q(f fVar, f fVar2) {
        Iterator<f> it = fVar.f22818l.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (it.next() != fVar2) {
                i4++;
            }
        }
        Iterator<f> it2 = fVar2.f22818l.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            if (it2.next() != fVar) {
                i5++;
            }
        }
        return i4 > 0 && i5 > 0;
    }

    private void r(androidx.constraintlayout.core.widgets.e eVar, e.b bVar, int i4, e.b bVar2, int i5) {
        b.a aVar = this.f22805h;
        aVar.f22785a = bVar;
        aVar.f22786b = bVar2;
        aVar.f22787c = i4;
        aVar.f22788d = i5;
        this.f22804g.b(eVar, aVar);
        eVar.c2(this.f22805h.f22789e);
        eVar.y1(this.f22805h.f22790f);
        eVar.x1(this.f22805h.f22792h);
        eVar.g1(this.f22805h.f22791g);
    }

    private String t(p pVar) {
        boolean z4 = pVar instanceof n;
        String y4 = pVar.f22861b.y();
        StringBuilder sb = new StringBuilder(y4);
        androidx.constraintlayout.core.widgets.e eVar = pVar.f22861b;
        e.b H = !z4 ? eVar.H() : eVar.j0();
        m mVar = pVar.f22862c;
        if (z4) {
            sb.append("_VERTICAL");
        } else {
            sb.append("_HORIZONTAL");
        }
        sb.append(" [shape=none, label=<<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">  <TR>");
        if (z4) {
            sb.append("    <TD ");
            if (pVar.f22867h.f22816j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        } else {
            sb.append("    <TD ");
            if (pVar.f22867h.f22816j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        sb.append("    <TD BORDER=\"1\" ");
        boolean z5 = pVar.f22864e.f22816j;
        if (z5 && !pVar.f22861b.f22933a) {
            sb.append(" BGCOLOR=\"green\" ");
        } else if (z5) {
            sb.append(" BGCOLOR=\"lightgray\" ");
        } else if (pVar.f22861b.f22933a) {
            sb.append(" BGCOLOR=\"yellow\" ");
        }
        if (H == e.b.MATCH_CONSTRAINT) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(y4);
        if (mVar != null) {
            sb.append(" [");
            sb.append(mVar.f22839f + 1);
            sb.append("/");
            sb.append(m.f22833k);
            sb.append("]");
        }
        sb.append(" </TD>");
        if (z4) {
            sb.append("    <TD ");
            if (((n) pVar).f22841k.f22816j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>    <TD ");
            if (pVar.f22868i.f22816j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        } else {
            sb.append("    <TD ");
            if (pVar.f22868i.f22816j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        sb.append("  </TR></TABLE>>];\n");
        return sb.toString();
    }

    public void c() {
        d(this.f22802e);
        this.f22806i.clear();
        m.f22833k = 0;
        k(this.f22798a.f22941e, 0, this.f22806i);
        k(this.f22798a.f22943f, 1, this.f22806i);
        this.f22799b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f22801d.f22941e.f();
        this.f22801d.f22943f.f();
        arrayList.add(this.f22801d.f22941e);
        arrayList.add(this.f22801d.f22943f);
        Iterator<androidx.constraintlayout.core.widgets.e> it = this.f22801d.A1.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e next = it.next();
            if (next instanceof androidx.constraintlayout.core.widgets.h) {
                arrayList.add(new j(next));
            } else {
                if (next.B0()) {
                    if (next.f22937c == null) {
                        next.f22937c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f22937c);
                } else {
                    arrayList.add(next.f22941e);
                }
                if (next.D0()) {
                    if (next.f22939d == null) {
                        next.f22939d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f22939d);
                } else {
                    arrayList.add(next.f22943f);
                }
                if (next instanceof androidx.constraintlayout.core.widgets.j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f22861b != this.f22801d) {
                next2.d();
            }
        }
    }

    public void f(e.b bVar, e.b bVar2) {
        if (this.f22799b) {
            c();
            Iterator<androidx.constraintlayout.core.widgets.e> it = this.f22798a.A1.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.e next = it.next();
                boolean[] zArr = next.f22945g;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof androidx.constraintlayout.core.widgets.a) {
                    z4 = true;
                }
            }
            if (z4) {
                return;
            }
            Iterator<m> it2 = this.f22806i.iterator();
            while (it2.hasNext()) {
                m next2 = it2.next();
                e.b bVar3 = e.b.WRAP_CONTENT;
                next2.d(bVar == bVar3, bVar2 == bVar3);
            }
        }
    }

    public boolean g(boolean z4) {
        boolean z5;
        boolean z6 = false;
        if (this.f22799b || this.f22800c) {
            Iterator<androidx.constraintlayout.core.widgets.e> it = this.f22798a.A1.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.e next = it.next();
                next.q();
                next.f22933a = false;
                next.f22941e.n();
                next.f22943f.n();
            }
            this.f22798a.q();
            androidx.constraintlayout.core.widgets.f fVar = this.f22798a;
            fVar.f22933a = false;
            fVar.f22941e.n();
            this.f22798a.f22943f.n();
            this.f22800c = false;
        }
        if (b(this.f22801d)) {
            return false;
        }
        this.f22798a.f2(0);
        this.f22798a.g2(0);
        e.b z7 = this.f22798a.z(0);
        e.b z10 = this.f22798a.z(1);
        if (this.f22799b) {
            c();
        }
        int o02 = this.f22798a.o0();
        int p02 = this.f22798a.p0();
        this.f22798a.f22941e.f22867h.e(o02);
        this.f22798a.f22943f.f22867h.e(p02);
        s();
        e.b bVar = e.b.WRAP_CONTENT;
        if (z7 == bVar || z10 == bVar) {
            if (z4) {
                Iterator<p> it2 = this.f22802e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().p()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && z7 == e.b.WRAP_CONTENT) {
                this.f22798a.D1(e.b.FIXED);
                androidx.constraintlayout.core.widgets.f fVar2 = this.f22798a;
                fVar2.c2(e(fVar2, 0));
                androidx.constraintlayout.core.widgets.f fVar3 = this.f22798a;
                fVar3.f22941e.f22864e.e(fVar3.m0());
            }
            if (z4 && z10 == e.b.WRAP_CONTENT) {
                this.f22798a.Y1(e.b.FIXED);
                androidx.constraintlayout.core.widgets.f fVar4 = this.f22798a;
                fVar4.y1(e(fVar4, 1));
                androidx.constraintlayout.core.widgets.f fVar5 = this.f22798a;
                fVar5.f22943f.f22864e.e(fVar5.D());
            }
        }
        androidx.constraintlayout.core.widgets.f fVar6 = this.f22798a;
        e.b bVar2 = fVar6.f22936b0[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int m02 = fVar6.m0() + o02;
            this.f22798a.f22941e.f22868i.e(m02);
            this.f22798a.f22941e.f22864e.e(m02 - o02);
            s();
            androidx.constraintlayout.core.widgets.f fVar7 = this.f22798a;
            e.b bVar4 = fVar7.f22936b0[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int D = fVar7.D() + p02;
                this.f22798a.f22943f.f22868i.e(D);
                this.f22798a.f22943f.f22864e.e(D - p02);
            }
            s();
            z5 = true;
        } else {
            z5 = false;
        }
        Iterator<p> it3 = this.f22802e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f22861b != this.f22798a || next2.f22866g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f22802e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z6 = true;
                break;
            }
            p next3 = it4.next();
            if (z5 || next3.f22861b != this.f22798a) {
                if (!next3.f22867h.f22816j) {
                    break;
                }
                if (!next3.f22868i.f22816j) {
                    if (!(next3 instanceof j)) {
                        break;
                    }
                }
                if (!next3.f22864e.f22816j && !(next3 instanceof c) && !(next3 instanceof j)) {
                    break;
                }
            }
        }
        this.f22798a.D1(z7);
        this.f22798a.Y1(z10);
        return z6;
    }

    public boolean h(boolean z4) {
        if (this.f22799b) {
            Iterator<androidx.constraintlayout.core.widgets.e> it = this.f22798a.A1.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.e next = it.next();
                next.q();
                next.f22933a = false;
                l lVar = next.f22941e;
                lVar.f22864e.f22816j = false;
                lVar.f22866g = false;
                lVar.n();
                n nVar = next.f22943f;
                nVar.f22864e.f22816j = false;
                nVar.f22866g = false;
                nVar.n();
            }
            this.f22798a.q();
            androidx.constraintlayout.core.widgets.f fVar = this.f22798a;
            fVar.f22933a = false;
            l lVar2 = fVar.f22941e;
            lVar2.f22864e.f22816j = false;
            lVar2.f22866g = false;
            lVar2.n();
            n nVar2 = this.f22798a.f22943f;
            nVar2.f22864e.f22816j = false;
            nVar2.f22866g = false;
            nVar2.n();
            c();
        }
        if (b(this.f22801d)) {
            return false;
        }
        this.f22798a.f2(0);
        this.f22798a.g2(0);
        this.f22798a.f22941e.f22867h.e(0);
        this.f22798a.f22943f.f22867h.e(0);
        return true;
    }

    public boolean i(boolean z4, int i4) {
        boolean z5;
        e.b bVar;
        boolean z6 = false;
        e.b z7 = this.f22798a.z(0);
        e.b z10 = this.f22798a.z(1);
        int o02 = this.f22798a.o0();
        int p02 = this.f22798a.p0();
        if (z4 && (z7 == (bVar = e.b.WRAP_CONTENT) || z10 == bVar)) {
            Iterator<p> it = this.f22802e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f22865f == i4 && !next.p()) {
                    z4 = false;
                    break;
                }
            }
            if (i4 == 0) {
                if (z4 && z7 == e.b.WRAP_CONTENT) {
                    this.f22798a.D1(e.b.FIXED);
                    androidx.constraintlayout.core.widgets.f fVar = this.f22798a;
                    fVar.c2(e(fVar, 0));
                    androidx.constraintlayout.core.widgets.f fVar2 = this.f22798a;
                    fVar2.f22941e.f22864e.e(fVar2.m0());
                }
            } else if (z4 && z10 == e.b.WRAP_CONTENT) {
                this.f22798a.Y1(e.b.FIXED);
                androidx.constraintlayout.core.widgets.f fVar3 = this.f22798a;
                fVar3.y1(e(fVar3, 1));
                androidx.constraintlayout.core.widgets.f fVar4 = this.f22798a;
                fVar4.f22943f.f22864e.e(fVar4.D());
            }
        }
        if (i4 == 0) {
            androidx.constraintlayout.core.widgets.f fVar5 = this.f22798a;
            e.b bVar2 = fVar5.f22936b0[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int m02 = fVar5.m0() + o02;
                this.f22798a.f22941e.f22868i.e(m02);
                this.f22798a.f22941e.f22864e.e(m02 - o02);
                z5 = true;
            }
            z5 = false;
        } else {
            androidx.constraintlayout.core.widgets.f fVar6 = this.f22798a;
            e.b bVar3 = fVar6.f22936b0[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int D = fVar6.D() + p02;
                this.f22798a.f22943f.f22868i.e(D);
                this.f22798a.f22943f.f22864e.e(D - p02);
                z5 = true;
            }
            z5 = false;
        }
        s();
        Iterator<p> it2 = this.f22802e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f22865f == i4 && (next2.f22861b != this.f22798a || next2.f22866g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f22802e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z6 = true;
                break;
            }
            p next3 = it3.next();
            if (next3.f22865f == i4 && (z5 || next3.f22861b != this.f22798a)) {
                if (!next3.f22867h.f22816j) {
                    break;
                }
                if (!next3.f22868i.f22816j) {
                    break;
                }
                if (!(next3 instanceof c) && !next3.f22864e.f22816j) {
                    break;
                }
            }
        }
        this.f22798a.D1(z7);
        this.f22798a.Y1(z10);
        return z6;
    }

    public void o() {
        this.f22799b = true;
    }

    public void p() {
        this.f22800c = true;
    }

    public void s() {
        g gVar;
        Iterator<androidx.constraintlayout.core.widgets.e> it = this.f22798a.A1.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e next = it.next();
            if (!next.f22933a) {
                e.b[] bVarArr = next.f22936b0;
                boolean z4 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i4 = next.f22977w;
                int i5 = next.f22979x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z5 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i4 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i5 == 1)) {
                    z4 = true;
                }
                g gVar2 = next.f22941e.f22864e;
                boolean z6 = gVar2.f22816j;
                g gVar3 = next.f22943f.f22864e;
                boolean z7 = gVar3.f22816j;
                if (z6 && z7) {
                    e.b bVar4 = e.b.FIXED;
                    r(next, bVar4, gVar2.f22813g, bVar4, gVar3.f22813g);
                    next.f22933a = true;
                } else if (z6 && z4) {
                    r(next, e.b.FIXED, gVar2.f22813g, bVar3, gVar3.f22813g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f22943f.f22864e.f22819m = next.D();
                    } else {
                        next.f22943f.f22864e.e(next.D());
                        next.f22933a = true;
                    }
                } else if (z7 && z5) {
                    r(next, bVar3, gVar2.f22813g, e.b.FIXED, gVar3.f22813g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f22941e.f22864e.f22819m = next.m0();
                    } else {
                        next.f22941e.f22864e.e(next.m0());
                        next.f22933a = true;
                    }
                }
                if (next.f22933a && (gVar = next.f22943f.f22842l) != null) {
                    gVar.e(next.t());
                }
            }
        }
    }

    public void u(b.InterfaceC0389b interfaceC0389b) {
        this.f22804g = interfaceC0389b;
    }
}
