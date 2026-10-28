package com.google.android.gms.measurement.internal;

import androidx.annotation.o0;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zznw {
    private String zza;
    private Map<String, String> zzb;

    @o0
    private zznt zzc;

    zznw(String str, zznt zzntVar) {
        this.zza = str;
        this.zzc = zzntVar;
    }

    public final zznt zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    @o0
    public final Map<String, String> zzc() {
        Map<String, String> map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    zznw(String str, Map<String, String> map, zznt zzntVar) {
        this.zza = str;
        this.zzb = map;
        this.zzc = zzntVar;
    }
}
