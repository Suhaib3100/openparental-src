package org.threeten.bp.chrono;

import java.util.Comparator;
import org.threeten.bp.DateTimeException;

/* compiled from: ChronoLocalDate.java */
/* loaded from: classes9.dex */
public abstract class c extends ng.b implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<c> {

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<c> f87946b = new a();

    /* compiled from: ChronoLocalDate.java */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return ng.d.b(cVar.E(), cVar2.E());
        }
    }

    public static Comparator<c> C() {
        return f87946b;
    }

    public static c o(org.threeten.bp.temporal.f fVar) {
        ng.d.j(fVar, "temporal");
        if (fVar instanceof c) {
            return (c) fVar;
        }
        j jVar = (j) fVar.query(org.threeten.bp.temporal.k.a());
        if (jVar != null) {
            return jVar.d(fVar);
        }
        throw new DateTimeException("No Chronology found to create ChronoLocalDate: " + fVar.getClass());
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public abstract c v(long j4, org.threeten.bp.temporal.m mVar);

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public c g(org.threeten.bp.temporal.i iVar) {
        return p().k(iVar.b(this));
    }

    public long E() {
        return getLong(org.threeten.bp.temporal.a.EPOCH_DAY);
    }

    public abstract f G(c cVar);

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: J */
    public c i(org.threeten.bp.temporal.g gVar) {
        return p().k(gVar.adjustInto(this));
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: K */
    public abstract c b(org.threeten.bp.temporal.j jVar, long j4);

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.EPOCH_DAY, E());
    }

    @Override // org.threeten.bp.temporal.e
    public boolean d(org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? mVar.isDateBased() : mVar != null && mVar.isSupportedBy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public int hashCode() {
        long E = E();
        return ((int) (E ^ (E >>> 32))) ^ p().hashCode();
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar.isDateBased() : jVar != null && jVar.isSupportedBy(this);
    }

    public d<?> l(org.threeten.bp.i iVar) {
        return e.J(this, iVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: m */
    public int compareTo(c cVar) {
        int b5 = ng.d.b(E(), cVar.E());
        return b5 == 0 ? p().compareTo(cVar.p()) : b5;
    }

    public String n(org.threeten.bp.format.c cVar) {
        ng.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public abstract j p();

    public k q() {
        return p().n(get(org.threeten.bp.temporal.a.ERA));
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) p();
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.DAYS;
        }
        if (lVar == org.threeten.bp.temporal.k.b()) {
            return (R) org.threeten.bp.g.z0(E());
        }
        if (lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return (R) super.query(lVar);
    }

    public boolean r(c cVar) {
        return E() > cVar.E();
    }

    public boolean s(c cVar) {
        return E() < cVar.E();
    }

    public boolean t(c cVar) {
        return E() == cVar.E();
    }

    public String toString() {
        long j4 = getLong(org.threeten.bp.temporal.a.YEAR_OF_ERA);
        long j5 = getLong(org.threeten.bp.temporal.a.MONTH_OF_YEAR);
        long j6 = getLong(org.threeten.bp.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(p().toString());
        sb.append(" ");
        sb.append(q());
        sb.append(" ");
        sb.append(j4);
        sb.append(j5 < 10 ? "-0" : "-");
        sb.append(j5);
        sb.append(j6 < 10 ? "-0" : "-");
        sb.append(j6);
        return sb.toString();
    }

    public boolean u() {
        return p().v(getLong(org.threeten.bp.temporal.a.YEAR));
    }

    public abstract int v();

    public int w() {
        return u() ? 366 : 365;
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public c t(long j4, org.threeten.bp.temporal.m mVar) {
        return p().k(super.t(j4, mVar));
    }

    @Override // ng.b, org.threeten.bp.temporal.e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public c c(org.threeten.bp.temporal.i iVar) {
        return p().k(iVar.a(this));
    }
}
