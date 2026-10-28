package com.google.android.gms.measurement.internal;

import android.os.Handler;
import androidx.annotation.n1;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzkl {
    final /* synthetic */ zzkp zza;
    private zzkk zzb;

    zzkl(zzkp zzkpVar) {
        this.zza = zzkpVar;
    }

    @n1
    final void zza(long j5) {
        Handler handler;
        this.zzb = new zzkk(this, this.zza.zzt.zzax().currentTimeMillis(), j5);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    @n1
    final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzkk zzkkVar = this.zzb;
        if (zzkkVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzkkVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
        this.zza.zzm(false);
    }
}
