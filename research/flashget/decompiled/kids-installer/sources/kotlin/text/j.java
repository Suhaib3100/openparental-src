package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p2;
import kotlin.ranges.IntRange;

/* compiled from: HexExtensions.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a@\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000\u001a@\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000\u001a \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u001a,\u0010\u0016\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u001a,\u0010\u001b\u001a\u00020\u001c*\u00020\u00032\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a\u001c\u0010!\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002\u001a\u0014\u0010\"\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH\u0002\u001a*\u0010#\u001a\u00020$*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010#\u001a\u00020$*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010'\u001a\u00020(*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010'\u001a\u00020(*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010)\u001a\u00020\t*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010)\u001a\u00020\t*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010*\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010*\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a0\u0010+\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\tH\u0003\u001a*\u0010,\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010,\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010.\u001a\u00020\u0003*\u00020(2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020(2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020-2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u001c\u0010/\u001a\u00020\u0003*\u00020\u00062\u0006\u0010%\u001a\u00020&2\u0006\u00100\u001a\u00020\tH\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"HEX_DIGITS_TO_DECIMAL", "", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "formattedStringLength", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "part", "index", "endIndex", "partName", "checkHexLength", "", "startIndex", "maxDigits", "requireMaxLength", "", "checkNewLineAt", "decimalFromHexDigitAt", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "", "hexToInt", "hexToLong", "hexToLongImpl", "hexToShort", "", "toHexString", "toHexStringImpl", "bits", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,591:1\n1#2:592\n1183#3,3:593\n1183#3,3:596\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n13#1:593,3\n14#1:596,3\n*E\n"})
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final String f27076a = ProtectedSandApp.s("嫒");

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final String f27077b = ProtectedSandApp.s("嫓");

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final int[] f27078c;

    static {
        int[] iArr = new int[128];
        int i5 = 0;
        for (int i6 = 0; i6 < 128; i6++) {
            iArr[i6] = -1;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            String s5 = ProtectedSandApp.s("嫔");
            if (i7 >= s5.length()) {
                break;
            }
            iArr[s5.charAt(i7)] = i8;
            i7++;
            i8++;
        }
        int i9 = 0;
        while (true) {
            String s6 = ProtectedSandApp.s("嫕");
            if (i5 >= s6.length()) {
                f27078c = iArr;
                return;
            } else {
                iArr[s6.charAt(i5)] = i9;
                i5++;
                i9++;
            }
        }
    }

    static short A(String str, int i5, int i6, HexFormat hexFormat, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return y(str, i5, i6, hexFormat);
    }

    public static short B(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return z(str, hexFormat);
    }

    public static final int C(int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        long a6;
        if (!(i5 > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嫖").toString());
        }
        long j5 = i10 + 2 + i11;
        long a7 = a(j5, i7, i9);
        if (i6 <= i7) {
            a6 = a(j5, i6, i9);
        } else {
            a6 = a(a7, i6 / i7, i8);
            int i12 = i6 % i7;
            if (i12 != 0) {
                a6 = a6 + i8 + a(j5, i12, i9);
            }
        }
        long j6 = i5;
        long Q = Q(j6, a6, 1);
        long j7 = j6 - ((a6 + 1) * Q);
        long Q2 = Q(j7, a7, i8);
        long j8 = j7 - ((a7 + i8) * Q2);
        long Q3 = Q(j8, j5, i9);
        return (int) ((Q2 * i7) + (Q * i6) + Q3 + (j8 - ((j5 + ((long) i9)) * Q3) > 0 ? 1 : 0));
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @d5.d
    public static final String D(byte b6, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嫗"));
        return P(b6, hexFormat, 8);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @d5.d
    public static final String E(int i5, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嫘"));
        return P(i5, hexFormat, 32);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @d5.d
    public static final String F(long j5, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嫙"));
        return P(j5, hexFormat, 64);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @d5.d
    public static final String G(short s5, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嫚"));
        return P(s5, hexFormat, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[SYNTHETIC] */
    @kotlin.ExperimentalStdlibApi
    @kotlin.SinceKotlin(version = "1.9")
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String H(@d5.d byte[] r17, int r18, int r19, @d5.d kotlin.text.HexFormat r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "嫛"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.p(r0, r3)
            java.lang.String r3 = "嫜"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            r4 = r20
            kotlin.jvm.internal.l0.p(r4, r3)
            kotlin.collections.c$a r3 = kotlin.collections.AbstractList.f23126o
            int r5 = r0.length
            r3.a(r1, r2, r5)
            if (r1 != r2) goto L25
            java.lang.String r0 = ""
            return r0
        L25:
            boolean r3 = r20.getF27093a()
            if (r3 == 0) goto L32
            java.lang.String r3 = "嫝"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            goto L38
        L32:
            java.lang.String r3 = "嫞"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
        L38:
            kotlin.text.k$b r4 = r20.getF27094b()
            int r12 = r4.getF27101a()
            int r13 = r4.getF27102b()
            java.lang.String r14 = r4.getF27105e()
            java.lang.String r15 = r4.getF27106f()
            java.lang.String r11 = r4.getF27104d()
            java.lang.String r4 = r4.getF27103c()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r1 = r11
            r11 = r16
            int r5 = f(r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r8 = r18
            r9 = 0
            r10 = 0
        L78:
            if (r8 >= r2) goto Lb2
            r7 = r0[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r9 != r12) goto L88
            r9 = 10
            r6.append(r9)
            r9 = 0
        L86:
            r10 = 0
            goto L8e
        L88:
            if (r10 != r13) goto L8e
            r6.append(r4)
            goto L86
        L8e:
            if (r10 == 0) goto L93
            r6.append(r1)
        L93:
            r6.append(r14)
            int r11 = r7 >> 4
            char r11 = r3.charAt(r11)
            r6.append(r11)
            r7 = r7 & 15
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r6.append(r15)
            int r10 = r10 + 1
            r7 = 1
            int r9 = r9 + r7
            int r8 = r8 + 1
            goto L78
        Lb2:
            r7 = 1
            int r0 = r6.length()
            if (r5 != r0) goto Lba
            goto Lbb
        Lba:
            r7 = 0
        Lbb:
            if (r7 == 0) goto Lcb
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "嫟"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            return r0
        Lcb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "嫠"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.j.H(byte[], int, int, kotlin.text.k):java.lang.String");
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @d5.d
    public static final String I(@d5.d byte[] bArr, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("嫡"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嫢"));
        return H(bArr, 0, bArr.length, hexFormat);
    }

    public static String J(byte b6, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return D(b6, hexFormat);
    }

    public static String K(int i5, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return E(i5, hexFormat);
    }

    public static String L(long j5, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return F(j5, hexFormat);
    }

    public static String M(short s5, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return G(s5, hexFormat);
    }

    public static String N(byte[] bArr, int i5, int i6, HexFormat hexFormat, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = bArr.length;
        }
        if ((i7 & 4) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return H(bArr, i5, i6, hexFormat);
    }

    public static String O(byte[] bArr, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return I(bArr, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final String P(long j5, HexFormat hexFormat, int i5) {
        if (!((i5 & 3) == 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嫦").toString());
        }
        String s5 = hexFormat.getF27093a() ? ProtectedSandApp.s("嫣") : ProtectedSandApp.s("嫤");
        String f27115a = hexFormat.getF27095c().getF27115a();
        String f27116b = hexFormat.getF27095c().getF27116b();
        int length = f27116b.length() + f27115a.length() + (i5 >> 2);
        boolean f27117c = hexFormat.getF27095c().getF27117c();
        StringBuilder sb = new StringBuilder(length);
        sb.append(f27115a);
        while (i5 > 0) {
            i5 -= 4;
            int i6 = (int) ((j5 >> i5) & 15);
            f27117c = f27117c && i6 == 0 && i5 > 0;
            if (!f27117c) {
                sb.append(s5.charAt(i6));
            }
        }
        sb.append(f27116b);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("嫥"));
        return sb2;
    }

    private static final long Q(long j5, long j6, int i5) {
        if (j5 <= 0 || j6 <= 0) {
            return 0L;
        }
        long j7 = i5;
        return (j5 + j7) / (j6 + j7);
    }

    private static final long a(long j5, int i5, int i6) {
        if (!(i5 > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嫧").toString());
        }
        long j6 = i5;
        return ((j6 - 1) * i6) + (j5 * j6);
    }

    private static final int b(String str, String str2, int i5, int i6, String str3) {
        int length = str2.length() + i5;
        if (length <= i6 && e0.b2(str, i5, str2, 0, str2.length(), true)) {
            return length;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("嫨"));
        sb.append(str3);
        sb.append(ProtectedSandApp.s("嫩"));
        sb.append(str2);
        sb.append(ProtectedSandApp.s("嫪"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("嫫"));
        if (length <= i6) {
            i6 = length;
        }
        kotlin.jvm.internal.l0.n(str, ProtectedSandApp.s("嫬"));
        String substring = str.substring(i5, i6);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("嫭"));
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    private static final void c(String str, int i5, int i6, int i7, boolean z5) {
        int i8 = i6 - i5;
        boolean z6 = true;
        if (!z5 ? i8 > i7 : i8 != i7) {
            z6 = false;
        }
        if (z6) {
            return;
        }
        String s5 = z5 ? ProtectedSandApp.s("嫮") : ProtectedSandApp.s("嫯");
        kotlin.jvm.internal.l0.n(str, ProtectedSandApp.s("嫰"));
        String substring = str.substring(i5, i6);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("嫱"));
        throw new NumberFormatException(ProtectedSandApp.s("嫲") + s5 + ' ' + i7 + ProtectedSandApp.s("嫳") + i5 + ProtectedSandApp.s("嫴") + substring + ProtectedSandApp.s("嫵") + i8);
    }

    private static final int d(String str, int i5, int i6) {
        if (str.charAt(i5) == '\r') {
            int i7 = i5 + 1;
            return (i7 >= i6 || str.charAt(i7) != '\n') ? i7 : i5 + 2;
        }
        if (str.charAt(i5) == '\n') {
            return i5 + 1;
        }
        StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("嫶"), i5, ProtectedSandApp.s("嫷"));
        a6.append(str.charAt(i5));
        throw new NumberFormatException(a6.toString());
    }

    private static final int e(String str, int i5) {
        int i6;
        char charAt = str.charAt(i5);
        if (charAt <= 127 && (i6 = f27078c[charAt]) >= 0) {
            return i6;
        }
        StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("嫸"), i5, ProtectedSandApp.s("嫹"));
        a6.append(str.charAt(i5));
        throw new NumberFormatException(a6.toString());
    }

    public static final int f(int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        boolean K0;
        if (!(i5 > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嫻").toString());
        }
        int i12 = (i5 - 1) / i6;
        int i13 = (i6 - 1) / i7;
        int i14 = i5 % i6;
        if (i14 != 0) {
            i6 = i14;
        }
        long j5 = ((i10 + 2 + i11) * i5) + (((r2 - i12) - r4) * i9) + (((i13 * i12) + ((i6 - 1) / i7)) * i8) + i12;
        K0 = kotlin.ranges.u.K0(new IntRange(0, Integer.MAX_VALUE), j5);
        if (K0) {
            return (int) j5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("嫺") + ((Object) p2.k(ULong.r(j5))));
    }

    @ExperimentalStdlibApi
    private static final byte g(String str, int i5, int i6, HexFormat hexFormat) {
        return (byte) w(str, i5, i6, hexFormat, 2);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final byte h(@d5.d String str, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嫼"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嫽"));
        return g(str, 0, str.length(), hexFormat);
    }

    static byte i(String str, int i5, int i6, HexFormat hexFormat, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return g(str, i5, i6, hexFormat);
    }

    public static byte j(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return h(str, hexFormat);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[SYNTHETIC] */
    @kotlin.ExperimentalStdlibApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final byte[] k(java.lang.String r17, int r18, int r19, kotlin.text.HexFormat r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            kotlin.collections.c$a r3 = kotlin.collections.AbstractList.f23126o
            int r4 = r17.length()
            r3.a(r1, r2, r4)
            r3 = 0
            if (r1 != r2) goto L15
            byte[] r0 = new byte[r3]
            return r0
        L15:
            kotlin.text.k$b r4 = r20.getF27094b()
            int r12 = r4.getF27101a()
            int r13 = r4.getF27102b()
            java.lang.String r14 = r4.getF27105e()
            java.lang.String r15 = r4.getF27106f()
            java.lang.String r11 = r4.getF27104d()
            java.lang.String r4 = r4.getF27103c()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r3 = r11
            r11 = r16
            int r5 = C(r5, r6, r7, r8, r9, r10, r11)
            byte[] r6 = new byte[r5]
            r7 = 0
            r8 = 0
            r9 = 0
        L51:
            if (r1 >= r2) goto Laf
            if (r8 != r12) goto L5c
            int r1 = d(r0, r1, r2)
            r8 = 0
        L5a:
            r9 = 0
            goto L75
        L5c:
            if (r9 != r13) goto L69
            java.lang.String r9 = "嫾"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            int r1 = b(r0, r4, r1, r2, r9)
            goto L5a
        L69:
            if (r9 == 0) goto L75
            java.lang.String r10 = "嫿"
            java.lang.String r10 = com.flashget.kidsdownloader.ProtectedSandApp.s(r10)
            int r1 = b(r0, r3, r1, r2, r10)
        L75:
            r10 = 1
            int r8 = r8 + r10
            int r9 = r9 + r10
            java.lang.String r11 = "嬀"
            java.lang.String r11 = com.flashget.kidsdownloader.ProtectedSandApp.s(r11)
            int r1 = b(r0, r14, r1, r2, r11)
            int r11 = r1 + 2
            if (r11 <= r2) goto L87
            r11 = r2
        L87:
            r16 = r3
            r3 = 2
            c(r0, r1, r11, r3, r10)
            int r3 = r7 + 1
            int r10 = r1 + 1
            int r1 = e(r0, r1)
            int r1 = r1 << 4
            int r11 = r10 + 1
            int r10 = e(r0, r10)
            r1 = r1 | r10
            byte r1 = (byte) r1
            r6[r7] = r1
            java.lang.String r1 = "嬁"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            int r1 = b(r0, r15, r11, r2, r1)
            r7 = r3
            r3 = r16
            goto L51
        Laf:
            if (r7 != r5) goto Lb2
            goto Lbf
        Lb2:
            byte[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r0 = "嬂"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r6, r0)
        Lbf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.j.k(java.lang.String, int, int, kotlin.text.k):byte[]");
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @d5.d
    public static final byte[] l(@d5.d String str, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬃"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嬄"));
        return k(str, 0, str.length(), hexFormat);
    }

    static byte[] m(String str, int i5, int i6, HexFormat hexFormat, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return k(str, i5, i6, hexFormat);
    }

    public static byte[] n(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return l(str, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final int o(String str, int i5, int i6, HexFormat hexFormat) {
        return (int) w(str, i5, i6, hexFormat, 8);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final int p(@d5.d String str, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬅"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嬆"));
        return o(str, 0, str.length(), hexFormat);
    }

    static int q(String str, int i5, int i6, HexFormat hexFormat, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return o(str, i5, i6, hexFormat);
    }

    public static int r(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return p(str, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final long s(String str, int i5, int i6, HexFormat hexFormat) {
        return w(str, i5, i6, hexFormat, 16);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final long t(@d5.d String str, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬇"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嬈"));
        return s(str, 0, str.length(), hexFormat);
    }

    static long u(String str, int i5, int i6, HexFormat hexFormat, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return s(str, i5, i6, hexFormat);
    }

    public static long v(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        return t(str, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final long w(String str, int i5, int i6, HexFormat hexFormat, int i7) {
        AbstractList.f23126o.a(i5, i6, str.length());
        String f27115a = hexFormat.getF27095c().getF27115a();
        String f27116b = hexFormat.getF27095c().getF27116b();
        if (f27116b.length() + f27115a.length() < i6 - i5) {
            int b6 = b(str, f27115a, i5, i6, ProtectedSandApp.s("嬉"));
            int length = i6 - f27116b.length();
            b(str, f27116b, length, i6, ProtectedSandApp.s("嬊"));
            c(str, b6, length, i7, false);
            long j5 = 0;
            while (b6 < length) {
                j5 = (j5 << 4) | e(str, b6);
                b6++;
            }
            return j5;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("嬋"));
        sb.append(f27115a);
        sb.append(ProtectedSandApp.s("嬌"));
        sb.append(f27116b);
        sb.append(ProtectedSandApp.s("嬍"));
        kotlin.jvm.internal.l0.n(str, ProtectedSandApp.s("嬎"));
        String substring = str.substring(i5, i6);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("嬏"));
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    static /* synthetic */ long x(String str, int i5, int i6, HexFormat hexFormat, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i5 = 0;
        }
        if ((i8 & 2) != 0) {
            i6 = str.length();
        }
        return w(str, i5, i6, hexFormat, i7);
    }

    @ExperimentalStdlibApi
    private static final short y(String str, int i5, int i6, HexFormat hexFormat) {
        return (short) w(str, i5, i6, hexFormat, 4);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final short z(@d5.d String str, @d5.d HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬐"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("嬑"));
        return y(str, 0, str.length(), hexFormat);
    }
}
