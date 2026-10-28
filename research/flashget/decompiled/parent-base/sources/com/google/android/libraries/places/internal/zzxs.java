package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzxs extends zzadk implements zzaes {
    private static final zzxs zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzxs zzxsVar = new zzxs();
        zzb = zzxsVar;
        zzadk.zzG(zzxs.class, zzxsVar);
    }

    private zzxs() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueda8"), new Object[]{ProtectedSandApp.s("\ueda6"), ProtectedSandApp.s("\ueda7"), zzxr.zza, ProtectedSandApp.s("\ueda5")});
        }
        if (i5 == 3) {
            return new zzxs();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzxq(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
