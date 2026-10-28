package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.f;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: ApplicationVersionSignature.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44935a = ProtectedSandApp.s("ઐ");

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, f> f44936b = new ConcurrentHashMap();

    private b() {
    }

    @q0
    private static PackageInfo a(@o0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            return null;
        }
    }

    @o0
    private static String b(@q0 PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @o0
    public static f c(@o0 Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, f> concurrentMap = f44936b;
        f fVar = concurrentMap.get(packageName);
        if (fVar != null) {
            return fVar;
        }
        f d5 = d(context);
        f putIfAbsent = concurrentMap.putIfAbsent(packageName, d5);
        return putIfAbsent == null ? d5 : putIfAbsent;
    }

    @o0
    private static f d(@o0 Context context) {
        return new e(b(a(context)));
    }

    @m1
    static void e() {
        f44936b.clear();
    }
}
