package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzkp extends zzf {
    protected final zzko zza;
    protected final zzkn zzb;
    protected final zzkl zzc;
    private Handler zzd;
    private boolean zze;

    zzkp(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = true;
        this.zza = new zzko(this);
        this.zzb = new zzkn(this);
        this.zzc = new zzkl(this);
    }

    static /* bridge */ /* synthetic */ void zzj(zzkp zzkpVar, long j5) {
        zzkpVar.zzg();
        zzkpVar.zzp();
        zzkpVar.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("ㆺ"), Long.valueOf(j5));
        zzkpVar.zzc.zza(j5);
        if (zzkpVar.zzt.zzf().zzu()) {
            zzkpVar.zzb.zzb(j5);
        }
    }

    static /* bridge */ /* synthetic */ void zzl(zzkp zzkpVar, long j5) {
        zzkpVar.zzg();
        zzkpVar.zzp();
        zzkpVar.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("ㆻ"), Long.valueOf(j5));
        if (zzkpVar.zzt.zzf().zzs(null, zzeg.zzaG)) {
            if (zzkpVar.zzt.zzf().zzu() || zzkpVar.zze) {
                zzkpVar.zzb.zzc(j5);
            }
        } else if (zzkpVar.zzt.zzf().zzu() || zzkpVar.zzt.zzm().zzm.zzb()) {
            zzkpVar.zzb.zzc(j5);
        }
        zzkpVar.zzc.zzb();
        zzko zzkoVar = zzkpVar.zza;
        zzkoVar.zza.zzg();
        if (zzkoVar.zza.zzt.zzJ()) {
            zzkoVar.zzb(zzkoVar.zza.zzt.zzax().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzp() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    @n1
    final void zzm(boolean z5) {
        zzg();
        this.zze = z5;
    }

    @n1
    final boolean zzo() {
        zzg();
        return this.zze;
    }
}
