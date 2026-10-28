package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.internal.x;
import com.google.firebase.remoteconfig.r;
import java.util.Date;

/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes6.dex */
public class q {

    /* renamed from: e, reason: collision with root package name */
    @m1
    public static final long f60521e = -1;

    /* renamed from: g, reason: collision with root package name */
    static final int f60523g = 0;

    /* renamed from: h, reason: collision with root package name */
    @m1
    static final int f60524h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static final long f60525i = -1;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f60537a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f60538b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f60539c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f60540d = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final String f60532p = ProtectedSandApp.s("Α\u0001");

    /* renamed from: q, reason: collision with root package name */
    private static final String f60533q = ProtectedSandApp.s("Β\u0001");

    /* renamed from: r, reason: collision with root package name */
    private static final String f60534r = ProtectedSandApp.s("Γ\u0001");

    /* renamed from: s, reason: collision with root package name */
    private static final String f60535s = ProtectedSandApp.s("Δ\u0001");

    /* renamed from: t, reason: collision with root package name */
    private static final String f60536t = ProtectedSandApp.s("Ε\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final String f60527k = ProtectedSandApp.s("Ζ\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static final String f60528l = ProtectedSandApp.s("Η\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final String f60529m = ProtectedSandApp.s("Θ\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f60530n = ProtectedSandApp.s("Ι\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final String f60531o = ProtectedSandApp.s("Κ\u0001");

    /* renamed from: f, reason: collision with root package name */
    static final Date f60522f = new Date(-1);

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final Date f60526j = new Date(-1);

    /* compiled from: ConfigMetadataClient.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f60541a;

        /* renamed from: b, reason: collision with root package name */
        private Date f60542b;

        a(int i4, Date date) {
            this.f60541a = i4;
            this.f60542b = date;
        }

        Date a() {
            return this.f60542b;
        }

        int b() {
            return this.f60541a;
        }
    }

    /* compiled from: ConfigMetadataClient.java */
    @m1
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f60543a;

        /* renamed from: b, reason: collision with root package name */
        private Date f60544b;

        @m1
        public b(int i4, Date date) {
            this.f60543a = i4;
            this.f60544b = date;
        }

        Date a() {
            return this.f60544b;
        }

        int b() {
            return this.f60543a;
        }
    }

    public q(SharedPreferences sharedPreferences) {
        this.f60537a = sharedPreferences;
    }

    @n1
    public void a() {
        synchronized (this.f60538b) {
            this.f60537a.edit().clear().commit();
        }
    }

    a b() {
        a aVar;
        synchronized (this.f60539c) {
            aVar = new a(this.f60537a.getInt(ProtectedSandApp.s("Β\u0001"), 0), new Date(this.f60537a.getLong(ProtectedSandApp.s("Α\u0001"), -1L)));
        }
        return aVar;
    }

    public long c() {
        return this.f60537a.getLong(ProtectedSandApp.s("Ζ\u0001"), 60L);
    }

    public com.google.firebase.remoteconfig.q d() {
        x a5;
        synchronized (this.f60538b) {
            long j4 = this.f60537a.getLong(ProtectedSandApp.s("Ι\u0001"), -1L);
            int i4 = this.f60537a.getInt(ProtectedSandApp.s("Θ\u0001"), 0);
            a5 = new x.b().c(i4).d(j4).b(new r.b().f(this.f60537a.getLong(ProtectedSandApp.s("Ζ\u0001"), 60L)).g(this.f60537a.getLong(ProtectedSandApp.s("Η\u0001"), n.f60490j)).c()).a();
        }
        return a5;
    }

    @q0
    String e() {
        return this.f60537a.getString(ProtectedSandApp.s("Κ\u0001"), null);
    }

    int f() {
        return this.f60537a.getInt(ProtectedSandApp.s("Θ\u0001"), 0);
    }

    Date g() {
        return new Date(this.f60537a.getLong(ProtectedSandApp.s("Ι\u0001"), -1L));
    }

    long h() {
        return this.f60537a.getLong(ProtectedSandApp.s("Γ\u0001"), 0L);
    }

    public long i() {
        return this.f60537a.getLong(ProtectedSandApp.s("Η\u0001"), n.f60490j);
    }

    @m1
    public b j() {
        b bVar;
        synchronized (this.f60540d) {
            bVar = new b(this.f60537a.getInt(ProtectedSandApp.s("Δ\u0001"), 0), new Date(this.f60537a.getLong(ProtectedSandApp.s("Ε\u0001"), -1L)));
        }
        return bVar;
    }

    void k() {
        m(0, f60526j);
    }

    void l() {
        r(0, f60526j);
    }

    void m(int i4, Date date) {
        synchronized (this.f60539c) {
            this.f60537a.edit().putInt(ProtectedSandApp.s("Β\u0001"), i4).putLong(ProtectedSandApp.s("Α\u0001"), date.getTime()).apply();
        }
    }

    @n1
    public void n(com.google.firebase.remoteconfig.r rVar) {
        synchronized (this.f60538b) {
            this.f60537a.edit().putLong(ProtectedSandApp.s("Ζ\u0001"), rVar.a()).putLong(ProtectedSandApp.s("Η\u0001"), rVar.b()).commit();
        }
    }

    public void o(com.google.firebase.remoteconfig.r rVar) {
        synchronized (this.f60538b) {
            this.f60537a.edit().putLong(ProtectedSandApp.s("Ζ\u0001"), rVar.a()).putLong(ProtectedSandApp.s("Η\u0001"), rVar.b()).apply();
        }
    }

    void p(String str) {
        synchronized (this.f60538b) {
            this.f60537a.edit().putString(ProtectedSandApp.s("Κ\u0001"), str).apply();
        }
    }

    void q(long j4) {
        synchronized (this.f60538b) {
            this.f60537a.edit().putLong(ProtectedSandApp.s("Γ\u0001"), j4).apply();
        }
    }

    void r(int i4, Date date) {
        synchronized (this.f60540d) {
            this.f60537a.edit().putInt(ProtectedSandApp.s("Δ\u0001"), i4).putLong(ProtectedSandApp.s("Ε\u0001"), date.getTime()).apply();
        }
    }

    void s() {
        synchronized (this.f60538b) {
            this.f60537a.edit().putInt(ProtectedSandApp.s("Θ\u0001"), 1).apply();
        }
    }

    void t(Date date) {
        synchronized (this.f60538b) {
            this.f60537a.edit().putInt(ProtectedSandApp.s("Θ\u0001"), -1).putLong(ProtectedSandApp.s("Ι\u0001"), date.getTime()).apply();
        }
    }

    void u() {
        synchronized (this.f60538b) {
            this.f60537a.edit().putInt(ProtectedSandApp.s("Θ\u0001"), 2).apply();
        }
    }
}
