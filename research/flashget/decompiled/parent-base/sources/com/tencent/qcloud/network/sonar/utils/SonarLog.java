package com.tencent.qcloud.network.sonar.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public final class SonarLog {
    private static final String TAG = ProtectedSandApp.s("孋\u0001");
    public static boolean openLog;

    public static void d(String str, Object obj) {
        if (openLog) {
            format(str, obj);
        }
    }

    public static void e(String str, Object obj) {
        if (openLog) {
            format(str, obj);
        }
    }

    private static String format(String str, Object obj) {
        return String.format(ProtectedSandApp.s("孌\u0001"), str, toString(obj));
    }

    public static String toString(Object obj) {
        return obj == null ? ProtectedSandApp.s("孍\u0001") : obj instanceof String ? (String) obj : obj instanceof Number ? obj.toString() : obj instanceof Boolean ? String.valueOf(obj) : obj.toString();
    }

    public static void v(String str, Object obj) {
        if (openLog) {
            format(str, obj);
        }
    }

    public static void w(String str, Object obj) {
        if (openLog) {
            format(str, obj);
        }
    }

    public static String format(String str, Object... objArr) {
        return String.format(str, objArr);
    }
}
