package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.e;
import java.util.ArrayList;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f2415a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f2416b = false;

    public static p a(androidx.constraintlayout.solver.widgets.e eVar, int i5, ArrayList<p> arrayList, p pVar) {
        int P1;
        int i6 = i5 == 0 ? eVar.K0 : eVar.L0;
        if (i6 != -1 && (pVar == null || i6 != pVar.f2436b)) {
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                p pVar2 = arrayList.get(i7);
                if (pVar2.f() == i6) {
                    if (pVar != null) {
                        pVar.m(i5, pVar2);
                        arrayList.remove(pVar);
                    }
                    pVar = pVar2;
                } else {
                    i7++;
                }
            }
        } else if (i6 != -1) {
            return pVar;
        }
        if (pVar == null) {
            if ((eVar instanceof androidx.constraintlayout.solver.widgets.j) && (P1 = ((androidx.constraintlayout.solver.widgets.j) eVar).P1(i5)) != -1) {
                int i8 = 0;
                while (true) {
                    if (i8 >= arrayList.size()) {
                        break;
                    }
                    p pVar3 = arrayList.get(i8);
                    if (pVar3.f() == P1) {
                        pVar = pVar3;
                        break;
                    }
                    i8++;
                }
            }
            if (pVar == null) {
                pVar = new p(i5);
            }
            arrayList.add(pVar);
        }
        if (pVar.a(eVar)) {
            if (eVar instanceof androidx.constraintlayout.solver.widgets.h) {
                androidx.constraintlayout.solver.widgets.h hVar = (androidx.constraintlayout.solver.widgets.h) eVar;
                hVar.P1().d(hVar.Q1() == 0 ? 1 : 0, arrayList, pVar);
            }
            if (i5 == 0) {
                eVar.K0 = pVar.f();
                eVar.J.d(i5, arrayList, pVar);
                eVar.L.d(i5, arrayList, pVar);
            } else {
                eVar.L0 = pVar.f();
                eVar.K.d(i5, arrayList, pVar);
                eVar.N.d(i5, arrayList, pVar);
                eVar.M.d(i5, arrayList, pVar);
            }
            eVar.Q.d(i5, arrayList, pVar);
        }
        return pVar;
    }

    private static p b(ArrayList<p> arrayList, int i5) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = arrayList.get(i6);
            if (i5 == pVar.f2436b) {
                return pVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0390 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(androidx.constraintlayout.solver.widgets.f r16, androidx.constraintlayout.solver.widgets.analyzer.b.InterfaceC0021b r17) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.j.c(androidx.constraintlayout.solver.widgets.f, androidx.constraintlayout.solver.widgets.analyzer.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
