package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: ManifestParser.java */
@Deprecated
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11945b = ProtectedSandApp.s("ȇ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f11946c = ProtectedSandApp.s("Ȉ");

    /* renamed from: a, reason: collision with root package name */
    private final Context f11947a;

    public e(Context context) {
        this.f11947a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.bumptech.glide.module.c b(java.lang.String r3) {
        /*
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L45
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L17 java.lang.IllegalAccessException -> L1c java.lang.InstantiationException -> L21
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L17 java.lang.IllegalAccessException -> L1c java.lang.InstantiationException -> L21
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L17 java.lang.IllegalAccessException -> L1c java.lang.InstantiationException -> L21
            java.lang.Object r3 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L17 java.lang.IllegalAccessException -> L1c java.lang.InstantiationException -> L21
            goto L26
        L12:
            r0 = move-exception
            c(r3, r0)
            goto L25
        L17:
            r0 = move-exception
            c(r3, r0)
            goto L25
        L1c:
            r0 = move-exception
            c(r3, r0)
            goto L25
        L21:
            r0 = move-exception
            c(r3, r0)
        L25:
            r3 = 0
        L26:
            boolean r0 = r3 instanceof com.bumptech.glide.module.c
            if (r0 == 0) goto L2d
            com.bumptech.glide.module.c r3 = (com.bumptech.glide.module.c) r3
            return r3
        L2d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ȁ"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L45:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Ȃ"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.module.e.b(java.lang.String):com.bumptech.glide.module.c");
    }

    private static void c(Class<?> cls, Exception exc) {
        throw new RuntimeException(ProtectedSandApp.s("ȃ") + cls, exc);
    }

    public List<c> a() {
        String s5 = ProtectedSandApp.s("Ȅ");
        Log.isLoggable(s5, 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f11947a.getPackageManager().getApplicationInfo(this.f11947a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable(s5, 3);
                return arrayList;
            }
            if (Log.isLoggable(s5, 2)) {
                Objects.toString(applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if (ProtectedSandApp.s("ȅ").equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(b(str));
                    Log.isLoggable(s5, 3);
                }
            }
            Log.isLoggable(s5, 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException(ProtectedSandApp.s("Ȇ"), e6);
        }
    }
}
