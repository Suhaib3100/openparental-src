package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzav extends zzaw {
    public zzav() {
        this.zza.add(zzbl.zze);
        this.zza.add(zzbl.zzf);
        this.zza.add(zzbl.zzg);
        this.zza.add(zzbl.zzh);
        this.zza.add(zzbl.zzi);
        this.zza.add(zzbl.zzj);
        this.zza.add(zzbl.zzk);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.zza;
        switch (zzh.zze(str).ordinal()) {
            case 4:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) a.a(zzbl.zze, 2, list, 0)).zzh().doubleValue()) & zzh.zzb(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue())));
            case 5:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) a.a(zzbl.zzf, 2, list, 0)).zzh().doubleValue()) << ((int) (zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                return new zzah(Double.valueOf(~zzh.zzb(zzgVar.zzb((zzap) a.a(zzbl.zzg, 1, list, 0)).zzh().doubleValue())));
            case 7:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) a.a(zzbl.zzh, 2, list, 0)).zzh().doubleValue()) | zzh.zzb(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue())));
            case 8:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) a.a(zzbl.zzi, 2, list, 0)).zzh().doubleValue()) >> ((int) (zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                return new zzah(Double.valueOf(zzh.zzd(zzgVar.zzb((zzap) a.a(zzbl.zzj, 2, list, 0)).zzh().doubleValue()) >>> ((int) (zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) a.a(zzbl.zzk, 2, list, 0)).zzh().doubleValue()) ^ zzh.zzb(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue())));
            default:
                return super.zzb(str);
        }
    }
}
