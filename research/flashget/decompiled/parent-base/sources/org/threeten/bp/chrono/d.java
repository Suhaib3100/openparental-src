package org.threeten.bp.chrono;

import java.util.Comparator;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.c;

/* compiled from: ChronoLocalDateTime.java */
/* loaded from: classes9.dex */
public abstract class d<D extends c> extends ng.b implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<d<?>> {

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<d<?>> f87947b = new a();

    /* compiled from: ChronoLocalDateTime.java */
    class a implements Comparator<d<?>> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [org.threeten.bp.chrono.c] */
        /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.c] */
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d<?> dVar, d<?> dVar2) {
            int b5 = ng.d.b(dVar.B().E(), dVar2.B().E());
            return b5 == 0 ? ng.d.b(dVar.C().f0(), dVar2.C().f0()) : b5;
        }
    }

    public static d<?> o(org.threeten.bp.temporal.f fVar) {
        ng.d.j(fVar, "temporal");
        if (fVar instanceof d) {
            return (d) fVar;
        }
        j jVar = (j) fVar.query(org.threeten.bp.temporal.k.a());
        if (jVar != null) {
            return jVar.w(fVar);
        }
        throw new DateTimeException("No Chronology found to create ChronoLocalDateTime: " + fVar.getClass());
    }

    public static Comparator<d<?>> y() {
        return f87947b;
    }

    public org.threeten.bp.f A(org.threeten.bp.s sVar) {
        return org.threeten.bp.f.J(z(sVar), C().u());
    }

    public abstract D B();

    public abstract org.threeten.bp.i C();

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: E */
    public d<D> i(org.threeten.bp.temporal.g gVar) {
        return B().p().l(gVar.adjustInto(this));
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: G */
    public abstract d<D> b(org.threeten.bp.temporal.j jVar, long j4);

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.EPOCH_DAY, B().E()).b(org.threeten.bp.temporal.a.NANO_OF_DAY, C().f0());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && compareTo((d) obj) == 0;
    }

    public int hashCode() {
        return B().hashCode() ^ C().hashCode();
    }

    public abstract h<D> l(org.threeten.bp.r rVar);

    @Override // java.lang.Comparable
    /* renamed from: m */
    public int compareTo(d<?> dVar) {
        int compareTo = B().compareTo(dVar.B());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = C().compareTo(dVar.C());
        return compareTo2 == 0 ? p().compareTo(dVar.p()) : compareTo2;
    }

    public String n(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public j p() {
        return B().p();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.c] */
    public boolean q(d<?> dVar) {
        long E = B().E();
        long E2 = dVar.B().E();
        return E > E2 || (E == E2 && C().f0() > dVar.C().f0());
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) p();
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.b()) {
            return (R) org.threeten.bp.g.z0(B().E());
        }
        if (lVar == org.threeten.bp.temporal.k.c()) {
            return (R) C();
        }
        if (lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return (R) super.query(lVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.c] */
    public boolean r(d<?> dVar) {
        long E = B().E();
        long E2 = dVar.B().E();
        return E < E2 || (E == E2 && C().f0() < dVar.C().f0());
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.threeten.bp.chrono.c] */
    public boolean s(d<?> dVar) {
        return C().f0() == dVar.C().f0() && B().E() == dVar.B().E();
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    public d<D> t(long j4, org.threeten.bp.temporal.m mVar) {
        return B().p().l(super.t(j4, mVar));
    }

    public String toString() {
        return B().toString() + 'T' + C().toString();
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public d<D> c(org.threeten.bp.temporal.i iVar) {
        return B().p().l(iVar.a(this));
    }

    @Override // org.threeten.bp.temporal.e
    public abstract d<D> v(long j4, org.threeten.bp.temporal.m mVar);

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public d<D> g(org.threeten.bp.temporal.i iVar) {
        return B().p().l(iVar.b(this));
    }

    public long z(org.threeten.bp.s sVar) {
        ng.d.j(sVar, "offset");
        return ((B().E() * 86400) + C().g0()) - sVar.v();
    }
}
