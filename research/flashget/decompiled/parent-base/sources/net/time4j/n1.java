package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ZonalQuery.java */
/* loaded from: classes7.dex */
class n1<V> implements net.time4j.engine.t<d0, V> {

    /* renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.q<V> f83416a;

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.tz.l f83417b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.tz.p f83418c;

    n1(net.time4j.engine.q<V> qVar, net.time4j.tz.l lVar) {
        if (lVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("韶\u0001"));
        }
        this.f83416a = qVar;
        this.f83417b = lVar;
        this.f83418c = null;
    }

    @Override // net.time4j.engine.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public V apply(d0 d0Var) {
        net.time4j.tz.p pVar = this.f83418c;
        if (pVar == null) {
            pVar = this.f83417b.I(d0Var);
        }
        return (this.f83416a == m0.C && d0Var.n() && pVar.h() == 0 && pVar.g() % 60 == 0) ? this.f83416a.getType().cast(60) : (V) n0.j0(d0Var, pVar).r(this.f83416a);
    }

    n1(net.time4j.engine.q<V> qVar, net.time4j.tz.p pVar) {
        if (pVar != null) {
            this.f83416a = qVar;
            this.f83417b = null;
            this.f83418c = pVar;
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("韷\u0001"));
    }
}
