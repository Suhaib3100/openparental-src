package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: ServiceStarter.java */
@KeepForSdk
/* loaded from: classes6.dex */
public class c1 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f59999e = -1;

    /* renamed from: f, reason: collision with root package name */
    @KeepForSdk
    public static final int f60000f = 500;

    /* renamed from: g, reason: collision with root package name */
    static final int f60001g = 404;

    /* renamed from: h, reason: collision with root package name */
    static final int f60002h = 401;

    /* renamed from: i, reason: collision with root package name */
    static final int f60003i = 402;

    /* renamed from: j, reason: collision with root package name */
    static final int f60004j = 403;

    /* renamed from: k, reason: collision with root package name */
    static final String f60005k = ProtectedSandApp.s("Ʊ\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static final String f60006l = ProtectedSandApp.s("Ʋ\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final String f60007m = ProtectedSandApp.s("Ƴ\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static c1 f60008n;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    @androidx.annotation.b0("this")
    private String f60009a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f60010b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f60011c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<Intent> f60012d = new ArrayDeque();

    private c1() {
    }

    private int a(Context context, Intent intent) {
        String f4 = f(context, intent);
        if (f4 != null) {
            Log.isLoggable(ProtectedSandApp.s("ƭ\u0001"), 3);
            intent.setClassName(context.getPackageName(), f4);
        }
        try {
            return (e(context) ? n1.k(context, intent) : context.startService(intent)) == null ? 404 : -1;
        } catch (IllegalStateException e4) {
            e4.toString();
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    static synchronized c1 b() {
        c1 c1Var;
        synchronized (c1.class) {
            try {
                if (f60008n == null) {
                    f60008n = new c1();
                }
                c1Var = f60008n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1Var;
    }

    @androidx.annotation.q0
    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f60009a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(ProtectedSandApp.s("Ʈ\u0001"))) {
                        this.f60009a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f60009a = serviceInfo.name;
                    }
                    return this.f60009a;
                }
                return null;
            }
            return null;
        } finally {
        }
    }

    @androidx.annotation.m1
    public static void g(c1 c1Var) {
        f60008n = c1Var;
    }

    @androidx.annotation.l0
    Intent c() {
        return this.f60012d.poll();
    }

    boolean d(Context context) {
        if (this.f60011c == null) {
            this.f60011c = Boolean.valueOf(context.checkCallingOrSelfPermission(ProtectedSandApp.s("Ư\u0001")) == 0);
        }
        if (!this.f60010b.booleanValue()) {
            Log.isLoggable(ProtectedSandApp.s("ƭ\u0001"), 3);
        }
        return this.f60011c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f60010b == null) {
            this.f60010b = Boolean.valueOf(context.checkCallingOrSelfPermission(ProtectedSandApp.s("ư\u0001")) == 0);
        }
        if (!this.f60010b.booleanValue()) {
            Log.isLoggable(ProtectedSandApp.s("ƭ\u0001"), 3);
        }
        return this.f60010b.booleanValue();
    }

    @androidx.annotation.l0
    public int h(Context context, Intent intent) {
        Log.isLoggable(ProtectedSandApp.s("ƭ\u0001"), 3);
        this.f60012d.offer(intent);
        Intent intent2 = new Intent(ProtectedSandApp.s("Ʊ\u0001"));
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
