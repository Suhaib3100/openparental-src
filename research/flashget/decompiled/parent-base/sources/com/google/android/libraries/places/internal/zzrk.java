package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzrk extends zzadk implements zzaes {
    private static final zzrk zzb;
    private int zze;
    private int zzf;

    static {
        zzrk zzrkVar = new zzrk();
        zzb = zzrkVar;
        zzadk.zzG(zzrk.class, zzrkVar);
    }

    private zzrk() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec15"), new Object[]{ProtectedSandApp.s("\uec14"), ProtectedSandApp.s("\uec13"), zzsk.zza});
        }
        if (i5 == 3) {
            return new zzrk();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzrj(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
