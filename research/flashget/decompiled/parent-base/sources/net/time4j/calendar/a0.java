package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: IndianEra.java */
/* loaded from: classes7.dex */
public enum a0 implements net.time4j.engine.j {
    SAKA;

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE);
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("诂\u0001"), locale).c(xVar).g(this);
    }
}
