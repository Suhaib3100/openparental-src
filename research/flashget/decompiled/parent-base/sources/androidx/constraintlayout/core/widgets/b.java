package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* compiled from: Chain.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f22871a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f22872b = false;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r7 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0035, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x004b, code lost:
    
        if (r7 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Type inference failed for: r1v40, types: [androidx.constraintlayout.core.widgets.e] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.core.widgets.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(androidx.constraintlayout.core.widgets.f r37, androidx.constraintlayout.core.f r38, int r39, int r40, androidx.constraintlayout.core.widgets.c r41) {
        /*
            Method dump skipped, instructions count: 1339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.b.a(androidx.constraintlayout.core.widgets.f, androidx.constraintlayout.core.f, int, int, androidx.constraintlayout.core.widgets.c):void");
    }

    public static void b(f fVar, androidx.constraintlayout.core.f fVar2, ArrayList<e> arrayList, int i4) {
        int i5;
        c[] cVarArr;
        int i6;
        if (i4 == 0) {
            i5 = fVar.M1;
            cVarArr = fVar.P1;
            i6 = 0;
        } else {
            i5 = fVar.N1;
            cVarArr = fVar.O1;
            i6 = 2;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            c cVar = cVarArr[i7];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f22873a)) {
                a(fVar, fVar2, i4, i6, cVar);
            }
        }
    }
}
