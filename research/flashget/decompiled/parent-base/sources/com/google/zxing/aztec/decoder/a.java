package com.google.zxing.aztec.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import com.google.zxing.common.e;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.c;
import java.util.Arrays;

/* compiled from: Decoder.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f62597b = {ProtectedSandApp.s("ࢶ\u0001"), ProtectedSandApp.s("ࢷ\u0001"), ProtectedSandApp.s("ࢸ\u0001"), ProtectedSandApp.s("ࢹ\u0001"), ProtectedSandApp.s("ࢺ\u0001"), ProtectedSandApp.s("ࢻ\u0001"), ProtectedSandApp.s("ࢼ\u0001"), ProtectedSandApp.s("ࢽ\u0001"), ProtectedSandApp.s("ࢾ\u0001"), ProtectedSandApp.s("ࢿ\u0001"), ProtectedSandApp.s("ࣀ\u0001"), ProtectedSandApp.s("ࣁ\u0001"), ProtectedSandApp.s("ࣂ\u0001"), ProtectedSandApp.s("ࣃ\u0001"), ProtectedSandApp.s("ࣄ\u0001"), ProtectedSandApp.s("ࣅ\u0001"), ProtectedSandApp.s("ࣆ\u0001"), ProtectedSandApp.s("ࣇ\u0001"), ProtectedSandApp.s("ࣈ\u0001"), ProtectedSandApp.s("ࣉ\u0001"), ProtectedSandApp.s("࣊\u0001"), ProtectedSandApp.s("࣋\u0001"), ProtectedSandApp.s("࣌\u0001"), ProtectedSandApp.s("࣍\u0001"), ProtectedSandApp.s("࣎\u0001"), ProtectedSandApp.s("࣏\u0001"), ProtectedSandApp.s("࣐\u0001"), ProtectedSandApp.s("࣑\u0001"), ProtectedSandApp.s("࣒\u0001"), ProtectedSandApp.s("࣓\u0001"), ProtectedSandApp.s("ࢴ\u0001"), ProtectedSandApp.s("ࢵ\u0001")};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f62598c = {ProtectedSandApp.s("ࢶ\u0001"), ProtectedSandApp.s("ࢷ\u0001"), ProtectedSandApp.s("ࣔ\u0001"), ProtectedSandApp.s("ࣕ\u0001"), ProtectedSandApp.s("ࣖ\u0001"), ProtectedSandApp.s("ࣗ\u0001"), ProtectedSandApp.s("ࣘ\u0001"), ProtectedSandApp.s("ࣙ\u0001"), ProtectedSandApp.s("ࣚ\u0001"), ProtectedSandApp.s("ࣛ\u0001"), ProtectedSandApp.s("ࣜ\u0001"), ProtectedSandApp.s("ࣝ\u0001"), ProtectedSandApp.s("ࣞ\u0001"), ProtectedSandApp.s("ࣟ\u0001"), ProtectedSandApp.s("࣠\u0001"), ProtectedSandApp.s("࣡\u0001"), ProtectedSandApp.s("\u08e2\u0001"), ProtectedSandApp.s("ࣣ\u0001"), ProtectedSandApp.s("ࣤ\u0001"), ProtectedSandApp.s("ࣥ\u0001"), ProtectedSandApp.s("ࣦ\u0001"), ProtectedSandApp.s("ࣧ\u0001"), ProtectedSandApp.s("ࣨ\u0001"), ProtectedSandApp.s("ࣩ\u0001"), ProtectedSandApp.s("࣪\u0001"), ProtectedSandApp.s("࣫\u0001"), ProtectedSandApp.s("࣬\u0001"), ProtectedSandApp.s("࣭\u0001"), ProtectedSandApp.s("࣮\u0001"), ProtectedSandApp.s("࣓\u0001"), ProtectedSandApp.s("ࢴ\u0001"), ProtectedSandApp.s("ࢵ\u0001")};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f62599d = {ProtectedSandApp.s("ࢶ\u0001"), ProtectedSandApp.s("ࢷ\u0001"), ProtectedSandApp.s("ࣰ\u0001"), ProtectedSandApp.s("ࣱ\u0001"), ProtectedSandApp.s("ࣲ\u0001"), ProtectedSandApp.s("ࣳ\u0001"), ProtectedSandApp.s("ࣴ\u0001"), ProtectedSandApp.s("ࣵ\u0001"), ProtectedSandApp.s("ࣶ\u0001"), ProtectedSandApp.s("ࣷ\u0001"), ProtectedSandApp.s("ࣸ\u0001"), ProtectedSandApp.s("ࣹ\u0001"), ProtectedSandApp.s("ࣺ\u0001"), ProtectedSandApp.s("ࣻ\u0001"), ProtectedSandApp.s("ࣼ\u0001"), ProtectedSandApp.s("ࣽ\u0001"), ProtectedSandApp.s("ࣾ\u0001"), ProtectedSandApp.s("ࣿ\u0001"), ProtectedSandApp.s("ऀ\u0001"), ProtectedSandApp.s("ँ\u0001"), ProtectedSandApp.s("ं\u0001"), ProtectedSandApp.s("ः\u0001"), ProtectedSandApp.s("ऄ\u0001"), ProtectedSandApp.s("अ\u0001"), ProtectedSandApp.s("आ\u0001"), ProtectedSandApp.s("इ\u0001"), ProtectedSandApp.s("ई\u0001"), ProtectedSandApp.s("उ\u0001"), ProtectedSandApp.s("࣒\u0001"), ProtectedSandApp.s("ऊ\u0001"), ProtectedSandApp.s("࣯\u0001"), ProtectedSandApp.s("ࢵ\u0001")};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f62600e = {"", ProtectedSandApp.s("ࣼ\u0001"), ProtectedSandApp.s("ऌ\u0001"), ProtectedSandApp.s("ऍ\u0001"), ProtectedSandApp.s("ऎ\u0001"), ProtectedSandApp.s("ए\u0001"), ProtectedSandApp.s("ऐ\u0001"), ProtectedSandApp.s("ऑ\u0001"), ProtectedSandApp.s("ऒ\u0001"), ProtectedSandApp.s("ओ\u0001"), ProtectedSandApp.s("औ\u0001"), ProtectedSandApp.s("क\u0001"), ProtectedSandApp.s("ख\u0001"), ProtectedSandApp.s("ग\u0001"), ProtectedSandApp.s("घ\u0001"), ProtectedSandApp.s("ङ\u0001"), ProtectedSandApp.s("च\u0001"), ProtectedSandApp.s("छ\u0001"), ProtectedSandApp.s("ज\u0001"), ProtectedSandApp.s("झ\u0001"), ProtectedSandApp.s("ञ\u0001"), ProtectedSandApp.s("ट\u0001"), ProtectedSandApp.s("ठ\u0001"), ProtectedSandApp.s("ड\u0001"), ProtectedSandApp.s("ढ\u0001"), ProtectedSandApp.s("ण\u0001"), ProtectedSandApp.s("त\u0001"), ProtectedSandApp.s("थ\u0001"), ProtectedSandApp.s("द\u0001"), ProtectedSandApp.s("ध\u0001"), ProtectedSandApp.s("ऋ\u0001"), ProtectedSandApp.s("ऊ\u0001")};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f62601f = {ProtectedSandApp.s("ࢶ\u0001"), ProtectedSandApp.s("ࢷ\u0001"), ProtectedSandApp.s("न\u0001"), ProtectedSandApp.s("ऩ\u0001"), ProtectedSandApp.s("प\u0001"), ProtectedSandApp.s("फ\u0001"), ProtectedSandApp.s("ब\u0001"), ProtectedSandApp.s("भ\u0001"), ProtectedSandApp.s("म\u0001"), ProtectedSandApp.s("य\u0001"), ProtectedSandApp.s("र\u0001"), ProtectedSandApp.s("ऱ\u0001"), ProtectedSandApp.s("छ\u0001"), ProtectedSandApp.s("झ\u0001"), ProtectedSandApp.s("ऊ\u0001"), ProtectedSandApp.s("࣮\u0001")};

    /* renamed from: a, reason: collision with root package name */
    private oa.a f62602a;

    /* compiled from: Decoder.java */
    /* renamed from: com.google.zxing.aztec.decoder.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0955a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62603a;

        static {
            int[] iArr = new int[b.values().length];
            f62603a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62603a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62603a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62603a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62603a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: Decoder.java */
    private enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            bArr[i4] = i(zArr, i4 << 3);
        }
        return bArr;
    }

    private boolean[] b(boolean[] zArr) throws FormatException {
        int i4;
        com.google.zxing.common.reedsolomon.a aVar;
        if (this.f62602a.d() <= 2) {
            aVar = com.google.zxing.common.reedsolomon.a.f62813j;
            i4 = 6;
        } else {
            i4 = 8;
            if (this.f62602a.d() <= 8) {
                aVar = com.google.zxing.common.reedsolomon.a.f62817n;
            } else if (this.f62602a.d() <= 22) {
                aVar = com.google.zxing.common.reedsolomon.a.f62812i;
                i4 = 10;
            } else {
                aVar = com.google.zxing.common.reedsolomon.a.f62811h;
                i4 = 12;
            }
        }
        int c5 = this.f62602a.c();
        int length = zArr.length / i4;
        if (length < c5) {
            throw FormatException.a();
        }
        int length2 = zArr.length % i4;
        int[] iArr = new int[length];
        int i5 = 0;
        while (i5 < length) {
            iArr[i5] = j(zArr, length2, i4);
            i5++;
            length2 += i4;
        }
        try {
            new c(aVar).a(iArr, length - c5);
            int i6 = 1 << i4;
            int i7 = i6 - 1;
            int i10 = 0;
            for (int i11 = 0; i11 < c5; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0 || i12 == i7) {
                    throw FormatException.a();
                }
                if (i12 == 1 || i12 == i6 - 2) {
                    i10++;
                }
            }
            boolean[] zArr2 = new boolean[(c5 * i4) - i10];
            int i13 = 0;
            for (int i14 = 0; i14 < c5; i14++) {
                int i15 = iArr[i14];
                if (i15 == 1 || i15 == i6 - 2) {
                    Arrays.fill(zArr2, i13, (i13 + i4) - 1, i15 > 1);
                    i13 = (i4 - 1) + i13;
                } else {
                    int i16 = i4 - 1;
                    while (i16 >= 0) {
                        int i17 = i13 + 1;
                        zArr2[i13] = ((1 << i16) & i15) != 0;
                        i16--;
                        i13 = i17;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e4) {
            throw FormatException.b(e4);
        }
    }

    private boolean[] d(com.google.zxing.common.b bVar) {
        boolean e4 = this.f62602a.e();
        int d5 = this.f62602a.d();
        int i4 = (e4 ? 11 : 14) + (d5 << 2);
        int[] iArr = new int[i4];
        boolean[] zArr = new boolean[k(d5, e4)];
        int i5 = 2;
        if (e4) {
            for (int i6 = 0; i6 < i4; i6++) {
                iArr[i6] = i6;
            }
        } else {
            int i7 = i4 / 2;
            int i10 = ((((i7 - 1) / 15) * 2) + (i4 + 1)) / 2;
            for (int i11 = 0; i11 < i7; i11++) {
                iArr[(i7 - i11) - 1] = (i10 - r12) - 1;
                iArr[i7 + i11] = (i11 / 15) + i11 + i10 + 1;
            }
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < d5) {
            int i14 = ((d5 - i12) << i5) + (e4 ? 9 : 12);
            int i15 = i12 << 1;
            int i16 = (i4 - 1) - i15;
            int i17 = 0;
            while (i17 < i14) {
                int i18 = i17 << 1;
                int i19 = 0;
                while (i19 < i5) {
                    int i20 = i15 + i19;
                    int i21 = i15 + i17;
                    zArr[i13 + i18 + i19] = bVar.f(iArr[i20], iArr[i21]);
                    int i22 = iArr[i21];
                    int i23 = i16 - i19;
                    zArr[(i14 * 2) + i13 + i18 + i19] = bVar.f(i22, iArr[i23]);
                    int i24 = i16 - i17;
                    zArr[(i14 * 4) + i13 + i18 + i19] = bVar.f(iArr[i23], iArr[i24]);
                    zArr[(i14 * 6) + i13 + i18 + i19] = bVar.f(iArr[i24], iArr[i20]);
                    i19++;
                    d5 = d5;
                    e4 = e4;
                    i5 = 2;
                }
                i17++;
                i5 = 2;
            }
            i13 += i14 << 3;
            i12++;
            i5 = 2;
        }
        return zArr;
    }

    private static String e(b bVar, int i4) {
        int i5 = C0955a.f62603a[bVar.ordinal()];
        if (i5 == 1) {
            return f62597b[i4];
        }
        if (i5 == 2) {
            return f62598c[i4];
        }
        if (i5 == 3) {
            return f62599d[i4];
        }
        if (i5 == 4) {
            return f62600e[i4];
        }
        if (i5 == 5) {
            return f62601f[i4];
        }
        throw new IllegalStateException(ProtectedSandApp.s("ल\u0001"));
    }

    private static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        b bVar2 = bVar;
        int i4 = 0;
        while (i4 < length) {
            if (bVar != b.BINARY) {
                int i5 = bVar == b.DIGIT ? 4 : 5;
                if (length - i4 < i5) {
                    break;
                }
                int j4 = j(zArr, i4, i5);
                i4 += i5;
                String e4 = e(bVar, j4);
                if (e4.startsWith(ProtectedSandApp.s("ळ\u0001"))) {
                    bVar2 = g(e4.charAt(5));
                    if (e4.charAt(6) != 'L') {
                        bVar2 = bVar;
                        bVar = bVar2;
                    }
                } else {
                    sb.append(e4);
                }
                bVar = bVar2;
            } else {
                if (length - i4 < 5) {
                    break;
                }
                int j5 = j(zArr, i4, 5);
                int i6 = i4 + 5;
                if (j5 == 0) {
                    if (length - i6 < 11) {
                        break;
                    }
                    j5 = j(zArr, i6, 11) + 31;
                    i6 = i4 + 16;
                }
                int i7 = 0;
                while (true) {
                    if (i7 >= j5) {
                        i4 = i6;
                        break;
                    }
                    if (length - i6 < 8) {
                        i4 = length;
                        break;
                    }
                    sb.append((char) j(zArr, i6, 8));
                    i6 += 8;
                    i7++;
                }
                bVar = bVar2;
            }
        }
        return sb.toString();
    }

    private static b g(char c5) {
        return c5 != 'B' ? c5 != 'D' ? c5 != 'P' ? c5 != 'L' ? c5 != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : b.DIGIT : b.BINARY;
    }

    public static String h(boolean[] zArr) {
        return f(zArr);
    }

    private static byte i(boolean[] zArr, int i4) {
        int length = zArr.length - i4;
        return (byte) (length >= 8 ? j(zArr, i4, 8) : j(zArr, i4, length) << (8 - length));
    }

    private static int j(boolean[] zArr, int i4, int i5) {
        int i6 = 0;
        for (int i7 = i4; i7 < i4 + i5; i7++) {
            i6 <<= 1;
            if (zArr[i7]) {
                i6 |= 1;
            }
        }
        return i6;
    }

    private static int k(int i4, boolean z4) {
        return ((z4 ? 88 : 112) + (i4 << 4)) * i4;
    }

    public e c(oa.a aVar) throws FormatException {
        this.f62602a = aVar;
        boolean[] b5 = b(d(aVar.a()));
        e eVar = new e(a(b5), f(b5), null, null);
        eVar.n(b5.length);
        return eVar;
    }
}
