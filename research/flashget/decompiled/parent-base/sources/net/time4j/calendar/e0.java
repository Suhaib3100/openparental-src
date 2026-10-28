package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: MinguoEra.java */
/* loaded from: classes7.dex */
public enum e0 implements net.time4j.engine.j {
    BEFORE_ROC,
    ROC;

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE);
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("趻\u0001"), locale).c(xVar).g(this);
    }
}
