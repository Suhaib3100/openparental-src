package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzsm extends zzadk implements zzaes {
    private static final zzsm zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;

    static {
        zzsm zzsmVar = new zzsm();
        zzb = zzsmVar;
        zzadk.zzG(zzsm.class, zzsmVar);
    }

    private zzsm() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec83"), new Object[]{ProtectedSandApp.s("\uec82"), ProtectedSandApp.s("\uec80"), ProtectedSandApp.s("\uec81")});
        }
        if (i5 == 3) {
            return new zzsm();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzsl(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
