package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Comparator;

/* compiled from: OffsetDateTime.java */
/* loaded from: classes9.dex */
public final class l extends ng.b implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<l>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final l f88273d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f88274e;

    /* renamed from: f, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<l> f88275f;

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator<l> f88276g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f88277h = 2287754244819255394L;

    /* renamed from: b, reason: collision with root package name */
    private final h f88278b;

    /* renamed from: c, reason: collision with root package name */
    private final s f88279c;

    /* compiled from: OffsetDateTime.java */
    class a implements org.threeten.bp.temporal.l<l> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(org.threeten.bp.temporal.f fVar) {
            return l.p(fVar);
        }
    }

    /* compiled from: OffsetDateTime.java */
    class b implements Comparator<l> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(l lVar, l lVar2) {
            int b5 = ng.d.b(lVar.w0(), lVar2.w0());
            return b5 == 0 ? ng.d.b(lVar.y(), lVar2.y()) : b5;
        }
    }

    /* compiled from: OffsetDateTime.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88280a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f88280a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88280a[org.threeten.bp.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        h hVar = h.f88234e;
        s sVar = s.f88339q;
        hVar.getClass();
        f88273d = c0(hVar, sVar);
        h hVar2 = h.f88235f;
        s sVar2 = s.f88338p;
        hVar2.getClass();
        f88274e = c0(hVar2, sVar2);
        f88275f = new a();
        f88276g = new b();
    }

    private l(h hVar, s sVar) {
        this.f88278b = (h) ng.d.j(hVar, "dateTime");
        this.f88279c = (s) ng.d.j(sVar, "offset");
    }

    private l E0(h hVar, s sVar) {
        return (this.f88278b == hVar && this.f88279c.equals(sVar)) ? this : new l(hVar, sVar);
    }

    public static l W() {
        return Y(org.threeten.bp.a.g());
    }

    public static l Y(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        f c5 = aVar.c();
        return d0(c5, aVar.b().l().b(c5));
    }

    public static l Z(r rVar) {
        return Y(org.threeten.bp.a.f(rVar));
    }

    public static l a0(int i4, int i5, int i6, int i7, int i10, int i11, int i12, s sVar) {
        return new l(h.u0(i4, i5, i6, i7, i10, i11, i12), sVar);
    }

    public static l b0(g gVar, i iVar, s sVar) {
        return new l(h.y0(gVar, iVar), sVar);
    }

    public static l c0(h hVar, s sVar) {
        return new l(hVar, sVar);
    }

    public static l d0(f fVar, r rVar) {
        ng.d.j(fVar, "instant");
        ng.d.j(rVar, "zone");
        s b5 = rVar.l().b(fVar);
        return new l(h.z0(fVar.q(), fVar.r(), b5), b5);
    }

    public static l e0(CharSequence charSequence) {
        return f0(charSequence, org.threeten.bp.format.c.f88108o);
    }

    public static l f0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return (l) cVar.r(charSequence, f88275f);
    }

    public static l p(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof l) {
            return (l) fVar;
        }
        try {
            s u4 = s.u(fVar);
            try {
                return new l(h.N(fVar), u4);
            } catch (DateTimeException unused) {
                return d0(f.p(fVar), u4);
            }
        } catch (DateTimeException unused2) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static l u0(DataInput dataInput) throws IOException {
        return new l(h.R0(dataInput), s.C(dataInput));
    }

    public static Comparator<l> v0() {
        return f88276g;
    }

    private Object writeReplace() {
        return new o((byte) 69, this);
    }

    public int A() {
        return this.f88278b.Z();
    }

    public i A0() {
        return this.f88278b.C();
    }

    public int B() {
        return this.f88278b.a0();
    }

    public m B0() {
        return m.N(this.f88278b.C(), this.f88279c);
    }

    public boolean C(l lVar) {
        long w02 = w0();
        long w03 = lVar.w0();
        return w02 > w03 || (w02 == w03 && this.f88278b.C().u() > lVar.f88278b.C().u());
    }

    public u C0() {
        return u.y0(this.f88278b, this.f88279c);
    }

    public l D0(org.threeten.bp.temporal.m mVar) {
        return E0(this.f88278b.T0(mVar), this.f88279c);
    }

    public boolean E(l lVar) {
        long w02 = w0();
        long w03 = lVar.w0();
        return w02 < w03 || (w02 == w03 && this.f88278b.C().u() < lVar.f88278b.C().u());
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public l i(org.threeten.bp.temporal.g gVar) {
        return ((gVar instanceof g) || (gVar instanceof i) || (gVar instanceof h)) ? E0(this.f88278b.E(gVar), this.f88279c) : gVar instanceof f ? d0((f) gVar, this.f88279c) : gVar instanceof s ? E0(this.f88278b, (s) gVar) : gVar instanceof l ? (l) gVar : (l) gVar.adjustInto(this);
    }

    public boolean G(l lVar) {
        return w0() == lVar.w0() && this.f88278b.C().u() == lVar.f88278b.C().u();
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public l b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (l) jVar.adjustInto(this, j4);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i4 = c.f88280a[aVar.ordinal()];
        return i4 != 1 ? i4 != 2 ? E0(this.f88278b.G(jVar, j4), this.f88279c) : E0(this.f88278b, s.A(aVar.checkValidIntValue(j4))) : d0(f.J(j4, this.f88278b.Y()), this.f88279c);
    }

    public l H0(int i4) {
        return E0(this.f88278b.X0(i4), this.f88279c);
    }

    public l I0(int i4) {
        return E0(this.f88278b.Y0(i4), this.f88279c);
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public l t(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? v(Long.MAX_VALUE, mVar).v(1L, mVar) : v(-j4, mVar);
    }

    public l J0(int i4) {
        return E0(this.f88278b.Z0(i4), this.f88279c);
    }

    public l K(org.threeten.bp.temporal.i iVar) {
        return (l) iVar.a(this);
    }

    public l L0(int i4) {
        return E0(this.f88278b.a1(i4), this.f88279c);
    }

    public l M(long j4) {
        return j4 == Long.MIN_VALUE ? i0(Long.MAX_VALUE).i0(1L) : i0(-j4);
    }

    public l N(long j4) {
        return j4 == Long.MIN_VALUE ? k0(Long.MAX_VALUE).k0(1L) : k0(-j4);
    }

    public l N0(int i4) {
        return E0(this.f88278b.b1(i4), this.f88279c);
    }

    public l P(long j4) {
        return j4 == Long.MIN_VALUE ? l0(Long.MAX_VALUE).l0(1L) : l0(-j4);
    }

    public l P0(int i4) {
        return E0(this.f88278b.c1(i4), this.f88279c);
    }

    public l Q0(s sVar) {
        if (sVar.equals(this.f88279c)) {
            return this;
        }
        return new l(this.f88278b.L0(sVar.v() - this.f88279c.v()), sVar);
    }

    public l R(long j4) {
        return j4 == Long.MIN_VALUE ? m0(Long.MAX_VALUE).m0(1L) : m0(-j4);
    }

    public l R0(s sVar) {
        return E0(this.f88278b, sVar);
    }

    public l S(long j4) {
        return j4 == Long.MIN_VALUE ? o0(Long.MAX_VALUE).o0(1L) : o0(-j4);
    }

    public l S0(int i4) {
        return E0(this.f88278b.d1(i4), this.f88279c);
    }

    public l T(long j4) {
        return j4 == Long.MIN_VALUE ? p0(Long.MAX_VALUE).p0(1L) : p0(-j4);
    }

    public l T0(int i4) {
        return E0(this.f88278b.e1(i4), this.f88279c);
    }

    public l U(long j4) {
        return j4 == Long.MIN_VALUE ? s0(Long.MAX_VALUE).s0(1L) : s0(-j4);
    }

    void U0(DataOutput dataOutput) throws IOException {
        this.f88278b.f1(dataOutput);
        this.f88279c.J(dataOutput);
    }

    public l V(long j4) {
        return j4 == Long.MIN_VALUE ? t0(Long.MAX_VALUE).t0(1L) : t0(-j4);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.EPOCH_DAY, this.f88278b.S0().E()).b(org.threeten.bp.temporal.a.NANO_OF_DAY, this.f88278b.C().f0()).b(org.threeten.bp.temporal.a.OFFSET_SECONDS, this.f88279c.v());
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (l) iVar.a(this);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isDateBased() || mVar.isTimeBased() : mVar != null && mVar.isSupportedBy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f88278b.equals(lVar.f88278b) && this.f88279c.equals(lVar.f88279c);
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        l p4 = p(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, p4);
        }
        return this.f88278b.f(p4.Q0(this.f88279c).f88278b, mVar);
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (l) iVar.b(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public l v(long j4, org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? E0(this.f88278b.k(j4, mVar), this.f88279c) : (l) mVar.addTo(this, j4);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return super.get(jVar);
        }
        int i4 = c.f88280a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i4 != 1) {
            return i4 != 2 ? this.f88278b.get(jVar) : this.f88279c.v();
        }
        throw new DateTimeException(org.threeten.bp.c.a("Field too large for an int: ", jVar));
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        int i4 = c.f88280a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        return i4 != 1 ? i4 != 2 ? this.f88278b.getLong(jVar) : this.f88279c.v() : w0();
    }

    public l h0(org.threeten.bp.temporal.i iVar) {
        return (l) iVar.b(this);
    }

    public int hashCode() {
        return this.f88278b.hashCode() ^ this.f88279c.hashCode();
    }

    public l i0(long j4) {
        return E0(this.f88278b.F0(j4), this.f88279c);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return (jVar instanceof org.threeten.bp.temporal.a) || (jVar != null && jVar.isSupportedBy(this));
    }

    public l k0(long j4) {
        return E0(this.f88278b.G0(j4), this.f88279c);
    }

    public u l(r rVar) {
        return u.A0(this.f88278b, this.f88279c, rVar);
    }

    public l l0(long j4) {
        return E0(this.f88278b.H0(j4), this.f88279c);
    }

    public u m(r rVar) {
        return u.C0(this.f88278b, rVar, this.f88279c);
    }

    public l m0(long j4) {
        return E0(this.f88278b.I0(j4), this.f88279c);
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        if (this.f88279c.equals(lVar.f88279c)) {
            return this.f88278b.compareTo(lVar.f88278b);
        }
        int b5 = ng.d.b(w0(), lVar.w0());
        if (b5 != 0) {
            return b5;
        }
        int u4 = this.f88278b.C().u() - lVar.f88278b.C().u();
        return u4 == 0 ? this.f88278b.compareTo(lVar.f88278b) : u4;
    }

    public String o(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public l o0(long j4) {
        return E0(this.f88278b.J0(j4), this.f88279c);
    }

    public l p0(long j4) {
        return E0(this.f88278b.L0(j4), this.f88279c);
    }

    public int q() {
        return this.f88278b.P();
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) org.threeten.bp.chrono.o.f88011f;
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.d() || lVar == org.threeten.bp.temporal.k.f()) {
            return (R) this.f88279c;
        }
        if (lVar == org.threeten.bp.temporal.k.b()) {
            return (R) this.f88278b.S0();
        }
        if (lVar == org.threeten.bp.temporal.k.c()) {
            return (R) this.f88278b.C();
        }
        if (lVar == org.threeten.bp.temporal.k.g()) {
            return null;
        }
        return (R) super.query(lVar);
    }

    public d r() {
        return this.f88278b.R();
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? (jVar == org.threeten.bp.temporal.a.INSTANT_SECONDS || jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) ? jVar.range() : this.f88278b.range(jVar) : jVar.rangeRefinedBy(this);
    }

    public int s() {
        return this.f88278b.S();
    }

    public l s0(long j4) {
        return E0(this.f88278b.N0(j4), this.f88279c);
    }

    public int t() {
        return this.f88278b.T();
    }

    public l t0(long j4) {
        return E0(this.f88278b.Q0(j4), this.f88279c);
    }

    public String toString() {
        return this.f88278b.toString() + this.f88279c.toString();
    }

    public int u() {
        return this.f88278b.U();
    }

    public j v() {
        return this.f88278b.V();
    }

    public int w() {
        return this.f88278b.W();
    }

    public long w0() {
        return this.f88278b.z(this.f88279c);
    }

    public f x0() {
        return this.f88278b.A(this.f88279c);
    }

    public int y() {
        return this.f88278b.Y();
    }

    public g y0() {
        return this.f88278b.S0();
    }

    public s z() {
        return this.f88279c;
    }

    public h z0() {
        return this.f88278b;
    }
}
