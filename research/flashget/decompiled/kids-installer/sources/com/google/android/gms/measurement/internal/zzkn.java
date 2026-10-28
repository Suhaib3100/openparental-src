package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzph;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzkn {

    @m1
    protected long zza;

    @m1
    protected long zzb;
    final /* synthetic */ zzkp zzc;
    private final zzan zzd;

    public zzkn(zzkp zzkpVar) {
        this.zzc = zzkpVar;
        this.zzd = new zzkm(this, zzkpVar.zzt);
        long elapsedRealtime = zzkpVar.zzt.zzax().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    @n1
    final void zzb(long j5) {
        this.zzd.zzb();
    }

    @n1
    final void zzc(long j5) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j5;
        this.zzb = j5;
    }

    @n1
    public final boolean zzd(boolean z5, boolean z6, long j5) {
        this.zzc.zzg();
        this.zzc.zza();
        zzph.zzc();
        if (!this.zzc.zzt.zzf().zzs(null, zzeg.zzaf)) {
            this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzax().currentTimeMillis());
        } else if (this.zzc.zzt.zzJ()) {
            this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzax().currentTimeMillis());
        }
        long j6 = j5 - this.zza;
        if (!z5 && j6 < 1000) {
            this.zzc.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("ᆁ"), Long.valueOf(j6));
            return false;
        }
        if (!z6) {
            j6 = j5 - this.zzb;
            this.zzb = j5;
        }
        this.zzc.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("ᆂ"), Long.valueOf(j6));
        Bundle bundle = new Bundle();
        bundle.putLong(ProtectedSandApp.s("ᆃ"), j6);
        zzlp.zzK(this.zzc.zzt.zzs().zzj(!this.zzc.zzt.zzf().zzu()), bundle, true);
        if (!z6) {
            this.zzc.zzt.zzq().zzG(ProtectedSandApp.s("ᆄ"), ProtectedSandApp.s("ᆅ"), bundle);
        }
        this.zza = j5;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
