package org.threeten.bp.chrono;

import java.util.Comparator;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.c;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: ChronoZonedDateTime.java */
/* loaded from: classes9.dex */
public abstract class h<D extends c> extends ng.b implements org.threeten.bp.temporal.e, Comparable<h<?>> {

    /* renamed from: b, reason: collision with root package name */
    private static Comparator<h<?>> f87969b = new a();

    /* compiled from: ChronoZonedDateTime.java */
    class a implements Comparator<h<?>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h<?> hVar, h<?> hVar2) {
            int b5 = ng.d.b(hVar.A(), hVar2.A());
            return b5 == 0 ? ng.d.b(hVar.G().f0(), hVar2.G().f0()) : b5;
        }
    }

    /* compiled from: ChronoZonedDateTime.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87970a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f87970a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87970a[org.threeten.bp.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static h<?> n(org.threeten.bp.temporal.f fVar) {
        ng.d.j(fVar, "temporal");
        if (fVar instanceof h) {
            return (h) fVar;
        }
        j jVar = (j) fVar.query(org.threeten.bp.temporal.k.a());
        if (jVar != null) {
            return jVar.M(fVar);
        }
        throw new DateTimeException("No Chronology found to create ChronoZonedDateTime: " + fVar.getClass());
    }

    public static Comparator<h<?>> z() {
        return f87969b;
    }

    public long A() {
        return ((C().E() * 86400) + G().g0()) - p().v();
    }

    public org.threeten.bp.f B() {
        return org.threeten.bp.f.J(A(), G().u());
    }

    public D C() {
        return E().B();
    }

    public abstract d<D> E();

    public org.threeten.bp.i G() {
        return E().C();
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public h<D> i(org.threeten.bp.temporal.g gVar) {
        return C().p().m(gVar.adjustInto(this));
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public abstract h<D> b(org.threeten.bp.temporal.j jVar, long j4);

    public abstract h<D> M();

    public abstract h<D> N();

    public abstract h<D> P(org.threeten.bp.r rVar);

    public abstract h<D> R(org.threeten.bp.r rVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return super.get(jVar);
        }
        int i4 = b.f87970a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i4 != 1) {
            return i4 != 2 ? E().get(jVar) : p().v();
        }
        throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Field too large for an int: ", jVar));
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        int i4 = b.f87970a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        return i4 != 1 ? i4 != 2 ? E().getLong(jVar) : p().v() : A();
    }

    public int hashCode() {
        return (E().hashCode() ^ p().hashCode()) ^ Integer.rotateLeft(q().hashCode(), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.threeten.bp.chrono.c] */
    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(h<?> hVar) {
        int b5 = ng.d.b(A(), hVar.A());
        if (b5 != 0) {
            return b5;
        }
        int u4 = G().u() - hVar.G().u();
        if (u4 != 0) {
            return u4;
        }
        int compareTo = E().compareTo(hVar.E());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = q().j().compareTo(hVar.q().j());
        return compareTo2 == 0 ? C().p().compareTo(hVar.C().p()) : compareTo2;
    }

    public String m(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public j o() {
        return C().p();
    }

    public abstract org.threeten.bp.s p();

    public abstract org.threeten.bp.r q();

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        return (lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.f()) ? (R) q() : lVar == org.threeten.bp.temporal.k.a() ? (R) C().p() : lVar == org.threeten.bp.temporal.k.e() ? (R) org.threeten.bp.temporal.b.NANOS : lVar == org.threeten.bp.temporal.k.d() ? (R) p() : lVar == org.threeten.bp.temporal.k.b() ? (R) org.threeten.bp.g.z0(C().E()) : lVar == org.threeten.bp.temporal.k.c() ? (R) G() : (R) super.query(lVar);
    }

    public boolean r(h<?> hVar) {
        long A = A();
        long A2 = hVar.A();
        return A > A2 || (A == A2 && G().u() > hVar.G().u());
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? (jVar == org.threeten.bp.temporal.a.INSTANT_SECONDS || jVar == org.threeten.bp.temporal.a.OFFSET_SECONDS) ? jVar.range() : E().range(jVar) : jVar.rangeRefinedBy(this);
    }

    public boolean s(h<?> hVar) {
        long A = A();
        long A2 = hVar.A();
        return A < A2 || (A == A2 && G().u() < hVar.G().u());
    }

    public boolean t(h<?> hVar) {
        return A() == hVar.A() && G().u() == hVar.G().u();
    }

    public String toString() {
        String str = E().toString() + p().toString();
        if (p() == q()) {
            return str;
        }
        return str + '[' + q().toString() + ']';
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public h<D> t(long j4, org.threeten.bp.temporal.m mVar) {
        return C().p().m(super.t(j4, mVar));
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public h<D> c(org.threeten.bp.temporal.i iVar) {
        return C().p().m(iVar.a(this));
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract h<D> v(long j4, org.threeten.bp.temporal.m mVar);

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public h<D> g(org.threeten.bp.temporal.i iVar) {
        return C().p().m(iVar.b(this));
    }
}
