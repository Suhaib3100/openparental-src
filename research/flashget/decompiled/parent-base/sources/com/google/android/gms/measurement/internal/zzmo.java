package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmo implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzo zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdo zzd;
    private final /* synthetic */ zzls zze;

    zzmo(zzls zzlsVar, String str, String str2, zzo zzoVar, com.google.android.gms.internal.measurement.zzdo zzdoVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzoVar;
        this.zzd = zzdoVar;
        this.zze = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzgbVar = this.zze.zzb;
            if (zzgbVar == null) {
                this.zze.zzj().zzg().zza(ProtectedSandApp.s("\ue1cb"), this.zza, this.zzb);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            ArrayList<Bundle> zzb = zzos.zzb(zzgbVar.zza(this.zza, this.zzb, this.zzc));
            this.zze.zzar();
            this.zze.zzq().zza(this.zzd, zzb);
        } catch (RemoteException e4) {
            this.zze.zzj().zzg().zza(ProtectedSandApp.s("\ue1cc"), this.zza, this.zzb, e4);
        } finally {
            this.zze.zzq().zza(this.zzd, arrayList);
        }
    }
}
