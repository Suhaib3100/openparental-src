package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzrv extends zzadk implements zzaes {
    private static final zzrv zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzm;
    private String zzf = "";
    private zzadr zzl = zzadk.zzB();

    static {
        zzrv zzrvVar = new zzrv();
        zzb = zzrvVar;
        zzadk.zzG(zzrv.class, zzrvVar);
    }

    private zzrv() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec3d"), new Object[]{ProtectedSandApp.s("\uec35"), ProtectedSandApp.s("\uec36"), ProtectedSandApp.s("\uec37"), ProtectedSandApp.s("\uec38"), ProtectedSandApp.s("\uec39"), ProtectedSandApp.s("\uec3a"), ProtectedSandApp.s("\uec3b"), ProtectedSandApp.s("\uec3c"), zzrs.class, ProtectedSandApp.s("\uec34")});
        }
        if (i5 == 3) {
            return new zzrv();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzru(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
