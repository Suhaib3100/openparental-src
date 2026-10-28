package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zznc extends zzadk implements zzaes {
    private static final zznc zzb;
    private int zze;
    private int zzf;
    private zznb zzg;

    static {
        zznc zzncVar = new zznc();
        zzb = zzncVar;
        zzadk.zzG(zznc.class, zzncVar);
    }

    private zznc() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueabb"), new Object[]{ProtectedSandApp.s("\ueab9"), ProtectedSandApp.s("\ueaba"), zzmy.zza, ProtectedSandApp.s("\ueab8")});
        }
        if (i5 == 3) {
            return new zznc();
        }
        zzmw zzmwVar = null;
        if (i5 == 4) {
            return new zzmx(zzmwVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
