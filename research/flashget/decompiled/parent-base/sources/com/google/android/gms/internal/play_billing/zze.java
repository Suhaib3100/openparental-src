package com.google.android.gms.internal.play_billing;

import androidx.annotation.q0;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zze {
    static final zze zza;
    static final zze zzb;

    @q0
    final Throwable zzc;

    static {
        if (zzo.zza) {
            zzb = null;
            zza = null;
        } else {
            zzb = new zze(false, null);
            zza = new zze(true, null);
        }
    }

    zze(boolean z4, @q0 Throwable th) {
        this.zzc = th;
    }
}
