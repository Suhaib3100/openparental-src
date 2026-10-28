package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.calendar.j;
import net.time4j.engine.ChronoException;

/* compiled from: EastAsianST.java */
/* loaded from: classes7.dex */
class m<D extends j<?, D>> implements net.time4j.format.v<n0>, net.time4j.engine.a0<D, n0>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final m f82597b = new m();
    private static final long serialVersionUID = 4572549754637955194L;

    m() {
    }

    static <D extends j<?, D>> m<D> t() {
        return f82597b;
    }

    @Override // net.time4j.engine.a0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean j(D d5, n0 n0Var) {
        return n0Var != null;
    }

    @Override // net.time4j.format.v
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public n0 parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
        int length = charSequence.length();
        if (parsePosition.getIndex() < length) {
            return n0.parse(charSequence, locale, parsePosition);
        }
        parsePosition.setErrorIndex(length);
        return null;
    }

    @Override // net.time4j.engine.a0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public D withValue(D d5, n0 n0Var, boolean z4) {
        if (n0Var != null) {
            return (D) d5.N(n0Var.sinceNewYear());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鄾\u0001"));
    }

    @Override // net.time4j.engine.a0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.q<?> getChildAtCeiling(D d5) {
        throw new AbstractMethodError();
    }

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        String language = locale.getLanguage();
        return language.equals(ProtectedSandApp.s("鄿\u0001")) ? locale.getCountry().equals(ProtectedSandApp.s("酀\u0001")) ? ProtectedSandApp.s("酁\u0001") : ProtectedSandApp.s("酂\u0001") : language.equals(ProtectedSandApp.s("酃\u0001")) ? ProtectedSandApp.s("酄\u0001") : language.equals(ProtectedSandApp.s("酅\u0001")) ? ProtectedSandApp.s("酆\u0001") : language.equals(ProtectedSandApp.s("酇\u0001")) ? ProtectedSandApp.s("酈\u0001") : language.isEmpty() ? ProtectedSandApp.s("酉\u0001") : ProtectedSandApp.s("酊\u0001");
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.q
    public Class<n0> getType() {
        return n0.class;
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

    @Override // net.time4j.engine.a0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.q<?> getChildAtFloor(D d5) {
        throw new AbstractMethodError();
    }

    @Override // net.time4j.engine.q
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public n0 getDefaultMaximum() {
        return n0.MAJOR_12_DAHAN_300;
    }

    @Override // net.time4j.engine.q
    public String name() {
        return ProtectedSandApp.s("酋\u0001");
    }

    @Override // net.time4j.engine.q
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public n0 getDefaultMinimum() {
        return n0.MINOR_01_LICHUN_315;
    }

    @Override // net.time4j.format.v
    public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
        appendable.append(((n0) pVar.r(this)).getDisplayName((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)));
    }

    protected Object readResolve() throws ObjectStreamException {
        return f82597b;
    }

    @Override // net.time4j.engine.a0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public n0 getMaximum(D d5) {
        h p02 = d5.p0();
        return n0.of(p02.s(p02.v(d5.r0(), d5.G0().getNumber()) + d5.K0()));
    }

    @Override // net.time4j.engine.a0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public n0 getMinimum(D d5) {
        h p02 = d5.p0();
        return n0.of(p02.s(p02.v(d5.r0(), d5.G0().getNumber()) + 1));
    }

    @Override // net.time4j.engine.a0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public n0 getValue(D d5) {
        return n0.of(d5.p0().s(d5.b() + 1));
    }

    @Override // java.util.Comparator
    public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
        return ((n0) pVar.r(this)).compareTo((n0) pVar2.r(this));
    }
}
