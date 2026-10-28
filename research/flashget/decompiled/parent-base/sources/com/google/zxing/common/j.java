package com.google.zxing.common;

import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* compiled from: HybridBinarizer.java */
/* loaded from: classes6.dex */
public final class j extends h {

    /* renamed from: i, reason: collision with root package name */
    private static final int f62789i = 3;

    /* renamed from: j, reason: collision with root package name */
    private static final int f62790j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f62791k = 7;

    /* renamed from: l, reason: collision with root package name */
    private static final int f62792l = 40;

    /* renamed from: m, reason: collision with root package name */
    private static final int f62793m = 24;

    /* renamed from: h, reason: collision with root package name */
    private b f62794h;

    public j(com.google.zxing.h hVar) {
        super(hVar);
    }

    private static int[][] i(byte[] bArr, int i4, int i5, int i6, int i7) {
        char c5;
        int i10 = 8;
        int i11 = i7 - 8;
        int i12 = i6 - 8;
        char c6 = 2;
        boolean z4 = true;
        int i13 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i5, i4);
        int i14 = 0;
        while (i14 < i5) {
            int i15 = i14 << 3;
            if (i15 > i11) {
                i15 = i11;
            }
            int i16 = i13;
            while (i16 < i4) {
                int i17 = i16 << 3;
                if (i17 > i12) {
                    i17 = i12;
                }
                int i18 = (i15 * i6) + i17;
                int i19 = i13;
                int i20 = i19;
                int i21 = i20;
                int i22 = 255;
                while (i19 < i10) {
                    int i23 = i21;
                    int i24 = 0;
                    while (i24 < i10) {
                        int i25 = bArr[i18 + i24] & 255;
                        i20 += i25;
                        if (i25 < i22) {
                            i22 = i25;
                        }
                        if (i25 > i23) {
                            i23 = i25;
                        }
                        i24++;
                        i10 = 8;
                    }
                    if (i23 - i22 > 24) {
                        while (true) {
                            i19++;
                            i18 += i6;
                            if (i19 < 8) {
                                int i26 = 0;
                                for (int i27 = 8; i26 < i27; i27 = 8) {
                                    i20 += bArr[i18 + i26] & 255;
                                    i26++;
                                }
                            }
                        }
                    }
                    i19++;
                    i18 += i6;
                    i21 = i23;
                    z4 = true;
                    i10 = 8;
                }
                boolean z5 = z4;
                int i28 = i20 >> 6;
                if (i21 - i22 <= 24) {
                    i28 = i22 / 2;
                    if (i14 > 0 && i16 > 0) {
                        int[] iArr2 = iArr[i14 - 1];
                        int i29 = i16 - 1;
                        c5 = 2;
                        int i30 = (((iArr[i14][i29] * 2) + iArr2[i16]) + iArr2[i29]) / 4;
                        if (i22 < i30) {
                            i28 = i30;
                        }
                        iArr[i14][i16] = i28;
                        i16++;
                        z4 = z5;
                        c6 = c5;
                        i10 = 8;
                        i13 = 0;
                    }
                }
                c5 = 2;
                iArr[i14][i16] = i28;
                i16++;
                z4 = z5;
                c6 = c5;
                i10 = 8;
                i13 = 0;
            }
            i14++;
            i10 = 8;
            i13 = 0;
        }
        return iArr;
    }

    private static void j(byte[] bArr, int i4, int i5, int i6, int i7, int[][] iArr, b bVar) {
        int i10 = i7 - 8;
        int i11 = i6 - 8;
        for (int i12 = 0; i12 < i5; i12++) {
            int i13 = i12 << 3;
            int i14 = i13 > i10 ? i10 : i13;
            int k4 = k(i12, i5 - 3);
            for (int i15 = 0; i15 < i4; i15++) {
                int i16 = i15 << 3;
                int i17 = i16 > i11 ? i11 : i16;
                int k5 = k(i15, i4 - 3);
                int i18 = 0;
                for (int i19 = -2; i19 <= 2; i19++) {
                    int[] iArr2 = iArr[k4 + i19];
                    i18 += iArr2[k5 - 2] + iArr2[k5 - 1] + iArr2[k5] + iArr2[k5 + 1] + iArr2[2 + k5];
                }
                l(bArr, i17, i14, i18 / 25, i6, bVar);
            }
        }
    }

    private static int k(int i4, int i5) {
        if (i4 < 2) {
            return 2;
        }
        return Math.min(i4, i5);
    }

    private static void l(byte[] bArr, int i4, int i5, int i6, int i7, b bVar) {
        int i10 = (i5 * i7) + i4;
        int i11 = 0;
        while (i11 < 8) {
            for (int i12 = 0; i12 < 8; i12++) {
                if ((bArr[i10 + i12] & 255) <= i6) {
                    bVar.s(i4 + i12, i5 + i11);
                }
            }
            i11++;
            i10 += i7;
        }
    }

    @Override // com.google.zxing.common.h, com.google.zxing.b
    public com.google.zxing.b a(com.google.zxing.h hVar) {
        return new j(hVar);
    }

    @Override // com.google.zxing.common.h, com.google.zxing.b
    public b b() throws NotFoundException {
        b bVar = this.f62794h;
        if (bVar != null) {
            return bVar;
        }
        com.google.zxing.h e4 = e();
        int e5 = e4.e();
        int b5 = e4.b();
        if (e5 < 40 || b5 < 40) {
            this.f62794h = super.b();
        } else {
            byte[] c5 = e4.c();
            int i4 = e5 >> 3;
            if ((e5 & 7) != 0) {
                i4++;
            }
            int i5 = i4;
            int i6 = b5 >> 3;
            if ((b5 & 7) != 0) {
                i6++;
            }
            int i7 = i6;
            int[][] i10 = i(c5, i5, i7, e5, b5);
            b bVar2 = new b(e5, b5);
            j(c5, i5, i7, e5, b5, i10, bVar2);
            this.f62794h = bVar2;
        }
        return this.f62794h;
    }
}
