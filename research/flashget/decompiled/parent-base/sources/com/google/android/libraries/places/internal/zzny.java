package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzny extends zzadk implements zzaes {
    private static final zzny zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzny zznyVar = new zzny();
        zzb = zznyVar;
        zzadk.zzG(zzny.class, zznyVar);
    }

    private zzny() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueae9"), new Object[]{ProtectedSandApp.s("\ueae6"), ProtectedSandApp.s("\ueae7"), ProtectedSandApp.s("\ueae8"), ProtectedSandApp.s("\ueae4"), ProtectedSandApp.s("\ueae5")});
        }
        if (i5 == 3) {
            return new zzny();
        }
        zznw zznwVar = null;
        if (i5 == 4) {
            return new zznx(zznwVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
