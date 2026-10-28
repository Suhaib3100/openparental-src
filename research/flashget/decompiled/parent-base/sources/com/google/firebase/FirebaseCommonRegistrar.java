package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private static final String f58083a = ProtectedSandApp.s("賓");

    /* renamed from: b, reason: collision with root package name */
    private static final String f58084b = ProtectedSandApp.s("贈");

    /* renamed from: c, reason: collision with root package name */
    private static final String f58085c = ProtectedSandApp.s("逸");

    /* renamed from: d, reason: collision with root package name */
    private static final String f58086d = ProtectedSandApp.s("難");

    /* renamed from: e, reason: collision with root package name */
    private static final String f58087e = ProtectedSandApp.s("響");

    /* renamed from: f, reason: collision with root package name */
    private static final String f58088f = ProtectedSandApp.s("頻");

    /* renamed from: g, reason: collision with root package name */
    private static final String f58089g = ProtectedSandApp.s("恵");

    /* renamed from: h, reason: collision with root package name */
    private static final String f58090h = ProtectedSandApp.s("𤋮");

    /* renamed from: i, reason: collision with root package name */
    private static final String f58091i = ProtectedSandApp.s("舘");

    /* renamed from: j, reason: collision with root package name */
    private static final String f58092j = ProtectedSandApp.s("\ufa6e");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        return context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("臭")) ? ProtectedSandApp.s("艹") : context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("艹")) ? ProtectedSandApp.s("著") : context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("褐")) ? ProtectedSandApp.s("視") : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("謁"))) ? "" : ProtectedSandApp.s("謹");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.platforminfo.c.c());
        arrayList.add(com.google.firebase.heartbeatinfo.g.g());
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("賓"), String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("贈"), ProtectedSandApp.s("辶")));
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("逸"), i(Build.PRODUCT)));
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("難"), i(Build.DEVICE)));
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("響"), i(Build.BRAND)));
        arrayList.add(com.google.firebase.platforminfo.h.c(ProtectedSandApp.s("頻"), new i()));
        arrayList.add(com.google.firebase.platforminfo.h.c(ProtectedSandApp.s("恵"), new j()));
        arrayList.add(com.google.firebase.platforminfo.h.c(ProtectedSandApp.s("𤋮"), new k()));
        arrayList.add(com.google.firebase.platforminfo.h.c(ProtectedSandApp.s("舘"), new l()));
        String a5 = com.google.firebase.platforminfo.e.a();
        if (a5 != null) {
            arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("\ufa6e"), a5));
        }
        return arrayList;
    }
}
