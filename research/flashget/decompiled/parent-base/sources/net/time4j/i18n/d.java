package net.time4j.i18n;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: LanguageMatch.java */
/* loaded from: classes7.dex */
public enum d {
    tl(ProtectedSandApp.s("霦\u0001")),
    no(ProtectedSandApp.s("霨\u0001")),
    in(ProtectedSandApp.s("霪\u0001")),
    iw(ProtectedSandApp.s("霬\u0001"));

    static final d[] ALIASES = values();
    private final String alias;

    d(String str) {
        this.alias = str;
    }

    public static String getAlias(Locale locale) {
        String language = locale.getLanguage();
        if (language.equals(ProtectedSandApp.s("霩\u0001")) && locale.getVariant().equals(ProtectedSandApp.s("霮\u0001")) && locale.getCountry().equals(ProtectedSandApp.s("霯\u0001"))) {
            return ProtectedSandApp.s("霰\u0001");
        }
        for (d dVar : ALIASES) {
            if (language.equals(dVar.name())) {
                return dVar.alias;
            }
        }
        return language;
    }
}
