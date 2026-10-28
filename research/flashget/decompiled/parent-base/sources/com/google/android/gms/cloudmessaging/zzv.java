package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
public final class zzv {

    @q0
    private static zzv zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private zzp zzd = new zzp(this, null);
    private int zze = 1;

    @m1
    zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static synchronized zzv zzb(Context context) {
        zzv zzvVar;
        synchronized (zzv.class) {
            try {
                if (zza == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.zza();
                    zza = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory(ProtectedSandApp.s("줈")))));
                }
                zzvVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    private final synchronized int zzf() {
        int i4;
        i4 = this.zze;
        this.zze = i4 + 1;
        return i4;
    }

    private final synchronized Task zzg(zzs zzsVar) {
        try {
            if (Log.isLoggable(ProtectedSandApp.s("줈"), 3)) {
                ProtectedSandApp.s("줉").concat(zzsVar.toString());
            }
            if (!this.zzd.zzg(zzsVar)) {
                zzp zzpVar = new zzp(this, null);
                this.zzd = zzpVar;
                zzpVar.zzg(zzsVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzsVar.zzb.getTask();
    }

    public final Task zzc(int i4, Bundle bundle) {
        return zzg(new zzr(zzf(), i4, bundle));
    }

    public final Task zzd(int i4, Bundle bundle) {
        return zzg(new zzu(zzf(), i4, bundle));
    }
}
