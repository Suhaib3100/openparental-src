package com.google.android.libraries.places.internal;

import androidx.annotation.q0;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzfy {
    private Task zza;

    /* synthetic */ zzfy(zzfx zzfxVar) {
    }

    public abstract CancellationTokenSource zza();

    @q0
    public final Task zzc() {
        return this.zza;
    }

    public final void zzd(Task task) {
        this.zza = task;
    }
}
