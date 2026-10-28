package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzrw extends zzadk implements zzaes {
    private static final zzrw zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private zzadr zzk = zzadk.zzB();
    private int zzl;

    static {
        zzrw zzrwVar = new zzrw();
        zzb = zzrwVar;
        zzadk.zzG(zzrw.class, zzrwVar);
    }

    private zzrw() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec46"), new Object[]{ProtectedSandApp.s("\uec3f"), ProtectedSandApp.s("\uec40"), ProtectedSandApp.s("\uec41"), ProtectedSandApp.s("\uec42"), ProtectedSandApp.s("\uec43"), ProtectedSandApp.s("\uec44"), ProtectedSandApp.s("\uec45"), zzrv.class, ProtectedSandApp.s("\uec3e")});
        }
        if (i5 == 3) {
            return new zzrw();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzrt(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
