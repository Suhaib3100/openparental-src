package com.google.android.gms.measurement.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzky implements Runnable {
    private final /* synthetic */ zzax zza;
    private final /* synthetic */ zzjq zzb;

    zzky(zzjq zzjqVar, zzax zzaxVar) {
        this.zza = zzaxVar;
        this.zzb = zzjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zzb.zzk().zza(this.zza)) {
            this.zzb.zzj().zzo().zza(ProtectedSandApp.s("\ue13b"), Integer.valueOf(this.zza.zza()));
        } else {
            this.zzb.zzj().zzp().zza(ProtectedSandApp.s("\ue13a"), this.zza);
            if (this.zzb.zzo().zzao()) {
                this.zzb.zzo().zzaj();
            } else {
                this.zzb.zzo().zza(false);
            }
        }
    }
}
