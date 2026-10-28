package com.google.zxing.oned;

import com.google.zxing.NotFoundException;

/* compiled from: Code128Reader.java */
/* loaded from: classes6.dex */
public final class c extends r {

    /* renamed from: a, reason: collision with root package name */
    static final int[][] f62986a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f62987b = 0.25f;

    /* renamed from: c, reason: collision with root package name */
    private static final float f62988c = 0.7f;

    /* renamed from: d, reason: collision with root package name */
    private static final int f62989d = 98;

    /* renamed from: e, reason: collision with root package name */
    private static final int f62990e = 99;

    /* renamed from: f, reason: collision with root package name */
    private static final int f62991f = 100;

    /* renamed from: g, reason: collision with root package name */
    private static final int f62992g = 101;

    /* renamed from: h, reason: collision with root package name */
    private static final int f62993h = 102;

    /* renamed from: i, reason: collision with root package name */
    private static final int f62994i = 97;

    /* renamed from: j, reason: collision with root package name */
    private static final int f62995j = 96;

    /* renamed from: k, reason: collision with root package name */
    private static final int f62996k = 101;

    /* renamed from: l, reason: collision with root package name */
    private static final int f62997l = 100;

    /* renamed from: m, reason: collision with root package name */
    private static final int f62998m = 103;

    /* renamed from: n, reason: collision with root package name */
    private static final int f62999n = 104;

    /* renamed from: o, reason: collision with root package name */
    private static final int f63000o = 105;

    /* renamed from: p, reason: collision with root package name */
    private static final int f63001p = 106;

    static {
        int[] iArr = new int[6];
        // fill-array-data instruction
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 2;
        iArr[3] = 2;
        iArr[4] = 3;
        iArr[5] = 1;
        f62986a = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, iArr, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    }

    private static int h(com.google.zxing.common.a aVar, int[] iArr, int i4) throws NotFoundException {
        r.f(aVar, i4, iArr);
        float f4 = f62987b;
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int[][] iArr2 = f62986a;
            if (i6 >= iArr2.length) {
                break;
            }
            float e4 = r.e(iArr, iArr2[i6], f62988c);
            if (e4 < f4) {
                i5 = i6;
                f4 = e4;
            }
            i6++;
        }
        if (i5 >= 0) {
            return i5;
        }
        throw NotFoundException.a();
    }

    private static int[] i(com.google.zxing.common.a aVar) throws NotFoundException {
        int o4 = aVar.o();
        int m4 = aVar.m(0);
        int[] iArr = new int[6];
        boolean z4 = false;
        int i4 = 0;
        int i5 = m4;
        while (m4 < o4) {
            if (aVar.k(m4) != z4) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 == 5) {
                    int i6 = -1;
                    float f4 = f62987b;
                    for (int i7 = 103; i7 <= 105; i7++) {
                        float e4 = r.e(iArr, f62986a[i7], f62988c);
                        if (e4 < f4) {
                            i6 = i7;
                            f4 = e4;
                        }
                    }
                    if (i6 >= 0 && aVar.q(Math.max(0, i5 - ((m4 - i5) / 2)), i5, false)) {
                        return new int[]{i5, m4, i6};
                    }
                    i5 += iArr[0] + iArr[1];
                    int i10 = i4 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i10);
                    iArr[i10] = 0;
                    iArr[i4] = 0;
                    i4--;
                } else {
                    i4++;
                }
                iArr[i4] = 1;
                z4 = !z4;
            }
            m4++;
        }
        throw NotFoundException.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (r3 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        r3 = false;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0138, code lost:
    
        if (r3 != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a4 A[PHI: r3 r5 r16 r20
      0x00a4: PHI (r3v8 boolean) = 
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v15 boolean)
      (r3v16 boolean)
      (r3v17 boolean)
      (r3v18 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
     binds: [B:25:0x008c, B:73:0x0114, B:74:0x0118, B:78:0x0124, B:77:0x0120, B:65:0x00f9, B:51:0x00e5, B:50:0x00e2, B:47:0x00db, B:30:0x00a3, B:39:0x00c1, B:40:0x00c5, B:44:0x00d1, B:43:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r5v11 boolean) = 
      (r5v2 boolean)
      (r5v2 boolean)
      (r5v2 boolean)
      (r5v2 boolean)
      (r5v2 boolean)
      (r5v2 boolean)
      (r5v2 boolean)
      (r5v14 boolean)
      (r5v15 boolean)
      (r5v2 boolean)
      (r5v2 boolean)
      (r5v2 boolean)
      (r5v2 boolean)
      (r5v2 boolean)
     binds: [B:25:0x008c, B:73:0x0114, B:74:0x0118, B:78:0x0124, B:77:0x0120, B:65:0x00f9, B:51:0x00e5, B:50:0x00e2, B:47:0x00db, B:30:0x00a3, B:39:0x00c1, B:40:0x00c5, B:44:0x00d1, B:43:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r16v2 boolean) = 
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v5 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
     binds: [B:25:0x008c, B:73:0x0114, B:74:0x0118, B:78:0x0124, B:77:0x0120, B:65:0x00f9, B:51:0x00e5, B:50:0x00e2, B:47:0x00db, B:30:0x00a3, B:39:0x00c1, B:40:0x00c5, B:44:0x00d1, B:43:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r20v3 boolean) = 
      (r20v2 boolean)
      (r20v9 boolean)
      (r20v9 boolean)
      (r20v9 boolean)
      (r20v9 boolean)
      (r20v11 boolean)
      (r20v14 boolean)
      (r20v15 boolean)
      (r20v16 boolean)
      (r20v2 boolean)
      (r20v17 boolean)
      (r20v17 boolean)
      (r20v17 boolean)
      (r20v17 boolean)
     binds: [B:25:0x008c, B:73:0x0114, B:74:0x0118, B:78:0x0124, B:77:0x0120, B:65:0x00f9, B:51:0x00e5, B:50:0x00e2, B:47:0x00db, B:30:0x00a3, B:39:0x00c1, B:40:0x00c5, B:44:0x00d1, B:43:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee A[PHI: r20
      0x00ee: PHI (r20v12 boolean) = (r20v9 boolean), (r20v17 boolean) binds: [B:73:0x0114, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.zxing.oned.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.zxing.n b(int r26, com.google.zxing.common.a r27, java.util.Map<com.google.zxing.d, ?> r28) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.c.b(int, com.google.zxing.common.a, java.util.Map):com.google.zxing.n");
    }
}
