package com.google.android.gms.internal.measurement;

import androidx.fragment.app.c;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzce extends zzcm {
    private final String zzc;
    private final boolean zzd;
    private final zzco zze;
    private final zzcc zzf;
    private final zzcb zzg;
    private final zzcn zzh;

    public final boolean equals(Object obj) {
        zzcc zzccVar;
        zzcb zzcbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcm) {
            zzcm zzcmVar = (zzcm) obj;
            if (this.zzc.equals(zzcmVar.zze()) && this.zzd == zzcmVar.zzf() && this.zze.equals(zzcmVar.zzc()) && ((zzccVar = this.zzf) != null ? zzccVar.equals(zzcmVar.zza()) : zzcmVar.zza() == null) && ((zzcbVar = this.zzg) != null ? zzcbVar.equals(zzcmVar.zzb()) : zzcmVar.zzb() == null) && this.zzh.equals(zzcmVar.zzd())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.zzc.hashCode() ^ 1000003) * 1000003) ^ (this.zzd ? 1231 : 1237)) * 1000003) ^ this.zze.hashCode()) * 1000003;
        zzcc zzccVar = this.zzf;
        int hashCode2 = (hashCode ^ (zzccVar == null ? 0 : zzccVar.hashCode())) * 1000003;
        zzcb zzcbVar = this.zzg;
        return ((hashCode2 ^ (zzcbVar != null ? zzcbVar.hashCode() : 0)) * 1000003) ^ this.zzh.hashCode();
    }

    public final String toString() {
        String str = this.zzc;
        boolean z4 = this.zzd;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(this.zzf);
        String valueOf3 = String.valueOf(this.zzg);
        String valueOf4 = String.valueOf(this.zzh);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("틉"));
        sb.append(str);
        sb.append(ProtectedSandApp.s("틊"));
        sb.append(z4);
        sb.append(ProtectedSandApp.s("틋"));
        l0.a(sb, valueOf, ProtectedSandApp.s("틌"), valueOf2, ProtectedSandApp.s("틍"));
        return c.a(sb, valueOf3, ProtectedSandApp.s("틎"), valueOf4, ProtectedSandApp.s("틏"));
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcc zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcb zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzco zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcn zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final String zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final boolean zzf() {
        return this.zzd;
    }

    private zzce(String str, boolean z4, zzco zzcoVar, zzcc zzccVar, zzcb zzcbVar, zzcn zzcnVar) {
        this.zzc = str;
        this.zzd = z4;
        this.zze = zzcoVar;
        this.zzf = null;
        this.zzg = null;
        this.zzh = zzcnVar;
    }
}
