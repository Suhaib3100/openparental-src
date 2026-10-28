package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzlw implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzo zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdo zze;
    private final /* synthetic */ zzls zzf;

    zzlw(zzls zzlsVar, String str, String str2, zzo zzoVar, boolean z4, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzoVar;
        this.zzd = z4;
        this.zze = zzdoVar;
        this.zzf = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        Bundle bundle = new Bundle();
        try {
            zzgbVar = this.zzf.zzb;
            if (zzgbVar == null) {
                this.zzf.zzj().zzg().zza(ProtectedSandApp.s("\ue1a9"), this.zza, this.zzb);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            Bundle zza = zzos.zza(zzgbVar.zza(this.zza, this.zzb, this.zzd, this.zzc));
            this.zzf.zzar();
            this.zzf.zzq().zza(this.zze, zza);
        } catch (RemoteException e4) {
            this.zzf.zzj().zzg().zza(ProtectedSandApp.s("\ue1aa"), this.zza, e4);
        } finally {
            this.zzf.zzq().zza(this.zze, bundle);
        }
    }
}
