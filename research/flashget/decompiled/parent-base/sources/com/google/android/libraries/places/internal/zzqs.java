package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzqs extends zzadk implements zzaes {
    private static final zzqs zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private float zzi;
    private float zzj;

    static {
        zzqs zzqsVar = new zzqs();
        zzb = zzqsVar;
        zzadk.zzG(zzqs.class, zzqsVar);
    }

    private zzqs() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uebd8"), new Object[]{ProtectedSandApp.s("\uebd4"), ProtectedSandApp.s("\uebd5"), ProtectedSandApp.s("\uebd6"), ProtectedSandApp.s("\uebd7"), ProtectedSandApp.s("\uebd2"), ProtectedSandApp.s("\uebd3")});
        }
        if (i5 == 3) {
            return new zzqs();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqr(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
