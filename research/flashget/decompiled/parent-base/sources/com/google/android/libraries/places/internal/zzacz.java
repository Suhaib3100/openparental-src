package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzacz {
    static final zzacz zza = new zzacz(true);
    private static volatile boolean zzb;
    private static volatile zzacz zzc;
    private final Map zzd;

    zzacz() {
        this.zzd = new HashMap();
    }

    public static zzacz zza() {
        zzacz zzaczVar = zzc;
        if (zzaczVar == null) {
            synchronized (zzacz.class) {
                try {
                    zzaczVar = zzc;
                    if (zzaczVar == null) {
                        zzaczVar = zza;
                        zzc = zzaczVar;
                    }
                } finally {
                }
            }
        }
        return zzaczVar;
    }

    zzacz(boolean z4) {
        this.zzd = Collections.emptyMap();
    }
}
