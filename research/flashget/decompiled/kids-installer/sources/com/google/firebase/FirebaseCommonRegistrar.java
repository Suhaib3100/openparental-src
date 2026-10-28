package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15015a = ProtectedSandApp.s("➌");

    /* renamed from: b, reason: collision with root package name */
    private static final String f15016b = ProtectedSandApp.s("➍");

    /* renamed from: c, reason: collision with root package name */
    private static final String f15017c = ProtectedSandApp.s("➎");

    /* renamed from: d, reason: collision with root package name */
    private static final String f15018d = ProtectedSandApp.s("➏");

    /* renamed from: e, reason: collision with root package name */
    private static final String f15019e = ProtectedSandApp.s("➐");

    /* renamed from: f, reason: collision with root package name */
    private static final String f15020f = ProtectedSandApp.s("➑");

    /* renamed from: g, reason: collision with root package name */
    private static final String f15021g = ProtectedSandApp.s("➒");

    /* renamed from: h, reason: collision with root package name */
    private static final String f15022h = ProtectedSandApp.s("➓");

    /* renamed from: i, reason: collision with root package name */
    private static final String f15023i = ProtectedSandApp.s("➔");

    /* renamed from: j, reason: collision with root package name */
    private static final String f15024j = ProtectedSandApp.s("➕");

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
        return context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("❹")) ? ProtectedSandApp.s("❺") : context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("❻")) ? ProtectedSandApp.s("❼") : context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("❽")) ? ProtectedSandApp.s("❾") : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("❿"))) ? "" : ProtectedSandApp.s("➀");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace(org.apache.commons.io.n.f32060b, '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.platforminfo.c.c());
        arrayList.add(com.google.firebase.heartbeatinfo.g.g());
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("➁"), String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("➂"), ProtectedSandApp.s("➃")));
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("➄"), i(Build.PRODUCT)));
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("➅"), i(Build.DEVICE)));
        arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("➆"), i(Build.BRAND)));
        arrayList.add(com.google.firebase.platforminfo.h.c(ProtectedSandApp.s("➇"), new h.a() { // from class: com.google.firebase.i
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                String e6;
                e6 = FirebaseCommonRegistrar.e((Context) obj);
                return e6;
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.h.c(ProtectedSandApp.s("➈"), new h.a() { // from class: com.google.firebase.j
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                String f6;
                f6 = FirebaseCommonRegistrar.f((Context) obj);
                return f6;
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.h.c(ProtectedSandApp.s("➉"), new h.a() { // from class: com.google.firebase.k
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                String g5;
                g5 = FirebaseCommonRegistrar.g((Context) obj);
                return g5;
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.h.c(ProtectedSandApp.s("➊"), new h.a() { // from class: com.google.firebase.l
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                String h5;
                h5 = FirebaseCommonRegistrar.h((Context) obj);
                return h5;
            }
        }));
        String a6 = com.google.firebase.platforminfo.e.a();
        if (a6 != null) {
            arrayList.add(com.google.firebase.platforminfo.h.b(ProtectedSandApp.s("➋"), a6));
        }
        return arrayList;
    }
}
