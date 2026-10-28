package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
enum zzb {
    zza(-999),
    zzb(-3),
    zzc(-2),
    zzd(-1),
    zze(0),
    zzf(1),
    zzg(2),
    zzh(3),
    zzi(4),
    zzj(5),
    zzk(6),
    zzl(7),
    zzm(8),
    zzn(11),
    zzo(12);

    private static final zzcd zzp;
    private final int zzr;

    static {
        zzcc zzccVar = new zzcc();
        for (zzb zzbVar : values()) {
            zzccVar.zza(Integer.valueOf(zzbVar.zzr), zzbVar);
        }
        zzp = zzccVar.zzb();
    }

    zzb(int i4) {
        this.zzr = i4;
    }

    static zzb zza(int i4) {
        zzcd zzcdVar = zzp;
        Integer valueOf = Integer.valueOf(i4);
        return !zzcdVar.containsKey(valueOf) ? zza : (zzb) zzcdVar.get(valueOf);
    }
}
