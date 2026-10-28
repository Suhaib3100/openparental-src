package ng;

import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.i;
import org.threeten.bp.temporal.m;

/* compiled from: DefaultInterfaceTemporal.java */
/* loaded from: classes9.dex */
public abstract class b extends c implements e {
    @Override // org.threeten.bp.temporal.e
    public e c(i iVar) {
        return iVar.a(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* renamed from: e */
    public e y(long j4, m mVar) {
        return j4 == Long.MIN_VALUE ? k(Long.MAX_VALUE, mVar).k(1L, mVar) : k(-j4, mVar);
    }

    @Override // org.threeten.bp.temporal.e
    public e g(i iVar) {
        return iVar.b(this);
    }

    @Override // org.threeten.bp.temporal.e
    public e i(g gVar) {
        return gVar.adjustInto(this);
    }
}
