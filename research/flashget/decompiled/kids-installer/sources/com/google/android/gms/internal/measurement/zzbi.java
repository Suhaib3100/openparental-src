package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzbi extends zzaw {
    protected zzbi() {
        this.zza.add(zzbl.zza);
        this.zza.add(zzbl.zzv);
        this.zza.add(zzbl.zzS);
        this.zza.add(zzbl.zzT);
        this.zza.add(zzbl.zzU);
        this.zza.add(zzbl.zzaa);
        this.zza.add(zzbl.zzab);
        this.zza.add(zzbl.zzad);
        this.zza.add(zzbl.zzae);
        this.zza.add(zzbl.zzah);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.zza;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 0) {
            zzap zzb = zzgVar.zzb((zzap) a.a(zzblVar, 2, list, 0));
            zzap zzb2 = zzgVar.zzb((zzap) list.get(1));
            if (!(zzb instanceof zzal) && !(zzb instanceof zzat) && !(zzb2 instanceof zzal) && !(zzb2 instanceof zzat)) {
                return new zzah(Double.valueOf(zzb2.zzh().doubleValue() + zzb.zzh().doubleValue()));
            }
            return new zzat(String.valueOf(zzb.zzi()).concat(String.valueOf(zzb2.zzi())));
        }
        if (ordinal == 21) {
            return new zzah(Double.valueOf(zzgVar.zzb((zzap) a.a(zzbl.zzv, 2, list, 0)).zzh().doubleValue() / zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
        }
        if (ordinal == 59) {
            zzap zzb3 = zzgVar.zzb((zzap) a.a(zzbl.zzah, 2, list, 0));
            zzah zzahVar = new zzah(Double.valueOf(-zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
            return new zzah(Double.valueOf(zzahVar.zzh().doubleValue() + zzb3.zzh().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            zzh.zzh(str, 2, list);
            zzap zzb4 = zzgVar.zzb((zzap) list.get(0));
            zzgVar.zzb((zzap) list.get(1));
            return zzb4;
        }
        if (ordinal == 55 || ordinal == 56) {
            zzh.zzh(str, 1, list);
            return zzgVar.zzb((zzap) list.get(0));
        }
        switch (ordinal) {
            case 44:
                return new zzah(Double.valueOf(zzgVar.zzb((zzap) a.a(zzbl.zzS, 2, list, 0)).zzh().doubleValue() % zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
            case 45:
                return new zzah(Double.valueOf(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() * zzgVar.zzb((zzap) a.a(zzbl.zzT, 2, list, 0)).zzh().doubleValue()));
            case 46:
                return new zzah(Double.valueOf(-zzgVar.zzb((zzap) a.a(zzbl.zzU, 1, list, 0)).zzh().doubleValue()));
            default:
                return super.zzb(str);
        }
    }
}
