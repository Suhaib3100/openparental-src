package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjm implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjz zzb;

    zzjm(zzjz zzjzVar, zzq zzqVar) {
        this.zzb = zzjzVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzb;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            a.a(zzjzVar.zzt, ProtectedSandApp.s("ᅜ"));
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e6) {
            this.zzb.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ᅝ"), e6);
        }
    }
}
