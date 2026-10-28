package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.n1;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfe {
    final /* synthetic */ zzfi zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzfe(zzfi zzfiVar, String str, long j5) {
        this.zza = zzfiVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j5;
    }

    @n1
    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    @n1
    public final void zzb(long j5) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putLong(this.zzb, j5);
        edit.apply();
        this.zze = j5;
    }
}
