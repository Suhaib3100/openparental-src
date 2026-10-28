package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;
import kotlin.jvm.internal.r1;
import kotlin.n2;

/* compiled from: HexExtensions.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\t\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0016\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aG\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0013\u001a'\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"\u001a#\u0010$\u001a\u00020\u0006*\u00020\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001d\u0010'\u001a\u00020\u0003*\u00020&2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b'\u0010(\u001a\u001d\u0010)\u001a\u00020&*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b)\u0010*\u001a1\u0010+\u001a\u00020&*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b+\u0010,\u001a\u001d\u0010.\u001a\u00020\u0003*\u00020-2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b.\u0010/\u001a\u001d\u00100\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b0\u00101\u001a1\u00102\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b2\u00103\u001a\u001d\u00104\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b4\u00105\u001a\u001d\u00106\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b6\u00107\u001a1\u00108\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b8\u00109\u001a\u001d\u0010:\u001a\u00020\u0003*\u00020\u001a2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b:\u0010;\u001a\u001d\u0010<\u001a\u00020\u001a*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b<\u0010=\u001a1\u0010>\u001a\u00020\u001a*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b>\u0010?\u001a#\u0010A\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010@\u001a\u00020\u0006H\u0003¢\u0006\u0004\bA\u0010B\u001a7\u0010D\u001a\u00020\u001a*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u0006H\u0003¢\u0006\u0004\bD\u0010E\u001a3\u0010H\u001a\u00020\u0006*\u00020\u00032\u0006\u0010F\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0003H\u0002¢\u0006\u0004\bH\u0010I\u001a3\u0010M\u001a\u00020L*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010N\u001a\u001b\u0010O\u001a\u00020\u0006*\u00020\u00032\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010P\"\u0014\u0010R\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010Q\"\u0014\u0010S\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010Q\"\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010U¨\u0006W"}, d2 = {"", "Lkotlin/text/k;", "format", "", "I", "([BLkotlin/text/k;)Ljava/lang/String;", "", "startIndex", "endIndex", "H", "([BIILkotlin/text/k;)Ljava/lang/String;", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "f", "(IIIIIII)I", "l", "(Ljava/lang/String;Lkotlin/text/k;)[B", "k", "(Ljava/lang/String;IILkotlin/text/k;)[B", "stringLength", "C", "", "charsPerElement", "elementsPerSet", "elementSeparatorLength", "a", "(JII)J", "charsPerSet", "Q", "(JJI)J", "index", "d", "(Ljava/lang/String;II)I", "", "D", "(BLkotlin/text/k;)Ljava/lang/String;", "h", "(Ljava/lang/String;Lkotlin/text/k;)B", "g", "(Ljava/lang/String;IILkotlin/text/k;)B", "", "G", "(SLkotlin/text/k;)Ljava/lang/String;", "z", "(Ljava/lang/String;Lkotlin/text/k;)S", "y", "(Ljava/lang/String;IILkotlin/text/k;)S", "E", "(ILkotlin/text/k;)Ljava/lang/String;", "p", "(Ljava/lang/String;Lkotlin/text/k;)I", "o", "(Ljava/lang/String;IILkotlin/text/k;)I", "F", "(JLkotlin/text/k;)Ljava/lang/String;", "t", "(Ljava/lang/String;Lkotlin/text/k;)J", "s", "(Ljava/lang/String;IILkotlin/text/k;)J", "bits", "P", "(JLkotlin/text/k;I)Ljava/lang/String;", "maxDigits", "w", "(Ljava/lang/String;IILkotlin/text/k;I)J", "part", "partName", "b", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)I", "", "requireMaxLength", "Lkotlin/k2;", "c", "(Ljava/lang/String;IIIZ)V", "e", "(Ljava/lang/String;I)I", "Ljava/lang/String;", "LOWER_CASE_HEX_DIGITS", "UPPER_CASE_HEX_DIGITS", "", "[I", "HEX_DIGITS_TO_DECIMAL", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,591:1\n1#2:592\n1183#3,3:593\n1183#3,3:596\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n13#1:593,3\n14#1:596,3\n*E\n"})
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f79089a = ProtectedSandApp.s("葮\u0001");

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f79090b = ProtectedSandApp.s("葯\u0001");

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final int[] f79091c;

    static {
        int[] iArr = new int[128];
        int i4 = 0;
        for (int i5 = 0; i5 < 128; i5++) {
            iArr[i5] = -1;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String s4 = ProtectedSandApp.s("葮\u0001");
            if (i6 >= s4.length()) {
                break;
            }
            iArr[s4.charAt(i6)] = i7;
            i6++;
            i7++;
        }
        int i10 = 0;
        while (true) {
            String s5 = ProtectedSandApp.s("葯\u0001");
            if (i4 >= s5.length()) {
                f79091c = iArr;
                return;
            } else {
                iArr[s5.charAt(i4)] = i10;
                i4++;
                i10++;
            }
        }
    }

    static short A(String str, int i4, int i5, k kVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return y(str, i4, i5, kVar);
    }

    public static short B(String str, k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return z(str, kVar);
    }

    public static final int C(int i4, int i5, int i6, int i7, int i10, int i11, int i12) {
        long a5;
        int i13;
        int i14;
        if (i4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("葰\u0001"));
        }
        long j4 = i11 + 2 + i12;
        long a6 = a(j4, i6, i10);
        if (i5 <= i6) {
            a5 = a(j4, i5, i10);
        } else {
            a5 = a(a6, i5 / i6, i7);
            int i15 = i5 % i6;
            if (i15 != 0) {
                a5 = a5 + i7 + a(j4, i15, i10);
            }
        }
        long j5 = i4;
        long Q = Q(j5, a5, 1);
        long j6 = j5 - ((a5 + 1) * Q);
        long Q2 = Q(j6, a6, i7);
        long j7 = j6 - ((a6 + i7) * Q2);
        long Q3 = Q(j7, j4, i10);
        if (j7 - ((j4 + i10) * Q3) > 0) {
            i14 = i5;
            i13 = 1;
        } else {
            i13 = 0;
            i14 = i5;
        }
        return (int) ((Q2 * i6) + (Q * i14) + Q3 + i13);
    }

    @fg.l
    @kotlin.r
    @c1(version = "1.9")
    public static final String D(byte b5, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return P(b5, kVar, 8);
    }

    @fg.l
    @kotlin.r
    @c1(version = "1.9")
    public static final String E(int i4, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return P(i4, kVar, 32);
    }

    @fg.l
    @kotlin.r
    @c1(version = "1.9")
    public static final String F(long j4, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return P(j4, kVar, 64);
    }

    @fg.l
    @kotlin.r
    @c1(version = "1.9")
    public static final String G(short s4, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return P(s4, kVar, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[SYNTHETIC] */
    @fg.l
    @kotlin.r
    @kotlin.c1(version = "1.9")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String H(@fg.l byte[] r17, int r18, int r19, @fg.l kotlin.text.k r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "葲\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.p(r0, r3)
            java.lang.String r3 = "葱\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r4 = r20
            kotlin.jvm.internal.l0.p(r4, r3)
            kotlin.collections.c$a r3 = kotlin.collections.c.INSTANCE
            int r5 = r0.length
            r3.a(r1, r2, r5)
            if (r1 != r2) goto L25
            java.lang.String r0 = ""
            return r0
        L25:
            boolean r3 = r20.getUpperCase()
            if (r3 == 0) goto L32
            java.lang.String r3 = "葯\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            goto L38
        L32:
            java.lang.String r3 = "葮\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
        L38:
            kotlin.text.k$b r4 = r20.getBytes()
            int r12 = r4.getBytesPerLine()
            int r13 = r4.getBytesPerGroup()
            java.lang.String r14 = r4.getBytePrefix()
            java.lang.String r15 = r4.getByteSuffix()
            java.lang.String r11 = r4.getByteSeparator()
            java.lang.String r4 = r4.getGroupSeparator()
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
            r11 = r0[r8]
            r7 = r11 & 255(0xff, float:3.57E-43)
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
            int r7 = r7 >> 4
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r7 = r11 & 15
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r6.append(r15)
            int r10 = r10 + 1
            int r9 = r9 + 1
            int r8 = r8 + 1
            goto L78
        Lb2:
            int r0 = r6.length()
            if (r5 != r0) goto Lc6
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "葳\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            return r0
        Lc6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "葴\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.j.H(byte[], int, int, kotlin.text.k):java.lang.String");
    }

    @fg.l
    @kotlin.r
    @c1(version = "1.9")
    public static final String I(@fg.l byte[] bArr, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("葲\u0001"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return H(bArr, 0, bArr.length, kVar);
    }

    public static String J(byte b5, k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return D(b5, kVar);
    }

    public static String K(int i4, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return E(i4, kVar);
    }

    public static String L(long j4, k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return F(j4, kVar);
    }

    public static String M(short s4, k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return G(s4, kVar);
    }

    public static String N(byte[] bArr, int i4, int i5, k kVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = bArr.length;
        }
        if ((i6 & 4) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return H(bArr, i4, i5, kVar);
    }

    public static String O(byte[] bArr, k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return I(bArr, kVar);
    }

    @kotlin.r
    private static final String P(long j4, k kVar, int i4) {
        if ((i4 & 3) != 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("葰\u0001"));
        }
        String s4 = kVar.getUpperCase() ? ProtectedSandApp.s("葯\u0001") : ProtectedSandApp.s("葮\u0001");
        String prefix = kVar.getNumber().getPrefix();
        String suffix = kVar.getNumber().getSuffix();
        int length = suffix.length() + prefix.length() + (i4 >> 2);
        boolean removeLeadingZeros = kVar.getNumber().getRemoveLeadingZeros();
        StringBuilder a5 = androidx.fragment.app.a.a(length, prefix);
        while (i4 > 0) {
            i4 -= 4;
            int i5 = (int) ((j4 >> i4) & 15);
            removeLeadingZeros = removeLeadingZeros && i5 == 0 && i4 > 0;
            if (!removeLeadingZeros) {
                a5.append(s4.charAt(i5));
            }
        }
        a5.append(suffix);
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("葳\u0001"));
        return sb;
    }

    private static final long Q(long j4, long j5, int i4) {
        if (j4 <= 0 || j5 <= 0) {
            return 0L;
        }
        long j6 = i4;
        return (j4 + j6) / (j5 + j6);
    }

    private static final long a(long j4, int i4, int i5) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("葰\u0001"));
        }
        long j5 = i4;
        return ((j5 - 1) * i5) + (j4 * j5);
    }

    private static final int b(String str, String str2, int i4, int i5, String str3) {
        int length = str2.length() + i4;
        if (length <= i5 && e0.b2(str, i4, str2, 0, str2.length(), true)) {
            return length;
        }
        StringBuilder a5 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("葵\u0001"), str3, ProtectedSandApp.s("葶\u0001"), str2, ProtectedSandApp.s("葷\u0001"));
        a5.append(i4);
        a5.append(ProtectedSandApp.s("葸\u0001"));
        if (length <= i5) {
            i5 = length;
        }
        kotlin.jvm.internal.l0.n(str, ProtectedSandApp.s("葹\u0001"));
        String substring = str.substring(i4, i5);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("葺\u0001"));
        a5.append(substring);
        throw new NumberFormatException(a5.toString());
    }

    private static final void c(String str, int i4, int i5, int i6, boolean z4) {
        int i7 = i5 - i4;
        if (z4) {
            if (i7 == i6) {
                return;
            }
        } else if (i7 <= i6) {
            return;
        }
        String s4 = z4 ? ProtectedSandApp.s("葻\u0001") : ProtectedSandApp.s("葼\u0001");
        kotlin.jvm.internal.l0.n(str, ProtectedSandApp.s("葹\u0001"));
        String substring = str.substring(i4, i5);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("葺\u0001"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("葵\u0001"));
        sb.append(s4);
        sb.append(' ');
        sb.append(i6);
        sb.append(ProtectedSandApp.s("葽\u0001"));
        androidx.compose.runtime.changelist.c.a(sb, i4, ProtectedSandApp.s("葸\u0001"), substring, ProtectedSandApp.s("葾\u0001"));
        sb.append(i7);
        throw new NumberFormatException(sb.toString());
    }

    private static final int d(String str, int i4, int i5) {
        if (str.charAt(i4) == '\r') {
            int i6 = i4 + 1;
            return (i6 >= i5 || str.charAt(i6) != '\n') ? i6 : i4 + 2;
        }
        if (str.charAt(i4) == '\n') {
            return i4 + 1;
        }
        StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("葿\u0001"), i4, ProtectedSandApp.s("葸\u0001"));
        a5.append(str.charAt(i4));
        throw new NumberFormatException(a5.toString());
    }

    private static final int e(String str, int i4) {
        int i5;
        char charAt = str.charAt(i4);
        if (charAt <= 127 && (i5 = f79091c[charAt]) >= 0) {
            return i5;
        }
        StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("蒀\u0001"), i4, ProtectedSandApp.s("葸\u0001"));
        a5.append(str.charAt(i4));
        throw new NumberFormatException(a5.toString());
    }

    public static final int f(int i4, int i5, int i6, int i7, int i10, int i11, int i12) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("葰\u0001"));
        }
        int i13 = i4 - 1;
        int i14 = i13 / i5;
        int i15 = (i5 - 1) / i6;
        int i16 = i4 % i5;
        if (i16 != 0) {
            i5 = i16;
        }
        int i17 = (i15 * i14) + ((i5 - 1) / i6);
        long j4 = ((i11 + 2 + i12) * i4) + (((i13 - i14) - i17) * i10) + (i17 * i7) + i14;
        if (kotlin.ranges.s.K0(new kotlin.ranges.l(0, Integer.MAX_VALUE, 1), j4)) {
            return (int) j4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("蒁\u0001") + ((Object) n2.l(a2.h(j4), 10)));
    }

    @kotlin.r
    private static final byte g(String str, int i4, int i5, k kVar) {
        return (byte) w(str, i4, i5, kVar, 2);
    }

    @kotlin.r
    @c1(version = "1.9")
    public static final byte h(@fg.l String str, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("葲\u0001"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return g(str, 0, str.length(), kVar);
    }

    static byte i(String str, int i4, int i5, k kVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return g(str, i4, i5, kVar);
    }

    public static byte j(String str, k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return h(str, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[SYNTHETIC] */
    @kotlin.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final byte[] k(java.lang.String r17, int r18, int r19, kotlin.text.k r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            kotlin.collections.c$a r3 = kotlin.collections.c.INSTANCE
            int r4 = r17.length()
            r3.a(r1, r2, r4)
            r3 = 0
            if (r1 != r2) goto L15
            byte[] r0 = new byte[r3]
            return r0
        L15:
            kotlin.text.k$b r4 = r20.getBytes()
            int r12 = r4.getBytesPerLine()
            int r13 = r4.getBytesPerGroup()
            java.lang.String r14 = r4.getBytePrefix()
            java.lang.String r15 = r4.getByteSuffix()
            java.lang.String r11 = r4.getByteSeparator()
            java.lang.String r4 = r4.getGroupSeparator()
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
            java.lang.String r9 = "蒂\u0001"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            int r1 = b(r0, r4, r1, r2, r9)
            goto L5a
        L69:
            if (r9 == 0) goto L75
            java.lang.String r10 = "蒃\u0001"
            java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)
            int r1 = b(r0, r3, r1, r2, r10)
        L75:
            r10 = 1
            int r8 = r8 + r10
            int r9 = r9 + r10
            java.lang.String r11 = "蒄\u0001"
            java.lang.String r11 = com.flashget.parentalcontrol.ProtectedSandApp.s(r11)
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
            int r11 = e(r0, r1)
            int r11 = r11 << 4
            int r1 = r1 + 2
            int r10 = e(r0, r10)
            r10 = r10 | r11
            byte r10 = (byte) r10
            r6[r7] = r10
            java.lang.String r7 = "蒅\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            int r1 = b(r0, r15, r1, r2, r7)
            r7 = r3
            r3 = r16
            goto L51
        Laf:
            if (r7 != r5) goto Lb2
            goto Lbf
        Lb2:
            byte[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r0 = "蒆\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r6, r0)
        Lbf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.j.k(java.lang.String, int, int, kotlin.text.k):byte[]");
    }

    @fg.l
    @kotlin.r
    @c1(version = "1.9")
    public static final byte[] l(@fg.l String str, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("葲\u0001"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return k(str, 0, str.length(), kVar);
    }

    static byte[] m(String str, int i4, int i5, k kVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return k(str, i4, i5, kVar);
    }

    public static byte[] n(String str, k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return l(str, kVar);
    }

    @kotlin.r
    private static final int o(String str, int i4, int i5, k kVar) {
        return (int) w(str, i4, i5, kVar, 8);
    }

    @kotlin.r
    @c1(version = "1.9")
    public static final int p(@fg.l String str, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("葲\u0001"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return o(str, 0, str.length(), kVar);
    }

    static int q(String str, int i4, int i5, k kVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return o(str, i4, i5, kVar);
    }

    public static int r(String str, k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return p(str, kVar);
    }

    @kotlin.r
    private static final long s(String str, int i4, int i5, k kVar) {
        return w(str, i4, i5, kVar, 16);
    }

    @kotlin.r
    @c1(version = "1.9")
    public static final long t(@fg.l String str, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("葲\u0001"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return w(str, 0, str.length(), kVar, 16);
    }

    static long u(String str, int i4, int i5, k kVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return w(str, i4, i5, kVar, 16);
    }

    public static long v(String str, k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k.INSTANCE.getClass();
            kVar = k.f79104e;
        }
        return t(str, kVar);
    }

    @kotlin.r
    private static final long w(String str, int i4, int i5, k kVar, int i6) {
        kotlin.collections.c.INSTANCE.a(i4, i5, str.length());
        String prefix = kVar.getNumber().getPrefix();
        String suffix = kVar.getNumber().getSuffix();
        if (suffix.length() + prefix.length() >= i5 - i4) {
            StringBuilder a5 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("蒉\u0001"), prefix, ProtectedSandApp.s("蒊\u0001"), suffix, ProtectedSandApp.s("蒋\u0001"));
            kotlin.jvm.internal.l0.n(str, ProtectedSandApp.s("葹\u0001"));
            String substring = str.substring(i4, i5);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("葺\u0001"));
            a5.append(substring);
            throw new NumberFormatException(a5.toString());
        }
        int b5 = b(str, prefix, i4, i5, ProtectedSandApp.s("蒇\u0001"));
        int length = i5 - suffix.length();
        b(str, suffix, length, i5, ProtectedSandApp.s("蒈\u0001"));
        c(str, b5, length, i6, false);
        long j4 = 0;
        while (b5 < length) {
            j4 = (j4 << 4) | e(str, b5);
            b5++;
        }
        return j4;
    }

    static /* synthetic */ long x(String str, int i4, int i5, k kVar, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i4 = 0;
        }
        if ((i7 & 2) != 0) {
            i5 = str.length();
        }
        return w(str, i4, i5, kVar, i6);
    }

    @kotlin.r
    private static final short y(String str, int i4, int i5, k kVar) {
        return (short) w(str, i4, i5, kVar, 4);
    }

    @kotlin.r
    @c1(version = "1.9")
    public static final short z(@fg.l String str, @fg.l k kVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("葲\u0001"));
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("葱\u0001"));
        return y(str, 0, str.length(), kVar);
    }
}
