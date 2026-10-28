package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zztm extends zzadk implements zzaes {
    private static final zztm zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zztm zztmVar = new zztm();
        zzb = zztmVar;
        zzadk.zzG(zztm.class, zztmVar);
    }

    private zztm() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecab"), new Object[]{ProtectedSandApp.s("\ueca8"), ProtectedSandApp.s("\ueca9"), zztj.zza, ProtectedSandApp.s("\uecaa"), zztl.zza, ProtectedSandApp.s("\ueca7"), zztk.zza});
        }
        if (i5 == 3) {
            return new zztm();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzti(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
