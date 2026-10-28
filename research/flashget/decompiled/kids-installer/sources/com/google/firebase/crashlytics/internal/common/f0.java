package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* compiled from: InstallerPackageNameProvider.java */
/* loaded from: classes2.dex */
class f0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f15594b = "";

    /* renamed from: a, reason: collision with root package name */
    private String f15595a;

    f0() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        if (this.f15595a == null) {
            this.f15595a = b(context);
        }
        return "".equals(this.f15595a) ? null : this.f15595a;
    }
}
