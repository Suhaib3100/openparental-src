package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* compiled from: DecimalTimeElement.java */
/* loaded from: classes7.dex */
final class o extends net.time4j.engine.e<BigDecimal> implements m1<BigDecimal> {
    private static final long serialVersionUID = -4837430960549551204L;

    /* renamed from: b, reason: collision with root package name */
    private final transient BigDecimal f83419b;

    o(String str, BigDecimal bigDecimal) {
        super(str);
        this.f83419b = bigDecimal;
    }

    private Object readResolve() throws ObjectStreamException {
        Object W0 = m0.W0(name());
        if (W0 != null) {
            return W0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, BigDecimal> at(net.time4j.tz.p pVar) {
        return new n1(this, pVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, BigDecimal> atUTC() {
        return new n1(this, net.time4j.tz.p.f83649l);
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return this.f83419b;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return BigDecimal.ZERO;
    }

    @Override // net.time4j.engine.q
    public Class<BigDecimal> getType() {
        return BigDecimal.class;
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, BigDecimal> in(net.time4j.tz.l lVar) {
        return new n1(this, lVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, BigDecimal> inStdTimezone() {
        return new n1(this, net.time4j.tz.l.e0());
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, BigDecimal> inTimezone(net.time4j.tz.k kVar) {
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

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }

    public BigDecimal y() {
        return this.f83419b;
    }

    public BigDecimal z() {
        return BigDecimal.ZERO;
    }
}
