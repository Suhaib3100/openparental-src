package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyr extends zzadk implements zzaes {
    private static final zzadp zzb = new zzyp();
    private static final zzyr zze;
    private zzado zzf = zzadk.zzz();

    static {
        zzyr zzyrVar = new zzyr();
        zze = zzyrVar;
        zzadk.zzG(zzyr.class, zzyrVar);
    }

    private zzyr() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zze, ProtectedSandApp.s("\uedeb"), new Object[]{ProtectedSandApp.s("\uedea"), zzaap.zza});
        }
        if (i5 == 3) {
            return new zzyr();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzyq(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zze;
    }
}
