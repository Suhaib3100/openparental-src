package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
@m1
/* loaded from: classes2.dex */
public final class zzhi {
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
    com.google.android.gms.internal.measurement.zzcl zzg;
    boolean zzh;

    @q0
    final Long zzi;

    @q0
    String zzj;

    @m1
    public zzhi(Context context, @q0 com.google.android.gms.internal.measurement.zzcl zzclVar, @q0 Long l5) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l5;
        if (zzclVar != null) {
            this.zzg = zzclVar;
            this.zzb = zzclVar.zzf;
            this.zzc = zzclVar.zze;
            this.zzd = zzclVar.zzd;
            this.zzh = zzclVar.zzc;
            this.zzf = zzclVar.zzb;
            this.zzj = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean(ProtectedSandApp.s("ᄂ"), true));
            }
        }
    }
}
