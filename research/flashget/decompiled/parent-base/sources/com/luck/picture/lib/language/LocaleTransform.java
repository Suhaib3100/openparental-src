package com.luck.picture.lib.language;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* loaded from: classes6.dex */
public class LocaleTransform {
    public static Locale getLanguage(int i4) {
        switch (i4) {
            case 1:
                return Locale.TRADITIONAL_CHINESE;
            case 2:
                return Locale.ENGLISH;
            case 3:
                return Locale.KOREA;
            case 4:
                return Locale.GERMANY;
            case 5:
                return Locale.FRANCE;
            case 6:
                return Locale.JAPAN;
            case 7:
                return new Locale(ProtectedSandApp.s("ᙧ\u0001"));
            case 8:
                return new Locale(ProtectedSandApp.s("ᙥ\u0001"), ProtectedSandApp.s("ᙦ\u0001"));
            case 9:
                return new Locale(ProtectedSandApp.s("ᙣ\u0001"), ProtectedSandApp.s("ᙤ\u0001"));
            case 10:
                return new Locale(ProtectedSandApp.s("ᙡ\u0001"), ProtectedSandApp.s("ᙢ\u0001"));
            case 11:
                return new Locale(ProtectedSandApp.s("ᙟ\u0001"), ProtectedSandApp.s("ᙠ\u0001"));
            case 12:
                return new Locale(ProtectedSandApp.s("ᙝ\u0001"), ProtectedSandApp.s("ᙞ\u0001"));
            case 13:
                return new Locale(ProtectedSandApp.s("ᙛ\u0001"), ProtectedSandApp.s("ᙜ\u0001"));
            default:
                return Locale.CHINESE;
        }
    }
}
