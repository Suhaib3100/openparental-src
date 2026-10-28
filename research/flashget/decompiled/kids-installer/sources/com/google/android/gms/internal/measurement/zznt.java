package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zznt {
    final Unsafe zza;

    zznt(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j5);

    public abstract float zzb(Object obj, long j5);

    public abstract void zzc(Object obj, long j5, boolean z5);

    public abstract void zzd(Object obj, long j5, byte b6);

    public abstract void zze(Object obj, long j5, double d6);

    public abstract void zzf(Object obj, long j5, float f6);

    public abstract boolean zzg(Object obj, long j5);
}
