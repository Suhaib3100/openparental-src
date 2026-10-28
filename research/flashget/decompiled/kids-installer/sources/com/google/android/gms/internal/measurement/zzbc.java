package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzbc extends zzaw {
    protected zzbc() {
        this.zza.add(zzbl.zzb);
        this.zza.add(zzbl.zzV);
        this.zza.add(zzbl.zzY);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.zza;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 1) {
            zzap zzb = zzgVar.zzb((zzap) a.a(zzbl.zzb, 2, list, 0));
            return !zzb.zzg().booleanValue() ? zzb : zzgVar.zzb((zzap) list.get(1));
        }
        if (ordinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.zzb((zzap) a.a(zzbl.zzV, 1, list, 0)).zzg().booleanValue()));
        }
        if (ordinal != 50) {
            return super.zzb(str);
        }
        zzap zzb2 = zzgVar.zzb((zzap) a.a(zzbl.zzY, 2, list, 0));
        return zzb2.zzg().booleanValue() ? zzb2 : zzgVar.zzb((zzap) list.get(1));
    }
}
