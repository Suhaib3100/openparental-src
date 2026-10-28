package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
enum q4 {
    zza(ProtectedSandApp.s("դ"), 29),
    zzb(ProtectedSandApp.s("զ"), 33),
    zzc(ProtectedSandApp.s("ը"), 35),
    zzd(ProtectedSandApp.s("ժ"), 40);

    private final String zzf;
    private final int zzg;

    q4(String str, int i4) {
        this.zzf = str;
        this.zzg = i4;
    }

    final String zza() {
        return this.zzf;
    }

    final int zzb() {
        return this.zzg;
    }
}
