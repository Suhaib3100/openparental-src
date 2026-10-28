package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzde implements Runnable {
    final zzdk zza;
    final zzdd zzb;

    zzde(zzdk zzdkVar, zzdd zzddVar) {
        this.zza = zzdkVar;
        this.zzb = zzddVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable zza;
        zzdk zzdkVar = this.zza;
        if ((zzdkVar instanceof zzdq) && (zza = zzdr.zza((zzdq) zzdkVar)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            if (!zzdkVar.isDone()) {
                throw new IllegalStateException(zzbo.zzb(ProtectedSandApp.s("휽"), zzdkVar));
            }
            boolean z4 = false;
            Future future = zzdkVar;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    future = future;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e4) {
            this.zzb.zza(e4.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzbh zza = zzbj.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
