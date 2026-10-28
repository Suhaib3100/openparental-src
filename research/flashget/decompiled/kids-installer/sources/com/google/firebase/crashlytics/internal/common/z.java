package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes2.dex */
public class z {

    /* renamed from: i, reason: collision with root package name */
    private static final String f15761i = ProtectedSandApp.s("ᒰ");

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f15762a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.g f15763b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15764c;

    /* renamed from: d, reason: collision with root package name */
    TaskCompletionSource<Void> f15765d;

    /* renamed from: e, reason: collision with root package name */
    boolean f15766e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15767f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.q0
    private Boolean f15768g;

    /* renamed from: h, reason: collision with root package name */
    private final TaskCompletionSource<Void> f15769h;

    public z(com.google.firebase.g gVar) {
        Object obj = new Object();
        this.f15764c = obj;
        this.f15765d = new TaskCompletionSource<>();
        this.f15766e = false;
        this.f15767f = false;
        this.f15769h = new TaskCompletionSource<>();
        Context n5 = gVar.n();
        this.f15763b = gVar;
        this.f15762a = i.r(n5);
        Boolean b6 = b();
        this.f15768g = b6 == null ? a(n5) : b6;
        synchronized (obj) {
            if (d()) {
                this.f15765d.trySetResult(null);
                this.f15766e = true;
            }
        }
    }

    @androidx.annotation.q0
    private Boolean a(Context context) {
        Boolean g5 = g(context);
        if (g5 == null) {
            this.f15767f = false;
            return null;
        }
        this.f15767f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g5));
    }

    @androidx.annotation.q0
    private Boolean b() {
        SharedPreferences sharedPreferences = this.f15762a;
        String s5 = ProtectedSandApp.s("ᒥ");
        if (!sharedPreferences.contains(s5)) {
            return null;
        }
        this.f15767f = false;
        return Boolean.valueOf(this.f15762a.getBoolean(s5, true));
    }

    private boolean e() {
        try {
            return this.f15763b.A();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z5) {
        com.google.firebase.crashlytics.internal.g.f().b(String.format(ProtectedSandApp.s("ᒫ"), z5 ? ProtectedSandApp.s("ᒦ") : ProtectedSandApp.s("ᒧ"), this.f15768g == null ? ProtectedSandApp.s("ᒨ") : this.f15767f ? ProtectedSandApp.s("ᒩ") : ProtectedSandApp.s("ᒪ")));
    }

    @androidx.annotation.q0
    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String s5 = ProtectedSandApp.s("ᒬ");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(s5)) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean(s5));
        } catch (PackageManager.NameNotFoundException e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᒭ"), e6);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String s5 = ProtectedSandApp.s("ᒮ");
        if (bool != null) {
            edit.putBoolean(s5, bool.booleanValue());
        } else {
            edit.remove(s5);
        }
        edit.apply();
    }

    public void c(boolean z5) {
        if (!z5) {
            throw new IllegalStateException(ProtectedSandApp.s("ᒯ"));
        }
        this.f15769h.trySetResult(null);
    }

    public synchronized boolean d() {
        boolean booleanValue;
        Boolean bool = this.f15768g;
        booleanValue = bool != null ? bool.booleanValue() : e();
        f(booleanValue);
        return booleanValue;
    }

    public synchronized void h(@androidx.annotation.q0 Boolean bool) {
        if (bool != null) {
            try {
                this.f15767f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15768g = bool != null ? bool : a(this.f15763b.n());
        i(this.f15762a, bool);
        synchronized (this.f15764c) {
            if (d()) {
                if (!this.f15766e) {
                    this.f15765d.trySetResult(null);
                    this.f15766e = true;
                }
            } else if (this.f15766e) {
                this.f15765d = new TaskCompletionSource<>();
                this.f15766e = false;
            }
        }
    }

    public Task<Void> j() {
        Task<Void> task;
        synchronized (this.f15764c) {
            task = this.f15765d.getTask();
        }
        return task;
    }

    public Task<Void> k(Executor executor) {
        return c1.o(executor, this.f15769h.getTask(), j());
    }
}
