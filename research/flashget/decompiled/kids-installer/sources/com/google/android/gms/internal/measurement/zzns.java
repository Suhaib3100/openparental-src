package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzns extends zznt {
    zzns(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final double zza(Object obj, long j5) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j5));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final float zzb(Object obj, long j5) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j5));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zzc(Object obj, long j5, boolean z5) {
        if (zznu.zzb) {
            zznu.zzD(obj, j5, r3 ? (byte) 1 : (byte) 0);
        } else {
            zznu.zzE(obj, j5, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zzd(Object obj, long j5, byte b6) {
        if (zznu.zzb) {
            zznu.zzD(obj, j5, b6);
        } else {
            zznu.zzE(obj, j5, b6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zze(Object obj, long j5, double d6) {
        this.zza.putLong(obj, j5, Double.doubleToLongBits(d6));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final void zzf(Object obj, long j5, float f6) {
        this.zza.putInt(obj, j5, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final boolean zzg(Object obj, long j5) {
        return zznu.zzb ? zznu.zzt(obj, j5) : zznu.zzu(obj, j5);
    }
}
