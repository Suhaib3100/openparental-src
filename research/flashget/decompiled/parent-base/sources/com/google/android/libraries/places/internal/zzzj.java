package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzj extends zzadk implements zzaes {
    private static final zzzj zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;

    static {
        zzzj zzzjVar = new zzzj();
        zzb = zzzjVar;
        zzadk.zzG(zzzj.class, zzzjVar);
    }

    private zzzj() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee13"), new Object[]{ProtectedSandApp.s("\uee10"), ProtectedSandApp.s("\uee11"), zzzi.zza, ProtectedSandApp.s("\uee12"), ProtectedSandApp.s("\uee0f"), zzvp.zza});
        }
        if (i5 == 3) {
            return new zzzj();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzh(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
