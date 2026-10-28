package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.e0;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: IdManager.java */
/* loaded from: classes3.dex */
public class d0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f15580a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15581b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15582c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.k f15583d;

    /* renamed from: e, reason: collision with root package name */
    private final z f15584e;

    /* renamed from: f, reason: collision with root package name */
    private e0.a f15585f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f15572g = ProtectedSandApp.s("⠎");

    /* renamed from: h, reason: collision with root package name */
    static final String f15573h = ProtectedSandApp.s("⠏");

    /* renamed from: i, reason: collision with root package name */
    static final String f15574i = ProtectedSandApp.s("⠐");

    /* renamed from: j, reason: collision with root package name */
    static final String f15575j = ProtectedSandApp.s("⠑");

    /* renamed from: k, reason: collision with root package name */
    static final String f15576k = ProtectedSandApp.s("⠒");

    /* renamed from: m, reason: collision with root package name */
    private static final String f15578m = ProtectedSandApp.s("⠓");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f15577l = Pattern.compile(ProtectedSandApp.s("⠔"));

    /* renamed from: n, reason: collision with root package name */
    private static final String f15579n = Pattern.quote(ProtectedSandApp.s("⠕"));

    public d0(Context context, String str, com.google.firebase.installations.k kVar, z zVar) {
        if (context == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⠗"));
        }
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⠖"));
        }
        this.f15581b = context;
        this.f15582c = str;
        this.f15583d = kVar;
        this.f15584e = zVar;
        this.f15580a = new f0();
    }

    @androidx.annotation.o0
    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e6;
        String s5 = ProtectedSandApp.s("⠘");
        synchronized (this) {
            e6 = e(UUID.randomUUID().toString());
            com.google.firebase.crashlytics.internal.g.f().k(s5 + e6 + ProtectedSandApp.s("⠙") + str);
            sharedPreferences.edit().putString(ProtectedSandApp.s("⠚"), e6).putString(ProtectedSandApp.s("⠛"), str).apply();
        }
        return e6;
    }

    static String c() {
        return ProtectedSandApp.s("⠜") + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f15577l.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith(ProtectedSandApp.s("⠝"));
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(ProtectedSandApp.s("⠞"), null);
    }

    private String m(String str) {
        return str.replaceAll(f15579n, "");
    }

    private boolean n() {
        e0.a aVar = this.f15585f;
        return aVar == null || (aVar.d() == null && this.f15584e.d());
    }

    @Override // com.google.firebase.crashlytics.internal.common.e0
    @androidx.annotation.o0
    public synchronized e0.a a() {
        String s5 = ProtectedSandApp.s("⠟");
        String s6 = ProtectedSandApp.s("⠠");
        String s7 = ProtectedSandApp.s("⠡");
        synchronized (this) {
            if (!n()) {
                return this.f15585f;
            }
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("⠢"));
            SharedPreferences r5 = i.r(this.f15581b);
            String string = r5.getString(ProtectedSandApp.s("⠣"), null);
            com.google.firebase.crashlytics.internal.g.f().k(s7 + string);
            if (this.f15584e.d()) {
                String d6 = d();
                com.google.firebase.crashlytics.internal.g.f().k(s6 + d6);
                if (d6 == null) {
                    d6 = string == null ? c() : string;
                }
                if (d6.equals(string)) {
                    this.f15585f = new c(l(r5), d6);
                } else {
                    this.f15585f = new c(b(d6, r5), d6);
                }
            } else if (k(string)) {
                this.f15585f = e0.a.b(l(r5));
            } else {
                this.f15585f = e0.a.b(b(c(), r5));
            }
            com.google.firebase.crashlytics.internal.g.f().k(s5 + this.f15585f);
            return this.f15585f;
        }
    }

    @androidx.annotation.q0
    @m1(otherwise = 3)
    public String d() {
        try {
            return (String) c1.f(this.f15583d.getId());
        } catch (Exception e6) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("⠤"), e6);
            return null;
        }
    }

    public String f() {
        return this.f15582c;
    }

    public String g() {
        return this.f15580a.a(this.f15581b);
    }

    public String h() {
        return String.format(Locale.US, ProtectedSandApp.s("⠥"), m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
