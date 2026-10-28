package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzth extends zzadk implements zzaes {
    private static final zzth zzb;
    private int zze;
    private int zzf;
    private zzto zzg;
    private zztb zzh;

    static {
        zzth zzthVar = new zzth();
        zzb = zzthVar;
        zzadk.zzG(zzth.class, zzthVar);
    }

    private zzth() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueca6"), new Object[]{ProtectedSandApp.s("\ueca4"), ProtectedSandApp.s("\ueca5"), zztg.zza, ProtectedSandApp.s("\ueca2"), ProtectedSandApp.s("\ueca3")});
        }
        if (i5 == 3) {
            return new zzth();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zztf(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
