package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: EthiopianMonth.java */
/* loaded from: classes7.dex */
public enum q implements net.time4j.engine.o<EthiopianCalendar> {
    MESKEREM,
    TEKEMT,
    HEDAR,
    TAHSAS,
    TER,
    YEKATIT,
    MEGABIT,
    MIAZIA,
    GENBOT,
    SENE,
    HAMLE,
    NEHASSE,
    PAGUMEN;

    private static final q[] ENUMS = values();

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public static q valueOf(int i4) {
        if (i4 < 1 || i4 > 13) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鈈\u0001"), i4));
        }
        return ENUMS[i4 - 1];
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("鈉\u0001"), locale).n(xVar, mVar).g(this);
    }

    @Override // net.time4j.engine.o
    public boolean test(EthiopianCalendar ethiopianCalendar) {
        return ethiopianCalendar.A0() == this;
    }
}
