package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.text.m0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public enum zzcj implements zzjy {
    zzd(0),
    zza(1),
    zze(2),
    zzb(3),
    zzf(5),
    zzg(6),
    zzc(7),
    zzh(8),
    zzi(-1);

    private final int zzk;

    zzcj(int i4) {
        this.zzk = i4;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("틙"));
        sb.append(zzcj.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != zzi) {
            sb.append(ProtectedSandApp.s("틚"));
            sb.append(zza());
        }
        sb.append(ProtectedSandApp.s("틛"));
        sb.append(name());
        sb.append(m0.greater);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzjy
    public final int zza() {
        if (this != zzi) {
            return this.zzk;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("틜"));
    }
}
