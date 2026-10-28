package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.r0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzkc implements r0<Object> {
    private final /* synthetic */ zzno zza;
    private final /* synthetic */ zzjq zzb;

    zzkc(zzjq zzjqVar, zzno zznoVar) {
        this.zza = zznoVar;
        this.zzb = zzjqVar;
    }

    private final void zza() {
        SparseArray<Long> zzm = this.zzb.zzk().zzm();
        zzno zznoVar = this.zza;
        zzm.put(zznoVar.zzc, Long.valueOf(zznoVar.zzb));
        this.zzb.zzk().zza(zzm);
    }

    @Override // com.google.common.util.concurrent.r0
    public final void onFailure(Throwable th) {
        int i4;
        int i5;
        int i6;
        int i7;
        this.zzb.zzt();
        this.zzb.zzh = false;
        if (!this.zzb.zze().zza(zzbh.zzcn)) {
            this.zzb.zzas();
            this.zzb.zzj().zzg().zza(ProtectedSandApp.s("\ue12d"), th);
            return;
        }
        int zza = (this.zzb.zze().zza(zzbh.zzcl) ? zzjq.zza(this.zzb, th) : 2) - 1;
        if (zza == 0) {
            this.zzb.zzj().zzu().zza(ProtectedSandApp.s("\ue131"), zzgo.zza(this.zzb.zzg().zzad()), zzgo.zza(th.toString()));
            this.zzb.zzi = 1;
            this.zzb.zzal().add(this.zza);
            return;
        }
        if (zza != 1) {
            if (zza != 2) {
                return;
            }
            this.zzb.zzj().zzg().zza(ProtectedSandApp.s("\ue12e"), zzgo.zza(this.zzb.zzg().zzad()), th);
            zza();
            this.zzb.zzi = 1;
            this.zzb.zzas();
            return;
        }
        this.zzb.zzal().add(this.zza);
        i4 = this.zzb.zzi;
        if (i4 > 32) {
            this.zzb.zzi = 1;
            this.zzb.zzj().zzu().zza(ProtectedSandApp.s("\ue12f"), zzgo.zza(this.zzb.zzg().zzad()), zzgo.zza(th.toString()));
            return;
        }
        zzgq zzu = this.zzb.zzj().zzu();
        Object zza2 = zzgo.zza(this.zzb.zzg().zzad());
        i5 = this.zzb.zzi;
        zzu.zza(ProtectedSandApp.s("\ue130"), zza2, zzgo.zza(String.valueOf(i5)), zzgo.zza(th.toString()));
        zzjq zzjqVar = this.zzb;
        i6 = zzjqVar.zzi;
        zzjq.zzb(zzjqVar, i6);
        zzjq zzjqVar2 = this.zzb;
        i7 = zzjqVar2.zzi;
        zzjqVar2.zzi = i7 << 1;
    }

    @Override // com.google.common.util.concurrent.r0
    public final void onSuccess(Object obj) {
        this.zzb.zzt();
        if (!this.zzb.zze().zza(zzbh.zzcn)) {
            this.zzb.zzh = false;
            this.zzb.zzas();
            this.zzb.zzj().zzc().zza(ProtectedSandApp.s("\ue133"), this.zza.zza);
            return;
        }
        zza();
        this.zzb.zzh = false;
        this.zzb.zzi = 1;
        this.zzb.zzj().zzc().zza(ProtectedSandApp.s("\ue132"), this.zza.zza);
        this.zzb.zzas();
    }
}
