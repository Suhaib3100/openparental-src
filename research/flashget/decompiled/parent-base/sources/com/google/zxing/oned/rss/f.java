package com.google.zxing.oned.rss;

/* compiled from: RSSUtils.java */
/* loaded from: classes6.dex */
public final class f {
    private f() {
    }

    private static int a(int i4, int i5) {
        int i6 = i4 - i5;
        if (i6 > i5) {
            i6 = i5;
            i5 = i6;
        }
        int i7 = 1;
        int i10 = 1;
        while (i4 > i5) {
            i7 *= i4;
            if (i10 <= i6) {
                i7 /= i10;
                i10++;
            }
            i4--;
        }
        while (i10 <= i6) {
            i7 /= i10;
            i10++;
        }
        return i7;
    }

    public static int b(int[] iArr, int i4, boolean z4) {
        int[] iArr2 = iArr;
        int i5 = 0;
        for (int i6 : iArr2) {
            i5 += i6;
        }
        int length = iArr2.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (i7 >= i12) {
                return i10;
            }
            int i13 = 1 << i7;
            i11 |= i13;
            int i14 = 1;
            while (i14 < iArr2[i7]) {
                int i15 = i5 - i14;
                int i16 = length - i7;
                int i17 = i16 - 2;
                int a5 = a(i15 - 1, i17);
                if (z4 && i11 == 0) {
                    int i18 = i16 - 1;
                    if (i15 - i18 >= i18) {
                        a5 -= a(i15 - i16, i17);
                    }
                }
                if (i16 - 1 > 1) {
                    int i19 = 0;
                    for (int i20 = i15 - i17; i20 > i4; i20--) {
                        i19 += a((i15 - i20) - 1, i16 - 3);
                    }
                    a5 -= (i12 - i7) * i19;
                } else if (i15 > i4) {
                    a5--;
                }
                i10 += a5;
                i14++;
                i11 &= ~i13;
                iArr2 = iArr;
            }
            i5 -= i14;
            i7++;
            iArr2 = iArr;
        }
    }
}
