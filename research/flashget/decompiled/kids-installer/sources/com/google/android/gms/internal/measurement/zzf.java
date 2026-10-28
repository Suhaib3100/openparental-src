package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzf {
    final zzax zza;
    final zzg zzb;
    final zzg zzc;
    final zzj zzd;

    public zzf() {
        zzax zzaxVar = new zzax();
        this.zza = zzaxVar;
        zzg zzgVar = new zzg(null, zzaxVar);
        this.zzc = zzgVar;
        this.zzb = zzgVar.zza();
        zzj zzjVar = new zzj();
        this.zzd = zzjVar;
        zzgVar.zzg(ProtectedSandApp.s("ඉ"), new zzw(zzjVar));
        zzjVar.zza(ProtectedSandApp.s("ඊ"), new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzgVar.zzg(ProtectedSandApp.s("උ"), new zzah(Double.valueOf(p.f18289o)));
    }

    public final zzap zza(zzg zzgVar, zzgy... zzgyVarArr) {
        zzap zzapVar = zzap.zzf;
        for (zzgy zzgyVar : zzgyVarArr) {
            zzapVar = zzi.zza(zzgyVar);
            zzh.zzc(this.zzc);
            if ((zzapVar instanceof zzaq) || (zzapVar instanceof zzao)) {
                zzapVar = this.zza.zza(zzgVar, zzapVar);
            }
        }
        return zzapVar;
    }
}
