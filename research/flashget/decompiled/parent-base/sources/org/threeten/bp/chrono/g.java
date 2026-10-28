package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: ChronoPeriodImpl.java */
/* loaded from: classes9.dex */
final class g extends f implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final long f87964f = 275618735781L;

    /* renamed from: b, reason: collision with root package name */
    private final j f87965b;

    /* renamed from: c, reason: collision with root package name */
    private final int f87966c;

    /* renamed from: d, reason: collision with root package name */
    private final int f87967d;

    /* renamed from: e, reason: collision with root package name */
    private final int f87968e;

    public g(j jVar, int i4, int i5, int i6) {
        this.f87965b = jVar;
        this.f87966c = i4;
        this.f87967d = i5;
        this.f87968e = i6;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e a(org.threeten.bp.temporal.e eVar) {
        ng.d.j(eVar, "temporal");
        j jVar = (j) eVar.query(org.threeten.bp.temporal.k.a());
        if (jVar != null && !this.f87965b.equals(jVar)) {
            throw new DateTimeException("Invalid chronology, required: " + this.f87965b.t() + ", but was: " + jVar.t());
        }
        int i4 = this.f87966c;
        if (i4 != 0) {
            eVar = eVar.t(i4, org.threeten.bp.temporal.b.YEARS);
        }
        int i5 = this.f87967d;
        if (i5 != 0) {
            eVar = eVar.t(i5, org.threeten.bp.temporal.b.MONTHS);
        }
        int i6 = this.f87968e;
        return i6 != 0 ? eVar.t(i6, org.threeten.bp.temporal.b.DAYS) : eVar;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        ng.d.j(eVar, "temporal");
        j jVar = (j) eVar.query(org.threeten.bp.temporal.k.a());
        if (jVar != null && !this.f87965b.equals(jVar)) {
            throw new DateTimeException("Invalid chronology, required: " + this.f87965b.t() + ", but was: " + jVar.t());
        }
        int i4 = this.f87966c;
        if (i4 != 0) {
            eVar = eVar.v(i4, org.threeten.bp.temporal.b.YEARS);
        }
        int i5 = this.f87967d;
        if (i5 != 0) {
            eVar = eVar.v(i5, org.threeten.bp.temporal.b.MONTHS);
        }
        int i6 = this.f87968e;
        return i6 != 0 ? eVar.v(i6, org.threeten.bp.temporal.b.DAYS) : eVar;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public long c(org.threeten.bp.temporal.m mVar) {
        int i4;
        if (mVar == org.threeten.bp.temporal.b.YEARS) {
            i4 = this.f87966c;
        } else if (mVar == org.threeten.bp.temporal.b.MONTHS) {
            i4 = this.f87967d;
        } else {
            if (mVar != org.threeten.bp.temporal.b.DAYS) {
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + mVar);
            }
            i4 = this.f87968e;
        }
        return i4;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public List<org.threeten.bp.temporal.m> d() {
        return Collections.unmodifiableList(Arrays.asList(org.threeten.bp.temporal.b.YEARS, org.threeten.bp.temporal.b.MONTHS, org.threeten.bp.temporal.b.DAYS));
    }

    @Override // org.threeten.bp.chrono.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f87966c == gVar.f87966c && this.f87967d == gVar.f87967d && this.f87968e == gVar.f87968e && this.f87965b.equals(gVar.f87965b);
    }

    @Override // org.threeten.bp.chrono.f
    public j f() {
        return this.f87965b;
    }

    @Override // org.threeten.bp.chrono.f
    public int hashCode() {
        return Integer.rotateLeft(this.f87967d, 8) + Integer.rotateLeft(this.f87966c, 16) + this.f87965b.hashCode() + this.f87968e;
    }

    @Override // org.threeten.bp.chrono.f
    public f i(org.threeten.bp.temporal.i iVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.f87965b.equals(this.f87965b)) {
                return new g(this.f87965b, ng.d.p(this.f87966c, gVar.f87966c), ng.d.p(this.f87967d, gVar.f87967d), ng.d.p(this.f87968e, gVar.f87968e));
            }
        }
        throw new DateTimeException("Unable to subtract amount: " + iVar);
    }

    @Override // org.threeten.bp.chrono.f
    public f j(int i4) {
        return new g(this.f87965b, ng.d.m(this.f87966c, i4), ng.d.m(this.f87967d, i4), ng.d.m(this.f87968e, i4));
    }

    @Override // org.threeten.bp.chrono.f
    public f l() {
        j jVar = this.f87965b;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.MONTH_OF_YEAR;
        if (!jVar.B(aVar).g()) {
            return this;
        }
        long d5 = (this.f87965b.B(aVar).d() - this.f87965b.B(aVar).e()) + 1;
        long j4 = (this.f87966c * d5) + this.f87967d;
        return new g(this.f87965b, ng.d.r(j4 / d5), ng.d.r(j4 % d5), this.f87968e);
    }

    @Override // org.threeten.bp.chrono.f
    public f m(org.threeten.bp.temporal.i iVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.f87965b.equals(this.f87965b)) {
                return new g(this.f87965b, ng.d.k(this.f87966c, gVar.f87966c), ng.d.k(this.f87967d, gVar.f87967d), ng.d.k(this.f87968e, gVar.f87968e));
            }
        }
        throw new DateTimeException("Unable to add amount: " + iVar);
    }

    @Override // org.threeten.bp.chrono.f
    public String toString() {
        if (h()) {
            return this.f87965b + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f87965b);
        sb.append(" P");
        int i4 = this.f87966c;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('Y');
        }
        int i5 = this.f87967d;
        if (i5 != 0) {
            sb.append(i5);
            sb.append('M');
        }
        int i6 = this.f87968e;
        if (i6 != 0) {
            sb.append(i6);
            sb.append('D');
        }
        return sb.toString();
    }
}
