package com.google.android.gms.measurement.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzog implements Callable<String> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zznv zzb;

    zzog(zznv zznvVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zznvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (!this.zzb.zzb((String) Preconditions.checkNotNull(this.zza.zza)).zzh() || !zzje.zzb(this.zza.zzt).zzh()) {
            this.zzb.zzj().zzp().zza(ProtectedSandApp.s("\ue369"));
            return null;
        }
        zzg zza = this.zzb.zza(this.zza);
        if (zza != null) {
            return zza.zzad();
        }
        this.zzb.zzj().zzu().zza(ProtectedSandApp.s("\ue368"));
        return null;
    }
}
