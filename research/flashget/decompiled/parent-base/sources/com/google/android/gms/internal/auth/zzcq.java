package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class zzcq {
    static volatile zzdh zza = zzdh.zzc();
    private static final Object zzb = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (com.flashget.parentalcontrol.ProtectedSandApp.s("켇").equals(r0.packageName) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "켅"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L1f
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = "켆"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.concat(r6)
            return r1
        L1f:
            com.google.android.gms.internal.auth.zzdh r6 = com.google.android.gms.internal.auth.zzcq.zza
            boolean r6 = r6.zzb()
            if (r6 == 0) goto L34
            com.google.android.gms.internal.auth.zzdh r5 = com.google.android.gms.internal.auth.zzcq.zza
            java.lang.Object r5 = r5.zza()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L34:
            java.lang.Object r6 = com.google.android.gms.internal.auth.zzcq.zzb
            monitor-enter(r6)
            com.google.android.gms.internal.auth.zzdh r0 = com.google.android.gms.internal.auth.zzcq.zza     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r0.zzb()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4f
            com.google.android.gms.internal.auth.zzdh r5 = com.google.android.gms.internal.auth.zzcq.zza     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r5.zza()     // Catch: java.lang.Throwable -> L4d
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L4d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4d
            return r5
        L4d:
            r5 = move-exception
            goto Lb4
        L4f:
            java.lang.String r0 = "켇"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L87
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "켅"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L4d
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4d
            r4 = 29
            if (r3 >= r4) goto L71
            r3 = r1
            goto L73
        L71:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L73:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L9c
            java.lang.String r2 = "켇"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L9c
        L87:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = "켇"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L4d android.content.pm.PackageManager.NameNotFoundException -> L9c
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: java.lang.Throwable -> L4d android.content.pm.PackageManager.NameNotFoundException -> L9c
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L4d
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L9c
            r1 = 1
        L9c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.auth.zzdh r5 = com.google.android.gms.internal.auth.zzdh.zzd(r5)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.auth.zzcq.zza = r5     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.auth.zzdh r5 = com.google.android.gms.internal.auth.zzcq.zza
            java.lang.Object r5 = r5.zza()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        Lb4:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcq.zza(android.content.Context, android.net.Uri):boolean");
    }
}
