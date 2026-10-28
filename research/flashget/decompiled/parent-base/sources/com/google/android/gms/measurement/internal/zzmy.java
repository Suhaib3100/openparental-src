package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zznc;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzmy<T extends Context & zznc> {
    private final T zza;

    public zzmy(T t4) {
        Preconditions.checkNotNull(t4);
        this.zza = t4;
    }

    private final zzgo zzc() {
        return zzhy.zza(this.zza, null, null).zzj();
    }

    @l0
    public final int zza(final Intent intent, int i4, final int i5) {
        final zzgo zzj = zzhy.zza(this.zza, null, null).zzj();
        if (intent == null) {
            zzj.zzu().zza(ProtectedSandApp.s("\ue1ea"));
            return 2;
        }
        String action = intent.getAction();
        zzj.zzp().zza(ProtectedSandApp.s("\ue1eb"), Integer.valueOf(i5), action);
        if (ProtectedSandApp.s("\ue1ec").equals(action)) {
            zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzna
                @Override // java.lang.Runnable
                public final void run() {
                    zzmy.this.zza(i5, zzj, intent);
                }
            });
        }
        return 2;
    }

    @l0
    public final void zzb() {
        zzhy.zza(this.zza, null, null).zzj().zzp().zza(ProtectedSandApp.s("\ue1f6"));
    }

    @l0
    public final boolean zzc(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza(ProtectedSandApp.s("\ue1f9"));
            return true;
        }
        zzc().zzp().zza(ProtectedSandApp.s("\ue1fa"), intent.getAction());
        return true;
    }

    @l0
    public final void zzb(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza(ProtectedSandApp.s("\ue1f7"));
        } else {
            zzc().zzp().zza(ProtectedSandApp.s("\ue1f8"), intent.getAction());
        }
    }

    @l0
    public final IBinder zza(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza(ProtectedSandApp.s("\ue1ed"));
            return null;
        }
        String action = intent.getAction();
        if (ProtectedSandApp.s("\ue1ee").equals(action)) {
            return new zzic(zznv.zza(this.zza));
        }
        zzc().zzu().zza(ProtectedSandApp.s("\ue1ef"), action);
        return null;
    }

    final /* synthetic */ void zza(int i4, zzgo zzgoVar, Intent intent) {
        if (this.zza.zza(i4)) {
            zzgoVar.zzp().zza(ProtectedSandApp.s("\ue1f1"), Integer.valueOf(i4));
            zzc().zzp().zza(ProtectedSandApp.s("\ue1f2"));
            this.zza.zza(intent);
        }
    }

    final /* synthetic */ void zza(zzgo zzgoVar, JobParameters jobParameters) {
        zzgoVar.zzp().zza(ProtectedSandApp.s("\ue1f3"));
        this.zza.zza(jobParameters, false);
    }

    @l0
    public final void zza() {
        zzhy.zza(this.zza, null, null).zzj().zzp().zza(ProtectedSandApp.s("\ue1f0"));
    }

    private final void zza(Runnable runnable) {
        zznv zza = zznv.zza(this.zza);
        zza.zzl().zzb(new zzmz(this, zza, runnable));
    }

    @TargetApi(24)
    @l0
    public final boolean zza(final JobParameters jobParameters) {
        final zzgo zzj = zzhy.zza(this.zza, null, null).zzj();
        String string = jobParameters.getExtras().getString(ProtectedSandApp.s("\ue1f4"));
        zzj.zzp().zza(ProtectedSandApp.s("\ue1f5"), string);
        if (!ProtectedSandApp.s("\ue1ec").equals(string)) {
            return true;
        }
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmx
            @Override // java.lang.Runnable
            public final void run() {
                zzmy.this.zza(zzj, jobParameters);
            }
        });
        return true;
    }
}
