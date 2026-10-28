package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzte extends zzadk implements zzaes {
    private static final zzte zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;

    static {
        zzte zzteVar = new zzte();
        zzb = zzteVar;
        zzadk.zzG(zzte.class, zzteVar);
    }

    private zzte() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueca1"), new Object[]{ProtectedSandApp.s("\uec9b"), ProtectedSandApp.s("\uec9c"), ProtectedSandApp.s("\uec9d"), ProtectedSandApp.s("\uec9e"), ProtectedSandApp.s("\uec9f"), ProtectedSandApp.s("\ueca0"), ProtectedSandApp.s("\uec9a"), zztd.zza});
        }
        if (i5 == 3) {
            return new zzte();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zztc(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
