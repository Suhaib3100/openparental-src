package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzqu extends zzadk implements zzaes {
    private static final zzqu zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    static {
        zzqu zzquVar = new zzqu();
        zzb = zzquVar;
        zzadk.zzG(zzqu.class, zzquVar);
    }

    private zzqu() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uebe0"), new Object[]{ProtectedSandApp.s("\uebdb"), ProtectedSandApp.s("\uebdc"), ProtectedSandApp.s("\uebdd"), ProtectedSandApp.s("\uebde"), ProtectedSandApp.s("\uebdf"), ProtectedSandApp.s("\uebd9"), ProtectedSandApp.s("\uebda")});
        }
        if (i5 == 3) {
            return new zzqu();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqt(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
