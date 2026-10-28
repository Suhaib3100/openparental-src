package com.tencent.beacon.a.c;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.net.b.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: DeviceInfo.java */
/* loaded from: classes6.dex */
public class e implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f71094a;

    /* renamed from: b, reason: collision with root package name */
    private String f71095b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f71096c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f71097d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f71098e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f71099f = "";

    /* renamed from: g, reason: collision with root package name */
    private boolean f71100g = true;

    /* renamed from: h, reason: collision with root package name */
    private String f71101h = "";

    private e() {
    }

    private void G() {
        H();
        this.f71100g = com.tencent.beacon.base.net.b.d.d();
        this.f71101h = com.tencent.beacon.base.net.b.d.c();
    }

    private void H() {
        this.f71098e = I();
    }

    private String I() {
        ConnectivityManager connectivityManager;
        TelephonyManager telephonyManager;
        String s4 = ProtectedSandApp.s("〿\u0001");
        Context b5 = c.c().b();
        if (b5 == null) {
            return "";
        }
        String s5 = ProtectedSandApp.s("\u3040\u0001");
        try {
            connectivityManager = (ConnectivityManager) b5.getSystemService(ProtectedSandApp.s("ぁ\u0001"));
        } catch (Exception e4) {
            com.tencent.beacon.base.util.c.a(e4);
        }
        if (connectivityManager == null) {
            return s5;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return s5;
        }
        if (activeNetworkInfo.getType() == 1) {
            s5 = ProtectedSandApp.s("あ\u0001");
        } else if (activeNetworkInfo.getType() == 0 && (telephonyManager = (TelephonyManager) b5.getSystemService(ProtectedSandApp.s("ぃ\u0001"))) != null) {
            int networkType = telephonyManager.getNetworkType();
            if (networkType != 20) {
                switch (networkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        s5 = ProtectedSandApp.s("う\u0001");
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        s5 = ProtectedSandApp.s("ぅ\u0001");
                        break;
                    case 13:
                        s5 = ProtectedSandApp.s("い\u0001");
                        break;
                    default:
                        s5 = s4 + telephonyManager.getNetworkType();
                        break;
                }
            } else {
                s5 = ProtectedSandApp.s("ぇ\u0001");
            }
        }
        com.tencent.beacon.base.util.c.a(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("え\u0001"), s5), new Object[0]);
        return s5;
    }

    public static e l() {
        if (f71094a == null) {
            synchronized (e.class) {
                try {
                    if (f71094a == null) {
                        f71094a = new e();
                    }
                } finally {
                }
            }
        }
        return f71094a;
    }

    public String A() {
        return "";
    }

    public String B() {
        return "";
    }

    public void C() {
        Context b5 = c.c().b();
        if (b5 == null) {
            return;
        }
        com.tencent.beacon.base.net.b.e.a(b5, this);
        G();
        D();
    }

    public void D() {
        com.tencent.beacon.a.d.a a5 = com.tencent.beacon.a.d.a.a();
        String s4 = ProtectedSandApp.s("ぉ\u0001");
        String string = a5.getString(s4, "");
        this.f71095b = string;
        if (TextUtils.isEmpty(string)) {
            this.f71095b = com.tencent.beacon.base.util.b.a();
            a.SharedPreferencesEditorC0995a edit = com.tencent.beacon.a.d.a.a().edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                edit.putString(s4, this.f71095b);
            }
        }
    }

    public boolean E() {
        BufferedReader bufferedReader;
        boolean z4;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{ProtectedSandApp.s("お\u0001"), ProtectedSandApp.s("か\u0001")}).getInputStream(), Charset.defaultCharset()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        z4 = false;
                        break;
                    }
                    if (-1 != readLine.toLowerCase().indexOf(ProtectedSandApp.s("が\u0001"))) {
                        z4 = true;
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        com.tencent.beacon.base.util.c.a(th);
                        com.tencent.beacon.base.util.b.a(bufferedReader);
                        return false;
                    } catch (Throwable th2) {
                        com.tencent.beacon.base.util.b.a(bufferedReader);
                        throw th2;
                    }
                }
            }
            com.tencent.beacon.base.util.b.a(bufferedReader);
            return z4;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public String F() {
        String s4 = ProtectedSandApp.s("き\u0001");
        if (TextUtils.isEmpty(this.f71099f)) {
            try {
                Class<?> cls = Class.forName(ProtectedSandApp.s("ぎ\u0001"));
                String s5 = ProtectedSandApp.s("ぐ\u0001").equals(cls.getMethod(ProtectedSandApp.s("く\u0001"), null).invoke(cls, null)) ? ProtectedSandApp.s("け\u0001") : s4;
                this.f71099f = s5;
                return s5;
            } catch (Throwable unused) {
                this.f71099f = s4;
            }
        }
        return this.f71099f;
    }

    public String a(Context context) {
        String s4 = ProtectedSandApp.s("げ\u0001");
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("こ\u0001"), new Object[0]);
                return "";
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            com.tencent.beacon.base.util.c.a(s4 + String.valueOf(packageInfo.lastUpdateTime), new Object[0]);
            return String.valueOf(packageInfo.lastUpdateTime);
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("ご\u0001"), new Object[0]);
            return "";
        }
    }

    @Override // com.tencent.beacon.base.net.b.e.a
    public void b() {
        G();
    }

    public boolean c() {
        return Environment.getExternalStorageState().equals(ProtectedSandApp.s("さ\u0001"));
    }

    public String d() {
        return this.f71095b;
    }

    public int e() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{ProtectedSandApp.s("お\u0001"), ProtectedSandApp.s("ざ\u0001")}).getInputStream(), Charset.forName(ProtectedSandApp.s("し\u0001"))));
            try {
                String readLine = bufferedReader.readLine();
                int parseInt = readLine != null ? Integer.parseInt(readLine.trim()) / 1000 : 0;
                com.tencent.beacon.base.util.b.a(bufferedReader);
                return parseInt;
            } catch (Throwable th) {
                th = th;
                try {
                    com.tencent.beacon.base.util.c.a(th);
                    com.tencent.beacon.base.util.b.a(bufferedReader);
                    return 0;
                } catch (Throwable th2) {
                    com.tencent.beacon.base.util.b.a(bufferedReader);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r2 = r3.substring(r3.indexOf(com.flashget.parentalcontrol.ProtectedSandApp.s("す\u0001")) + 1).trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String f() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = ""
            java.lang.String r3 = "お\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            java.lang.String r4 = "か\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L64
            java.lang.Process r3 = r4.exec(r3)     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L64
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "し\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Throwable -> L64
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L64
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L64
        L34:
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L5c
            java.lang.String r5 = "じ\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            boolean r5 = r3.contains(r5)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L34
            java.lang.String r5 = "す\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            int r5 = r3.indexOf(r5)     // Catch: java.lang.Throwable -> L5a
            int r5 = r5 + r1
            java.lang.String r3 = r3.substring(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r3.trim()     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r3 = move-exception
            goto L66
        L5c:
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r0] = r4
            com.tencent.beacon.base.util.b.a(r1)
            goto L70
        L64:
            r3 = move-exception
            r4 = 0
        L66:
            com.tencent.beacon.base.util.c.a(r3)     // Catch: java.lang.Throwable -> L71
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r0] = r4
            com.tencent.beacon.base.util.b.a(r1)
        L70:
            return r2
        L71:
            r2 = move-exception
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r0] = r4
            com.tencent.beacon.base.util.b.a(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.c.e.f():java.lang.String");
    }

    public String g() {
        return Locale.getDefault().getCountry();
    }

    public String h() {
        return Build.HARDWARE;
    }

    public DisplayMetrics i() {
        Context b5 = c.c().b();
        if (b5 == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) b5.getSystemService(ProtectedSandApp.s("ず\u0001"));
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public long j() {
        Context b5 = c.c().b();
        if (b5 == null) {
            return -1L;
        }
        ActivityManager activityManager = (ActivityManager) b5.getSystemService(ProtectedSandApp.s("せ\u0001"));
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public String k() {
        long j4 = j();
        return j4 > 0 ? android.support.v4.media.session.b.a(new StringBuilder(), (j4 / 1024) / 1024, "") : ProtectedSandApp.s("ぜ\u0001");
    }

    public boolean m() {
        return com.tencent.beacon.base.util.g.d();
    }

    public String n() {
        return Locale.getDefault().getLanguage();
    }

    public String o() {
        return Build.MANUFACTURER;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public java.lang.String p() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.c.e.p():java.lang.String");
    }

    public String q() {
        return this.f71098e;
    }

    public String r() {
        return this.f71101h;
    }

    public int s() {
        try {
            File[] listFiles = new File(ProtectedSandApp.s("っ\u0001")).listFiles(new d(this));
            if (listFiles == null) {
                return 1;
            }
            return listFiles.length;
        } catch (Exception e4) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("つ\u0001"), new Object[0]);
            com.tencent.beacon.base.util.c.a(e4);
            return 1;
        }
    }

    public String t() {
        if (!TextUtils.isEmpty(this.f71096c)) {
            return this.f71096c;
        }
        String str = ProtectedSandApp.s("づ\u0001") + Build.VERSION.RELEASE + ProtectedSandApp.s("て\u0001") + Build.VERSION.SDK;
        this.f71096c = str;
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("で\u0001"), str);
        return this.f71096c;
    }

    public String u() {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String readLine;
        String s4 = ProtectedSandApp.s("と\u0001");
        try {
            fileReader = new FileReader(ProtectedSandApp.s("ど\u0001"));
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable th) {
                    th = th;
                    try {
                        com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("ぬ\u0001"), new Object[0]);
                        com.tencent.beacon.base.util.c.a(th);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                com.tencent.beacon.base.util.c.b(s4, new Object[0]);
                                com.tencent.beacon.base.util.c.a(th2);
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return null;
                    } catch (Throwable th3) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th4) {
                                com.tencent.beacon.base.util.c.b(s4, new Object[0]);
                                com.tencent.beacon.base.util.c.a(th4);
                                throw th3;
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
            }
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            fileReader = null;
        }
        if (readLine == null) {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th7) {
                com.tencent.beacon.base.util.c.b(s4, new Object[0]);
                com.tencent.beacon.base.util.c.a(th7);
            }
            return null;
        }
        String str = (Long.parseLong(readLine.split(ProtectedSandApp.s("な\u0001"), 2)[1].toLowerCase().replace(ProtectedSandApp.s("に\u0001"), "").trim()) / 1024) + "";
        try {
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable th8) {
            com.tencent.beacon.base.util.c.b(s4, new Object[0]);
            com.tencent.beacon.base.util.c.a(th8);
        }
        return str;
    }

    public String v() {
        DisplayMetrics i4 = i();
        if (i4 == null) {
            return "";
        }
        return i4.widthPixels + ProtectedSandApp.s("ね\u0001") + i4.heightPixels;
    }

    public String w() {
        ArrayList<String> a5 = com.tencent.beacon.base.util.b.a(new String[]{ProtectedSandApp.s("ば\u0001"), ProtectedSandApp.s("の\u0001"), ProtectedSandApp.s("は\u0001")});
        return (a5 == null || a5.size() <= 0) ? "" : a5.get(0);
    }

    public String x() {
        if (!TextUtils.isEmpty(this.f71097d)) {
            return this.f71097d;
        }
        this.f71097d = android.support.v4.media.session.b.a(new StringBuilder(), ((r1.getBlockCount() * new StatFs(Environment.getDataDirectory().getPath()).getBlockSize()) / 1024) / 1024, "");
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ぱ\u0001") + this.f71097d, new Object[0]);
        return this.f71097d;
    }

    public long y() {
        if (!c()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((statFs.getBlockCount() * statFs.getBlockSize()) / 1024) / 1024;
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            return 0L;
        }
    }

    public int z() {
        Context b5 = c.c().b();
        if (b5 == null) {
            return -1;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) b5.getSystemService(ProtectedSandApp.s("ず\u0001"));
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            double d5 = displayMetrics.density;
            if (d5 - 0.75d <= 1.0E-6d) {
                return 120;
            }
            if (d5 - 1.5d <= 1.0E-6d) {
                return 240;
            }
            if (d5 - 2.0d <= 1.0E-6d) {
                return 320;
            }
            if (d5 - 3.0d <= 1.0E-6d) {
                return 480;
            }
        }
        return 160;
    }

    @Override // com.tencent.beacon.base.net.b.e.a
    public void a() {
        G();
    }
}
