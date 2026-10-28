package ng;

import java.util.Locale;
import org.threeten.bp.chrono.k;
import org.threeten.bp.format.n;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.j;
import org.threeten.bp.temporal.l;

/* compiled from: DefaultInterfaceEra.java */
/* loaded from: classes9.dex */
public abstract class a extends c implements k {
    @Override // org.threeten.bp.temporal.g
    public e adjustInto(e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.ERA, getValue());
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public int get(j jVar) {
        return jVar == org.threeten.bp.temporal.a.ERA ? getValue() : range(jVar).a(getLong(jVar), jVar);
    }

    @Override // org.threeten.bp.chrono.k
    public String getDisplayName(n nVar, Locale locale) {
        return new org.threeten.bp.format.d().r(org.threeten.bp.temporal.a.ERA, nVar).Q(locale).d(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(j jVar) {
        if (jVar == org.threeten.bp.temporal.a.ERA) {
            return getValue();
        }
        if (jVar instanceof org.threeten.bp.temporal.a) {
            throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }
        return jVar.getFrom(this);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.ERA : jVar != null && jVar.isSupportedBy(this);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.ERAS;
        }
        if (lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d() || lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c()) {
            return null;
        }
        return lVar.a(this);
    }
}
