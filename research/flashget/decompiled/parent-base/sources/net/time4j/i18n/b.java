package net.time4j.i18n;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.Set;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.engine.s;
import net.time4j.history.j;
import net.time4j.history.p;
import net.time4j.l0;

/* compiled from: HistoricExtension.java */
/* loaded from: classes7.dex */
public class b implements s {
    private static net.time4j.history.d e(Locale locale, net.time4j.engine.d dVar) {
        net.time4j.engine.c<String> cVar = net.time4j.format.a.f82780b;
        String s4 = ProtectedSandApp.s("霉\u0001");
        if (((String) dVar.b(cVar, s4)).equals(ProtectedSandApp.s("霊\u0001"))) {
            return net.time4j.history.d.f83160s;
        }
        net.time4j.engine.c<net.time4j.history.d> cVar2 = net.time4j.history.internal.a.f83203a;
        if (dVar.c(cVar2)) {
            return (net.time4j.history.d) dVar.a(cVar2);
        }
        if (((String) dVar.b(cVar, s4)).equals(ProtectedSandApp.s("霋\u0001"))) {
            net.time4j.engine.c<String> cVar3 = net.time4j.format.a.f82798t;
            if (dVar.c(cVar3)) {
                return net.time4j.history.d.j((String) dVar.a(cVar3));
            }
        }
        return net.time4j.history.d.C(locale);
    }

    @Override // net.time4j.engine.s
    public r<?> a(r<?> rVar, Locale locale, net.time4j.engine.d dVar) {
        return f(rVar, e(locale, dVar), dVar);
    }

    @Override // net.time4j.engine.s
    public Set<q<?>> b(Locale locale, net.time4j.engine.d dVar) {
        return e(locale, dVar).n();
    }

    @Override // net.time4j.engine.s
    public boolean c(q<?> qVar) {
        return qVar instanceof net.time4j.history.internal.c;
    }

    @Override // net.time4j.engine.s
    public boolean d(Class<?> cls) {
        return cls == l0.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [net.time4j.engine.r, net.time4j.engine.r<?>] */
    /* JADX WARN: Type inference failed for: r9v2, types: [net.time4j.engine.r, net.time4j.engine.r<?>] */
    public r<?> f(r<?> rVar, net.time4j.history.d dVar, net.time4j.engine.d dVar2) {
        j jVar;
        j jVar2;
        if (rVar.w(dVar.i())) {
            jVar2 = (j) rVar.r(dVar.i());
        } else {
            if (!((net.time4j.format.g) dVar2.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                jVar = null;
                if (jVar == null && rVar.w(dVar.L())) {
                    int l4 = rVar.l(dVar.L());
                    if (rVar.w(dVar.B()) && rVar.w(dVar.g())) {
                        l0 d5 = dVar.d(net.time4j.history.h.h(jVar, l4, rVar.l(dVar.B()), rVar.l(dVar.g()), (p) dVar2.b(net.time4j.history.d.f83158q, p.DUAL_DATING), dVar.v()));
                        rVar.M(dVar.i(), null);
                        rVar.M(dVar.L(), null);
                        rVar.M(dVar.B(), null);
                        rVar.M(dVar.g(), null);
                        return rVar.M(l0.f83326q, d5);
                    }
                    if (!rVar.w(dVar.h())) {
                        return rVar;
                    }
                    int l5 = rVar.l(dVar.h());
                    q<Integer> qVar = net.time4j.history.internal.c.f83207f;
                    if (rVar.w(qVar)) {
                        l4 = rVar.l(qVar);
                    }
                    return rVar.M(l0.f83326q, (l0) dVar.d(dVar.m(jVar, l4)).K(dVar.h(), l5));
                }
            }
            jVar2 = j.AD;
        }
        jVar = jVar2;
        return jVar == null ? rVar : rVar;
    }
}
