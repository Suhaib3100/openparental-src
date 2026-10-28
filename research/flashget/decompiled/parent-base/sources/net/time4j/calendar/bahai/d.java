package net.time4j.calendar.bahai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.Map;

/* compiled from: BadiIntercalaryDays.java */
/* loaded from: classes7.dex */
public enum d implements b {
    AYYAM_I_HA;

    public String getDisplayName(Locale locale) {
        return net.time4j.format.b.d(ProtectedSandApp.s("赇\u0001"), locale).o().get(ProtectedSandApp.s("赈\u0001"));
    }

    public String getMeaning(Locale locale) {
        Map<String, String> o4 = net.time4j.format.b.d(ProtectedSandApp.s("赇\u0001"), locale).o();
        String str = o4.get(ProtectedSandApp.s("赉\u0001"));
        return str == null ? o4.get(ProtectedSandApp.s("赈\u0001")) : str;
    }
}
