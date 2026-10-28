package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: AppData.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15541a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15542b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f> f15543c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15544d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15545e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15546f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15547g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.f f15548h;

    public a(String str, String str2, List<f> list, String str3, String str4, String str5, String str6, com.google.firebase.crashlytics.internal.f fVar) {
        this.f15541a = str;
        this.f15542b = str2;
        this.f15543c = list;
        this.f15544d = str3;
        this.f15545e = str4;
        this.f15546f = str5;
        this.f15547g = str6;
        this.f15548h = fVar;
    }

    public static a a(Context context, d0 d0Var, String str, String str2, List<f> list, com.google.firebase.crashlytics.internal.f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g5 = d0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b6 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = ProtectedSandApp.s("Ꮥ");
        }
        return new a(str, str2, list, g5, packageName, b6, str3, fVar);
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
