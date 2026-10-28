package org.apache.commons.lang3;

import java.io.File;

/* compiled from: SystemUtils.java */
/* loaded from: classes6.dex */
public class c1 {
    private static final n0 A;
    public static final boolean A0;
    public static final String B;
    public static final boolean B0;
    public static final String C;
    public static final boolean C0;
    public static final String D;
    public static final boolean D0;
    public static final String E;
    public static final boolean E0;
    public static final String F;
    public static final boolean F0;
    public static final String G;
    public static final boolean G0;
    public static final String H;
    public static final boolean H0;
    public static final String I;
    public static final boolean I0;
    public static final String J;
    public static final boolean J0;
    public static final String K;
    public static final boolean K0;
    public static final String L;
    public static final boolean L0;

    @Deprecated
    public static final String M;
    public static final boolean M0;
    public static final String N;
    public static final boolean N0;
    public static final String O;
    public static final boolean O0;
    public static final String P;
    public static final boolean P0;

    @Deprecated
    public static final String Q;
    public static final boolean Q0;
    public static final String R;
    public static final boolean R0;
    public static final String S;
    public static final boolean S0;
    public static final String T;
    public static final boolean T0;
    public static final String U;
    public static final boolean U0;
    public static final String V;
    public static final boolean V0;
    public static final String W;
    public static final boolean W0;
    public static final boolean X;
    public static final boolean X0;
    public static final boolean Y;
    public static final boolean Y0;
    public static final boolean Z;
    public static final boolean Z0;

    /* renamed from: a0, reason: collision with root package name */
    public static final boolean f85807a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final boolean f85808a1;

    /* renamed from: b0, reason: collision with root package name */
    public static final boolean f85810b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final boolean f85811b1;

    /* renamed from: c0, reason: collision with root package name */
    public static final boolean f85813c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final boolean f85815d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final boolean f85817e0;

    /* renamed from: f0, reason: collision with root package name */
    @Deprecated
    public static final boolean f85819f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final boolean f85821g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final boolean f85823h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final boolean f85825i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f85827j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f85829k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f85831l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final boolean f85833m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final boolean f85835n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final boolean f85837o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final boolean f85839p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final boolean f85841q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final boolean f85843r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final boolean f85845s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final boolean f85847t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final boolean f85849u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final boolean f85851v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final boolean f85853w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final boolean f85855x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final boolean f85857y0;

    /* renamed from: z, reason: collision with root package name */
    public static final String f85858z;

    /* renamed from: z0, reason: collision with root package name */
    public static final boolean f85859z0;

    /* renamed from: a, reason: collision with root package name */
    private static final String f85806a = "Windows";

    /* renamed from: b, reason: collision with root package name */
    private static final String f85809b = "user.home";

    /* renamed from: c, reason: collision with root package name */
    private static final String f85812c = "user.name";

    /* renamed from: d, reason: collision with root package name */
    private static final String f85814d = "user.dir";

    /* renamed from: e, reason: collision with root package name */
    private static final String f85816e = "java.io.tmpdir";

    /* renamed from: f, reason: collision with root package name */
    private static final String f85818f = "java.home";

    /* renamed from: g, reason: collision with root package name */
    public static final String f85820g = h("awt.toolkit");

    /* renamed from: h, reason: collision with root package name */
    public static final String f85822h = h("file.encoding");

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final String f85824i = h("file.separator");

    /* renamed from: j, reason: collision with root package name */
    public static final String f85826j = h("java.awt.fonts");

    /* renamed from: k, reason: collision with root package name */
    public static final String f85828k = h("java.awt.graphicsenv");

    /* renamed from: l, reason: collision with root package name */
    public static final String f85830l = h("java.awt.headless");

    /* renamed from: m, reason: collision with root package name */
    public static final String f85832m = h("java.awt.printerjob");

    /* renamed from: n, reason: collision with root package name */
    public static final String f85834n = h("java.class.path");

    /* renamed from: o, reason: collision with root package name */
    public static final String f85836o = h("java.class.version");

    /* renamed from: p, reason: collision with root package name */
    public static final String f85838p = h("java.compiler");

    /* renamed from: q, reason: collision with root package name */
    public static final String f85840q = h("java.endorsed.dirs");

    /* renamed from: r, reason: collision with root package name */
    public static final String f85842r = h("java.ext.dirs");

    /* renamed from: s, reason: collision with root package name */
    public static final String f85844s = h("java.home");

    /* renamed from: t, reason: collision with root package name */
    public static final String f85846t = h("java.io.tmpdir");

    /* renamed from: u, reason: collision with root package name */
    public static final String f85848u = h("java.library.path");

    /* renamed from: v, reason: collision with root package name */
    public static final String f85850v = h("java.runtime.name");

    /* renamed from: w, reason: collision with root package name */
    public static final String f85852w = h("java.runtime.version");

    /* renamed from: x, reason: collision with root package name */
    public static final String f85854x = h("java.specification.name");

    /* renamed from: y, reason: collision with root package name */
    public static final String f85856y = h("java.specification.vendor");

    static {
        String h4 = h("java.specification.version");
        f85858z = h4;
        A = n0.get(h4);
        B = h("java.util.prefs.PreferencesFactory");
        C = h("java.vendor");
        D = h("java.vendor.url");
        E = h("java.version");
        F = h("java.vm.info");
        G = h("java.vm.name");
        H = h("java.vm.specification.name");
        I = h("java.vm.specification.vendor");
        J = h("java.vm.specification.version");
        K = h("java.vm.vendor");
        L = h("java.vm.version");
        M = h("line.separator");
        N = h("os.arch");
        String h5 = h("os.name");
        O = h5;
        P = h("os.version");
        Q = h("path.separator");
        R = h(h("user.country") == null ? "user.region" : "user.country");
        S = h("user.dir");
        T = h("user.home");
        U = h("user.language");
        V = h("user.name");
        W = h("user.timezone");
        X = p(h4, "1.1");
        Y = p(h4, "1.2");
        Z = p(h4, "1.3");
        f85807a0 = p(h4, "1.4");
        f85810b0 = p(h4, "1.5");
        f85813c0 = p(h4, "1.6");
        f85815d0 = p(h4, "1.7");
        f85817e0 = p(h4, "1.8");
        f85819f0 = p(h4, "9");
        f85821g0 = p(h4, "9");
        f85823h0 = p(h4, "10");
        f85825i0 = p(h4, "11");
        f85827j0 = p(h4, "12");
        f85829k0 = p(h4, "13");
        f85831l0 = p(h4, "14");
        f85833m0 = p(h4, "15");
        boolean r4 = r(h5, "AIX");
        f85835n0 = r4;
        boolean r5 = r(h5, "HP-UX");
        f85837o0 = r5;
        f85839p0 = r(h5, "OS/400");
        boolean r6 = r(h5, "Irix");
        f85841q0 = r6;
        boolean z4 = true;
        boolean z5 = r(h5, "Linux") || r(h5, "LINUX");
        f85843r0 = z5;
        f85845s0 = r(h5, "Mac");
        boolean r7 = r(h5, "Mac OS X");
        f85847t0 = r7;
        f85849u0 = f("Mac OS X", "10.0");
        f85851v0 = f("Mac OS X", "10.1");
        f85853w0 = f("Mac OS X", "10.2");
        f85855x0 = f("Mac OS X", "10.3");
        f85857y0 = f("Mac OS X", "10.4");
        f85859z0 = f("Mac OS X", "10.5");
        A0 = f("Mac OS X", "10.6");
        B0 = f("Mac OS X", "10.7");
        C0 = f("Mac OS X", "10.8");
        D0 = f("Mac OS X", "10.9");
        E0 = f("Mac OS X", "10.10");
        F0 = f("Mac OS X", "10.11");
        boolean r10 = r(h5, "FreeBSD");
        G0 = r10;
        boolean r11 = r(h5, "OpenBSD");
        H0 = r11;
        boolean r12 = r(h5, "NetBSD");
        I0 = r12;
        J0 = r(h5, "OS/2");
        boolean r13 = r(h5, "Solaris");
        K0 = r13;
        boolean r14 = r(h5, "SunOS");
        L0 = r14;
        if (!r4 && !r5 && !r6 && !z5 && !r7 && !r13 && !r14 && !r10 && !r11 && !r12) {
            z4 = false;
        }
        M0 = z4;
        N0 = r(h5, "Windows");
        O0 = r(h5, "Windows 2000");
        P0 = r(h5, "Windows 2003");
        Q0 = r(h5, "Windows Server 2008");
        R0 = r(h5, "Windows Server 2012");
        S0 = r(h5, "Windows 95");
        T0 = r(h5, "Windows 98");
        U0 = r(h5, "Windows Me");
        V0 = r(h5, "Windows NT");
        W0 = r(h5, "Windows XP");
        X0 = r(h5, "Windows Vista");
        Y0 = r(h5, "Windows 7");
        Z0 = r(h5, "Windows 8");
        f85808a1 = r(h5, "Windows 10");
        f85811b1 = r(h5, "z/OS");
    }

    public static String a(String str, String str2) {
        try {
            String str3 = System.getenv(str);
            return str3 == null ? str2 : str3;
        } catch (SecurityException unused) {
            return str2;
        }
    }

    public static String b() {
        return System.getenv(N0 ? "COMPUTERNAME" : "HOSTNAME");
    }

    public static File c() {
        return new File(System.getProperty("java.home"));
    }

    public static File d() {
        return new File(System.getProperty("java.io.tmpdir"));
    }

    private static boolean e(String str) {
        return p(f85858z, str);
    }

    private static boolean f(String str, String str2) {
        return q(O, P, str, str2);
    }

    private static boolean g(String str) {
        return r(O, str);
    }

    private static String h(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static File i() {
        return new File(System.getProperty("user.dir"));
    }

    public static File j() {
        return new File(System.getProperty("user.home"));
    }

    public static String k() {
        return System.getProperty("user.name");
    }

    public static String l(String str) {
        return System.getProperty("user.name", str);
    }

    public static boolean m() {
        return Boolean.TRUE.toString().equals(f85830l);
    }

    public static boolean n(n0 n0Var) {
        return A.atLeast(n0Var);
    }

    public static boolean o(n0 n0Var) {
        return A.atMost(n0Var);
    }

    static boolean p(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    static boolean q(String str, String str2, String str3, String str4) {
        return str != null && str2 != null && r(str, str3) && s(str2, str4);
    }

    static boolean r(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    static boolean s(String str, String str2) {
        if (b1.G0(str)) {
            return false;
        }
        String[] split = str2.split("\\.");
        String[] split2 = str.split("\\.");
        for (int i4 = 0; i4 < Math.min(split.length, split2.length); i4++) {
            if (!split[i4].equals(split2[i4])) {
                return false;
            }
        }
        return true;
    }
}
