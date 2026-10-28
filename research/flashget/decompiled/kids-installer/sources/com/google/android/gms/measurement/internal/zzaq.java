package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaq {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    zzaq(String str, String str2, long j5, long j6, long j7, long j8, long j9, Long l5, Long l6, Long l7, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j5 >= 0);
        Preconditions.checkArgument(j6 >= 0);
        Preconditions.checkArgument(j7 >= 0);
        Preconditions.checkArgument(j9 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j5;
        this.zzd = j6;
        this.zze = j7;
        this.zzf = j8;
        this.zzg = j9;
        this.zzh = l5;
        this.zzi = l6;
        this.zzj = l7;
        this.zzk = bool;
    }

    final zzaq zza(Long l5, Long l6, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l5, l6, bool);
    }

    final zzaq zzb(long j5, long j6) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j5, Long.valueOf(j6), this.zzi, this.zzj, this.zzk);
    }

    final zzaq zzc(long j5) {
        return new zzaq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j5, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
