package com.tencent.beacon.d;

import android.content.Context;
import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: StrategyHolder.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile h f71437a;

    /* renamed from: c, reason: collision with root package name */
    private d f71439c;

    /* renamed from: i, reason: collision with root package name */
    private String f71445i;

    /* renamed from: b, reason: collision with root package name */
    private final String f71438b = ProtectedSandApp.s("㈬\u0001");

    /* renamed from: d, reason: collision with root package name */
    private String f71440d = "";

    /* renamed from: e, reason: collision with root package name */
    private boolean f71441e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f71442f = 8081;

    /* renamed from: g, reason: collision with root package name */
    private String f71443g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f71444h = "";

    private h() {
        com.tencent.beacon.a.b.b.a().a(new f(this));
    }

    public static h d() {
        if (f71437a == null) {
            synchronized (h.class) {
                try {
                    if (f71437a == null) {
                        f71437a = new h();
                    }
                } finally {
                }
            }
        }
        return f71437a;
    }

    public void a(d dVar) {
        this.f71439c = dVar;
    }

    public synchronized void b(String str) {
        this.f71440d = str;
    }

    public synchronized void c() {
        a(com.tencent.beacon.a.d.a.a().getString(ProtectedSandApp.s("㈭\u0001"), ""));
        g();
    }

    public synchronized String e() {
        return this.f71440d;
    }

    public synchronized String f() {
        return this.f71443g;
    }

    public synchronized void g() {
        try {
            Context b5 = com.tencent.beacon.a.c.c.c().b();
            if (b5 == null) {
                return;
            }
            String b6 = com.tencent.beacon.base.util.b.b();
            this.f71444h = b6;
            byte[] a5 = com.tencent.beacon.base.net.b.c.a(b5, b6);
            if (a5 != null) {
                this.f71443g = Base64.encodeToString(a5, 2);
            } else {
                com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("㈮\u0001"), new Object[0]);
                com.tencent.beacon.a.b.j.e().a(ProtectedSandApp.s("㈯\u0001"), ProtectedSandApp.s("㈮\u0001"));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String a() {
        return this.f71444h;
    }

    public String b() {
        return this.f71445i;
    }

    public void a(String str) {
        this.f71445i = str;
    }

    public void c(String str) {
        if (str == null || str.equals(this.f71445i)) {
            return;
        }
        this.f71445i = str;
        com.tencent.beacon.a.b.b.a().a(new g(this, str));
    }
}
