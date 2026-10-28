package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzro extends zzadk implements zzaes {
    private static final zzro zzb;
    private int zze;
    private int zzg;
    private String zzf = "";
    private zzadr zzh = zzadk.zzB();

    static {
        zzro zzroVar = new zzro();
        zzb = zzroVar;
        zzadk.zzG(zzro.class, zzroVar);
    }

    private zzro() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec25"), new Object[]{ProtectedSandApp.s("\uec22"), ProtectedSandApp.s("\uec23"), ProtectedSandApp.s("\uec24"), ProtectedSandApp.s("\uec21"), zzrn.class});
        }
        if (i5 == 3) {
            return new zzro();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzrl(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
