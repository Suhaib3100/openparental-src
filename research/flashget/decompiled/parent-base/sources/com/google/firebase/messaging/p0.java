package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* compiled from: Metadata.java */
/* loaded from: classes6.dex */
class p0 {

    /* renamed from: f, reason: collision with root package name */
    private static final String f60254f = ProtectedSandApp.s("˔\u0001");

    /* renamed from: g, reason: collision with root package name */
    static final String f60255g = ProtectedSandApp.s("˓\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final String f60256h = ProtectedSandApp.s("˖\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final String f60257i = ProtectedSandApp.s("˕\u0001");

    /* renamed from: j, reason: collision with root package name */
    static final int f60258j = 0;

    /* renamed from: k, reason: collision with root package name */
    static final int f60259k = 1;

    /* renamed from: l, reason: collision with root package name */
    static final int f60260l = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Context f60261a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private String f60262b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private String f60263c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f60264d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f60265e = 0;

    p0(Context context) {
        this.f60261a = context;
    }

    static String c(com.google.firebase.g gVar) {
        String m4 = gVar.s().m();
        if (m4 != null) {
            return m4;
        }
        String j4 = gVar.s().j();
        if (!j4.startsWith(ProtectedSandApp.s("ˑ\u0001"))) {
            return j4;
        }
        String[] split = j4.split(ProtectedSandApp.s("˒\u0001"));
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f60261a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.toString();
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f4 = f(this.f60261a.getPackageName());
        if (f4 != null) {
            this.f60262b = Integer.toString(f4.versionCode);
            this.f60263c = f4.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f60262b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f60262b;
    }

    synchronized String b() {
        try {
            if (this.f60263c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f60263c;
    }

    synchronized int d() {
        PackageInfo f4;
        try {
            if (this.f60264d == 0 && (f4 = f(ProtectedSandApp.s("˓\u0001"))) != null) {
                this.f60264d = f4.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f60264d;
    }

    synchronized int e() {
        int i4 = this.f60265e;
        if (i4 != 0) {
            return i4;
        }
        PackageManager packageManager = this.f60261a.getPackageManager();
        if (packageManager.checkPermission(ProtectedSandApp.s("˔\u0001"), ProtectedSandApp.s("˓\u0001")) == -1) {
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent(ProtectedSandApp.s("˕\u0001"));
            intent.setPackage(ProtectedSandApp.s("˓\u0001"));
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f60265e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent(ProtectedSandApp.s("˖\u0001"));
        intent2.setPackage(ProtectedSandApp.s("˓\u0001"));
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f60265e = 2;
            return 2;
        }
        if (PlatformVersion.isAtLeastO()) {
            this.f60265e = 2;
        } else {
            this.f60265e = 1;
        }
        return this.f60265e;
    }

    boolean g() {
        return e() != 0;
    }
}
