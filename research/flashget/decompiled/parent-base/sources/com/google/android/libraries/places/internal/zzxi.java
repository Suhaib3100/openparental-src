package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzxi extends zzadk implements zzaes {
    private static final zzxi zzb;
    private int zze;
    private zzop zzg;
    private byte zzl = 2;
    private String zzf = "";
    private String zzh = "";
    private zzadr zzi = zzadk.zzB();
    private String zzj = "";
    private String zzk = "";

    static {
        zzxi zzxiVar = new zzxi();
        zzb = zzxiVar;
        zzadk.zzG(zzxi.class, zzxiVar);
    }

    private zzxi() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued8d"), new Object[]{ProtectedSandApp.s("\ued88"), ProtectedSandApp.s("\ued89"), ProtectedSandApp.s("\ued8a"), ProtectedSandApp.s("\ued8b"), ProtectedSandApp.s("\ued8c"), ProtectedSandApp.s("\ued86"), ProtectedSandApp.s("\ued87")});
        }
        if (i5 == 3) {
            return new zzxi();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzxh(zzvoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
