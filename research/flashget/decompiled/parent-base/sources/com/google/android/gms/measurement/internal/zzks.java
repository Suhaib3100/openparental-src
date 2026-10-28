package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzks implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdo zza;
    private final /* synthetic */ zzjq zzb;

    zzks(zzjq zzjqVar, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        this.zza = zzdoVar;
        this.zzb = zzjqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zzb
            com.google.android.gms.measurement.internal.zznb r0 = r0.zzp()
            com.google.android.gms.measurement.internal.zzha r1 = r0.zzk()
            com.google.android.gms.measurement.internal.zzje r1 = r1.zzo()
            boolean r1 = r1.zzh()
            r2 = 0
            if (r1 != 0) goto L28
            com.google.android.gms.measurement.internal.zzgo r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzgq r0 = r0.zzv()
            java.lang.String r1 = "\ue138"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.zza(r1)
        L26:
            r0 = r2
            goto L59
        L28:
            com.google.android.gms.measurement.internal.zzha r1 = r0.zzk()
            com.google.android.gms.common.util.Clock r3 = r0.zzb()
            long r3 = r3.currentTimeMillis()
            boolean r1 = r1.zza(r3)
            if (r1 != 0) goto L26
            com.google.android.gms.measurement.internal.zzha r1 = r0.zzk()
            com.google.android.gms.measurement.internal.zzhb r1 = r1.zzl
            long r3 = r1.zza()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L4b
            goto L26
        L4b:
            com.google.android.gms.measurement.internal.zzha r0 = r0.zzk()
            com.google.android.gms.measurement.internal.zzhb r0 = r0.zzl
            long r0 = r0.zza()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L59:
            if (r0 == 0) goto L6d
            com.google.android.gms.measurement.internal.zzjq r1 = r7.zzb
            com.google.android.gms.measurement.internal.zzhy r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzos r1 = r1.zzt()
            com.google.android.gms.internal.measurement.zzdo r2 = r7.zza
            long r3 = r0.longValue()
            r1.zza(r2, r3)
            return
        L6d:
            com.google.android.gms.internal.measurement.zzdo r0 = r7.zza     // Catch: android.os.RemoteException -> L73
            r0.zza(r2)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzjq r1 = r7.zzb
            com.google.android.gms.measurement.internal.zzhy r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzgo r1 = r1.zzj()
            com.google.android.gms.measurement.internal.zzgq r1 = r1.zzg()
            java.lang.String r2 = "\ue139"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r1.zza(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzks.run():void");
    }
}
