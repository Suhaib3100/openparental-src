package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzra extends zzadk implements zzaes {
    private static final zzra zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private float zzi;
    private int zzj;

    static {
        zzra zzraVar = new zzra();
        zzb = zzraVar;
        zzadk.zzG(zzra.class, zzraVar);
    }

    private zzra() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uebf3"), new Object[]{ProtectedSandApp.s("\uebef"), ProtectedSandApp.s("\uebf0"), ProtectedSandApp.s("\uebf1"), ProtectedSandApp.s("\uebf2"), ProtectedSandApp.s("\uebed"), ProtectedSandApp.s("\uebee")});
        }
        if (i5 == 3) {
            return new zzra();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqz(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
