package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzve extends zzadk implements zzaes {
    private static final zzve zzb;
    private int zze;
    private int zzf;

    static {
        zzve zzveVar = new zzve();
        zzb = zzveVar;
        zzadk.zzG(zzve.class, zzveVar);
    }

    private zzve() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued22"), new Object[]{ProtectedSandApp.s("\ued21"), ProtectedSandApp.s("\ued20"), zzvd.zza});
        }
        if (i5 == 3) {
            return new zzve();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzvc(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
