package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* compiled from: IntegerTimeElement.java */
/* loaded from: classes7.dex */
final class w extends b<Integer> implements q0<Integer, m0> {

    /* renamed from: j, reason: collision with root package name */
    static final int f83688j = 1;

    /* renamed from: k, reason: collision with root package name */
    static final int f83689k = 2;

    /* renamed from: l, reason: collision with root package name */
    static final int f83690l = 3;

    /* renamed from: m, reason: collision with root package name */
    static final int f83691m = 4;

    /* renamed from: n, reason: collision with root package name */
    static final int f83692n = 5;

    /* renamed from: o, reason: collision with root package name */
    static final int f83693o = 6;

    /* renamed from: p, reason: collision with root package name */
    static final int f83694p = 7;

    /* renamed from: q, reason: collision with root package name */
    static final int f83695q = 8;

    /* renamed from: r, reason: collision with root package name */
    static final int f83696r = 9;

    /* renamed from: s, reason: collision with root package name */
    static final int f83697s = 10;
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: t, reason: collision with root package name */
    static final int f83698t = 11;

    /* renamed from: u, reason: collision with root package name */
    static final int f83699u = 12;

    /* renamed from: v, reason: collision with root package name */
    static final int f83700v = 13;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f83701e;

    /* renamed from: f, reason: collision with root package name */
    private final transient Integer f83702f;

    /* renamed from: g, reason: collision with root package name */
    private final transient Integer f83703g;

    /* renamed from: h, reason: collision with root package name */
    private final transient char f83704h;

    /* renamed from: i, reason: collision with root package name */
    private final transient net.time4j.engine.t<net.time4j.engine.r<?>, BigDecimal> f83705i;

    private w(String str, int i4, Integer num, Integer num2, char c5) {
        super(str);
        this.f83701e = i4;
        this.f83702f = num;
        this.f83703g = num2;
        this.f83704h = c5;
        this.f83705i = new r0(this, i4 == 5 || i4 == 7 || i4 == 9 || i4 == 13);
    }

    static w B(String str, boolean z4) {
        return new w(str, z4 ? 2 : 1, 1, Integer.valueOf(z4 ? 24 : 12), z4 ? 'k' : 'h');
    }

    static w C(String str, int i4, int i5, int i6, char c5) {
        return new w(str, i4, Integer.valueOf(i5), Integer.valueOf(i6), c5);
    }

    private Object readResolve() throws ObjectStreamException {
        Object W0 = m0.W0(name());
        if (W0 != null) {
            return W0;
        }
        throw new InvalidObjectException(name());
    }

    public Integer D() {
        return this.f83703g;
    }

    public Integer E() {
        return this.f83702f;
    }

    int F() {
        return this.f83701e;
    }

    @Override // net.time4j.q0
    public net.time4j.engine.v<m0> Q(int i4) {
        return new t0(this, Boolean.FALSE, i4);
    }

    @Override // net.time4j.q0
    public /* bridge */ /* synthetic */ q<m0> d0(Integer num) {
        return z(num);
    }

    @Override // net.time4j.q0
    public net.time4j.engine.v<m0> g0(int i4) {
        return new t0(this, null, i4);
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return this.f83703g;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return this.f83702f;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public char getSymbol() {
        return this.f83704h;
    }

    @Override // net.time4j.engine.q
    public Class<Integer> getType() {
        return Integer.class;
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
        return this.f83705i;
    }

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }
}
