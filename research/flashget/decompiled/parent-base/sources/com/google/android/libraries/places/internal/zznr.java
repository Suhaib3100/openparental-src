package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zznr extends zzadk implements zzaes {
    private static final zznr zzb;
    private int zze;
    private zzado zzf = zzadk.zzz();
    private zzado zzg = zzadk.zzz();
    private int zzh;
    private int zzi;
    private long zzj;
    private int zzk;

    static {
        zznr zznrVar = new zznr();
        zzb = zznrVar;
        zzadk.zzG(zznr.class, zznrVar);
    }

    private zznr() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueadd"), new Object[]{ProtectedSandApp.s("\uead8"), ProtectedSandApp.s("\uead9"), ProtectedSandApp.s("\ueada"), ProtectedSandApp.s("\ueadb"), ProtectedSandApp.s("\ueadc"), ProtectedSandApp.s("\uead6"), ProtectedSandApp.s("\uead7")});
        }
        if (i5 == 3) {
            return new zznr();
        }
        zznn zznnVar = null;
        if (i5 == 4) {
            return new zznq(zznnVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
