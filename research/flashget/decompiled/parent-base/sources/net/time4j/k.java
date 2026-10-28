package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;

/* compiled from: DateElement.java */
/* loaded from: classes7.dex */
final class k extends net.time4j.engine.e<l0> implements f {

    /* renamed from: b, reason: collision with root package name */
    static final k f83303b = new k();
    private static final long serialVersionUID = -6519899440006935829L;

    private k() {
        super(ProtectedSandApp.s("鞏\u0001"));
    }

    private Object readResolve() throws ObjectStreamException {
        return f83303b;
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, l0> at(net.time4j.tz.p pVar) {
        return new n1(this, pVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, l0> atUTC() {
        return new n1(this, net.time4j.tz.p.f83649l);
    }

    @Override // net.time4j.f
    public q<l0> f0() {
        return g.E;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return l0.f83316g;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return l0.f83315f;
    }

    @Override // net.time4j.engine.q
    public Class<l0> getType() {
        return l0.class;
    }

    @Override // net.time4j.f
    public q<l0> h0() {
        return g.F;
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, l0> in(net.time4j.tz.l lVar) {
        return new n1(this, lVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, l0> inStdTimezone() {
        return new n1(this, net.time4j.tz.l.e0());
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, l0> inTimezone(net.time4j.tz.k kVar) {
        return new n1(this, net.time4j.tz.l.c0(kVar));
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.f
    public q<l0> j0() {
        return g.C;
    }

    @Override // net.time4j.f
    public q<l0> n0() {
        return g.G;
    }

    @Override // net.time4j.f
    public q<l0> r() {
        return g.H;
    }

    @Override // net.time4j.f
    public q<l0> s0() {
        return g.D;
    }

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }

    public l0 y() {
        return l0.f83316g;
    }

    public l0 z() {
        return l0.f83315f;
    }
}
