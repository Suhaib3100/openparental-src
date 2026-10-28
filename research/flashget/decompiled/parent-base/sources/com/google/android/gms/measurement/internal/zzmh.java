package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmh implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzls zzb;

    zzmh(zzls zzlsVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        zzgbVar = this.zzb.zzb;
        if (zzgbVar == null) {
            this.zzb.zzj().zzg().zza(ProtectedSandApp.s("\ue1bc"));
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzgbVar.zzh(this.zza);
            this.zzb.zzar();
        } catch (RemoteException e4) {
            this.zzb.zzj().zzg().zza(ProtectedSandApp.s("\ue1bd"), e4);
        }
    }
}
