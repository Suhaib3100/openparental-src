package com.google.android.gms.internal.measurement;

import androidx.compose.runtime.changelist.j;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzbo extends zzay {
    protected zzbo() {
        this.zza.add(zzbv.zza);
        this.zza.add(zzbv.zzu);
        this.zza.add(zzbv.zzap);
        this.zza.add(zzbv.zzaq);
        this.zza.add(zzbv.zzar);
        this.zza.add(zzbv.zzaw);
        this.zza.add(zzbv.zzax);
        this.zza.add(zzbv.zzaz);
        this.zza.add(zzbv.zzba);
        this.zza.add(zzbv.zzbd);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        switch (zzbr.zza[zzg.zza(str).ordinal()]) {
            case 1:
                zzg.zza(zzbv.zza, 2, list);
                zzaq zza = zzhVar.zza(list.get(0));
                zzaq zza2 = zzhVar.zza(list.get(1));
                if ((zza instanceof zzak) || (zza instanceof zzas) || (zza2 instanceof zzak) || (zza2 instanceof zzas)) {
                    return new zzas(j.a(zza.zzf(), zza2.zzf()));
                }
                return new zzai(Double.valueOf(zza2.zze().doubleValue() + zza.zze().doubleValue()));
            case 2:
                zzg.zza(zzbv.zzu, 2, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() / zzhVar.zza(list.get(1)).zze().doubleValue()));
            case 3:
                zzg.zza(zzbv.zzap, 2, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() % zzhVar.zza(list.get(1)).zze().doubleValue()));
            case 4:
                zzg.zza(zzbv.zzaq, 2, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() * zzhVar.zza(list.get(1)).zze().doubleValue()));
            case 5:
                zzg.zza(zzbv.zzar, 1, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                zzg.zza(str, 2, list);
                zzaq zza3 = zzhVar.zza(list.get(0));
                zzhVar.zza(list.get(1));
                return zza3;
            case 8:
            case 9:
                zzg.zza(str, 1, list);
                return zzhVar.zza(list.get(0));
            case 10:
                zzg.zza(zzbv.zzbd, 2, list);
                zzaq zza4 = zzhVar.zza(list.get(0));
                zzai zzaiVar = new zzai(Double.valueOf(zzhVar.zza(list.get(1)).zze().doubleValue() * (-1.0d)));
                return new zzai(Double.valueOf(zzaiVar.zze().doubleValue() + zza4.zze().doubleValue()));
            default:
                return zza(str);
        }
    }
}
