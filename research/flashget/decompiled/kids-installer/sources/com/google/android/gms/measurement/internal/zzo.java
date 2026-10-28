package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.3.0 */
/* loaded from: classes3.dex */
final class zzo implements zzhf {
    public final com.google.android.gms.internal.measurement.zzci zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzo(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final void interceptEvent(String str, String str2, Bundle bundle, long j5) {
        try {
            this.zza.zze(str, str2, bundle, j5);
        } catch (RemoteException e6) {
            zzgd zzgdVar = this.zzb.zza;
            if (zzgdVar != null) {
                zzgdVar.zzaA().zzk().zzb(ProtectedSandApp.s("♤"), e6);
            }
        }
    }
}
