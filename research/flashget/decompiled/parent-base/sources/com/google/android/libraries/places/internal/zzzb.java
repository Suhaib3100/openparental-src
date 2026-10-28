package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzb extends zzadk implements zzaes {
    private static final zzzb zzb;
    private int zze;
    private int zzf;

    static {
        zzzb zzzbVar = new zzzb();
        zzb = zzzbVar;
        zzadk.zzG(zzzb.class, zzzbVar);
    }

    private zzzb() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee07"), new Object[]{ProtectedSandApp.s("\uee05"), ProtectedSandApp.s("\uee06")});
        }
        if (i5 == 3) {
            return new zzzb();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzza(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
