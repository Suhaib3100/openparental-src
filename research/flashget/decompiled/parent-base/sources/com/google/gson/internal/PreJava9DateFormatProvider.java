package com.google.gson.internal;

import android.support.v4.media.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes6.dex */
public class PreJava9DateFormatProvider {
    private static String getDateFormatPattern(int i4) {
        if (i4 == 0) {
            return ProtectedSandApp.s("ּ\u0001");
        }
        if (i4 == 1) {
            return ProtectedSandApp.s("ֻ\u0001");
        }
        if (i4 == 2) {
            return ProtectedSandApp.s("ֺ\u0001");
        }
        if (i4 == 3) {
            return ProtectedSandApp.s("ָ\u0001");
        }
        throw new IllegalArgumentException(a.a(ProtectedSandApp.s("ֹ\u0001"), i4));
    }

    private static String getDatePartOfDateTimePattern(int i4) {
        if (i4 == 0) {
            return ProtectedSandApp.s("ֿ\u0001");
        }
        if (i4 == 1) {
            return ProtectedSandApp.s("־\u0001");
        }
        if (i4 == 2) {
            return ProtectedSandApp.s("ֽ\u0001");
        }
        if (i4 == 3) {
            return ProtectedSandApp.s("ָ\u0001");
        }
        throw new IllegalArgumentException(a.a(ProtectedSandApp.s("ֹ\u0001"), i4));
    }

    private static String getTimePartOfDateTimePattern(int i4) {
        if (i4 == 0 || i4 == 1) {
            return ProtectedSandApp.s("ׂ\u0001");
        }
        if (i4 == 2) {
            return ProtectedSandApp.s("ׁ\u0001");
        }
        if (i4 == 3) {
            return ProtectedSandApp.s("׀\u0001");
        }
        throw new IllegalArgumentException(a.a(ProtectedSandApp.s("ֹ\u0001"), i4));
    }

    public static DateFormat getUSDateFormat(int i4) {
        return new SimpleDateFormat(getDateFormatPattern(i4), Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i4, int i5) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i4) + ProtectedSandApp.s("׃\u0001") + getTimePartOfDateTimePattern(i5), Locale.US);
    }
}
