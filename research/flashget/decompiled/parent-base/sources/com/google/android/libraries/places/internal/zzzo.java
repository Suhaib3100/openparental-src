package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzo extends zzadk implements zzaes {
    private static final zzzo zzb;
    private int zze;
    private int zzf;

    static {
        zzzo zzzoVar = new zzzo();
        zzb = zzzoVar;
        zzadk.zzG(zzzo.class, zzzoVar);
    }

    private zzzo() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee2b"), new Object[]{ProtectedSandApp.s("\uee29"), ProtectedSandApp.s("\uee2a")});
        }
        if (i5 == 3) {
            return new zzzo();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzn(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
