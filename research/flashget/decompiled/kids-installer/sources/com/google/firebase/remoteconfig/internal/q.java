package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.r;
import java.util.Date;

/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: e, reason: collision with root package name */
    @m1
    public static final long f17988e = -1;

    /* renamed from: g, reason: collision with root package name */
    static final int f17990g = 0;

    /* renamed from: h, reason: collision with root package name */
    @m1
    static final int f17991h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static final long f17992i = -1;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18004a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18005b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f18006c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f18007d = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final String f17999p = ProtectedSandApp.s("\u197b");

    /* renamed from: q, reason: collision with root package name */
    private static final String f18000q = ProtectedSandApp.s("\u197c");

    /* renamed from: r, reason: collision with root package name */
    private static final String f18001r = ProtectedSandApp.s("\u197d");

    /* renamed from: s, reason: collision with root package name */
    private static final String f18002s = ProtectedSandApp.s("\u197e");

    /* renamed from: t, reason: collision with root package name */
    private static final String f18003t = ProtectedSandApp.s("\u197f");

    /* renamed from: k, reason: collision with root package name */
    private static final String f17994k = ProtectedSandApp.s("ᦀ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f17995l = ProtectedSandApp.s("ᦁ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f17996m = ProtectedSandApp.s("ᦂ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f17997n = ProtectedSandApp.s("ᦃ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f17998o = ProtectedSandApp.s("ᦄ");

    /* renamed from: f, reason: collision with root package name */
    static final Date f17989f = new Date(-1);

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final Date f17993j = new Date(-1);

    /* compiled from: ConfigMetadataClient.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f18008a;

        /* renamed from: b, reason: collision with root package name */
        private Date f18009b;

        a(int i5, Date date) {
            this.f18008a = i5;
            this.f18009b = date;
        }

        Date a() {
            return this.f18009b;
        }

        int b() {
            return this.f18008a;
        }
    }

    /* compiled from: ConfigMetadataClient.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f18010a;

        /* renamed from: b, reason: collision with root package name */
        private Date f18011b;

        b(int i5, Date date) {
            this.f18010a = i5;
            this.f18011b = date;
        }

        Date a() {
            return this.f18011b;
        }

        int b() {
            return this.f18010a;
        }
    }

    public q(SharedPreferences sharedPreferences) {
        this.f18004a = sharedPreferences;
    }

    @n1
    public void a() {
        synchronized (this.f18005b) {
            this.f18004a.edit().clear().commit();
        }
    }

    a b() {
        a aVar;
        synchronized (this.f18006c) {
            aVar = new a(this.f18004a.getInt(ProtectedSandApp.s("ᦅ"), 0), new Date(this.f18004a.getLong(ProtectedSandApp.s("ᦆ"), -1L)));
        }
        return aVar;
    }

    public long c() {
        return this.f18004a.getLong(ProtectedSandApp.s("ᦇ"), 60L);
    }

    public com.google.firebase.remoteconfig.q d() {
        x a6;
        synchronized (this.f18005b) {
            long j5 = this.f18004a.getLong(ProtectedSandApp.s("ᦈ"), -1L);
            int i5 = this.f18004a.getInt(ProtectedSandApp.s("ᦉ"), 0);
            a6 = x.d().c(i5).d(j5).b(new r.b().f(this.f18004a.getLong(ProtectedSandApp.s("ᦊ"), 60L)).g(this.f18004a.getLong(ProtectedSandApp.s("ᦋ"), n.f17957j)).c()).a();
        }
        return a6;
    }

    @q0
    String e() {
        return this.f18004a.getString(ProtectedSandApp.s("ᦌ"), null);
    }

    int f() {
        return this.f18004a.getInt(ProtectedSandApp.s("ᦍ"), 0);
    }

    Date g() {
        return new Date(this.f18004a.getLong(ProtectedSandApp.s("ᦎ"), -1L));
    }

    long h() {
        return this.f18004a.getLong(ProtectedSandApp.s("ᦏ"), 0L);
    }

    public long i() {
        return this.f18004a.getLong(ProtectedSandApp.s("ᦐ"), n.f17957j);
    }

    b j() {
        b bVar;
        synchronized (this.f18007d) {
            bVar = new b(this.f18004a.getInt(ProtectedSandApp.s("ᦑ"), 0), new Date(this.f18004a.getLong(ProtectedSandApp.s("ᦒ"), -1L)));
        }
        return bVar;
    }

    void k() {
        m(0, f17993j);
    }

    void l() {
        r(0, f17993j);
    }

    void m(int i5, Date date) {
        synchronized (this.f18006c) {
            this.f18004a.edit().putInt(ProtectedSandApp.s("ᦓ"), i5).putLong(ProtectedSandApp.s("ᦔ"), date.getTime()).apply();
        }
    }

    @n1
    public void n(com.google.firebase.remoteconfig.r rVar) {
        synchronized (this.f18005b) {
            this.f18004a.edit().putLong(ProtectedSandApp.s("ᦕ"), rVar.a()).putLong(ProtectedSandApp.s("ᦖ"), rVar.b()).commit();
        }
    }

    public void o(com.google.firebase.remoteconfig.r rVar) {
        synchronized (this.f18005b) {
            this.f18004a.edit().putLong(ProtectedSandApp.s("ᦗ"), rVar.a()).putLong(ProtectedSandApp.s("ᦘ"), rVar.b()).apply();
        }
    }

    void p(String str) {
        synchronized (this.f18005b) {
            this.f18004a.edit().putString(ProtectedSandApp.s("ᦙ"), str).apply();
        }
    }

    void q(long j5) {
        synchronized (this.f18005b) {
            this.f18004a.edit().putLong(ProtectedSandApp.s("ᦚ"), j5).apply();
        }
    }

    void r(int i5, Date date) {
        synchronized (this.f18007d) {
            this.f18004a.edit().putInt(ProtectedSandApp.s("ᦛ"), i5).putLong(ProtectedSandApp.s("ᦜ"), date.getTime()).apply();
        }
    }

    void s() {
        synchronized (this.f18005b) {
            this.f18004a.edit().putInt(ProtectedSandApp.s("ᦝ"), 1).apply();
        }
    }

    void t(Date date) {
        synchronized (this.f18005b) {
            this.f18004a.edit().putInt(ProtectedSandApp.s("ᦞ"), -1).putLong(ProtectedSandApp.s("ᦟ"), date.getTime()).apply();
        }
    }

    void u() {
        synchronized (this.f18005b) {
            this.f18004a.edit().putInt(ProtectedSandApp.s("ᦠ"), 2).apply();
        }
    }
}
