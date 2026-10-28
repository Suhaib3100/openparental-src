package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzoi extends zzadk implements zzaes {
    private static final zzoi zzb;
    private int zze;
    private int zzf = 0;
    private Object zzg;

    static {
        zzoi zzoiVar = new zzoi();
        zzb = zzoiVar;
        zzadk.zzG(zzoi.class, zzoiVar);
    }

    private zzoi() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueafb"), new Object[]{ProtectedSandApp.s("\ueaf8"), ProtectedSandApp.s("\ueaf9"), ProtectedSandApp.s("\ueafa"), zzom.class, zzog.class, zzok.class});
        }
        if (i5 == 3) {
            return new zzoi();
        }
        zzoe zzoeVar = null;
        if (i5 == 4) {
            return new zzoh(zzoeVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
