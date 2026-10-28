package com.luck.picture.lib.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class ValueOf {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T to(Object obj, T t4) {
        return obj == 0 ? t4 : obj;
    }

    public static boolean toBoolean(Object obj) {
        return toBoolean(obj, false);
    }

    public static double toDouble(Object obj) {
        return toDouble(obj, 0);
    }

    public static float toFloat(Object obj, long j4) {
        if (obj == null) {
            return j4;
        }
        try {
            return Float.parseFloat(obj.toString().trim());
        } catch (Exception unused) {
            return j4;
        }
    }

    public static int toInt(Object obj, int i4) {
        String s4 = ProtectedSandApp.s("\u1756\u0001");
        if (obj == null) {
            return i4;
        }
        try {
            String trim = obj.toString().trim();
            return trim.contains(s4) ? Integer.parseInt(trim.substring(0, trim.lastIndexOf(s4))) : Integer.parseInt(trim);
        } catch (Exception unused) {
            return i4;
        }
    }

    public static long toLong(Object obj, long j4) {
        String s4 = ProtectedSandApp.s("\u1756\u0001");
        if (obj == null) {
            return j4;
        }
        try {
            String trim = obj.toString().trim();
            return trim.contains(s4) ? Long.parseLong(trim.substring(0, trim.lastIndexOf(s4))) : Long.parseLong(trim);
        } catch (Exception unused) {
            return j4;
        }
    }

    public static String toString(Object obj) {
        try {
            return obj.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean toBoolean(Object obj, boolean z4) {
        if (obj == null) {
            return false;
        }
        try {
            return !ProtectedSandApp.s("\u1755\u0001").equals(obj.toString().trim().trim());
        } catch (Exception unused) {
            return z4;
        }
    }

    public static double toDouble(Object obj, int i4) {
        if (obj == null) {
            return i4;
        }
        try {
            return Double.parseDouble(obj.toString().trim());
        } catch (Exception unused) {
            return i4;
        }
    }

    public static float toFloat(Object obj) {
        return toFloat(obj, 0L);
    }

    public static int toInt(Object obj) {
        return toInt(obj, 0);
    }

    public static long toLong(Object obj) {
        return toLong(obj, 0L);
    }
}
