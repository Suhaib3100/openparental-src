package org.threeten.bp;

import com.tencent.mmkv.MMKV;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: LocalDateTime.java */
/* loaded from: classes9.dex */
public final class h extends org.threeten.bp.chrono.d<g> implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final h f88234e = y0(g.f88223f, i.f88241f);

    /* renamed from: f, reason: collision with root package name */
    public static final h f88235f = y0(g.f88224g, i.f88242g);

    /* renamed from: g, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<h> f88236g = new a();

    /* renamed from: h, reason: collision with root package name */
    private static final long f88237h = 6207766400415563566L;

    /* renamed from: c, reason: collision with root package name */
    private final g f88238c;

    /* renamed from: d, reason: collision with root package name */
    private final i f88239d;

    /* compiled from: LocalDateTime.java */
    class a implements org.threeten.bp.temporal.l<h> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(org.threeten.bp.temporal.f fVar) {
            return h.N(fVar);
        }
    }

    /* compiled from: LocalDateTime.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88240a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f88240a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88240a[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88240a[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88240a[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88240a[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88240a[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88240a[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private h(g gVar, i iVar) {
        this.f88238c = gVar;
        this.f88239d = iVar;
    }

    public static h A0(f fVar, r rVar) {
        ng.d.j(fVar, "instant");
        ng.d.j(rVar, "zone");
        return z0(fVar.q(), fVar.r(), rVar.l().b(fVar));
    }

    public static h B0(CharSequence charSequence) {
        return C0(charSequence, org.threeten.bp.format.c.f88107n);
    }

    public static h C0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return (h) cVar.r(charSequence, f88236g);
    }

    private int M(h hVar) {
        int V = this.f88238c.V(hVar.f88238c);
        return V == 0 ? this.f88239d.compareTo(hVar.f88239d) : V;
    }

    public static h N(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof h) {
            return (h) fVar;
        }
        if (fVar instanceof u) {
            return ((u) fVar).Y0();
        }
        try {
            return new h(g.Z(fVar), i.q(fVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    private h P0(g gVar, long j4, long j5, long j6, long j7, int i4) {
        if ((j4 | j5 | j6 | j7) == 0) {
            return U0(gVar, this.f88239d);
        }
        long j10 = i4;
        long f02 = this.f88239d.f0();
        long j11 = ((((j4 % 24) * 3600000000000L) + ((j5 % 1440) * 60000000000L) + ((j6 % 86400) * 1000000000) + (j7 % 86400000000000L)) * j10) + f02;
        long e4 = ng.d.e(j11, 86400000000000L) + (((j4 / 24) + (j5 / 1440) + (j6 / 86400) + (j7 / 86400000000000L)) * j10);
        long h4 = ng.d.h(j11, 86400000000000L);
        return U0(gVar.F0(e4), h4 == f02 ? this.f88239d : i.S(h4));
    }

    static h R0(DataInput dataInput) throws IOException {
        return y0(g.J0(dataInput), i.e0(dataInput));
    }

    private h U0(g gVar, i iVar) {
        return (this.f88238c == gVar && this.f88239d == iVar) ? this : new h(gVar, iVar);
    }

    public static h m0() {
        return o0(org.threeten.bp.a.g());
    }

    public static h o0(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        f c5 = aVar.c();
        return z0(c5.q(), c5.r(), aVar.b().l().b(c5));
    }

    public static h p0(r rVar) {
        return o0(org.threeten.bp.a.f(rVar));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static h s0(int i4, int i5, int i6, int i7, int i10) {
        return new h(g.x0(i4, i5, i6), i.N(i7, i10));
    }

    public static h t0(int i4, int i5, int i6, int i7, int i10, int i11) {
        return new h(g.x0(i4, i5, i6), i.P(i7, i10, i11));
    }

    public static h u0(int i4, int i5, int i6, int i7, int i10, int i11, int i12) {
        return new h(g.x0(i4, i5, i6), i.R(i7, i10, i11, i12));
    }

    public static h v0(int i4, j jVar, int i5, int i6, int i7) {
        return new h(g.y0(i4, jVar, i5), i.N(i6, i7));
    }

    public static h w0(int i4, j jVar, int i5, int i6, int i7, int i10) {
        return new h(g.y0(i4, jVar, i5), i.P(i6, i7, i10));
    }

    private Object writeReplace() {
        return new o((byte) 4, this);
    }

    public static h x0(int i4, j jVar, int i5, int i6, int i7, int i10, int i11) {
        return new h(g.y0(i4, jVar, i5), i.R(i6, i7, i10, i11));
    }

    public static h y0(g gVar, i iVar) {
        ng.d.j(gVar, "date");
        ng.d.j(iVar, "time");
        return new h(gVar, iVar);
    }

    public static h z0(long j4, int i4, s sVar) {
        ng.d.j(sVar, "offset");
        return new h(g.z0(ng.d.e(j4 + sVar.v(), 86400L)), i.U(ng.d.g(r2, MMKV.ExpireInDay), i4));
    }

    @Override // org.threeten.bp.chrono.d
    public g B() {
        return this.f88238c;
    }

    @Override // org.threeten.bp.chrono.d
    public i C() {
        return this.f88239d;
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: D0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public h v(long j4, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (h) mVar.addTo(this, j4);
        }
        switch (b.f88240a[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return J0(j4);
            case 2:
                return F0(j4 / 86400000000L).J0((j4 % 86400000000L) * 1000);
            case 3:
                return F0(j4 / 86400000).J0((j4 % 86400000) * 1000000);
            case 4:
                return L0(j4);
            case 5:
                return H0(j4);
            case 6:
                return G0(j4);
            case 7:
                return F0(j4 / 256).G0((j4 % 256) * 12);
            default:
                return U0(this.f88238c.A(j4, mVar), this.f88239d);
        }
    }

    public h E0(org.threeten.bp.temporal.i iVar) {
        return (h) iVar.b(this);
    }

    public h F0(long j4) {
        return U0(this.f88238c.F0(j4), this.f88239d);
    }

    public h G0(long j4) {
        return P0(this.f88238c, j4, 0L, 0L, 0L, 1);
    }

    public h H0(long j4) {
        return P0(this.f88238c, 0L, j4, 0L, 0L, 1);
    }

    public h I0(long j4) {
        return U0(this.f88238c.G0(j4), this.f88239d);
    }

    public l J(s sVar) {
        return l.c0(this, sVar);
    }

    public h J0(long j4) {
        return P0(this.f88238c, 0L, 0L, 0L, j4, 1);
    }

    public u K(r rVar) {
        return u.y0(this, rVar);
    }

    public h L0(long j4) {
        return P0(this.f88238c, 0L, 0L, j4, 0L, 1);
    }

    public h N0(long j4) {
        return U0(this.f88238c.H0(j4), this.f88239d);
    }

    public int P() {
        return this.f88238c.c0();
    }

    public h Q0(long j4) {
        return U0(this.f88238c.I0(j4), this.f88239d);
    }

    public d R() {
        return this.f88238c.d0();
    }

    public int S() {
        return this.f88238c.e0();
    }

    public g S0() {
        return this.f88238c;
    }

    public int T() {
        return this.f88239d.s();
    }

    public h T0(org.threeten.bp.temporal.m mVar) {
        return U0(this.f88238c, this.f88239d.h0(mVar));
    }

    public int U() {
        return this.f88239d.t();
    }

    public j V() {
        return this.f88238c.f0();
    }

    @Override // org.threeten.bp.chrono.d, ng.b, org.threeten.bp.temporal.e
    /* renamed from: V0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public h i(org.threeten.bp.temporal.g gVar) {
        return gVar instanceof g ? U0((g) gVar, this.f88239d) : gVar instanceof i ? U0(this.f88238c, (i) gVar) : gVar instanceof h ? (h) gVar : (h) gVar.adjustInto(this);
    }

    public int W() {
        return this.f88238c.g0();
    }

    @Override // org.threeten.bp.chrono.d, org.threeten.bp.temporal.e
    /* renamed from: W0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public h b(org.threeten.bp.temporal.j jVar, long j4) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() ? U0(this.f88238c, this.f88239d.b(jVar, j4)) : U0(this.f88238c.K(jVar, j4), this.f88239d) : (h) jVar.adjustInto(this, j4);
    }

    public h X0(int i4) {
        return U0(this.f88238c.R0(i4), this.f88239d);
    }

    public int Y() {
        return this.f88239d.u();
    }

    public h Y0(int i4) {
        return U0(this.f88238c.S0(i4), this.f88239d);
    }

    public int Z() {
        return this.f88239d.v();
    }

    public h Z0(int i4) {
        return U0(this.f88238c, this.f88239d.l0(i4));
    }

    public int a0() {
        return this.f88238c.i0();
    }

    public h a1(int i4) {
        return U0(this.f88238c, this.f88239d.m0(i4));
    }

    @Override // org.threeten.bp.chrono.d, org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return super.adjustInto(eVar);
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: b0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public h t(long j4, org.threeten.bp.temporal.m mVar) {
        return j4 == Long.MIN_VALUE ? k(Long.MAX_VALUE, mVar).k(1L, mVar) : k(-j4, mVar);
    }

    public h b1(int i4) {
        return U0(this.f88238c.T0(i4), this.f88239d);
    }

    @Override // org.threeten.bp.chrono.d, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (h) iVar.a(this);
    }

    public h c0(org.threeten.bp.temporal.i iVar) {
        return (h) iVar.a(this);
    }

    public h c1(int i4) {
        return U0(this.f88238c, this.f88239d.o0(i4));
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isDateBased() || mVar.isTimeBased() : mVar != null && mVar.isSupportedBy(this);
    }

    public h d0(long j4) {
        return j4 == Long.MIN_VALUE ? F0(Long.MAX_VALUE).F0(1L) : F0(-j4);
    }

    public h d1(int i4) {
        return U0(this.f88238c, this.f88239d.p0(i4));
    }

    public h e0(long j4) {
        return P0(this.f88238c, j4, 0L, 0L, 0L, -1);
    }

    public h e1(int i4) {
        return U0(this.f88238c.U0(i4), this.f88239d);
    }

    @Override // org.threeten.bp.chrono.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f88238c.equals(hVar.f88238c) && this.f88239d.equals(hVar.f88239d);
    }

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        h N = N(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, N);
        }
        org.threeten.bp.temporal.b bVar = (org.threeten.bp.temporal.b) mVar;
        if (!bVar.isTimeBased()) {
            g gVar = N.f88238c;
            if (gVar.r(this.f88238c) && N.f88239d.y(this.f88239d)) {
                gVar = gVar.m0(1L);
            } else if (gVar.s(this.f88238c) && N.f88239d.w(this.f88239d)) {
                gVar = gVar.F0(1L);
            }
            return this.f88238c.f(gVar, mVar);
        }
        long Y = this.f88238c.Y(N.f88238c);
        long f02 = N.f88239d.f0() - this.f88239d.f0();
        if (Y > 0 && f02 < 0) {
            Y--;
            f02 += 86400000000000L;
        } else if (Y < 0 && f02 > 0) {
            Y++;
            f02 -= 86400000000000L;
        }
        switch (b.f88240a[bVar.ordinal()]) {
            case 1:
                return ng.d.l(ng.d.o(Y, 86400000000000L), f02);
            case 2:
                return ng.d.l(ng.d.o(Y, 86400000000L), f02 / 1000);
            case 3:
                return ng.d.l(ng.d.o(Y, 86400000L), f02 / 1000000);
            case 4:
                return ng.d.l(ng.d.n(Y, MMKV.ExpireInDay), f02 / 1000000000);
            case 5:
                return ng.d.l(ng.d.n(Y, 1440), f02 / 60000000000L);
            case 6:
                return ng.d.l(ng.d.n(Y, 24), f02 / 3600000000000L);
            case 7:
                return ng.d.l(ng.d.n(Y, 2), f02 / 43200000000000L);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
        }
    }

    public h f0(long j4) {
        return P0(this.f88238c, 0L, j4, 0L, 0L, -1);
    }

    void f1(DataOutput dataOutput) throws IOException {
        this.f88238c.V0(dataOutput);
        this.f88239d.s0(dataOutput);
    }

    @Override // org.threeten.bp.chrono.d, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (h) iVar.b(this);
    }

    public h g0(long j4) {
        return j4 == Long.MIN_VALUE ? I0(Long.MAX_VALUE).I0(1L) : I0(-j4);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() ? this.f88239d.get(jVar) : this.f88238c.get(jVar) : super.get(jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() ? this.f88239d.getLong(jVar) : this.f88238c.getLong(jVar) : jVar.getFrom(this);
    }

    public h h0(long j4) {
        return P0(this.f88238c, 0L, 0L, 0L, j4, -1);
    }

    @Override // org.threeten.bp.chrono.d
    public int hashCode() {
        return this.f88238c.hashCode() ^ this.f88239d.hashCode();
    }

    public h i0(long j4) {
        return P0(this.f88238c, 0L, 0L, j4, 0L, -1);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isDateBased() || jVar.isTimeBased() : jVar != null && jVar.isSupportedBy(this);
    }

    public h k0(long j4) {
        return j4 == Long.MIN_VALUE ? N0(Long.MAX_VALUE).N0(1L) : N0(-j4);
    }

    @Override // org.threeten.bp.chrono.d
    public org.threeten.bp.chrono.h<g> l(r rVar) {
        return u.y0(this, rVar);
    }

    public h l0(long j4) {
        return j4 == Long.MIN_VALUE ? Q0(Long.MAX_VALUE).Q0(1L) : Q0(-j4);
    }

    @Override // org.threeten.bp.chrono.d, java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(org.threeten.bp.chrono.d<?> dVar) {
        return dVar instanceof h ? M((h) dVar) : super.compareTo(dVar);
    }

    @Override // org.threeten.bp.chrono.d
    public String n(org.threeten.bp.format.c cVar) {
        return super.n(cVar);
    }

    @Override // org.threeten.bp.chrono.d
    public boolean q(org.threeten.bp.chrono.d<?> dVar) {
        return dVar instanceof h ? M((h) dVar) > 0 : super.q(dVar);
    }

    @Override // org.threeten.bp.chrono.d, ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        return lVar == org.threeten.bp.temporal.k.b() ? (R) this.f88238c : (R) super.query(lVar);
    }

    @Override // org.threeten.bp.chrono.d
    public boolean r(org.threeten.bp.chrono.d<?> dVar) {
        return dVar instanceof h ? M((h) dVar) < 0 : super.r(dVar);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() ? this.f88239d.range(jVar) : this.f88238c.range(jVar) : jVar.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.chrono.d
    public boolean s(org.threeten.bp.chrono.d<?> dVar) {
        return dVar instanceof h ? M((h) dVar) == 0 : super.s(dVar);
    }

    @Override // org.threeten.bp.chrono.d
    public String toString() {
        return this.f88238c.toString() + 'T' + this.f88239d.toString();
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: u */
    public org.threeten.bp.chrono.d<g> c(org.threeten.bp.temporal.i iVar) {
        return (h) iVar.a(this);
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: w */
    public org.threeten.bp.chrono.d<g> g(org.threeten.bp.temporal.i iVar) {
        return (h) iVar.b(this);
    }
}
