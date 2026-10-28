package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzrs extends zzadk implements zzaes {
    private static final zzrs zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzrs zzrsVar = new zzrs();
        zzb = zzrsVar;
        zzadk.zzG(zzrs.class, zzrsVar);
    }

    private zzrs() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec33"), new Object[]{ProtectedSandApp.s("\uec31"), ProtectedSandApp.s("\uec32"), ProtectedSandApp.s("\uec2f"), ProtectedSandApp.s("\uec30")});
        }
        if (i5 == 3) {
            return new zzrs();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzrr(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
