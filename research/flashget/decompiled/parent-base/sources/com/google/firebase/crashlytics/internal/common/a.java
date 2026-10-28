package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: AppData.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f58617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58618b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f> f58619c;

    /* renamed from: d, reason: collision with root package name */
    public final String f58620d;

    /* renamed from: e, reason: collision with root package name */
    public final String f58621e;

    /* renamed from: f, reason: collision with root package name */
    public final String f58622f;

    /* renamed from: g, reason: collision with root package name */
    public final String f58623g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.f f58624h;

    public a(String str, String str2, List<f> list, String str3, String str4, String str5, String str6, com.google.firebase.crashlytics.internal.f fVar) {
        this.f58617a = str;
        this.f58618b = str2;
        this.f58619c = list;
        this.f58620d = str3;
        this.f58621e = str4;
        this.f58622f = str5;
        this.f58623g = str6;
        this.f58624h = fVar;
    }

    public static a a(Context context, n0 n0Var, String str, String str2, List<f> list, com.google.firebase.crashlytics.internal.f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g4 = n0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b5 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = ProtectedSandApp.s("\ufbd0");
        }
        return new a(str, str2, list, g4, packageName, b5, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return Integer.toString(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }
}
