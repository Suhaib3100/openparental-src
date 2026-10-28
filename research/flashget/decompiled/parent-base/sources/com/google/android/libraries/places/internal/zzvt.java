package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzvt extends zzadk implements zzaes {
    private static final zzvt zzb;
    private int zze;
    private String zzf = "";
    private int zzg;

    static {
        zzvt zzvtVar = new zzvt();
        zzb = zzvtVar;
        zzadk.zzG(zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued38"), new Object[]{ProtectedSandApp.s("\ued36"), ProtectedSandApp.s("\ued37"), ProtectedSandApp.s("\ued35"), zzvs.zza});
        }
        if (i5 == 3) {
            return new zzvt();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzvr(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
