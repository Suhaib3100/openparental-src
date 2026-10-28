package com.google.zxing.pdf417.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.primitives.u;
import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okio.r0;

/* compiled from: PDF417HighLevelEncoder.java */
/* loaded from: classes6.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f63262a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f63263b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f63264c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f63265d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f63266e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f63267f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f63268g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f63269h = 900;

    /* renamed from: i, reason: collision with root package name */
    private static final int f63270i = 901;

    /* renamed from: j, reason: collision with root package name */
    private static final int f63271j = 902;

    /* renamed from: k, reason: collision with root package name */
    private static final int f63272k = 913;

    /* renamed from: l, reason: collision with root package name */
    private static final int f63273l = 924;

    /* renamed from: m, reason: collision with root package name */
    private static final int f63274m = 925;

    /* renamed from: n, reason: collision with root package name */
    private static final int f63275n = 926;

    /* renamed from: o, reason: collision with root package name */
    private static final int f63276o = 927;

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f63279r;

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f63277p = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, kotlin.io.encoding.a.f75126h, 94, 0, 32, 0, 0, 0};

    /* renamed from: q, reason: collision with root package name */
    private static final byte[] f63278q = {59, 60, 62, u.f57540a, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, r0.f85265a, 123, 125, 39, 0};

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f63280s = new byte[128];

    /* renamed from: t, reason: collision with root package name */
    private static final Charset f63281t = StandardCharsets.ISO_8859_1;

    /* compiled from: PDF417HighLevelEncoder.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63282a;

        static {
            int[] iArr = new int[c.values().length];
            f63282a = iArr;
            try {
                iArr[c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63282a[c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63282a[c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        int i4 = 0;
        byte[] bArr = new byte[128];
        f63279r = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i5 = 0;
        while (true) {
            byte[] bArr2 = f63277p;
            if (i5 >= bArr2.length) {
                break;
            }
            byte b5 = bArr2[i5];
            if (b5 > 0) {
                f63279r[b5] = (byte) i5;
            }
            i5++;
        }
        Arrays.fill(f63280s, (byte) -1);
        while (true) {
            byte[] bArr3 = f63278q;
            if (i4 >= bArr3.length) {
                return;
            }
            byte b6 = bArr3[i4];
            if (b6 > 0) {
                f63280s[b6] = (byte) i4;
            }
            i4++;
        }
    }

    private g() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) throws com.google.zxing.WriterException {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L9:
            if (r1 >= r0) goto L5f
            char r2 = r5.charAt(r1)
            r3 = 0
        L10:
            r4 = 13
            if (r3 >= r4) goto L25
            boolean r2 = k(r2)
            if (r2 == 0) goto L25
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L25
            char r2 = r5.charAt(r2)
            goto L10
        L25:
            if (r3 < r4) goto L29
            int r1 = r1 - r6
            return r1
        L29:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L36
            int r1 = r1 + 1
            goto L9
        L36:
            com.google.zxing.WriterException r5 = new com.google.zxing.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "ఫ\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = "బ\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L5f:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.g.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    private static int b(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        int i5 = 0;
        if (i4 < length) {
            char charAt = charSequence.charAt(i4);
            while (k(charAt) && i4 < length) {
                i5++;
                i4++;
                if (i4 < length) {
                    charAt = charSequence.charAt(i4);
                }
            }
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = r7
        L5:
            if (r1 >= r0) goto L37
            char r2 = r6.charAt(r1)
            r3 = 0
        Lc:
            r4 = 13
            if (r3 >= r4) goto L23
            boolean r5 = k(r2)
            if (r5 == 0) goto L23
            if (r1 >= r0) goto L23
            int r3 = r3 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Lc
            char r2 = r6.charAt(r1)
            goto Lc
        L23:
            if (r3 < r4) goto L28
            int r1 = r1 - r7
            int r1 = r1 - r3
            return r1
        L28:
            if (r3 > 0) goto L5
            char r2 = r6.charAt(r1)
            boolean r2 = n(r2)
            if (r2 == 0) goto L37
            int r1 = r1 + 1
            goto L5
        L37:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.g.c(java.lang.CharSequence, int):int");
    }

    private static void d(byte[] bArr, int i4, int i5, int i6, StringBuilder sb) {
        int i7;
        if (i5 == 1 && i6 == 0) {
            sb.append((char) 913);
        } else if (i5 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i5 >= 6) {
            char[] cArr = new char[5];
            i7 = i4;
            while ((i4 + i5) - i7 >= 6) {
                long j4 = 0;
                for (int i10 = 0; i10 < 6; i10++) {
                    j4 = (j4 << 8) + (bArr[i7 + i10] & 255);
                }
                for (int i11 = 0; i11 < 5; i11++) {
                    cArr[i11] = (char) (j4 % 900);
                    j4 /= 900;
                }
                for (int i12 = 4; i12 >= 0; i12--) {
                    sb.append(cArr[i12]);
                }
                i7 += 6;
            }
        } else {
            i7 = i4;
        }
        while (i7 < i4 + i5) {
            sb.append((char) (bArr[i7] & 255));
            i7++;
        }
    }

    static String e(String str, c cVar, Charset charset) throws WriterException {
        com.google.zxing.common.d characterSetECIByName;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f63281t;
        } else if (!f63281t.equals(charset) && (characterSetECIByName = com.google.zxing.common.d.getCharacterSetECIByName(charset.name())) != null) {
            h(characterSetECIByName.getValue(), sb);
        }
        int length = str.length();
        int i4 = a.f63282a[cVar.ordinal()];
        if (i4 == 1) {
            g(str, 0, length, sb, 0);
        } else if (i4 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb);
        } else if (i4 != 3) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < length) {
                int b5 = b(str, i5);
                if (b5 >= 13) {
                    sb.append((char) 902);
                    f(str, i5, b5, sb);
                    i5 += b5;
                    i6 = 0;
                    i7 = 2;
                } else {
                    int c5 = c(str, i5);
                    if (c5 >= 5 || b5 == length) {
                        if (i7 != 0) {
                            sb.append((char) 900);
                            i6 = 0;
                            i7 = 0;
                        }
                        i6 = g(str, i5, c5, sb, i6);
                        i5 += c5;
                    } else {
                        int a5 = a(str, i5, charset);
                        if (a5 == 0) {
                            a5 = 1;
                        }
                        int i10 = a5 + i5;
                        byte[] bytes2 = str.substring(i5, i10).getBytes(charset);
                        if (bytes2.length == 1 && i7 == 0) {
                            d(bytes2, 0, 1, 0, sb);
                        } else {
                            d(bytes2, 0, bytes2.length, i7, sb);
                            i7 = 1;
                            i6 = 0;
                        }
                        i5 = i10;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            f(str, 0, length, sb);
        }
        return sb.toString();
    }

    private static void f(String str, int i4, int i5, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i5 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i6 = 0;
        while (i6 < i5) {
            sb2.setLength(0);
            int min = Math.min(44, i5 - i6);
            StringBuilder sb3 = new StringBuilder(ProtectedSandApp.s("భ\u0001"));
            int i7 = i4 + i6;
            sb3.append(str.substring(i7, i7 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i6 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4 A[EDGE_INSN: B:21:0x00f4->B:22:0x00f4 BREAK  A[LOOP:0: B:2:0x000f->B:16:0x000f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.g.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void h(int i4, StringBuilder sb) throws WriterException {
        if (i4 >= 0 && i4 < 900) {
            sb.append((char) 927);
            sb.append((char) i4);
        } else if (i4 < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i4 / 900) - 1));
            sb.append((char) (i4 % 900));
        } else {
            if (i4 >= 811800) {
                throw new WriterException(ProtectedSandApp.s("మ\u0001").concat(String.valueOf(i4)));
            }
            sb.append((char) 925);
            sb.append((char) (810900 - i4));
        }
    }

    private static boolean i(char c5) {
        if (c5 != ' ') {
            return c5 >= 'a' && c5 <= 'z';
        }
        return true;
    }

    private static boolean j(char c5) {
        if (c5 != ' ') {
            return c5 >= 'A' && c5 <= 'Z';
        }
        return true;
    }

    private static boolean k(char c5) {
        return c5 >= '0' && c5 <= '9';
    }

    private static boolean l(char c5) {
        return f63279r[c5] != -1;
    }

    private static boolean m(char c5) {
        return f63280s[c5] != -1;
    }

    private static boolean n(char c5) {
        if (c5 == '\t' || c5 == '\n' || c5 == '\r') {
            return true;
        }
        return c5 >= ' ' && c5 <= '~';
    }
}
