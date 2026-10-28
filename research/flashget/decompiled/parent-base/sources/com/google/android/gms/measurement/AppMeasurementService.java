package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzmy;
import com.google.android.gms.measurement.internal.zznc;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class AppMeasurementService extends Service implements zznc {
    private zzmy<AppMeasurementService> zza;

    private final zzmy<AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new zzmy<>(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @q0
    @l0
    public final IBinder onBind(@o0 Intent intent) {
        return zza().zza(intent);
    }

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

    @Override // android.app.Service
    @l0
    public final int onStartCommand(@o0 Intent intent, int i4, int i5) {
        return zza().zza(intent, i4, i5);
    }

    @Override // android.app.Service
    @l0
    public final boolean onUnbind(@o0 Intent intent) {
        return zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final void zza(@o0 Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final void zza(@o0 JobParameters jobParameters, boolean z4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznc
    public final boolean zza(int i4) {
        return stopSelfResult(i4);
    }
}
