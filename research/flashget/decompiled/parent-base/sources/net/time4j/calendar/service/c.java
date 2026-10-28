package net.time4j.calendar.service;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import net.time4j.engine.z;

/* compiled from: GenericDatePatterns.java */
/* loaded from: classes7.dex */
public final class c {
    private c() {
    }

    public static String a(String str, z zVar, Locale locale) {
        net.time4j.format.e ofStyle = net.time4j.format.e.ofStyle(zVar.getStyleValue());
        if (str.equals(ProtectedSandApp.s("鈘\u0001"))) {
            return net.time4j.format.b.t(ofStyle, locale);
        }
        String str2 = ProtectedSandApp.s("鈙\u0001") + Character.toLowerCase(ofStyle.name().charAt(0)) + ')';
        net.time4j.i18n.e j4 = d.j(str, locale);
        if (!j4.c(str2)) {
            j4 = d.j(ProtectedSandApp.s("鈚\u0001"), locale);
        }
        return j4.g(str2);
    }
}
