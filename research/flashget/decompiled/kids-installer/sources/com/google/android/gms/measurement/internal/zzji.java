package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzji implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjz zzc;

    zzji(zzjz zzjzVar, zzq zzqVar, Bundle bundle) {
        this.zzc = zzjzVar;
        this.zza = zzqVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzc;
        zzejVar = zzjzVar.zzb;
        String s5 = ProtectedSandApp.s("ᅙ");
        if (zzejVar == null) {
            a.a(zzjzVar.zzt, s5);
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e6) {
            this.zzc.zzt.zzaA().zzd().zzb(s5, e6);
        }
    }
}
