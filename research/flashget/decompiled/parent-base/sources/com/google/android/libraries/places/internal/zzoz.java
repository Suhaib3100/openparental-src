package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzoz extends zzadk implements zzaes {
    private static final zzoz zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzoz zzozVar = new zzoz();
        zzb = zzozVar;
        zzadk.zzG(zzoz.class, zzozVar);
    }

    private zzoz() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb30"), new Object[]{ProtectedSandApp.s("\ueb2e"), ProtectedSandApp.s("\ueb2f"), ProtectedSandApp.s("\ueb2c"), ProtectedSandApp.s("\ueb2d")});
        }
        if (i5 == 3) {
            return new zzoz();
        }
        zzos zzosVar = null;
        if (i5 == 4) {
            return new zzoy(zzosVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
