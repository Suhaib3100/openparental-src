package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzabp extends zzadk implements zzaes {
    private static final zzabp zzb;
    private int zze;
    private int zzf = 1;
    private int zzg = 1;
    private int zzh;

    static {
        zzabp zzabpVar = new zzabp();
        zzb = zzabpVar;
        zzadk.zzG(zzabp.class, zzabpVar);
    }

    private zzabp() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue71e"), new Object[]{ProtectedSandApp.s("\ue71b"), ProtectedSandApp.s("\ue71c"), zzabo.zza, ProtectedSandApp.s("\ue71d"), zzabn.zza, ProtectedSandApp.s("\ue71a")});
        }
        if (i5 == 3) {
            return new zzabp();
        }
        zzabl zzablVar = null;
        if (i5 == 4) {
            return new zzabm(zzablVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
