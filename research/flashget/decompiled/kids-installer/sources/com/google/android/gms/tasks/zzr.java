package com.google.android.gms.tasks;

import androidx.annotation.o0;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
final class zzr {
    private final Object zza = new Object();

    @GuardedBy("mLock")
    private Queue zzb;

    @GuardedBy("mLock")
    private boolean zzc;

    zzr() {
    }

    public final void zza(@o0 zzq zzqVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new ArrayDeque();
            }
            this.zzb.add(zzqVar);
        }
    }

    public final void zzb(@o0 Task task) {
        zzq zzqVar;
        synchronized (this.zza) {
            if (this.zzb != null && !this.zzc) {
                this.zzc = true;
                while (true) {
                    synchronized (this.zza) {
                        zzqVar = (zzq) this.zzb.poll();
                        if (zzqVar == null) {
                            this.zzc = false;
                            return;
                        }
                    }
                    zzqVar.zzd(task);
                }
            }
        }
    }
}
