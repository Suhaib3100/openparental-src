package com.google.android.gms.measurement.internal;

import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
abstract class zzf extends zze {
    private boolean zza;

    zzf(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzt.zzD();
    }

    protected final void zza() {
        if (!zze()) {
            throw new IllegalStateException(ProtectedSandApp.s("〼"));
        }
    }

    public final void zzb() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("〽"));
        }
        if (zzf()) {
            return;
        }
        this.zzt.zzB();
        this.zza = true;
    }

    public final void zzc() {
        if (this.zza) {
            throw new IllegalStateException(ProtectedSandApp.s("〾"));
        }
        zzd();
        this.zzt.zzB();
        this.zza = true;
    }

    @n1
    protected void zzd() {
    }

    final boolean zze() {
        return this.zza;
    }

    protected abstract boolean zzf();
}
