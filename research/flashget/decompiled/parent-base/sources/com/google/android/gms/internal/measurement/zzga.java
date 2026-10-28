package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.text.m0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public enum zzga implements zzjy {
    zza(0),
    zzb(1),
    zzc(2),
    zzd(3),
    zze(4),
    zzf(5);

    private final int zzh;

    zzga(int i4) {
        this.zzh = i4;
    }

    public static zzjx zzb() {
        return zzfz.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return ProtectedSandApp.s("푔") + zzga.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("푕") + this.zzh + ProtectedSandApp.s("푖") + name() + m0.greater;
    }

    @Override // com.google.android.gms.internal.measurement.zzjy
    public final int zza() {
        return this.zzh;
    }

    public static zzga zza(int i4) {
        if (i4 == 0) {
            return zza;
        }
        if (i4 == 1) {
            return zzb;
        }
        if (i4 == 2) {
            return zzc;
        }
        if (i4 == 3) {
            return zzd;
        }
        if (i4 == 4) {
            return zze;
        }
        if (i4 != 5) {
            return null;
        }
        return zzf;
    }
}
