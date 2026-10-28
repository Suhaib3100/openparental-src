package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzan {
    private static volatile Handler zza;
    private final zzgy zzb;
    private final Runnable zzc;
    private volatile long zzd;

    zzan(zzgy zzgyVar) {
        Preconditions.checkNotNull(zzgyVar);
        this.zzb = zzgyVar;
        this.zzc = new zzam(this, zzgyVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzan.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzaw().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j5) {
        zzb();
        if (j5 >= 0) {
            this.zzd = this.zzb.zzax().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j5)) {
                return;
            }
            this.zzb.zzaA().zzd().zzb(ProtectedSandApp.s("\u0ef4"), Long.valueOf(j5));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
