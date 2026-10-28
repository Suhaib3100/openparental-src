package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmf implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ zzls zzc;

    zzmf(zzls zzlsVar, zzo zzoVar, Bundle bundle) {
        this.zza = zzoVar;
        this.zzb = bundle;
        this.zzc = zzlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgb zzgbVar;
        zzgbVar = this.zzc.zzb;
        String s4 = ProtectedSandApp.s("\ue1ba");
        if (zzgbVar == null) {
            this.zzc.zzj().zzg().zza(s4);
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzgbVar.zza(this.zzb, this.zza);
        } catch (RemoteException e4) {
            this.zzc.zzj().zzg().zza(s4, e4);
        }
    }
}
