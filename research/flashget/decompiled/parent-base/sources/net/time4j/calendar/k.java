package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;
import net.time4j.engine.ChronoException;

/* compiled from: EastAsianME.java */
/* loaded from: classes7.dex */
class k implements net.time4j.format.v<l>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final k f82589b = new k();
    private static final long serialVersionUID = -5874268477318061153L;

    k() {
    }

    @Override // net.time4j.engine.q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public l getDefaultMaximum() {
        return l.f(12);
    }

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        String str = net.time4j.format.b.f(locale).o().get(ProtectedSandApp.s("講\u0001"));
        return str == null ? name() : str;
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return 'M';
    }

    @Override // net.time4j.engine.q
    public Class<l> getType() {
        return l.class;
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
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public l getDefaultMinimum() {
        return l.f(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    @Override // net.time4j.format.v
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public net.time4j.calendar.l parse(java.lang.CharSequence r19, java.text.ParsePosition r20, net.time4j.engine.d r21) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.k.parse(java.lang.CharSequence, java.text.ParsePosition, net.time4j.engine.d):net.time4j.calendar.l");
    }

    @Override // net.time4j.engine.q
    public String name() {
        return ProtectedSandApp.s("謡\u0001");
    }

    @Override // net.time4j.format.v
    public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
        l lVar = (l) pVar.r(this);
        if (dVar.c(pe.a.G2)) {
            appendable.append(lVar.c(locale, (net.time4j.format.j) dVar.b(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC), dVar));
            return;
        }
        net.time4j.format.x xVar = (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
        net.time4j.format.m mVar = (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT);
        boolean e4 = lVar.e();
        String s4 = ProtectedSandApp.s("謠\u0001");
        appendable.append((e4 ? net.time4j.format.b.d(s4, locale).i(xVar, mVar) : net.time4j.format.b.d(s4, locale).n(xVar, mVar)).g(net.time4j.e0.valueOf(lVar.getNumber())));
    }

    protected Object readResolve() throws ObjectStreamException {
        return f82589b;
    }

    @Override // java.util.Comparator
    public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
        return ((l) pVar.r(this)).compareTo((l) pVar2.r(this));
    }
}
