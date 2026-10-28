package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: IndianMonth.java */
/* loaded from: classes7.dex */
public enum b0 implements net.time4j.engine.o<IndianCalendar> {
    CHAITRA,
    VAISHAKHA,
    JYESHTHA,
    ASHADHA,
    SHRAVANA,
    BHAADRA,
    ASHWIN,
    KARTIKA,
    AGRAHAYANA,
    PAUSHA,
    MAGHA,
    PHALGUNA;

    private static final b0[] ENUMS = values();

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public b0 roll(int i4) {
        return valueOf(((((i4 % 12) + 12) + ordinal()) % 12) + 1);
    }

    public static b0 valueOf(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("賡\u0001"), i4));
        }
        return ENUMS[i4 - 1];
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("賢\u0001"), locale).n(xVar, mVar).g(this);
    }

    @Override // net.time4j.engine.o
    public boolean test(IndianCalendar indianCalendar) {
        return indianCalendar.A0() == this;
    }
}
