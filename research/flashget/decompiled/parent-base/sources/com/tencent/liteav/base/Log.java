package com.tencent.liteav.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* loaded from: classes7.dex */
public class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final String sDeprecatedTagPrefix = ProtectedSandApp.s("剄\u0001");
    private static final String sTagPrefix = ProtectedSandApp.s("剃\u0001");
    private static final boolean useChromiumLog = true;

    private Log() {
    }

    public static void d(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(3, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    public static void e(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(6, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    private static String formatLog(String str, Throwable th, Object... objArr) {
        return objArr != null ? ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr) : str;
    }

    private static String formatLogWithStack(String str, Throwable th, Object... objArr) {
        return ProtectedSandApp.s("剀\u0001") + getCallOrigin() + ProtectedSandApp.s("剁\u0001") + formatLog(str, th, objArr);
    }

    private static String getCallOrigin() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Log.class.getName();
        int i4 = 0;
        while (true) {
            if (i4 >= stackTrace.length) {
                break;
            }
            if (stackTrace[i4].getClassName().equals(name)) {
                i4 += 3;
                break;
            }
            i4++;
        }
        return stackTrace[i4].getFileName() + ProtectedSandApp.s("剂\u0001") + stackTrace[i4].getLineNumber();
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static void i(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(4, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    private static boolean isDebug() {
        return true;
    }

    public static boolean isLoggable(String str, int i4) {
        if (isDebug() || i4 > 4) {
            return android.util.Log.isLoggable(str, i4);
        }
        return false;
    }

    private static native void nativeWriteLogToNative(int i4, String str, String str2);

    public static String normalizeTag(String str) {
        String s4 = ProtectedSandApp.s("剃\u0001");
        if (str.startsWith(s4)) {
            return str;
        }
        return s4 + str.substring(str.startsWith(ProtectedSandApp.s("剄\u0001")) ? 3 : 0, str.length());
    }

    public static void v(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(2, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    public static void w(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(5, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    public static void wtf(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(7, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }
}
