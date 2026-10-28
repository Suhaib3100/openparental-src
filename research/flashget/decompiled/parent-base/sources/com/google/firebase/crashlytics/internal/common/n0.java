package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.o0;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: IdManager.java */
/* loaded from: classes6.dex */
public class n0 implements o0 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f58767g = 10000;

    /* renamed from: a, reason: collision with root package name */
    private final p0 f58776a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f58777b;

    /* renamed from: c, reason: collision with root package name */
    private final String f58778c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.k f58779d;

    /* renamed from: e, reason: collision with root package name */
    private final i0 f58780e;

    /* renamed from: f, reason: collision with root package name */
    private o0.a f58781f;

    /* renamed from: h, reason: collision with root package name */
    public static final String f58768h = ProtectedSandApp.s("ﱡ");

    /* renamed from: i, reason: collision with root package name */
    static final String f58769i = ProtectedSandApp.s("ﱢ");

    /* renamed from: j, reason: collision with root package name */
    static final String f58770j = ProtectedSandApp.s("ﱣ");

    /* renamed from: k, reason: collision with root package name */
    static final String f58771k = ProtectedSandApp.s("ﱤ");

    /* renamed from: l, reason: collision with root package name */
    static final String f58772l = ProtectedSandApp.s("ﱣ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f58774n = ProtectedSandApp.s("ﱥ");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f58773m = Pattern.compile(ProtectedSandApp.s("ﱦ"));

    /* renamed from: o, reason: collision with root package name */
    private static final String f58775o = Pattern.quote(ProtectedSandApp.s("ﱧ"));

    public n0(Context context, String str, com.google.firebase.installations.k kVar, i0 i0Var) {
        if (context == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ﱩ"));
        }
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ﱨ"));
        }
        this.f58777b = context;
        this.f58778c = str;
        this.f58779d = kVar;
        this.f58780e = i0Var;
        this.f58776a = new p0();
    }

    @androidx.annotation.o0
    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e4;
        String s4 = ProtectedSandApp.s("ﱪ");
        synchronized (this) {
            e4 = e(UUID.randomUUID().toString());
            com.google.firebase.crashlytics.internal.g.f().k(s4 + e4 + ProtectedSandApp.s("ﱫ") + str);
            sharedPreferences.edit().putString(ProtectedSandApp.s("ﱣ"), e4).putString(ProtectedSandApp.s("ﱤ"), str).apply();
        }
        return e4;
    }

    static String c() {
        return ProtectedSandApp.s("ﱥ") + UUID.randomUUID().toString();
    }

    @androidx.annotation.o0
    private static String e(@androidx.annotation.o0 String str) {
        return f58773m.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith(ProtectedSandApp.s("ﱥ"));
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(ProtectedSandApp.s("ﱣ"), null);
    }

    private String m(String str) {
        return str.replaceAll(f58775o, "");
    }

    private boolean n() {
        o0.a aVar = this.f58781f;
        return aVar == null || (aVar.e() == null && this.f58780e.d());
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0
    @androidx.annotation.o0
    public synchronized o0.a a() {
        String s4 = ProtectedSandApp.s("ﱬ");
        String s5 = ProtectedSandApp.s("ﱭ");
        String s6 = ProtectedSandApp.s("ﱮ");
        synchronized (this) {
            if (!n()) {
                return this.f58781f;
            }
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﱯ"));
            SharedPreferences r4 = i.r(this.f58777b);
            String string = r4.getString(ProtectedSandApp.s("ﱤ"), null);
            com.google.firebase.crashlytics.internal.g.f().k(s6 + string);
            if (this.f58780e.d()) {
                m0 d5 = d(false);
                com.google.firebase.crashlytics.internal.g.f().k(s5 + d5.f());
                if (d5.f() == null) {
                    d5 = new m0(string == null ? c() : string, null);
                }
                if (Objects.equals(d5.f(), string)) {
                    this.f58781f = o0.a.a(l(r4), d5);
                } else {
                    this.f58781f = o0.a.a(b(d5.f(), r4), d5);
                }
            } else if (k(string)) {
                this.f58781f = o0.a.b(l(r4));
            } else {
                this.f58781f = o0.a.b(b(c(), r4));
            }
            com.google.firebase.crashlytics.internal.g.f().k(s4 + this.f58781f);
            return this.f58781f;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        com.google.firebase.crashlytics.internal.g.f().n(com.flashget.parentalcontrol.ProtectedSandApp.s("ﱱ"), r0);
     */
    @androidx.annotation.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.firebase.crashlytics.internal.common.m0 d(boolean r6) {
        /*
            r5 = this;
            com.google.firebase.crashlytics.internal.concurrency.k.e()
            r0 = 10000(0x2710, double:4.9407E-320)
            r2 = 0
            if (r6 == 0) goto L2a
            com.google.firebase.installations.k r6 = r5.f58779d     // Catch: java.lang.Exception -> L1c
            r3 = 0
            com.google.android.gms.tasks.Task r6 = r6.c(r3)     // Catch: java.lang.Exception -> L1c
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L1c
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6, r0, r3)     // Catch: java.lang.Exception -> L1c
            com.google.firebase.installations.o r6 = (com.google.firebase.installations.o) r6     // Catch: java.lang.Exception -> L1c
            java.lang.String r6 = r6.b()     // Catch: java.lang.Exception -> L1c
            goto L2b
        L1c:
            r6 = move-exception
            com.google.firebase.crashlytics.internal.g r3 = com.google.firebase.crashlytics.internal.g.f()
            java.lang.String r4 = "ﱰ"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r3.n(r4, r6)
        L2a:
            r6 = r2
        L2b:
            com.google.firebase.installations.k r3 = r5.f58779d     // Catch: java.lang.Exception -> L3b
            com.google.android.gms.tasks.Task r3 = r3.a()     // Catch: java.lang.Exception -> L3b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L3b
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r3, r0, r4)     // Catch: java.lang.Exception -> L3b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L3b
            r2 = r0
            goto L49
        L3b:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.g r1 = com.google.firebase.crashlytics.internal.g.f()
            java.lang.String r3 = "ﱱ"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r1.n(r3, r0)
        L49:
            com.google.firebase.crashlytics.internal.common.m0 r0 = new com.google.firebase.crashlytics.internal.common.m0
            r0.<init>(r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.n0.d(boolean):com.google.firebase.crashlytics.internal.common.m0");
    }

    public String f() {
        return this.f58778c;
    }

    public String g() {
        return this.f58776a.a(this.f58777b);
    }

    public String h() {
        return String.format(Locale.US, ProtectedSandApp.s("ﱲ"), m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
