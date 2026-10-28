package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.ChronoException;

/* compiled from: EastAsianCY.java */
/* loaded from: classes7.dex */
class i implements net.time4j.format.v<g>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final i f82567b = new i();
    private static final long serialVersionUID = -4211396220263977858L;

    i() {
    }

    @Override // net.time4j.engine.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public g getDefaultMaximum() {
        return g.r(60);
    }

    @Override // net.time4j.engine.q
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public g getDefaultMinimum() {
        return g.r(1);
    }

    @Override // net.time4j.format.v
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return g.t(charSequence, parsePosition, (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), !((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isStrict());
    }

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        String str = net.time4j.format.b.f(locale).o().get(ProtectedSandApp.s("郹\u0001"));
        return str == null ? name() : str;
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return 'U';
    }

    @Override // net.time4j.engine.q
    public Class<g> getType() {
        return g.class;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.q
    public String name() {
        return ProtectedSandApp.s("郺\u0001");
    }

    @Override // net.time4j.format.v
    public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
        appendable.append(((g) pVar.r(this)).g((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)));
    }

    protected Object readResolve() throws ObjectStreamException {
        return f82567b;
    }

    @Override // java.util.Comparator
    public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
        return ((g) pVar.r(this)).compareTo((m0) pVar2.r(this));
    }
}
