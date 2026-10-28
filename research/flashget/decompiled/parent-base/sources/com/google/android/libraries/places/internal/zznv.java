package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zznv extends zzadk implements zzaes {
    private static final zznv zzb;
    private int zze;
    private zznr zzf;
    private zzadr zzg = zzadk.zzB();
    private int zzh;
    private int zzi;

    static {
        zznv zznvVar = new zznv();
        zzb = zznvVar;
        zzadk.zzG(zznv.class, zznvVar);
    }

    private zznv() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueae3"), new Object[]{ProtectedSandApp.s("\ueadf"), ProtectedSandApp.s("\ueae0"), ProtectedSandApp.s("\ueae1"), zznp.class, ProtectedSandApp.s("\ueae2"), zznu.zza, ProtectedSandApp.s("\ueade"), zznt.zza});
        }
        if (i5 == 3) {
            return new zznv();
        }
        zznn zznnVar = null;
        if (i5 == 4) {
            return new zzns(zznnVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
