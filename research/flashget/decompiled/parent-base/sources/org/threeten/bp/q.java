package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: YearMonth.java */
/* loaded from: classes9.dex */
public final class q extends ng.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<q>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f88319e = 4183400860270640070L;

    /* renamed from: b, reason: collision with root package name */
    private final int f88321b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88322c;

    /* renamed from: d, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<q> f88318d = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final org.threeten.bp.format.c f88320f = new org.threeten.bp.format.d().v(org.threeten.bp.temporal.a.YEAR, 4, 10, org.threeten.bp.format.k.EXCEEDS_PAD).h('-').u(org.threeten.bp.temporal.a.MONTH_OF_YEAR, 2).P();

    /* compiled from: YearMonth.java */
    class a implements org.threeten.bp.temporal.l<q> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(org.threeten.bp.temporal.f fVar) {
            return q.p(fVar);
        }
    }

    /* compiled from: YearMonth.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88323a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88324b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f88324b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88324b[org.threeten.bp.temporal.b.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88324b[org.threeten.bp.temporal.b.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88324b[org.threeten.bp.temporal.b.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88324b[org.threeten.bp.temporal.b.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88324b[org.threeten.bp.temporal.b.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f88323a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88323a[org.threeten.bp.temporal.a.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f88323a[org.threeten.bp.temporal.a.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88323a[org.threeten.bp.temporal.a.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88323a[org.threeten.bp.temporal.a.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private q(int i4, int i5) {
        this.f88321b = i4;
        this.f88322c = i5;
    }

    public static q J() {
        return K(org.threeten.bp.a.g());
    }

    public static q K(org.threeten.bp.a aVar) {
        g v02 = g.v0(aVar);
        return P(v02.i0(), v02.f0());
    }

    public static q M(r rVar) {
        return K(org.threeten.bp.a.f(rVar));
    }

    public static q N(int i4, int i5) {
        org.threeten.bp.temporal.a.YEAR.checkValidValue(i4);
        org.threeten.bp.temporal.a.MONTH_OF_YEAR.checkValidValue(i5);
        return new q(i4, i5);
    }

    public static q P(int i4, j jVar) {
        ng.d.j(jVar, "month");
        return N(i4, jVar.getValue());
    }

    public static q R(CharSequence charSequence) {
        return S(charSequence, f88320f);
    }

    public static q S(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return (q) cVar.r(charSequence, f88318d);
    }

    static q Y(DataInput dataInput) throws IOException {
        return N(dataInput.readInt(), dataInput.readByte());
    }

    private q Z(int i4, int i5) {
        return (this.f88321b == i4 && this.f88322c == i5) ? this : new q(i4, i5);
    }

    public static q p(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof q) {
            return (q) fVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f88011f.equals(org.threeten.bp.chrono.j.p(fVar))) {
                fVar = g.Z(fVar);
            }
            return N(fVar.get(org.threeten.bp.temporal.a.YEAR), fVar.get(org.threeten.bp.temporal.a.MONTH_OF_YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private long s() {
        return (this.f88321b * 12) + (this.f88322c - 1);
    }

    private Object writeReplace() {
        return new o((byte) 68, this);
    }

    public int A() {
        return w() ? 366 : 365;
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public q t(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? k(Long.MAX_VALUE, mVar).k(1L, mVar) : k(-j4, mVar);
    }

    public q C(org.threeten.bp.temporal.i iVar) {
        return (q) iVar.a(this);
    }

    public q E(long j4) {
        return j4 == Long.MIN_VALUE ? V(Long.MAX_VALUE).V(1L) : V(-j4);
    }

    public q G(long j4) {
        return j4 == Long.MIN_VALUE ? W(Long.MAX_VALUE).W(1L) : W(-j4);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public q v(long j4, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (q) mVar.addTo(this, j4);
        }
        switch (b.f88324b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return V(j4);
            case 2:
                return W(j4);
            case 3:
                return W(ng.d.n(j4, 10));
            case 4:
                return W(ng.d.n(j4, 100));
            case 5:
                return W(ng.d.n(j4, 1000));
            case 6:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
                return b(aVar, ng.d.l(getLong(aVar), j4));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    public q U(org.threeten.bp.temporal.i iVar) {
        return (q) iVar.b(this);
    }

    public q V(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j5 = (this.f88321b * 12) + (this.f88322c - 1) + j4;
        return Z(org.threeten.bp.temporal.a.YEAR.checkValidIntValue(ng.d.e(j5, 12L)), ng.d.g(j5, 12) + 1);
    }

    public q W(long j4) {
        return j4 == 0 ? this : Z(org.threeten.bp.temporal.a.YEAR.checkValidIntValue(this.f88321b + j4), this.f88322c);
    }

    public q a0(org.threeten.bp.temporal.g gVar) {
        return (q) gVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        if (org.threeten.bp.chrono.j.p(eVar).equals(org.threeten.bp.chrono.o.f88011f)) {
            return eVar.b(org.threeten.bp.temporal.a.PROLEPTIC_MONTH, s());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public q b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (q) jVar.adjustInto(this, j4);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.checkValidValue(j4);
        int i4 = b.f88323a[aVar.ordinal()];
        if (i4 == 1) {
            return c0((int) j4);
        }
        if (i4 == 2) {
            return V(j4 - getLong(org.threeten.bp.temporal.a.PROLEPTIC_MONTH));
        }
        if (i4 == 3) {
            if (this.f88321b < 1) {
                j4 = 1 - j4;
            }
            return d0((int) j4);
        }
        if (i4 == 4) {
            return d0((int) j4);
        }
        if (i4 == 5) {
            return getLong(org.threeten.bp.temporal.a.ERA) == j4 ? this : d0(1 - this.f88321b);
        }
        throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (q) iVar.a(this);
    }

    public q c0(int i4) {
        org.threeten.bp.temporal.a.MONTH_OF_YEAR.checkValidValue(i4);
        return Z(this.f88321b, i4);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar == org.threeten.bp.temporal.b.MONTHS || mVar == org.threeten.bp.temporal.b.YEARS || mVar == org.threeten.bp.temporal.b.DECADES || mVar == org.threeten.bp.temporal.b.CENTURIES || mVar == org.threeten.bp.temporal.b.MILLENNIA || mVar == org.threeten.bp.temporal.b.ERAS : mVar != null && mVar.isSupportedBy(this);
    }

    public q d0(int i4) {
        org.threeten.bp.temporal.a.YEAR.checkValidValue(i4);
        return Z(i4, this.f88322c);
    }

    void e0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f88321b);
        dataOutput.writeByte(this.f88322c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f88321b == qVar.f88321b && this.f88322c == qVar.f88322c;
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        q p4 = p(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, p4);
        }
        long s4 = p4.s() - s();
        switch (b.f88324b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return s4;
            case 2:
                return s4 / 12;
            case 3:
                return s4 / 120;
            case 4:
                return s4 / 1200;
            case 5:
                return s4 / 12000;
            case 6:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
                return p4.getLong(aVar) - getLong(aVar);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (q) iVar.b(this);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return range(jVar).a(getLong(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        int i4;
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        int i5 = b.f88323a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i5 == 1) {
            i4 = this.f88322c;
        } else {
            if (i5 == 2) {
                return s();
            }
            if (i5 == 3) {
                int i6 = this.f88321b;
                if (i6 < 1) {
                    i6 = 1 - i6;
                }
                return i6;
            }
            if (i5 != 4) {
                if (i5 == 5) {
                    return this.f88321b < 1 ? 0 : 1;
                }
                throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
            }
            i4 = this.f88321b;
        }
        return i4;
    }

    public int hashCode() {
        return this.f88321b ^ (this.f88322c << 27);
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e i(org.threeten.bp.temporal.g gVar) {
        return (q) gVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.YEAR || jVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR || jVar == org.threeten.bp.temporal.a.PROLEPTIC_MONTH || jVar == org.threeten.bp.temporal.a.YEAR_OF_ERA || jVar == org.threeten.bp.temporal.a.ERA : jVar != null && jVar.isSupportedBy(this);
    }

    public g l(int i4) {
        return g.x0(this.f88321b, this.f88322c, i4);
    }

    public g m() {
        return g.x0(this.f88321b, this.f88322c, z());
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(q qVar) {
        int i4 = this.f88321b - qVar.f88321b;
        return i4 == 0 ? this.f88322c - qVar.f88322c : i4;
    }

    public String o(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public j q() {
        return j.of(this.f88322c);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) org.threeten.bp.chrono.o.f88011f;
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.MONTHS;
        }
        if (lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return (R) super.query(lVar);
    }

    public int r() {
        return this.f88322c;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.YEAR_OF_ERA) {
            return org.threeten.bp.temporal.n.k(1L, this.f88321b <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(jVar);
    }

    public int t() {
        return this.f88321b;
    }

    public String toString() {
        int abs = Math.abs(this.f88321b);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i4 = this.f88321b;
            if (i4 < 0) {
                sb.append(i4 - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i4 + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.f88321b);
        }
        sb.append(this.f88322c < 10 ? "-0" : "-");
        sb.append(this.f88322c);
        return sb.toString();
    }

    public boolean u(q qVar) {
        return compareTo(qVar) > 0;
    }

    public boolean v(q qVar) {
        return compareTo(qVar) < 0;
    }

    public boolean w() {
        return org.threeten.bp.chrono.o.f88011f.v(this.f88321b);
    }

    public boolean y(int i4) {
        return i4 >= 1 && i4 <= z();
    }

    public int z() {
        return j.of(this.f88322c).length(w());
    }
}
