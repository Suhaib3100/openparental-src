package ng;

import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.k;
import org.threeten.bp.temporal.l;
import org.threeten.bp.temporal.n;

/* compiled from: DefaultInterfaceTemporalAccessor.java */
/* loaded from: classes9.dex */
public abstract class c implements f {
    @Override // org.threeten.bp.temporal.f
    public int get(j jVar) {
        return range(jVar).a(getLong(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public <R> R query(l<R> lVar) {
        if (lVar == k.g() || lVar == k.a() || lVar == k.e()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // org.threeten.bp.temporal.f
    public n range(j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.rangeRefinedBy(this);
        }
        if (isSupported(jVar)) {
            return jVar.range();
        }
        throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
    }
}
