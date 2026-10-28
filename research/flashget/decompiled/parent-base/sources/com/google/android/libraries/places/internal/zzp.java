package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzp extends zzadk implements zzaes {
    private static final zzp zzb;
    private int zze;
    private zzaa zzf;
    private int zzg;

    static {
        zzp zzpVar = new zzp();
        zzb = zzpVar;
        zzadk.zzG(zzp.class, zzpVar);
    }

    private zzp() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb34"), new Object[]{ProtectedSandApp.s("\ueb32"), ProtectedSandApp.s("\ueb33"), ProtectedSandApp.s("\ueb31"), zzo.zza});
        }
        if (i5 == 3) {
            return new zzp();
        }
        zza zzaVar = null;
        if (i5 == 4) {
            return new zzn(zzaVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
