package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjb implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzjz zzd;

    zzjb(zzjz zzjzVar, AtomicReference atomicReference, zzq zzqVar, boolean z5) {
        this.zzd = zzjzVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
        this.zzc = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjz zzjzVar;
        zzej zzejVar;
        synchronized (this.zza) {
            try {
                try {
                    zzjzVar = this.zzd;
                    zzejVar = zzjzVar.zzb;
                } catch (RemoteException e6) {
                    this.zzd.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ᅌ"), e6);
                    atomicReference = this.zza;
                }
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zza(ProtectedSandApp.s("ᅋ"));
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzejVar.zze(this.zzb, this.zzc));
                this.zzd.zzQ();
                atomicReference = this.zza;
                atomicReference.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
