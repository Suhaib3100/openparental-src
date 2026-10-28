package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: HebrewMonth.java */
/* loaded from: classes7.dex */
public enum u implements net.time4j.engine.o<HebrewCalendar> {
    TISHRI,
    HESHVAN,
    KISLEV,
    TEVET,
    SHEVAT,
    ADAR_I,
    ADAR_II,
    NISAN,
    IYAR,
    SIVAN,
    TAMUZ,
    AV,
    ELUL;

    private static final u[] ENUMS = values();
    private static final net.time4j.engine.c<a> ATTRIBUTE = net.time4j.format.a.e(ProtectedSandApp.s("鉹\u0001"), a.class);

    /* compiled from: HebrewMonth.java */
    public enum a {
        CIVIL,
        BIBLICAL,
        ENUM
    }

    public static net.time4j.engine.c<a> order() {
        return ATTRIBUTE;
    }

    public static u valueOfBiblical(int i4, boolean z4) {
        if (i4 < 1 || i4 > 13 || (!z4 && i4 == 13)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鉺\u0001"), i4));
        }
        int i5 = i4 + 7;
        if (i5 > 13) {
            i5 = i4 - 6;
        }
        return (z4 || i4 != 12) ? ENUMS[i5 - 1] : ADAR_II;
    }

    public static u valueOfCivil(int i4, boolean z4) {
        if (i4 < 1 || i4 > 13 || (!z4 && i4 == 13)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鉺\u0001"), i4));
        }
        return (z4 || i4 < 6) ? ENUMS[i4 - 1] : ENUMS[i4];
    }

    public int getBiblicalValue(boolean z4) {
        int ordinal = ordinal();
        int i4 = ordinal + 7;
        if (i4 > 13) {
            i4 = ordinal - 6;
        }
        if (z4 || i4 != 13) {
            return i4;
        }
        return 12;
    }

    public int getCivilValue(boolean z4) {
        int ordinal = ordinal();
        int i4 = ordinal + 1;
        return (z4 || i4 < 7) ? i4 : ordinal;
    }

    public String getDisplayName(Locale locale, boolean z4) {
        return getDisplayName(locale, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT, z4);
    }

    int getValue() {
        return ordinal() + 1;
    }

    static u valueOf(int i4) {
        if (i4 < 1 || i4 > 13) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鉺\u0001"), i4));
        }
        return ENUMS[i4 - 1];
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar, boolean z4) {
        net.time4j.format.b d5 = net.time4j.format.b.d(ProtectedSandApp.s("鉻\u0001"), locale);
        return (z4 && this == ADAR_II) ? d5.i(xVar, mVar).g(this) : d5.n(xVar, mVar).g(this);
    }

    @Override // net.time4j.engine.o
    public boolean test(HebrewCalendar hebrewCalendar) {
        return hebrewCalendar.F0() == this;
    }
}
