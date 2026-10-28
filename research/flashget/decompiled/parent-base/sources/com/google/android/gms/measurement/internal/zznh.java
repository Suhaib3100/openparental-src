package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zznh {

    @m1
    protected long zza;
    final /* synthetic */ zznb zzb;

    @m1
    private long zzc;
    private final zzav zzd;

    public zznh(zznb zznbVar) {
        this.zzb = zznbVar;
        this.zzd = new zznk(this, zznbVar.zzu);
        long elapsedRealtime = zznbVar.zzb().elapsedRealtime();
        this.zzc = elapsedRealtime;
        this.zza = elapsedRealtime;
    }

    @n1
    @m1
    final long zza(long j4) {
        long j5 = j4 - this.zza;
        this.zza = j4;
        return j5;
    }

    @n1
    final void zzb(long j4) {
        this.zzd.zza();
    }

    @n1
    final void zzc(long j4) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j4;
        this.zza = j4;
    }

    static /* synthetic */ void zza(zznh zznhVar) {
        zznhVar.zzb.zzt();
        zznhVar.zza(false, false, zznhVar.zzb.zzb().elapsedRealtime());
        zznhVar.zzb.zzc().zza(zznhVar.zzb.zzb().elapsedRealtime());
    }

    final void zza() {
        this.zzd.zza();
        if (this.zzb.zze().zza(zzbh.zzdb)) {
            this.zzc = this.zzb.zzb().elapsedRealtime();
        } else {
            this.zzc = 0L;
        }
        this.zza = this.zzc;
    }

    @n1
    public final boolean zza(boolean z4, boolean z5, long j4) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long j5 = j4 - this.zzc;
        if (!z4 && j5 < 1000) {
            this.zzb.zzj().zzp().zza(ProtectedSandApp.s("\ue1fe"), Long.valueOf(j5));
            return false;
        }
        if (!z5) {
            j5 = zza(j4);
        }
        this.zzb.zzj().zzp().zza(ProtectedSandApp.s("\ue1ff"), Long.valueOf(j5));
        Bundle bundle = new Bundle();
        bundle.putLong(ProtectedSandApp.s("\ue200"), j5);
        zzos.zza(this.zzb.zzn().zza(!this.zzb.zze().zzw()), bundle, true);
        if (!z5) {
            this.zzb.zzm().zzc(ProtectedSandApp.s("\ue201"), ProtectedSandApp.s("\ue202"), bundle);
        }
        this.zzc = j4;
        this.zzd.zza();
        this.zzd.zza(zzbh.zzbc.zza(null).longValue());
        return true;
    }
}
