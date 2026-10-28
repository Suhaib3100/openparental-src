package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
class zzja implements zzjc {
    protected final zzhy zzu;

    zzja(zzhy zzhyVar) {
        Preconditions.checkNotNull(zzhyVar);
        this.zzu = zzhyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public Context zza() {
        return this.zzu.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public Clock zzb() {
        return this.zzu.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public zzab zzd() {
        return this.zzu.zzd();
    }

    @bg.b
    public zzag zze() {
        return this.zzu.zzf();
    }

    @bg.b
    public zzaz zzf() {
        return this.zzu.zzg();
    }

    @bg.b
    public zzgh zzi() {
        return this.zzu.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public zzgo zzj() {
        return this.zzu.zzj();
    }

    @bg.b
    public zzha zzk() {
        return this.zzu.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public zzhv zzl() {
        return this.zzu.zzl();
    }

    @bg.b
    public zzos zzq() {
        return this.zzu.zzt();
    }

    public void zzr() {
        this.zzu.zzl().zzr();
    }

    public void zzs() {
        this.zzu.zzy();
    }

    public void zzt() {
        this.zzu.zzl().zzt();
    }
}
