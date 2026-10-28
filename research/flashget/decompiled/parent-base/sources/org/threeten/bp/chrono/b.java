package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.c;

/* compiled from: ChronoDateImpl.java */
/* loaded from: classes9.dex */
abstract class b<D extends c> extends c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f87944c = 6282433883239719096L;

    /* compiled from: ChronoDateImpl.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87945a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f87945a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87945a[org.threeten.bp.temporal.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87945a[org.threeten.bp.temporal.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87945a[org.threeten.bp.temporal.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87945a[org.threeten.bp.temporal.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87945a[org.threeten.bp.temporal.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87945a[org.threeten.bp.temporal.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    b() {
    }

    @Override // org.threeten.bp.chrono.c
    public f G(c cVar) {
        throw new UnsupportedOperationException("Not supported in ThreeTen backport");
    }

    b<D> M(long j4) {
        return j4 == Long.MIN_VALUE ? T(Long.MAX_VALUE).T(1L) : T(-j4);
    }

    b<D> N(long j4) {
        return j4 == Long.MIN_VALUE ? U(Long.MAX_VALUE).U(1L) : U(-j4);
    }

    b<D> P(long j4) {
        return j4 == Long.MIN_VALUE ? V(Long.MAX_VALUE).V(1L) : V(-j4);
    }

    b<D> R(long j4) {
        return j4 == Long.MIN_VALUE ? W(Long.MAX_VALUE).W(1L) : W(-j4);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b<D> v(long j4, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (b) p().k(mVar.addTo(this, j4));
        }
        switch (a.f87945a[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return T(j4);
            case 2:
                return T(ng.d.n(j4, 7));
            case 3:
                return U(j4);
            case 4:
                return W(j4);
            case 5:
                return W(ng.d.n(j4, 10));
            case 6:
                return W(ng.d.n(j4, 100));
            case 7:
                return W(ng.d.n(j4, 1000));
            default:
                throw new DateTimeException(mVar + " not valid for chronology " + p().t());
        }
    }

    abstract b<D> T(long j4);

    abstract b<D> U(long j4);

    b<D> V(long j4) {
        return T(ng.d.n(j4, 7));
    }

    abstract b<D> W(long j4);

    @Override // org.threeten.bp.temporal.e
    public long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        c d5 = p().d(eVar);
        return mVar instanceof org.threeten.bp.temporal.b ? org.threeten.bp.g.Z(this).f(d5, mVar) : mVar.between(this, d5);
    }

    @Override // org.threeten.bp.chrono.c
    public d<?> l(org.threeten.bp.i iVar) {
        return e.J(this, iVar);
    }
}
