package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: OffsetTime.java */
/* loaded from: classes9.dex */
public final class m extends ng.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<m>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final m f88281d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f88282e;

    /* renamed from: f, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<m> f88283f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f88284g = 7264499704384272492L;

    /* renamed from: b, reason: collision with root package name */
    private final i f88285b;

    /* renamed from: c, reason: collision with root package name */
    private final s f88286c;

    /* compiled from: OffsetTime.java */
    class a implements org.threeten.bp.temporal.l<m> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(org.threeten.bp.temporal.f fVar) {
            return m.o(fVar);
        }
    }

    /* compiled from: OffsetTime.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88287a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f88287a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88287a[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88287a[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88287a[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88287a[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88287a[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88287a[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        i iVar = i.f88241f;
        s sVar = s.f88339q;
        iVar.getClass();
        f88281d = N(iVar, sVar);
        i iVar2 = i.f88242g;
        s sVar2 = s.f88338p;
        iVar2.getClass();
        f88282e = N(iVar2, sVar2);
        f88283f = new a();
    }

    private m(i iVar, s sVar) {
        this.f88285b = (i) ng.d.j(iVar, "time");
        this.f88286c = (s) ng.d.j(sVar, "offset");
    }

    public static m G() {
        return J(org.threeten.bp.a.g());
    }

    public static m J(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        f c5 = aVar.c();
        return P(c5, aVar.b().l().b(c5));
    }

    public static m K(r rVar) {
        return J(org.threeten.bp.a.f(rVar));
    }

    public static m M(int i4, int i5, int i6, int i7, s sVar) {
        return new m(i.R(i4, i5, i6, i7), sVar);
    }

    public static m N(i iVar, s sVar) {
        return new m(iVar, sVar);
    }

    public static m P(f fVar, r rVar) {
        ng.d.j(fVar, "instant");
        ng.d.j(rVar, "zone");
        s b5 = rVar.l().b(fVar);
        long q4 = ((fVar.q() % 86400) + b5.v()) % 86400;
        if (q4 < 0) {
            q4 += 86400;
        }
        return new m(i.U(q4, fVar.r()), b5);
    }

    public static m R(CharSequence charSequence) {
        return S(charSequence, org.threeten.bp.format.c.f88105l);
    }

    public static m S(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return (m) cVar.r(charSequence, f88283f);
    }

    static m a0(DataInput dataInput) throws IOException {
        return new m(i.e0(dataInput), s.C(dataInput));
    }

    private long b0() {
        return this.f88285b.f0() - (this.f88286c.v() * 1000000000);
    }

    private m e0(i iVar, s sVar) {
        return (this.f88285b == iVar && this.f88286c.equals(sVar)) ? this : new m(iVar, sVar);
    }

    public static m o(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof m) {
            return (m) fVar;
        }
        try {
            return new m(i.q(fVar), s.u(fVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 66, this);
    }

    public m A(long j4) {
        return e0(this.f88285b.B(j4), this.f88286c);
    }

    public m B(long j4) {
        return e0(this.f88285b.C(j4), this.f88286c);
    }

    public m C(long j4) {
        return e0(this.f88285b.E(j4), this.f88286c);
    }

    public m E(long j4) {
        return e0(this.f88285b.G(j4), this.f88286c);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public m v(long j4, org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? e0(this.f88285b.v(j4, mVar), this.f88286c) : (m) mVar.addTo(this, j4);
    }

    public m U(org.threeten.bp.temporal.i iVar) {
        return (m) iVar.b(this);
    }

    public m V(long j4) {
        return e0(this.f88285b.a0(j4), this.f88286c);
    }

    public m W(long j4) {
        return e0(this.f88285b.b0(j4), this.f88286c);
    }

    public m Y(long j4) {
        return e0(this.f88285b.c0(j4), this.f88286c);
    }

    public m Z(long j4) {
        return e0(this.f88285b.d0(j4), this.f88286c);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.NANO_OF_DAY, this.f88285b.f0()).b(org.threeten.bp.temporal.a.OFFSET_SECONDS, this.f88286c.v());
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (m) iVar.a(this);
    }

    public i c0() {
        return this.f88285b;
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isTimeBased() : mVar != null && mVar.isSupportedBy(this);
    }

    public m d0(org.threeten.bp.temporal.m mVar) {
        return e0(this.f88285b.h0(mVar), this.f88286c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f88285b.equals(mVar.f88285b) && this.f88286c.equals(mVar.f88286c);
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        m o4 = o(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, o4);
        }
        long b02 = o4.b0() - b0();
        switch (b.f88287a[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return b02;
            case 2:
                return b02 / 1000;
            case 3:
                return b02 / 1000000;
            case 4:
                return b02 / 1000000000;
            case 5:
                return b02 / 60000000000L;
            case 6:
                return b02 / 3600000000000L;
            case 7:
                return b02 / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public m i(org.threeten.bp.temporal.g gVar) {
        return gVar instanceof i ? e0((i) gVar, this.f88286c) : gVar instanceof s ? e0(this.f88285b, (s) gVar) : gVar instanceof m ? (m) gVar : (m) gVar.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (m) iVar.b(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public m b(org.threeten.bp.temporal.j jVar, long j4) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS ? e0(this.f88285b, s.A(((org.threeten.bp.temporal.a) jVar).checkValidIntValue(j4))) : e0(this.f88285b.b(jVar, j4), this.f88286c) : (m) jVar.adjustInto(this, j4);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return super.get(jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS ? this.f88286c.v() : this.f88285b.getLong(jVar) : jVar.getFrom(this);
    }

    public m h0(int i4) {
        return e0(this.f88285b.l0(i4), this.f88286c);
    }

    public int hashCode() {
        return this.f88285b.hashCode() ^ this.f88286c.hashCode();
    }

    public m i0(int i4) {
        return e0(this.f88285b.m0(i4), this.f88286c);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() || jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS : jVar != null && jVar.isSupportedBy(this);
    }

    public m k0(int i4) {
        return e0(this.f88285b.o0(i4), this.f88286c);
    }

    public l l(g gVar) {
        return l.b0(gVar, this.f88285b, this.f88286c);
    }

    public m l0(s sVar) {
        if (sVar.equals(this.f88286c)) {
            return this;
        }
        return new m(this.f88285b.d0(sVar.v() - this.f88286c.v()), sVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        if (this.f88286c.equals(mVar.f88286c)) {
            return this.f88285b.compareTo(mVar.f88285b);
        }
        int b5 = ng.d.b(b0(), mVar.b0());
        return b5 == 0 ? this.f88285b.compareTo(mVar.f88285b) : b5;
    }

    public m m0(s sVar) {
        return (sVar == null || !sVar.equals(this.f88286c)) ? new m(this.f88285b, sVar) : this;
    }

    public String n(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public m o0(int i4) {
        return e0(this.f88285b.p0(i4), this.f88286c);
    }

    public int p() {
        return this.f88285b.s();
    }

    void p0(DataOutput dataOutput) throws IOException {
        this.f88285b.s0(dataOutput);
        this.f88286c.J(dataOutput);
    }

    public int q() {
        return this.f88285b.t();
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.d() || lVar == org.threeten.bp.temporal.k.f()) {
            return (R) this.f88286c;
        }
        if (lVar == org.threeten.bp.temporal.k.c()) {
            return (R) this.f88285b;
        }
        if (lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.g()) {
            return null;
        }
        return (R) super.query(lVar);
    }

    public int r() {
        return this.f88285b.u();
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS ? jVar.range() : this.f88285b.range(jVar) : jVar.rangeRefinedBy(this);
    }

    public s s() {
        return this.f88286c;
    }

    public int t() {
        return this.f88285b.v();
    }

    public String toString() {
        return this.f88285b.toString() + this.f88286c.toString();
    }

    public boolean u(m mVar) {
        return b0() > mVar.b0();
    }

    public boolean v(m mVar) {
        return b0() < mVar.b0();
    }

    public boolean w(m mVar) {
        return b0() == mVar.b0();
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public m t(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? v(Long.MAX_VALUE, mVar).v(1L, mVar) : v(-j4, mVar);
    }

    public m z(org.threeten.bp.temporal.i iVar) {
        return (m) iVar.a(this);
    }
}
