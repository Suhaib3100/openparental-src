package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzvi extends zzadk implements zzaes {
    private static final zzvi zzb;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzvi zzviVar = new zzvi();
        zzb = zzviVar;
        zzadk.zzG(zzvi.class, zzviVar);
    }

    private zzvi() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued26"), new Object[]{ProtectedSandApp.s("\ued24"), ProtectedSandApp.s("\ued25"), zzvh.zza, ProtectedSandApp.s("\ued23")});
        }
        if (i5 == 3) {
            return new zzvi();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzvg(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
