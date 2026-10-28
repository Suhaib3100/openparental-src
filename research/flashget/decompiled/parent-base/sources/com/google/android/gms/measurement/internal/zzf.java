package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzf {
    private final zzjh zza;

    zzf(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    static zzf zza(String str) {
        return new zzf((TextUtils.isEmpty(str) || str.length() > 1) ? zzjh.zza : zzje.zza(str.charAt(0)));
    }

    final String zzb() {
        return String.valueOf(zzje.zza(this.zza));
    }

    final zzjh zza() {
        return this.zza;
    }
}
