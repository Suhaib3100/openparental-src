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
import androidx.core.os.s0;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* compiled from: PackageManagerCompat.java */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public static final String f25974a = "PackageManagerCompat";

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25975b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    /* compiled from: PackageManagerCompat.java */
    @x0(30)
    private static class a {
        private a() {
        }

        static boolean a(@o0 Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    /* compiled from: PackageManagerCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private f0() {
    }

    @c1({c1.a.LIBRARY})
    public static boolean a(@o0 PackageManager packageManager) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 >= 30) || ((i4 < 30) && (b(packageManager) != null));
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
    public static ListenableFuture<Integer> c(@o0 Context context) {
        androidx.concurrent.futures.f<Integer> u4 = androidx.concurrent.futures.f.u();
        if (!s0.a(context)) {
            u4.p(0);
            return u4;
        }
        if (!a(context.getPackageManager())) {
            u4.p(1);
            return u4;
        }
        int i4 = context.getApplicationInfo().targetSdkVersion;
        if (i4 < 30) {
            u4.p(0);
            return u4;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            if (a.a(context)) {
                u4.p(Integer.valueOf(i4 >= 31 ? 5 : 4));
            } else {
                u4.p(2);
            }
            return u4;
        }
        if (i5 == 30) {
            u4.p(Integer.valueOf(a.a(context) ? 4 : 2));
            return u4;
        }
        final k0 k0Var = new k0(context);
        u4.n2(new Runnable() { // from class: androidx.core.content.e0
            @Override // java.lang.Runnable
            public final void run() {
                k0.this.b();
            }
        }, Executors.newSingleThreadExecutor());
        k0Var.a(u4);
        return u4;
    }
}
