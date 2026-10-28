package org.threeten.bp.chrono;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.threeten.bp.chrono.c;

/* compiled from: ChronoLocalDateTimeImpl.java */
/* loaded from: classes9.dex */
final class e<D extends c> extends d<D> implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f87948e = 4556003607393004514L;

    /* renamed from: f, reason: collision with root package name */
    private static final int f87949f = 24;

    /* renamed from: g, reason: collision with root package name */
    private static final int f87950g = 60;

    /* renamed from: h, reason: collision with root package name */
    private static final int f87951h = 1440;

    /* renamed from: i, reason: collision with root package name */
    private static final int f87952i = 60;

    /* renamed from: j, reason: collision with root package name */
    private static final int f87953j = 3600;

    /* renamed from: k, reason: collision with root package name */
    private static final int f87954k = 86400;

    /* renamed from: l, reason: collision with root package name */
    private static final long f87955l = 86400000;

    /* renamed from: m, reason: collision with root package name */
    private static final long f87956m = 86400000000L;

    /* renamed from: n, reason: collision with root package name */
    private static final long f87957n = 1000000000;

    /* renamed from: o, reason: collision with root package name */
    private static final long f87958o = 60000000000L;

    /* renamed from: p, reason: collision with root package name */
    private static final long f87959p = 3600000000000L;

    /* renamed from: q, reason: collision with root package name */
    private static final long f87960q = 86400000000000L;

    /* renamed from: c, reason: collision with root package name */
    private final D f87961c;

    /* renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.i f87962d;

    /* compiled from: ChronoLocalDateTimeImpl.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87963a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f87963a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87963a[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87963a[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87963a[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87963a[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87963a[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87963a[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private e(D d5, org.threeten.bp.i iVar) {
        ng.d.j(d5, "date");
        ng.d.j(iVar, "time");
        this.f87961c = d5;
        this.f87962d = iVar;
    }

    static <R extends c> e<R> J(R r4, org.threeten.bp.i iVar) {
        return new e<>(r4, iVar);
    }

    private e<D> M(long j4) {
        return V(this.f87961c.v(j4, org.threeten.bp.temporal.b.DAYS), this.f87962d);
    }

    private e<D> N(long j4) {
        return T(this.f87961c, j4, 0L, 0L, 0L);
    }

    private e<D> P(long j4) {
        return T(this.f87961c, 0L, j4, 0L, 0L);
    }

    private e<D> R(long j4) {
        return T(this.f87961c, 0L, 0L, 0L, j4);
    }

    private e<D> T(D d5, long j4, long j5, long j6, long j7) {
        if ((j4 | j5 | j6 | j7) == 0) {
            return V(d5, this.f87962d);
        }
        long j10 = j4 / 24;
        long j11 = j10 + (j5 / 1440) + (j6 / 86400) + (j7 / f87960q);
        long j12 = ((j4 % 24) * f87959p) + ((j5 % 1440) * f87958o) + ((j6 % 86400) * f87957n) + (j7 % f87960q);
        long f02 = this.f87962d.f0();
        long j13 = j12 + f02;
        long e4 = ng.d.e(j13, f87960q) + j11;
        long h4 = ng.d.h(j13, f87960q);
        return V(d5.v(e4, org.threeten.bp.temporal.b.DAYS), h4 == f02 ? this.f87962d : org.threeten.bp.i.S(h4));
    }

    static d<?> U(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((c) objectInput.readObject()).l((org.threeten.bp.i) objectInput.readObject());
    }

    private e<D> V(org.threeten.bp.temporal.e eVar, org.threeten.bp.i iVar) {
        D d5 = this.f87961c;
        return (d5 == eVar && this.f87962d == iVar) ? this : new e<>(d5.p().k(eVar), iVar);
    }

    private Object writeReplace() {
        return new w((byte) 12, this);
    }

    @Override // org.threeten.bp.chrono.d
    public D B() {
        return this.f87961c;
    }

    @Override // org.threeten.bp.chrono.d
    public org.threeten.bp.i C() {
        return this.f87962d;
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public e<D> v(long j4, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return this.f87961c.p().l(mVar.addTo(this, j4));
        }
        switch (a.f87963a[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return R(j4);
            case 2:
                return M(j4 / f87956m).R((j4 % f87956m) * 1000);
            case 3:
                return M(j4 / 86400000).R((j4 % 86400000) * 1000000);
            case 4:
                return S(j4);
            case 5:
                return P(j4);
            case 6:
                return N(j4);
            case 7:
                return M(j4 / 256).N((j4 % 256) * 12);
            default:
                return V(this.f87961c.v(j4, mVar), this.f87962d);
        }
    }

    e<D> S(long j4) {
        return T(this.f87961c, 0L, 0L, j4, 0L);
    }

    @Override // org.threeten.bp.chrono.d, ng.b, org.threeten.bp.temporal.e
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public e<D> i(org.threeten.bp.temporal.g gVar) {
        return gVar instanceof c ? V((c) gVar, this.f87962d) : gVar instanceof org.threeten.bp.i ? V(this.f87961c, (org.threeten.bp.i) gVar) : gVar instanceof e ? this.f87961c.p().l((e) gVar) : this.f87961c.p().l((e) gVar.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.d, org.threeten.bp.temporal.e
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public e<D> b(org.threeten.bp.temporal.j jVar, long j4) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() ? V(this.f87961c, this.f87962d.b(jVar, j4)) : V(this.f87961c.b(jVar, j4), this.f87962d) : this.f87961c.p().l(jVar.adjustInto(this, j4));
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isDateBased() || mVar.isTimeBased() : mVar != null && mVar.isSupportedBy(this);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [org.threeten.bp.chrono.c] */
    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        d<?> w4 = this.f87961c.p().w(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.between(this, w4);
        }
        org.threeten.bp.temporal.b bVar = (org.threeten.bp.temporal.b) mVar;
        if (!bVar.isTimeBased()) {
            ?? B = w4.B();
            c cVar = B;
            if (w4.C().y(this.f87962d)) {
                cVar = B.t(1L, org.threeten.bp.temporal.b.DAYS);
            }
            return this.f87961c.f(cVar, mVar);
        }
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.EPOCH_DAY;
        long j4 = w4.getLong(aVar) - this.f87961c.getLong(aVar);
        switch (a.f87963a[bVar.ordinal()]) {
            case 1:
                j4 = ng.d.o(j4, f87960q);
                break;
            case 2:
                j4 = ng.d.o(j4, f87956m);
                break;
            case 3:
                j4 = ng.d.o(j4, 86400000L);
                break;
            case 4:
                j4 = ng.d.n(j4, 86400);
                break;
            case 5:
                j4 = ng.d.n(j4, f87951h);
                break;
            case 6:
                j4 = ng.d.n(j4, 24);
                break;
            case 7:
                j4 = ng.d.n(j4, 2);
                break;
        }
        return ng.d.l(j4, this.f87962d.f(w4.C(), mVar));
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() ? this.f87962d.get(jVar) : this.f87961c.get(jVar) : range(jVar).a(getLong(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() ? this.f87962d.getLong(jVar) : this.f87961c.getLong(jVar) : jVar.getFrom(this);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isDateBased() || jVar.isTimeBased() : jVar != null && jVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.chrono.d
    public h<D> l(org.threeten.bp.r rVar) {
        return i.T(this, rVar, null);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isTimeBased() ? this.f87962d.range(jVar) : this.f87961c.range(jVar) : jVar.rangeRefinedBy(this);
    }

    void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f87961c);
        objectOutput.writeObject(this.f87962d);
    }
}
