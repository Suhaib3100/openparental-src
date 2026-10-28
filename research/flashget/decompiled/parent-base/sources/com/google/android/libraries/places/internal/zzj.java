package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzj extends zzadk implements zzaes {
    private static final zzj zzb;
    private int zze;
    private zzaa zzf;
    private int zzg;

    static {
        zzj zzjVar = new zzj();
        zzb = zzjVar;
        zzadk.zzG(zzj.class, zzjVar);
    }

    private zzj() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea02"), new Object[]{ProtectedSandApp.s("\uea00"), ProtectedSandApp.s("\uea01"), ProtectedSandApp.s("\ue9ff"), zzi.zza});
        }
        if (i5 == 3) {
            return new zzj();
        }
        zza zzaVar = null;
        if (i5 == 4) {
            return new zzh(zzaVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
