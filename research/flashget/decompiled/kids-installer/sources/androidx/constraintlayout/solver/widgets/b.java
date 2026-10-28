package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;

/* compiled from: Chain.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f2460a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2461b = false;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r7 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x003e, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x003c, code lost:
    
        if (r7 == 2) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x038d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c8  */
    /* JADX WARN: Type inference failed for: r2v56, types: [androidx.constraintlayout.solver.widgets.e] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.solver.widgets.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(androidx.constraintlayout.solver.widgets.f r37, androidx.constraintlayout.solver.g r38, int r39, int r40, androidx.constraintlayout.solver.widgets.c r41) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.b.a(androidx.constraintlayout.solver.widgets.f, androidx.constraintlayout.solver.g, int, int, androidx.constraintlayout.solver.widgets.c):void");
    }

    public static void b(f fVar, androidx.constraintlayout.solver.g gVar, ArrayList<e> arrayList, int i5) {
        int i6;
        c[] cVarArr;
        int i7;
        if (i5 == 0) {
            i6 = fVar.f2574z1;
            cVarArr = fVar.C1;
            i7 = 0;
        } else {
            i6 = fVar.A1;
            cVarArr = fVar.B1;
            i7 = 2;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            c cVar = cVarArr[i8];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f2462a)) {
                a(fVar, gVar, i5, i7, cVar);
            }
        }
    }
}
