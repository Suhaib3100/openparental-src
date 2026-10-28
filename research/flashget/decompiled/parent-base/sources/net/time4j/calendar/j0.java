package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: PersianMonth.java */
/* loaded from: classes7.dex */
public enum j0 implements net.time4j.engine.o<PersianCalendar> {
    FARVARDIN,
    ORDIBEHESHT,
    KHORDAD,
    TIR,
    MORDAD,
    SHAHRIVAR,
    MEHR,
    ABAN,
    AZAR,
    DEY,
    BAHMAN,
    ESFAND;

    private static final j0[] ENUMS = values();

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public static j0 valueOf(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鄐\u0001"), i4));
        }
        return ENUMS[i4 - 1];
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("鄑\u0001"), locale).n(xVar, mVar).g(this);
    }

    @Override // net.time4j.engine.o
    public boolean test(PersianCalendar persianCalendar) {
        return persianCalendar.D0() == this;
    }
}
