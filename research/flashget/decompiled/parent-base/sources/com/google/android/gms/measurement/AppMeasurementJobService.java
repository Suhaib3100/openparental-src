package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.l0;
import androidx.annotation.o0;
import com.google.android.gms.measurement.internal.zzmy;
import com.google.android.gms.measurement.internal.zznc;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
@TargetApi(24)
/* loaded from: classes5.dex */
public final class AppMeasurementJobService extends JobService implements zznc {
    private zzmy<AppMeasurementJobService> zza;

    @Override // android.app.Service
    @l0
    public final void onCreate() {
        super.onCreate();
        zza().zza();
    }

    @Override // android.app.Service
    @l0
    public final void onDestroy() {
        zza().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    @l0
    public final void onRebind(@o0 Intent intent) {
        zza().zzb(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@o0 JobParameters jobParameters) {
        return zza().zza(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@o0 JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @l0
    public final boolean onUnbind(@o0 Intent intent) {
        return zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final void zza(@o0 Intent intent) {
    }

    private final zzmy<AppMeasurementJobService> zza() {
        if (this.zza == null) {
            this.zza = new zzmy<>(this);
        }
        return this.zza;
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    @TargetApi(24)
    public final void zza(@o0 JobParameters jobParameters, boolean z4) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final boolean zza(int i4) {
        throw new UnsupportedOperationException();
    }
}
