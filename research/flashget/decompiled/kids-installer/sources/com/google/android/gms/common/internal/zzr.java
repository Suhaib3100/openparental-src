package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import android.view.C0532i;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
final class zzr extends GmsClientSupervisor {

    @GuardedBy("connectionStatus")
    private final HashMap zzb = new HashMap();
    private final Context zzc;
    private volatile Handler zzd;
    private final zzq zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;

    zzr(Context context, Looper looper) {
        zzq zzqVar = new zzq(this, null);
        this.zze = zzqVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzi(looper, zzqVar);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = C0532i.f8582a;
        this.zzh = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zza(zzn zznVar, ServiceConnection serviceConnection, String str) {
        String s5 = ProtectedSandApp.s("≦");
        String s6 = ProtectedSandApp.s("≧");
        Preconditions.checkNotNull(serviceConnection, ProtectedSandApp.s("≨"));
        synchronized (this.zzb) {
            zzo zzoVar = (zzo) this.zzb.get(zznVar);
            if (zzoVar == null) {
                throw new IllegalStateException(s6 + zznVar.toString());
            }
            if (!zzoVar.zzh(serviceConnection)) {
                throw new IllegalStateException(s5 + zznVar.toString());
            }
            zzoVar.zzf(serviceConnection, str);
            if (zzoVar.zzi()) {
                this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zznVar), this.zzg);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final boolean zzc(zzn zznVar, ServiceConnection serviceConnection, String str, @q0 Executor executor) {
        boolean zzj;
        String s5 = ProtectedSandApp.s("≩");
        Preconditions.checkNotNull(serviceConnection, ProtectedSandApp.s("≪"));
        synchronized (this.zzb) {
            zzo zzoVar = (zzo) this.zzb.get(zznVar);
            if (zzoVar == null) {
                zzoVar = new zzo(this, zznVar);
                zzoVar.zzd(serviceConnection, serviceConnection, str);
                zzoVar.zze(str, executor);
                this.zzb.put(zznVar, zzoVar);
            } else {
                this.zzd.removeMessages(0, zznVar);
                if (zzoVar.zzh(serviceConnection)) {
                    throw new IllegalStateException(s5 + zznVar.toString());
                }
                zzoVar.zzd(serviceConnection, serviceConnection, str);
                int zza = zzoVar.zza();
                if (zza == 1) {
                    serviceConnection.onServiceConnected(zzoVar.zzb(), zzoVar.zzc());
                } else if (zza == 2) {
                    zzoVar.zze(str, executor);
                }
            }
            zzj = zzoVar.zzj();
        }
        return zzj;
    }

    final void zzi(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzi(looper, this.zze);
        }
    }
}
