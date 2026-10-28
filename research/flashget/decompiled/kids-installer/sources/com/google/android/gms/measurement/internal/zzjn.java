package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjz zzb;

    zzjn(zzjz zzjzVar, zzq zzqVar) {
        this.zzb = zzjzVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzb;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            a.a(zzjzVar.zzt, ProtectedSandApp.s("ᅞ"));
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e6) {
            this.zzb.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ᅟ"), e6);
        }
    }
}
