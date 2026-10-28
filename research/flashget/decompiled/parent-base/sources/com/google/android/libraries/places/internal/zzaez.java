package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaez {
    private static final zzaez zza = new zzaez();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzafd zzb = new zzaej();

    private zzaez() {
    }

    public static zzaez zza() {
        return zza;
    }

    public final zzafc zzb(Class cls) {
        String s4 = ProtectedSandApp.s("\ue7c0");
        zzads.zzf(cls, s4);
        zzafc zzafcVar = (zzafc) this.zzc.get(cls);
        if (zzafcVar == null) {
            zzafcVar = this.zzb.zza(cls);
            zzads.zzf(cls, s4);
            zzads.zzf(zzafcVar, ProtectedSandApp.s("\ue7c1"));
            zzafc zzafcVar2 = (zzafc) this.zzc.putIfAbsent(cls, zzafcVar);
            if (zzafcVar2 != null) {
                return zzafcVar2;
            }
        }
        return zzafcVar;
    }
}
