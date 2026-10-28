package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyf extends zzadk implements zzaes {
    private static final zzadp zzb = new zzyd();
    private static final zzyf zze;
    private zzado zzf = zzadk.zzz();

    static {
        zzyf zzyfVar = new zzyf();
        zze = zzyfVar;
        zzadk.zzG(zzyf.class, zzyfVar);
    }

    private zzyf() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zze, ProtectedSandApp.s("\uedd9"), new Object[]{ProtectedSandApp.s("\uedd8"), zzvq.zza});
        }
        if (i5 == 3) {
            return new zzyf();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzye(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zze;
    }
}
