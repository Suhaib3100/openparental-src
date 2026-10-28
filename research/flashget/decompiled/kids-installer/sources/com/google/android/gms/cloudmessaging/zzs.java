package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
public final class zzs {

    @q0
    @GuardedBy("MessengerIpcClient.class")
    private static zzs zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;

    @GuardedBy("this")
    private zzm zzd = new zzm(this, null);

    @GuardedBy("this")
    private int zze = 1;

    @m1
    zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static synchronized zzs zzb(Context context) {
        zzs zzsVar;
        synchronized (zzs.class) {
            if (zza == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                zza = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory(ProtectedSandApp.s("\u0a0e")))));
            }
            zzsVar = zza;
        }
        return zzsVar;
    }

    private final synchronized int zzf() {
        int i5;
        i5 = this.zze;
        this.zze = i5 + 1;
        return i5;
    }

    private final synchronized <T> Task<T> zzg(zzp<T> zzpVar) {
        if (Log.isLoggable(ProtectedSandApp.s("ਏ"), 3)) {
            new StringBuilder(String.valueOf(zzpVar).length() + 9);
        }
        if (!this.zzd.zzg(zzpVar)) {
            zzm zzmVar = new zzm(this, null);
            this.zzd = zzmVar;
            zzmVar.zzg(zzpVar);
        }
        return zzpVar.zzb.getTask();
    }

    public final Task<Void> zzc(int i5, Bundle bundle) {
        return zzg(new zzo(zzf(), 2, bundle));
    }

    public final Task<Bundle> zzd(int i5, Bundle bundle) {
        return zzg(new zzr(zzf(), 1, bundle));
    }
}
