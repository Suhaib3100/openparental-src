package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaa extends zzadk implements zzaes {
    private static final zzaa zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzaa zzaaVar = new zzaa();
        zzb = zzaaVar;
        zzadk.zzG(zzaa.class, zzaaVar);
    }

    private zzaa() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6b2"), new Object[]{ProtectedSandApp.s("\ue6ae"), ProtectedSandApp.s("\ue6af"), ProtectedSandApp.s("\ue6b0"), ProtectedSandApp.s("\ue6b1"), ProtectedSandApp.s("\ue6ac"), ProtectedSandApp.s("\ue6ad")});
        }
        if (i5 == 3) {
            return new zzaa();
        }
        zzy zzyVar = null;
        if (i5 == 4) {
            return new zzz(zzyVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
