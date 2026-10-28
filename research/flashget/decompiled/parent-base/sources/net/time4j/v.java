package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* compiled from: IntegerDateElement.java */
/* loaded from: classes7.dex */
final class v extends a<Integer> implements q0<Integer, l0> {

    /* renamed from: j, reason: collision with root package name */
    static final int f83673j = 14;

    /* renamed from: k, reason: collision with root package name */
    static final int f83674k = 15;

    /* renamed from: l, reason: collision with root package name */
    static final int f83675l = 16;

    /* renamed from: m, reason: collision with root package name */
    static final int f83676m = 17;

    /* renamed from: n, reason: collision with root package name */
    static final int f83677n = 18;
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f83678e;

    /* renamed from: f, reason: collision with root package name */
    private final transient Integer f83679f;

    /* renamed from: g, reason: collision with root package name */
    private final transient Integer f83680g;

    /* renamed from: h, reason: collision with root package name */
    private final transient char f83681h;

    /* renamed from: i, reason: collision with root package name */
    private final transient net.time4j.engine.t<net.time4j.engine.r<?>, BigDecimal> f83682i;

    private v(String str, int i4, Integer num, Integer num2, char c5) {
        super(str);
        this.f83678e = i4;
        this.f83679f = num;
        this.f83680g = num2;
        this.f83681h = c5;
        this.f83682i = new r0(this, false);
    }

    static v B(String str, int i4, int i5, int i6, char c5) {
        return new v(str, i4, Integer.valueOf(i5), Integer.valueOf(i6), c5);
    }

    private Object readResolve() throws ObjectStreamException {
        Object n12 = l0.n1(name());
        if (n12 != null) {
            return n12;
        }
        throw new InvalidObjectException(name());
    }

    public Integer C() {
        return this.f83680g;
    }

    public Integer D() {
        return this.f83679f;
    }

    int E() {
        return this.f83678e;
    }

    @Override // net.time4j.q0
    public net.time4j.engine.v<l0> Q(int i4) {
        return new t0(this, Boolean.FALSE, i4);
    }

    @Override // net.time4j.q0
    public /* bridge */ /* synthetic */ q<l0> d0(Integer num) {
        return z(num);
    }

    @Override // net.time4j.q0
    public net.time4j.engine.v<l0> g0(int i4) {
        return new t0(this, null, i4);
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return this.f83680g;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return this.f83679f;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public char getSymbol() {
        return this.f83681h;
    }

    @Override // net.time4j.engine.q
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.q0
    public net.time4j.engine.v<l0> m0(int i4) {
        return new t0(this, Boolean.TRUE, i4);
    }

    @Override // net.time4j.q0
    public net.time4j.engine.t<net.time4j.engine.r<?>, BigDecimal> s() {
        return this.f83682i;
    }

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }
}
