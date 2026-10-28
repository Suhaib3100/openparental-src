package com.google.android.gms.measurement.internal;

import androidx.annotation.q0;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzoj {
    private long zza;
    private zzfy.zzj zzb;
    private String zzc;
    private Map<String, String> zzd;
    private zznt zze;

    public final long zza() {
        return this.zza;
    }

    public final zznw zzb() {
        return new zznw(this.zzc, this.zzd, this.zze);
    }

    @q0
    public final zzfy.zzj zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final Map<String, String> zze() {
        return this.zzd;
    }

    private zzoj(long j4, zzfy.zzj zzjVar, String str, Map<String, String> map, zznt zzntVar) {
        this.zza = j4;
        this.zzb = zzjVar;
        this.zzc = str;
        this.zzd = map;
        this.zze = zzntVar;
    }
}
