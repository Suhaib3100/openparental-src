package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: CopticEra.java */
/* loaded from: classes7.dex */
public enum e implements net.time4j.engine.j {
    ANNO_MARTYRUM;

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE);
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("趽\u0001"), locale).c(xVar).g(this);
    }
}
