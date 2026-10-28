package com.tencent.beacon.base.util;

import android.util.Log;
import androidx.compose.material3.j4;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: ELog.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f71365a = true;

    /* renamed from: b, reason: collision with root package name */
    private static BeaconLogger f71366b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f71367c;

    private c() {
    }

    public static void a(BeaconLogger beaconLogger) {
        f71366b = beaconLogger;
    }

    public static synchronized boolean b() {
        boolean z4;
        synchronized (c.class) {
            z4 = f71365a;
        }
        return z4;
    }

    private static boolean c() {
        return a();
    }

    public static void d(String str, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = f71366b;
            if (beaconLogger == null) {
                c(str, objArr);
            } else {
                beaconLogger.i(ProtectedSandApp.s("ㆶ\u0001"), c(str, objArr));
            }
        }
    }

    public static void e(String str, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = f71366b;
            if (beaconLogger == null) {
                c(str, objArr);
            } else {
                beaconLogger.w(ProtectedSandApp.s("ㆶ\u0001"), c(str, objArr));
            }
        }
    }

    public static synchronized boolean a() {
        boolean z4;
        synchronized (c.class) {
            z4 = f71367c;
        }
        return z4;
    }

    public static synchronized void b(boolean z4) {
        synchronized (c.class) {
            f71365a = z4;
        }
    }

    public static String c(String str, Object... objArr) {
        String e4 = e();
        if (str == null) {
            return j.a(e4, ProtectedSandApp.s("ㆹ\u0001"));
        }
        if (objArr == null || objArr.length == 0) {
            return j.a(e4, str);
        }
        StringBuilder a5 = j4.a(e4);
        a5.append(String.format(Locale.US, str, objArr));
        return a5.toString();
    }

    public static synchronized void a(boolean z4) {
        synchronized (c.class) {
            f71367c = z4;
        }
    }

    public static void b(String str, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = f71366b;
            if (beaconLogger == null) {
                c(str, objArr);
            } else {
                beaconLogger.e(ProtectedSandApp.s("ㆶ\u0001"), c(str, objArr));
            }
        }
    }

    public static void a(String str, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = f71366b;
            if (beaconLogger == null) {
                c(str, objArr);
            } else {
                beaconLogger.d(ProtectedSandApp.s("ㆶ\u0001"), c(str, objArr));
            }
        }
    }

    private static StackTraceElement d() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int a5 = a(stackTrace, c.class);
        if (a5 == -1 && (a5 = a(stackTrace, Log.class)) == -1) {
            return null;
        }
        return stackTrace[a5];
    }

    private static String e() {
        StackTraceElement d5;
        if (!b() || (d5 = d()) == null) {
            return "";
        }
        String fileName = d5.getFileName();
        String str = fileName != null ? fileName : "";
        String methodName = d5.getMethodName();
        String s4 = ProtectedSandApp.s("ㆺ\u0001");
        if (methodName.contains(s4)) {
            methodName = methodName.substring(methodName.indexOf(s4) + 1, methodName.lastIndexOf(s4) - 2);
        }
        StringBuilder a5 = androidx.appcompat.view.g.a(ProtectedSandApp.s("ㆻ\u0001"), str, ProtectedSandApp.s("ㆼ\u0001"));
        a5.append(d5.getLineNumber());
        a5.append(ProtectedSandApp.s("ㆽ\u0001"));
        a5.append(methodName);
        a5.append(ProtectedSandApp.s("ㆸ\u0001"));
        return a5.toString();
    }

    public static void a(String str, String str2, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = f71366b;
            String s4 = ProtectedSandApp.s("ㆸ\u0001");
            if (beaconLogger == null) {
                c(str + s4 + str2, objArr);
                return;
            }
            beaconLogger.d(ProtectedSandApp.s("ㆶ\u0001"), c(str + s4 + str2, objArr));
        }
    }

    public static void a(String str, int i4, String str2, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = f71366b;
            String s4 = ProtectedSandApp.s("ㆴ\u0001");
            String s5 = ProtectedSandApp.s("ㆵ\u0001");
            if (beaconLogger == null) {
                c(str + s5 + i4 + s4 + str2, objArr);
                return;
            }
            beaconLogger.d(ProtectedSandApp.s("ㆶ\u0001"), c(str + s5 + i4 + s4 + str2, objArr));
        }
    }

    public static void a(Throwable th) {
        if (th == null || !c()) {
            return;
        }
        BeaconLogger beaconLogger = f71366b;
        if (beaconLogger == null) {
            th.printStackTrace();
        } else {
            beaconLogger.printStackTrace(th);
        }
    }

    public static void a(String str, String str2) {
        String.format(ProtectedSandApp.s("ㆷ\u0001"), str, str2);
    }

    private static int a(StackTraceElement[] stackTraceElementArr, Class cls) {
        for (int i4 = 5; i4 < stackTraceElementArr.length; i4++) {
            String className = stackTraceElementArr[i4].getClassName();
            if (!(cls.equals(Log.class) && i4 < stackTraceElementArr.length - 1 && stackTraceElementArr[i4 + 1].getClassName().equals(Log.class.getName())) && className.equals(cls.getName())) {
                return i4 + 1;
            }
        }
        return -1;
    }
}
