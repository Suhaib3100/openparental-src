package com.google.android.gms.tasks;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes3.dex */
final class zzaf<T> implements zzae<T> {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;

    @GuardedBy("mLock")
    private int zzd;

    @GuardedBy("mLock")
    private int zze;

    @GuardedBy("mLock")
    private int zzf;

    @GuardedBy("mLock")
    private Exception zzg;

    @GuardedBy("mLock")
    private boolean zzh;

    public zzaf(int i5, zzw zzwVar) {
        this.zzb = i5;
        this.zzc = zzwVar;
    }

    @GuardedBy("mLock")
    private final void zza() {
        if (this.zzd + this.zze + this.zzf == this.zzb) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zzc();
                    return;
                } else {
                    this.zzc.zzb(null);
                    return;
                }
            }
            this.zzc.zza(new ExecutionException(this.zze + ProtectedSandApp.s("♿") + this.zzb + ProtectedSandApp.s("⚀"), this.zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@o0 Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t5) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
