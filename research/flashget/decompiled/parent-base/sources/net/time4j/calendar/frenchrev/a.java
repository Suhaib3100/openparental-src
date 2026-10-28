package net.time4j.calendar.frenchrev;

import androidx.appcompat.view.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.Map;
import net.time4j.format.m;
import net.time4j.format.x;

/* compiled from: DayOfDecade.java */
/* loaded from: classes7.dex */
public enum a {
    PRIMIDI,
    DUODI,
    TRIDI,
    QUARTIDI,
    QUINTIDI,
    SEXTIDI,
    SEPTIDI,
    OCTIDI,
    NONIDI,
    DECADI;

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, x.WIDE, m.FORMAT);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public static a valueOf(int i4) {
        if (i4 < 1 || i4 > 10) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("踖\u0001"), i4));
        }
        return values()[i4 - 1];
    }

    public String getDisplayName(Locale locale, x xVar, m mVar) {
        net.time4j.format.b d5 = net.time4j.format.b.d(ProtectedSandApp.s("踗\u0001"), locale);
        String s4 = xVar == x.NARROW ? ProtectedSandApp.s("踘\u0001") : mVar == m.FORMAT ? ProtectedSandApp.s("踙\u0001") : ProtectedSandApp.s("踚\u0001");
        Map<String, String> o4 = d5.o();
        StringBuilder a5 = g.a(ProtectedSandApp.s("踛\u0001"), s4, ProtectedSandApp.s("踜\u0001"));
        a5.append(getValue());
        return o4.get(a5.toString());
    }
}
