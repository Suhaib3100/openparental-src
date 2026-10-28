package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkn {
    static final zzkn zza = new zzkn(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzkn zzd;
    private final Map zze;

    zzkn() {
        this.zze = new HashMap();
    }

    public static zzkn zza() {
        zzkn zzknVar = zzd;
        if (zzknVar != null) {
            return zzknVar;
        }
        synchronized (zzkn.class) {
            zzkn zzknVar2 = zzd;
            if (zzknVar2 != null) {
                return zzknVar2;
            }
            zzkn zzb2 = zzkv.zzb(zzkn.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzkz zzb(zzmi zzmiVar, int i5) {
        return (zzkz) this.zze.get(new zzkm(zzmiVar, i5));
    }

    zzkn(boolean z5) {
        this.zze = Collections.emptyMap();
    }
}
