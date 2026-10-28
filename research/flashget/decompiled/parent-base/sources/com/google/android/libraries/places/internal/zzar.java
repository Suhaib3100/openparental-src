package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzar extends zzadk implements zzaes {
    private static final zzar zzb;
    private int zze;
    private zzae zzf;

    static {
        zzar zzarVar = new zzar();
        zzb = zzarVar;
        zzadk.zzG(zzar.class, zzarVar);
    }

    private zzar() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue82b"), new Object[]{ProtectedSandApp.s("\ue829"), ProtectedSandApp.s("\ue82a")});
        }
        if (i5 == 3) {
            return new zzar();
        }
        zzap zzapVar = null;
        if (i5 == 4) {
            return new zzaq(zzapVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
