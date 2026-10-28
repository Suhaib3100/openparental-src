package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zznj {
    final /* synthetic */ zznb zza;

    zznj(zznb zznbVar) {
        this.zza = zznbVar;
    }

    @n1
    @m1
    private final void zzb(long j4, boolean z4) {
        this.zza.zzt();
        if (this.zza.zzu.zzac()) {
            this.zza.zzk().zzk.zza(j4);
            long elapsedRealtime = this.zza.zzb().elapsedRealtime();
            this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ue205"), Long.valueOf(elapsedRealtime));
            long j5 = j4 / 1000;
            this.zza.zzm().zza(ProtectedSandApp.s("\ue206"), ProtectedSandApp.s("\ue207"), Long.valueOf(j5), j4);
            this.zza.zzk().zzl.zza(j5);
            this.zza.zzk().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong(ProtectedSandApp.s("\ue207"), j5);
            this.zza.zzm().zza(ProtectedSandApp.s("\ue206"), ProtectedSandApp.s("\ue208"), j4, bundle);
            String zza = this.zza.zzk().zzq.zza();
            if (TextUtils.isEmpty(zza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(ProtectedSandApp.s("\ue209"), zza);
            this.zza.zzm().zza(ProtectedSandApp.s("\ue206"), ProtectedSandApp.s("\ue20a"), j4, bundle2);
        }
    }

    @n1
    final void zza() {
        this.zza.zzt();
        if (this.zza.zzk().zza(this.zza.zzb().currentTimeMillis())) {
            this.zza.zzk().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ue20b"));
                zzb(this.zza.zzb().currentTimeMillis(), false);
            }
        }
    }

    @n1
    final void zza(long j4, boolean z4) {
        this.zza.zzt();
        this.zza.zzab();
        if (this.zza.zzk().zza(j4)) {
            this.zza.zzk().zzg.zza(true);
            this.zza.zzg().zzag();
        }
        this.zza.zzk().zzk.zza(j4);
        if (this.zza.zzk().zzg.zza()) {
            zzb(j4, z4);
        }
    }
}
