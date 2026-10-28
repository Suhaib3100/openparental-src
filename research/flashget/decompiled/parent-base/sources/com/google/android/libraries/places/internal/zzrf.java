package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzrf extends zzadk implements zzaes {
    private static final zzrf zzb;
    private int zze;
    private int zzf;
    private float zzg;

    static {
        zzrf zzrfVar = new zzrf();
        zzb = zzrfVar;
        zzadk.zzG(zzrf.class, zzrfVar);
    }

    private zzrf() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec0e"), new Object[]{ProtectedSandApp.s("\uec0c"), ProtectedSandApp.s("\uec0d"), zzne.zza, ProtectedSandApp.s("\uec0b")});
        }
        if (i5 == 3) {
            return new zzrf();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzre(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
