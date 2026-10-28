package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f22826a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f22827b = false;

    public static o a(androidx.constraintlayout.core.widgets.e eVar, int i4, ArrayList<o> arrayList, o oVar) {
        int l22;
        int i5 = i4 == 0 ? eVar.S0 : eVar.T0;
        if (i5 != -1 && (oVar == null || i5 != oVar.f22847b)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i6);
                if (oVar2.f() == i5) {
                    if (oVar != null) {
                        oVar.m(i4, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i6++;
                }
            }
        } else if (i5 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof androidx.constraintlayout.core.widgets.j) && (l22 = ((androidx.constraintlayout.core.widgets.j) eVar).l2(i4)) != -1) {
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i7);
                    if (oVar3.f() == l22) {
                        oVar = oVar3;
                        break;
                    }
                    i7++;
                }
            }
            if (oVar == null) {
                oVar = new o(i4);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof androidx.constraintlayout.core.widgets.h) {
                androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar;
                hVar.l2().d(hVar.m2() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i4 == 0) {
                eVar.S0 = oVar.f();
                eVar.Q.d(i4, arrayList, oVar);
                eVar.S.d(i4, arrayList, oVar);
            } else {
                eVar.T0 = oVar.f();
                eVar.R.d(i4, arrayList, oVar);
                eVar.U.d(i4, arrayList, oVar);
                eVar.T.d(i4, arrayList, oVar);
            }
            eVar.X.d(i4, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i4) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = arrayList.get(i5);
            if (i4 == oVar.f22847b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(androidx.constraintlayout.core.widgets.f r16, androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0389b r17) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.i.c(androidx.constraintlayout.core.widgets.f, androidx.constraintlayout.core.widgets.analyzer.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
