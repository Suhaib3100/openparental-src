package com.google.gson.internal;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes5.dex */
public class PreJava9DateFormatProvider {
    private static String getDateFormatPattern(int i5) {
        if (i5 == 0) {
            return ProtectedSandApp.s("㏋");
        }
        if (i5 == 1) {
            return ProtectedSandApp.s("㏊");
        }
        if (i5 == 2) {
            return ProtectedSandApp.s("㏉");
        }
        if (i5 == 3) {
            return ProtectedSandApp.s("㏇");
        }
        throw new IllegalArgumentException(s.a(ProtectedSandApp.s("㏈"), i5));
    }

    private static String getDatePartOfDateTimePattern(int i5) {
        if (i5 == 0) {
            return ProtectedSandApp.s("㏐");
        }
        if (i5 == 1) {
            return ProtectedSandApp.s("㏏");
        }
        if (i5 == 2) {
            return ProtectedSandApp.s("㏎");
        }
        if (i5 == 3) {
            return ProtectedSandApp.s("㏌");
        }
        throw new IllegalArgumentException(s.a(ProtectedSandApp.s("㏍"), i5));
    }

    private static String getTimePartOfDateTimePattern(int i5) {
        if (i5 == 0 || i5 == 1) {
            return ProtectedSandApp.s("㏔");
        }
        if (i5 == 2) {
            return ProtectedSandApp.s("㏓");
        }
        if (i5 == 3) {
            return ProtectedSandApp.s("㏑");
        }
        throw new IllegalArgumentException(s.a(ProtectedSandApp.s("㏒"), i5));
    }

    public static DateFormat getUSDateFormat(int i5) {
        return new SimpleDateFormat(getDateFormatPattern(i5), Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i5, int i6) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i5) + ProtectedSandApp.s("㏕") + getTimePartOfDateTimePattern(i6), Locale.US);
    }
}
