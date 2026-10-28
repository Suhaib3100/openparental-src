package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyc extends zzadk implements zzaes {
    private static final zzyc zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzyc zzycVar = new zzyc();
        zzb = zzycVar;
        zzadk.zzG(zzyc.class, zzycVar);
    }

    private zzyc() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uedd7"), new Object[]{ProtectedSandApp.s("\uedd2"), ProtectedSandApp.s("\uedd3"), ProtectedSandApp.s("\uedd4"), ProtectedSandApp.s("\uedd5"), ProtectedSandApp.s("\uedd6"), ProtectedSandApp.s("\uedd1"), zzvw.zza});
        }
        if (i5 == 3) {
            return new zzyc();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzyb(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
