package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzq extends zzadk implements zzaes {
    private static final zzzq zzb;
    private zzadr zze = zzadk.zzB();

    static {
        zzzq zzzqVar = new zzzq();
        zzb = zzzqVar;
        zzadk.zzG(zzzq.class, zzzqVar);
    }

    private zzzq() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee2d"), new Object[]{ProtectedSandApp.s("\uee2c")});
        }
        if (i5 == 3) {
            return new zzzq();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzp(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
