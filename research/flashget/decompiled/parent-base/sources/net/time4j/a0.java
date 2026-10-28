package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* compiled from: LongElement.java */
/* loaded from: classes7.dex */
final class a0 extends b<Long> implements q0<Long, m0> {

    /* renamed from: h, reason: collision with root package name */
    static final net.time4j.engine.q<Long> f81813h = new a0();
    private static final long serialVersionUID = 5930990958663061693L;

    /* renamed from: e, reason: collision with root package name */
    private final transient Long f81814e;

    /* renamed from: f, reason: collision with root package name */
    private final transient Long f81815f;

    /* renamed from: g, reason: collision with root package name */
    private final transient net.time4j.engine.t<net.time4j.engine.r<?>, BigDecimal> f81816g;

    private a0() {
        this(ProtectedSandApp.s("覈\u0001"), Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static a0 B(String str, long j4, long j5) {
        return new a0(str, j4, j5);
    }

    private Object readResolve() throws ObjectStreamException {
        Object W0 = m0.W0(name());
        if (W0 != null) {
            return W0;
        }
        if (name().equals(ProtectedSandApp.s("覈\u0001"))) {
            return f81813h;
        }
        throw new InvalidObjectException(name());
    }

    public Long C() {
        return this.f81815f;
    }

    public Long D() {
        return this.f81814e;
    }

    @Override // net.time4j.q0
    public net.time4j.engine.v<m0> Q(int i4) {
        return new t0(this, Boolean.FALSE, i4);
    }

    @Override // net.time4j.q0
    public /* bridge */ /* synthetic */ q<m0> d0(Long l4) {
        return z(l4);
    }

    @Override // net.time4j.q0
    public net.time4j.engine.v<m0> g0(int i4) {
        return new t0(this, null, i4);
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return this.f81815f;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return this.f81814e;
    }

    @Override // net.time4j.engine.q
    public Class<Long> getType() {
        return Long.class;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.q0
    public net.time4j.engine.v<m0> m0(int i4) {
        return new t0(this, Boolean.TRUE, i4);
    }

    @Override // net.time4j.q0
    public net.time4j.engine.t<net.time4j.engine.r<?>, BigDecimal> s() {
        return this.f81816g;
    }

    private a0(String str, long j4, long j5) {
        super(str);
        this.f81814e = Long.valueOf(j4);
        this.f81815f = Long.valueOf(j5);
        this.f81816g = new r0(this, true);
    }
}
