package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzrh extends zzadk implements zzaes {
    private static final zzrh zzb;
    private int zze;
    private float zzf;
    private int zzg;

    static {
        zzrh zzrhVar = new zzrh();
        zzb = zzrhVar;
        zzadk.zzG(zzrh.class, zzrhVar);
    }

    private zzrh() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec12"), new Object[]{ProtectedSandApp.s("\uec11"), ProtectedSandApp.s("\uec0f"), ProtectedSandApp.s("\uec10")});
        }
        if (i5 == 3) {
            return new zzrh();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzrg(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
