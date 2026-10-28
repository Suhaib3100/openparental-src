package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaao extends zzadk implements zzaes {
    private static final zzaao zzb;
    private int zze;
    private int zzf;
    private zzzz zzg;

    static {
        zzaao zzaaoVar = new zzaao();
        zzb = zzaaoVar;
        zzadk.zzG(zzaao.class, zzaaoVar);
    }

    private zzaao() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6d2"), new Object[]{ProtectedSandApp.s("\ue6d0"), ProtectedSandApp.s("\ue6d1"), zzaan.zza, ProtectedSandApp.s("\ue6cf")});
        }
        if (i5 == 3) {
            return new zzaao();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzaam(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
