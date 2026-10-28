package com.google.zxing.oned;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: UPCEANReader.java */
/* loaded from: classes6.dex */
public abstract class y extends r {

    /* renamed from: d, reason: collision with root package name */
    private static final float f63154d = 0.48f;

    /* renamed from: e, reason: collision with root package name */
    private static final float f63155e = 0.7f;

    /* renamed from: f, reason: collision with root package name */
    static final int[] f63156f = {1, 1, 1};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f63157g = {1, 1, 1, 1, 1};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f63158h = {1, 1, 1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    static final int[][] f63159i;

    /* renamed from: j, reason: collision with root package name */
    static final int[][] f63160j;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f63161a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final x f63162b = new x();

    /* renamed from: c, reason: collision with root package name */
    private final m f63163c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f63159i = iArr;
        int[][] iArr2 = new int[20][];
        f63160j = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i4 = 10; i4 < 20; i4++) {
            int[] iArr3 = f63159i[i4 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i5 = 0; i5 < iArr3.length; i5++) {
                iArr4[i5] = iArr3[(iArr3.length - i5) - 1];
            }
            f63160j[i4] = iArr4;
        }
    }

    protected y() {
    }

    static boolean i(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i4 = length - 1;
        return r(charSequence.subSequence(0, i4)) == Character.digit(charSequence.charAt(i4), 10);
    }

    static int j(com.google.zxing.common.a aVar, int[] iArr, int i4, int[][] iArr2) throws NotFoundException {
        r.f(aVar, i4, iArr);
        int length = iArr2.length;
        float f4 = f63154d;
        int i5 = -1;
        for (int i6 = 0; i6 < length; i6++) {
            float e4 = r.e(iArr, iArr2[i6], f63155e);
            if (e4 < f4) {
                i5 = i6;
                f4 = e4;
            }
        }
        if (i5 >= 0) {
            return i5;
        }
        throw NotFoundException.a();
    }

    static int[] n(com.google.zxing.common.a aVar, int i4, boolean z4, int[] iArr) throws NotFoundException {
        return o(aVar, i4, z4, iArr, new int[iArr.length]);
    }

    private static int[] o(com.google.zxing.common.a aVar, int i4, boolean z4, int[] iArr, int[] iArr2) throws NotFoundException {
        int o4 = aVar.o();
        int n4 = z4 ? aVar.n(i4) : aVar.m(i4);
        int length = iArr.length;
        boolean z5 = z4;
        int i5 = 0;
        int i6 = n4;
        while (n4 < o4) {
            if (aVar.k(n4) != z5) {
                iArr2[i5] = iArr2[i5] + 1;
            } else {
                if (i5 != length - 1) {
                    i5++;
                } else {
                    if (r.e(iArr2, iArr, f63155e) < f63154d) {
                        return new int[]{i6, n4};
                    }
                    i6 += iArr2[0] + iArr2[1];
                    int i7 = i5 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i7);
                    iArr2[i7] = 0;
                    iArr2[i5] = 0;
                    i5--;
                }
                iArr2[i5] = 1;
                z5 = !z5;
            }
            n4++;
        }
        throw NotFoundException.a();
    }

    static int[] p(com.google.zxing.common.a aVar) throws NotFoundException {
        int[] iArr = new int[f63156f.length];
        int[] iArr2 = null;
        boolean z4 = false;
        int i4 = 0;
        while (!z4) {
            int[] iArr3 = f63156f;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = o(aVar, i4, false, iArr3, iArr);
            int i5 = iArr2[0];
            int i6 = iArr2[1];
            int i7 = i5 - (i6 - i5);
            if (i7 >= 0) {
                z4 = aVar.q(i7, i5, false);
            }
            i4 = i6;
        }
        return iArr2;
    }

    static int r(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i4 = 0;
        for (int i5 = length - 1; i5 >= 0; i5 -= 2) {
            int charAt = charSequence.charAt(i5) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.a();
            }
            i4 += charAt;
        }
        int i6 = i4 * 3;
        for (int i7 = length - 2; i7 >= 0; i7 -= 2) {
            int charAt2 = charSequence.charAt(i7) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.a();
            }
            i6 += charAt2;
        }
        return (1000 - i6) % 10;
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return m(i4, aVar, p(aVar), map);
    }

    boolean h(String str) throws FormatException {
        return i(str);
    }

    int[] k(com.google.zxing.common.a aVar, int i4) throws NotFoundException {
        return n(aVar, i4, false, f63156f);
    }

    protected abstract int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb) throws NotFoundException;

    public com.google.zxing.n m(int i4, com.google.zxing.common.a aVar, int[] iArr, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int i5;
        String c5;
        com.google.zxing.q qVar = map == null ? null : (com.google.zxing.q) map.get(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK);
        if (qVar != null) {
            qVar.a(new com.google.zxing.p((iArr[0] + iArr[1]) / 2.0f, i4));
        }
        StringBuilder sb = this.f63161a;
        sb.setLength(0);
        int l4 = l(aVar, iArr, sb);
        if (qVar != null) {
            qVar.a(new com.google.zxing.p(l4, i4));
        }
        int[] k4 = k(aVar, l4);
        if (qVar != null) {
            qVar.a(new com.google.zxing.p((k4[0] + k4[1]) / 2.0f, i4));
        }
        int i6 = k4[1];
        int i7 = (i6 - k4[0]) + i6;
        if (i7 >= aVar.o() || !aVar.q(i6, i7, false)) {
            throw NotFoundException.a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw FormatException.a();
        }
        if (!h(sb2)) {
            throw ChecksumException.a();
        }
        com.google.zxing.a q4 = q();
        float f4 = i4;
        com.google.zxing.n nVar = new com.google.zxing.n(sb2, null, new com.google.zxing.p[]{new com.google.zxing.p((iArr[1] + iArr[0]) / 2.0f, f4), new com.google.zxing.p((k4[1] + k4[0]) / 2.0f, f4)}, q4);
        try {
            com.google.zxing.n a5 = this.f63162b.a(i4, aVar, k4[1]);
            nVar.j(com.google.zxing.o.UPC_EAN_EXTENSION, a5.g());
            nVar.i(a5.e());
            nVar.a(a5.f());
            i5 = a5.g().length();
        } catch (ReaderException unused) {
            i5 = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(com.google.zxing.d.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            for (int i10 : iArr2) {
                if (i5 != i10) {
                }
            }
            throw NotFoundException.a();
        }
        if ((q4 == com.google.zxing.a.EAN_13 || q4 == com.google.zxing.a.UPC_A) && (c5 = this.f63163c.c(sb2)) != null) {
            nVar.j(com.google.zxing.o.POSSIBLE_COUNTRY, c5);
        }
        return nVar;
    }

    abstract com.google.zxing.a q();
}
