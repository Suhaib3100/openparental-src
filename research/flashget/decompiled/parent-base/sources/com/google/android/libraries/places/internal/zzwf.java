package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzwf extends zzadk implements zzaes {
    private static final zzwf zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzwf zzwfVar = new zzwf();
        zzb = zzwfVar;
        zzadk.zzG(zzwf.class, zzwfVar);
    }

    private zzwf() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued49"), new Object[]{ProtectedSandApp.s("\ued48"), ProtectedSandApp.s("\ued46"), ProtectedSandApp.s("\ued47")});
        }
        if (i5 == 3) {
            return new zzwf();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzwe(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
