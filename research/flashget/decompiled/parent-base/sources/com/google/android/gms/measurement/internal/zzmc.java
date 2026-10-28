package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmc implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdo zzb;
    private final /* synthetic */ zzls zzc;

    zzmc(zzls zzlsVar, zzo zzoVar, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        this.zza = zzoVar;
        this.zzb = zzdoVar;
        this.zzc = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        String s4 = ProtectedSandApp.s("\ue1b4");
        try {
            if (!this.zzc.zzk().zzo().zzh()) {
                this.zzc.zzj().zzv().zza(ProtectedSandApp.s("\ue1b5"));
                this.zzc.zzm().zzc((String) null);
                this.zzc.zzk().zze.zza(null);
                return;
            }
            zzgbVar = this.zzc.zzb;
            if (zzgbVar == null) {
                this.zzc.zzj().zzg().zza(s4);
                return;
            }
            Preconditions.checkNotNull(this.zza);
            String zzb = zzgbVar.zzb(this.zza);
            if (zzb != null) {
                this.zzc.zzm().zzc(zzb);
                this.zzc.zzk().zze.zza(zzb);
            }
            this.zzc.zzar();
            this.zzc.zzq().zza(this.zzb, zzb);
        } catch (RemoteException e4) {
            this.zzc.zzj().zzg().zza(s4, e4);
        } finally {
            this.zzc.zzq().zza(this.zzb, (String) null);
        }
    }
}
