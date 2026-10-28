package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyz extends zzadk implements zzaes {
    private static final zzyz zzb;
    private int zze;
    private int zzg;
    private boolean zzi;
    private zzadr zzf = zzadk.zzB();
    private String zzh = "";

    static {
        zzyz zzyzVar = new zzyz();
        zzb = zzyzVar;
        zzadk.zzG(zzyz.class, zzyzVar);
    }

    private zzyz() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee04"), new Object[]{ProtectedSandApp.s("\uee01"), ProtectedSandApp.s("\uee02"), ProtectedSandApp.s("\uee03"), zzyw.zza, ProtectedSandApp.s("\uedff"), ProtectedSandApp.s("\uee00")});
        }
        if (i5 == 3) {
            return new zzyz();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzyy(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
