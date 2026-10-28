package ua;

import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.p;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Detector.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    private static final float f92748c = 0.42f;

    /* renamed from: d, reason: collision with root package name */
    private static final float f92749d = 0.8f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f92752g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f92753h = 5;

    /* renamed from: i, reason: collision with root package name */
    private static final int f92754i = 25;

    /* renamed from: j, reason: collision with root package name */
    private static final int f92755j = 5;

    /* renamed from: k, reason: collision with root package name */
    private static final int f92756k = 10;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f92746a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f92747b = {6, 2, 7, 3};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f92750e = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f92751f = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private a() {
    }

    private static void a(p[] pVarArr, p[] pVarArr2, int[] iArr) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            pVarArr[iArr[i4]] = pVarArr2[i4];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r3.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r4 = (com.google.zxing.p[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.d());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.google.zxing.p[]> b(boolean r8, com.google.zxing.common.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            int r5 = r9.k()
            if (r2 >= r5) goto L77
            com.google.zxing.p[] r3 = f(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L4f
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L4f
            if (r4 == 0) goto L77
            java.util.Iterator r3 = r0.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            com.google.zxing.p[] r4 = (com.google.zxing.p[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3d
            float r2 = (float) r2
            float r7 = r7.d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3d:
            r4 = r4[r5]
            if (r4 == 0) goto L23
            float r4 = r4.d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L23
        L4b:
            int r2 = r2 + 5
            r3 = r1
            goto L8
        L4f:
            r0.add(r3)
            if (r8 == 0) goto L77
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L68
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.d()
        L64:
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L9
        L68:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.d()
            goto L64
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.a.b(boolean, com.google.zxing.common.b):java.util.List");
    }

    public static b c(c cVar, Map<d, ?> map, boolean z4) throws NotFoundException {
        com.google.zxing.common.b b5 = cVar.b();
        List<p[]> b6 = b(z4, b5);
        if (b6.isEmpty()) {
            b5 = b5.clone();
            b5.r();
            b6 = b(z4, b5);
        }
        return new b(b5, b6);
    }

    private static int[] d(com.google.zxing.common.b bVar, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i7 = 0;
        while (bVar.f(i4, i5) && i4 > 0) {
            int i10 = i7 + 1;
            if (i7 >= 3) {
                break;
            }
            i4--;
            i7 = i10;
        }
        int length = iArr.length;
        int i11 = i4;
        int i12 = 0;
        boolean z4 = false;
        while (i4 < i6) {
            if (bVar.f(i4, i5) != z4) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (g(iArr2, iArr) < f92748c) {
                        return new int[]{i11, i4};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z4 = !z4;
            }
            i4++;
        }
        if (i12 != length - 1 || g(iArr2, iArr) >= f92748c) {
            return null;
        }
        return new int[]{i11, i4 - 1};
    }

    private static p[] e(com.google.zxing.common.b bVar, int i4, int i5, int i6, int i7, int[] iArr) {
        boolean z4;
        int i10;
        p[] pVarArr = new p[4];
        int[] iArr2 = new int[iArr.length];
        int i11 = i6;
        while (true) {
            if (i11 >= i4) {
                z4 = false;
                break;
            }
            int[] d5 = d(bVar, i7, i11, i5, iArr, iArr2);
            if (d5 != null) {
                int i12 = i11;
                int[] iArr3 = d5;
                while (i12 > 0) {
                    int i13 = i12 - 1;
                    int[] d6 = d(bVar, i7, i13, i5, iArr, iArr2);
                    if (d6 == null) {
                        break;
                    }
                    iArr3 = d6;
                    i12 = i13;
                }
                float f4 = i12;
                pVarArr[0] = new p(iArr3[0], f4);
                pVarArr[1] = new p(iArr3[1], f4);
                z4 = true;
                i11 = i12;
            } else {
                i11 += 5;
            }
        }
        int i14 = i11 + 1;
        if (z4) {
            int[] iArr4 = {(int) pVarArr[0].c(), (int) pVarArr[1].c()};
            int i15 = i14;
            int i16 = 0;
            while (true) {
                if (i15 >= i4) {
                    i10 = i16;
                    break;
                }
                i10 = i16;
                int[] d7 = d(bVar, iArr4[0], i15, i5, iArr, iArr2);
                if (d7 != null && Math.abs(iArr4[0] - d7[0]) < 5 && Math.abs(iArr4[1] - d7[1]) < 5) {
                    iArr4 = d7;
                    i16 = 0;
                } else {
                    if (i10 > 25) {
                        break;
                    }
                    i16 = i10 + 1;
                }
                i15++;
            }
            i14 = i15 - (i10 + 1);
            float f5 = i14;
            pVarArr[2] = new p(iArr4[0], f5);
            pVarArr[3] = new p(iArr4[1], f5);
        }
        if (i14 - i11 < 10) {
            Arrays.fill(pVarArr, (Object) null);
        }
        return pVarArr;
    }

    private static p[] f(com.google.zxing.common.b bVar, int i4, int i5) {
        int k4 = bVar.k();
        int o4 = bVar.o();
        p[] pVarArr = new p[8];
        a(pVarArr, e(bVar, k4, o4, i4, i5, f92750e), f92746a);
        p pVar = pVarArr[4];
        if (pVar != null) {
            i5 = (int) pVar.c();
            i4 = (int) pVarArr[4].d();
        }
        a(pVarArr, e(bVar, k4, o4, i4, i5, f92751f), f92747b);
        return pVarArr;
    }

    private static float g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            i4 += iArr[i6];
            i5 += iArr2[i6];
        }
        if (i4 < i5) {
            return Float.POSITIVE_INFINITY;
        }
        float f4 = i4;
        float f5 = f4 / i5;
        float f6 = f92749d * f5;
        float f7 = 0.0f;
        for (int i7 = 0; i7 < length; i7++) {
            float f10 = iArr2[i7] * f5;
            float f11 = iArr[i7];
            float f12 = f11 > f10 ? f11 - f10 : f10 - f11;
            if (f12 > f6) {
                return Float.POSITIVE_INFINITY;
            }
            f7 += f12;
        }
        return f7 / f4;
    }
}
