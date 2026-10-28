package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.os.c0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* compiled from: PackageManagerCompat.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public static final String f4596a = "PackageManagerCompat";

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4597b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    /* compiled from: PackageManagerCompat.java */
    @x0(30)
    private static class a {
        private a() {
        }

        static boolean a(@o0 Context context) {
            boolean isAutoRevokeWhitelisted;
            isAutoRevokeWhitelisted = context.getPackageManager().isAutoRevokeWhitelisted();
            return !isAutoRevokeWhitelisted;
        }
    }

    /* compiled from: PackageManagerCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private q() {
    }

    @c1({c1.a.LIBRARY})
    public static boolean a(@o0 PackageManager packageManager) {
        int i5 = Build.VERSION.SDK_INT;
        boolean z5 = i5 >= 30;
        boolean z6 = i5 < 30;
        boolean z7 = b(packageManager) != null;
        if (z5) {
            return true;
        }
        return z6 && z7;
    }

    @q0
    @c1({c1.a.LIBRARY})
    public static String b(@o0 PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @o0
    public static w1.a<Integer> c(@o0 Context context) {
        androidx.concurrent.futures.g<Integer> F = androidx.concurrent.futures.g.F();
        if (!c0.a(context)) {
            F.A(0);
            return F;
        }
        if (!a(context.getPackageManager())) {
            F.A(1);
            return F;
        }
        int i5 = context.getApplicationInfo().targetSdkVersion;
        if (i5 < 30) {
            F.A(0);
            return F;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            if (a.a(context)) {
                F.A(Integer.valueOf(i5 >= 31 ? 5 : 4));
            } else {
                F.A(2);
            }
            return F;
        }
        if (i6 == 30) {
            F.A(Integer.valueOf(a.a(context) ? 4 : 2));
            return F;
        }
        final v vVar = new v(context);
        F.g(new Runnable() { // from class: androidx.core.content.o
            @Override // java.lang.Runnable
            public final void run() {
                v.this.b();
            }
        }, Executors.newSingleThreadExecutor());
        vVar.a(F);
        return F;
    }
}
