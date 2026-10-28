package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzsy extends zzadk implements zzaes {
    private static final zzsy zzb;
    private int zze;
    private int zzf = 0;
    private Object zzg;

    static {
        zzsy zzsyVar = new zzsy();
        zzb = zzsyVar;
        zzadk.zzG(zzsy.class, zzsyVar);
    }

    private zzsy() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec96"), new Object[]{ProtectedSandApp.s("\uec94"), ProtectedSandApp.s("\uec95"), ProtectedSandApp.s("\uec93"), zzoi.class});
        }
        if (i5 == 3) {
            return new zzsy();
        }
        zzsw zzswVar = null;
        if (i5 == 4) {
            return new zzsx(zzswVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
