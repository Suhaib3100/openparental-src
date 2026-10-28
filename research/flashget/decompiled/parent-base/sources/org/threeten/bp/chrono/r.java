package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: JapaneseDate.java */
/* loaded from: classes9.dex */
public final class r extends b<r> implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final long f88022g = -305327627230580483L;

    /* renamed from: h, reason: collision with root package name */
    static final org.threeten.bp.g f88023h = org.threeten.bp.g.x0(1873, 1, 1);

    /* renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.g f88024d;

    /* renamed from: e, reason: collision with root package name */
    private transient s f88025e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f88026f;

    /* compiled from: JapaneseDate.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88027a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f88027a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.DAY_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88027a[org.threeten.bp.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88027a[org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88027a[org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88027a[org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88027a[org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88027a[org.threeten.bp.temporal.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    r(org.threeten.bp.g gVar) {
        if (gVar.s(f88023h)) {
            throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
        }
        this.f88025e = s.m(gVar);
        this.f88026f = gVar.i0() - (r0.r().i0() - 1);
        this.f88024d = gVar;
    }

    private org.threeten.bp.temporal.n Y(int i4) {
        Calendar calendar = Calendar.getInstance(q.f88013f);
        calendar.set(0, this.f88025e.getValue() + 2);
        calendar.set(this.f88026f, this.f88024d.g0() - 1, this.f88024d.c0());
        return org.threeten.bp.temporal.n.k(calendar.getActualMinimum(i4), calendar.getActualMaximum(i4));
    }

    public static r Z(org.threeten.bp.temporal.f fVar) {
        return q.f88014g.d(fVar);
    }

    private long b0() {
        return this.f88026f == 1 ? (this.f88024d.e0() - this.f88025e.r().e0()) + 1 : this.f88024d.e0();
    }

    public static r f0() {
        return g0(org.threeten.bp.a.g());
    }

    public static r g0(org.threeten.bp.a aVar) {
        return new r(org.threeten.bp.g.v0(aVar));
    }

    public static r h0(org.threeten.bp.r rVar) {
        return g0(org.threeten.bp.a.f(rVar));
    }

    public static r i0(int i4, int i5, int i6) {
        return new r(org.threeten.bp.g.x0(i4, i5, i6));
    }

    public static r k0(s sVar, int i4, int i5, int i6) {
        ng.d.j(sVar, "era");
        if (i4 < 1) {
            throw new DateTimeException(android.support.v4.media.a.a("Invalid YearOfEra: ", i4));
        }
        org.threeten.bp.g r4 = sVar.r();
        org.threeten.bp.g l4 = sVar.l();
        org.threeten.bp.g x02 = org.threeten.bp.g.x0((r4.i0() - 1) + i4, i5, i6);
        if (!x02.s(r4) && !x02.r(l4)) {
            return new r(sVar, i4, x02);
        }
        throw new DateTimeException("Requested date is outside bounds of era " + sVar);
    }

    static r l0(s sVar, int i4, int i5) {
        ng.d.j(sVar, "era");
        if (i4 < 1) {
            throw new DateTimeException(android.support.v4.media.a.a("Invalid YearOfEra: ", i4));
        }
        org.threeten.bp.g r4 = sVar.r();
        org.threeten.bp.g l4 = sVar.l();
        if (i4 == 1 && (i5 = i5 + (r4.e0() - 1)) > r4.w()) {
            throw new DateTimeException("DayOfYear exceeds maximum allowed in the first year of era " + sVar);
        }
        org.threeten.bp.g A0 = org.threeten.bp.g.A0((r4.i0() - 1) + i4, i5);
        if (!A0.s(r4) && !A0.r(l4)) {
            return new r(sVar, i4, A0);
        }
        throw new DateTimeException("Requested date is outside bounds of era " + sVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f88025e = s.m(this.f88024d);
        this.f88026f = this.f88024d.i0() - (r2.r().i0() - 1);
    }

    static c u0(DataInput dataInput) throws IOException {
        return q.f88014g.b(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private r v0(org.threeten.bp.g gVar) {
        return gVar.equals(this.f88024d) ? this : new r(gVar);
    }

    private Object writeReplace() {
        return new w((byte) 1, this);
    }

    private r y0(int i4) {
        return z0(this.f88025e, i4);
    }

    private r z0(s sVar, int i4) {
        return v0(this.f88024d.U0(q.f88014g.A(sVar, i4)));
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    /* renamed from: A */
    public c v(long j4, org.threeten.bp.temporal.m mVar) {
        return (r) super.v(j4, mVar);
    }

    void A0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(org.threeten.bp.temporal.a.YEAR));
        dataOutput.writeByte(get(org.threeten.bp.temporal.a.MONTH_OF_YEAR));
        dataOutput.writeByte(get(org.threeten.bp.temporal.a.DAY_OF_MONTH));
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: B */
    public c g(org.threeten.bp.temporal.i iVar) {
        return (r) super.g(iVar);
    }

    @Override // org.threeten.bp.chrono.c
    public long E() {
        return this.f88024d.E();
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public f G(c cVar) {
        org.threeten.bp.n G = this.f88024d.G(cVar);
        q qVar = q.f88014g;
        int s4 = G.s();
        int r4 = G.r();
        int q4 = G.q();
        qVar.getClass();
        return new g(qVar, s4, r4, q4);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: J */
    public c i(org.threeten.bp.temporal.g gVar) {
        return (r) super.i(gVar);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: S */
    public b<r> v(long j4, org.threeten.bp.temporal.m mVar) {
        return (r) super.v(j4, mVar);
    }

    public q a0() {
        return q.f88014g;
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (r) super.c(iVar);
    }

    public s c0() {
        return this.f88025e;
    }

    public r d0(long j4, org.threeten.bp.temporal.m mVar) {
        return (r) super.t(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    /* renamed from: e */
    public org.threeten.bp.temporal.e t(long j4, org.threeten.bp.temporal.m mVar) {
        return (r) super.t(j4, mVar);
    }

    public r e0(org.threeten.bp.temporal.i iVar) {
        return (r) super.c(iVar);
    }

    @Override // org.threeten.bp.chrono.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f88024d.equals(((r) obj).f88024d);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.e
    public /* bridge */ /* synthetic */ long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        return super.f(eVar, mVar);
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (r) super.g(iVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        switch (a.f88027a[((org.threeten.bp.temporal.a) jVar).ordinal()]) {
            case 1:
                return b0();
            case 2:
                return this.f88026f;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
            case 7:
                return this.f88025e.getValue();
            default:
                return this.f88024d.getLong(jVar);
        }
    }

    @Override // org.threeten.bp.chrono.c
    public int hashCode() {
        q.f88014g.getClass();
        return this.f88024d.hashCode() ^ (-688086063);
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e i(org.threeten.bp.temporal.g gVar) {
        return (r) super.i(gVar);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || jVar == org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || jVar == org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH || jVar == org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(jVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* renamed from: k */
    public org.threeten.bp.temporal.e v(long j4, org.threeten.bp.temporal.m mVar) {
        return (r) super.v(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<r> l(org.threeten.bp.i iVar) {
        return e.J(this, iVar);
    }

    public r m0(long j4, org.threeten.bp.temporal.m mVar) {
        return (r) super.v(j4, mVar);
    }

    public r o0(org.threeten.bp.temporal.i iVar) {
        return (r) super.g(iVar);
    }

    @Override // org.threeten.bp.chrono.c
    public j p() {
        return q.f88014g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public r T(long j4) {
        return v0(this.f88024d.F0(j4));
    }

    @Override // org.threeten.bp.chrono.c
    public k q() {
        return this.f88025e;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.rangeRefinedBy(this);
        }
        if (!isSupported(jVar)) {
            throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i4 = a.f88027a[aVar.ordinal()];
        return i4 != 1 ? i4 != 2 ? q.f88014g.B(aVar) : Y(1) : Y(6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public r U(long j4) {
        return v0(this.f88024d.G0(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public r W(long j4) {
        return v0(this.f88024d.I0(j4));
    }

    @Override // org.threeten.bp.chrono.c
    public int v() {
        return this.f88024d.v();
    }

    @Override // org.threeten.bp.chrono.c
    public int w() {
        Calendar calendar = Calendar.getInstance(q.f88013f);
        calendar.set(0, this.f88025e.getValue() + 2);
        calendar.set(this.f88026f, this.f88024d.g0() - 1, this.f88024d.c0());
        return calendar.getActualMaximum(6);
    }

    public r w0(org.threeten.bp.temporal.g gVar) {
        return (r) super.i(gVar);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public r b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (r) jVar.adjustInto(this, j4);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        if (getLong(aVar) == j4) {
            return this;
        }
        int[] iArr = a.f88027a;
        int i4 = iArr[aVar.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 7) {
            int a5 = q.f88014g.B(aVar).a(j4, aVar);
            int i5 = iArr[aVar.ordinal()];
            if (i5 == 1) {
                return v0(this.f88024d.F0(a5 - b0()));
            }
            if (i5 == 2) {
                return z0(this.f88025e, a5);
            }
            if (i5 == 7) {
                return z0(s.n(a5), this.f88026f);
            }
        }
        return v0(this.f88024d.K(jVar, j4));
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: y */
    public c t(long j4, org.threeten.bp.temporal.m mVar) {
        return (r) super.t(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: z */
    public c c(org.threeten.bp.temporal.i iVar) {
        return (r) super.c(iVar);
    }

    r(s sVar, int i4, org.threeten.bp.g gVar) {
        if (!gVar.s(f88023h)) {
            this.f88025e = sVar;
            this.f88026f = i4;
            this.f88024d = gVar;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }
}
