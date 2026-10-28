package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* compiled from: InstallerPackageNameProvider.java */
/* loaded from: classes6.dex */
class p0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f58823b = "";

    /* renamed from: a, reason: collision with root package name */
    private String f58824a;

    p0() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f58824a == null) {
                this.f58824a = b(context);
            }
        } finally {
        }
        return "".equals(this.f58824a) ? null : this.f58824a;
    }
}
