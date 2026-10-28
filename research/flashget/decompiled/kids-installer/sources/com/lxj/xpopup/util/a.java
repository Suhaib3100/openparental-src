package com.lxj.xpopup.util;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* compiled from: FuckRomUtils.java */
/* loaded from: classes5.dex */
public final class a {
    private static final String A = ProtectedSandApp.s("㔞");
    private static final String B = ProtectedSandApp.s("㔟");
    private static final String C = ProtectedSandApp.s("㔠");
    private static final String D = ProtectedSandApp.s("㔡");

    /* renamed from: u, reason: collision with root package name */
    private static final String f21304u = ProtectedSandApp.s("㔢");

    /* renamed from: v, reason: collision with root package name */
    private static final String f21305v = ProtectedSandApp.s("㔣");

    /* renamed from: w, reason: collision with root package name */
    private static final String f21306w = ProtectedSandApp.s("㔤");

    /* renamed from: x, reason: collision with root package name */
    private static final String f21307x = ProtectedSandApp.s("㔥");

    /* renamed from: y, reason: collision with root package name */
    private static final String f21308y = ProtectedSandApp.s("㔦");

    /* renamed from: z, reason: collision with root package name */
    private static final String f21309z = ProtectedSandApp.s("㔧");

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f21284a = {ProtectedSandApp.s("㔨")};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f21285b = {ProtectedSandApp.s("㔩")};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f21286c = {ProtectedSandApp.s("㔪")};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f21287d = {ProtectedSandApp.s("㔫")};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f21288e = {ProtectedSandApp.s("㔬"), ProtectedSandApp.s("㔭")};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f21289f = {ProtectedSandApp.s("㔮"), ProtectedSandApp.s("㔯")};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f21290g = {ProtectedSandApp.s("㔰")};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f21291h = {ProtectedSandApp.s("㔱")};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f21292i = {ProtectedSandApp.s("㔲")};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f21293j = {ProtectedSandApp.s("㔳"), ProtectedSandApp.s("㔴")};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f21294k = {ProtectedSandApp.s("㔵"), ProtectedSandApp.s("㔶")};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f21295l = {ProtectedSandApp.s("㔷")};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f21296m = {ProtectedSandApp.s("㔸")};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f21297n = {ProtectedSandApp.s("㔹")};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f21298o = {ProtectedSandApp.s("㔺")};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f21299p = {ProtectedSandApp.s("㔻")};

    /* renamed from: q, reason: collision with root package name */
    private static final String[] f21300q = {ProtectedSandApp.s("㔼")};

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f21301r = {ProtectedSandApp.s("㔽")};

    /* renamed from: s, reason: collision with root package name */
    private static final String[] f21302s = {ProtectedSandApp.s("㔾"), ProtectedSandApp.s("㔿")};

    /* renamed from: t, reason: collision with root package name */
    private static final String[] f21303t = {ProtectedSandApp.s("㕀")};
    private static C0240a E = null;

    /* compiled from: FuckRomUtils.java */
    /* renamed from: com.lxj.xpopup.util.a$a, reason: collision with other inner class name */
    public static class C0240a {

        /* renamed from: a, reason: collision with root package name */
        private String f21310a;

        /* renamed from: b, reason: collision with root package name */
        private String f21311b;

        public String d() {
            return this.f21310a;
        }

        public String e() {
            return this.f21311b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("㔛"));
            sb.append(this.f21310a);
            sb.append(ProtectedSandApp.s("㔜"));
            return androidx.concurrent.futures.a.a(sb, this.f21311b, ProtectedSandApp.s("㔝"));
        }
    }

    private a() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㕁"));
    }

    public static boolean A() {
        return f21285b[0].equals(c().f21310a);
    }

    public static boolean B() {
        return f21286c[0].equals(c().f21310a);
    }

    public static boolean C() {
        return f21290g[0].equals(c().f21310a);
    }

    private static String a() {
        try {
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
        } catch (Throwable unused) {
        }
        return ProtectedSandApp.s("㕂");
    }

    private static String b() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
        } catch (Throwable unused) {
        }
        return ProtectedSandApp.s("㕃");
    }

    public static C0240a c() {
        C0240a c0240a = E;
        if (c0240a != null) {
            return c0240a;
        }
        E = new C0240a();
        String a6 = a();
        String b6 = b();
        String[] strArr = f21284a;
        if (w(a6, b6, strArr)) {
            E.f21310a = strArr[0];
            String d6 = d(ProtectedSandApp.s("㕄"));
            String[] split = d6.split(ProtectedSandApp.s("㕅"));
            if (split.length > 1) {
                E.f21311b = split[1];
            } else {
                E.f21311b = d6;
            }
            return E;
        }
        String[] strArr2 = f21285b;
        if (w(a6, b6, strArr2)) {
            E.f21310a = strArr2[0];
            E.f21311b = d(ProtectedSandApp.s("㕆"));
            return E;
        }
        String[] strArr3 = f21286c;
        if (w(a6, b6, strArr3)) {
            E.f21310a = strArr3[0];
            E.f21311b = d(ProtectedSandApp.s("㕇"));
            return E;
        }
        String[] strArr4 = f21287d;
        if (w(a6, b6, strArr4)) {
            E.f21310a = strArr4[0];
            E.f21311b = d(ProtectedSandApp.s("㕈"));
            return E;
        }
        String[] strArr5 = f21288e;
        if (w(a6, b6, strArr5)) {
            E.f21310a = strArr5[0];
            E.f21311b = d(ProtectedSandApp.s("㕉"));
            return E;
        }
        String[] strArr6 = f21289f;
        if (w(a6, b6, strArr6)) {
            E.f21310a = strArr6[0];
            E.f21311b = d(ProtectedSandApp.s("㕊"));
            return E;
        }
        String[] strArr7 = f21290g;
        if (w(a6, b6, strArr7)) {
            E.f21310a = strArr7[0];
            E.f21311b = d(ProtectedSandApp.s("㕋"));
            return E;
        }
        String[] strArr8 = f21291h;
        if (w(a6, b6, strArr8)) {
            E.f21310a = strArr8[0];
            E.f21311b = d(ProtectedSandApp.s("㕌"));
            return E;
        }
        String[] strArr9 = f21292i;
        if (w(a6, b6, strArr9)) {
            E.f21310a = strArr9[0];
            E.f21311b = d(ProtectedSandApp.s("㕍"));
            return E;
        }
        String[] strArr10 = f21293j;
        if (w(a6, b6, strArr10)) {
            E.f21310a = strArr10[0];
        } else {
            String[] strArr11 = f21294k;
            if (w(a6, b6, strArr11)) {
                E.f21310a = strArr11[0];
            } else {
                String[] strArr12 = f21295l;
                if (w(a6, b6, strArr12)) {
                    E.f21310a = strArr12[0];
                } else {
                    String[] strArr13 = f21296m;
                    if (w(a6, b6, strArr13)) {
                        E.f21310a = strArr13[0];
                    } else {
                        String[] strArr14 = f21297n;
                        if (w(a6, b6, strArr14)) {
                            E.f21310a = strArr14[0];
                        } else {
                            String[] strArr15 = f21298o;
                            if (w(a6, b6, strArr15)) {
                                E.f21310a = strArr15[0];
                            } else {
                                String[] strArr16 = f21299p;
                                if (w(a6, b6, strArr16)) {
                                    E.f21310a = strArr16[0];
                                } else {
                                    String[] strArr17 = f21300q;
                                    if (w(a6, b6, strArr17)) {
                                        E.f21310a = strArr17[0];
                                    } else {
                                        String[] strArr18 = f21301r;
                                        if (w(a6, b6, strArr18)) {
                                            E.f21310a = strArr18[0];
                                        } else {
                                            String[] strArr19 = f21302s;
                                            if (w(a6, b6, strArr19)) {
                                                E.f21310a = strArr19[0];
                                            } else {
                                                String[] strArr20 = f21303t;
                                                if (w(a6, b6, strArr20)) {
                                                    E.f21310a = strArr20[0];
                                                } else {
                                                    E.f21310a = b6;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        E.f21311b = d("");
        return E;
    }

    private static String d(final String propertyName) {
        String e6 = !TextUtils.isEmpty(propertyName) ? e(propertyName) : "";
        boolean isEmpty = TextUtils.isEmpty(e6);
        String s5 = ProtectedSandApp.s("㕎");
        if (isEmpty || e6.equals(s5)) {
            try {
                String str = Build.DISPLAY;
                if (!TextUtils.isEmpty(str)) {
                    e6 = str.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(e6) ? s5 : e6;
    }

    private static String e(final String name) {
        String g5 = g(name);
        if (!TextUtils.isEmpty(g5)) {
            return g5;
        }
        String h5 = h(name);
        return !TextUtils.isEmpty(h5) ? h5 : Build.VERSION.SDK_INT < 28 ? f(name) : h5;
    }

    private static String f(String key) {
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("㕏"));
            return (String) cls.getMethod(ProtectedSandApp.s("㕐"), String.class, String.class).invoke(cls, key, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static String g(final String propName) {
        BufferedReader bufferedReader;
        String readLine;
        String s5 = ProtectedSandApp.s("㕑");
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(s5 + propName).getInputStream()), 1024);
            } catch (IOException unused) {
                return "";
            }
        } catch (IOException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (IOException unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 == null) {
                return "";
            }
            bufferedReader2.close();
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        if (readLine != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
            return readLine;
        }
        bufferedReader.close();
        return "";
    }

    private static String h(final String key) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), ProtectedSandApp.s("㕒"))));
            return properties.getProperty(key, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean i() {
        return f21289f[0].equals(c().f21310a);
    }

    public static boolean j() {
        return f21293j[0].equals(c().f21310a);
    }

    public static boolean k() {
        return f21302s[0].equals(c().f21310a);
    }

    public static boolean l() {
        return f21295l[0].equals(c().f21310a);
    }

    public static boolean m() {
        return f21300q[0].equals(c().f21310a);
    }

    public static boolean n() {
        return f21284a[0].equals(c().f21310a);
    }

    public static boolean o() {
        return f21288e[0].equals(c().f21310a);
    }

    public static boolean p() {
        return f21298o[0].equals(c().f21310a);
    }

    public static boolean q() {
        return f21294k[0].equals(c().f21310a);
    }

    public static boolean r() {
        return f21297n[0].equals(c().f21310a);
    }

    public static boolean s() {
        return f21303t[0].equals(c().f21310a);
    }

    public static boolean t() {
        return f21292i[0].equals(c().f21310a);
    }

    public static boolean u() {
        return f21291h[0].equals(c().f21310a);
    }

    public static boolean v() {
        return f21287d[0].equals(c().f21310a);
    }

    private static boolean w(final String brand, final String manufacturer, final String... names) {
        for (String str : names) {
            if (brand.contains(str) || manufacturer.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean x() {
        return f21296m[0].equals(c().f21310a);
    }

    public static boolean y() {
        return f21299p[0].equals(c().f21310a);
    }

    public static boolean z() {
        return f21301r[0].equals(c().f21310a);
    }
}
