package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zznk extends zzadk implements zzaes {
    private static final zznk zzb;
    private int zze;
    private int zzf;
    private zzln zzg;

    static {
        zznk zznkVar = new zznk();
        zzb = zznkVar;
        zzadk.zzG(zznk.class, zznkVar);
    }

    private zznk() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueac5"), new Object[]{ProtectedSandApp.s("\ueac4"), ProtectedSandApp.s("\ueac2"), ProtectedSandApp.s("\ueac3")});
        }
        if (i5 == 3) {
            return new zznk();
        }
        zznf zznfVar = null;
        if (i5 == 4) {
            return new zznj(zznfVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
