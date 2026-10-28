package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.l0;
import androidx.annotation.o0;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.android.gms.measurement.internal.zzkg;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
@TargetApi(24)
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements zzkf {
    private zzkg zza;

    private final zzkg zzd() {
        if (this.zza == null) {
            this.zza = new zzkg(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @l0
    public void onCreate() {
        super.onCreate();
        zzd().zze();
    }

    @Override // android.app.Service
    @l0
    public void onDestroy() {
        zzd().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    @l0
    public void onRebind(@o0 Intent intent) {
        zzd().zzg(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@o0 JobParameters jobParameters) {
        zzd().zzi(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@o0 JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @l0
    public boolean onUnbind(@o0 Intent intent) {
        zzd().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final void zza(@o0 Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    @TargetApi(24)
    public final void zzb(@o0 JobParameters jobParameters, boolean z5) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzc(int i5) {
        throw new UnsupportedOperationException();
    }
}
