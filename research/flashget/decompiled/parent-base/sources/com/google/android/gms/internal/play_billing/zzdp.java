package com.google.android.gms.internal.play_billing;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzcu;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzdp extends zzdb {
    private zzdk zzd;
    private ScheduledFuture zze;

    private zzdp(zzdk zzdkVar) {
        this.zzd = zzdkVar;
    }

    static zzdk zzs(zzdk zzdkVar, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzdp zzdpVar = new zzdp(zzdkVar);
        zzdm zzdmVar = new zzdm(zzdpVar);
        zzdpVar.zze = scheduledExecutorService.schedule(zzdmVar, 28500L, timeUnit);
        zzdkVar.zzb(zzdmVar, zzda.zza);
        return zzdpVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcu
    protected final String zzd() {
        zzdk zzdkVar = this.zzd;
        ScheduledFuture scheduledFuture = this.zze;
        if (zzdkVar == null) {
            return null;
        }
        String a5 = d.a(ProtectedSandApp.s("흉"), zzdkVar.toString(), ProtectedSandApp.s("흊"));
        if (scheduledFuture == null) {
            return a5;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return a5;
        }
        return a5 + ProtectedSandApp.s("흋") + delay + ProtectedSandApp.s("흌");
    }

    @Override // com.google.android.gms.internal.play_billing.zzcu
    protected final void zzg() {
        zzdk zzdkVar = this.zzd;
        if ((this.valueField instanceof zzcu.zza) & (zzdkVar != null)) {
            Object obj = this.valueField;
            zzdkVar.cancel((obj instanceof zzcu.zza) && ((zzcu.zza) obj).zzc);
        }
        ScheduledFuture scheduledFuture = this.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzd = null;
        this.zze = null;
    }
}
