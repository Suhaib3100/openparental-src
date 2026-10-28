package com.thetransactioncompany.jsonrpc2.client;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.Proxy;
import java.util.regex.Pattern;

/* compiled from: JSONRPC2SessionOptions.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: m, reason: collision with root package name */
    public static final String f72829m = ProtectedSandApp.s("嶹\u0001");

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f72830n = {ProtectedSandApp.s("嶹\u0001"), ProtectedSandApp.s("嶺\u0001")};

    /* renamed from: o, reason: collision with root package name */
    public static final String f72831o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f72832p = false;

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f72833q = false;

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f72834r = false;

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f72835s = false;

    /* renamed from: t, reason: collision with root package name */
    public static final int f72836t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f72837u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f72838v = false;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f72839w = false;

    /* renamed from: a, reason: collision with root package name */
    private String f72840a = ProtectedSandApp.s("嶹\u0001");

    /* renamed from: b, reason: collision with root package name */
    private String[] f72841b = f72830n;

    /* renamed from: c, reason: collision with root package name */
    private String f72842c = f72831o;

    /* renamed from: d, reason: collision with root package name */
    private boolean f72843d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f72844e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f72845f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f72846g = false;

    /* renamed from: h, reason: collision with root package name */
    private int f72847h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f72848i = 0;

    /* renamed from: j, reason: collision with root package name */
    private Proxy f72849j = null;

    /* renamed from: k, reason: collision with root package name */
    private boolean f72850k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f72851l = false;

    public void a(boolean z4) {
        this.f72843d = z4;
    }

    public boolean b() {
        return this.f72843d;
    }

    public void c(boolean z4) {
        this.f72850k = z4;
    }

    public boolean d() {
        return this.f72850k;
    }

    public String[] e() {
        return this.f72841b;
    }

    public int f() {
        return this.f72847h;
    }

    public String g() {
        return this.f72842c;
    }

    public Proxy h() {
        return this.f72849j;
    }

    public int i() {
        return this.f72848i;
    }

    public String j() {
        return this.f72840a;
    }

    public void k(boolean z4) {
        this.f72845f = z4;
    }

    public boolean l() {
        return this.f72845f;
    }

    public boolean m(String str) {
        String[] strArr = this.f72841b;
        if (strArr == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.matches(ProtectedSandApp.s("嶻\u0001") + Pattern.quote(str2) + ProtectedSandApp.s("嶼\u0001"))) {
                return true;
            }
        }
        return false;
    }

    public void n(boolean z4) {
        this.f72846g = z4;
    }

    public boolean o() {
        return this.f72846g;
    }

    public void p(boolean z4) {
        this.f72844e = z4;
    }

    public boolean q() {
        return this.f72844e;
    }

    public void r(String[] strArr) {
        this.f72841b = strArr;
    }

    public void s(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嶽\u0001"));
        }
        this.f72847h = i4;
    }

    public void t(String str) {
        this.f72842c = str;
    }

    public void u(Proxy proxy) {
        this.f72849j = proxy;
    }

    public void v(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嶾\u0001"));
        }
        this.f72848i = i4;
    }

    public void w(String str) {
        this.f72840a = str;
    }

    public void x(boolean z4) {
        this.f72851l = z4;
    }

    public boolean y() {
        return this.f72851l;
    }
}
