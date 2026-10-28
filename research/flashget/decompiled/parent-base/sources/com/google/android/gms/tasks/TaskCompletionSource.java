package com.google.android.gms.tasks;

import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes5.dex */
public class TaskCompletionSource<TResult> {
    private final zzw zza = new zzw();

    public TaskCompletionSource() {
    }

    @o0
    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(@o0 Exception exc) {
        this.zza.zza(exc);
    }

    public void setResult(@q0 TResult tresult) {
        this.zza.zzb(tresult);
    }

    public boolean trySetException(@o0 Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(@q0 TResult tresult) {
        return this.zza.zze(tresult);
    }

    public TaskCompletionSource(@o0 CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }
}
