package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes6.dex */
public class i0 {

    /* renamed from: i, reason: collision with root package name */
    private static final String f58730i = ProtectedSandApp.s("ﰪ");

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f58731a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.g f58732b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f58733c;

    /* renamed from: d, reason: collision with root package name */
    TaskCompletionSource<Void> f58734d;

    /* renamed from: e, reason: collision with root package name */
    boolean f58735e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f58736f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.q0
    private Boolean f58737g;

    /* renamed from: h, reason: collision with root package name */
    private final TaskCompletionSource<Void> f58738h;

    public i0(com.google.firebase.g gVar) {
        Object obj = new Object();
        this.f58733c = obj;
        this.f58734d = new TaskCompletionSource<>();
        this.f58735e = false;
        this.f58736f = false;
        this.f58738h = new TaskCompletionSource<>();
        Context n4 = gVar.n();
        this.f58732b = gVar;
        this.f58731a = i.r(n4);
        Boolean b5 = b();
        this.f58737g = b5 == null ? a(n4) : b5;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f58734d.trySetResult(null);
                    this.f58735e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.q0
    private Boolean a(Context context) {
        Boolean g4 = g(context);
        if (g4 == null) {
            this.f58736f = false;
            return null;
        }
        this.f58736f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g4));
    }

    @androidx.annotation.q0
    private Boolean b() {
        SharedPreferences sharedPreferences = this.f58731a;
        String s4 = ProtectedSandApp.s("ﰪ");
        if (!sharedPreferences.contains(s4)) {
            return null;
        }
        this.f58736f = false;
        return Boolean.valueOf(this.f58731a.getBoolean(s4, true));
    }

    private boolean e() {
        try {
            return this.f58732b.A();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z4) {
        com.google.firebase.crashlytics.internal.g.f().b(String.format(ProtectedSandApp.s("ﰰ"), z4 ? ProtectedSandApp.s("ﰫ") : ProtectedSandApp.s("ﰬ"), this.f58737g == null ? ProtectedSandApp.s("ﰭ") : this.f58736f ? ProtectedSandApp.s("ﰮ") : ProtectedSandApp.s("ﰯ")));
    }

    @androidx.annotation.q0
    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String s4 = ProtectedSandApp.s("ﰪ");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(s4)) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean(s4));
        } catch (PackageManager.NameNotFoundException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﰱ"), e4);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String s4 = ProtectedSandApp.s("ﰪ");
        if (bool != null) {
            edit.putBoolean(s4, bool.booleanValue());
        } else {
            edit.remove(s4);
        }
        edit.apply();
    }

    public void c(boolean z4) {
        if (!z4) {
            throw new IllegalStateException(ProtectedSandApp.s("ﰲ"));
        }
        this.f58738h.trySetResult(null);
    }

    public synchronized boolean d() {
        boolean booleanValue;
        try {
            Boolean bool = this.f58737g;
            booleanValue = bool != null ? bool.booleanValue() : e();
            f(booleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return booleanValue;
    }

    public synchronized void h(@androidx.annotation.q0 Boolean bool) {
        if (bool != null) {
            try {
                this.f58736f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f58737g = bool != null ? bool : a(this.f58732b.n());
        i(this.f58731a, bool);
        synchronized (this.f58733c) {
            try {
                if (d()) {
                    if (!this.f58735e) {
                        this.f58734d.trySetResult(null);
                        this.f58735e = true;
                    }
                } else if (this.f58735e) {
                    this.f58734d = new TaskCompletionSource<>();
                    this.f58735e = false;
                }
            } finally {
            }
        }
    }

    public Task<Void> j() {
        Task<Void> task;
        synchronized (this.f58733c) {
            task = this.f58734d.getTask();
        }
        return task;
    }

    public Task<Void> k() {
        return com.google.firebase.crashlytics.internal.concurrency.b.c(this.f58738h.getTask(), j());
    }
}
