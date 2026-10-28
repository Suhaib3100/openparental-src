package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: ServiceStarter.java */
@KeepForSdk
/* loaded from: classes2.dex */
public class w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f17633e = -1;

    /* renamed from: f, reason: collision with root package name */
    @KeepForSdk
    public static final int f17634f = 500;

    /* renamed from: g, reason: collision with root package name */
    static final int f17635g = 404;

    /* renamed from: h, reason: collision with root package name */
    static final int f17636h = 401;

    /* renamed from: i, reason: collision with root package name */
    static final int f17637i = 402;

    /* renamed from: j, reason: collision with root package name */
    static final int f17638j = 403;

    /* renamed from: k, reason: collision with root package name */
    static final String f17639k = ProtectedSandApp.s("ᣆ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f17640l = ProtectedSandApp.s("ᣇ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f17641m = ProtectedSandApp.s("ᣈ");

    /* renamed from: n, reason: collision with root package name */
    private static w0 f17642n;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    @androidx.annotation.b0("this")
    private String f17643a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f17644b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f17645c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<Intent> f17646d = new ArrayDeque();

    private w0() {
    }

    private int a(Context context, Intent intent) {
        String f6 = f(context, intent);
        if (f6 != null) {
            Log.isLoggable(ProtectedSandApp.s("ᢾ"), 3);
            intent.setClassName(context.getPackageName(), f6);
        }
        try {
            if ((e(context) ? h1.k(context, intent) : context.startService(intent)) == null) {
                return f17635g;
            }
            return -1;
        } catch (IllegalStateException e6) {
            e6.toString();
            return f17637i;
        } catch (SecurityException unused) {
            return f17636h;
        }
    }

    static synchronized w0 b() {
        w0 w0Var;
        synchronized (w0.class) {
            if (f17642n == null) {
                f17642n = new w0();
            }
            w0Var = f17642n;
        }
        return w0Var;
    }

    @androidx.annotation.q0
    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f17643a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(ProtectedSandApp.s("ᢿ"))) {
                    this.f17643a = context.getPackageName() + serviceInfo.name;
                } else {
                    this.f17643a = serviceInfo.name;
                }
                return this.f17643a;
            }
            return null;
        }
        return null;
    }

    @androidx.annotation.m1
    public static void g(w0 w0Var) {
        f17642n = w0Var;
    }

    @androidx.annotation.l0
    Intent c() {
        return this.f17646d.poll();
    }

    boolean d(Context context) {
        if (this.f17645c == null) {
            this.f17645c = Boolean.valueOf(context.checkCallingOrSelfPermission(ProtectedSandApp.s("ᣀ")) == 0);
        }
        if (!this.f17644b.booleanValue()) {
            Log.isLoggable(ProtectedSandApp.s("ᣁ"), 3);
        }
        return this.f17645c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f17644b == null) {
            this.f17644b = Boolean.valueOf(context.checkCallingOrSelfPermission(ProtectedSandApp.s("ᣂ")) == 0);
        }
        if (!this.f17644b.booleanValue()) {
            Log.isLoggable(ProtectedSandApp.s("ᣃ"), 3);
        }
        return this.f17644b.booleanValue();
    }

    @androidx.annotation.l0
    public int h(Context context, Intent intent) {
        Log.isLoggable(ProtectedSandApp.s("ᣄ"), 3);
        this.f17646d.offer(intent);
        Intent intent2 = new Intent(ProtectedSandApp.s("ᣅ"));
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
