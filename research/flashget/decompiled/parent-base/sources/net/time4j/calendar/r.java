package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: Evangelist.java */
/* loaded from: classes7.dex */
public enum r {
    MATTHEW,
    MARK,
    LUKE,
    JOHN;

    public String getDisplayName(Locale locale) {
        return net.time4j.format.b.d(ProtectedSandApp.s("鈒\u0001"), locale).p(ProtectedSandApp.s("鈓\u0001"), r.class, new String[0]).g(this);
    }
}
