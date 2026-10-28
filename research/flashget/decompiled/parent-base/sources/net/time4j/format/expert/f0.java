package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: TimezoneElement.java */
/* loaded from: classes7.dex */
enum f0 implements net.time4j.engine.q<net.time4j.tz.k> {
    TIMEZONE_ID,
    TIMEZONE_OFFSET;

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        String str = net.time4j.format.b.f(locale).o().get(ProtectedSandApp.s("鑵\u0001"));
        return str == null ? name() : str;
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.q
    public Class<net.time4j.tz.k> getType() {
        return net.time4j.tz.k.class;
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
        return false;
    }

    @Override // java.util.Comparator
    public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
        return pVar.v().canonical().compareTo(pVar2.v().canonical());
    }

    @Override // net.time4j.engine.q
    public net.time4j.tz.k getDefaultMaximum() {
        return net.time4j.tz.p.m(net.time4j.tz.f.AHEAD_OF_UTC, 14);
    }

    @Override // net.time4j.engine.q
    public net.time4j.tz.k getDefaultMinimum() {
        return net.time4j.tz.p.m(net.time4j.tz.f.BEHIND_UTC, 14);
    }
}
