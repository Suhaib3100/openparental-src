package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaca extends zzadk implements zzaes {
    private static final zzaca zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzaca zzacaVar = new zzaca();
        zzb = zzacaVar;
        zzadk.zzG(zzaca.class, zzacaVar);
    }

    private zzaca() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue739"), new Object[]{ProtectedSandApp.s("\ue738"), ProtectedSandApp.s("\ue736"), ProtectedSandApp.s("\ue737")});
        }
        if (i5 == 3) {
            return new zzaca();
        }
        zzaby zzabyVar = null;
        if (i5 == 4) {
            return new zzabz(zzabyVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
