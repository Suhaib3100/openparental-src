package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import net.time4j.calendar.j;

/* compiled from: AbstractMergerEA.java */
/* loaded from: classes7.dex */
abstract class a<C extends j<?, C>> implements net.time4j.engine.u<C> {

    /* renamed from: b, reason: collision with root package name */
    private final Class<C> f82271b;

    a(Class<C> cls) {
        this.f82271b = cls;
    }

    @Override // net.time4j.engine.u
    public net.time4j.engine.g0 a() {
        return net.time4j.engine.g0.f82720a;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
    @Override // net.time4j.engine.u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
        net.time4j.tz.k G;
        net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
        if (dVar.c(cVar)) {
            G = (net.time4j.tz.k) dVar.a(cVar);
        } else {
            if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                return null;
            }
            G = net.time4j.tz.l.e0().G();
        }
        net.time4j.engine.g0 g0Var = (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a());
        return (C) net.time4j.d0.y0(eVar.c()).j1(G).U(g0Var.c(r4.k0(), G), net.time4j.j.SECONDS).k0().l0(this.f82271b);
    }

    @Override // net.time4j.engine.u
    /* renamed from: c */
    public abstract C e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5);

    @Override // net.time4j.engine.u
    public net.time4j.engine.x<?> d() {
        return null;
    }

    @Override // net.time4j.engine.u
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.p k(C c5, net.time4j.engine.d dVar) {
        return c5;
    }

    @Override // net.time4j.engine.u
    public int g() {
        return 100;
    }

    @Override // net.time4j.engine.u
    public String n(net.time4j.engine.z zVar, Locale locale) {
        return net.time4j.calendar.service.c.a(ProtectedSandApp.s("訛\u0001"), zVar, locale);
    }
}
