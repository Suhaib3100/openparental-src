package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzwa extends zzadk implements zzaes {
    private static final zzadp zzb = new zzvx();
    private static final zzwa zze;
    private int zzf;
    private zzado zzg = zzadk.zzz();
    private int zzh;

    static {
        zzwa zzwaVar = new zzwa();
        zze = zzwaVar;
        zzadk.zzG(zzwa.class, zzwaVar);
    }

    private zzwa() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zze, ProtectedSandApp.s("\ued42"), new Object[]{ProtectedSandApp.s("\ued40"), ProtectedSandApp.s("\ued41"), zzvy.zza, ProtectedSandApp.s("\ued3f")});
        }
        if (i5 == 3) {
            return new zzwa();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzvz(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zze;
    }
}
