package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.g0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhi {
    private static volatile g0<Boolean> zza = g0.a();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo(ProtectedSandApp.s("풆"), 0).flags & 129) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (com.flashget.parentalcontrol.ProtectedSandApp.s("풆").equals(r1.packageName) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "풇"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            boolean r6 = r0.equals(r6)
            r0 = 0
            if (r6 != 0) goto L12
            return r0
        L12:
            com.google.common.base.g0<java.lang.Boolean> r6 = com.google.android.gms.internal.measurement.zzhi.zza
            boolean r6 = r6.e()
            if (r6 == 0) goto L27
            com.google.common.base.g0<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.zzhi.zza
            java.lang.Object r5 = r5.d()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L27:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzhi.zzb
            monitor-enter(r6)
            com.google.common.base.g0<java.lang.Boolean> r1 = com.google.android.gms.internal.measurement.zzhi.zza     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L42
            com.google.common.base.g0<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.zzhi.zza     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = r5.d()     // Catch: java.lang.Throwable -> L40
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L40
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L40
            return r5
        L40:
            r5 = move-exception
            goto L9a
        L42:
            java.lang.String r1 = "풆"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L53
            goto L7b
        L53:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "풇"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L40
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L40
            r4 = 29
            if (r3 >= r4) goto L65
            r3 = r0
            goto L67
        L65:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L67:
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L82
            java.lang.String r2 = "풆"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Throwable -> L40
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L82
        L7b:
            boolean r5 = zza(r5)     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L82
            r0 = 1
        L82:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L40
            com.google.common.base.g0 r5 = com.google.common.base.g0.f(r5)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.measurement.zzhi.zza = r5     // Catch: java.lang.Throwable -> L40
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L40
            com.google.common.base.g0<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.zzhi.zza
            java.lang.Object r5 = r5.d()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L9a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L40
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhi.zza(android.content.Context, android.net.Uri):boolean");
    }
}
