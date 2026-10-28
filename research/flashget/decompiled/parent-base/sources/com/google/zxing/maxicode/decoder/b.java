package com.google.zxing.maxicode.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.common.e;
import java.text.DecimalFormat;

/* compiled from: DecodedBitStreamParser.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final char f62925a = 65520;

    /* renamed from: b, reason: collision with root package name */
    private static final char f62926b = 65521;

    /* renamed from: c, reason: collision with root package name */
    private static final char f62927c = 65522;

    /* renamed from: d, reason: collision with root package name */
    private static final char f62928d = 65523;

    /* renamed from: e, reason: collision with root package name */
    private static final char f62929e = 65524;

    /* renamed from: f, reason: collision with root package name */
    private static final char f62930f = 65525;

    /* renamed from: g, reason: collision with root package name */
    private static final char f62931g = 65526;

    /* renamed from: h, reason: collision with root package name */
    private static final char f62932h = 65527;

    /* renamed from: i, reason: collision with root package name */
    private static final char f62933i = 65528;

    /* renamed from: j, reason: collision with root package name */
    private static final char f62934j = 65529;

    /* renamed from: k, reason: collision with root package name */
    private static final char f62935k = 65530;

    /* renamed from: l, reason: collision with root package name */
    private static final char f62936l = 65531;

    /* renamed from: m, reason: collision with root package name */
    private static final char f62937m = 65532;

    /* renamed from: n, reason: collision with root package name */
    private static final char f62938n = 28;

    /* renamed from: o, reason: collision with root package name */
    private static final char f62939o = 29;

    /* renamed from: p, reason: collision with root package name */
    private static final char f62940p = 30;

    /* renamed from: q, reason: collision with root package name */
    private static final String[] f62941q = {ProtectedSandApp.s("ી\u0001"), ProtectedSandApp.s("ુ\u0001"), ProtectedSandApp.s("ૂ\u0001"), ProtectedSandApp.s("ૃ\u0001"), ProtectedSandApp.s("ા\u0001"), ProtectedSandApp.s("િ\u0001")};

    private b() {
    }

    static e a(byte[] bArr, int i4) {
        String h4;
        StringBuilder sb = new StringBuilder(144);
        if (i4 == 2 || i4 == 3) {
            if (i4 == 2) {
                h4 = new DecimalFormat(ProtectedSandApp.s("ૄ\u0001").substring(0, g(bArr))).format(f(bArr));
            } else {
                h4 = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat(ProtectedSandApp.s("ૅ\u0001"));
            String format = decimalFormat.format(c(bArr));
            String format2 = decimalFormat.format(i(bArr));
            sb.append(e(bArr, 10, 84));
            if (sb.toString().startsWith(ProtectedSandApp.s("\u0ac6\u0001"))) {
                sb.insert(9, h4 + f62939o + format + f62939o + format2 + f62939o);
            } else {
                sb.insert(0, h4 + f62939o + format + f62939o + format2 + f62939o);
            }
        } else if (i4 == 4) {
            sb.append(e(bArr, 1, 93));
        } else if (i4 == 5) {
            sb.append(e(bArr, 1, 77));
        }
        return new e(bArr, sb.toString(), null, String.valueOf(i4));
    }

    private static int b(int i4, byte[] bArr) {
        int i5 = i4 - 1;
        return ((1 << (5 - (i5 % 6))) & bArr[i5 / 6]) == 0 ? 0 : 1;
    }

    private static int c(byte[] bArr) {
        return d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    private static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int i4 = 0;
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            i4 += b(bArr2[i5], bArr) << ((bArr2.length - i5) - 1);
        }
        return i4;
    }

    private static String e(byte[] bArr, int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        int i6 = i4;
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (i6 < i4 + i5) {
            char charAt = f62941q[i10].charAt(bArr[i6]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i11 = i10;
                    i10 = charAt - f62925a;
                    i7 = 1;
                    break;
                case 65525:
                    i7 = 2;
                    i11 = i10;
                    i10 = 0;
                    break;
                case 65526:
                    i7 = 3;
                    i11 = i10;
                    i10 = 0;
                    break;
                case 65527:
                    i7 = -1;
                    i10 = 0;
                    break;
                case 65528:
                    i7 = -1;
                    i10 = 1;
                    break;
                case 65529:
                    i7 = -1;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    break;
                case 65531:
                    int i12 = (bArr[i6 + 1] << com.google.common.base.c.B) + (bArr[i6 + 2] << com.google.common.base.c.f54875u) + (bArr[i6 + 3] << 12) + (bArr[i6 + 4] << 6);
                    i6 += 5;
                    sb.append(new DecimalFormat(ProtectedSandApp.s("ે\u0001")).format(i12 + bArr[i6]));
                    break;
            }
            int i13 = i7 - 1;
            if (i7 == 0) {
                i10 = i11;
            }
            i6++;
            i7 = i13;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private static int f(byte[] bArr) {
        return d(bArr, new byte[]{33, 34, 35, 36, com.google.common.base.c.C, 26, 27, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, 19, com.google.common.base.c.f54878x, com.google.common.base.c.f54879y, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.B, 13, 14, com.google.common.base.c.f54871q, com.google.common.base.c.f54872r, 17, com.google.common.base.c.f54875u, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    private static int g(byte[] bArr) {
        return d(bArr, new byte[]{39, 40, 41, 42, com.google.common.base.c.I, 32});
    }

    private static String h(byte[] bArr) {
        String[] strArr = f62941q;
        return String.valueOf(new char[]{strArr[0].charAt(d(bArr, new byte[]{39, 40, 41, 42, com.google.common.base.c.I, 32})), strArr[0].charAt(d(bArr, new byte[]{33, 34, 35, 36, com.google.common.base.c.C, 26})), strArr[0].charAt(d(bArr, new byte[]{27, com.google.common.base.c.F, com.google.common.base.c.G, com.google.common.base.c.H, 19, com.google.common.base.c.f54878x})), strArr[0].charAt(d(bArr, new byte[]{com.google.common.base.c.f54879y, com.google.common.base.c.f54880z, com.google.common.base.c.A, com.google.common.base.c.B, 13, 14})), strArr[0].charAt(d(bArr, new byte[]{com.google.common.base.c.f54871q, com.google.common.base.c.f54872r, 17, com.google.common.base.c.f54875u, 7, 8})), strArr[0].charAt(d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    private static int i(byte[] bArr) {
        return d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
