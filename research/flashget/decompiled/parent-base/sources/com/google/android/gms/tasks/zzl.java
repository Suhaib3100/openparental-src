package com.google.android.gms.tasks;

import androidx.annotation.o0;
import java.util.concurrent.Executor;
import zc.h;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes5.dex */
final class zzl implements zzq {
    private final Executor zza;
    private final Object zzb = new Object();

    @h
    private OnFailureListener zzc;

    public zzl(@o0 Executor executor, @o0 OnFailureListener onFailureListener) {
        this.zza = executor;
        this.zzc = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@o0 Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzc == null) {
                    return;
                }
                this.zza.execute(new zzk(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
