package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzqo;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzkk implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkl zzc;

    zzkk(zzkl zzklVar, long j5, long j6) {
        this.zzc = zzklVar;
        this.zza = j5;
        this.zzb = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkj
            @Override // java.lang.Runnable
            public final void run() {
                zzkk zzkkVar = zzkk.this;
                zzkl zzklVar = zzkkVar.zzc;
                long j5 = zzkkVar.zza;
                long j6 = zzkkVar.zzb;
                zzklVar.zza.zzg();
                zzklVar.zza.zzt.zzaA().zzc().zza(ProtectedSandApp.s("ᅽ"));
                zzklVar.zza.zzt.zzm().zzm.zza(true);
                zzklVar.zza.zzm(true);
                if (!zzklVar.zza.zzt.zzf().zzu()) {
                    zzklVar.zza.zzb.zzb(j6);
                    zzklVar.zza.zzb.zzd(false, false, j6);
                }
                zzqo.zzc();
                if (zzklVar.zza.zzt.zzf().zzs(null, zzeg.zzaB)) {
                    zzklVar.zza.zzt.zzaA().zzi().zzb(ProtectedSandApp.s("ᅾ"), Long.valueOf(j5));
                } else {
                    zzklVar.zza.zzt.zzq().zzH(ProtectedSandApp.s("ᅿ"), ProtectedSandApp.s("ᆀ"), j5, new Bundle());
                }
            }
        });
    }
}
