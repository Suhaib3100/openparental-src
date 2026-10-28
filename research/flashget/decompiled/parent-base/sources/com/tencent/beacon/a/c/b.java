package com.tencent.beacon.a.c;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.d.a;
import java.util.List;
import org.apache.commons.lang3.m;

/* compiled from: AppInfo.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f71069a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f71070b = 0;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f71072d = false;

    /* renamed from: e, reason: collision with root package name */
    private static String f71073e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f71074f = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f71076h = false;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f71077i = false;

    /* renamed from: j, reason: collision with root package name */
    private static int f71078j = -2;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f71079k = true;

    /* renamed from: c, reason: collision with root package name */
    public static String f71071c = "";

    /* renamed from: g, reason: collision with root package name */
    private static String f71075g = "";

    public static String a() {
        if (f71069a == null) {
            f71069a = e();
        }
        return f71069a;
    }

    public static String b() {
        Context b5 = c.c().b();
        if (b5 == null) {
            return null;
        }
        String packageName = b5.getPackageName();
        return TextUtils.isEmpty(packageName) ? "" : packageName;
    }

    public static String c(Context context) {
        return com.tencent.beacon.base.util.a.a();
    }

    public static String d() {
        if (!"".equals(f71071c)) {
            return f71071c;
        }
        if (f71070b == 0) {
            f71070b = Process.myPid();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f71071c);
        f71071c = android.support.v4.media.b.a(sb, f71070b, ProtectedSandApp.s("〱\u0001"));
        String str = f71071c + com.tencent.beacon.base.util.b.c();
        f71071c = str;
        return str;
    }

    public static synchronized boolean e(Context context) {
        synchronized (b.class) {
            boolean z4 = false;
            if (context == null) {
                com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〷\u0001"), new Object[0]);
                return false;
            }
            com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
            String string = a5.getString(ProtectedSandApp.s("〸\u0001"), "");
            String a6 = a();
            if (string.isEmpty() || !string.equals(a6)) {
                a.SharedPreferencesEditorC0995a edit = a5.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString(ProtectedSandApp.s("〸\u0001"), a6);
                }
                z4 = true;
            }
            return z4;
        }
    }

    public static boolean f(Context context) {
        return a(context, context.getPackageName());
    }

    public static synchronized boolean g() {
        boolean z4;
        synchronized (b.class) {
            try {
                com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
                String string = a5.getString(ProtectedSandApp.s("〹\u0001"), "");
                String e4 = c.c().e();
                z4 = TextUtils.isEmpty(string) || !e4.equals(string);
                a.SharedPreferencesEditorC0995a edit = a5.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString(ProtectedSandApp.s("〹\u0001"), e4);
                }
            } finally {
            }
        }
        return z4;
    }

    private static void h() {
        String s4 = ProtectedSandApp.s("〸\u0001");
        try {
            com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
            String string = a5.getString(s4, "");
            String a6 = a();
            if (TextUtils.isEmpty(string) || !a6.equals(string)) {
                f71074f = true;
                a.SharedPreferencesEditorC0995a edit = a5.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString(s4, a6);
                }
            } else {
                f71074f = false;
            }
        } catch (Exception e4) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("〺\u0001"), new Object[0]);
            com.tencent.beacon.base.util.c.a(e4);
        }
    }

    public static String c() {
        return f71075g;
    }

    public static void f() {
        h();
    }

    public static boolean a(Context context, String str) {
        if (f71077i) {
            return f71079k;
        }
        if (context != null && str != null && str.trim().length() > 0) {
            if (!com.tencent.beacon.d.b.b().t()) {
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〮\u0001"), Boolean.FALSE);
                return true;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(ProtectedSandApp.s("〯\u0001"))).getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        for (String str2 : runningAppProcessInfo.pkgList) {
                            if (str.equals(str2)) {
                                f71079k = true;
                                f71077i = true;
                                return true;
                            }
                        }
                    }
                }
                f71079k = false;
                f71077i = true;
                return false;
            }
            com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("〰\u0001"), new Object[0]);
        }
        return false;
    }

    public static int b(Context context) {
        if (f71076h) {
            return f71078j;
        }
        if (f71070b == 0) {
            f71070b = Process.myPid();
        }
        if (!com.tencent.beacon.d.b.b().t()) {
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〮\u0001"), Boolean.FALSE);
            return -2;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ProtectedSandApp.s("〯\u0001"));
        if (activityManager != null && activityManager.getRunningAppProcesses() != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == f71070b) {
                    int i4 = runningAppProcessInfo.importance;
                    f71078j = i4;
                    f71076h = true;
                    return i4;
                }
            }
        }
        f71078j = 0;
        f71076h = true;
        return 0;
    }

    public static boolean g(Context context) {
        if (context == null) {
            return true;
        }
        String c5 = c(context);
        return TextUtils.isEmpty(c5) || c5.equals(context.getPackageName());
    }

    public static synchronized String e() {
        synchronized (b.class) {
            String b5 = b();
            if (TextUtils.isEmpty(b5)) {
                return null;
            }
            try {
                PackageInfo packageInfo = c.c().b().getPackageManager().getPackageInfo(b5, 0);
                String str = packageInfo.versionName;
                int i4 = packageInfo.versionCode;
                if (str != null && str.trim().length() > 0) {
                    String replace = str.trim().replace('\n', ' ').replace(m.f86065d, ' ').replace(ProtectedSandApp.s("〲\u0001"), ProtectedSandApp.s("〳\u0001"));
                    int i5 = 0;
                    for (char c5 : replace.toCharArray()) {
                        if (c5 == '.') {
                            i5++;
                        }
                    }
                    if (i5 < 3) {
                        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〴\u0001"), Integer.valueOf(i4));
                        StringBuilder sb = new StringBuilder();
                        sb.append(replace);
                        sb.append(ProtectedSandApp.s("〵\u0001"));
                        sb.append(i4);
                        replace = sb.toString();
                    }
                    com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〶\u0001"), replace);
                    return replace;
                }
                return "" + i4;
            } catch (Throwable th) {
                com.tencent.beacon.base.util.c.a(th);
                com.tencent.beacon.base.util.c.b(th.toString(), new Object[0]);
                return "";
            }
        }
    }

    public static boolean d(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e4) {
            com.tencent.beacon.base.util.c.a(e4);
            return false;
        }
    }

    public static synchronized String a(Context context) {
        String str;
        String s4 = ProtectedSandApp.s("〩\u0001");
        synchronized (b.class) {
            try {
                if (TextUtils.isEmpty(f71073e)) {
                    String str2 = s4 + c(context);
                    com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
                    long j4 = a5.getLong(str2, 0L);
                    if (j4 == 0) {
                        j4 = com.tencent.beacon.base.util.b.c();
                        com.tencent.beacon.a.b.b.a().a(new a(a5, str2, j4));
                    }
                    String valueOf = String.valueOf(j4);
                    f71073e = valueOf;
                    com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〪\u0001"), str2, valueOf);
                }
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("〫\u0001"), f71073e);
                str = f71073e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (Long.parseLong(str) > i0.f35991f) {
                    f71075g = str;
                    return;
                }
                return;
            } catch (Exception unused) {
                com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("〬\u0001"), new Object[0]);
                return;
            }
        }
        com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("〭\u0001"), new Object[0]);
    }
}
