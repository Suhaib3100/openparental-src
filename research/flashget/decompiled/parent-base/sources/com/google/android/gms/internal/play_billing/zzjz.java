package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public enum zzjz implements zzgr {
    zza(0),
    zzb(1),
    zzc(2),
    zzd(3),
    zze(4),
    zzf(5);

    private final int zzh;

    zzjz(int i4) {
        this.zzh = i4;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final int zza() {
        return this.zzh;
    }
}
