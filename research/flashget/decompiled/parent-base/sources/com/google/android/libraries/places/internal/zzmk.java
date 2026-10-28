package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzmk extends zzadk implements zzaes {
    private static final zzmk zzb;
    private int zze;
    private zzadr zzf = zzadk.zzB();
    private int zzg;

    static {
        zzmk zzmkVar = new zzmk();
        zzb = zzmkVar;
        zzadk.zzG(zzmk.class, zzmkVar);
    }

    private zzmk() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueaa1"), new Object[]{ProtectedSandApp.s("\uea9f"), ProtectedSandApp.s("\ueaa0"), zzmf.class, ProtectedSandApp.s("\uea9e")});
        }
        if (i5 == 3) {
            return new zzmk();
        }
        zzmd zzmdVar = null;
        if (i5 == 4) {
            return new zzmj(zzmdVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
