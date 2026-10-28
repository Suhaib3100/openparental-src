package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.ChronoException;

/* compiled from: AmPmElement.java */
/* loaded from: classes7.dex */
enum d implements m1<c0>, pe.e<c0> {
    AM_PM_OF_DAY;

    private net.time4j.format.u accessor(net.time4j.engine.d dVar) {
        return net.time4j.format.b.f((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)).j((net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT));
    }

    static c0 parseAmPm(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int i4 = index + 2;
        if (charSequence.length() < i4) {
            return null;
        }
        char charAt = charSequence.charAt(index + 1);
        if (charAt != 'M' && charAt != 'm') {
            return null;
        }
        char charAt2 = charSequence.charAt(index);
        if (charAt2 == 'A' || charAt2 == 'a') {
            parsePosition.setIndex(i4);
            return c0.AM;
        }
        if (charAt2 != 'P' && charAt2 != 'p') {
            return null;
        }
        parsePosition.setIndex(i4);
        return c0.PM;
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, c0> at(net.time4j.tz.p pVar) {
        return new n1(this, pVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, c0> atUTC() {
        return at(net.time4j.tz.p.f83649l);
    }

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        String str = net.time4j.format.b.f(locale).o().get(ProtectedSandApp.s("鋋\u0001"));
        return str == null ? name() : str;
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return 'a';
    }

    @Override // net.time4j.engine.q
    public Class<c0> getType() {
        return c0.class;
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, c0> in(net.time4j.tz.l lVar) {
        return new n1(this, lVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, c0> inStdTimezone() {
        return in(net.time4j.tz.l.e0());
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, c0> inTimezone(net.time4j.tz.k kVar) {
        return in(net.time4j.tz.l.c0(kVar));
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.format.v
    public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        appendable.append(accessor(dVar).g((Enum) pVar.r(this)));
    }

    @Override // java.util.Comparator
    public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
        return ((c0) pVar.r(this)).compareTo((c0) pVar2.r(this));
    }

    @Override // net.time4j.engine.q
    public c0 getDefaultMaximum() {
        return c0.PM;
    }

    @Override // net.time4j.engine.q
    public c0 getDefaultMinimum() {
        return c0.AM;
    }

    @Override // pe.e
    public void print(net.time4j.engine.p pVar, Appendable appendable, Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) throws IOException, ChronoException {
        appendable.append(accessor(locale, xVar, mVar).g((Enum) pVar.r(this)));
    }

    @Override // net.time4j.format.v
    public c0 parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        c0 parseAmPm = parseAmPm(charSequence, parsePosition);
        return parseAmPm == null ? (c0) accessor(dVar).d(charSequence, parsePosition, getType(), dVar) : parseAmPm;
    }

    private net.time4j.format.u accessor(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.f(locale).j(xVar, mVar);
    }

    @Override // pe.e
    public c0 parse(CharSequence charSequence, ParsePosition parsePosition, Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar, net.time4j.format.g gVar) {
        c0 parseAmPm = parseAmPm(charSequence, parsePosition);
        return parseAmPm == null ? (c0) accessor(locale, xVar, mVar).e(charSequence, parsePosition, getType(), gVar) : parseAmPm;
    }
}
