package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import org.apache.http.HttpStatus;

/* compiled from: Code93Reader.java */
/* loaded from: classes6.dex */
public final class g extends r {

    /* renamed from: c, reason: collision with root package name */
    static final String f63025c = ProtectedSandApp.s("\u0af2\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f63026d = ProtectedSandApp.s("\u0af2\u0001").toCharArray();

    /* renamed from: e, reason: collision with root package name */
    static final int[] f63027e;

    /* renamed from: f, reason: collision with root package name */
    static final int f63028f;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f63029a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f63030b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, HttpStatus.SC_NOT_ACCEPTABLE, HttpStatus.SC_GONE, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f63027e = iArr;
        f63028f = iArr[47];
    }

    private static void h(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        i(charSequence, length - 2, 20);
        i(charSequence, length - 1, 15);
    }

    private static void i(CharSequence charSequence, int i4, int i5) throws ChecksumException {
        int i6 = 0;
        int i7 = 1;
        for (int i10 = i4 - 1; i10 >= 0; i10--) {
            i6 += ProtectedSandApp.s("\u0af2\u0001").indexOf(charSequence.charAt(i10)) * i7;
            i7++;
            if (i7 > i5) {
                i7 = 1;
            }
        }
        if (charSequence.charAt(i4) != f63026d[i6 % 47]) {
            throw ChecksumException.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String j(CharSequence charSequence) throws FormatException {
        int i4;
        char c5;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i5 = 0;
        while (i5 < length) {
            char charAt = charSequence.charAt(i5);
            if (charAt < 'a' || charAt > 'd') {
                sb.append(charAt);
            } else {
                if (i5 >= length - 1) {
                    throw FormatException.a();
                }
                i5++;
                char charAt2 = charSequence.charAt(i5);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i4 = charAt2 - '@';
                            c5 = (char) i4;
                            sb.append(c5);
                            break;
                        } else {
                            throw FormatException.a();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i4 = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i4 = charAt2 - 11;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i4 = charAt2 + 16;
                        } else if (charAt2 < 'P' || charAt2 > 'T') {
                            if (charAt2 != 'U') {
                                if (charAt2 == 'V') {
                                    c5 = '@';
                                } else if (charAt2 == 'W') {
                                    c5 = '`';
                                } else {
                                    if (charAt2 < 'X' || charAt2 > 'Z') {
                                        throw FormatException.a();
                                    }
                                    c5 = com.google.common.base.c.N;
                                }
                                sb.append(c5);
                                break;
                            }
                            c5 = 0;
                            sb.append(c5);
                        } else {
                            i4 = charAt2 + '+';
                        }
                        c5 = (char) i4;
                        sb.append(c5);
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i4 = charAt2 - ' ';
                            c5 = (char) i4;
                            sb.append(c5);
                        } else {
                            if (charAt2 != 'Z') {
                                throw FormatException.a();
                            }
                            c5 = ':';
                            sb.append(c5);
                            break;
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i4 = charAt2 + ' ';
                            c5 = (char) i4;
                            sb.append(c5);
                            break;
                        } else {
                            throw FormatException.a();
                        }
                        break;
                    default:
                        c5 = 0;
                        sb.append(c5);
                        break;
                }
            }
            i5++;
        }
        return sb.toString();
    }

    private int[] k(com.google.zxing.common.a aVar) throws NotFoundException {
        int o4 = aVar.o();
        int m4 = aVar.m(0);
        Arrays.fill(this.f63030b, 0);
        int[] iArr = this.f63030b;
        int length = iArr.length;
        boolean z4 = false;
        int i4 = 0;
        int i5 = m4;
        while (m4 < o4) {
            if (aVar.k(m4) != z4) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else {
                    if (m(iArr) == f63028f) {
                        return new int[]{i5, m4};
                    }
                    i5 += iArr[0] + iArr[1];
                    int i6 = i4 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i6);
                    iArr[i6] = 0;
                    iArr[i4] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z4 = !z4;
            }
            m4++;
        }
        throw NotFoundException.a();
    }

    private static char l(int i4) throws NotFoundException {
        int i5 = 0;
        while (true) {
            int[] iArr = f63027e;
            if (i5 >= iArr.length) {
                throw NotFoundException.a();
            }
            if (iArr[i5] == i4) {
                return f63026d[i5];
            }
            i5++;
        }
    }

    private static int m(int[] iArr) {
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int length = iArr.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int round = Math.round((iArr[i7] * 9.0f) / i4);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i7 & 1) == 0) {
                for (int i10 = 0; i10 < round; i10++) {
                    i6 = (i6 << 1) | 1;
                }
            } else {
                i6 <<= round;
            }
        }
        return i6;
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int m4 = aVar.m(k(aVar)[1]);
        int o4 = aVar.o();
        int[] iArr = this.f63030b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f63029a;
        sb.setLength(0);
        while (true) {
            r.f(aVar, m4, iArr);
            int m5 = m(iArr);
            if (m5 < 0) {
                throw NotFoundException.a();
            }
            char l4 = l(m5);
            sb.append(l4);
            int i5 = m4;
            for (int i6 : iArr) {
                i5 += i6;
            }
            int m6 = aVar.m(i5);
            if (l4 == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i7 = 0;
                for (int i10 : iArr) {
                    i7 += i10;
                }
                if (m6 == o4 || !aVar.k(m6)) {
                    throw NotFoundException.a();
                }
                if (sb.length() < 2) {
                    throw NotFoundException.a();
                }
                h(sb);
                sb.setLength(sb.length() - 2);
                float f4 = i4;
                return new com.google.zxing.n(j(sb), null, new com.google.zxing.p[]{new com.google.zxing.p((r14[1] + r14[0]) / 2.0f, f4), new com.google.zxing.p((i7 / 2.0f) + m4, f4)}, com.google.zxing.a.CODE_93);
            }
            m4 = m6;
        }
    }
}
