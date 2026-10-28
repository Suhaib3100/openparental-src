package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.android.gms.measurement.internal.zzkg;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements zzkf {
    private zzkg zza;

    private final zzkg zzd() {
        if (this.zza == null) {
            this.zza = new zzkg(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @q0
    @l0
    public IBinder onBind(@o0 Intent intent) {
        return zzd().zzb(intent);
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

    @Override // android.app.Service
    @l0
    public int onStartCommand(@o0 Intent intent, int i5, int i6) {
        zzd().zza(intent, i5, i6);
        return 2;
    }

    @Override // android.app.Service
    @l0
    public boolean onUnbind(@o0 Intent intent) {
        zzd().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final void zza(@o0 Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final void zzb(@o0 JobParameters jobParameters, boolean z5) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzc(int i5) {
        return stopSelfResult(i5);
    }
}
