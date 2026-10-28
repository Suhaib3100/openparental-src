package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.n1;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfc {
    final /* synthetic */ zzfi zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzfc(zzfi zzfiVar, String str, boolean z5) {
        this.zza = zzfiVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z5;
    }

    @n1
    public final void zza(boolean z5) {
        SharedPreferences.Editor edit = this.zza.zza().edit();
        edit.putBoolean(this.zzb, z5);
        edit.apply();
        this.zze = z5;
    }

    @n1
    public final boolean zzb() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zza().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }
}
