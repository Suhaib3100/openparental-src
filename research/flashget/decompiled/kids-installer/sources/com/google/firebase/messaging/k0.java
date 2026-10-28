package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* compiled from: Metadata.java */
/* loaded from: classes2.dex */
class k0 {

    /* renamed from: f, reason: collision with root package name */
    private static final String f17319f = ProtectedSandApp.s("ᡬ");

    /* renamed from: g, reason: collision with root package name */
    static final String f17320g = ProtectedSandApp.s("ᡭ");

    /* renamed from: h, reason: collision with root package name */
    private static final String f17321h = ProtectedSandApp.s("ᡮ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f17322i = ProtectedSandApp.s("ᡯ");

    /* renamed from: j, reason: collision with root package name */
    static final int f17323j = 0;

    /* renamed from: k, reason: collision with root package name */
    static final int f17324k = 1;

    /* renamed from: l, reason: collision with root package name */
    static final int f17325l = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17326a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private String f17327b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private String f17328c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f17329d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private int f17330e = 0;

    k0(Context context) {
        this.f17326a = context;
    }

    static String c(com.google.firebase.g gVar) {
        String m5 = gVar.s().m();
        if (m5 != null) {
            return m5;
        }
        String j5 = gVar.s().j();
        if (!j5.startsWith(ProtectedSandApp.s("ᡣ"))) {
            return j5;
        }
        String[] split = j5.split(ProtectedSandApp.s("ᡤ"));
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
            return this.f17326a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e6) {
            e6.toString();
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f6 = f(this.f17326a.getPackageName());
        if (f6 != null) {
            this.f17327b = Integer.toString(f6.versionCode);
            this.f17328c = f6.versionName;
        }
    }

    synchronized String a() {
        if (this.f17327b == null) {
            h();
        }
        return this.f17327b;
    }

    synchronized String b() {
        if (this.f17328c == null) {
            h();
        }
        return this.f17328c;
    }

    synchronized int d() {
        PackageInfo f6;
        if (this.f17329d == 0 && (f6 = f(ProtectedSandApp.s("ᡥ"))) != null) {
            this.f17329d = f6.versionCode;
        }
        return this.f17329d;
    }

    synchronized int e() {
        int i5 = this.f17330e;
        if (i5 != 0) {
            return i5;
        }
        PackageManager packageManager = this.f17326a.getPackageManager();
        if (packageManager.checkPermission(ProtectedSandApp.s("ᡦ"), ProtectedSandApp.s("ᡧ")) == -1) {
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent(ProtectedSandApp.s("ᡨ"));
            intent.setPackage(ProtectedSandApp.s("ᡩ"));
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f17330e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent(ProtectedSandApp.s("ᡪ"));
        intent2.setPackage(ProtectedSandApp.s("ᡫ"));
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f17330e = 2;
            return 2;
        }
        if (PlatformVersion.isAtLeastO()) {
            this.f17330e = 2;
        } else {
            this.f17330e = 1;
        }
        return this.f17330e;
    }

    boolean g() {
        return e() != 0;
    }
}
