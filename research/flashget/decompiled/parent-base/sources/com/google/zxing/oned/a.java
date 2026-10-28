package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: CodaBarReader.java */
/* loaded from: classes6.dex */
public final class a extends r {

    /* renamed from: d, reason: collision with root package name */
    private static final float f62968d = 2.0f;

    /* renamed from: e, reason: collision with root package name */
    private static final float f62969e = 1.5f;

    /* renamed from: i, reason: collision with root package name */
    private static final int f62973i = 3;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f62975a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private int[] f62976b = new int[80];

    /* renamed from: c, reason: collision with root package name */
    private int f62977c = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final String f62970f = ProtectedSandApp.s("\u0ad5\u0001");

    /* renamed from: g, reason: collision with root package name */
    static final char[] f62971g = ProtectedSandApp.s("\u0ad5\u0001").toCharArray();

    /* renamed from: h, reason: collision with root package name */
    static final int[] f62972h = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f62974j = {'A', 'B', 'C', 'D'};

    static boolean h(char[] cArr, char c5) {
        if (cArr != null) {
            for (char c6 : cArr) {
                if (c6 == c5) {
                    return true;
                }
            }
        }
        return false;
    }

    private void i(int i4) {
        int[] iArr = this.f62976b;
        int i5 = this.f62977c;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f62977c = i6;
        if (i6 >= iArr.length) {
            int[] iArr2 = new int[i6 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i6);
            this.f62976b = iArr2;
        }
    }

    private int j() throws NotFoundException {
        for (int i4 = 1; i4 < this.f62977c; i4 += 2) {
            int l4 = l(i4);
            if (l4 != -1 && h(f62974j, f62971g[l4])) {
                int i5 = 0;
                for (int i6 = i4; i6 < i4 + 7; i6++) {
                    i5 += this.f62976b[i6];
                }
                if (i4 == 1 || this.f62976b[i4 - 1] >= i5 / 2) {
                    return i4;
                }
            }
        }
        throw NotFoundException.a();
    }

    private void k(com.google.zxing.common.a aVar) throws NotFoundException {
        int i4 = 0;
        this.f62977c = 0;
        int n4 = aVar.n(0);
        int o4 = aVar.o();
        if (n4 >= o4) {
            throw NotFoundException.a();
        }
        boolean z4 = true;
        while (n4 < o4) {
            if (aVar.k(n4) != z4) {
                i4++;
            } else {
                i(i4);
                z4 = !z4;
                i4 = 1;
            }
            n4++;
        }
        i(i4);
    }

    private int l(int i4) {
        int i5 = i4 + 7;
        if (i5 >= this.f62977c) {
            return -1;
        }
        int[] iArr = this.f62976b;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        for (int i12 = i4; i12 < i5; i12 += 2) {
            int i13 = iArr[i12];
            if (i13 < i10) {
                i10 = i13;
            }
            if (i13 > i11) {
                i11 = i13;
            }
        }
        int i14 = (i10 + i11) / 2;
        int i15 = 0;
        for (int i16 = i4 + 1; i16 < i5; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i6) {
                i6 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i6 + i15) / 2;
        int i19 = 128;
        int i20 = 0;
        for (int i21 = 0; i21 < 7; i21++) {
            i19 >>= 1;
            if (iArr[i4 + i21] > ((i21 & 1) == 0 ? i14 : i18)) {
                i20 |= i19;
            }
        }
        while (true) {
            int[] iArr2 = f62972h;
            if (i7 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i7] == i20) {
                return i7;
            }
            i7++;
        }
    }

    private void m(int i4) throws NotFoundException {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int[] iArr2 = new int[4];
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int length = this.f62975a.length() - 1;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            int i7 = f62972h[this.f62975a.charAt(i6)];
            for (int i10 = 6; i10 >= 0; i10--) {
                int i11 = (i10 & 1) + ((i7 & 1) << 1);
                iArr[i11] = iArr[i11] + this.f62976b[i5 + i10];
                iArr2[i11] = iArr2[i11] + 1;
                i7 >>= 1;
            }
            if (i6 >= length) {
                break;
            }
            i5 += 8;
            i6++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i12 = 0; i12 < 2; i12++) {
            fArr2[i12] = 0.0f;
            int i13 = i12 + 2;
            int i14 = iArr[i13];
            int i15 = iArr2[i13];
            float f4 = ((i14 / i15) + (iArr[i12] / iArr2[i12])) / 2.0f;
            fArr2[i13] = f4;
            fArr[i12] = f4;
            fArr[i13] = ((i14 * 2.0f) + f62969e) / i15;
        }
        int i16 = i4;
        int i17 = 0;
        loop3: while (true) {
            int i18 = f62972h[this.f62975a.charAt(i17)];
            for (int i19 = 6; i19 >= 0; i19--) {
                int i20 = (i19 & 1) + ((i18 & 1) << 1);
                float f5 = this.f62976b[i16 + i19];
                if (f5 < fArr2[i20] || f5 > fArr[i20]) {
                    break loop3;
                }
                i18 >>= 1;
            }
            if (i17 >= length) {
                return;
            }
            i16 += 8;
            i17++;
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException {
        int i5;
        Arrays.fill(this.f62976b, 0);
        k(aVar);
        int j4 = j();
        this.f62975a.setLength(0);
        int i6 = j4;
        while (true) {
            int l4 = l(i6);
            if (l4 == -1) {
                throw NotFoundException.a();
            }
            this.f62975a.append((char) l4);
            i5 = i6 + 8;
            if ((this.f62975a.length() <= 1 || !h(f62974j, f62971g[l4])) && i5 < this.f62977c) {
                i6 = i5;
            }
        }
        int i7 = i6 + 7;
        int i10 = this.f62976b[i7];
        int i11 = 0;
        for (int i12 = -8; i12 < -1; i12++) {
            i11 += this.f62976b[i5 + i12];
        }
        if (i5 < this.f62977c && i10 < i11 / 2) {
            throw NotFoundException.a();
        }
        m(j4);
        for (int i13 = 0; i13 < this.f62975a.length(); i13++) {
            StringBuilder sb = this.f62975a;
            sb.setCharAt(i13, f62971g[sb.charAt(i13)]);
        }
        char charAt = this.f62975a.charAt(0);
        char[] cArr = f62974j;
        if (!h(cArr, charAt)) {
            throw NotFoundException.a();
        }
        StringBuilder sb2 = this.f62975a;
        if (!h(cArr, sb2.charAt(sb2.length() - 1))) {
            throw NotFoundException.a();
        }
        if (this.f62975a.length() <= 3) {
            throw NotFoundException.a();
        }
        if (map == null || !map.containsKey(com.google.zxing.d.RETURN_CODABAR_START_END)) {
            StringBuilder sb3 = this.f62975a;
            sb3.deleteCharAt(sb3.length() - 1);
            this.f62975a.deleteCharAt(0);
        }
        int i14 = 0;
        for (int i15 = 0; i15 < j4; i15++) {
            i14 += this.f62976b[i15];
        }
        float f4 = i14;
        while (j4 < i7) {
            i14 += this.f62976b[j4];
            j4++;
        }
        float f5 = i4;
        return new com.google.zxing.n(this.f62975a.toString(), null, new com.google.zxing.p[]{new com.google.zxing.p(f4, f5), new com.google.zxing.p(i14, f5)}, com.google.zxing.a.CODABAR);
    }
}
