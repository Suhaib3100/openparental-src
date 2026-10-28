package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
@m1
/* loaded from: classes5.dex */
public final class zzjo {
    final Context zza;

    @q0
    String zzb;

    @q0
    String zzc;

    @q0
    String zzd;

    @q0
    Boolean zze;
    long zzf;

    @q0
    com.google.android.gms.internal.measurement.zzdw zzg;
    boolean zzh;

    @q0
    Long zzi;

    @q0
    String zzj;

    @m1
    public zzjo(Context context, @q0 com.google.android.gms.internal.measurement.zzdw zzdwVar, @q0 Long l4) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l4;
        if (zzdwVar != null) {
            this.zzg = zzdwVar;
            this.zzb = zzdwVar.zzf;
            this.zzc = zzdwVar.zze;
            this.zzd = zzdwVar.zzd;
            this.zzh = zzdwVar.zzc;
            this.zzf = zzdwVar.zzb;
            this.zzj = zzdwVar.zzh;
            Bundle bundle = zzdwVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean(ProtectedSandApp.s("\ue0a1"), true));
            }
        }
    }
}
