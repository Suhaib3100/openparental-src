package ye;

import java.math.BigInteger;
import org.apache.commons.lang3.k1;

/* compiled from: Fraction.java */
/* loaded from: classes6.dex */
public final class a extends Number implements Comparable<a> {

    /* renamed from: g, reason: collision with root package name */
    private static final long f93405g = 65382027393090L;

    /* renamed from: h, reason: collision with root package name */
    public static final a f93406h = new a(0, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f93407i = new a(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f93408j = new a(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final a f93409k = new a(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final a f93410l = new a(2, 3);

    /* renamed from: m, reason: collision with root package name */
    public static final a f93411m = new a(1, 4);

    /* renamed from: n, reason: collision with root package name */
    public static final a f93412n = new a(2, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f93413o = new a(3, 4);

    /* renamed from: p, reason: collision with root package name */
    public static final a f93414p = new a(1, 5);

    /* renamed from: q, reason: collision with root package name */
    public static final a f93415q = new a(2, 5);

    /* renamed from: r, reason: collision with root package name */
    public static final a f93416r = new a(3, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final a f93417s = new a(4, 5);

    /* renamed from: b, reason: collision with root package name */
    private final int f93418b;

    /* renamed from: c, reason: collision with root package name */
    private final int f93419c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f93420d = 0;

    /* renamed from: e, reason: collision with root package name */
    private transient String f93421e = null;

    /* renamed from: f, reason: collision with root package name */
    private transient String f93422f = null;

    private a(int i4, int i5) {
        this.f93418b = i4;
        this.f93419c = i5;
    }

    private static int c(int i4, int i5) {
        long j4 = i4 + i5;
        if (j4 < -2147483648L || j4 > 2147483647L) {
            throw new ArithmeticException("overflow: add");
        }
        return (int) j4;
    }

    private a d(a aVar, boolean z4) {
        k1.b0(aVar, "The fraction must not be null", new Object[0]);
        if (this.f93418b == 0) {
            return z4 ? aVar : aVar.u();
        }
        if (aVar.f93418b == 0) {
            return this;
        }
        int p4 = p(this.f93419c, aVar.f93419c);
        if (p4 == 1) {
            int r4 = r(this.f93418b, aVar.f93419c);
            int r5 = r(aVar.f93418b, this.f93419c);
            return new a(z4 ? c(r4, r5) : x(r4, r5), s(this.f93419c, aVar.f93419c));
        }
        BigInteger multiply = BigInteger.valueOf(this.f93418b).multiply(BigInteger.valueOf(aVar.f93419c / p4));
        BigInteger multiply2 = BigInteger.valueOf(aVar.f93418b).multiply(BigInteger.valueOf(this.f93419c / p4));
        BigInteger add = z4 ? multiply.add(multiply2) : multiply.subtract(multiply2);
        int intValue = add.mod(BigInteger.valueOf(p4)).intValue();
        int p5 = intValue == 0 ? p4 : p(intValue, p4);
        BigInteger divide = add.divide(BigInteger.valueOf(p5));
        if (divide.bitLength() <= 31) {
            return new a(divide.intValue(), s(this.f93419c / p4, aVar.f93419c / p5));
        }
        throw new ArithmeticException("overflow: numerator too large after multiply");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        return o(((r4 * r10) + r8) * r0, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ye.a h(double r21) {
        /*
            r0 = 0
            int r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8
            r0 = -1
            goto L9
        L8:
            r0 = 1
        L9:
            double r2 = java.lang.Math.abs(r21)
            r4 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L84
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L84
            int r4 = (int) r2
            double r5 = (double) r4
            double r2 = r2 - r5
            int r5 = (int) r2
            double r6 = (double) r5
            double r6 = r2 - r6
            r8 = 0
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r21 = r2
            r13 = r11
            r15 = 1
            r16 = 1
            r11 = r9
            r9 = r8
            r10 = r9
            r8 = 1
        L35:
            double r1 = r11 / r6
            int r1 = (int) r1
            double r2 = (double) r1
            double r2 = r2 * r6
            double r2 = r11 - r2
            int r11 = r5 * r8
            int r11 = r11 + r9
            int r5 = r5 * r10
            int r5 = r5 + r15
            r9 = r1
            r17 = r2
            double r1 = (double) r11
            r19 = r6
            double r6 = (double) r5
            double r1 = r1 / r6
            r6 = r21
            double r2 = r6 - r1
            double r1 = java.lang.Math.abs(r2)
            r3 = 1
            int r12 = r16 + 1
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            r14 = 25
            if (r13 <= 0) goto L72
            r13 = 10000(0x2710, float:1.4013E-41)
            if (r5 > r13) goto L72
            if (r5 <= 0) goto L72
            if (r12 < r14) goto L63
            goto L72
        L63:
            r13 = r1
            r21 = r6
            r15 = r10
            r16 = r12
            r6 = r17
            r10 = r5
            r5 = r9
            r9 = r8
            r8 = r11
            r11 = r19
            goto L35
        L72:
            if (r12 == r14) goto L7c
            int r4 = r4 * r10
            int r4 = r4 + r8
            int r4 = r4 * r0
            ye.a r0 = o(r4, r10)
            return r0
        L7c:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Unable to convert double to fraction"
            r0.<init>(r1)
            throw r0
        L84:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "The value must not be greater than Integer.MAX_VALUE or NaN"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.a.h(double):ye.a");
    }

    public static a i(int i4, int i5) {
        if (i5 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i5 < 0) {
            if (i4 == Integer.MIN_VALUE || i5 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: can't negate");
            }
            i4 = -i4;
            i5 = -i5;
        }
        return new a(i4, i5);
    }

    public static a j(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i6 < 0) {
            throw new ArithmeticException("The denominator must not be negative");
        }
        if (i5 < 0) {
            throw new ArithmeticException("The numerator must not be negative");
        }
        long j4 = i4 < 0 ? (i4 * i6) - i5 : (i4 * i6) + i5;
        if (j4 < -2147483648L || j4 > 2147483647L) {
            throw new ArithmeticException("Numerator too large to represent as an Integer.");
        }
        return new a((int) j4, i6);
    }

    public static a k(String str) {
        k1.b0(str, "The string must not be null", new Object[0]);
        if (str.indexOf(46) >= 0) {
            return h(Double.parseDouble(str));
        }
        int indexOf = str.indexOf(32);
        if (indexOf <= 0) {
            int indexOf2 = str.indexOf(47);
            return indexOf2 < 0 ? i(Integer.parseInt(str), 1) : i(Integer.parseInt(str.substring(0, indexOf2)), Integer.parseInt(str.substring(indexOf2 + 1)));
        }
        int parseInt = Integer.parseInt(str.substring(0, indexOf));
        String substring = str.substring(indexOf + 1);
        int indexOf3 = substring.indexOf(47);
        if (indexOf3 >= 0) {
            return j(parseInt, Integer.parseInt(substring.substring(0, indexOf3)), Integer.parseInt(substring.substring(indexOf3 + 1)));
        }
        throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
    }

    public static a o(int i4, int i5) {
        if (i5 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i4 == 0) {
            return f93406h;
        }
        if (i5 == Integer.MIN_VALUE && (i4 & 1) == 0) {
            i4 /= 2;
            i5 /= 2;
        }
        if (i5 < 0) {
            if (i4 == Integer.MIN_VALUE || i5 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: can't negate");
            }
            i4 = -i4;
            i5 = -i5;
        }
        int p4 = p(i4, i5);
        return new a(i4 / p4, i5 / p4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r3 != 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if ((r0 & 1) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r0 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r6 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        r0 = (r7 - r6) / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r0 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        return (-r6) * (1 << r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0043, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003c, code lost:
    
        r0 = r0 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0035, code lost:
    
        r0 = -(r6 / 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int p(int r6, int r7) {
        /*
            java.lang.String r0 = "overflow: gcd is 2^31"
            if (r6 == 0) goto L56
            if (r7 != 0) goto L7
            goto L56
        L7:
            int r1 = java.lang.Math.abs(r6)
            r2 = 1
            if (r1 == r2) goto L55
            int r1 = java.lang.Math.abs(r7)
            if (r1 != r2) goto L15
            goto L55
        L15:
            if (r6 <= 0) goto L18
            int r6 = -r6
        L18:
            if (r7 <= 0) goto L1b
            int r7 = -r7
        L1b:
            r1 = 0
        L1c:
            r3 = r6 & 1
            r4 = 31
            if (r3 != 0) goto L2f
            r5 = r7 & 1
            if (r5 != 0) goto L2f
            if (r1 >= r4) goto L2f
            int r6 = r6 / 2
            int r7 = r7 / 2
            int r1 = r1 + 1
            goto L1c
        L2f:
            if (r1 == r4) goto L4f
            if (r3 != r2) goto L35
            r0 = r7
            goto L38
        L35:
            int r0 = r6 / 2
            int r0 = -r0
        L38:
            r3 = r0 & 1
            if (r3 != 0) goto L3f
            int r0 = r0 / 2
            goto L38
        L3f:
            if (r0 <= 0) goto L43
            int r6 = -r0
            goto L44
        L43:
            r7 = r0
        L44:
            int r0 = r7 - r6
            int r0 = r0 / 2
            if (r0 != 0) goto L38
            int r6 = -r6
            int r7 = r2 << r1
            int r6 = r6 * r7
            return r6
        L4f:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            r6.<init>(r0)
            throw r6
        L55:
            return r2
        L56:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r1) goto L66
            if (r7 == r1) goto L66
            int r6 = java.lang.Math.abs(r6)
            int r7 = java.lang.Math.abs(r7)
            int r7 = r7 + r6
            return r7
        L66:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.a.p(int, int):int");
    }

    private static int r(int i4, int i5) {
        long j4 = i4 * i5;
        if (j4 < -2147483648L || j4 > 2147483647L) {
            throw new ArithmeticException("overflow: mul");
        }
        return (int) j4;
    }

    private static int s(int i4, int i5) {
        long j4 = i4 * i5;
        if (j4 <= 2147483647L) {
            return (int) j4;
        }
        throw new ArithmeticException("overflow: mulPos");
    }

    private static int x(int i4, int i5) {
        long j4 = i4 - i5;
        if (j4 < -2147483648L || j4 > 2147483647L) {
            throw new ArithmeticException("overflow: add");
        }
        return (int) j4;
    }

    public a a() {
        return this.f93418b >= 0 ? this : u();
    }

    public a b(a aVar) {
        return d(aVar, true);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f93418b / this.f93419c;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        if (this == aVar) {
            return 0;
        }
        int i4 = this.f93418b;
        int i5 = aVar.f93418b;
        if (i4 == i5 && this.f93419c == aVar.f93419c) {
            return 0;
        }
        return Long.compare(i4 * aVar.f93419c, i5 * this.f93419c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f93418b == aVar.f93418b && this.f93419c == aVar.f93419c;
    }

    public a f(a aVar) {
        k1.b0(aVar, "The fraction must not be null", new Object[0]);
        if (aVar.f93418b != 0) {
            return t(aVar.q());
        }
        throw new ArithmeticException("The fraction to divide by must not be zero");
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f93418b / this.f93419c;
    }

    public int g() {
        return this.f93419c;
    }

    public int hashCode() {
        if (this.f93420d == 0) {
            this.f93420d = ((this.f93418b + 629) * 37) + this.f93419c;
        }
        return this.f93420d;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f93418b / this.f93419c;
    }

    public int l() {
        return this.f93418b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f93418b / this.f93419c;
    }

    public int m() {
        return Math.abs(this.f93418b % this.f93419c);
    }

    public int n() {
        return this.f93418b / this.f93419c;
    }

    public a q() {
        int i4 = this.f93418b;
        if (i4 == 0) {
            throw new ArithmeticException("Unable to invert zero.");
        }
        if (i4 != Integer.MIN_VALUE) {
            return i4 < 0 ? new a(-this.f93419c, -i4) : new a(this.f93419c, i4);
        }
        throw new ArithmeticException("overflow: can't negate numerator");
    }

    public a t(a aVar) {
        k1.b0(aVar, "The fraction must not be null", new Object[0]);
        int i4 = this.f93418b;
        if (i4 == 0 || aVar.f93418b == 0) {
            return f93406h;
        }
        int p4 = p(i4, aVar.f93419c);
        int p5 = p(aVar.f93418b, this.f93419c);
        return o(r(this.f93418b / p4, aVar.f93418b / p5), s(this.f93419c / p5, aVar.f93419c / p4));
    }

    public String toString() {
        if (this.f93421e == null) {
            this.f93421e = this.f93418b + "/" + this.f93419c;
        }
        return this.f93421e;
    }

    public a u() {
        int i4 = this.f93418b;
        if (i4 != Integer.MIN_VALUE) {
            return new a(-i4, this.f93419c);
        }
        throw new ArithmeticException("overflow: too large to negate");
    }

    public a v(int i4) {
        if (i4 == 1) {
            return this;
        }
        if (i4 == 0) {
            return f93407i;
        }
        if (i4 < 0) {
            return i4 == Integer.MIN_VALUE ? q().v(2).v(-(i4 / 2)) : q().v(-i4);
        }
        a t4 = t(this);
        return i4 % 2 == 0 ? t4.v(i4 / 2) : t4.v(i4 / 2).t(this);
    }

    public a w() {
        int i4 = this.f93418b;
        if (i4 == 0) {
            a aVar = f93406h;
            return equals(aVar) ? this : aVar;
        }
        int p4 = p(Math.abs(i4), this.f93419c);
        return p4 == 1 ? this : i(this.f93418b / p4, this.f93419c / p4);
    }

    public a y(a aVar) {
        return d(aVar, false);
    }

    public String z() {
        if (this.f93422f == null) {
            int i4 = this.f93418b;
            if (i4 == 0) {
                this.f93422f = "0";
            } else {
                int i5 = this.f93419c;
                if (i4 == i5) {
                    this.f93422f = "1";
                } else if (i4 == i5 * (-1)) {
                    this.f93422f = "-1";
                } else {
                    if (i4 > 0) {
                        i4 = -i4;
                    }
                    if (i4 < (-i5)) {
                        int m4 = m();
                        if (m4 == 0) {
                            this.f93422f = Integer.toString(n());
                        } else {
                            this.f93422f = n() + " " + m4 + "/" + this.f93419c;
                        }
                    } else {
                        this.f93422f = this.f93418b + "/" + this.f93419c;
                    }
                }
            }
        }
        return this.f93422f;
    }
}
