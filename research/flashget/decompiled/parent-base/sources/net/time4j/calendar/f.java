package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: CopticMonth.java */
/* loaded from: classes7.dex */
public enum f implements net.time4j.engine.o<CopticCalendar> {
    TOUT,
    BABA,
    HATOR,
    KIAHK,
    TOBA,
    AMSHIR,
    BARAMHAT,
    BARAMOUDA,
    BASHANS,
    PAONA,
    EPEP,
    MESRA,
    NASIE;

    private static final f[] ENUMS = values();

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public static f valueOf(int i4) {
        if (i4 < 1 || i4 > 13) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("踈\u0001"), i4));
        }
        return ENUMS[i4 - 1];
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("踉\u0001"), locale).n(xVar, mVar).g(this);
    }

    @Override // net.time4j.engine.o
    public boolean test(CopticCalendar copticCalendar) {
        return copticCalendar.B0() == this;
    }
}
