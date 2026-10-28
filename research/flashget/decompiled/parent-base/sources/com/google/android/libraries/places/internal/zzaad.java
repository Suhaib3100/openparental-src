package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaad extends zzadk implements zzaes {
    private static final zzaad zzb;
    private int zze;
    private int zzf;
    private zzadr zzg = zzadk.zzB();
    private zzadr zzh = zzadk.zzB();

    static {
        zzaad zzaadVar = new zzaad();
        zzb = zzaadVar;
        zzadk.zzG(zzaad.class, zzaadVar);
    }

    private zzaad() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6bc"), new Object[]{ProtectedSandApp.s("\ue6b9"), ProtectedSandApp.s("\ue6ba"), ProtectedSandApp.s("\ue6bb"), ProtectedSandApp.s("\ue6b8"), zzaaf.class});
        }
        if (i5 == 3) {
            return new zzaad();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzaac(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
