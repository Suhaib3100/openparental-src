package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzpe extends zzadk implements zzaes {
    private static final zzpe zzb;
    private int zze;
    private int zzf;

    static {
        zzpe zzpeVar = new zzpe();
        zzb = zzpeVar;
        zzadk.zzG(zzpe.class, zzpeVar);
    }

    private zzpe() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb3c"), new Object[]{ProtectedSandApp.s("\ueb3b"), ProtectedSandApp.s("\ueb3a"), zzpd.zza});
        }
        if (i5 == 3) {
            return new zzpe();
        }
        zzos zzosVar = null;
        if (i5 == 4) {
            return new zzpc(zzosVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
