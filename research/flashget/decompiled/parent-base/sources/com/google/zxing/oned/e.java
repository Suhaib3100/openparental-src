package com.google.zxing.oned;

import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Code39Reader.java */
/* loaded from: classes6.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    static final String f63018e = ProtectedSandApp.s("૩\u0001");

    /* renamed from: f, reason: collision with root package name */
    static final int[] f63019f = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, net.minidev.json.parser.f.f81763q, 145, 400, 208, UserData.IS91_MSG_TYPE_SHORT_MESSAGE, 388, 196, SyslogAppender.LOG_LOCAL5, 162, 138, 42};

    /* renamed from: g, reason: collision with root package name */
    static final int f63020g = 148;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f63021a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f63022b;

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f63023c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f63024d;

    public e() {
        this(false, false);
    }

    private static String h(CharSequence charSequence) throws FormatException {
        int i4;
        char c5;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i5 = 0;
        while (i5 < length) {
            char charAt = charSequence.charAt(i5);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i5++;
                char charAt2 = charSequence.charAt(i5);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i4 = charAt2 - ' ';
                                } else {
                                    if (charAt2 != 'Z') {
                                        throw FormatException.a();
                                    }
                                    c5 = ':';
                                    sb.append(c5);
                                }
                            }
                            c5 = 0;
                            sb.append(c5);
                        } else {
                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                throw FormatException.a();
                            }
                            i4 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
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
                                if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                    throw FormatException.a();
                                }
                                c5 = com.google.common.base.c.N;
                            }
                            sb.append(c5);
                        }
                        c5 = 0;
                        sb.append(c5);
                    } else {
                        i4 = charAt2 + '+';
                    }
                } else {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        throw FormatException.a();
                    }
                    i4 = charAt2 - '@';
                }
                c5 = (char) i4;
                sb.append(c5);
            } else {
                sb.append(charAt);
            }
            i5++;
        }
        return sb.toString();
    }

    private static int[] i(com.google.zxing.common.a aVar, int[] iArr) throws NotFoundException {
        int o4 = aVar.o();
        int m4 = aVar.m(0);
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
                    if (k(iArr) == f63020g && aVar.q(Math.max(0, i5 - ((m4 - i5) / 2)), i5, false)) {
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

    private static char j(int i4) throws NotFoundException {
        int i5 = 0;
        while (true) {
            int[] iArr = f63019f;
            if (i5 >= iArr.length) {
                if (i4 == f63020g) {
                    return '*';
                }
                throw NotFoundException.a();
            }
            if (iArr[i5] == i4) {
                return ProtectedSandApp.s("૩\u0001").charAt(i5);
            }
            i5++;
        }
    }

    private static int k(int[] iArr) {
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 : iArr) {
                if (i6 < i5 && i6 > i4) {
                    i5 = i6;
                }
            }
            int i7 = 0;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                int i13 = iArr[i12];
                if (i13 > i5) {
                    i10 |= 1 << ((length - 1) - i12);
                    i7++;
                    i11 += i13;
                }
            }
            if (i7 == 3) {
                for (int i14 = 0; i14 < length && i7 > 0; i14++) {
                    int i15 = iArr[i14];
                    if (i15 > i5) {
                        i7--;
                        if ((i15 << 1) >= i11) {
                            return -1;
                        }
                    }
                }
                return i10;
            }
            if (i7 <= 3) {
                return -1;
            }
            i4 = i5;
        }
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        String s4;
        int[] iArr = this.f63024d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f63023c;
        sb.setLength(0);
        int m4 = aVar.m(i(aVar, iArr)[1]);
        int o4 = aVar.o();
        while (true) {
            r.f(aVar, m4, iArr);
            int k4 = k(iArr);
            if (k4 < 0) {
                throw NotFoundException.a();
            }
            char j4 = j(k4);
            sb.append(j4);
            int i5 = m4;
            for (int i6 : iArr) {
                i5 += i6;
            }
            int m5 = aVar.m(i5);
            if (j4 == '*') {
                sb.setLength(sb.length() - 1);
                int i7 = 0;
                for (int i10 : iArr) {
                    i7 += i10;
                }
                int i11 = (m5 - m4) - i7;
                if (m5 != o4 && (i11 << 1) < i7) {
                    throw NotFoundException.a();
                }
                if (this.f63021a) {
                    int length = sb.length() - 1;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        s4 = ProtectedSandApp.s("૩\u0001");
                        if (i12 >= length) {
                            break;
                        }
                        i13 += s4.indexOf(this.f63023c.charAt(i12));
                        i12++;
                    }
                    if (sb.charAt(length) != s4.charAt(i13 % 43)) {
                        throw ChecksumException.a();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw NotFoundException.a();
                }
                float f4 = i4;
                return new com.google.zxing.n(this.f63022b ? h(sb) : sb.toString(), null, new com.google.zxing.p[]{new com.google.zxing.p((r2[1] + r2[0]) / 2.0f, f4), new com.google.zxing.p((i7 / 2.0f) + m4, f4)}, com.google.zxing.a.CODE_39);
            }
            m4 = m5;
        }
    }

    public e(boolean z4) {
        this(z4, false);
    }

    public e(boolean z4, boolean z5) {
        this.f63021a = z4;
        this.f63022b = z5;
        this.f63023c = new StringBuilder(20);
        this.f63024d = new int[9];
    }
}
