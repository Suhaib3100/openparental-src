package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzgb {
    private final Object zza;
    private final int zzb;

    zzgb(Object obj, int i4) {
        this.zza = obj;
        this.zzb = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgb)) {
            return false;
        }
        zzgb zzgbVar = (zzgb) obj;
        return this.zza == zzgbVar.zza && this.zzb == zzgbVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
