package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzu extends zzadk implements zzaes {
    private static final zzu zzb;
    private int zze;
    private zzaa zzf;

    static {
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzadk.zzG(zzu.class, zzuVar);
    }

    private zzu() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecc0"), new Object[]{ProtectedSandApp.s("\uecbe"), ProtectedSandApp.s("\uecbf")});
        }
        if (i5 == 3) {
            return new zzu();
        }
        zza zzaVar = null;
        if (i5 == 4) {
            return new zzt(zzaVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
