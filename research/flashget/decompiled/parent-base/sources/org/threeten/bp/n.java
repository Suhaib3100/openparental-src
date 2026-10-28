package org.threeten.bp;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.threeten.bp.format.DateTimeParseException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: Period.java */
/* loaded from: classes9.dex */
public final class n extends org.threeten.bp.chrono.f implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final long f88289f = -8290556941213247973L;

    /* renamed from: b, reason: collision with root package name */
    private final int f88291b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88292c;

    /* renamed from: d, reason: collision with root package name */
    private final int f88293d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f88288e = new n(0, 0, 0);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f88290g = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    private n(int i4, int i5, int i6) {
        this.f88291b = i4;
        this.f88292c = i5;
        this.f88293d = i6;
    }

    public static n A(int i4, int i5, int i6) {
        return o(i4, i5, i6);
    }

    public static n B(int i4) {
        return o(0, 0, i4);
    }

    public static n C(int i4) {
        return o(0, i4, 0);
    }

    public static n D(int i4) {
        return o(0, 0, ng.d.m(i4, 7));
    }

    public static n E(int i4) {
        return o(i4, 0, 0);
    }

    public static n F(CharSequence charSequence) {
        ng.d.j(charSequence, "text");
        Matcher matcher = f88290g.matcher(charSequence);
        if (matcher.matches()) {
            int i4 = "-".equals(matcher.group(1)) ? -1 : 1;
            String group = matcher.group(2);
            String group2 = matcher.group(3);
            String group3 = matcher.group(4);
            String group4 = matcher.group(5);
            if (group != null || group2 != null || group3 != null || group4 != null) {
                try {
                    return o(G(charSequence, group, i4), G(charSequence, group2, i4), ng.d.k(G(charSequence, group4, i4), ng.d.m(G(charSequence, group3, i4), 7)));
                } catch (NumberFormatException e4) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e4));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0);
    }

    private static int G(CharSequence charSequence, String str, int i4) {
        if (str == null) {
            return 0;
        }
        try {
            return ng.d.m(Integer.parseInt(str), i4);
        } catch (ArithmeticException e4) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e4));
        }
    }

    public static n n(g gVar, g gVar2) {
        return gVar.G(gVar2);
    }

    private static n o(int i4, int i5, int i6) {
        return ((i4 | i5) | i6) == 0 ? f88288e : new n(i4, i5, i6);
    }

    public static n p(org.threeten.bp.temporal.i iVar) {
        if (iVar instanceof n) {
            return (n) iVar;
        }
        if ((iVar instanceof org.threeten.bp.chrono.f) && !org.threeten.bp.chrono.o.f88011f.equals(((org.threeten.bp.chrono.f) iVar).f())) {
            throw new DateTimeException("Period requires ISO chronology: " + iVar);
        }
        ng.d.j(iVar, "amount");
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (org.threeten.bp.temporal.m mVar : iVar.d()) {
            long c5 = iVar.c(mVar);
            if (mVar == org.threeten.bp.temporal.b.YEARS) {
                i4 = ng.d.r(c5);
            } else if (mVar == org.threeten.bp.temporal.b.MONTHS) {
                i5 = ng.d.r(c5);
            } else {
                if (mVar != org.threeten.bp.temporal.b.DAYS) {
                    throw new DateTimeException("Unit must be Years, Months or Days, but was " + mVar);
                }
                i6 = ng.d.r(c5);
            }
        }
        return o(i4, i5, i6);
    }

    private Object readResolve() {
        return ((this.f88291b | this.f88292c) | this.f88293d) == 0 ? f88288e : this;
    }

    @Override // org.threeten.bp.chrono.f
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public n m(org.threeten.bp.temporal.i iVar) {
        n p4 = p(iVar);
        return o(ng.d.k(this.f88291b, p4.f88291b), ng.d.k(this.f88292c, p4.f88292c), ng.d.k(this.f88293d, p4.f88293d));
    }

    public n I(long j4) {
        return j4 == 0 ? this : o(this.f88291b, this.f88292c, ng.d.r(ng.d.l(this.f88293d, j4)));
    }

    public n J(long j4) {
        return j4 == 0 ? this : o(this.f88291b, ng.d.r(ng.d.l(this.f88292c, j4)), this.f88293d);
    }

    public n K(long j4) {
        return j4 == 0 ? this : o(ng.d.r(ng.d.l(this.f88291b, j4)), this.f88292c, this.f88293d);
    }

    public long L() {
        return (this.f88291b * 12) + this.f88292c;
    }

    public n M(int i4) {
        return i4 == this.f88293d ? this : o(this.f88291b, this.f88292c, i4);
    }

    public n N(int i4) {
        return i4 == this.f88292c ? this : o(this.f88291b, i4, this.f88293d);
    }

    public n O(int i4) {
        return i4 == this.f88291b ? this : o(i4, this.f88292c, this.f88293d);
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e a(org.threeten.bp.temporal.e eVar) {
        ng.d.j(eVar, "temporal");
        int i4 = this.f88291b;
        if (i4 != 0) {
            eVar = this.f88292c != 0 ? eVar.t(L(), org.threeten.bp.temporal.b.MONTHS) : eVar.t(i4, org.threeten.bp.temporal.b.YEARS);
        } else {
            int i5 = this.f88292c;
            if (i5 != 0) {
                eVar = eVar.t(i5, org.threeten.bp.temporal.b.MONTHS);
            }
        }
        int i6 = this.f88293d;
        return i6 != 0 ? eVar.t(i6, org.threeten.bp.temporal.b.DAYS) : eVar;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        ng.d.j(eVar, "temporal");
        int i4 = this.f88291b;
        if (i4 != 0) {
            eVar = this.f88292c != 0 ? eVar.v(L(), org.threeten.bp.temporal.b.MONTHS) : eVar.v(i4, org.threeten.bp.temporal.b.YEARS);
        } else {
            int i5 = this.f88292c;
            if (i5 != 0) {
                eVar = eVar.v(i5, org.threeten.bp.temporal.b.MONTHS);
            }
        }
        int i6 = this.f88293d;
        return i6 != 0 ? eVar.v(i6, org.threeten.bp.temporal.b.DAYS) : eVar;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public long c(org.threeten.bp.temporal.m mVar) {
        int i4;
        if (mVar == org.threeten.bp.temporal.b.YEARS) {
            i4 = this.f88291b;
        } else if (mVar == org.threeten.bp.temporal.b.MONTHS) {
            i4 = this.f88292c;
        } else {
            if (mVar != org.threeten.bp.temporal.b.DAYS) {
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
            }
            i4 = this.f88293d;
        }
        return i4;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public List<org.threeten.bp.temporal.m> d() {
        return Collections.unmodifiableList(Arrays.asList(org.threeten.bp.temporal.b.YEARS, org.threeten.bp.temporal.b.MONTHS, org.threeten.bp.temporal.b.DAYS));
    }

    @Override // org.threeten.bp.chrono.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f88291b == nVar.f88291b && this.f88292c == nVar.f88292c && this.f88293d == nVar.f88293d;
    }

    @Override // org.threeten.bp.chrono.f
    public org.threeten.bp.chrono.j f() {
        return org.threeten.bp.chrono.o.f88011f;
    }

    @Override // org.threeten.bp.chrono.f
    public boolean g() {
        return this.f88291b < 0 || this.f88292c < 0 || this.f88293d < 0;
    }

    @Override // org.threeten.bp.chrono.f
    public boolean h() {
        return this == f88288e;
    }

    @Override // org.threeten.bp.chrono.f
    public int hashCode() {
        return Integer.rotateLeft(this.f88293d, 16) + Integer.rotateLeft(this.f88292c, 8) + this.f88291b;
    }

    @Override // org.threeten.bp.chrono.f
    public org.threeten.bp.chrono.f k() {
        return j(-1);
    }

    public int q() {
        return this.f88293d;
    }

    public int r() {
        return this.f88292c;
    }

    public int s() {
        return this.f88291b;
    }

    @Override // org.threeten.bp.chrono.f
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public n i(org.threeten.bp.temporal.i iVar) {
        n p4 = p(iVar);
        return o(ng.d.p(this.f88291b, p4.f88291b), ng.d.p(this.f88292c, p4.f88292c), ng.d.p(this.f88293d, p4.f88293d));
    }

    @Override // org.threeten.bp.chrono.f
    public String toString() {
        if (this == f88288e) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i4 = this.f88291b;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('Y');
        }
        int i5 = this.f88292c;
        if (i5 != 0) {
            sb.append(i5);
            sb.append('M');
        }
        int i6 = this.f88293d;
        if (i6 != 0) {
            sb.append(i6);
            sb.append('D');
        }
        return sb.toString();
    }

    public n u(long j4) {
        return j4 == Long.MIN_VALUE ? I(Long.MAX_VALUE).I(1L) : I(-j4);
    }

    public n v(long j4) {
        return j4 == Long.MIN_VALUE ? J(Long.MAX_VALUE).J(1L) : J(-j4);
    }

    public n w(long j4) {
        return j4 == Long.MIN_VALUE ? K(Long.MAX_VALUE).K(1L) : K(-j4);
    }

    @Override // org.threeten.bp.chrono.f
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public n j(int i4) {
        return (this == f88288e || i4 == 1) ? this : o(ng.d.m(this.f88291b, i4), ng.d.m(this.f88292c, i4), ng.d.m(this.f88293d, i4));
    }

    public n y() {
        return j(-1);
    }

    @Override // org.threeten.bp.chrono.f
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public n l() {
        long L = L();
        long j4 = L / 12;
        int i4 = (int) (L % 12);
        return (j4 == ((long) this.f88291b) && i4 == this.f88292c) ? this : o(ng.d.r(j4), i4, this.f88293d);
    }
}
