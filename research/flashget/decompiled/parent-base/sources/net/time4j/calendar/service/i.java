package net.time4j.calendar.service;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.p;
import net.time4j.engine.r;
import net.time4j.format.m;
import net.time4j.format.u;
import net.time4j.format.v;
import net.time4j.format.x;

/* compiled from: StdEnumDateElement.java */
/* loaded from: classes7.dex */
public class i<V extends Enum<V>, T extends r<T>> extends h<V, T> implements net.time4j.format.l<V>, v<V> {
    private static final long serialVersionUID = -2452569351302286113L;

    /* renamed from: e, reason: collision with root package name */
    private final transient Class<V> f82648e;

    /* renamed from: f, reason: collision with root package name */
    private final transient String f82649f;

    /* renamed from: g, reason: collision with root package name */
    private final transient net.time4j.engine.v<T> f82650g;

    /* renamed from: h, reason: collision with root package name */
    private final transient net.time4j.engine.v<T> f82651h;

    public i(String str, Class<T> cls, Class<V> cls2, char c5) {
        super(str, cls, c5, K(c5));
        this.f82648e = cls2;
        this.f82649f = B(cls);
        this.f82650g = null;
        this.f82651h = null;
    }

    private static String B(Class<?> cls) {
        net.time4j.format.c cVar = (net.time4j.format.c) cls.getAnnotation(net.time4j.format.c.class);
        return cVar == null ? ProtectedSandApp.s("誄\u0001") : cVar.value();
    }

    private static boolean K(char c5) {
        return c5 == 'E';
    }

    protected String C(net.time4j.engine.d dVar) {
        return (I() || H()) ? (String) dVar.b(net.time4j.format.a.f82780b, this.f82649f) : J() ? ProtectedSandApp.s("誄\u0001") : this.f82649f;
    }

    @Override // net.time4j.engine.q
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public V getDefaultMaximum() {
        return this.f82648e.getEnumConstants()[r0.length - 1];
    }

    @Override // net.time4j.engine.q
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public V getDefaultMinimum() {
        return this.f82648e.getEnumConstants()[0];
    }

    protected boolean F(p pVar) {
        return false;
    }

    protected boolean H() {
        return getSymbol() == 'G';
    }

    protected boolean I() {
        return getSymbol() == 'M';
    }

    protected boolean J() {
        return K(getSymbol());
    }

    @Override // net.time4j.format.l
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public int b0(V v4) {
        return v4.ordinal() + 1;
    }

    @Override // net.time4j.format.v
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public V parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        int index = parsePosition.getIndex();
        net.time4j.engine.c<m> cVar = net.time4j.format.a.f82786h;
        m mVar = m.FORMAT;
        m mVar2 = (m) dVar.b(cVar, mVar);
        V v4 = (V) z(dVar, mVar2, false).d(charSequence, parsePosition, getType(), dVar);
        if (v4 == null && I()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            v4 = (V) z(dVar, mVar2, true).d(charSequence, parsePosition, getType(), dVar);
        }
        if (v4 != null || !((Boolean) dVar.b(net.time4j.format.a.f82789k, Boolean.TRUE)).booleanValue()) {
            return v4;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        if (mVar2 == mVar) {
            mVar = m.STANDALONE;
        }
        V v5 = (V) z(dVar, mVar, false).d(charSequence, parsePosition, getType(), dVar);
        if (v5 != null || !I()) {
            return v5;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        return (V) z(dVar, mVar, true).d(charSequence, parsePosition, getType(), dVar);
    }

    @Override // net.time4j.format.l
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public int w(V v4, p pVar, net.time4j.engine.d dVar) {
        return b0(v4);
    }

    @Override // net.time4j.calendar.service.h, net.time4j.calendar.o0
    public net.time4j.engine.v<T> f() {
        net.time4j.engine.v<T> vVar = this.f82651h;
        return vVar != null ? vVar : super.f();
    }

    @Override // net.time4j.engine.q
    public Class<V> getType() {
        return this.f82648e;
    }

    public boolean i0(r<?> rVar, int i4) {
        for (V v4 : getType().getEnumConstants()) {
            if (b0(v4) == i4) {
                rVar.M(this, v4);
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.calendar.service.h, net.time4j.calendar.o0
    public net.time4j.engine.v<T> l() {
        net.time4j.engine.v<T> vVar = this.f82650g;
        return vVar != null ? vVar : super.l();
    }

    public void print(p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        appendable.append(z(dVar, (m) dVar.b(net.time4j.format.a.f82786h, m.FORMAT), F(pVar)).g((Enum) pVar.r(this)));
    }

    protected u z(net.time4j.engine.d dVar, m mVar, boolean z4) {
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
        x xVar = (x) dVar.b(net.time4j.format.a.f82785g, x.WIDE);
        net.time4j.format.b d5 = net.time4j.format.b.d(C(dVar), locale);
        return I() ? z4 ? d5.i(xVar, mVar) : d5.n(xVar, mVar) : J() ? d5.r(xVar, mVar) : H() ? d5.c(xVar) : d5.p(name(), this.f82648e, new String[0]);
    }

    public i(String str, Class<T> cls, Class<V> cls2, char c5, String str2) {
        super(str, cls, c5, K(c5));
        this.f82648e = cls2;
        this.f82649f = str2;
        this.f82650g = null;
        this.f82651h = null;
    }

    public i(String str, Class<T> cls, Class<V> cls2, char c5, net.time4j.engine.v<T> vVar, net.time4j.engine.v<T> vVar2) {
        super(str, cls, c5, false);
        this.f82648e = cls2;
        this.f82649f = B(cls);
        this.f82650g = vVar;
        this.f82651h = vVar2;
    }
}
