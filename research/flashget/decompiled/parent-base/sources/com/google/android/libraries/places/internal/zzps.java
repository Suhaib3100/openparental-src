package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzps extends zzadk implements zzaes {
    private static final zzps zzb;
    private int zze;
    private zzln zzf;
    private long zzg;
    private long zzh;

    static {
        zzps zzpsVar = new zzps();
        zzb = zzpsVar;
        zzadk.zzG(zzps.class, zzpsVar);
    }

    private zzps() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb62"), new Object[]{ProtectedSandApp.s("\ueb60"), ProtectedSandApp.s("\ueb61"), ProtectedSandApp.s("\ueb5e"), ProtectedSandApp.s("\ueb5f")});
        }
        if (i5 == 3) {
            return new zzps();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzpr(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
