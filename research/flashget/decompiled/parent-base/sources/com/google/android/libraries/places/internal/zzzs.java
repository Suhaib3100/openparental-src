package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzs extends zzadk implements zzaes {
    private static final zzzs zzb;
    private zzadr zze = zzadk.zzB();
    private zzadr zzf = zzadk.zzB();

    static {
        zzzs zzzsVar = new zzzs();
        zzb = zzzsVar;
        zzadk.zzG(zzzs.class, zzzsVar);
    }

    private zzzs() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee30"), new Object[]{ProtectedSandApp.s("\uee2f"), ProtectedSandApp.s("\uee2e"), zzvt.class});
        }
        if (i5 == 3) {
            return new zzzs();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzr(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
