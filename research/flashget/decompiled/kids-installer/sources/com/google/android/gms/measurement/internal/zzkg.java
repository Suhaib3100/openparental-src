package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.l0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkg {
    private final Context zza;

    public zzkg(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    private final zzet zzk() {
        return zzgd.zzp(this.zza, null, null).zzaA();
    }

    @l0
    public final int zza(final Intent intent, int i5, final int i6) {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        final zzet zzaA = zzp.zzaA();
        if (intent == null) {
            zzaA.zzk().zza(ProtectedSandApp.s("ᅫ"));
            return 2;
        }
        String action = intent.getAction();
        zzp.zzay();
        zzaA.zzj().zzc(ProtectedSandApp.s("ᅬ"), Integer.valueOf(i6), action);
        if (ProtectedSandApp.s("ᅭ").equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkd
                @Override // java.lang.Runnable
                public final void run() {
                    zzkg.this.zzc(i6, zzaA, intent);
                }
            });
        }
        return 2;
    }

    @l0
    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza(ProtectedSandApp.s("ᅮ"));
            return null;
        }
        String action = intent.getAction();
        if (ProtectedSandApp.s("ᅯ").equals(action)) {
            return new zzgv(zzlh.zzt(this.zza), null);
        }
        zzk().zzk().zzb(ProtectedSandApp.s("ᅰ"), action);
        return null;
    }

    final /* synthetic */ void zzc(int i5, zzet zzetVar, Intent intent) {
        if (((zzkf) this.zza).zzc(i5)) {
            zzetVar.zzj().zzb(ProtectedSandApp.s("ᅱ"), Integer.valueOf(i5));
            zzk().zzj().zza(ProtectedSandApp.s("ᅲ"));
            ((zzkf) this.zza).zza(intent);
        }
    }

    final /* synthetic */ void zzd(zzet zzetVar, JobParameters jobParameters) {
        zzetVar.zzj().zza(ProtectedSandApp.s("ᅳ"));
        ((zzkf) this.zza).zzb(jobParameters, false);
    }

    @l0
    public final void zze() {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        zzet zzaA = zzp.zzaA();
        zzp.zzay();
        zzaA.zzj().zza(ProtectedSandApp.s("ᅴ"));
    }

    @l0
    public final void zzf() {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        zzet zzaA = zzp.zzaA();
        zzp.zzay();
        zzaA.zzj().zza(ProtectedSandApp.s("ᅵ"));
    }

    @l0
    public final void zzg(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza(ProtectedSandApp.s("ᅶ"));
        } else {
            zzk().zzj().zzb(ProtectedSandApp.s("ᅷ"), intent.getAction());
        }
    }

    public final void zzh(Runnable runnable) {
        zzlh zzt = zzlh.zzt(this.zza);
        zzt.zzaB().zzp(new zzke(this, zzt, runnable));
    }

    @TargetApi(24)
    @l0
    public final boolean zzi(final JobParameters jobParameters) {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        final zzet zzaA = zzp.zzaA();
        String string = jobParameters.getExtras().getString(ProtectedSandApp.s("ᅸ"));
        zzp.zzay();
        zzaA.zzj().zzb(ProtectedSandApp.s("ᅹ"), string);
        if (!ProtectedSandApp.s("ᅺ").equals(string)) {
            return true;
        }
        zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
            @Override // java.lang.Runnable
            public final void run() {
                zzkg.this.zzd(zzaA, jobParameters);
            }
        });
        return true;
    }

    @l0
    public final boolean zzj(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza(ProtectedSandApp.s("ᅻ"));
            return true;
        }
        zzk().zzj().zzb(ProtectedSandApp.s("ᅼ"), intent.getAction());
        return true;
    }
}
