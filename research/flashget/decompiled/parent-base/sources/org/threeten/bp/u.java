package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;

/* compiled from: ZonedDateTime.java */
/* loaded from: classes9.dex */
public final class u extends org.threeten.bp.chrono.h<g> implements org.threeten.bp.temporal.e, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<u> f88401f = new a();

    /* renamed from: g, reason: collision with root package name */
    private static final long f88402g = -6260982410461394882L;

    /* renamed from: c, reason: collision with root package name */
    private final h f88403c;

    /* renamed from: d, reason: collision with root package name */
    private final s f88404d;

    /* renamed from: e, reason: collision with root package name */
    private final r f88405e;

    /* compiled from: ZonedDateTime.java */
    class a implements org.threeten.bp.temporal.l<u> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(org.threeten.bp.temporal.f fVar) {
            return u.T(fVar);
        }
    }

    /* compiled from: ZonedDateTime.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88406a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f88406a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88406a[org.threeten.bp.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private u(h hVar, s sVar, r rVar) {
        this.f88403c = hVar;
        this.f88404d = sVar;
        this.f88405e = rVar;
    }

    public static u A0(h hVar, s sVar, r rVar) {
        ng.d.j(hVar, "localDateTime");
        ng.d.j(sVar, "offset");
        ng.d.j(rVar, "zone");
        return S(hVar.z(sVar), hVar.Y(), rVar);
    }

    private static u B0(h hVar, s sVar, r rVar) {
        ng.d.j(hVar, "localDateTime");
        ng.d.j(sVar, "offset");
        ng.d.j(rVar, "zone");
        if (!(rVar instanceof s) || sVar.equals(rVar)) {
            return new u(hVar, sVar, rVar);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    public static u C0(h hVar, r rVar, s sVar) {
        ng.d.j(hVar, "localDateTime");
        ng.d.j(rVar, "zone");
        if (rVar instanceof s) {
            return new u(hVar, (s) rVar, rVar);
        }
        org.threeten.bp.zone.f l4 = rVar.l();
        List<s> h4 = l4.h(hVar);
        if (h4.size() == 1) {
            sVar = h4.get(0);
        } else if (h4.size() == 0) {
            org.threeten.bp.zone.d e4 = l4.e(hVar);
            hVar = hVar.L0(e4.d().n());
            sVar = e4.g();
        } else if (sVar == null || !h4.contains(sVar)) {
            sVar = (s) ng.d.j(h4.get(0), "offset");
        }
        return new u(hVar, sVar, rVar);
    }

    public static u D0(h hVar, s sVar, r rVar) {
        ng.d.j(hVar, "localDateTime");
        ng.d.j(sVar, "offset");
        ng.d.j(rVar, "zone");
        org.threeten.bp.zone.f l4 = rVar.l();
        if (l4.k(hVar, sVar)) {
            return new u(hVar, sVar, rVar);
        }
        org.threeten.bp.zone.d e4 = l4.e(hVar);
        if (e4 != null && e4.j()) {
            throw new DateTimeException("LocalDateTime '" + hVar + "' does not exist in zone '" + rVar + "' due to a gap in the local time-line, typically caused by daylight savings");
        }
        throw new DateTimeException("ZoneOffset '" + sVar + "' is not valid for LocalDateTime '" + hVar + "' in zone '" + rVar + "'");
    }

    public static u E0(CharSequence charSequence) {
        return F0(charSequence, org.threeten.bp.format.c.f88109p);
    }

    public static u F0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return (u) cVar.r(charSequence, f88401f);
    }

    private static u S(long j4, int i4, r rVar) {
        s b5 = rVar.l().b(f.J(j4, i4));
        return new u(h.z0(j4, i4, b5), b5, rVar);
    }

    public static u T(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof u) {
            return (u) fVar;
        }
        try {
            r a5 = r.a(fVar);
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.INSTANT_SECONDS;
            if (fVar.isSupported(aVar)) {
                try {
                    return S(fVar.getLong(aVar), fVar.get(org.threeten.bp.temporal.a.NANO_OF_SECOND), a5);
                } catch (DateTimeException unused) {
                }
            }
            return y0(h.N(fVar), a5);
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    static u T0(DataInput dataInput) throws IOException {
        return B0(h.R0(dataInput), s.C(dataInput), (r) o.a(dataInput));
    }

    private u U0(h hVar) {
        return A0(hVar, this.f88404d, this.f88405e);
    }

    private u V0(h hVar) {
        return C0(hVar, this.f88405e, this.f88404d);
    }

    private u W0(s sVar) {
        return (sVar.equals(this.f88404d) || !this.f88405e.l().k(this.f88403c, sVar)) ? this : new u(this.f88403c, sVar, this.f88405e);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static u t0() {
        return u0(org.threeten.bp.a.g());
    }

    public static u u0(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        return z0(aVar.c(), aVar.b());
    }

    public static u v0(r rVar) {
        return u0(org.threeten.bp.a.f(rVar));
    }

    public static u w0(int i4, int i5, int i6, int i7, int i10, int i11, int i12, r rVar) {
        return C0(h.u0(i4, i5, i6, i7, i10, i11, i12), rVar, null);
    }

    private Object writeReplace() {
        return new o((byte) 6, this);
    }

    public static u x0(g gVar, i iVar, r rVar) {
        return C0(h.y0(gVar, iVar), rVar, null);
    }

    public static u y0(h hVar, r rVar) {
        return C0(hVar, rVar, null);
    }

    public static u z0(f fVar, r rVar) {
        ng.d.j(fVar, "instant");
        ng.d.j(rVar, "zone");
        return S(fVar.q(), fVar.r(), rVar);
    }

    @Override // org.threeten.bp.chrono.h
    public g C() {
        return this.f88403c.S0();
    }

    @Override // org.threeten.bp.chrono.h
    public org.threeten.bp.chrono.d<g> E() {
        return this.f88403c;
    }

    @Override // org.threeten.bp.chrono.h
    public i G() {
        return this.f88403c.C();
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public u v(long j4, org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isDateBased() ? V0(this.f88403c.k(j4, mVar)) : U0(this.f88403c.k(j4, mVar)) : (u) mVar.addTo(this, j4);
    }

    public u H0(org.threeten.bp.temporal.i iVar) {
        return (u) iVar.b(this);
    }

    public u I0(long j4) {
        return V0(this.f88403c.F0(j4));
    }

    public u J0(long j4) {
        return U0(this.f88403c.G0(j4));
    }

    public u L0(long j4) {
        return U0(this.f88403c.H0(j4));
    }

    public u N0(long j4) {
        return V0(this.f88403c.I0(j4));
    }

    public u P0(long j4) {
        return U0(this.f88403c.J0(j4));
    }

    public u Q0(long j4) {
        return U0(this.f88403c.L0(j4));
    }

    public u R0(long j4) {
        return V0(this.f88403c.N0(j4));
    }

    public u S0(long j4) {
        return V0(this.f88403c.Q0(j4));
    }

    public int U() {
        return this.f88403c.P();
    }

    public d V() {
        return this.f88403c.R();
    }

    public int W() {
        return this.f88403c.S();
    }

    public g X0() {
        return this.f88403c.S0();
    }

    public int Y() {
        return this.f88403c.T();
    }

    public h Y0() {
        return this.f88403c;
    }

    public int Z() {
        return this.f88403c.U();
    }

    public l Z0() {
        return l.c0(this.f88403c, this.f88404d);
    }

    public j a0() {
        return this.f88403c.V();
    }

    public u a1(org.threeten.bp.temporal.m mVar) {
        return V0(this.f88403c.T0(mVar));
    }

    public int b0() {
        return this.f88403c.W();
    }

    @Override // org.threeten.bp.chrono.h, ng.b, org.threeten.bp.temporal.e
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public u i(org.threeten.bp.temporal.g gVar) {
        if (gVar instanceof g) {
            return V0(h.y0((g) gVar, this.f88403c.C()));
        }
        if (gVar instanceof i) {
            return V0(h.y0(this.f88403c.S0(), (i) gVar));
        }
        if (gVar instanceof h) {
            return V0((h) gVar);
        }
        if (!(gVar instanceof f)) {
            return gVar instanceof s ? W0((s) gVar) : (u) gVar.adjustInto(this);
        }
        f fVar = (f) gVar;
        return S(fVar.q(), fVar.r(), this.f88405e);
    }

    @Override // org.threeten.bp.chrono.h, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (u) iVar.a(this);
    }

    public int c0() {
        return this.f88403c.Y();
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.e
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public u b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (u) jVar.adjustInto(this, j4);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i4 = b.f88406a[aVar.ordinal()];
        return i4 != 1 ? i4 != 2 ? V0(this.f88403c.G(jVar, j4)) : W0(s.A(aVar.checkValidIntValue(j4))) : S(j4, this.f88403c.Y(), this.f88405e);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isDateBased() || mVar.isTimeBased() : mVar != null && mVar.isSupportedBy(this);
    }

    public int d0() {
        return this.f88403c.Z();
    }

    public u d1(int i4) {
        return V0(this.f88403c.X0(i4));
    }

    public int e0() {
        return this.f88403c.a0();
    }

    public u e1(int i4) {
        return V0(this.f88403c.Y0(i4));
    }

    @Override // org.threeten.bp.chrono.h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f88403c.equals(uVar.f88403c) && this.f88404d.equals(uVar.f88404d) && this.f88405e.equals(uVar.f88405e);
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        u T = T(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, T);
        }
        u P = T.P(this.f88405e);
        return mVar.isDateBased() ? this.f88403c.f(P.f88403c, mVar) : Z0().f(P.Z0(), mVar);
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public u t(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? v(Long.MAX_VALUE, mVar).v(1L, mVar) : v(-j4, mVar);
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public u M() {
        org.threeten.bp.zone.d e4 = this.f88405e.l().e(this.f88403c);
        if (e4 != null && e4.k()) {
            s h4 = e4.h();
            if (!h4.equals(this.f88404d)) {
                return new u(this.f88403c, h4, this.f88405e);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.h, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (u) iVar.b(this);
    }

    public u g0(org.threeten.bp.temporal.i iVar) {
        return (u) iVar.a(this);
    }

    public u g1() {
        if (this.f88405e.equals(this.f88404d)) {
            return this;
        }
        h hVar = this.f88403c;
        s sVar = this.f88404d;
        return new u(hVar, sVar, sVar);
    }

    @Override // org.threeten.bp.chrono.h, ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return super.get(jVar);
        }
        int i4 = b.f88406a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i4 != 1) {
            return i4 != 2 ? this.f88403c.get(jVar) : this.f88404d.v();
        }
        throw new DateTimeException(c.a("Field too large for an int: ", jVar));
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        int i4 = b.f88406a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        return i4 != 1 ? i4 != 2 ? this.f88403c.getLong(jVar) : this.f88404d.v() : A();
    }

    public u h0(long j4) {
        return j4 == Long.MIN_VALUE ? I0(Long.MAX_VALUE).I0(1L) : I0(-j4);
    }

    public u h1(int i4) {
        return V0(this.f88403c.Z0(i4));
    }

    @Override // org.threeten.bp.chrono.h
    public int hashCode() {
        return (this.f88403c.hashCode() ^ this.f88404d.hashCode()) ^ Integer.rotateLeft(this.f88405e.hashCode(), 3);
    }

    public u i0(long j4) {
        return j4 == Long.MIN_VALUE ? J0(Long.MAX_VALUE).J0(1L) : J0(-j4);
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public u N() {
        org.threeten.bp.zone.d e4 = this.f88405e.l().e(this.f88403c);
        if (e4 != null) {
            s g4 = e4.g();
            if (!g4.equals(this.f88404d)) {
                return new u(this.f88403c, g4, this.f88405e);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return (jVar instanceof org.threeten.bp.temporal.a) || (jVar != null && jVar.isSupportedBy(this));
    }

    public u j1(int i4) {
        return V0(this.f88403c.a1(i4));
    }

    public u k0(long j4) {
        return j4 == Long.MIN_VALUE ? L0(Long.MAX_VALUE).L0(1L) : L0(-j4);
    }

    public u k1(int i4) {
        return V0(this.f88403c.b1(i4));
    }

    public u l0(long j4) {
        return j4 == Long.MIN_VALUE ? N0(Long.MAX_VALUE).N0(1L) : N0(-j4);
    }

    @Override // org.threeten.bp.chrono.h
    public String m(org.threeten.bp.format.c cVar) {
        return super.m(cVar);
    }

    public u m0(long j4) {
        return j4 == Long.MIN_VALUE ? P0(Long.MAX_VALUE).P0(1L) : P0(-j4);
    }

    public u m1(int i4) {
        return V0(this.f88403c.c1(i4));
    }

    public u o0(long j4) {
        return j4 == Long.MIN_VALUE ? Q0(Long.MAX_VALUE).Q0(1L) : Q0(-j4);
    }

    public u o1(int i4) {
        return V0(this.f88403c.d1(i4));
    }

    @Override // org.threeten.bp.chrono.h
    public s p() {
        return this.f88404d;
    }

    public u p0(long j4) {
        return j4 == Long.MIN_VALUE ? R0(Long.MAX_VALUE).R0(1L) : R0(-j4);
    }

    public u p1(int i4) {
        return V0(this.f88403c.e1(i4));
    }

    @Override // org.threeten.bp.chrono.h
    public r q() {
        return this.f88405e;
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public u P(r rVar) {
        ng.d.j(rVar, "zone");
        return this.f88405e.equals(rVar) ? this : S(this.f88403c.z(this.f88404d), this.f88403c.Y(), rVar);
    }

    @Override // org.threeten.bp.chrono.h, ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        return lVar == org.threeten.bp.temporal.k.b() ? (R) this.f88403c.S0() : (R) super.query(lVar);
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public u R(r rVar) {
        ng.d.j(rVar, "zone");
        return this.f88405e.equals(rVar) ? this : C0(this.f88403c, rVar, this.f88404d);
    }

    @Override // org.threeten.bp.chrono.h, ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? (jVar == org.threeten.bp.temporal.a.INSTANT_SECONDS || jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) ? jVar.range() : this.f88403c.range(jVar) : jVar.rangeRefinedBy(this);
    }

    public u s0(long j4) {
        return j4 == Long.MIN_VALUE ? S0(Long.MAX_VALUE).S0(1L) : S0(-j4);
    }

    void s1(DataOutput dataOutput) throws IOException {
        this.f88403c.f1(dataOutput);
        this.f88404d.J(dataOutput);
        this.f88405e.r(dataOutput);
    }

    @Override // org.threeten.bp.chrono.h
    public String toString() {
        String str = this.f88403c.toString() + this.f88404d.toString();
        if (this.f88404d == this.f88405e) {
            return str;
        }
        return str + '[' + this.f88405e.toString() + ']';
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: v */
    public org.threeten.bp.chrono.h<g> c(org.threeten.bp.temporal.i iVar) {
        return (u) iVar.a(this);
    }

    @Override // org.threeten.bp.chrono.h
    /* renamed from: y */
    public org.threeten.bp.chrono.h<g> g(org.threeten.bp.temporal.i iVar) {
        return (u) iVar.b(this);
    }
}
