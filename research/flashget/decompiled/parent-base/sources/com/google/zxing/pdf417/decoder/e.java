package com.google.zxing.pdf417.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: DecodedBitStreamParser.java */
/* loaded from: classes6.dex */
final class e {
    private static final char[] A = ProtectedSandApp.s("ఐ\u0001").toCharArray();
    private static final char[] B = ProtectedSandApp.s("\u0c11\u0001").toCharArray();
    private static final BigInteger[] C;
    private static final int D = 2;

    /* renamed from: a, reason: collision with root package name */
    private static final int f63187a = 900;

    /* renamed from: b, reason: collision with root package name */
    private static final int f63188b = 901;

    /* renamed from: c, reason: collision with root package name */
    private static final int f63189c = 902;

    /* renamed from: d, reason: collision with root package name */
    private static final int f63190d = 924;

    /* renamed from: e, reason: collision with root package name */
    private static final int f63191e = 925;

    /* renamed from: f, reason: collision with root package name */
    private static final int f63192f = 926;

    /* renamed from: g, reason: collision with root package name */
    private static final int f63193g = 927;

    /* renamed from: h, reason: collision with root package name */
    private static final int f63194h = 928;

    /* renamed from: i, reason: collision with root package name */
    private static final int f63195i = 923;

    /* renamed from: j, reason: collision with root package name */
    private static final int f63196j = 922;

    /* renamed from: k, reason: collision with root package name */
    private static final int f63197k = 913;

    /* renamed from: l, reason: collision with root package name */
    private static final int f63198l = 15;

    /* renamed from: m, reason: collision with root package name */
    private static final int f63199m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static final int f63200n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f63201o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f63202p = 3;

    /* renamed from: q, reason: collision with root package name */
    private static final int f63203q = 4;

    /* renamed from: r, reason: collision with root package name */
    private static final int f63204r = 5;

    /* renamed from: s, reason: collision with root package name */
    private static final int f63205s = 6;

    /* renamed from: t, reason: collision with root package name */
    private static final int f63206t = 25;

    /* renamed from: u, reason: collision with root package name */
    private static final int f63207u = 27;

    /* renamed from: v, reason: collision with root package name */
    private static final int f63208v = 27;

    /* renamed from: w, reason: collision with root package name */
    private static final int f63209w = 28;

    /* renamed from: x, reason: collision with root package name */
    private static final int f63210x = 28;

    /* renamed from: y, reason: collision with root package name */
    private static final int f63211y = 29;

    /* renamed from: z, reason: collision with root package name */
    private static final int f63212z = 29;

    /* compiled from: DecodedBitStreamParser.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63213a;

        static {
            int[] iArr = new int[b.values().length];
            f63213a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63213a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63213a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63213a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63213a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63213a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: DecodedBitStreamParser.java */
    private enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        C = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i4 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = C;
            if (i4 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i4] = bigIntegerArr2[i4 - 1].multiply(valueOf);
            i4++;
        }
    }

    private e() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0074. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.e.a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.zxing.common.e b(int[] r6, java.lang.String r7) throws com.google.zxing.FormatException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            ta.c r3 = new ta.c
            r3.<init>()
            r4 = 2
        L12:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L6d
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L58
            switch(r2) {
                case 900: goto L53;
                case 901: goto L4e;
                case 902: goto L49;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 922: goto L44;
                case 923: goto L44;
                case 924: goto L4e;
                case 925: goto L41;
                case 926: goto L3e;
                case 927: goto L2d;
                case 928: goto L28;
                default: goto L21;
            }
        L21:
            int r4 = r4 + (-1)
            int r2 = g(r6, r4, r0)
            goto L60
        L28:
            int r2 = d(r6, r4, r3)
            goto L60
        L2d:
            int r2 = r4 + 1
            r1 = r6[r4]
            com.google.zxing.common.d r1 = com.google.zxing.common.d.getCharacterSetECIByValue(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L60
        L3e:
            int r2 = r4 + 2
            goto L60
        L41:
            int r2 = r4 + 1
            goto L60
        L44:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.a()
            throw r6
        L49:
            int r2 = f(r6, r4, r0)
            goto L60
        L4e:
            int r2 = a(r2, r6, r1, r4, r0)
            goto L60
        L53:
            int r2 = g(r6, r4, r0)
            goto L60
        L58:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L60:
            int r4 = r6.length
            if (r2 >= r4) goto L68
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L12
        L68:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.a()
            throw r6
        L6d:
            int r6 = r0.length()
            if (r6 == 0) goto L81
            com.google.zxing.common.e r6 = new com.google.zxing.common.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.o(r3)
            return r6
        L81:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.e.b(int[], java.lang.String):com.google.zxing.common.e");
    }

    private static String c(int[] iArr, int i4) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i5 = 0; i5 < i4; i5++) {
            bigInteger = bigInteger.add(C[(i4 - i5) - 1].multiply(BigInteger.valueOf(iArr[i5])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.a();
    }

    static int d(int[] iArr, int i4, ta.c cVar) throws FormatException {
        if (i4 + 2 > iArr[0]) {
            throw FormatException.a();
        }
        int[] iArr2 = new int[2];
        int i5 = 0;
        while (i5 < 2) {
            iArr2[i5] = iArr[i4];
            i5++;
            i4++;
        }
        cVar.t(Integer.parseInt(c(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int g4 = g(iArr, i4, sb);
        cVar.n(sb.toString());
        int i6 = iArr[g4] == f63195i ? g4 + 1 : -1;
        while (g4 < iArr[0]) {
            int i7 = iArr[g4];
            if (i7 == f63196j) {
                g4++;
                cVar.q(true);
            } else {
                if (i7 != f63195i) {
                    throw FormatException.a();
                }
                switch (iArr[g4 + 1]) {
                    case 0:
                        StringBuilder sb2 = new StringBuilder();
                        g4 = g(iArr, g4 + 2, sb2);
                        cVar.o(sb2.toString());
                        break;
                    case 1:
                        StringBuilder sb3 = new StringBuilder();
                        g4 = f(iArr, g4 + 2, sb3);
                        cVar.s(Integer.parseInt(sb3.toString()));
                        break;
                    case 2:
                        StringBuilder sb4 = new StringBuilder();
                        g4 = f(iArr, g4 + 2, sb4);
                        cVar.v(Long.parseLong(sb4.toString()));
                        break;
                    case 3:
                        StringBuilder sb5 = new StringBuilder();
                        g4 = g(iArr, g4 + 2, sb5);
                        cVar.u(sb5.toString());
                        break;
                    case 4:
                        StringBuilder sb6 = new StringBuilder();
                        g4 = g(iArr, g4 + 2, sb6);
                        cVar.l(sb6.toString());
                        break;
                    case 5:
                        StringBuilder sb7 = new StringBuilder();
                        g4 = f(iArr, g4 + 2, sb7);
                        cVar.p(Long.parseLong(sb7.toString()));
                        break;
                    case 6:
                        StringBuilder sb8 = new StringBuilder();
                        g4 = f(iArr, g4 + 2, sb8);
                        cVar.m(Integer.parseInt(sb8.toString()));
                        break;
                    default:
                        throw FormatException.a();
                }
            }
        }
        if (i6 != -1) {
            int i10 = g4 - i6;
            if (cVar.k()) {
                i10--;
            }
            cVar.r(Arrays.copyOfRange(iArr, i6, i10 + i6));
        }
        return g4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void e(int[] iArr, int[] iArr2, int i4, StringBuilder sb) {
        b bVar;
        int i5;
        b bVar2 = b.ALPHA;
        b bVar3 = bVar2;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = iArr[i6];
            char c5 = ' ';
            switch (a.f63213a[bVar2.ordinal()]) {
                case 1:
                    if (i7 < 26) {
                        i5 = i7 + 65;
                        c5 = (char) i5;
                        break;
                    } else {
                        if (i7 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i7 != f63197k) {
                            switch (i7) {
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c5 = 0;
                                    b bVar4 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar4;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i6]);
                        }
                        c5 = 0;
                        break;
                    }
                    break;
                case 2:
                    if (i7 < 26) {
                        i5 = i7 + 97;
                        c5 = (char) i5;
                        break;
                    } else {
                        if (i7 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i7 != f63197k) {
                            switch (i7) {
                                case 27:
                                    bVar = b.ALPHA_SHIFT;
                                    c5 = 0;
                                    b bVar42 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar42;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c5 = 0;
                                    b bVar422 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar422;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i6]);
                        }
                        c5 = 0;
                        break;
                    }
                    break;
                case 3:
                    if (i7 < 25) {
                        c5 = B[i7];
                        break;
                    } else {
                        if (i7 != 900) {
                            if (i7 != f63197k) {
                                switch (i7) {
                                    case 25:
                                        bVar2 = b.PUNCT;
                                        break;
                                    case 27:
                                        bVar2 = b.LOWER;
                                        break;
                                    case 29:
                                        bVar = b.PUNCT_SHIFT;
                                        c5 = 0;
                                        b bVar4222 = bVar;
                                        bVar3 = bVar2;
                                        bVar2 = bVar4222;
                                        break;
                                }
                            } else {
                                sb.append((char) iArr2[i6]);
                            }
                            c5 = 0;
                            break;
                        }
                        bVar2 = b.ALPHA;
                        c5 = 0;
                    }
                    break;
                case 4:
                    if (i7 < 29) {
                        c5 = A[i7];
                        break;
                    } else {
                        if (i7 == 29 || i7 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i7 == f63197k) {
                            sb.append((char) iArr2[i6]);
                        }
                        c5 = 0;
                        break;
                    }
                case 5:
                    if (i7 < 26) {
                        c5 = (char) (i7 + 65);
                    } else if (i7 != 26) {
                        bVar2 = i7 != 900 ? bVar3 : b.ALPHA;
                        c5 = 0;
                        break;
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i7 < 29) {
                        c5 = A[i7];
                    } else if (i7 == 29 || i7 == 900) {
                        bVar2 = b.ALPHA;
                        c5 = 0;
                        break;
                    } else {
                        if (i7 == f63197k) {
                            sb.append((char) iArr2[i6]);
                        }
                        c5 = 0;
                    }
                    bVar2 = bVar3;
                    break;
                default:
                    c5 = 0;
                    break;
            }
            if (c5 != 0) {
                sb.append(c5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r10.append(c(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int f(int[] r8, int r9, java.lang.StringBuilder r10) throws com.google.zxing.FormatException {
        /*
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = r8[r1]
            if (r9 >= r4) goto L43
            if (r2 != 0) goto L43
            int r5 = r9 + 1
            r6 = r8[r9]
            r7 = 1
            if (r5 != r4) goto L15
            r2 = r7
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r6 >= r4) goto L1f
            r0[r3] = r6
            int r3 = r3 + 1
        L1d:
            r9 = r5
            goto L2e
        L1f:
            if (r6 == r4) goto L2d
            r4 = 901(0x385, float:1.263E-42)
            if (r6 == r4) goto L2d
            r4 = 928(0x3a0, float:1.3E-42)
            if (r6 == r4) goto L2d
            switch(r6) {
                case 922: goto L2d;
                case 923: goto L2d;
                case 924: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L1d
        L2d:
            r2 = r7
        L2e:
            int r4 = r3 % 15
            if (r4 == 0) goto L38
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L38
            if (r2 == 0) goto L7
        L38:
            if (r3 <= 0) goto L7
            java.lang.String r3 = c(r0, r3)
            r10.append(r3)
            r3 = r1
            goto L7
        L43:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.e.f(int[], int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0036. Please report as an issue. */
    private static int g(int[] iArr, int i4, StringBuilder sb) {
        int i5 = iArr[0];
        int[] iArr2 = new int[(i5 - i4) << 1];
        int[] iArr3 = new int[(i5 - i4) << 1];
        boolean z4 = false;
        int i6 = 0;
        while (i4 < iArr[0] && !z4) {
            int i7 = i4 + 1;
            int i10 = iArr[i4];
            if (i10 < 900) {
                iArr2[i6] = i10 / 30;
                iArr2[i6 + 1] = i10 % 30;
                i6 += 2;
            } else if (i10 != f63197k) {
                if (i10 != 928) {
                    switch (i10) {
                        case 900:
                            iArr2[i6] = 900;
                            i6++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i10) {
                            }
                    }
                }
                z4 = true;
            } else {
                iArr2[i6] = f63197k;
                i4 += 2;
                iArr3[i6] = iArr[i7];
                i6++;
            }
            i4 = i7;
        }
        e(iArr2, iArr3, i6, sb);
        return i4;
    }
}
