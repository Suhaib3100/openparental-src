package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzg extends zzadk implements zzaes {
    private static final zzg zzb;
    private int zze;
    private zzaa zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private long zzl;
    private boolean zzm;
    private zzan zzn;

    static {
        zzg zzgVar = new zzg();
        zzb = zzgVar;
        zzadk.zzG(zzg.class, zzgVar);
    }

    private zzg() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue9ae"), new Object[]{ProtectedSandApp.s("\ue9a6"), ProtectedSandApp.s("\ue9a7"), ProtectedSandApp.s("\ue9a8"), ProtectedSandApp.s("\ue9a9"), ProtectedSandApp.s("\ue9aa"), zzao.zza, ProtectedSandApp.s("\ue9ab"), zzm.zza, ProtectedSandApp.s("\ue9ac"), ProtectedSandApp.s("\ue9ad"), ProtectedSandApp.s("\ue9a4"), ProtectedSandApp.s("\ue9a5")});
        }
        if (i5 == 3) {
            return new zzg();
        }
        zza zzaVar = null;
        if (i5 == 4) {
            return new zzf(zzaVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
