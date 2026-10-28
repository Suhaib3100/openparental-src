package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzagb extends zzagc {
    zzagb(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.libraries.places.internal.zzagc
    public final double zza(Object obj, long j4) {
        return Double.longBitsToDouble(zzk(obj, j4));
    }

    @Override // com.google.android.libraries.places.internal.zzagc
    public final float zzb(Object obj, long j4) {
        return Float.intBitsToFloat(zzj(obj, j4));
    }

    @Override // com.google.android.libraries.places.internal.zzagc
    public final void zzc(Object obj, long j4, boolean z4) {
        if (zzagd.zzb) {
            zzagd.zzD(obj, j4, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzagd.zzE(obj, j4, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzagc
    public final void zzd(Object obj, long j4, byte b5) {
        if (zzagd.zzb) {
            zzagd.zzD(obj, j4, b5);
        } else {
            zzagd.zzE(obj, j4, b5);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzagc
    public final void zze(Object obj, long j4, double d5) {
        zzo(obj, j4, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.libraries.places.internal.zzagc
    public final void zzf(Object obj, long j4, float f4) {
        zzn(obj, j4, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.libraries.places.internal.zzagc
    public final boolean zzg(Object obj, long j4) {
        return zzagd.zzb ? zzagd.zzt(obj, j4) : zzagd.zzu(obj, j4);
    }
}
