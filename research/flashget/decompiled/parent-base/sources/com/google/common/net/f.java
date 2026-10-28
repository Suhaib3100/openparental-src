package com.google.common.net;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c0;
import com.google.common.base.g0;
import com.google.common.base.l0;
import com.google.common.base.q0;
import com.google.common.collect.f3;
import java.util.List;

/* compiled from: InternetDomainName.java */
@a
@f9.j
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.common.base.f f57358e = com.google.common.base.f.d(ProtectedSandApp.s("\uf7e9"));

    /* renamed from: f, reason: collision with root package name */
    private static final q0 f57359f = q0.h('.');

    /* renamed from: g, reason: collision with root package name */
    private static final c0 f57360g = c0.o('.');

    /* renamed from: h, reason: collision with root package name */
    private static final int f57361h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f57362i = 127;

    /* renamed from: j, reason: collision with root package name */
    private static final int f57363j = 253;

    /* renamed from: k, reason: collision with root package name */
    private static final int f57364k = 63;

    /* renamed from: l, reason: collision with root package name */
    private static final com.google.common.base.f f57365l;

    /* renamed from: m, reason: collision with root package name */
    private static final com.google.common.base.f f57366m;

    /* renamed from: n, reason: collision with root package name */
    private static final com.google.common.base.f f57367n;

    /* renamed from: o, reason: collision with root package name */
    private static final com.google.common.base.f f57368o;

    /* renamed from: a, reason: collision with root package name */
    private final String f57369a;

    /* renamed from: b, reason: collision with root package name */
    private final f3<String> f57370b;

    /* renamed from: c, reason: collision with root package name */
    private final int f57371c;

    /* renamed from: d, reason: collision with root package name */
    private final int f57372d;

    static {
        com.google.common.base.f d5 = com.google.common.base.f.d(ProtectedSandApp.s("\uf7ea"));
        f57365l = d5;
        com.google.common.base.f m4 = com.google.common.base.f.m('0', '9');
        f57366m = m4;
        com.google.common.base.f I = com.google.common.base.f.m('a', 'z').I(com.google.common.base.f.m('A', 'Z'));
        f57367n = I;
        f57368o = m4.I(I).I(d5);
    }

    f(String str) {
        String g4 = com.google.common.base.c.g(f57358e.N(str, '.'));
        g4 = g4.endsWith(ProtectedSandApp.s("\uf7eb")) ? androidx.core.content.f.a(g4, 1, 0) : g4;
        l0.u(g4.length() <= f57363j, ProtectedSandApp.s("\uf7ec"), g4);
        this.f57369a = g4;
        f3<String> w4 = f3.w(f57359f.n(g4));
        this.f57370b = w4;
        l0.u(w4.size() <= 127, ProtectedSandApp.s("\uf7ed"), g4);
        l0.u(x(w4), ProtectedSandApp.s("\uf7ee"), g4);
        this.f57371c = c(g0.a());
        this.f57372d = c(g0.f(com.google.thirdparty.publicsuffix.b.REGISTRY));
    }

    private f a(int i4) {
        c0 c0Var = f57360g;
        f3<String> f3Var = this.f57370b;
        return d(c0Var.k(f3Var.subList(i4, f3Var.size())));
    }

    private int c(g0<com.google.thirdparty.publicsuffix.b> g0Var) {
        int size = this.f57370b.size();
        for (int i4 = 0; i4 < size; i4++) {
            String k4 = f57360g.k(this.f57370b.subList(i4, size));
            if (o(g0Var, g0.c(com.google.thirdparty.publicsuffix.a.f62588a.get(k4)))) {
                return i4;
            }
            if (com.google.thirdparty.publicsuffix.a.f62590c.containsKey(k4)) {
                return i4 + 1;
            }
            if (p(g0Var, k4)) {
                return i4;
            }
        }
        return -1;
    }

    @f9.a
    public static f d(String str) {
        str.getClass();
        return new f(str);
    }

    public static boolean n(String str) {
        try {
            d(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static boolean o(g0<com.google.thirdparty.publicsuffix.b> g0Var, g0<com.google.thirdparty.publicsuffix.b> g0Var2) {
        return g0Var.e() ? g0Var.equals(g0Var2) : g0Var2.e();
    }

    private static boolean p(g0<com.google.thirdparty.publicsuffix.b> g0Var, String str) {
        List<String> o4 = f57359f.f(2).o(str);
        return o4.size() == 2 && o(g0Var, g0.c(com.google.thirdparty.publicsuffix.a.f62589b.get(o4.get(1))));
    }

    private static boolean w(String str, boolean z4) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!f57368o.C(com.google.common.base.f.f().P(str))) {
                return false;
            }
            com.google.common.base.f fVar = f57365l;
            if (!fVar.B(str.charAt(0)) && !fVar.B(str.charAt(str.length() - 1))) {
                return (z4 && f57366m.B(str.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    private static boolean x(List<String> list) {
        int size = list.size() - 1;
        if (!w(list.get(size), true)) {
            return false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (!w(list.get(i4), false)) {
                return false;
            }
        }
        return true;
    }

    public f b(String str) {
        str.getClass();
        String str2 = this.f57369a;
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str2, str.length() + 1));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf7eb"));
        sb.append(str2);
        return d(sb.toString());
    }

    public boolean e() {
        return this.f57370b.size() > 1;
    }

    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f57369a.equals(((f) obj).f57369a);
        }
        return false;
    }

    public boolean f() {
        return this.f57371c != -1;
    }

    public boolean g() {
        return this.f57372d != -1;
    }

    public boolean h() {
        return this.f57371c == 0;
    }

    public int hashCode() {
        return this.f57369a.hashCode();
    }

    public boolean i() {
        return this.f57372d == 0;
    }

    public boolean j() {
        return this.f57372d == 1;
    }

    public boolean k() {
        return this.f57371c == 1;
    }

    public boolean l() {
        return this.f57371c > 0;
    }

    public boolean m() {
        return this.f57372d > 0;
    }

    public f q() {
        l0.x0(e(), ProtectedSandApp.s("\uf7ef"), this.f57369a);
        return a(1);
    }

    public f3<String> r() {
        return this.f57370b;
    }

    @zc.a
    public f s() {
        if (f()) {
            return a(this.f57371c);
        }
        return null;
    }

    @zc.a
    public f t() {
        if (g()) {
            return a(this.f57372d);
        }
        return null;
    }

    public String toString() {
        return this.f57369a;
    }

    public f u() {
        if (j()) {
            return this;
        }
        l0.x0(m(), ProtectedSandApp.s("\uf7f0"), this.f57369a);
        return a(this.f57372d - 1);
    }

    public f v() {
        if (k()) {
            return this;
        }
        l0.x0(l(), ProtectedSandApp.s("\uf7f1"), this.f57369a);
        return a(this.f57371c - 1);
    }
}
