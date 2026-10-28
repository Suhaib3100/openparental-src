package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzsc extends zzadk implements zzaes {
    private static final zzsc zzb;
    private int zze;
    private zzadr zzf = zzadk.zzB();
    private long zzg;

    static {
        zzsc zzscVar = new zzsc();
        zzb = zzscVar;
        zzadk.zzG(zzsc.class, zzscVar);
    }

    private zzsc() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec69"), new Object[]{ProtectedSandApp.s("\uec67"), ProtectedSandApp.s("\uec68"), zzsb.class, ProtectedSandApp.s("\uec66")});
        }
        if (i5 == 3) {
            return new zzsc();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzrz(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
