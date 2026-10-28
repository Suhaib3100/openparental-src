package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzabu extends zzadk implements zzaes {
    private static final zzabu zzb;
    private int zze;
    private int zzf;
    private int zzg = 1;
    private int zzh;
    private int zzi;

    static {
        zzabu zzabuVar = new zzabu();
        zzb = zzabuVar;
        zzadk.zzG(zzabu.class, zzabuVar);
    }

    private zzabu() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue724"), new Object[]{ProtectedSandApp.s("\ue721"), ProtectedSandApp.s("\ue722"), zzabs.zza, ProtectedSandApp.s("\ue723"), zzabt.zza, ProtectedSandApp.s("\ue71f"), ProtectedSandApp.s("\ue720")});
        }
        if (i5 == 3) {
            return new zzabu();
        }
        zzabq zzabqVar = null;
        if (i5 == 4) {
            return new zzabr(zzabqVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
