package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zznq extends zznr {
    private final AlarmManager zza;
    private zzav zzb;
    private Integer zzc;

    protected zznq(zznv zznvVar) {
        super(zznvVar);
        this.zza = (AlarmManager) zza().getSystemService(ProtectedSandApp.s("\ue222"));
    }

    private final int zzv() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf((ProtectedSandApp.s("\ue223") + zza().getPackageName()).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzw() {
        Context zza = zza();
        return com.google.android.gms.internal.measurement.zzcw.zza(zza, 0, new Intent().setClassName(zza, ProtectedSandApp.s("\ue224")).setAction(ProtectedSandApp.s("\ue225")), com.google.android.gms.internal.measurement.zzcw.zza);
    }

    private final zzav zzx() {
        if (this.zzb == null) {
            this.zzb = new zznp(this, this.zzg.zzk());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzy() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService(ProtectedSandApp.s("\ue226"));
        if (jobScheduler != null) {
            jobScheduler.cancel(zzv());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzoo g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzw());
        }
        zzy();
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzhl zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzmw zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zznu zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final void zzu() {
        zzal();
        zzj().zzp().zza(ProtectedSandApp.s("\ue22e"));
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzw());
        }
        zzx().zza();
        zzy();
    }

    public final void zza(long j4) {
        zzal();
        Context zza = zza();
        if (!zzos.zza(zza)) {
            zzj().zzc().zza(ProtectedSandApp.s("\ue227"));
        }
        if (!zzos.zza(zza, false)) {
            zzj().zzc().zza(ProtectedSandApp.s("\ue228"));
        }
        zzu();
        zzj().zzp().zza(ProtectedSandApp.s("\ue229"), Long.valueOf(j4));
        zzb().elapsedRealtime();
        if (j4 < Math.max(0L, zzbh.zzy.zza(null).longValue()) && !zzx().zzc()) {
            zzx().zza(j4);
        }
        Context zza2 = zza();
        ComponentName componentName = new ComponentName(zza2, ProtectedSandApp.s("\ue22a"));
        int zzv = zzv();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(ProtectedSandApp.s("\ue22b"), ProtectedSandApp.s("\ue225"));
        com.google.android.gms.internal.measurement.zzcv.zza(zza2, new JobInfo.Builder(zzv, componentName).setMinimumLatency(j4).setOverrideDeadline(j4 << 1).setExtras(persistableBundle).build(), ProtectedSandApp.s("\ue22c"), ProtectedSandApp.s("\ue22d"));
    }
}
