package com.tencent.liteav.base.system;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.liteav.base.ContextUtils;

/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.util.p<PackageInfo> f71897a = new com.tencent.liteav.base.util.p<>(b.a());

    public static String a() {
        PackageInfo a5 = f71897a.a();
        return a5 == null ? "" : a5.packageName;
    }

    public static String b() {
        PackageInfo a5;
        Context applicationContext = ContextUtils.getApplicationContext();
        return (applicationContext == null || (a5 = f71897a.a()) == null) ? "" : applicationContext.getPackageManager().getApplicationLabel(a5.applicationInfo).toString();
    }

    public static String c() {
        PackageInfo a5 = f71897a.a();
        return a5 == null ? "" : a5.versionName;
    }

    static /* synthetic */ PackageInfo d() throws Exception {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
    }
}
