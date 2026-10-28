package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzul extends zzadk implements zzaes {
    private static final zzul zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzul zzulVar = new zzul();
        zzb = zzulVar;
        zzadk.zzG(zzul.class, zzulVar);
    }

    private zzul() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecdd"), new Object[]{ProtectedSandApp.s("\uecdb"), ProtectedSandApp.s("\uecdc"), ProtectedSandApp.s("\uecd9"), ProtectedSandApp.s("\uecda")});
        }
        if (i5 == 3) {
            return new zzul();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzuk(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
