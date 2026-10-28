package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzse extends zzadk implements zzaes {
    private static final zzse zzb;
    private int zze;
    private zzsc zzf;
    private zzrw zzg;

    static {
        zzse zzseVar = new zzse();
        zzb = zzseVar;
        zzadk.zzG(zzse.class, zzseVar);
    }

    private zzse() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec6d"), new Object[]{ProtectedSandApp.s("\uec6c"), ProtectedSandApp.s("\uec6a"), ProtectedSandApp.s("\uec6b")});
        }
        if (i5 == 3) {
            return new zzse();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzsd(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
