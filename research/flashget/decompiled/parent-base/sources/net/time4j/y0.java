package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;

/* compiled from: TimeElement.java */
/* loaded from: classes7.dex */
final class y0 extends net.time4j.engine.e<m0> implements c1 {

    /* renamed from: b, reason: collision with root package name */
    static final y0 f83720b = new y0();
    private static final long serialVersionUID = -3712256393866098916L;

    private y0() {
        super(ProtectedSandApp.s("鸆\u0001"));
    }

    private Object readResolve() throws ObjectStreamException {
        return f83720b;
    }

    @Override // net.time4j.c1
    public q<m0> L() {
        return t.D;
    }

    @Override // net.time4j.c1
    public q<?> W(m0 m0Var) {
        return new d1(9, m0Var);
    }

    @Override // net.time4j.c1
    public q<?> X(m0 m0Var) {
        return new d1(10, m0Var);
    }

    @Override // net.time4j.c1
    public q<m0> Z() {
        return t.C;
    }

    @Override // net.time4j.c1
    public q<?> a0(m0 m0Var) {
        return new d1(12, m0Var);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, m0> at(net.time4j.tz.p pVar) {
        return new n1(this, pVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, m0> atUTC() {
        return new n1(this, net.time4j.tz.p.f83649l);
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return m0.f83366q;
    }

    @Override // net.time4j.engine.q
    public Class<m0> getType() {
        return m0.class;
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, m0> in(net.time4j.tz.l lVar) {
        return new n1(this, lVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, m0> inStdTimezone() {
        return new n1(this, net.time4j.tz.l.e0());
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, m0> inTimezone(net.time4j.tz.k kVar) {
        return new n1(this, net.time4j.tz.l.c0(kVar));
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.c1
    public q<?> p(m0 m0Var) {
        return new d1(11, m0Var);
    }

    @Override // net.time4j.c1
    public q<m0> q() {
        return t.E;
    }

    @Override // net.time4j.c1
    public q<m0> r0() {
        return t.F;
    }

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }

    @Override // net.time4j.engine.q
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public m0 getDefaultMaximum() {
        return m0.d1(23, 59, 59, 999999999);
    }

    public m0 z() {
        return m0.f83366q;
    }
}
