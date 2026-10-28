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
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzks extends zzku {
    private final AlarmManager zza;
    private zzan zzb;
    private Integer zzc;

    protected zzks(zzlh zzlhVar) {
        super(zzlhVar);
        this.zza = (AlarmManager) this.zzt.zzaw().getSystemService(ProtectedSandApp.s("ㆼ"));
    }

    private final int zzf() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf(ProtectedSandApp.s("ㆽ").concat(String.valueOf(this.zzt.zzaw().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context zzaw = this.zzt.zzaw();
        return PendingIntent.getBroadcast(zzaw, 0, new Intent().setClassName(zzaw, ProtectedSandApp.s("ㆾ")).setAction(ProtectedSandApp.s("ㆿ")), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    private final zzan zzi() {
        if (this.zzb == null) {
            this.zzb = new zzkr(this, this.zzf.zzp());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzt.zzaw().getSystemService(ProtectedSandApp.s("㇀"));
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzW();
        c.a(this.zzt, ProtectedSandApp.s("㇁"));
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    protected final boolean zzb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzj();
        return false;
    }

    public final void zzd(long j5) {
        zzW();
        this.zzt.zzay();
        Context zzaw = this.zzt.zzaw();
        if (!zzlp.zzal(zzaw)) {
            this.zzt.zzaA().zzc().zza(ProtectedSandApp.s("㇂"));
        }
        if (!zzlp.zzam(zzaw, false)) {
            this.zzt.zzaA().zzc().zza(ProtectedSandApp.s("㇃"));
        }
        zza();
        this.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("㇄"), Long.valueOf(j5));
        this.zzt.zzax().elapsedRealtime();
        this.zzt.zzf();
        if (j5 < Math.max(0L, ((Long) zzeg.zzx.zza(null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j5);
        }
        this.zzt.zzay();
        Context zzaw2 = this.zzt.zzaw();
        ComponentName componentName = new ComponentName(zzaw2, ProtectedSandApp.s("㇅"));
        int zzf = zzf();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(ProtectedSandApp.s("㇆"), ProtectedSandApp.s("㇇"));
        com.google.android.gms.internal.measurement.zzbt.zza(zzaw2, new JobInfo.Builder(zzf, componentName).setMinimumLatency(j5).setOverrideDeadline(j5 + j5).setExtras(persistableBundle).build(), ProtectedSandApp.s("㇈"), ProtectedSandApp.s("㇉"));
    }
}
