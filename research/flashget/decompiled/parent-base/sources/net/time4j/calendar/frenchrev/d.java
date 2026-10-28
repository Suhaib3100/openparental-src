package net.time4j.calendar.frenchrev;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import net.time4j.engine.j;
import net.time4j.format.x;

/* compiled from: FrenchRepublicanEra.java */
/* loaded from: classes7.dex */
public enum d implements j {
    REPUBLICAN;

    public String getDisplayName(Locale locale, x xVar) {
        return net.time4j.format.b.d(ProtectedSandApp.s("蹠\u0001"), locale).c(xVar).g(this);
    }
}
