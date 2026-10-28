package net.time4j;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.ChronoException;

/* compiled from: EnumElement.java */
/* loaded from: classes7.dex */
final class r<V extends Enum<V>> extends a<V> implements f0<V>, net.time4j.format.l<V>, pe.e<V> {

    /* renamed from: j, reason: collision with root package name */
    static final int f83508j = 101;

    /* renamed from: k, reason: collision with root package name */
    static final int f83509k = 102;

    /* renamed from: l, reason: collision with root package name */
    static final int f83510l = 103;
    private static final long serialVersionUID = 2055272540517425102L;

    /* renamed from: e, reason: collision with root package name */
    private final transient Class<V> f83511e;

    /* renamed from: f, reason: collision with root package name */
    private final transient V f83512f;

    /* renamed from: g, reason: collision with root package name */
    private final transient V f83513g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f83514h;

    /* renamed from: i, reason: collision with root package name */
    private final transient char f83515i;

    r(String str, Class<V> cls, V v4, V v5, int i4, char c5) {
        super(str);
        this.f83511e = cls;
        this.f83512f = v4;
        this.f83513g = v5;
        this.f83514h = i4;
        this.f83515i = c5;
    }

    private net.time4j.format.u B(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        switch (this.f83514h) {
            case 101:
                return net.time4j.format.b.f(locale).n(xVar, mVar);
            case 102:
                return net.time4j.format.b.f(locale).r(xVar, mVar);
            case 103:
                return net.time4j.format.b.f(locale).m(xVar, mVar);
            default:
                throw new UnsupportedOperationException(name());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        Object n12 = l0.n1(name());
        if (n12 != null) {
            return n12;
        }
        throw new InvalidObjectException(name());
    }

    public V C() {
        return this.f83513g;
    }

    public V D() {
        return this.f83512f;
    }

    int E() {
        return this.f83514h;
    }

    @Override // net.time4j.format.l
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public int b0(V v4) {
        return v4.ordinal() + 1;
    }

    @Override // net.time4j.f0
    public q<l0> G(V v4) {
        return new h0(this, 11, v4);
    }

    @Override // pe.e
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public V parse(CharSequence charSequence, ParsePosition parsePosition, Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar, net.time4j.format.g gVar) {
        int index = parsePosition.getIndex();
        V v4 = (V) B(locale, xVar, mVar).e(charSequence, parsePosition, this.f83511e, gVar);
        if (v4 != null || gVar.isStrict()) {
            return v4;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        net.time4j.format.m mVar2 = net.time4j.format.m.FORMAT;
        if (mVar == mVar2) {
            mVar2 = net.time4j.format.m.STANDALONE;
        }
        return (V) B(locale, xVar, mVar2).e(charSequence, parsePosition, this.f83511e, gVar);
    }

    @Override // net.time4j.format.v
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public V parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        int index = parsePosition.getIndex();
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
        net.time4j.format.x xVar = (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
        net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f82786h;
        net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
        net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
        V v4 = (V) B(locale, xVar, mVar2).d(charSequence, parsePosition, this.f83511e, dVar);
        if (v4 != null || !((Boolean) dVar.b(net.time4j.format.a.f82789k, Boolean.TRUE)).booleanValue()) {
            return v4;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        if (mVar2 == mVar) {
            mVar = net.time4j.format.m.STANDALONE;
        }
        return (V) B(locale, xVar, mVar).d(charSequence, parsePosition, this.f83511e, dVar);
    }

    @Override // net.time4j.format.l
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public int w(V v4, net.time4j.engine.p pVar, net.time4j.engine.d dVar) {
        return v4.ordinal() + 1;
    }

    @Override // net.time4j.f0
    public q<l0> R(V v4) {
        return new h0(this, 12, v4);
    }

    @Override // net.time4j.f0
    public q<l0> V(V v4) {
        return new h0(this, 9, v4);
    }

    @Override // net.time4j.f0
    public q<l0> e0(V v4) {
        return new h0(this, 10, v4);
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return this.f83513g;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return this.f83512f;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public char getSymbol() {
        return this.f83515i;
    }

    @Override // net.time4j.engine.q
    public Class<V> getType() {
        return this.f83511e;
    }

    @Override // net.time4j.format.l
    public boolean i0(net.time4j.engine.r<?> rVar, int i4) {
        for (V v4 : this.f83511e.getEnumConstants()) {
            if (b0(v4) == i4) {
                rVar.M(this, v4);
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.format.v
    public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        appendable.append(B((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT)).g((Enum) pVar.r(this)));
    }

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }

    @Override // pe.e
    public void print(net.time4j.engine.p pVar, Appendable appendable, Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) throws IOException, ChronoException {
        appendable.append(B(locale, xVar, mVar).g((Enum) pVar.r(this)));
    }
}
