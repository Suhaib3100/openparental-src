package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzpq extends zzadk implements zzaes {
    private static final zzpq zzb;
    private int zze;
    private zzadq zzf = zzadk.zzA();
    private zzadq zzg = zzadk.zzA();
    private zzadq zzh = zzadk.zzA();
    private zzadq zzi = zzadk.zzA();
    private zzadq zzj = zzadk.zzA();
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;

    static {
        zzpq zzpqVar = new zzpq();
        zzb = zzpqVar;
        zzadk.zzG(zzpq.class, zzpqVar);
    }

    private zzpq() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb5d"), new Object[]{ProtectedSandApp.s("\ueb53"), ProtectedSandApp.s("\ueb54"), ProtectedSandApp.s("\ueb55"), ProtectedSandApp.s("\ueb56"), ProtectedSandApp.s("\ueb57"), ProtectedSandApp.s("\ueb58"), ProtectedSandApp.s("\ueb59"), ProtectedSandApp.s("\ueb5a"), zzpp.zza, ProtectedSandApp.s("\ueb5b"), zzpo.zza, ProtectedSandApp.s("\ueb5c"), zzpm.zza, ProtectedSandApp.s("\ueb52")});
        }
        if (i5 == 3) {
            return new zzpq();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzpn(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
