package com.lxj.xpopup.util;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* compiled from: FuckRomUtils.java */
/* loaded from: classes6.dex */
public final class a {
    private static final String A = ProtectedSandApp.s("ឯ\u0001");
    private static final String B = ProtectedSandApp.s("ឰ\u0001");
    private static final String C = ProtectedSandApp.s("ឱ\u0001");
    private static final String D = ProtectedSandApp.s("ឲ\u0001");

    /* renamed from: u, reason: collision with root package name */
    private static final String f69781u = ProtectedSandApp.s("ឳ\u0001");

    /* renamed from: v, reason: collision with root package name */
    private static final String f69782v = ProtectedSandApp.s("឴\u0001");

    /* renamed from: w, reason: collision with root package name */
    private static final String f69783w = ProtectedSandApp.s("឵\u0001");

    /* renamed from: x, reason: collision with root package name */
    private static final String f69784x = ProtectedSandApp.s("ា\u0001");

    /* renamed from: y, reason: collision with root package name */
    private static final String f69785y = ProtectedSandApp.s("ិ\u0001");

    /* renamed from: z, reason: collision with root package name */
    private static final String f69786z = ProtectedSandApp.s("ី\u0001");

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f69761a = {ProtectedSandApp.s("ឹ\u0001")};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f69762b = {ProtectedSandApp.s("ឺ\u0001")};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f69763c = {ProtectedSandApp.s("ុ\u0001")};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f69764d = {ProtectedSandApp.s("ូ\u0001")};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f69765e = {ProtectedSandApp.s("ួ\u0001"), ProtectedSandApp.s("ើ\u0001")};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f69766f = {ProtectedSandApp.s("ឿ\u0001"), ProtectedSandApp.s("ៀ\u0001")};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f69767g = {ProtectedSandApp.s("េ\u0001")};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f69768h = {ProtectedSandApp.s("ែ\u0001")};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f69769i = {ProtectedSandApp.s("ៃ\u0001")};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f69770j = {ProtectedSandApp.s("ោ\u0001"), ProtectedSandApp.s("ៅ\u0001")};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f69771k = {ProtectedSandApp.s("ំ\u0001"), ProtectedSandApp.s("ះ\u0001")};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f69772l = {ProtectedSandApp.s("ៈ\u0001")};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f69773m = {ProtectedSandApp.s("៉\u0001")};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f69774n = {ProtectedSandApp.s("៊\u0001")};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f69775o = {ProtectedSandApp.s("់\u0001")};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f69776p = {ProtectedSandApp.s("៌\u0001")};

    /* renamed from: q, reason: collision with root package name */
    private static final String[] f69777q = {ProtectedSandApp.s("៍\u0001")};

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f69778r = {ProtectedSandApp.s("៎\u0001")};

    /* renamed from: s, reason: collision with root package name */
    private static final String[] f69779s = {ProtectedSandApp.s("៏\u0001"), ProtectedSandApp.s("័\u0001")};

    /* renamed from: t, reason: collision with root package name */
    private static final String[] f69780t = {ProtectedSandApp.s("៑\u0001")};
    private static C0980a E = null;

    /* compiled from: FuckRomUtils.java */
    /* renamed from: com.lxj.xpopup.util.a$a, reason: collision with other inner class name */
    public static class C0980a {

        /* renamed from: a, reason: collision with root package name */
        private String f69787a;

        /* renamed from: b, reason: collision with root package name */
        private String f69788b;

        public String d() {
            return this.f69787a;
        }

        public String e() {
            return this.f69788b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ឬ\u0001"));
            sb.append(this.f69787a);
            sb.append(ProtectedSandApp.s("ឭ\u0001"));
            return android.support.v4.media.c.a(sb, this.f69788b, ProtectedSandApp.s("ឮ\u0001"));
        }
    }

    private a() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("្\u0001"));
    }

    public static boolean A() {
        return f69762b[0].equals(c().f69787a);
    }

    public static boolean B() {
        return f69763c[0].equals(c().f69787a);
    }

    public static boolean C() {
        return f69767g[0].equals(c().f69787a);
    }

    private static String a() {
        try {
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
        } catch (Throwable unused) {
        }
        return ProtectedSandApp.s("ឲ\u0001");
    }

    private static String b() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
        } catch (Throwable unused) {
        }
        return ProtectedSandApp.s("ឲ\u0001");
    }

    public static C0980a c() {
        C0980a c0980a = E;
        if (c0980a != null) {
            return c0980a;
        }
        E = new C0980a();
        String a5 = a();
        String b5 = b();
        String[] strArr = f69761a;
        if (w(a5, b5, strArr)) {
            E.f69787a = strArr[0];
            String d5 = d(ProtectedSandApp.s("ឳ\u0001"));
            String[] split = d5.split(ProtectedSandApp.s("៓\u0001"));
            if (split.length > 1) {
                E.f69788b = split[1];
            } else {
                E.f69788b = d5;
            }
            return E;
        }
        String[] strArr2 = f69762b;
        if (w(a5, b5, strArr2)) {
            E.f69787a = strArr2[0];
            E.f69788b = d(ProtectedSandApp.s("឴\u0001"));
            return E;
        }
        String[] strArr3 = f69763c;
        if (w(a5, b5, strArr3)) {
            E.f69787a = strArr3[0];
            E.f69788b = d(ProtectedSandApp.s("឵\u0001"));
            return E;
        }
        String[] strArr4 = f69764d;
        if (w(a5, b5, strArr4)) {
            E.f69787a = strArr4[0];
            E.f69788b = d(ProtectedSandApp.s("ា\u0001"));
            return E;
        }
        String[] strArr5 = f69765e;
        if (w(a5, b5, strArr5)) {
            E.f69787a = strArr5[0];
            E.f69788b = d(ProtectedSandApp.s("ិ\u0001"));
            return E;
        }
        String[] strArr6 = f69766f;
        if (w(a5, b5, strArr6)) {
            E.f69787a = strArr6[0];
            E.f69788b = d(ProtectedSandApp.s("ី\u0001"));
            return E;
        }
        String[] strArr7 = f69767g;
        if (w(a5, b5, strArr7)) {
            E.f69787a = strArr7[0];
            E.f69788b = d(ProtectedSandApp.s("ឯ\u0001"));
            return E;
        }
        String[] strArr8 = f69768h;
        if (w(a5, b5, strArr8)) {
            E.f69787a = strArr8[0];
            E.f69788b = d(ProtectedSandApp.s("ឰ\u0001"));
            return E;
        }
        String[] strArr9 = f69769i;
        if (w(a5, b5, strArr9)) {
            E.f69787a = strArr9[0];
            E.f69788b = d(ProtectedSandApp.s("ឱ\u0001"));
            return E;
        }
        String[] strArr10 = f69770j;
        if (w(a5, b5, strArr10)) {
            E.f69787a = strArr10[0];
        } else {
            String[] strArr11 = f69771k;
            if (w(a5, b5, strArr11)) {
                E.f69787a = strArr11[0];
            } else {
                String[] strArr12 = f69772l;
                if (w(a5, b5, strArr12)) {
                    E.f69787a = strArr12[0];
                } else {
                    String[] strArr13 = f69773m;
                    if (w(a5, b5, strArr13)) {
                        E.f69787a = strArr13[0];
                    } else {
                        String[] strArr14 = f69774n;
                        if (w(a5, b5, strArr14)) {
                            E.f69787a = strArr14[0];
                        } else {
                            String[] strArr15 = f69775o;
                            if (w(a5, b5, strArr15)) {
                                E.f69787a = strArr15[0];
                            } else {
                                String[] strArr16 = f69776p;
                                if (w(a5, b5, strArr16)) {
                                    E.f69787a = strArr16[0];
                                } else {
                                    String[] strArr17 = f69777q;
                                    if (w(a5, b5, strArr17)) {
                                        E.f69787a = strArr17[0];
                                    } else {
                                        String[] strArr18 = f69778r;
                                        if (w(a5, b5, strArr18)) {
                                            E.f69787a = strArr18[0];
                                        } else {
                                            String[] strArr19 = f69779s;
                                            if (w(a5, b5, strArr19)) {
                                                E.f69787a = strArr19[0];
                                            } else {
                                                String[] strArr20 = f69780t;
                                                if (w(a5, b5, strArr20)) {
                                                    E.f69787a = strArr20[0];
                                                } else {
                                                    E.f69787a = b5;
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
        E.f69788b = d("");
        return E;
    }

    private static String d(final String propertyName) {
        String e4 = !TextUtils.isEmpty(propertyName) ? e(propertyName) : "";
        boolean isEmpty = TextUtils.isEmpty(e4);
        String s4 = ProtectedSandApp.s("ឲ\u0001");
        if (isEmpty || e4.equals(s4)) {
            try {
                String str = Build.DISPLAY;
                if (!TextUtils.isEmpty(str)) {
                    e4 = str.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(e4) ? s4 : e4;
    }

    private static String e(final String name) {
        String g4 = g(name);
        if (!TextUtils.isEmpty(g4)) {
            return g4;
        }
        String h4 = h(name);
        return !TextUtils.isEmpty(h4) ? h4 : Build.VERSION.SDK_INT < 28 ? f(name) : h4;
    }

    private static String f(String key) {
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("។\u0001"));
            return (String) cls.getMethod(ProtectedSandApp.s("៕\u0001"), String.class, String.class).invoke(cls, key, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static String g(final String propName) {
        BufferedReader bufferedReader;
        String readLine;
        String s4 = ProtectedSandApp.s("៖\u0001");
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(s4 + propName).getInputStream()), 1024);
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
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), ProtectedSandApp.s("ៗ\u0001"))));
            return properties.getProperty(key, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean i() {
        return f69766f[0].equals(c().f69787a);
    }

    public static boolean j() {
        return f69770j[0].equals(c().f69787a);
    }

    public static boolean k() {
        return f69779s[0].equals(c().f69787a);
    }

    public static boolean l() {
        return f69772l[0].equals(c().f69787a);
    }

    public static boolean m() {
        return f69777q[0].equals(c().f69787a);
    }

    public static boolean n() {
        return f69761a[0].equals(c().f69787a);
    }

    public static boolean o() {
        return f69765e[0].equals(c().f69787a);
    }

    public static boolean p() {
        return f69775o[0].equals(c().f69787a);
    }

    public static boolean q() {
        return f69771k[0].equals(c().f69787a);
    }

    public static boolean r() {
        return f69774n[0].equals(c().f69787a);
    }

    public static boolean s() {
        return f69780t[0].equals(c().f69787a);
    }

    public static boolean t() {
        return f69769i[0].equals(c().f69787a);
    }

    public static boolean u() {
        return f69768h[0].equals(c().f69787a);
    }

    public static boolean v() {
        return f69764d[0].equals(c().f69787a);
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
        return f69773m[0].equals(c().f69787a);
    }

    public static boolean y() {
        return f69776p[0].equals(c().f69787a);
    }

    public static boolean z() {
        return f69778r[0].equals(c().f69787a);
    }
}
