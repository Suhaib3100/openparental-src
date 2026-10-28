package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmd implements Runnable {
    private final /* synthetic */ zzlk zza;
    private final /* synthetic */ zzls zzb;

    zzmd(zzls zzlsVar, zzlk zzlkVar) {
        this.zza = zzlkVar;
        this.zzb = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        zzgbVar = this.zzb.zzb;
        if (zzgbVar == null) {
            this.zzb.zzj().zzg().zza(ProtectedSandApp.s("\ue1b6"));
            return;
        }
        try {
            zzlk zzlkVar = this.zza;
            if (zzlkVar == null) {
                zzgbVar.zza(0L, (String) null, (String) null, this.zzb.zza().getPackageName());
            } else {
                zzgbVar.zza(zzlkVar.zzc, zzlkVar.zza, zzlkVar.zzb, this.zzb.zza().getPackageName());
            }
            this.zzb.zzar();
        } catch (RemoteException e4) {
            this.zzb.zzj().zzg().zza(ProtectedSandApp.s("\ue1b7"), e4);
        }
    }
}
