package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.q0;
import androidx.view.C1434k;
import androidx.work.z;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzq extends GmsClientSupervisor {
    private final HashMap zzb = new HashMap();
    private final Context zzc;
    private volatile Handler zzd;
    private final zzp zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;

    @q0
    private volatile Executor zzi;

    zzq(Context context, Looper looper, @q0 Executor executor) {
        zzp zzpVar = new zzp(this, null);
        this.zze = zzpVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzg(looper, zzpVar);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = C1434k.f30360a;
        this.zzh = z.f36621h;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final ConnectionResult zza(zzn zznVar, ServiceConnection serviceConnection, String str, @q0 Executor executor) {
        ConnectionResult connectionResult;
        Preconditions.checkNotNull(serviceConnection, ProtectedSandApp.s("쭝"));
        HashMap hashMap = this.zzb;
        String s4 = ProtectedSandApp.s("쭞");
        synchronized (hashMap) {
            try {
                zzo zzoVar = (zzo) hashMap.get(zznVar);
                if (executor == null) {
                    executor = this.zzi;
                }
                if (zzoVar == null) {
                    zzoVar = new zzo(this, zznVar);
                    zzoVar.zzb(serviceConnection, serviceConnection, str);
                    connectionResult = zzoVar.zzj(str, executor);
                    hashMap.put(zznVar, zzoVar);
                } else {
                    this.zzd.removeMessages(0, zznVar);
                    if (zzoVar.zzf(serviceConnection)) {
                        String zznVar2 = zznVar.toString();
                        StringBuilder sb = new StringBuilder(zznVar2.length() + 81);
                        sb.append(s4);
                        sb.append(zznVar2);
                        throw new IllegalStateException(sb.toString());
                    }
                    zzoVar.zzb(serviceConnection, serviceConnection, str);
                    int zze = zzoVar.zze();
                    if (zze == 1) {
                        serviceConnection.onServiceConnected(zzoVar.zzi(), zzoVar.zzh());
                    } else if (zze == 2) {
                        connectionResult = zzoVar.zzj(str, executor);
                    }
                    connectionResult = null;
                }
                if (zzoVar.zzd()) {
                    return ConnectionResult.RESULT_SUCCESS;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1);
                }
                return connectionResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zzc(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, ProtectedSandApp.s("쭝"));
        HashMap hashMap = this.zzb;
        String s4 = ProtectedSandApp.s("쭟");
        String s5 = ProtectedSandApp.s("쭠");
        synchronized (hashMap) {
            try {
                zzo zzoVar = (zzo) hashMap.get(zznVar);
                if (zzoVar == null) {
                    String zznVar2 = zznVar.toString();
                    StringBuilder sb = new StringBuilder(zznVar2.length() + 50);
                    sb.append(s5);
                    sb.append(zznVar2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!zzoVar.zzf(serviceConnection)) {
                    String zznVar3 = zznVar.toString();
                    StringBuilder sb2 = new StringBuilder(zznVar3.length() + 76);
                    sb2.append(s4);
                    sb2.append(zznVar3);
                    throw new IllegalStateException(sb2.toString());
                }
                zzoVar.zzc(serviceConnection, str);
                if (zzoVar.zzg()) {
                    this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zznVar), this.zzg);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void zzd(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzg(looper, this.zze);
        }
    }

    final void zze(@q0 Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    final /* synthetic */ HashMap zzf() {
        return this.zzb;
    }

    final /* synthetic */ Context zzg() {
        return this.zzc;
    }

    final /* synthetic */ Handler zzh() {
        return this.zzd;
    }

    final /* synthetic */ ConnectionTracker zzi() {
        return this.zzf;
    }

    final /* synthetic */ long zzj() {
        return this.zzh;
    }
}
