package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzqu;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzko {
    final /* synthetic */ zzkp zza;

    zzko(zzkp zzkpVar) {
        this.zza = zzkpVar;
    }

    @n1
    final void zza() {
        this.zza.zzg();
        if (this.zza.zzt.zzm().zzk(this.zza.zzt.zzax().currentTimeMillis())) {
            this.zza.zzt.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c.a(this.zza.zzt, ProtectedSandApp.s("ᆆ"));
                zzc(this.zza.zzt.zzax().currentTimeMillis(), false);
            }
        }
    }

    @n1
    final void zzb(long j5, boolean z5) {
        this.zza.zzg();
        this.zza.zzp();
        if (this.zza.zzt.zzm().zzk(j5)) {
            this.zza.zzt.zzm().zzg.zza(true);
            zzqu.zzc();
            if (this.zza.zzt.zzf().zzs(null, zzeg.zzan)) {
                this.zza.zzt.zzh().zzo();
            }
        }
        this.zza.zzt.zzm().zzj.zzb(j5);
        if (this.zza.zzt.zzm().zzg.zzb()) {
            zzc(j5, z5);
        }
    }

    @n1
    @m1
    final void zzc(long j5, boolean z5) {
        this.zza.zzg();
        if (this.zza.zzt.zzJ()) {
            this.zza.zzt.zzm().zzj.zzb(j5);
            long elapsedRealtime = this.zza.zzt.zzax().elapsedRealtime();
            this.zza.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("ᆇ"), Long.valueOf(elapsedRealtime));
            Long valueOf = Long.valueOf(j5 / 1000);
            this.zza.zzt.zzq().zzY(ProtectedSandApp.s("ᆈ"), ProtectedSandApp.s("ᆉ"), valueOf, j5);
            this.zza.zzt.zzm().zzk.zzb(valueOf.longValue());
            this.zza.zzt.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong(ProtectedSandApp.s("ᆊ"), valueOf.longValue());
            if (this.zza.zzt.zzf().zzs(null, zzeg.zzab) && z5) {
                bundle.putLong(ProtectedSandApp.s("ᆋ"), 1L);
            }
            this.zza.zzt.zzq().zzH(ProtectedSandApp.s("ᆌ"), ProtectedSandApp.s("ᆍ"), j5, bundle);
            zzos.zzc();
            if (this.zza.zzt.zzf().zzs(null, zzeg.zzae)) {
                String zza = this.zza.zzt.zzm().zzp.zza();
                if (TextUtils.isEmpty(zza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(ProtectedSandApp.s("ᆎ"), zza);
                this.zza.zzt.zzq().zzH(ProtectedSandApp.s("ᆏ"), ProtectedSandApp.s("ᆐ"), j5, bundle2);
            }
        }
    }
}
