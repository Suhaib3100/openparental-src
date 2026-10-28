package ye;

import com.google.firebase.remoteconfig.p;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.apache.commons.lang3.b1;
import org.apache.commons.lang3.k1;

/* compiled from: NumberUtils.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Long f93423a = 0L;

    /* renamed from: b, reason: collision with root package name */
    public static final Long f93424b = 1L;

    /* renamed from: c, reason: collision with root package name */
    public static final Long f93425c = -1L;

    /* renamed from: d, reason: collision with root package name */
    public static final Integer f93426d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final Integer f93427e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final Integer f93428f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final Integer f93429g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final Short f93430h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final Short f93431i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final Short f93432j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final Byte f93433k = (byte) 0;

    /* renamed from: l, reason: collision with root package name */
    public static final Byte f93434l = (byte) 1;

    /* renamed from: m, reason: collision with root package name */
    public static final Byte f93435m = (byte) -1;

    /* renamed from: n, reason: collision with root package name */
    public static final Double f93436n = Double.valueOf(p.f60679p);

    /* renamed from: o, reason: collision with root package name */
    public static final Double f93437o = Double.valueOf(1.0d);

    /* renamed from: p, reason: collision with root package name */
    public static final Double f93438p = Double.valueOf(-1.0d);

    /* renamed from: q, reason: collision with root package name */
    public static final Float f93439q = Float.valueOf(0.0f);

    /* renamed from: r, reason: collision with root package name */
    public static final Float f93440r = Float.valueOf(1.0f);

    /* renamed from: s, reason: collision with root package name */
    public static final Float f93441s = Float.valueOf(-1.0f);

    public static long A(long j4, long j5, long j6) {
        if (j5 > j4) {
            j4 = j5;
        }
        return j6 > j4 ? j6 : j4;
    }

    public static long B(long... jArr) {
        m0(jArr);
        long j4 = jArr[0];
        for (int i4 = 1; i4 < jArr.length; i4++) {
            long j5 = jArr[i4];
            if (j5 > j4) {
                j4 = j5;
            }
        }
        return j4;
    }

    public static short C(short s4, short s5, short s6) {
        if (s5 > s4) {
            s4 = s5;
        }
        return s6 > s4 ? s6 : s4;
    }

    public static short D(short... sArr) {
        m0(sArr);
        short s4 = sArr[0];
        for (int i4 = 1; i4 < sArr.length; i4++) {
            short s5 = sArr[i4];
            if (s5 > s4) {
                s4 = s5;
            }
        }
        return s4;
    }

    public static byte E(byte b5, byte b6, byte b7) {
        if (b6 < b5) {
            b5 = b6;
        }
        return b7 < b5 ? b7 : b5;
    }

    public static byte F(byte... bArr) {
        m0(bArr);
        byte b5 = bArr[0];
        for (int i4 = 1; i4 < bArr.length; i4++) {
            byte b6 = bArr[i4];
            if (b6 < b5) {
                b5 = b6;
            }
        }
        return b5;
    }

    public static double G(double d5, double d6, double d7) {
        return Math.min(Math.min(d5, d6), d7);
    }

    public static double H(double... dArr) {
        m0(dArr);
        double d5 = dArr[0];
        for (int i4 = 1; i4 < dArr.length; i4++) {
            if (Double.isNaN(dArr[i4])) {
                return Double.NaN;
            }
            double d6 = dArr[i4];
            if (d6 < d5) {
                d5 = d6;
            }
        }
        return d5;
    }

    public static float I(float f4, float f5, float f6) {
        return Math.min(Math.min(f4, f5), f6);
    }

    public static float J(float... fArr) {
        m0(fArr);
        float f4 = fArr[0];
        for (int i4 = 1; i4 < fArr.length; i4++) {
            if (Float.isNaN(fArr[i4])) {
                return Float.NaN;
            }
            float f5 = fArr[i4];
            if (f5 < f4) {
                f4 = f5;
            }
        }
        return f4;
    }

    public static int K(int i4, int i5, int i6) {
        if (i5 < i4) {
            i4 = i5;
        }
        return i6 < i4 ? i6 : i4;
    }

    public static int L(int... iArr) {
        m0(iArr);
        int i4 = iArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 < i4) {
                i4 = i6;
            }
        }
        return i4;
    }

    public static long M(long j4, long j5, long j6) {
        if (j5 < j4) {
            j4 = j5;
        }
        return j6 < j4 ? j6 : j4;
    }

    public static long N(long... jArr) {
        m0(jArr);
        long j4 = jArr[0];
        for (int i4 = 1; i4 < jArr.length; i4++) {
            long j5 = jArr[i4];
            if (j5 < j4) {
                j4 = j5;
            }
        }
        return j4;
    }

    public static short O(short s4, short s5, short s6) {
        if (s5 < s4) {
            s4 = s5;
        }
        return s6 < s4 ? s6 : s4;
    }

    public static short P(short... sArr) {
        m0(sArr);
        short s4 = sArr[0];
        for (int i4 = 1; i4 < sArr.length; i4++) {
            short s5 = sArr[i4];
            if (s5 < s4) {
                s4 = s5;
            }
        }
        return s4;
    }

    public static byte Q(String str) {
        return R(str, (byte) 0);
    }

    public static byte R(String str, byte b5) {
        if (str == null) {
            return b5;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b5;
        }
    }

    public static double S(String str) {
        return T(str, p.f60679p);
    }

    public static double T(String str, double d5) {
        if (str == null) {
            return d5;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d5;
        }
    }

    public static double U(BigDecimal bigDecimal) {
        return V(bigDecimal, p.f60679p);
    }

    public static double V(BigDecimal bigDecimal, double d5) {
        return bigDecimal == null ? d5 : bigDecimal.doubleValue();
    }

    public static float W(String str) {
        return X(str, 0.0f);
    }

    public static float X(String str, float f4) {
        if (str == null) {
            return f4;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f4;
        }
    }

    public static int Y(String str) {
        return Z(str, 0);
    }

    public static int Z(String str, int i4) {
        if (str == null) {
            return i4;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i4;
        }
    }

    public static int a(byte b5, byte b6) {
        return b5 - b6;
    }

    public static long a0(String str) {
        return b0(str, 0L);
    }

    public static int b(int i4, int i5) {
        if (i4 == i5) {
            return 0;
        }
        return i4 < i5 ? -1 : 1;
    }

    public static long b0(String str, long j4) {
        if (str == null) {
            return j4;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    public static int c(long j4, long j5) {
        if (j4 == j5) {
            return 0;
        }
        return j4 < j5 ? -1 : 1;
    }

    public static BigDecimal c0(Double d5) {
        return d0(d5, f93428f.intValue(), RoundingMode.HALF_EVEN);
    }

    public static int d(short s4, short s5) {
        if (s4 == s5) {
            return 0;
        }
        return s4 < s5 ? -1 : 1;
    }

    public static BigDecimal d0(Double d5, int i4, RoundingMode roundingMode) {
        return d5 == null ? BigDecimal.ZERO : j0(BigDecimal.valueOf(d5.doubleValue()), i4, roundingMode);
    }

    public static BigDecimal e(String str) {
        if (str == null) {
            return null;
        }
        if (b1.F0(str)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        return new BigDecimal(str);
    }

    public static BigDecimal e0(Float f4) {
        return f0(f4, f93428f.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigInteger f(String str) {
        int i4;
        if (str == null) {
            return null;
        }
        boolean startsWith = str.startsWith("-");
        int i5 = 16;
        if (str.startsWith("0x", startsWith ? 1 : 0) || str.startsWith("0X", startsWith ? 1 : 0)) {
            i4 = (startsWith ? 1 : 0) + 2;
        } else if (str.startsWith("#", startsWith ? 1 : 0)) {
            i4 = (startsWith ? 1 : 0) + 1;
        } else {
            if (str.startsWith("0", startsWith ? 1 : 0)) {
                int length = str.length();
                int i6 = (startsWith ? 1 : 0) + 1;
                if (length > i6) {
                    i5 = 8;
                    i4 = i6;
                }
            }
            i5 = 10;
            i4 = startsWith ? 1 : 0;
        }
        BigInteger bigInteger = new BigInteger(str.substring(i4), i5);
        return startsWith ? bigInteger.negate() : bigInteger;
    }

    public static BigDecimal f0(Float f4, int i4, RoundingMode roundingMode) {
        return f4 == null ? BigDecimal.ZERO : j0(BigDecimal.valueOf(f4.floatValue()), i4, roundingMode);
    }

    public static Double g(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }

    public static BigDecimal g0(String str) {
        return h0(str, f93428f.intValue(), RoundingMode.HALF_EVEN);
    }

    public static Float h(String str) {
        if (str == null) {
            return null;
        }
        return Float.valueOf(str);
    }

    public static BigDecimal h0(String str, int i4, RoundingMode roundingMode) {
        return str == null ? BigDecimal.ZERO : j0(e(str), i4, roundingMode);
    }

    public static Integer i(String str) {
        if (str == null) {
            return null;
        }
        return Integer.decode(str);
    }

    public static BigDecimal i0(BigDecimal bigDecimal) {
        return j0(bigDecimal, f93428f.intValue(), RoundingMode.HALF_EVEN);
    }

    public static Long j(String str) {
        if (str == null) {
            return null;
        }
        return Long.decode(str);
    }

    public static BigDecimal j0(BigDecimal bigDecimal, int i4, RoundingMode roundingMode) {
        if (bigDecimal == null) {
            return BigDecimal.ZERO;
        }
        if (roundingMode == null) {
            roundingMode = RoundingMode.HALF_EVEN;
        }
        return bigDecimal.setScale(i4, roundingMode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0117, code lost:
    
        if (r1 == 'l') goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Number k(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.c.k(java.lang.String):java.lang.Number");
    }

    public static short k0(String str) {
        return l0(str, (short) 0);
    }

    private static String l(String str) {
        return m(str, str.length());
    }

    public static short l0(String str, short s4) {
        if (str == null) {
            return s4;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s4;
        }
    }

    private static String m(String str, int i4) {
        char charAt = str.charAt(0);
        return str.substring((charAt == '-' || charAt == '+') ? 1 : 0, i4);
    }

    private static void m0(Object obj) {
        k1.b0(obj, "The Array must not be null", new Object[0]);
        k1.B(Array.getLength(obj) != 0, "Array cannot be empty.", new Object[0]);
    }

    private static boolean n(String str) {
        if (str == null) {
            return true;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) != '0') {
                return false;
            }
        }
        return !str.isEmpty();
    }

    private static boolean n0(String str, int i4) {
        int i5 = 0;
        while (i4 < str.length()) {
            boolean z4 = str.charAt(i4) == '.';
            if (z4) {
                i5++;
            }
            if (i5 > 1) {
                return false;
            }
            if (!z4 && !Character.isDigit(str.charAt(i4))) {
                return false;
            }
            i4++;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00c7, code lost:
    
        if (r14 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00ca, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00e6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008d, code lost:
    
        if (r3 >= r0.length) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008f, code lost:
    
        r0 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0091, code lost:
    
        if (r0 < '0') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0093, code lost:
    
        if (r0 > '9') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0095, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0096, code lost:
    
        if (r0 == 'e') goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0098, code lost:
    
        if (r0 != 'E') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009b, code lost:
    
        if (r0 != '.') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x009d, code lost:
    
        if (r16 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009f, code lost:
    
        if (r15 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a2, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a4, code lost:
    
        if (r13 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a8, code lost:
    
        if (r0 == 'd') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ac, code lost:
    
        if (r0 == 'D') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ae, code lost:
    
        if (r0 == 'f') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b0, code lost:
    
        if (r0 != 'F') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b2, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b5, code lost:
    
        if (r0 == 'l') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b9, code lost:
    
        if (r0 != 'L') goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00bc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00bd, code lost:
    
        if (r14 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00bf, code lost:
    
        if (r15 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c1, code lost:
    
        if (r16 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00c4, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00c5, code lost:
    
        if (r13 != false) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.c.o(java.lang.String):boolean");
    }

    public static boolean p(String str) {
        return b1.M0(str);
    }

    @Deprecated
    public static boolean q(String str) {
        return o(str);
    }

    public static boolean r(String str) {
        if (b1.G0(str) || str.charAt(str.length() - 1) == '.') {
            return false;
        }
        if (str.charAt(0) != '-') {
            return n0(str, 0);
        }
        if (str.length() == 1) {
            return false;
        }
        return n0(str, 1);
    }

    public static byte s(byte b5, byte b6, byte b7) {
        if (b6 > b5) {
            b5 = b6;
        }
        return b7 > b5 ? b7 : b5;
    }

    public static byte t(byte... bArr) {
        m0(bArr);
        byte b5 = bArr[0];
        for (int i4 = 1; i4 < bArr.length; i4++) {
            byte b6 = bArr[i4];
            if (b6 > b5) {
                b5 = b6;
            }
        }
        return b5;
    }

    public static double u(double d5, double d6, double d7) {
        return Math.max(Math.max(d5, d6), d7);
    }

    public static double v(double... dArr) {
        m0(dArr);
        double d5 = dArr[0];
        for (int i4 = 1; i4 < dArr.length; i4++) {
            if (Double.isNaN(dArr[i4])) {
                return Double.NaN;
            }
            double d6 = dArr[i4];
            if (d6 > d5) {
                d5 = d6;
            }
        }
        return d5;
    }

    public static float w(float f4, float f5, float f6) {
        return Math.max(Math.max(f4, f5), f6);
    }

    public static float x(float... fArr) {
        m0(fArr);
        float f4 = fArr[0];
        for (int i4 = 1; i4 < fArr.length; i4++) {
            if (Float.isNaN(fArr[i4])) {
                return Float.NaN;
            }
            float f5 = fArr[i4];
            if (f5 > f4) {
                f4 = f5;
            }
        }
        return f4;
    }

    public static int y(int i4, int i5, int i6) {
        if (i5 > i4) {
            i4 = i5;
        }
        return i6 > i4 ? i6 : i4;
    }

    public static int z(int... iArr) {
        m0(iArr);
        int i4 = iArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 > i4) {
                i4 = i6;
            }
        }
        return i4;
    }
}
