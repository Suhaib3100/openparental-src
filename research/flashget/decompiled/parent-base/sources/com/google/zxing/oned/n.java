package com.google.zxing.oned;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* compiled from: ITFReader.java */
/* loaded from: classes6.dex */
public final class n extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final float f63038b = 0.38f;

    /* renamed from: c, reason: collision with root package name */
    private static final float f63039c = 0.5f;

    /* renamed from: d, reason: collision with root package name */
    private static final int f63040d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f63041e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f63042f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f63043g = {6, 8, 10, 12, 14};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f63044h = {1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    private static final int[][] f63045i = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: j, reason: collision with root package name */
    private static final int[][] f63046j = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    private int f63047a = -1;

    private static int h(int[] iArr) throws NotFoundException {
        int length = f63046j.length;
        float f4 = 0.38f;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            float e4 = r.e(iArr, f63046j[i5], 0.5f);
            if (e4 < f4) {
                i4 = i5;
                f4 = e4;
            } else if (e4 == f4) {
                i4 = -1;
            }
        }
        if (i4 >= 0) {
            return i4 % 10;
        }
        throw NotFoundException.a();
    }

    private int[] i(com.google.zxing.common.a aVar) throws NotFoundException {
        int[] l4;
        aVar.s();
        try {
            int m4 = m(aVar);
            try {
                l4 = l(aVar, m4, f63045i[0]);
            } catch (NotFoundException unused) {
                l4 = l(aVar, m4, f63045i[1]);
            }
            n(aVar, l4[0]);
            int i4 = l4[0];
            l4[0] = aVar.o() - l4[1];
            l4[1] = aVar.o() - i4;
            return l4;
        } finally {
            aVar.s();
        }
    }

    private static void j(com.google.zxing.common.a aVar, int i4, int i5, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i4 < i5) {
            r.f(aVar, i4, iArr);
            for (int i6 = 0; i6 < 5; i6++) {
                int i7 = i6 * 2;
                iArr2[i6] = iArr[i7];
                iArr3[i6] = iArr[i7 + 1];
            }
            sb.append((char) (h(iArr2) + 48));
            sb.append((char) (h(iArr3) + 48));
            for (int i10 = 0; i10 < 10; i10++) {
                i4 += iArr[i10];
            }
        }
    }

    private int[] k(com.google.zxing.common.a aVar) throws NotFoundException {
        int[] l4 = l(aVar, m(aVar), f63044h);
        int i4 = l4[1];
        int i5 = l4[0];
        this.f63047a = (i4 - i5) / 4;
        n(aVar, i5);
        return l4;
    }

    private static int[] l(com.google.zxing.common.a aVar, int i4, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int o4 = aVar.o();
        int i5 = i4;
        boolean z4 = false;
        int i6 = 0;
        while (i4 < o4) {
            if (aVar.k(i4) != z4) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else {
                    if (r.e(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i5, i4};
                    }
                    i5 += iArr2[0] + iArr2[1];
                    int i7 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i7);
                    iArr2[i7] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z4 = !z4;
            }
            i4++;
        }
        throw NotFoundException.a();
    }

    private static int m(com.google.zxing.common.a aVar) throws NotFoundException {
        int o4 = aVar.o();
        int m4 = aVar.m(0);
        if (m4 != o4) {
            return m4;
        }
        throw NotFoundException.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n(com.google.zxing.common.a r3, int r4) throws com.google.zxing.NotFoundException {
        /*
            r2 = this;
            int r0 = r2.f63047a
            int r0 = r0 * 10
            int r0 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L19
            if (r4 < 0) goto L19
            boolean r1 = r3.k(r4)
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            com.google.zxing.NotFoundException r3 = com.google.zxing.NotFoundException.a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.n.n(com.google.zxing.common.a, int):void");
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws FormatException, NotFoundException {
        boolean z4;
        int[] k4 = k(aVar);
        int[] i5 = i(aVar);
        StringBuilder sb = new StringBuilder(20);
        j(aVar, k4[1], i5[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(com.google.zxing.d.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f63043g;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= length2) {
                z4 = false;
                break;
            }
            int i10 = iArr[i6];
            if (length == i10) {
                z4 = true;
                break;
            }
            if (i10 > i7) {
                i7 = i10;
            }
            i6++;
        }
        if (!z4 && length > i7) {
            z4 = true;
        }
        if (!z4) {
            throw FormatException.a();
        }
        float f4 = i4;
        return new com.google.zxing.n(sb2, null, new com.google.zxing.p[]{new com.google.zxing.p(k4[1], f4), new com.google.zxing.p(i5[0], f4)}, com.google.zxing.a.ITF);
    }
}
