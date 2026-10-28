package com.tencent.liteav.base.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.Locale;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class LiteavLog {
    private static final int LEVEL_DEBUG = 1;
    private static final int LEVEL_ERROR = 4;
    private static final int LEVEL_FATAL = 5;
    private static final int LEVEL_INFO = 2;
    private static final int LEVEL_NULL = 6;
    private static final int LEVEL_VERBOSE = 0;
    private static final int LEVEL_WARN = 3;
    private static a sCallback = null;
    private static final boolean useChromiumBaseLog = true;

    public interface a {
        void a(int i4, String str, String str2);
    }

    public enum b {
        f71916a(0),
        f71917b(1),
        f71918c(2),
        f71919d(3),
        f71920e(4),
        f71921f(5);

        public int mNativeValue;

        b(int i4) {
            this.mNativeValue = i4;
        }

        public static int a(int i4) {
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 1) {
                return 2;
            }
            if (i4 == 2) {
                return 3;
            }
            if (i4 != 3) {
                return i4 != 4 ? 6 : 5;
            }
            return 4;
        }
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public static void d(com.tencent.liteav.base.b.a aVar, String str, String str2, Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        d(str, str2, objArr);
    }

    public static void e(com.tencent.liteav.base.b.a aVar, String str, String str2, Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        e(str, str2, objArr);
    }

    public static int getLogLevel() {
        return nativeGetLogLevel();
    }

    public static void i(com.tencent.liteav.base.b.a aVar, String str, String str2, Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        i(str, str2, objArr);
    }

    public static native int nativeGetLogLevel();

    public static native void nativeSetConsoleLogEnabled(boolean z4);

    public static native void nativeSetLogCallbackEnabled(boolean z4);

    public static native void nativeSetLogCompressEnabled(boolean z4);

    public static native void nativeSetLogFilePath(String str);

    public static native void nativeSetLogLevel(int i4);

    public static native void nativeSetLogToFileEnabled(boolean z4);

    public static void onLog(int i4, String str) {
        a aVar = sCallback;
        if (aVar != null) {
            aVar.a(b.a(i4), ProtectedSandApp.s("厘\u0001"), str);
        }
    }

    public static void setCallback(a aVar) {
        sCallback = aVar;
    }

    public static void v(com.tencent.liteav.base.b.a aVar, String str, String str2, Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        v(str, str2, objArr);
    }

    public static void w(com.tencent.liteav.base.b.a aVar, String str, String str2, Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        w(str, str2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        d(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    public static void e(String str, String str2, Object... objArr) {
        e(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    public static void i(String str, String str2, Object... objArr) {
        i(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    public static void v(String str, String str2, Object... objArr) {
        v(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    public static void w(String str, String str2, Object... objArr) {
        w(str, String.format(Locale.ENGLISH, str2, objArr));
    }

    public static void d(String str, String str2) {
        Log.d(str, str2, new Object[0]);
    }

    public static void e(String str, String str2) {
        Log.e(str, str2, new Object[0]);
    }

    public static void i(String str, String str2) {
        Log.i(str, str2, new Object[0]);
    }

    public static void v(String str, String str2) {
        Log.v(str, str2, new Object[0]);
    }

    public static void w(String str, String str2) {
        Log.w(str, str2, new Object[0]);
    }

    public static void e(com.tencent.liteav.base.b.a aVar, String str, String str2, Throwable th) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        e(str, str2, th);
    }

    public static void e(String str, String str2, Throwable th) {
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str2, ProtectedSandApp.s("厗\u0001"));
        a5.append(android.util.Log.getStackTraceString(th));
        e(str, a5.toString());
    }
}
