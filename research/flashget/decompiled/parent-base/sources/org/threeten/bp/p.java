package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: Year.java */
/* loaded from: classes9.dex */
public final class p extends ng.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<p>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final int f88310c = -999999999;

    /* renamed from: d, reason: collision with root package name */
    public static final int f88311d = 999999999;

    /* renamed from: f, reason: collision with root package name */
    private static final long f88313f = -23038383694477807L;

    /* renamed from: b, reason: collision with root package name */
    private final int f88315b;

    /* renamed from: e, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<p> f88312e = new a();

    /* renamed from: g, reason: collision with root package name */
    private static final org.threeten.bp.format.c f88314g = new org.threeten.bp.format.d().v(org.threeten.bp.temporal.a.YEAR, 4, 10, org.threeten.bp.format.k.EXCEEDS_PAD).P();

    /* compiled from: Year.java */
    class a implements org.threeten.bp.temporal.l<p> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(org.threeten.bp.temporal.f fVar) {
            return p.r(fVar);
        }
    }

    /* compiled from: Year.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88316a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88317b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f88317b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88317b[org.threeten.bp.temporal.b.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88317b[org.threeten.bp.temporal.b.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88317b[org.threeten.bp.temporal.b.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88317b[org.threeten.bp.temporal.b.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f88316a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.YEAR_OF_ERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88316a[org.threeten.bp.temporal.a.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88316a[org.threeten.bp.temporal.a.ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private p(int i4) {
        this.f88315b = i4;
    }

    public static p C() {
        return E(org.threeten.bp.a.g());
    }

    public static p E(org.threeten.bp.a aVar) {
        return J(g.v0(aVar).i0());
    }

    public static p G(r rVar) {
        return E(org.threeten.bp.a.f(rVar));
    }

    public static p J(int i4) {
        org.threeten.bp.temporal.a.YEAR.checkValidValue(i4);
        return new p(i4);
    }

    public static p K(CharSequence charSequence) {
        return M(charSequence, f88314g);
    }

    public static p M(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return (p) cVar.r(charSequence, f88312e);
    }

    static p S(DataInput dataInput) throws IOException {
        return J(dataInput.readInt());
    }

    public static p r(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof p) {
            return (p) fVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f88011f.equals(org.threeten.bp.chrono.j.p(fVar))) {
                fVar = g.Z(fVar);
            }
            return J(fVar.get(org.threeten.bp.temporal.a.YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static boolean v(long j4) {
        return (3 & j4) == 0 && (j4 % 100 != 0 || j4 % 400 == 0);
    }

    private Object writeReplace() {
        return new o((byte) 67, this);
    }

    public p A(org.threeten.bp.temporal.i iVar) {
        return (p) iVar.a(this);
    }

    public p B(long j4) {
        return j4 == Long.MIN_VALUE ? R(Long.MAX_VALUE).R(1L) : R(-j4);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public p v(long j4, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (p) mVar.addTo(this, j4);
        }
        int i4 = b.f88317b[((org.threeten.bp.temporal.b) mVar).ordinal()];
        if (i4 == 1) {
            return R(j4);
        }
        if (i4 == 2) {
            return R(ng.d.n(j4, 10));
        }
        if (i4 == 3) {
            return R(ng.d.n(j4, 100));
        }
        if (i4 == 4) {
            return R(ng.d.n(j4, 1000));
        }
        if (i4 == 5) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
            return b(aVar, ng.d.l(getLong(aVar), j4));
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
    }

    public p P(org.threeten.bp.temporal.i iVar) {
        return (p) iVar.b(this);
    }

    public p R(long j4) {
        return j4 == 0 ? this : J(org.threeten.bp.temporal.a.YEAR.checkValidIntValue(this.f88315b + j4));
    }

    public p T(org.threeten.bp.temporal.g gVar) {
        return (p) gVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public p b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (p) jVar.adjustInto(this, j4);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.checkValidValue(j4);
        int i4 = b.f88316a[aVar.ordinal()];
        if (i4 == 1) {
            if (this.f88315b < 1) {
                j4 = 1 - j4;
            }
            return J((int) j4);
        }
        if (i4 == 2) {
            return J((int) j4);
        }
        if (i4 == 3) {
            return getLong(org.threeten.bp.temporal.a.ERA) == j4 ? this : J(1 - this.f88315b);
        }
        throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
    }

    void V(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f88315b);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        if (org.threeten.bp.chrono.j.p(eVar).equals(org.threeten.bp.chrono.o.f88011f)) {
            return eVar.b(org.threeten.bp.temporal.a.YEAR, this.f88315b);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (p) iVar.a(this);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar == org.threeten.bp.temporal.b.YEARS || mVar == org.threeten.bp.temporal.b.DECADES || mVar == org.threeten.bp.temporal.b.CENTURIES || mVar == org.threeten.bp.temporal.b.MILLENNIA || mVar == org.threeten.bp.temporal.b.ERAS : mVar != null && mVar.isSupportedBy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f88315b == ((p) obj).f88315b;
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        p r4 = r(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, r4);
        }
        long j4 = r4.f88315b - this.f88315b;
        int i4 = b.f88317b[((org.threeten.bp.temporal.b) mVar).ordinal()];
        if (i4 == 1) {
            return j4;
        }
        if (i4 == 2) {
            return j4 / 10;
        }
        if (i4 == 3) {
            return j4 / 100;
        }
        if (i4 == 4) {
            return j4 / 1000;
        }
        if (i4 == 5) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.ERA;
            return r4.getLong(aVar) - getLong(aVar);
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (p) iVar.b(this);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return range(jVar).a(getLong(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        int i4 = b.f88316a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i4 == 1) {
            int i5 = this.f88315b;
            if (i5 < 1) {
                i5 = 1 - i5;
            }
            return i5;
        }
        if (i4 == 2) {
            return this.f88315b;
        }
        if (i4 == 3) {
            return this.f88315b < 1 ? 0 : 1;
        }
        throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
    }

    public int getValue() {
        return this.f88315b;
    }

    public int hashCode() {
        return this.f88315b;
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e i(org.threeten.bp.temporal.g gVar) {
        return (p) gVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.YEAR || jVar == org.threeten.bp.temporal.a.YEAR_OF_ERA || jVar == org.threeten.bp.temporal.a.ERA : jVar != null && jVar.isSupportedBy(this);
    }

    public g l(int i4) {
        return g.A0(this.f88315b, i4);
    }

    public q m(int i4) {
        return q.N(this.f88315b, i4);
    }

    public q n(j jVar) {
        return q.P(this.f88315b, jVar);
    }

    public g o(k kVar) {
        return kVar.l(this.f88315b);
    }

    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(p pVar) {
        return this.f88315b - pVar.f88315b;
    }

    public String q(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) org.threeten.bp.chrono.o.f88011f;
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.YEARS;
        }
        if (lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return (R) super.query(lVar);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.YEAR_OF_ERA) {
            return org.threeten.bp.temporal.n.k(1L, this.f88315b <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(jVar);
    }

    public boolean s(p pVar) {
        return this.f88315b > pVar.f88315b;
    }

    public boolean t(p pVar) {
        return this.f88315b < pVar.f88315b;
    }

    public String toString() {
        return Integer.toString(this.f88315b);
    }

    public boolean u() {
        return v(this.f88315b);
    }

    public boolean w(k kVar) {
        return kVar != null && kVar.u(this.f88315b);
    }

    public int y() {
        return u() ? 366 : 365;
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public p t(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? k(Long.MAX_VALUE, mVar).k(1L, mVar) : k(-j4, mVar);
    }
}
