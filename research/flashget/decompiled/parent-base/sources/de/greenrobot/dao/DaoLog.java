package de.greenrobot.dao;

import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class DaoLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final String TAG = ProtectedSandApp.s("復\u0001");
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    public static int d(String str) {
        return Log.d(ProtectedSandApp.s("復\u0001"), str);
    }

    public static int e(String str) {
        return Log.w(ProtectedSandApp.s("復\u0001"), str);
    }

    public static String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static int i(String str) {
        return Log.i(ProtectedSandApp.s("復\u0001"), str);
    }

    public static boolean isLoggable(int i4) {
        return Log.isLoggable(ProtectedSandApp.s("復\u0001"), i4);
    }

    public static int println(int i4, String str) {
        return Log.println(i4, ProtectedSandApp.s("復\u0001"), str);
    }

    public static int v(String str) {
        return Log.v(ProtectedSandApp.s("復\u0001"), str);
    }

    public static int w(String str) {
        return Log.w(ProtectedSandApp.s("復\u0001"), str);
    }

    public static int d(String str, Throwable th) {
        return Log.d(ProtectedSandApp.s("復\u0001"), str, th);
    }

    public static int e(String str, Throwable th) {
        return Log.e(ProtectedSandApp.s("復\u0001"), str, th);
    }

    public static int i(String str, Throwable th) {
        return Log.i(ProtectedSandApp.s("復\u0001"), str, th);
    }

    public static int v(String str, Throwable th) {
        return Log.v(ProtectedSandApp.s("復\u0001"), str, th);
    }

    public static int w(String str, Throwable th) {
        return Log.w(ProtectedSandApp.s("復\u0001"), str, th);
    }

    public static int w(Throwable th) {
        return Log.w(ProtectedSandApp.s("復\u0001"), th);
    }
}
