package org.threeten.bp.chrono;

import java.util.Iterator;
import java.util.List;

/* compiled from: ChronoPeriod.java */
/* loaded from: classes9.dex */
public abstract class f implements org.threeten.bp.temporal.i {
    public static f e(c cVar, c cVar2) {
        ng.d.j(cVar, "startDateInclusive");
        ng.d.j(cVar2, "endDateExclusive");
        return cVar.G(cVar2);
    }

    @Override // org.threeten.bp.temporal.i
    public abstract org.threeten.bp.temporal.e a(org.threeten.bp.temporal.e eVar);

    @Override // org.threeten.bp.temporal.i
    public abstract org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar);

    @Override // org.threeten.bp.temporal.i
    public abstract long c(org.threeten.bp.temporal.m mVar);

    @Override // org.threeten.bp.temporal.i
    public abstract List<org.threeten.bp.temporal.m> d();

    public abstract boolean equals(Object obj);

    public abstract j f();

    public boolean g() {
        Iterator<org.threeten.bp.temporal.m> it = d().iterator();
        while (it.hasNext()) {
            if (c(it.next()) < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        Iterator<org.threeten.bp.temporal.m> it = d().iterator();
        while (it.hasNext()) {
            if (c(it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public abstract int hashCode();

    public abstract f i(org.threeten.bp.temporal.i iVar);

    public abstract f j(int i4);

    public f k() {
        return j(-1);
    }

    public abstract f l();

    public abstract f m(org.threeten.bp.temporal.i iVar);

    public abstract String toString();
}
