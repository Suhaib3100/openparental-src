package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzaw extends zzay {
    public zzaw() {
        this.zza.add(zzbv.zze);
        this.zza.add(zzbv.zzf);
        this.zza.add(zzbv.zzg);
        this.zza.add(zzbv.zzh);
        this.zza.add(zzbv.zzi);
        this.zza.add(zzbv.zzj);
        this.zza.add(zzbv.zzk);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        switch (zzaz.zza[zzg.zza(str).ordinal()]) {
            case 1:
                zzg.zza(zzbv.zze, 2, list);
                return new zzai(Double.valueOf(zzg.zzb(zzhVar.zza(list.get(0)).zze().doubleValue()) & zzg.zzb(zzhVar.zza(list.get(1)).zze().doubleValue())));
            case 2:
                zzg.zza(zzbv.zzf, 2, list);
                return new zzai(Double.valueOf(zzg.zzb(zzhVar.zza(list.get(0)).zze().doubleValue()) << ((int) (zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue()) & 31))));
            case 3:
                zzg.zza(zzbv.zzg, 1, list);
                return new zzai(Double.valueOf(~zzg.zzb(zzhVar.zza(list.get(0)).zze().doubleValue())));
            case 4:
                zzg.zza(zzbv.zzh, 2, list);
                return new zzai(Double.valueOf(zzg.zzb(zzhVar.zza(list.get(0)).zze().doubleValue()) | zzg.zzb(zzhVar.zza(list.get(1)).zze().doubleValue())));
            case 5:
                zzg.zza(zzbv.zzi, 2, list);
                return new zzai(Double.valueOf(zzg.zzb(zzhVar.zza(list.get(0)).zze().doubleValue()) >> ((int) (zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue()) & 31))));
            case 6:
                zzg.zza(zzbv.zzj, 2, list);
                return new zzai(Double.valueOf(zzg.zzc(zzhVar.zza(list.get(0)).zze().doubleValue()) >>> ((int) (zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue()) & 31))));
            case 7:
                zzg.zza(zzbv.zzk, 2, list);
                return new zzai(Double.valueOf(zzg.zzb(zzhVar.zza(list.get(0)).zze().doubleValue()) ^ zzg.zzb(zzhVar.zza(list.get(1)).zze().doubleValue())));
            default:
                return zza(str);
        }
    }
}
