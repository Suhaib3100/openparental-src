package net.time4j.format;

import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NumberSystem.java */
/* loaded from: classes7.dex */
public class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j ARABIC;
    public static final j ARABIC_INDIC;
    public static final j ARABIC_INDIC_EXT;
    public static final j BENGALI;
    public static final j DEVANAGARI;
    public static final j DOZENAL;
    private static final int[] D_FACTORS;
    public static final j ETHIOPIC;
    private static final char ETHIOPIC_HUNDRED = 4987;
    private static final char ETHIOPIC_ONE = 4969;
    private static final char ETHIOPIC_TEN = 4978;
    private static final char ETHIOPIC_TEN_THOUSAND = 4988;
    public static final j GUJARATI;
    public static final j JAPANESE;
    public static final j KHMER;
    private static final String[] LETTERS;
    public static final j MYANMAR;
    private static final int[] NUMBERS;
    public static final j ORYA;
    public static final j ROMAN;
    public static final j TELUGU;
    public static final j THAI;
    private final String code;

    /* compiled from: NumberSystem.java */
    enum g extends j {
        g(String str, int i4, String str2) {
            super(str, i4, str2, null);
        }

        @Override // net.time4j.format.j
        public boolean contains(char c5) {
            return c5 >= '0' && c5 <= '9';
        }

        @Override // net.time4j.format.j
        public String getDigits() {
            return ProtectedSandApp.s("閺\u0001");
        }

        @Override // net.time4j.format.j
        public boolean isDecimal() {
            return true;
        }

        @Override // net.time4j.format.j
        public int toInteger(String str, net.time4j.format.g gVar) {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                return parseInt;
            }
            throw new NumberFormatException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("閻\u0001"), str));
        }

        @Override // net.time4j.format.j
        public String toNumeral(int i4) {
            if (i4 >= 0) {
                return Integer.toString(i4);
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("閼\u0001"), i4));
        }
    }

    static {
        g gVar = new g(ProtectedSandApp.s("镼\u0001"), 0, ProtectedSandApp.s("镻\u0001"));
        ARABIC = gVar;
        j jVar = new j(ProtectedSandApp.s("镾\u0001"), 1, ProtectedSandApp.s("镽\u0001")) { // from class: net.time4j.format.j.h
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("閽\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        ARABIC_INDIC = jVar;
        j jVar2 = new j(ProtectedSandApp.s("門\u0001"), 2, ProtectedSandApp.s("长\u0001")) { // from class: net.time4j.format.j.i
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("閾\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        ARABIC_INDIC_EXT = jVar2;
        j jVar3 = new j(ProtectedSandApp.s("閂\u0001"), 3, ProtectedSandApp.s("閁\u0001")) { // from class: net.time4j.format.j.j
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("閿\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        BENGALI = jVar3;
        j jVar4 = new j(ProtectedSandApp.s("閄\u0001"), 4, ProtectedSandApp.s("閃\u0001")) { // from class: net.time4j.format.j.k
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("闀\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        DEVANAGARI = jVar4;
        j jVar5 = new j(ProtectedSandApp.s("閆\u0001"), 5, ProtectedSandApp.s("閅\u0001")) { // from class: net.time4j.format.j.l
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public boolean contains(char c5) {
                return (c5 >= '0' && c5 <= '9') || c5 == 8586 || c5 == 8587;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("闁\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                int parseInt = Integer.parseInt(str.replace((char) 8586, 'a').replace((char) 8587, 'b'), 12);
                if (parseInt >= 0) {
                    return parseInt;
                }
                throw new NumberFormatException(ProtectedSandApp.s("闂\u0001").concat(str));
            }

            @Override // net.time4j.format.j
            public String toNumeral(int i4) {
                if (i4 >= 0) {
                    return Integer.toString(i4, 12).replace('a', (char) 8586).replace('b', (char) 8587);
                }
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("闃\u0001"), i4));
            }

            @Override // net.time4j.format.j
            public int toNumeral(int i4, Appendable appendable) throws IOException {
                if (i4 >= 0) {
                    int i5 = 1;
                    while (true) {
                        if (i5 > 4) {
                            i5 = 0;
                            break;
                        }
                        if (i4 < j.D_FACTORS[i5]) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 > 0) {
                        int i6 = i5 - 1;
                        do {
                            int i7 = i4 / j.D_FACTORS[i6];
                            appendable.append(i7 == 11 ? (char) 8587 : i7 == 10 ? (char) 8586 : (char) (i7 + 48));
                            i4 -= i7 * j.D_FACTORS[i6];
                            i6--;
                        } while (i6 >= 0);
                        return i5;
                    }
                }
                return super.toNumeral(i4, appendable);
            }
        };
        DOZENAL = jVar5;
        j jVar6 = new j(ProtectedSandApp.s("閈\u0001"), 6, ProtectedSandApp.s("閇\u0001")) { // from class: net.time4j.format.j.m
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public boolean contains(char c5) {
                return c5 >= 4969 && c5 <= 4988;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("闄\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                int i4;
                int i5 = 1;
                boolean z4 = false;
                boolean z5 = false;
                int i6 = 0;
                int i7 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    if (charAt >= 4969 && charAt < 4978) {
                        i4 = charAt - 4968;
                    } else if (charAt < 4978 || charAt >= 4987) {
                        if (charAt == 4988) {
                            if (z4 && i7 == 0) {
                                i7 = 1;
                            }
                            i6 = j.addEthiopic(i6, i7, i5);
                            i5 = z4 ? i5 * 100 : i5 * 10000;
                            z5 = true;
                            z4 = false;
                            i7 = 0;
                        } else if (charAt == 4987) {
                            i6 = j.addEthiopic(i6, i7, i5);
                            i5 *= 100;
                            z4 = true;
                            z5 = false;
                            i7 = 0;
                        }
                    } else {
                        i4 = (charAt - 4977) * 10;
                    }
                    i7 += i4;
                }
                return j.addEthiopic(i6, ((z4 || z5) && i7 == 0) ? 1 : i7, i5);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[SYNTHETIC] */
            @Override // net.time4j.format.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.String toNumeral(int r11) {
                /*
                    r10 = this;
                    r0 = 1
                    if (r11 < r0) goto L7e
                    java.lang.String r11 = java.lang.String.valueOf(r11)
                    int r1 = r11.length()
                    int r2 = r1 + (-1)
                    int r3 = r2 % 2
                    if (r3 != 0) goto L1d
                    java.lang.String r2 = "闅\u0001"
                    java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                    java.lang.String r11 = r2.concat(r11)
                    goto L1e
                L1d:
                    r1 = r2
                L1e:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r3 = r1
                L24:
                    if (r3 < 0) goto L79
                    int r4 = r1 - r3
                    char r4 = r11.charAt(r4)
                    int r5 = r3 + (-1)
                    int r6 = r1 - r5
                    char r6 = r11.charAt(r6)
                    r7 = 48
                    r8 = 0
                    if (r6 == r7) goto L3d
                    int r6 = r6 + 4920
                    char r6 = (char) r6
                    goto L3e
                L3d:
                    r6 = r8
                L3e:
                    if (r4 == r7) goto L44
                    int r4 = r4 + 4929
                    char r4 = (char) r4
                    goto L45
                L44:
                    r4 = r8
                L45:
                    int r7 = r5 % 4
                    int r7 = r7 / 2
                    r9 = 4987(0x137b, float:6.988E-42)
                    if (r5 == 0) goto L58
                    if (r7 == 0) goto L55
                    if (r6 != 0) goto L53
                    if (r4 == 0) goto L58
                L53:
                    r5 = r9
                    goto L59
                L55:
                    r5 = 4988(0x137c, float:6.99E-42)
                    goto L59
                L58:
                    r5 = r8
                L59:
                    r7 = 4969(0x1369, float:6.963E-42)
                    if (r6 != r7) goto L66
                    if (r4 != 0) goto L66
                    if (r1 <= r0) goto L66
                    if (r5 == r9) goto L67
                    if (r3 != r1) goto L66
                    goto L67
                L66:
                    r8 = r6
                L67:
                    if (r4 == 0) goto L6c
                    r2.append(r4)
                L6c:
                    if (r8 == 0) goto L71
                    r2.append(r8)
                L71:
                    if (r5 == 0) goto L76
                    r2.append(r5)
                L76:
                    int r3 = r3 + (-2)
                    goto L24
                L79:
                    java.lang.String r11 = r2.toString()
                    return r11
                L7e:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "闆\u0001"
                    java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                    java.lang.String r11 = android.support.v4.media.a.a(r1, r11)
                    r0.<init>(r11)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.j.m.toNumeral(int):java.lang.String");
            }
        };
        ETHIOPIC = jVar6;
        j jVar7 = new j(ProtectedSandApp.s("閊\u0001"), 7, ProtectedSandApp.s("閉\u0001")) { // from class: net.time4j.format.j.n
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("闇\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        GUJARATI = jVar7;
        j jVar8 = new j(ProtectedSandApp.s("閌\u0001"), 8, ProtectedSandApp.s("開\u0001")) { // from class: net.time4j.format.j.o
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("闈\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            @Override // net.time4j.format.j
            public int toInteger(String str, net.time4j.format.g gVar2) {
                boolean z4;
                int i4;
                String digits = getDigits();
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i10 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    String s4 = ProtectedSandApp.s("闉\u0001");
                    if (charAt == 21313) {
                        if (i5 != 0 || i7 != 0 || i10 != 0) {
                            throw new IllegalArgumentException(s4.concat(str));
                        }
                        i5++;
                    } else if (charAt == 21315) {
                        if (i10 != 0) {
                            throw new IllegalArgumentException(s4.concat(str));
                        }
                        i10++;
                    } else if (charAt != 30334) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 9) {
                                z4 = false;
                                break;
                            }
                            if (digits.charAt(i11) == charAt) {
                                int i12 = i11 + 1;
                                if (i10 == 1) {
                                    i4 = (i12 * 1000) + i6;
                                    i10 = -1;
                                } else if (i7 == 1) {
                                    i4 = (i12 * 100) + i6;
                                    i7 = -1;
                                } else if (i5 == 1) {
                                    i4 = (i12 * 10) + i6;
                                    i5 = -1;
                                } else {
                                    i6 += i12;
                                    z4 = true;
                                }
                                i6 = i4;
                                z4 = true;
                            } else {
                                i11++;
                            }
                        }
                        if (!z4) {
                            throw new IllegalArgumentException(s4.concat(str));
                        }
                    } else {
                        if (i7 != 0 || i10 != 0) {
                            throw new IllegalArgumentException(s4.concat(str));
                        }
                        i7++;
                    }
                }
                if (i5 == 1) {
                    i6 += 10;
                }
                if (i7 == 1) {
                    i6 += 100;
                }
                return i10 == 1 ? i6 + 1000 : i6;
            }

            @Override // net.time4j.format.j
            public String toNumeral(int i4) {
                if (i4 < 1 || i4 > 9999) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("闊\u0001"), i4));
                }
                String digits = getDigits();
                int i5 = i4 / 1000;
                int i6 = i4 % 1000;
                int i7 = i6 / 100;
                int i10 = i6 % 100;
                int i11 = i10 / 10;
                int i12 = i10 % 10;
                StringBuilder sb = new StringBuilder();
                if (i5 >= 1) {
                    if (i5 > 1) {
                        sb.append(digits.charAt(i5 - 1));
                    }
                    sb.append((char) 21315);
                }
                if (i7 >= 1) {
                    if (i7 > 1) {
                        sb.append(digits.charAt(i7 - 1));
                    }
                    sb.append((char) 30334);
                }
                if (i11 >= 1) {
                    if (i11 > 1) {
                        sb.append(digits.charAt(i11 - 1));
                    }
                    sb.append((char) 21313);
                }
                if (i12 > 0) {
                    sb.append(digits.charAt(i12 - 1));
                }
                return sb.toString();
            }
        };
        JAPANESE = jVar8;
        j jVar9 = new j(ProtectedSandApp.s("閎\u0001"), 9, ProtectedSandApp.s("閍\u0001")) { // from class: net.time4j.format.j.a
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("閩\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        KHMER = jVar9;
        j jVar10 = new j(ProtectedSandApp.s("閐\u0001"), 10, ProtectedSandApp.s("閏\u0001")) { // from class: net.time4j.format.j.b
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("閪\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        MYANMAR = jVar10;
        j jVar11 = new j(ProtectedSandApp.s("閒\u0001"), 11, ProtectedSandApp.s("閑\u0001")) { // from class: net.time4j.format.j.c
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("閫\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        ORYA = jVar11;
        j jVar12 = new j(ProtectedSandApp.s("閔\u0001"), 12, ProtectedSandApp.s("間\u0001")) { // from class: net.time4j.format.j.d
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public boolean contains(char c5) {
                char upperCase = Character.toUpperCase(c5);
                return upperCase == 'I' || upperCase == 'V' || upperCase == 'X' || upperCase == 'L' || upperCase == 'C' || upperCase == 'D' || upperCase == 'M';
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("閬\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:42:0x0016, code lost:
            
                continue;
             */
            @Override // net.time4j.format.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int toInteger(java.lang.String r12, net.time4j.format.g r13) {
                /*
                    Method dump skipped, instructions count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.j.d.toInteger(java.lang.String, net.time4j.format.g):int");
            }

            @Override // net.time4j.format.j
            public String toNumeral(int i4) {
                if (i4 < 1 || i4 > 3999) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("閷\u0001"), i4));
                }
                StringBuilder sb = new StringBuilder();
                for (int i5 = 0; i5 < j.NUMBERS.length; i5++) {
                    while (i4 >= j.NUMBERS[i5]) {
                        sb.append(j.LETTERS[i5]);
                        i4 -= j.NUMBERS[i5];
                    }
                }
                return sb.toString();
            }
        };
        ROMAN = jVar12;
        j jVar13 = new j(ProtectedSandApp.s("閖\u0001"), 13, ProtectedSandApp.s("閕\u0001")) { // from class: net.time4j.format.j.e
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("閸\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        TELUGU = jVar13;
        j jVar14 = new j(ProtectedSandApp.s("閘\u0001"), 14, ProtectedSandApp.s("閗\u0001")) { // from class: net.time4j.format.j.f
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String getDigits() {
                return ProtectedSandApp.s("閹\u0001");
            }

            @Override // net.time4j.format.j
            public boolean isDecimal() {
                return true;
            }
        };
        THAI = jVar14;
        $VALUES = new j[]{gVar, jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14};
        NUMBERS = new int[]{1000, w.b.f22438j, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        LETTERS = new String[]{ProtectedSandApp.s("閛\u0001"), ProtectedSandApp.s("閜\u0001"), ProtectedSandApp.s("閝\u0001"), ProtectedSandApp.s("閞\u0001"), ProtectedSandApp.s("閟\u0001"), ProtectedSandApp.s("閠\u0001"), ProtectedSandApp.s("閡\u0001"), ProtectedSandApp.s("関\u0001"), ProtectedSandApp.s("閣\u0001"), ProtectedSandApp.s("閤\u0001"), ProtectedSandApp.s("閥\u0001"), ProtectedSandApp.s("閙\u0001"), ProtectedSandApp.s("閚\u0001")};
        D_FACTORS = new int[]{1, 12, 144, 1728, 20736};
    }

    /* synthetic */ j(String str, int i4, String str2, g gVar) {
        this(str, i4, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int addEthiopic(int i4, int i5, int i6) {
        return net.time4j.base.c.e(i4, net.time4j.base.c.h(i5, i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getValue(char c5) {
        if (c5 == 'C') {
            return 100;
        }
        if (c5 == 'D') {
            return 500;
        }
        if (c5 == 'I') {
            return 1;
        }
        if (c5 == 'V') {
            return 5;
        }
        if (c5 == 'X') {
            return 10;
        }
        if (c5 == 'L') {
            return 50;
        }
        if (c5 == 'M') {
            return 1000;
        }
        throw new NumberFormatException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("閦\u0001"), c5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidRomanCombination(char c5, char c6) {
        if (c5 == 'C') {
            return c6 == 'M' || c6 == 'D';
        }
        if (c5 == 'I') {
            return c6 == 'X' || c6 == 'V';
        }
        if (c5 != 'X') {
            return false;
        }
        return c6 == 'C' || c6 == 'L';
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public boolean contains(char c5) {
        String digits = getDigits();
        int length = digits.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (digits.charAt(i4) == c5) {
                return true;
            }
        }
        return false;
    }

    public String getCode() {
        return this.code;
    }

    public String getDigits() {
        throw new AbstractMethodError();
    }

    public boolean isDecimal() {
        throw new AbstractMethodError();
    }

    public final int toInteger(String str) {
        return toInteger(str, net.time4j.format.g.SMART);
    }

    public String toNumeral(int i4) {
        if (!isDecimal() || i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("閨\u0001"), i4));
        }
        int charAt = getDigits().charAt(0) - '0';
        String num = Integer.toString(i4);
        StringBuilder sb = new StringBuilder();
        int length = num.length();
        for (int i5 = 0; i5 < length; i5++) {
            sb.append((char) (num.charAt(i5) + charAt));
        }
        return sb.toString();
    }

    private j(String str, int i4, String str2) {
        this.code = str2;
    }

    public int toInteger(String str, net.time4j.format.g gVar) {
        if (!isDecimal()) {
            throw new NumberFormatException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("閨\u0001"), str));
        }
        int charAt = getDigits().charAt(0) - '0';
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            sb.append((char) (str.charAt(i4) - charAt));
        }
        int parseInt = Integer.parseInt(sb.toString());
        if (parseInt >= 0) {
            return parseInt;
        }
        throw new NumberFormatException(ProtectedSandApp.s("閧\u0001").concat(str));
    }

    public int toNumeral(int i4, Appendable appendable) throws IOException {
        String numeral = toNumeral(i4);
        appendable.append(numeral);
        return numeral.length();
    }
}
