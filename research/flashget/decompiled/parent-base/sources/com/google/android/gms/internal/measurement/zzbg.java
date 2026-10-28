package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzbg extends zzay {
    protected zzbg() {
        this.zza.add(zzbv.zzb);
        this.zza.add(zzbv.zzas);
        this.zza.add(zzbv.zzav);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        int i4 = zzbj.zza[zzg.zza(str).ordinal()];
        if (i4 == 1) {
            zzg.zza(zzbv.zzb, 2, list);
            zzaq zza = zzhVar.zza(list.get(0));
            return !zza.zzd().booleanValue() ? zza : zzhVar.zza(list.get(1));
        }
        if (i4 == 2) {
            zzg.zza(zzbv.zzas, 1, list);
            return new zzag(Boolean.valueOf(!zzhVar.zza(list.get(0)).zzd().booleanValue()));
        }
        if (i4 != 3) {
            return zza(str);
        }
        zzg.zza(zzbv.zzav, 2, list);
        zzaq zza2 = zzhVar.zza(list.get(0));
        return zza2.zzd().booleanValue() ? zza2 : zzhVar.zza(list.get(1));
    }
}
