package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzcd extends zzcl {
    private String zza;
    private zzco zzb;
    private zzcn zzc;
    private byte zzd;

    zzcd() {
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    final zzcl zza(zzco zzcoVar) {
        if (zzcoVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("틃"));
        }
        this.zzb = zzcoVar;
        return this;
    }

    public final zzcl zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    public final zzcl zza(zzcn zzcnVar) {
        if (zzcnVar != null) {
            this.zzc = zzcnVar;
            return this;
        }
        throw new NullPointerException(ProtectedSandApp.s("틂"));
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    public final zzcl zza(boolean z4) {
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    public final zzcm zza() {
        if (this.zzd == 1 && this.zza != null && this.zzb != null && this.zzc != null) {
            return new zzce(this.zza, this.zzb, this.zzc);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(ProtectedSandApp.s("틄"));
        }
        if ((1 & this.zzd) == 0) {
            sb.append(ProtectedSandApp.s("틅"));
        }
        if (this.zzb == null) {
            sb.append(ProtectedSandApp.s("틆"));
        }
        if (this.zzc == null) {
            sb.append(ProtectedSandApp.s("틇"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("틈").concat(String.valueOf(sb)));
    }
}
