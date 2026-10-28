package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zziu extends zziw {
    zziu(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final double zza(Object obj, long j4) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final float zzb(Object obj, long j4) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final void zzc(Object obj, long j4, boolean z4) {
        if (zzix.zza) {
            zzix.zzi(obj, j4, z4);
        } else {
            zzix.zzj(obj, j4, z4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final void zzd(Object obj, long j4, double d5) {
        this.zza.putLong(obj, j4, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final void zze(Object obj, long j4, float f4) {
        this.zza.putInt(obj, j4, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final boolean zzf(Object obj, long j4) {
        return zzix.zza ? zzix.zzq(obj, j4) : zzix.zzr(obj, j4);
    }
}
