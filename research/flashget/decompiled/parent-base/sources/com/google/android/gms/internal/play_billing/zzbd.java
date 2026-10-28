package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzbd extends zzbq {
    zzbd() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final long zza() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
