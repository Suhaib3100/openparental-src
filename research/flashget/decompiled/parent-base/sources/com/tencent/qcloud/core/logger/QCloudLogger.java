package com.tencent.qcloud.core.logger;

import androidx.annotation.q0;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public final class QCloudLogger {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    private QCloudLogger() {
    }

    public static void d(String str, String str2, Object... objArr) {
        print(3, str, null, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        print(6, str, null, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        print(4, str, null, str2, objArr);
    }

    private static void print(int i4, String str, @q0 Throwable th, String str2, Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    str2 = String.format(str2, objArr);
                }
            } catch (Exception unused) {
                str2 = j.a(str2, ProtectedSandApp.s("媓\u0001"));
            }
        }
        String str3 = str2;
        LogLevel logLevel = i4 != 3 ? i4 != 4 ? i4 != 5 ? i4 != 6 ? LogLevel.VERBOSE : LogLevel.ERROR : LogLevel.WARN : LogLevel.INFO : LogLevel.DEBUG;
        synchronized (QCloudLogger.class) {
            COSLogger.getInstance().log(logLevel, LogCategory.PROCESS, str, str3, th);
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        print(2, str, null, str2, objArr);
    }

    public static void w(String str, String str2, Object... objArr) {
        print(5, str, null, str2, objArr);
    }

    public static void d(String str, Throwable th, String str2, Object... objArr) {
        print(3, str, th, str2, objArr);
    }

    public static void e(String str, Throwable th, String str2, Object... objArr) {
        print(6, str, th, str2, objArr);
    }

    public static void i(String str, Throwable th, String str2, Object... objArr) {
        print(4, str, th, str2, objArr);
    }

    public static void v(String str, Throwable th, String str2, Object... objArr) {
        print(2, str, th, str2, objArr);
    }

    public static void w(String str, Throwable th, String str2, Object... objArr) {
        print(5, str, th, str2, objArr);
    }
}
