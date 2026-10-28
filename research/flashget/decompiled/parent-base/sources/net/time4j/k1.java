package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.format.a;

/* compiled from: ZonalClock.java */
/* loaded from: classes7.dex */
public final class k1 {

    /* renamed from: c, reason: collision with root package name */
    private static final k1 f83311c = new k1();

    /* renamed from: a, reason: collision with root package name */
    private final net.time4j.base.e<?> f83312a;

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.tz.l f83313b;

    public k1(net.time4j.base.e<?> eVar, net.time4j.tz.k kVar) {
        this(eVar, net.time4j.tz.l.c0(kVar));
    }

    static k1 g() {
        return f83311c;
    }

    public net.time4j.base.e<?> a() {
        return this.f83312a;
    }

    public net.time4j.tz.k b() {
        net.time4j.tz.l lVar = this.f83313b;
        if (lVar == null) {
            lVar = net.time4j.tz.l.e0();
        }
        return lVar.G();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [net.time4j.base.f] */
    public <C extends net.time4j.engine.m<C>> u<C> c(net.time4j.engine.k<C> kVar, String str, net.time4j.engine.g0 g0Var) {
        net.time4j.tz.l lVar = this.f83313b;
        if (lVar == null) {
            lVar = net.time4j.tz.l.e0();
        }
        return d0.y0(this.f83312a.c()).c1(kVar, str, lVar.G(), g0Var);
    }

    public <C extends net.time4j.engine.m<C>> u<C> d(net.time4j.engine.k<C> kVar, net.time4j.engine.q0 q0Var, net.time4j.engine.g0 g0Var) {
        return c(kVar, q0Var.getVariant(), g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [net.time4j.base.f] */
    public n0 e() {
        ?? c5 = this.f83312a.c();
        net.time4j.tz.l lVar = this.f83313b;
        net.time4j.tz.l lVar2 = lVar;
        if (lVar == null) {
            lVar2 = net.time4j.tz.l.e0();
        }
        return n0.j0(c5, lVar2.I(c5));
    }

    public <T extends net.time4j.engine.r<T>> T f(net.time4j.engine.x<T> xVar) {
        net.time4j.tz.l lVar = this.f83313b;
        if (lVar == null) {
            lVar = net.time4j.tz.l.e0();
        }
        T o4 = xVar.o(this.f83312a, new a.b().m(lVar.G()).a());
        if (o4 != null) {
            return o4;
        }
        Class<T> C = xVar.C();
        if (net.time4j.engine.m.class.isAssignableFrom(C)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鞍\u0001").concat(C.getName()));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鞎\u0001").concat(C.getName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [net.time4j.base.f] */
    public l0 h() {
        ?? c5 = this.f83312a.c();
        net.time4j.tz.l lVar = this.f83313b;
        net.time4j.tz.l lVar2 = lVar;
        if (lVar == null) {
            lVar2 = net.time4j.tz.l.e0();
        }
        return l0.Z0(c5, lVar2.I(c5));
    }

    public k1(net.time4j.base.e<?> eVar, String str) {
        this(eVar, net.time4j.tz.l.Z(str));
    }

    public k1(net.time4j.base.e<?> eVar, net.time4j.tz.l lVar) {
        if (eVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鞌\u0001"));
        }
        if (lVar != null) {
            this.f83312a = eVar;
            this.f83313b = lVar;
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("鞋\u0001"));
    }

    private k1() {
        this.f83312a = w0.f83710g;
        this.f83313b = null;
    }
}
