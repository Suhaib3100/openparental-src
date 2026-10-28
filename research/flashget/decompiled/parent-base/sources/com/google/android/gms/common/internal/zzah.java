package com.google.android.gms.common.internal;

import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzah {
    private static final Uri zza = new Uri.Builder().scheme(ProtectedSandApp.s("쭈")).authority(ProtectedSandApp.s("쭉")).build();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.content.Intent zza(android.content.Context r4, com.google.android.gms.common.internal.zzn r5) throws com.google.android.gms.common.internal.zzaf {
        /*
            java.lang.String r0 = r5.zza()
            if (r0 != 0) goto L14
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            android.content.ComponentName r5 = r5.zzc()
            android.content.Intent r4 = r4.setComponent(r5)
            return r4
        L14:
            boolean r1 = r5.zzd()
            r2 = 0
            if (r1 == 0) goto Lab
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "쭊"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r1.putString(r3, r0)
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
            android.net.Uri r3 = com.google.android.gms.common.internal.zzah.zza     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
            android.content.ContentProviderClient r4 = r4.acquireUnstableContentProviderClient(r3)     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
            if (r4 == 0) goto L4c
            java.lang.String r3 = "쭋"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L47
            android.os.Bundle r1 = r4.call(r3, r2, r1)     // Catch: java.lang.Throwable -> L47
            r4.release()     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
            goto L66
        L43:
            r4 = move-exception
            goto L58
        L45:
            r4 = move-exception
            goto L58
        L47:
            r1 = move-exception
            r4.release()     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
            throw r1     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
        L4c:
            android.os.RemoteException r4 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
            java.lang.String r1 = "쭌"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
            r4.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
            throw r4     // Catch: java.lang.IllegalArgumentException -> L43 android.os.RemoteException -> L45
        L58:
            java.lang.String r1 = "쭍"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r4 = r4.toString()
            r1.concat(r4)
            r1 = r2
        L66:
            if (r1 != 0) goto L69
            goto L87
        L69:
            java.lang.String r4 = "쭎"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            android.os.Parcelable r4 = r1.getParcelable(r4)
            android.content.Intent r4 = (android.content.Intent) r4
            if (r4 == 0) goto L79
            r2 = r4
            goto L87
        L79:
            java.lang.String r4 = "쭏"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            android.os.Parcelable r4 = r1.getParcelable(r4)
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            if (r4 != 0) goto L93
        L87:
            if (r2 != 0) goto Lab
            java.lang.String r4 = "쭐"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r4.concat(r0)
            goto Lab
        L93:
            int r5 = r0.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r5 = r5 + 72
            r0.<init>(r5)
            com.google.android.gms.common.internal.zzaf r5 = new com.google.android.gms.common.internal.zzaf
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 25
            r0.<init>(r1, r4)
            r5.<init>(r0)
            throw r5
        Lab:
            if (r2 != 0) goto Lbb
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            java.lang.String r5 = r5.zzb()
            android.content.Intent r4 = r4.setPackage(r5)
            return r4
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzah.zza(android.content.Context, com.google.android.gms.common.internal.zzn):android.content.Intent");
    }
}
