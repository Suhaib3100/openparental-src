package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zze extends zzadk implements zzaes {
    private static final zze zzb;
    private int zze;
    private zzaa zzf;

    static {
        zze zzeVar = new zze();
        zzb = zzeVar;
        zzadk.zzG(zze.class, zzeVar);
    }

    private zze() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue946"), new Object[]{ProtectedSandApp.s("\ue944"), ProtectedSandApp.s("\ue945")});
        }
        if (i5 == 3) {
            return new zze();
        }
        zza zzaVar = null;
        if (i5 == 4) {
            return new zzd(zzaVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
