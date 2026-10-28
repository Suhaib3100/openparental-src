package com.google.android.gms.internal.play_billing;

import androidx.annotation.q0;
import java.util.concurrent.Executor;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzh {
    static final zzh zza = new zzh(null, null);
    final Runnable zzb;
    final Executor zzc;

    @q0
    zzh zzd;

    zzh(Runnable runnable, Executor executor) {
        this.zzb = runnable;
        this.zzc = executor;
    }
}
