package org.threeten.bp;

import com.tencent.mmkv.MMKV;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.threeten.bp.format.DateTimeParseException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: Duration.java */
/* loaded from: classes9.dex */
public final class e implements org.threeten.bp.temporal.i, Comparable<e>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f88069e = 3078945930695997490L;

    /* renamed from: f, reason: collision with root package name */
    private static final int f88070f = 1000000000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f88071g = 1000000;

    /* renamed from: b, reason: collision with root package name */
    private final long f88074b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88075c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f88068d = new e(0, 0);

    /* renamed from: h, reason: collision with root package name */
    private static final BigInteger f88072h = BigInteger.valueOf(1000000000);

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f88073i = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    /* compiled from: Duration.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88076a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f88076a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88076a[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88076a[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88076a[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private e(long j4, int i4) {
        this.f88074b = j4;
        this.f88075c = i4;
    }

    public static e A(long j4, org.threeten.bp.temporal.m mVar) {
        return f88068d.R(j4, mVar);
    }

    public static e B(long j4) {
        return h(ng.d.n(j4, MMKV.ExpireInDay), 0);
    }

    public static e C(long j4) {
        return h(ng.d.n(j4, MMKV.ExpireInHour), 0);
    }

    public static e E(long j4) {
        long j5 = j4 / 1000;
        int i4 = (int) (j4 % 1000);
        if (i4 < 0) {
            i4 += 1000;
            j5--;
        }
        return h(j5, i4 * 1000000);
    }

    public static e G(long j4) {
        return h(ng.d.n(j4, 60), 0);
    }

    public static e J(long j4) {
        long j5 = j4 / 1000000000;
        int i4 = (int) (j4 % 1000000000);
        if (i4 < 0) {
            i4 += 1000000000;
            j5--;
        }
        return h(j5, i4);
    }

    public static e K(long j4) {
        return h(j4, 0);
    }

    public static e L(long j4, long j5) {
        return h(ng.d.l(j4, ng.d.e(j5, 1000000000L)), ng.d.g(j5, 1000000000));
    }

    public static e M(CharSequence charSequence) {
        ng.d.j(charSequence, "text");
        Matcher matcher = f88073i.matcher(charSequence);
        if (matcher.matches() && !"T".equals(matcher.group(3))) {
            int i4 = 1;
            boolean equals = "-".equals(matcher.group(1));
            String group = matcher.group(2);
            String group2 = matcher.group(4);
            String group3 = matcher.group(5);
            String group4 = matcher.group(6);
            String group5 = matcher.group(7);
            if (group != null || group2 != null || group3 != null || group4 != null) {
                long P = P(charSequence, group, MMKV.ExpireInDay, "days");
                long P2 = P(charSequence, group2, MMKV.ExpireInHour, "hours");
                long P3 = P(charSequence, group3, 60, "minutes");
                long P4 = P(charSequence, group4, 1, "seconds");
                if (group4 != null && group4.charAt(0) == '-') {
                    i4 = -1;
                }
                try {
                    return j(equals, P, P2, P3, P4, N(charSequence, group5, i4));
                } catch (ArithmeticException e4) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: overflow", charSequence, 0).initCause(e4));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Duration", charSequence, 0);
    }

    private static int N(CharSequence charSequence, String str, int i4) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            return Integer.parseInt(str.concat("000000000").substring(0, 9)) * i4;
        } catch (ArithmeticException e4) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e4));
        } catch (NumberFormatException e5) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e5));
        }
    }

    private static long P(CharSequence charSequence, String str, int i4, String str2) {
        if (str == null) {
            return 0L;
        }
        try {
            if (str.startsWith("+")) {
                str = str.substring(1);
            }
            return ng.d.n(Long.parseLong(str), i4);
        } catch (ArithmeticException e4) {
            throw ((DateTimeParseException) new DateTimeParseException(androidx.constraintlayout.core.motion.key.c.a("Text cannot be parsed to a Duration: ", str2), charSequence, 0).initCause(e4));
        } catch (NumberFormatException e5) {
            throw ((DateTimeParseException) new DateTimeParseException(androidx.constraintlayout.core.motion.key.c.a("Text cannot be parsed to a Duration: ", str2), charSequence, 0).initCause(e5));
        }
    }

    private e Q(long j4, long j5) {
        if ((j4 | j5) == 0) {
            return this;
        }
        return L(ng.d.l(ng.d.l(this.f88074b, j4), j5 / 1000000000), this.f88075c + (j5 % 1000000000));
    }

    static e Z(DataInput dataInput) throws IOException {
        return L(dataInput.readLong(), dataInput.readInt());
    }

    public static e f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.e eVar2) {
        org.threeten.bp.temporal.b bVar = org.threeten.bp.temporal.b.SECONDS;
        long f4 = eVar.f(eVar2, bVar);
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.NANO_OF_SECOND;
        long j4 = 0;
        if (eVar.isSupported(aVar) && eVar2.isSupported(aVar)) {
            try {
                long j5 = eVar.getLong(aVar);
                long j6 = eVar2.getLong(aVar) - j5;
                if (f4 > 0 && j6 < 0) {
                    j6 += 1000000000;
                } else if (f4 < 0 && j6 > 0) {
                    j6 -= 1000000000;
                } else if (f4 == 0 && j6 != 0) {
                    try {
                        f4 = eVar.f(eVar2.b(aVar, j5), bVar);
                    } catch (ArithmeticException | DateTimeException unused) {
                    }
                }
                j4 = j6;
            } catch (ArithmeticException | DateTimeException unused2) {
            }
        }
        return L(f4, j4);
    }

    private static e h(long j4, int i4) {
        return (((long) i4) | j4) == 0 ? f88068d : new e(j4, i4);
    }

    private static e i(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(f88072h);
        if (divideAndRemainder[0].bitLength() <= 63) {
            return L(divideAndRemainder[0].longValue(), divideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    private static e j(boolean z4, long j4, long j5, long j6, long j7, int i4) {
        long l4 = ng.d.l(j4, ng.d.l(j5, ng.d.l(j6, j7)));
        return z4 ? L(l4, i4).y(-1L) : L(l4, i4);
    }

    private BigDecimal k0() {
        return BigDecimal.valueOf(this.f88074b).add(BigDecimal.valueOf(this.f88075c, 9));
    }

    public static e l(org.threeten.bp.temporal.i iVar) {
        ng.d.j(iVar, "amount");
        e eVar = f88068d;
        for (org.threeten.bp.temporal.m mVar : iVar.d()) {
            eVar = eVar.R(iVar.c(mVar), mVar);
        }
        return eVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 1, this);
    }

    public e R(long j4, org.threeten.bp.temporal.m mVar) {
        ng.d.j(mVar, "unit");
        if (mVar == org.threeten.bp.temporal.b.DAYS) {
            return Q(ng.d.n(j4, MMKV.ExpireInDay), 0L);
        }
        if (mVar.isDurationEstimated()) {
            throw new DateTimeException("Unit must not have an estimated duration");
        }
        if (j4 == 0) {
            return this;
        }
        if (mVar instanceof org.threeten.bp.temporal.b) {
            int i4 = a.f88076a[((org.threeten.bp.temporal.b) mVar).ordinal()];
            return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? Q(ng.d.o(mVar.getDuration().f88074b, j4), 0L) : Q(j4, 0L) : V(j4) : Q((j4 / 1000000000) * 1000, 0L).Q(0L, (j4 % 1000000000) * 1000) : Q(0L, j4);
        }
        return Q(mVar.getDuration().y(j4).f88074b, 0L).Q(0L, r10.f88075c);
    }

    public e S(e eVar) {
        return Q(eVar.f88074b, eVar.f88075c);
    }

    public e T(long j4) {
        return Q(ng.d.n(j4, MMKV.ExpireInDay), 0L);
    }

    public e U(long j4) {
        return Q(ng.d.n(j4, MMKV.ExpireInHour), 0L);
    }

    public e V(long j4) {
        return Q(j4 / 1000, (j4 % 1000) * 1000000);
    }

    public e W(long j4) {
        return Q(ng.d.n(j4, 60), 0L);
    }

    public e X(long j4) {
        return Q(0L, j4);
    }

    public e Y(long j4) {
        return Q(j4, 0L);
    }

    @Override // org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e a(org.threeten.bp.temporal.e eVar) {
        long j4 = this.f88074b;
        if (j4 != 0) {
            eVar = eVar.t(j4, org.threeten.bp.temporal.b.SECONDS);
        }
        int i4 = this.f88075c;
        return i4 != 0 ? eVar.t(i4, org.threeten.bp.temporal.b.NANOS) : eVar;
    }

    public long a0() {
        return this.f88074b / 86400;
    }

    @Override // org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        long j4 = this.f88074b;
        if (j4 != 0) {
            eVar = eVar.v(j4, org.threeten.bp.temporal.b.SECONDS);
        }
        int i4 = this.f88075c;
        return i4 != 0 ? eVar.v(i4, org.threeten.bp.temporal.b.NANOS) : eVar;
    }

    public long b0() {
        return this.f88074b / 86400;
    }

    @Override // org.threeten.bp.temporal.i
    public long c(org.threeten.bp.temporal.m mVar) {
        if (mVar == org.threeten.bp.temporal.b.SECONDS) {
            return this.f88074b;
        }
        if (mVar == org.threeten.bp.temporal.b.NANOS) {
            return this.f88075c;
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
    }

    public long c0() {
        return this.f88074b / 3600;
    }

    @Override // org.threeten.bp.temporal.i
    public List<org.threeten.bp.temporal.m> d() {
        return Collections.unmodifiableList(Arrays.asList(org.threeten.bp.temporal.b.SECONDS, org.threeten.bp.temporal.b.NANOS));
    }

    public int d0() {
        return (int) (c0() % 24);
    }

    public e e() {
        return o() ? y(-1L) : this;
    }

    public long e0() {
        return ng.d.l(ng.d.n(this.f88074b, 1000), this.f88075c / 1000000);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f88074b == eVar.f88074b && this.f88075c == eVar.f88075c;
    }

    public int f0() {
        return this.f88075c / 1000000;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int b5 = ng.d.b(this.f88074b, eVar.f88074b);
        return b5 != 0 ? b5 : this.f88075c - eVar.f88075c;
    }

    public long g0() {
        return this.f88074b / 60;
    }

    public int h0() {
        return (int) (g0() % 60);
    }

    public int hashCode() {
        long j4 = this.f88074b;
        return (this.f88075c * 51) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public long i0() {
        return ng.d.l(ng.d.n(this.f88074b, 1000000000), this.f88075c);
    }

    public int j0() {
        return this.f88075c;
    }

    public e k(long j4) {
        if (j4 != 0) {
            return j4 == 1 ? this : i(k0().divide(BigDecimal.valueOf(j4), RoundingMode.DOWN));
        }
        throw new ArithmeticException("Cannot divide by zero");
    }

    public int l0() {
        return (int) (this.f88074b % 60);
    }

    public int m() {
        return this.f88075c;
    }

    public e m0(int i4) {
        org.threeten.bp.temporal.a.NANO_OF_SECOND.checkValidIntValue(i4);
        return h(this.f88074b, i4);
    }

    public long n() {
        return this.f88074b;
    }

    public e n0(long j4) {
        return h(j4, this.f88075c);
    }

    public boolean o() {
        return this.f88074b < 0;
    }

    void o0(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f88074b);
        dataOutput.writeInt(this.f88075c);
    }

    public boolean p() {
        return (this.f88074b | ((long) this.f88075c)) == 0;
    }

    public e q(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? R(Long.MAX_VALUE, mVar).R(1L, mVar) : R(-j4, mVar);
    }

    public e r(e eVar) {
        long j4 = eVar.f88074b;
        int i4 = eVar.f88075c;
        return j4 == Long.MIN_VALUE ? Q(Long.MAX_VALUE, -i4).Q(1L, 0L) : Q(-j4, -i4);
    }

    public e s(long j4) {
        return j4 == Long.MIN_VALUE ? T(Long.MAX_VALUE).T(1L) : T(-j4);
    }

    public e t(long j4) {
        return j4 == Long.MIN_VALUE ? U(Long.MAX_VALUE).U(1L) : U(-j4);
    }

    public String toString() {
        if (this == f88068d) {
            return "PT0S";
        }
        long j4 = this.f88074b;
        long j5 = j4 / 3600;
        int i4 = (int) ((j4 % 3600) / 60);
        int i5 = (int) (j4 % 60);
        StringBuilder a5 = androidx.fragment.app.a.a(24, "PT");
        if (j5 != 0) {
            a5.append(j5);
            a5.append('H');
        }
        if (i4 != 0) {
            a5.append(i4);
            a5.append('M');
        }
        if (i5 == 0 && this.f88075c == 0 && a5.length() > 2) {
            return a5.toString();
        }
        if (i5 >= 0 || this.f88075c <= 0) {
            a5.append(i5);
        } else if (i5 == -1) {
            a5.append("-0");
        } else {
            a5.append(i5 + 1);
        }
        if (this.f88075c > 0) {
            int length = a5.length();
            if (i5 < 0) {
                a5.append(2000000000 - this.f88075c);
            } else {
                a5.append(this.f88075c + 1000000000);
            }
            while (a5.charAt(a5.length() - 1) == '0') {
                a5.setLength(a5.length() - 1);
            }
            a5.setCharAt(length, '.');
        }
        a5.append('S');
        return a5.toString();
    }

    public e u(long j4) {
        return j4 == Long.MIN_VALUE ? V(Long.MAX_VALUE).V(1L) : V(-j4);
    }

    public e v(long j4) {
        return j4 == Long.MIN_VALUE ? W(Long.MAX_VALUE).W(1L) : W(-j4);
    }

    public e w(long j4) {
        return j4 == Long.MIN_VALUE ? Q(0L, Long.MAX_VALUE).Q(0L, 1L) : Q(0L, -j4);
    }

    public e x(long j4) {
        return j4 == Long.MIN_VALUE ? Q(Long.MAX_VALUE, 0L).Q(1L, 0L) : Q(-j4, 0L);
    }

    public e y(long j4) {
        return j4 == 0 ? f88068d : j4 == 1 ? this : i(k0().multiply(BigDecimal.valueOf(j4)));
    }

    public e z() {
        return y(-1L);
    }
}
